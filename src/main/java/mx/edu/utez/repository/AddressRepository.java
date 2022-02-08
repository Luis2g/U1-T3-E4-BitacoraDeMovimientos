package mx.edu.utez.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import mx.edu.utez.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long>{

	@Transactional
	@Modifying
	@Query(value = "UPDATE logged_addresses SET username = ?1 ORDER BY id DESC LIMIT 1", nativeQuery = true)
	void AddressUpdateActionUser (String username);
		
}
