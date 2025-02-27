package com.github.xandorg.config;

import org.hibernate.SessionFactory;

public interface DatabaseConnection {
    SessionFactory getSessionFactory();
}
