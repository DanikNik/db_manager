package com.company;

import java.sql.*;

public class Main {

    public static void main(String[] args) throws SQLException{

        Database db = new Database();
        db.execute("insert into table1 (name) values ('saxon'), ('roman'), ('nordic')");
        db.commit();
        db.show("table1");
        db.clearTable("table1");
        db.commit();
        db.close();
//        Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "user", "password");
//        con.setAutoCommit(false);
//        Statement stm = con.createStatement();
////        stm.executeUpdate("create table tb1 (id integer primary key auto_increment, name varchar(255), data blob DEFAULT null)");
////        stm.execute("insert into tb1 (name) values ('123'), ('abc'), ('xyz')");
//        ResultSet res = stm.executeQuery("select * from tb1");
//        while (res.next()){
//            System.out.println(res.getInt(1) + "^" + res.getString(2));
//        }
//        con.commit();
//
//
//        PreparedStatement pst = con.prepareStatement("insert into tb1 (name) values (?), (?), (?)");
//        pst.setString(1, "111");
//        pst.setString(2, "222");
//        pst.setString(3, "333");
//        pst.execute();
//        con.commit();






    }
}
