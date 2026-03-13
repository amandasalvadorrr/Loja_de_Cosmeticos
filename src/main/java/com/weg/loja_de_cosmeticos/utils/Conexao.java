package com.weg.loja_de_cosmeticos.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public static final String URL = "jdbc:mysql://localhost:3306/loja_cosmeticos?useSSL=false&serverTimezone=UTC";
    public static final String USER = "root";
    public static final String SENHA = "";

    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection (URL, USER, SENHA);
    }
}
