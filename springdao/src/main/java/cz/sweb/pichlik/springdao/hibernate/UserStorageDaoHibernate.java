package cz.sweb.pichlik.springdao.hibernate;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cz.sweb.pichlik.springdao.User;
import cz.sweb.pichlik.springdao.UserStorageDao;

public class UserStorageDaoHibernate extends HibernateDaoSupport implements UserStorageDao {

    public User get(long userId) {
        return null;
    }

    public List<User> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    public void save(User user) {
        // TODO Auto-generated method stub

    }

    public void update(User user) {
        // TODO Auto-generated method stub
    }

    public void delete(User user) {
        // TODO Auto-generated method stub
    }
}