package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.PageBean;
import com.bean.UserBean;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.service.UserServiceImpl;

/**
 * Servlet implementation class UserFindByItemSetvlet
 */
@WebServlet("/UserFindByItemSetvlet")
public class UserFindByItemSetvlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
     

	private UserServiceImpl service = new UserServiceImpl();
	 
	  public UserFindByItemSetvlet() {
	    super();
	  }
	 
	  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    this.doPost(request, response);
	  }
	 
	  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    request.setCharacterEncoding("utf-8");
	    response.setContentType("text/json; charset=UTF-8");
	 
	    // 得到表单数据
	    int offset = Integer.parseInt(request.getParameter("offset").trim());
	    int limit = Integer.parseInt(request.getParameter("limit").trim());
	    String seqNo = request.getParameter("seqNo").trim();
	    String name = request.getParameter("name").trim();
	 
	    // 调用业务组件，得到结果
	    PageBean<UserBean> pageBean;
	    try {
	      pageBean = service.findByItem(offset, limit, seqNo, name);
	      ObjectMapper oMapper = new ObjectMapper();
	      //对象转换为json数据 ,且返回
	      oMapper.writeValue(response.getWriter(), pageBean);
	    } catch (Exception e) {     
	      e.printStackTrace();
	    }
	 
	  }
	 
	}