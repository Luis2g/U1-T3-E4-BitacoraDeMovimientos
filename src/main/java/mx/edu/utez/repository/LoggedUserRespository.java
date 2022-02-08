package mx.edu.utez.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.edu.utez.entity.LoggedUser;

@Repository
public interface LoggedUserRespository extends JpaRepository<LoggedUser, Long>{

}
