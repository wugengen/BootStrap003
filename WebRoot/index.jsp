<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Demo</title>
   <!--
        	描述：样式导入
        -->
	    <link rel="stylesheet" href="bootstrap1/js/bootstrap_above/bootstrap/css/bootstrap.min.css" />
	    <link rel="stylesheet" href="bootstrap1/js/bootstrap_above/bootstrap-table-develop/dist/bootstrap-table.css"/>
	    
	    <!--
        	描述：js导入，注意顺序，jquery必须引入
        	bootstrap-table-zh-CN.js为表格汉化的文件
        	FileSaver.min.js等是关联引用文件
        -->
	    <script src="bootstrap1/js/bootstrap_above/jquery-1.9.1/jquery.min.js"></script>
	    <script src="bootstrap1/js/bootstrap_above/bootstrap/js/bootstrap.min.js"></script>
	    <script type="text/javascript" src="bootstrap1/js/bootstrap_above/bootstrap-table-develop/dist/bootstrap-table.js"></script>
		<script type="text/javascript" src="bootstrap1/js/bootstrap_above/bootstrap-table-develop/dist/locale/bootstrap-table-zh-CN.js"></script>
		<script type="text/javascript" src="bootstrap1/js/bootstrap_above/bootstrap-table-develop/dist/extensions/export/bootstrap-table-export.js"></script>

	    <script src="bootstrap1/js/bootstrap_above/tableExport/libs/pdfmake/pdfmake.min.js"></script>
		<script src="bootstrap1/js/bootstrap_above/tableExport/libs/pdfmake/vfs_fonts.js"></script>
		<script type="text/javascript" src="bootstrap1/js/bootstrap_above/tableExport/libs/FileSaver/FileSaver.min.js"></script>
		<script type="text/javascript" src="bootstrap1/js/bootstrap_above/tableExport/libs/jsPDF/jspdf.min.js"></script>
		<script type="text/javascript" src="bootstrap1/js/bootstrap_above/tableExport/libs/jsPDF-AutoTable/jspdf.plugin.autotable.js"></script>
		<script type="text/javascript" src="bootstrap1/js/bootstrap_above/tableExport/tableExport.js"></script>
	    
		<script src="bootstrap1/js/index.js"></script>
</head>
 
<body>
  <!--查询窗体-->
  <div class="widget-content">
    <form method="post" class="form-horizontal" id="eventqueryform">
      <input type="text" class="span2" name="seqNo" placeholder="编号"> 
      <input type="text" class="span3" name="name" placeholder="姓名"> 
      <input type="button" class="btn btn-default span1" id="eventquery" value="查询">
    </form>
  </div>
 
  <div class="widget-content">
    <!--工具条-->
    <div id="toolbar">
      <button class="btn btn-success btn-xs" data-toggle="modal" data-target="#add">添加事件</button>
    </div>
    <table id="eventTable"></table>
  </div>
</body>
 
</html>

 