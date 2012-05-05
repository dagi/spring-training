/*
 * Copyright (C) 2007-2010, GoodData(R) Corporation. All rights reserved.
 */

package cz.sweb.pichlik.springmvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cz.sweb.pichlik.springdao.User;
import cz.sweb.pichlik.springdao.UserStorageDao;

@Controller
public class AllUsers {

    @Autowired
    private UserStorageDao userStorageDao;

    @RequestMapping(value="/allusers.htm", method={RequestMethod.GET})
    public List<User> getAllUsersJson(){
        return userStorageDao.getAll();
    }
}
