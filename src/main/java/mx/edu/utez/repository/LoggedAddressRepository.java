package mx.edu.utez.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.edu.utez.entity.LoggedAddress;

@Repository
public interface LoggedAddressRepository extends JpaRepository<LoggedAddress, Long>{

}
