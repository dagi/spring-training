/*
 * Copyright (C) 2007-2010, GoodData(R) Corporation. All rights reserved.
 */

package cz.sweb.pichlik.springioc.javaconfig;

public class MyService {

    private final DaoInterface daoInterface;

    public MyService(DaoInterface daoInterface) {
        super();
        this.daoInterface = daoInterface;
    }

    public DaoInterface getDaoInterface() {
        return daoInterface;
    }
}
