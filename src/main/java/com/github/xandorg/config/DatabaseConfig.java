package com.github.xandorg.config;

import io.github.cdimascio.dotenv.Dotenv;

public class DatabaseConfig {
    private static final Dotenv dotenv = Dotenv.load();

    public static String getH2DbUrl() {
        return dotenv.get("H2_DB_URL");
    }

    public static String getH2DbName() {
        return dotenv.get("H2_DB_NAME");
    }

    public static String getH2DbUser() {
        return dotenv.get("H2_DB_USER");
    }

    public static String getH2DbPassword() {
        return dotenv.get("H2_DB_PASSWORD");
    }

    public static String getH2Dialect() {
        return dotenv.get("H2_DB_DIALECT");
    }
}
