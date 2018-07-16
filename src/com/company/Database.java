package com.company;

import javax.swing.plaf.nimbus.State;
import java.sql.*;

public class Database {
    private String databaseURL = "jdbc:mysql://127.0.0.1:3306/test";
    private Connection con;

    public Database() throws SQLException{
        con = DriverManager.getConnection(databaseURL, "root", "sway9009");
        con.setAutoCommit(false);
    }

    public void execute(String _query) throws SQLException{
        Statement stm = con.createStatement();
        stm.execute(_query);
        stm.close();
    }

    public void show(String _tabName) throws SQLException{
        Statement stm = con.createStatement();
        ResultSet res = stm.executeQuery("SELECT * FROM " + _tabName);
        ResultSetMetaData resMeta = res.getMetaData();
        while (res.next()){
//            System.out.println(res.getObject(1) + ": " + res.getObject(2));
            for (int i = 1; i < resMeta.getColumnCount() + 1; i++) {
                System.out.print(res.getObject(i));
                System.out.print(' ');
            }
            System.out.println();
        }
        stm.close();
    }

    public void commit() throws SQLException{
        con.commit();
    }

    public void close() throws SQLException{
        con.close();
    }

    public void clearTable(String _tabName) throws SQLException{
        Statement stm = con.createStatement();
        stm.execute("TRUNCATE " + _tabName);
        stm.close();
    }
}
