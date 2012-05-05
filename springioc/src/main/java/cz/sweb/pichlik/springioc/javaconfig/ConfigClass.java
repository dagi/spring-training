package cz.sweb.pichlik.springioc.javaconfig;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Alternative bean configuration to XML and Annotations.
 */
@Configuration
public class ConfigClass {

    @Autowired
    private DataSource dataSource;

    @Bean()
    public MyService configureMyservice(){
        return new MyService(configureJdbcDao());
    }

    @Bean()
    public JdbcDao configureJdbcDao() {
        return new JdbcDao(dataSource);
    }

    @Bean()
    public HibernateDao configureHiberDao() {
        return new HibernateDao(dataSource);
    }
}