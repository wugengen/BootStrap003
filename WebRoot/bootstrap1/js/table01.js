//手动制造30条数据
	var datas = [];
	for (var i = 0; i < 500; i++) {
		datas[i] = {
			"name" : "哈哈哈" + i + "号",
			"age" : "年龄：" + i + "岁",
			"sex" : "男" + i
		}
	}
$(function () {
    $('#db_dependences').bootstrapTable({
   
    	//url:'data.json',
    	url:"http://localhost:9999/BootStrap002/Hello001",
    	method:'POST',
        dataType:'json',
        contentType: "application/x-www-form-urlencoded",
        cache: false,
        striped: true,                              //是否显示行间隔色
        sidePagination: "client",           //分页方式：client客户端分页，server服务端分页（*）
        showColumns:true,
        pagination:true,
        'queryParamsType':'limit', //默认值为 'limit' ,在默认情况下 传给服务端的参数为：offset,limit,sort
        // 设置为 ''  在这种情况下传给服务器的参数为：pageSize,pageNumber
        // 传递的参数
        queryParams : function (params) {
        	return {
        		pageSize : params.limit,//每页记录数
        		rowoffset : params.offset,//从第几条记录开始
        		//order: params.order,//排序
        		//ordername: params.sort,
        		//...自己页面的参数
        		}
        },
         
        minimumCountColumns:2,
        pageNumber:1,                       //初始化加载第一页，默认第一页
        pageSize: 20,                       //每页的记录行数（*）
        pageList: [10, 25, 50, 100],        //可供选择的每页的行数（*）
        uniqueId: "id",                     //每一行的唯一标识，一般为主键列
        showExport: true,                    
        exportDataType: 'all',
        exportTypes:[ 'csv', 'txt', 'sql', 'doc', 'excel', 'xlsx', 'pdf','json'],  //导出文件类型
        columns : [ {
			field : "checked",
			checkbox : true
		}, {
			field : "name",
			title : "测试姓名",
			align : "center",
			valign : "middle",
			sortable : "true"
		}, {
			field : "age",
			title : "年龄",
			align : "center",
			valign : "middle",
			sortable : "true"
		}, {
			field : "sex",
			title : "性别",
			align : "center",
			valign : "middle",
			sortable : "true"
		}, ],
		//data : datas,
	});
   
});
