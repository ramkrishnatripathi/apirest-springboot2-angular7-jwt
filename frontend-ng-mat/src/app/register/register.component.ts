import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { AuthService } from '../shared/services';
import { MatSnackBar } from '@angular/material';
import { LoginInfo, User } from '../shared/models';
import { first } from 'rxjs/operators';

export interface Role {
  value: string;
  viewValue: string;
}

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.scss']
})
export class RegisterComponent implements OnInit {
  roles: Role[] = [{ value: 'USER', viewValue: 'usuario' }, { value: 'ADMIN', viewValue: 'administrador' }];

  constructor(private formBuilder: FormBuilder, private authService: AuthService, private router: Router, private snackBar: MatSnackBar) {}

  get form() {
    return this.registerForm.controls;
  }
  registerForm: FormGroup;
  submitted = false;
  user: User;
  token: string;

  ngOnInit() {
    this.registerForm = this.formBuilder.group({
      firstName: ['', Validators.required],
      lastName: [''],
      email: ['', [Validators.required, Validators.email]],
      password: ['', [Validators.required]],
      phone: [''],
      role: ['', Validators.required]
    });
  }

  onRegister(user: User) {
    this.submitted = true;
    // stop here if form is invalid
    if (this.registerForm.invalid) {
      this.snackBar.open('Error to send data form register', 'CANCEL', {
        duration: 2000
      });
      return;
    }
    user.enabled = true;
    this.authService.signUp(user).subscribe(token => (this.token = token));
    this.snackBar.open('Register Success', 'CANCEL', { duration: 2000 });
    this.onClear();
    this.router.navigate(['/dashboard']);
  }
  public hasError = (controlName: string, errorName: string) => {
    return this.registerForm.controls[controlName].hasError(errorName);
  }

  onCancel() {
    this.router.navigate(['/user']);
  }

  onClear() {
    this.registerForm.reset();
  }
}
