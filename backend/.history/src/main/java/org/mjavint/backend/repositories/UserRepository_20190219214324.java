package org.mjavint.backend.repositories;

import org.mjavint.backend.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * UserRepository
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findByEmailIgnoreCase(String username);

}