<%@ page import="com.zr.news.service.LinkService" %>
<%@ page import="java.util.List" %>
<%@ page import="com.zr.news.entity.Link" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="row">
        <div class="col-md-12">
            <div class="link ">
                <div class="linkHeader ">友情链接</div>
                <div class="datas">
                    <ul>

                        <%
                            LinkService service=new LinkService();
                            List<Link> list=service.findAll();
                            if(list!=null){
                                for (Link link:list) {
                        %>
                        <li>
                            <a href="#?<%=link.getLinkId()%>"><%=link.getLinlName()%></a>
                        </li>
                        <%
                                }
                            }
                        %>
                    </ul>
                </div>
            </div>
        </div>
</div>
