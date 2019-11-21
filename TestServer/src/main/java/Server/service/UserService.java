package Server.service;

import java.util.List;

import Server.entity.User;

/**
 * The interface User service.
 */
public interface UserService {

    /**
     * Gets users.
     *
     * @return the users
     */
    public List<User> getUsers();

    /**
     * Save user user.
     *
     * @param theUser the the user
     * @return the user
     */
    public User saveUser(User theUser);

    /**
     * Gets user.
     *
     * @param theId the the id
     * @return the user
     */
    public User getUserID(int theId);

    /**
     * Delete user int.
     *
     * @param theId the the id
     * @return the int
     */
    public int deleteUser(int theId);

    /**
     * Gets user safe.
     *
     * @param theUser the the user
     * @return the user safe
     */
    public User getUserSafe(User theUser);
}
