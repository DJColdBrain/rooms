package rooms.config;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;


@Configuration
@PropertySource("application.properties")
public class DataConfig {

    @Autowired
    private Environment env;

//    @Bean
//    public LocalSessionFactoryBean sessionFactory(){
//        Resource config = new ClassPathResource("hibernate.cfg.xml");
//        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
//        sessionFactory.setConfigLocation(config);
//        sessionFactory.setPackagesToScan(env.getProperty("rooms.entity.package"));
//        sessionFactory.setDataSource(dataSource());
//        return sessionFactory;
//    }
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource ds =  new DriverManagerDataSource();

        //Driver class name
        ds.setDriverClassName(env.getProperty("spring.datasource.driver-class-name"));
        // URL
        ds.setUrl(env.getProperty("spring.datasource.url"));
        //username
        ds.setUsername(env.getProperty("spring.datasource.username"));
        //password
        ds.setPassword(env.getProperty("spring.datasource.password"));

        return ds;
    }

    @Bean
    public JdbcTemplate jdbcTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource());
        return jdbcTemplate;
    }

}
