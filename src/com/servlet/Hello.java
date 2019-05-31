package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello
 */
@WebServlet("/Hello")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
  

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8"); // 这里不设置编码会有乱码
		response.setContentType("text/html;charset=utf-8");
	
		 String json="{\r\n" + 
		 		"	\"data\": [{\r\n" + 
		 		"		 \r\n" + 
		 		"		\"name\": \"哈哈哈0号\",\r\n" + 
		 		"		\"age\": \"age：0岁\",\r\n" + 
		 		"		\"sex\": \"男0\"\r\n" + 
		 		"	}, {\r\n" + 
		 		"		\r\n" + 
		 		"		\"name\": \"哈哈哈1号\",\r\n" + 
		 		"		\"age\": \"age：1岁\",\r\n" + 
		 		"		\"sex\": \"男1\"\r\n" + 
		 		"	}, {\r\n" + 
		 		"		\r\n" + 
		 		"		\"name\": \"哈哈哈2号\",\r\n" + 
		 		"		\"age\": \"age：2岁\",\r\n" + 
		 		"		\"sex\": \"男2\"\r\n" + 
		 		"	}, {\r\n" + 
		 		"		\r\n" + 
		 		"		\"name\": \"哈哈哈3号\",\r\n" + 
		 		"		\"age\": \"age：3岁\",\r\n" + 
		 		"		\"sex\": \"男3\"\r\n" + 
		 		"	}, {\r\n" + 
		 		"		\r\n" + 
		 		"		\"name\": \"哈哈哈4号\",\r\n" + 
		 		"		\"age\": \"age：4岁\",\r\n" + 
		 		"		\"sex\": \"男4\"\r\n" + 
		 		"	}, {\r\n" + 
		 		"		\r\n" + 
		 		"		\"name\": \"哈哈哈5号\",\r\n" + 
		 		"		\"age\": \"age：5岁\",\r\n" + 
		 		"		\"sex\": \"男5\"\r\n" + 
		 		"	}, {\r\n" + 
		 		"		\r\n" + 
		 		"		\"name\": \"哈哈哈6号\",\r\n" + 
		 		"		\"age\": \"age：6岁\",\r\n" + 
		 		"		\"sex\": \"男6\"\r\n" + 
		 		"	}, {\r\n" + 
		 		"		\r\n" + 
		 		"		\"name\": \"哈哈哈7号\",\r\n" + 
		 		"		\"age\": \"age：7岁\",\r\n" + 
		 		"		\"sex\": \"男7\"\r\n" + 
		 		"	}, {\r\n" + 
		 		"		\r\n" + 
		 		"		\"name\": \"哈哈哈8号\",\r\n" + 
		 		"		\"age\": \"age：8岁\",\r\n" + 
		 		"		\"sex\": \"男8\"\r\n" + 
		 		"	}, {\r\n" + 
		 		"		\r\n" + 
		 		"		\"name\": \"哈哈哈9号\",\r\n" + 
		 		"		\"age\": \"age：9岁\",\r\n" + 
		 		"		\"sex\": \"男9\"\r\n" + 
		 		"	}, {\r\n" + 
		 		"		\r\n" + 
		 		"		\"name\": \"哈哈哈10号\",\r\n" + 
		 		"		\"age\": \"age：10岁\",\r\n" + 
		 		"		\"sex\": \"男10\"\r\n" + 
		 		"	}, {\r\n" + 
		 		"		\r\n" + 
		 		"		\"name\": \"哈哈哈11号\",\r\n" + 
		 		"		\"age\": \"age：11岁\",\r\n" + 
		 		"		\"sex\": \"男11\"\r\n" + 
		 		"	}, {\r\n" + 
		 		"		\r\n" + 
		 		"		\"name\": \"哈哈哈12号\",\r\n" + 
		 		"		\"age\": \"age：12岁\",\r\n" + 
		 		"		\"sex\": \"男12\"\r\n" + 
		 		"	}, {\r\n" + 
		 		"		\r\n" + 
		 		"		\"name\": \"哈哈哈13号\",\r\n" + 
		 		"		\"age\": \"age：13岁\",\r\n" + 
		 		"		\"sex\": \"男13\"\r\n" + 
		 		"	}, {\r\n" + 
		 		"		\r\n" + 
		 		"		\"name\": \"哈哈哈14号\",\r\n" + 
		 		"		\"age\": \"age：14岁\",\r\n" + 
		 		"		\"sex\": \"男14\"\r\n" + 
		 		"	}, {\r\n" + 
		 		"		\r\n" + 
		 		"		\"name\": \"哈哈哈15号\",\r\n" + 
		 		"		\"age\": \"age：15岁\",\r\n" + 
		 		"		\"sex\": \"男15\"\r\n" + 
		 		"	}, {\r\n" + 
		 		"		\r\n" + 
		 		"		\"name\": \"哈哈哈16号\",\r\n" + 
		 		"		\"age\": \"age：16岁\",\r\n" + 
		 		"		\"sex\": \"男16\"\r\n" + 
		 		"	}, {\r\n" + 
		 		"		\r\n" + 
		 		"		\"name\": \"哈哈哈17号\",\r\n" + 
		 		"		\"age\": \"age：17岁\",\r\n" + 
		 		"		\"sex\": \"男17\"\r\n" + 
		 		"	}, {\r\n" + 
		 		"		\r\n" + 
		 		"		\"name\": \"哈哈哈18号\",\r\n" + 
		 		"		\"age\": \"age：18岁\",\r\n" + 
		 		"		\"sex\": \"男18\"\r\n" + 
		 		"	}, {\r\n" + 
		 		"		\r\n" + 
		 		"		\"name\": \"哈哈哈19号\",\r\n" + 
		 		"		\"age\": \"age：19岁\",\r\n" + 
		 		"		\"sex\": \"男19\"\r\n" + 
		 		"	}, {\r\n" + 
		 		"		\r\n" + 
		 		"		\"name\": \"哈哈哈20号\",\r\n" + 
		 		"		\"age\": \"age：20岁\",\r\n" + 
		 		"		\"sex\": \"男20\"\r\n" + 
		 		"	}, {\r\n" + 
		 		"		\r\n" + 
		 		"		\"name\": \"哈哈哈21号\",\r\n" + 
		 		"		\"age\": \"age：21岁\",\r\n" + 
		 		"		\"sex\": \"男21\"\r\n" + 
		 		"	}, {\r\n" + 
		 		"		\r\n" + 
		 		"		\"name\": \"哈哈哈22号\",\r\n" + 
		 		"		\"age\": \"age：22岁\",\r\n" + 
		 		"		\"sex\": \"男22\"\r\n" + 
		 		"	}, {\r\n" + 
		 		"		\r\n" + 
		 		"		\"name\": \"哈哈哈23号\",\r\n" + 
		 		"		\"age\": \"age：23岁\",\r\n" + 
		 		"		\"sex\": \"男23\"\r\n" + 
		 		"	}, {\r\n" + 
		 		"		\r\n" + 
		 		"		\"name\": \"哈哈哈24号\",\r\n" + 
		 		"		\"age\": \"age：24岁\",\r\n" + 
		 		"		\"sex\": \"男24\"\r\n" + 
		 		"	}\r\n" + 
		 		"	]\r\n" + 
		 		"}";
		response.getWriter().print(json);;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
