<%@ page import="com.activitiesManagement.entity.Exercise" %>
<%@ page import="java.util.List" %>
<%@ include file="../components/dashHeader.jsp"%>
<% List < Exercise > exerciceList = (List<Exercise>) request.getAttribute ( "exerciceList" ); %>

<div class="content-wrapper">
    <div class="content-header">
        <div class="container-fluid">
            <div class="row mb-2">
                <div class="col-sm-6">
                    <p>Exercise List</p>
                </div>
            </div>
        </div>
    </div>

    <section class="main-content content">
        <div class="container-fluid">
            <div class="row">
                <div class="col-12">
                    <div class="card">
                        <div class="card-header">
                            <h3 class="card-title">Exercices List</h3>
                            <div class="card-tools">
                                <div class="input-group input-group-sm" style="width: 150px;">
                                    <input type="text" name="table_search" class="form-control float-right" placeholder="Search">

                                    <div class="input-group-append">
                                        <button type="submit" class="btn btn-default">
                                            <i class="fas fa-search"></i>
                                        </button>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- /.card-header -->
                        <div class="card-body table-responsive p-0">
                            <table class="table table-hover text-nowrap">
                                <thead>
                                <tr>
                                    <th>ID</th>
                                    <th>Year</th>
                                    <th>Start</th>
                                    <th>End</th>
                                    <th>Status</th>
                                    <th>Description</th>
                                    <th>Action</th>
                                </tr>
                                </thead>
                                <tbody>
                                <tr>
                                    <td>183</td>
                                    <td>2014</td>
                                    <td>11-7-2014</td>
                                    <td>11-8-2014</td>
                                    <td>Active</td>
                                    <td>example description</td>
                                    <td><span>Edit</span> <span>Delete</span></td>
                                </tr>
                                <tr>
                                    <td>183</td>
                                    <td>2014</td>
                                    <td>11-7-2014</td>
                                    <td>11-8-2014</td>
                                    <td>Active</td>
                                    <td>example description</td>
                                    <td><span>Edit</span> <span>Delete</span></td>
                                </tr>
                                <tr>
                                    <td>183</td>
                                    <td>2014</td>
                                    <td>11-7-2014</td>
                                    <td>11-8-2014</td>
                                    <td>Active</td>
                                    <td>example description</td>
                                    <td><span>Edit</span> <span>Delete</span></td>
                                </tr>
                                <tr>
                                    <td>183</td>
                                    <td>2014</td>
                                    <td>11-7-2014</td>
                                    <td>11-8-2014</td>
                                    <td>Active</td>
                                    <td>example description</td>
                                    <td><span>Edit</span> <span>Delete</span></td>
                                </tr>
                                <tr>
                                    <td>183</td>
                                    <td>2014</td>
                                    <td>11-7-2014</td>
                                    <td>11-8-2014</td>
                                    <td>Active</td>
                                    <td>example description</td>
                                    <td><span>Edit</span> <span>Delete</span></td>
                                </tr>
                                <tr>
                                    <td>183</td>
                                    <td>2014</td>
                                    <td>11-7-2014</td>
                                    <td>11-8-2014</td>
                                    <td>Active</td>
                                    <td>example description</td>
                                    <td><span>Edit</span> <span>Delete</span></td>
                                </tr>
                                <%
                                    for (Exercise exercice : exerciceList) {
                                        out.println ("<tr>");
                                            out.println( "<td>" + exercice.getId () + "</td>");
                                        out.println( "<td>" + exercice.getYear () + "</td>");
                                        out.println( "<td>" + exercice.getDateStart () + "</td>");
                                        out.println( "<td>" + exercice.getEndDate () + "</td>");
                                        out.println( "<td>" + exercice.isState () + "</td>");
                                        out.println( "<td>" + exercice.getDescription () + "</td>");
                                        out.println( "<td><a href='/deleteExercice?id=" + exercice.getId () + "'>Delete</a></td>");
                                        out.println("</tr");
                                    }
                                %>
                                </tbody>
                            </table>
                        </div>
                        <!-- /.card-body -->
                    </div>
                    <!-- /.card -->
                </div>
            </div>
            <!-- /.row -->
        </div>
    </section>
</div>
<%@ include file="../components/dashFooter.jsp"%>