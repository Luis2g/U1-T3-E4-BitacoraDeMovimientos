package mx.edu.utez.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.edu.utez.entity.LoggedHouse;

@Repository
public interface LoggedActionRepository extends JpaRepository<LoggedHouse, Long>{

}
