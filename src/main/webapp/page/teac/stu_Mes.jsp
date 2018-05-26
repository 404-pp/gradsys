<%--
  Created by IntelliJ IDEA.
  User: SKy
  Date: 2018/4/30
  Time: 10:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript"
            src="${pageContext.request.getContextPath()}/static/js/jquery-1.12.4.min.js"></script>
    <link href="${pageContext.request.getContextPath()}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
          rel="stylesheet">
    <script src="${pageContext.request.getContextPath()}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container-fluid">
    <!-- 按钮 -->
    <div class="row">
        <div class="col-md-12">
            <h1>学生</h1>
        </div>
    </div>
    <div class="row ">
        <div class="col-xs-10 col-md-9" id="search_div">
            <form class="form-inline">
                <div class="form-group">
                    <label>学号</label>
                    <input type="text" name="sno" class="form-control" id="select_student_tno">
                </div>
                <div class="form-group">
                    <label>姓名:</label>
                    <input type="text" name="sName" class="form-control" id="select_student_sName">
                </div>
                <div class="form-group">
                    <label>课题编号:</label>
                    <input type="text" name="paperNum" class="form-control" id="select_student_paperNum">
                </div>
                <div class="form-group">
                    <label>学院:</label>
                    <select class="form-control" name="collegeId" id="select_collName">

                    </select>
                </div>
                <div class="form-group">
                    <label>班级:</label>
                    <select class="form-control" name="classesId" id="select_classes">

                    </select>
                </div>
                <div class="form-group">
                    <label>性别:</label>
                    <select class="form-control" name="sex">
                        <option value="male">男</option>
                        <option value="female">女</option>
                    </select>
                </div>

            </form>
        </div>
        <div class="col-xs-1 col-md-2">
            <button class="btn btn-primary" id="search_student">查询</button>
        </div>
        <div class="col-xs-2 col-md-2">
            <span class="help-block" id="s_result"></span>
        </div>
    </div>
    <%--主内容--%>
    <div class="row">
        <div class="col-md-12" style="height: 600px">
            <table class="table table-hover" id="student_table">
                <thead>
                <tr>
                    <th class="col-md-1">学号</th>
                    <th class="col-md-1">密码</th>
                    <th class="col-md-1">姓名</th>
                    <th class="col-md-1">课题编号</th>
                    <th class="col-md-1">学院</th>
                    <th class="col-md-1">班级</th>
                    <th class="col-md-1">性别</th>
                    <th class="col-md-1">电话</th>
                </tr>
                </thead>
                <tbody>

                </tbody>
            </table>
        </div>
    </div>


    <div class="row">
        <div class="col-md-offset-4" id="page_info_nav">
        </div>
    </div>
</div>
<script type="text/javascript">

    var totalrecord,currentPage;

    $(function(){
        to_page(1);
    });

    function to_page(page){

        $.ajax({
            url:"${pageContext.request.getContextPath()}/studentController/getAllStudents",
            data:"page="+page,
            type:"GET",

            success:function(result){

                get_collName("#select_collName");

                build_student_table(result);
                // console.log(result);
                build_page_nav(result);

                totalrecord=result.extendMap.pageInfo.total;
                currentPage=result.extendMap.pageInfo.pageNum;
            }
        });
    }

    function build_student_table(result) {
        $("#student_table tbody").empty();
        if(result.code==101){
            return
        }
        var students=result.extendMap.pageInfo.list;
        $.each(students,function (index,item) {
            var sno=$("<td></td>").append(item.sno);
            var password=$("<td></td>").append(item.password);
            var sName=$("<td></td>").append($("<a></a>").attr("href","message_content.jsp?paperId="+item.paperNum+"&sno="+item.sno).append(item.sName));
            var mobile=$("<td></td>").append(item.mobile);
            var sex=$("<td></td>").append(item.sex=='male'?"男":"女");
            var collName=$("<td></td>").append(item.collName);
            var classes=$("<td></td>").append(item.classes);
            var paperNum=$("<td></td>").append(item.paperNum);





            $("<tr></tr>").append(sno)
                .append(password)
                .append(sName)
                .append(paperNum)
                .append(collName)
                .append(classes)
                .append(sex)
                .append(mobile).appendTo("#student_table tbody");



        });
    }

    function build_page_nav(result){
        $("#page_info_nav").empty();
        var firstPageLi=$("<li></li>").append($("<a></a>").append("首页").attr("href","#"));
        var prePageLi=$("<li></li>").append($("<a></a>").append("&laquo;").attr("href","#"));

        firstPageLi.click(function(){
            to_page(1);
        });
        prePageLi.click(function(){
            to_page(result.extendMap.pageInfo.prePage);
        });
        var nextPageLi=$("<li></li>").append($("<a></a>").append("&raquo;").attr("href","#"));
        var lastPageLi=$("<li></li>").append($("<a></a>").append("末页").attr("href","#"));
        nextPageLi.click(function(){
            to_page(result.extendMap.pageInfo.nextPage);
        });
        lastPageLi.click(function(){
            to_page(result.extendMap.pageInfo.pages);
        });
        var paginUl=$("<ul></ul>").addClass("pagination").append(firstPageLi).append(prePageLi);

        $.each(result.extendMap.pageInfo.navigatepageNums,function(index,item){
            var numLi=$("<li></li>").append($("<a></a>").append(item).attr("href","#"));
            if(result.extendMap.pageInfo.pageNum==item){
                numLi.addClass("active");
            }
            numLi.click(function(){
                to_page(item);
            });
            paginUl.append(numLi);
        });

        paginUl.append(nextPageLi).append(lastPageLi);

        var navEle=$("<nav></nav>").append(paginUl);

        $("#page_info_nav").append(navEle);

    }



    //多级查询
    $("#search_student").click(function () {
        $("#s_result").text('');
        var  page=1;
        console.log($("#search_div form").serialize());
        $.ajax({
            url:"${pageContext.request.getContextPath()}/studentController/getStudentsBy",
            type:"POST",
            data:$("#search_div form").serialize()+"&page=1",
            success:function (result) {
                if (result.code==100){
                    build_student_table(result);
                }else{
                    build_student_table(result);
                    var msg= result.extendMap.s_result;
                    $("#s_result").text(msg);
                }
            }
        });
    });




    //获取学院select选项
    function get_collName(ele){
        $(ele).empty();
        $.ajax({
            url:"${pageContext.request.getContextPath()}/collegeController/getAllColleges",
            type:"GET",
            success:function(result){
                $.each(result.extendMap.colleges,function(index,item){
                    var option=$("<option></option>").append(item.cname).attr("value",item.cid);
                    $(ele).append(option);
                });
                getClasses(ele);
            }

        });

    }
    //获取班级下拉菜单
    $("#select_collName").change(function () {
        getClasses($(this));
    });

    function getClasses(ele) {
        $("#select_classes").empty();
        var cId=$(ele).val();
        $.ajax({
            url:"${pageContext.request.getContextPath()}/classesController/getClassesByCId",
            type:"GET",
            data:"cid="+cId,
            success:function(result){
                if (result.code==100){
                    $.each(result.extendMap.classes,function(index,item){
                        var option=$("<option></option>").append(item.className).attr("value",item.id);
                        $("#select_classes").append(option);
                    });
                }else{
                    var option=$("<option></option>").append("没有");
                    $("#select_classes").append(option);
                }

            }

        });

    }
</script>


</body>
</html>
