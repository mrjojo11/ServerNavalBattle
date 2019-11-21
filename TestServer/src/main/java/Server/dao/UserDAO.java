package Server.dao;

import java.util.List;
import Server.entity.User;

/**
 * The interface User dao.
 */
public interface UserDAO {

    /**
     * Gets users.
     *
     * @return the users
     */
     List<User> getUsers();

    /**
     * Save user.
     *
     * @param theUser the the user
     */
     User saveUser(User theUser);

    /**
     * Gets user.
     *
     * @param theId the id
     * @return the user
     */
     User getUserID(int theId);

    /**
     * Delete user.
     *
     * @param theId the id
     */
     int deleteUser(int theId);


    /**
     * Gets user safe.
     *
     * @param theUser the User with the right username + password combination
     * @return the user
     */
     User getUserSafe(User theUser);
}
