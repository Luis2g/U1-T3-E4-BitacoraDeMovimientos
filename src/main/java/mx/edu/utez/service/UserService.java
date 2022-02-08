package mx.edu.utez.service;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.edu.utez.entity.User;
import mx.edu.utez.repository.UserRepository;
import com.google.common.hash.Hashing;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> getAll(){
		return userRepository.findAll();
	}
	
	public User getOne(long id) {
		return userRepository.findById(id).get();
	}
	
	public User saveOrUpdate(User user) {
		
		String encriptedPassword = Hashing.sha256()
				.hashString(user.getPassword(), StandardCharsets.UTF_8)
				.toString();
		user.setPassword(encriptedPassword);

		return userRepository.save(user);
	}
	
	public void remove(long id) {
		userRepository.deleteById(id);
	}
	
	public User login(User user) {
		return userRepository.login(user.getUsername(), user.getPassword());
	}
}
