package org.mjavint.backend.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.mjavint.backend.models.User;
import org.mjavint.backend.security.authentication.JwtUser;
import org.mjavint.backend.security.exceptions.UnauthorizedException;
import org.mjavint.backend.security.models.Response;
import org.mjavint.backend.security.models.UserDTO;
import org.mjavint.backend.security.utils.JwtUtil;
import org.mjavint.backend.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * AuthenticationController
 */
@RestController
public class AuthenticationController {

    @Value("${jwt.header}")
    private String tokenHeader;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private UserService userService;

    @PostMapping(value = "/login")
    public ResponseEntity<UserDTO> login(@RequestBody User user, HttpServletRequest request,
            HttpServletResponse reponse) {
        try {
            Authentication authentication = authenticationManager
                    .authenticate(new UsernamePasswordAuthenticationToken(user.getEmail(), user.getPassword()));
            final JwtUser userDetails = (JwtUser) authentication.getPrincipal();
            SecurityContextHolder.getContext().setAuthentication(authentication);
            final String token = jwtUtil.generateToken(userDetails);
            reponse.setHeader("Token", token);
            return new ResponseEntity<UserDTO>(new UserDTO(userDetails.getUser(), token), HttpStatus.OK);
        } catch (Exception e) {
            throw new UnauthorizedException(e.getMessage());
        }
    }

    @PostMapping(value = "/registration")
    public ResponseEntity<Response> registration(@RequestBody User user) {
        User dbUser = userService.save(user);
        if (dbUser != null) {
            return new ResponseEntity<Response>(new Response("User is saved successfully"), HttpStatus.OK);
        }
        return null;
    }

}