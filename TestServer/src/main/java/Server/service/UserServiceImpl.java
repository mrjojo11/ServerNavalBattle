package Server.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import Server.dao.UserDAO;
import Server.entity.User;

/**
 * The type User service.
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;
	
	@Override
	@Transactional
	public List<User> getUsers() {
		return userDAO.getUsers();
	}

	@Override
	@Transactional
	public User saveUser(User theUser) {
		userDAO.saveUser(theUser);
		return theUser;
	}

	@Override
	@Transactional
	public User getUserID(int theId) {
		return userDAO.getUserID(theId);
	}

	@Override
	@Transactional
	public int deleteUser(int theId) {
		userDAO.deleteUser(theId);
		return theId;
	}

	@Override
	@Transactional
	public User getUserSafe(User theUser) {
		return userDAO.getUserSafe(theUser);
	}
}





