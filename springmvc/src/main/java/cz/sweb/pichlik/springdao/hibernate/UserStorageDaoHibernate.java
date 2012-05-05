package cz.sweb.pichlik.springdao.hibernate;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cz.sweb.pichlik.springdao.User;
import cz.sweb.pichlik.springdao.UserStorageDao;

@Transactional(readOnly=false, propagation = Propagation.REQUIRED)
public class UserStorageDaoHibernate extends HibernateDaoSupport implements UserStorageDao {

	public void delete(User user) {
		getHibernateTemplate().delete(user);
	}

	@Transactional(readOnly= true)
	public User get(long userId) {
		return (User) getHibernateTemplate().get(User.class, userId);
	}

	public List<User> getAll() {		
		return getHibernateTemplate().loadAll(User.class);
	}

	public void save(User user) {
		getHibernateTemplate().save(user);

	}

	public void update(User user) {
		getHibernateTemplate().update(user);
	}

}