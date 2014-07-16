package cz.sweb.pichlik.springdao.hibernate;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cz.sweb.pichlik.springdao.User;
import cz.sweb.pichlik.springdao.UserStorageDao;

public class UserStorageDaoHibernate extends HibernateDaoSupport implements UserStorageDao {

    public User get(long userId) {
        return getHibernateTemplate().get(User.class, userId);
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

    public void delete(User user) {
       getHibernateTemplate().delete(user);
    }
}