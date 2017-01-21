package com.devopsbuddy.backend.persistence.repositories;

import com.devopsbuddy.backend.persistence.domain.backend.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by rjeshg on 1/20/17.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
