package Server.rest;

import java.util.List;

import Server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Server.entity.User;

/**
 * The type User rest controller.
 */
@RestController
@RequestMapping("/user")
public class UserRestController {

	@Autowired
	private UserService userService;

	@GetMapping("/get/all")
	public List<User> getUsers() {
		return userService.getUsers();
	}

    @GetMapping("/get/{userId}")
	public User getUser(@PathVariable int userId) {
		User theUser = userService.getUserID(userId);
		return theUser;
	}

	@PutMapping("/get/user")
	public User getUserSafe(@RequestBody User theUser) {
		User theUserReturn = userService.getUserSafe(theUser);
		return theUserReturn;
	}

    @PostMapping("/add")
	public User addUser(@RequestBody User theUser) {
		theUser.setId(0);
		userService.saveUser(theUser);
		return theUser;
	}

    @DeleteMapping("/delete/{userId}")
	public String deleteUser(@PathVariable int userId) {
		User tempCustomer = userService.getUserID(userId);
		userService.deleteUser(userId);
		return "Deleted user id - " + userId;
	}
}