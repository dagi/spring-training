/*
 * Copyright (C) 2007-2010, GoodData(R) Corporation. All rights reserved.
 */

package cz.sweb.pichlik.springioc.javaconfig;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Logger;

import javax.sql.DataSource;

public class DataSourceDelegate implements DataSource{

    private final DataSource dataSourceDelegate = null;

    public PrintWriter getLogWriter() throws SQLException {
        return dataSourceDelegate.getLogWriter();
    }

    public <T> T unwrap(Class<T> iface) throws SQLException {
        return dataSourceDelegate.unwrap(iface);
    }

    public void setLogWriter(PrintWriter out) throws SQLException {
        dataSourceDelegate.setLogWriter(out);
    }

    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return dataSourceDelegate.isWrapperFor(iface);
    }

    public void setLoginTimeout(int seconds) throws SQLException {
        dataSourceDelegate.setLoginTimeout(seconds);
    }

    public Connection getConnection() throws SQLException {
        return dataSourceDelegate.getConnection();
    }

    public Connection getConnection(String username, String password)
            throws SQLException {
        return dataSourceDelegate.getConnection(username, password);
    }

    public int getLoginTimeout() throws SQLException {
        return dataSourceDelegate.getLoginTimeout();
    }

    public Logger getParentLogger(){
        return null;
    }


}
