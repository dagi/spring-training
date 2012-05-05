package cz.sweb.pichlik.springdao.jdbc;

import java.util.List;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import cz.sweb.pichlik.springdao.User;
import cz.sweb.pichlik.springdao.UserStorageDao;

public class UserStorageDaoJdbc extends JdbcDaoSupport implements UserStorageDao {

    public void delete(User user) {
        // TODO Auto-generated method stub
    }

    public User get(long userId) {
        // TODO Auto-generated method stub
        return null;
    }

    public List<User> getAll() {
        return null;
    }

    public void save(User user) {
        // TODO Auto-generated method stub
    }

    public void update(User user) {
        // TODO Auto-generated method stub
    }
}
