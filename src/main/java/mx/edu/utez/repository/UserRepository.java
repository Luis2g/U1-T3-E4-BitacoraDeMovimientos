package mx.edu.utez.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import mx.edu.utez.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	@Procedure (name = "login")
	User login(@Param("usernameIn") String usernameIn, @Param("passwordIn") String passwordIn);
	
}
