package com.rodrigoramos.store.repositories;

import com.rodrigoramos.store.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
