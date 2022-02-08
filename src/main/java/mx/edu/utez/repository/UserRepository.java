package mx.edu.utez.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.edu.utez.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
