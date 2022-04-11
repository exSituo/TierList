package dao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

class CxoPool
{
    public static Connection getConnection() throws NamingException, SQLException
    {
        // Récupération connection référencées dans le JNDI - cf context.xml
        Context ctx = new InitialContext();
        // Connexion avec Oracle
        DataSource source = (DataSource) ctx.lookup("java:/comp/env/PGDS");
        return source.getConnection();
    }
}