package Server.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Server.entity.User;

/**
 * The type User dao.
 */
@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;
			
	@Override
	public List<User> getUsers() {
		Session currentSession
				= sessionFactory.getCurrentSession();
		Query<User> theQuery =
				currentSession.createQuery(
						"from User order by id",
						User.class);
		List<User> users = theQuery.getResultList();
		return users;
	}

	@Override
	public User saveUser(final User theUser) {
		Session currentSession
				= sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(theUser);
		return theUser;
	}

	@Override
	public User getUserID(final int theId) {
		Session currentSession = sessionFactory.getCurrentSession();
		User theUser = currentSession.get(User.class, theId);
		return theUser;
	}

	@Override
	public int deleteUser(final int theId) {
		Session currentSession
				= sessionFactory.getCurrentSession();
		Query theQuery = 
				currentSession.createQuery(
						"delete from User where id=:userId");
		theQuery.setParameter("userId", theId);
		theQuery.executeUpdate();
		return theId;
	}

	@Override
	public User getUserSafe(final User theUser) {
		String password = theUser.getPassword();
		String user_name = theUser.getUser_name();
		Session currentSession = sessionFactory.getCurrentSession();
		Query query = currentSession.createSQLQuery(
				"select * from user where "
						+ "user_name=:user_name and password=:password")
				.addEntity(User.class).
						setParameter("user_name", user_name)
				.setParameter("password", password);
		List<User> users = query.getResultList();
		User theUserReturn = users.get(0);
		return theUserReturn;
	}

}
