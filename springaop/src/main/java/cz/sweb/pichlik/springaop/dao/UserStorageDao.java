package cz.sweb.pichlik.springaop.dao;

import java.util.List;

public interface UserStorageDao {
	/**
	 * Loads the user by the id.
	 * @param userId the user id
	 * @return user if exists
	 */
	public User get(long userId);
	
	/**
	 * Persists the user to the database.
	 * @param user the user
	 */
	public void save(User user);
	
	/**
	 * Update the user in the database.
	 * @param user the user
	 */
	public void update(User user);
	
	/**
	 * Delete the user in the database.
	 * @param user the user
	 */
	public void delete(User user);
	
	/**
	 * Loads all users from the database.
	 * @return all users
	 */
	public List<User> getAll();	
	
}
