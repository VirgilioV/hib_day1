/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formacao.hib;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.derby.iapi.sql.PreparedStatement;

/**
 *
 * @author Formação
 */
public class SQLinsert {

    private static final Logger LOG = Logger.getLogger(SQLinsert.class.getName());

    static final String JDBC_DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
    static final String DB_URL = "jdbc:derby://localhost:1527/Formandos";
    static final String USER = "app";
    static final String PASS = "APP";

    public static void main(String[] args) {
        LOG.setLevel(Level.ALL);
        try {
            LOG.log(Level.INFO, "Registo do driver");
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException ex) {
            LOG.log(Level.SEVERE, ex.toString());
        }
        Connection c = null;
        PreparedStatement p = null;
        try {
            LOG.info("Ativar conexao");
            c = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException ex) {
            LOG.log(Level.SEVERE, ex.toString());
        }
        
    }
}
