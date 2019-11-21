package Server.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * The type User.
 */
@Entity
@Table(name = "user")
public class User implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "user_name")
	private String user_name;
	@Column(name = "password")
	private String password;


	/**
	 * Instantiates a new User.
	 */
	public User() {
	}

	/**
	 * Gets id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets id.
	 *
	 * @param id the id
	 */
	public void setId(final int id) {
		this.id = id;
	}

	/**
	 * Gets user name.
	 *
	 * @return the user name
	 */
	public String getUser_name() {
		return user_name;
	}

	/**
	 * Sets user name.
	 *
	 * @param user_name the user name
	 */
	public void setUser_name(final String user_name) {
		this.user_name = user_name;
	}

	/**
	 * Gets password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets password.
	 *
	 * @param password the password
	 */
	public void setPassword(final String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", user_name="
				+ user_name + ", password="
				+ password + "]";
	}
}





