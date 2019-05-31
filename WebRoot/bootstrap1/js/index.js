$(function() {
  // 初始化表格
  initTable();
 
  // 搜索按钮触发事件
  $("#eventquery").click(function() {
    $('#eventTable').bootstrapTable(('refresh')); // 很重要的一步，刷新url！
    // console.log("/program/area/findbyItem?offset="+0+"&"+$("#areaform").serialize())
    $('#eventqueryform input[name=\'name\']').val('')
    $('#eventqueryform input[name=\'seqNo\']').val('')
  });
 
});
 
// 表格初始化
function initTable() {
  $('#eventTable').bootstrapTable({
    method : 'post',  // 向服务器请求方式
    contentType : "application/x-www-form-urlencoded", // 如果是post必须定义
    url : '/bootstrap_table_demo/findbyitem',  // 请求url
    cache : false, // 是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
    striped : true, // 隔行变色
    dataType : "json", // 数据类型
    pagination : true, // 是否启用分页
    showPaginationSwitch : false, // 是否显示 数据条数选择框
    pageSize : 10, // 每页的记录行数（*）
    pageNumber : 1,   // table初始化时显示的页数
    pageList: [5, 10, 15, 20], //可供选择的每页的行数（*）
    search : false, // 不显示 搜索框
    sidePagination : 'server', // 服务端分页
    classes : 'table table-bordered', // Class样式
//   showRefresh : true, // 显示刷新按钮
    silent : true, // 必须设置刷新事件
    toolbar : '#toolbar',    // 工具栏ID
    toolbarAlign : 'right',   // 工具栏对齐方式
    queryParams : queryParams, // 请求参数，这个关系到后续用到的异步刷新
    columns : [ {
      field : 'seqNo',
      title : '编号',
      align : 'center'
    }, {
      field : 'name',
      title : '姓名',
      align : 'center'
    }, {
      field : 'sex',
      title : '性别',
      align : 'center'
    }, {
      field : 'id',
      title : '操作',
      align : 'center',
      width : '280px',
      formatter : function(value, row, index) {
//        console.log(JSON.stringify(row));
      }
    } ],
  });
}
 
// 分页查询参数，是以键值对的形式设置的
function queryParams(params) {
  return {
    name : $('#eventqueryform input[name=\'name\']').val(),  // 请求时向服务端传递的参数
    seqNo : $('#eventqueryform input[name=\'seqNo\']').val(),
 
    limit : params.limit, // 每页显示数量
    offset : params.offset, // SQL语句偏移量
  }
}