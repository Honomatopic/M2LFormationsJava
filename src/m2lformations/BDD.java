/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2lformations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Honoré
 */
class BDD {

    Connection connexion;
    PreparedStatement reqPreparee;
    ResultSet resultat;

    public Connection gestionnaireDeConnexion() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connexion = DriverManager.getConnection("jdbc:mysql://localhost/m2lformations?autoReconnect=true&useSSL=false", "root", "root");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BDD.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print("Base de données introuvable");
        }
        return connexion;
    }

    public static DefaultTableModel construireTable(ResultSet rs) throws SQLException {

        ResultSetMetaData resMeta = rs.getMetaData();

        int columnCount = resMeta.getColumnCount();

        Vector<String> columnNames = new Vector<String>();

        for (int column = 1; column <= columnCount; column++) {
            columnNames.add(resMeta.getColumnName(column));
        }

        Vector<Vector<Object>> data = new Vector<Vector<Object>>();

        while (rs.next()) {

            Vector<Object> vector = new Vector<Object>();

            for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {

                vector.add(rs.getObject(columnIndex));

            }

            data.add(vector);
        }

        return new DefaultTableModel(data, columnNames);
    }
}
