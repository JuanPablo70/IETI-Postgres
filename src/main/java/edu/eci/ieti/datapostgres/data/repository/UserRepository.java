package edu.eci.ieti.datapostgres.data.repository;

import edu.eci.ieti.datapostgres.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
