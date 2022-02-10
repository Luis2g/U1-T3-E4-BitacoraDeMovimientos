package mx.edu.utez.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import mx.edu.utez.entity.ControlAccess;

//import mx.edu.utez.entity.User;

@Repository
public interface ControlAccessRepository extends JpaRepository<ControlAccess, Long> {

	
}
