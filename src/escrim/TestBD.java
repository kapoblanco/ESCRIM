package escrim;

import java.sql.*;

public class TestBD
{
public static void main(String[] args)
{
    try
    {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
    }
    catch(Exception e)
    {
    e.printStackTrace();
    }

try
{
Connection conn = DriverManager.getConnection("jdbc:mysql:///?user=root");

Statement stat = conn.createStatement();

stat.executeUpdate("create database if not exists MaBD");

stat.executeUpdate("use MaBD");

stat.executeUpdate("create table if not exists ouvrage(id integer primary key, titre char(100) not null, nb_exemplaire integer not null)");
stat.executeUpdate("create table if not exists abonne(id integer primary key, nom char(50), prenom char(50), nb_emprunts integer)");
stat.executeUpdate("create table if not exists emprunt(ouvrage_id integer not null references ouvrage(id), abonne_id integer not null references abonne(id), date_emprunt Date not null, primary key(ouvrage_id,abonne_id))");

stat.executeUpdate("INSERT INTO `ouvrage`(`id`, `titre`, `nb_exemplaire`) VALUES (1632 ,'FloPetithomme pour les nuls',2)");
}
catch(SQLException e){
    System.out.println("sql exception");
    while (e!=null){
      System.out.println(e.getErrorCode());
      System.out.println(e.getMessage());
      System.out.println(e.getSQLState());
      e.printStackTrace();
      e=e.getNextException();}
    }
catch(Exception e)
	{
	e.printStackTrace();
	}
}

}