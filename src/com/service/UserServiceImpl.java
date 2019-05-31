package com.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bean.PageBean;
import com.bean.UserBean;
import com.util.DButil;

public class UserServiceImpl  {
	 
	  /**
	   * sql查询语句
	   */
	  public PageBean<UserBean> findByItem(int offset, int limit, String seqNo, String name) {
	    PageBean<UserBean> cutBean = new PageBean<UserBean>();
	 
	    // 基本SQL语句
	    String sql = "SELECT * FROM c_userinfo where 1=1 ";
	 
	    // 动态条件的SQL语句
	    String itemSql = "";
	 
	    if (seqNo != null && seqNo.length() != 0) {
	      itemSql += "and SeqNo like '%" + seqNo + "%' ";
	    }
	 
	    if (name != null && name.length() != 0) {
	      itemSql += "and Name like '%" + name + "%' ";
	    }
	 
	    // 获取sql连接
	    Connection con = DButil.connect();
	    PreparedStatement ps = null;
	    ResultSet rs = null;
	    try {
	 
	      ps = con.prepareStatement(sql + itemSql + "limit ?,?");
	      ps.setInt(1, offset);
	      ps.setInt(2, limit);
	      rs = ps.executeQuery();
	      while (rs.next()) {
	        UserBean bean = new UserBean();
	        bean.setSeqNo(rs.getString("seqNo"));
	        bean.setName(rs.getString("name"));
	        bean.setSex(rs.getString("sex"));
	        bean.setBirth(rs.getString("birth"));
	        cutBean.getRows().add(bean);
	      }
	      // 得到总记录数，注意，也需要添加动态条件
	      ps = con.prepareStatement("SELECT count(*) as c FROM c_userinfo where 1=1 " + itemSql);
	      rs = ps.executeQuery();
	      if (rs.next()) {
	        cutBean.setTotal(rs.getInt("c"));
	      }
	    } catch (SQLException e) {
	      e.printStackTrace();
	    } finally {
	      DButil.close(con);
	      if (ps != null) {
	        try {
	          ps.close();
	        } catch (SQLException e) {
	          e.printStackTrace();
	        }
	      }
	      if (rs != null) {
	        try {
	          rs.close();
	        } catch (SQLException e) {
	          e.printStackTrace();
	        }
	      }
	    }
	    return cutBean;
	  }
	}