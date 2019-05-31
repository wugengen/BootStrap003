package com.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

//import com.mysql.jdbc.Connection;

public class DButil {
	  /**
	   * 连接数据库
	   * 
	   */
	  public static Connection connect() {
	    Properties pro = new Properties();
	    String driver = null;
	    String url = null;
	    String username = null;
	    String password = null;
	    try {
	      InputStream is = DButil.class.getClassLoader()
	          .getResourceAsStream("DB.properties");
	      pro.load(is);
	      driver = pro.getProperty("driver");
	      url = pro.getProperty("url");
	      username = pro.getProperty("username");
	      password = pro.getProperty("password");
	      Class.forName(driver);
	      Connection conn = (Connection) DriverManager.getConnection(url, username,
	          password);
	      return conn;
	    } catch (FileNotFoundException e) {
	      e.printStackTrace();
	    } catch (IOException e) {
	      e.printStackTrace();
	    } catch (ClassNotFoundException e) {
	      e.printStackTrace();
	    } catch (SQLException e) {
	      e.printStackTrace();
	    }
	    return null;
	  }
	 
	  /**
	   * 关闭数据库
	   * 
	   * @param conn
	   *     
	   */
	  public static void close(Connection con) {
	    if (con != null) {
	      try {
	        con.close();
	      } catch (SQLException e) {
	        e.printStackTrace();
	      }
	    }
	  }
	  public static void main(String[] args) {
		System.out.println( "*************"+connect());
	}
	 }
	 
