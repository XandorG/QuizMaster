package com.github.xandorg.config;

import com.github.xandorg.entity.Question;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class H2Connection implements DatabaseConnection {
    private static SessionFactory sessionFactory;

    @Override
    public SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration();
                String url = "jdbc:h2:file:" + DatabaseConfig.getH2DbUrl();
                configuration.setProperty("hibernate.connection.url", url);
                configuration.setProperty("hibernate.connection.username", DatabaseConfig.getH2DbUser());
                configuration.setProperty("hibernate.connection.password", DatabaseConfig.getH2DbPassword());
                configuration.setProperty("hibernate.dialect", DatabaseConfig.getH2Dialect());
                configuration.setProperty("hibernate.hbm2ddl.auto", "create");
                configuration.setProperty("hibernate.show_sql", "false");

                configuration.addAnnotatedClass(Question.class);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return sessionFactory;
    }
}
