/*
 * Copyright (C) 2007-2014, GoodData(R) Corporation. All rights reserved.
 */

package cz.sweb.pichlik.springdao.tx;

import java.util.List;

import cz.sweb.pichlik.springdao.User;
import cz.sweb.pichlik.springdao.UserStorageDao;

public class UserStorageService {
    private UserStorageDao userStorageDao;

    public void saveUsers(List<User> users) {
       throw new UnsupportedOperationException("Naimplementujte metodu saveUsers automicky. Budto se podari ulozit vsechny uzivatele a nebo ani jednoho z nich.");
    }

    public void setUserStorageDao(UserStorageDao userStorageDao) {
        this.userStorageDao = userStorageDao;
    }
}
