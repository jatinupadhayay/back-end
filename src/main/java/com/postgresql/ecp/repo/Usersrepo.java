package com.postgresql.ecp.repo;

import com.postgresql.ecp.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface Usersrepo extends JpaRepository<Users,Long> {
    Optional<Users> findByEmail(String email);

}
