package cz.sweb.pichlik.springaop.dao;

import java.util.List;

public class UserStorageDaoMock implements UserStorageDao {

    private List<User> users;

    public void delete(User user) {
        users.remove(user);
    }

    public User get(long userId) {
        for(User user: users) {
            if(user.getId() == userId) {
                return user;
            }
        }
        return null;
    }

    public List<User> getAll() {
        return users;
    }

    public void save(User user) {
        users.remove(user);
        users.add(user);
    }

    public void update(User user) {
        users.remove(user);
        users.add(user);
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<User> getUsers() {
        return users;
    }
}
