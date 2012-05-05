/*
 * Copyright (C) 2007-2010, GoodData(R) Corporation. All rights reserved.
 */

package cz.sweb.pichlik.springioc.javaconfig;

import javax.sql.DataSource;

public class JdbcDao implements DaoInterface{
    private DataSource dataSource;

    public JdbcDao(DataSource dataSource) {
        super();
        this.dataSource = dataSource;
    }

    public DataSource getDataSource() {
        return dataSource;
    }
}
