<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
            <title>Listing Comment Items</title>
            <link rel="stylesheet" type="text/css" href="/Triary-war/index.xhtml/jsfcrud.xhtml" />
        </head>
        <body>
        <h:panelGroup id="messagePanel" layout="block">
            <h:messages errorStyle="color: red" infoStyle="color: green" layout="table"/>
        </h:panelGroup>
        <h1>Listing Comment Items</h1>
        <h:form styleClass="jsfcrud_list_form">
            <h:outputText escape="false" value="(No Comment Items Found)<br />" rendered="#{comment.pagingInfo.itemCount == 0}" />
            <h:panelGroup rendered="#{comment.pagingInfo.itemCount > 0}">
                <h:outputText value="Item #{comment.pagingInfo.firstItem + 1}..#{comment.pagingInfo.lastItem} of #{comment.pagingInfo.itemCount}"/>&nbsp;
                <h:commandLink action="#{comment.prev}" value="Previous #{comment.pagingInfo.batchSize}" rendered="#{comment.pagingInfo.firstItem >= comment.pagingInfo.batchSize}"/>&nbsp;
                <h:commandLink action="#{comment.next}" value="Next #{comment.pagingInfo.batchSize}" rendered="#{comment.pagingInfo.lastItem + comment.pagingInfo.batchSize <= comment.pagingInfo.itemCount}"/>&nbsp;
                <h:commandLink action="#{comment.next}" value="Remaining #{comment.pagingInfo.itemCount - comment.pagingInfo.lastItem}"
                               rendered="#{comment.pagingInfo.lastItem < comment.pagingInfo.itemCount && comment.pagingInfo.lastItem + comment.pagingInfo.batchSize > comment.pagingInfo.itemCount}"/>
                <h:dataTable value="#{comment.commentItems}" var="item" border="0" cellpadding="2" cellspacing="0" rowClasses="jsfcrud_odd_row,jsfcrud_even_row" rules="all" style="border:solid 1px">
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Text"/>
                        </f:facet>
                        <h:outputText value="#{item.text}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Datecomm"/>
                        </f:facet>
                        <h:outputText value="#{item.datecomm}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Publication"/>
                        </f:facet>
                        <h:outputText value="#{item.publication}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Diary"/>
                        </f:facet>
                        <h:outputText value="#{item.diary}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Autor"/>
                        </f:facet>
                        <h:outputText value="#{item.autor}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Id"/>
                        </f:facet>
                        <h:outputText value="#{item.id}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText escape="false" value="&nbsp;"/>
                        </f:facet>
                        <h:commandLink value="Show" action="#{comment.detailSetup}">
                            <f:param name="jsfcrud.currentComment" value="#{jsfcrud_class['beans.mbeans.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][item][comment.converter].jsfcrud_invoke}"/>
                        </h:commandLink>
                        <h:outputText value=" "/>
                        <h:commandLink value="Edit" action="#{comment.editSetup}">
                            <f:param name="jsfcrud.currentComment" value="#{jsfcrud_class['beans.mbeans.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][item][comment.converter].jsfcrud_invoke}"/>
                        </h:commandLink>
                        <h:outputText value=" "/>
                        <h:commandLink value="Destroy" action="#{comment.remove}">
                            <f:param name="jsfcrud.currentComment" value="#{jsfcrud_class['beans.mbeans.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][item][comment.converter].jsfcrud_invoke}"/>
                        </h:commandLink>
                    </h:column>

                </h:dataTable>
            </h:panelGroup>
            <br />
            <h:commandLink action="#{comment.createSetup}" value="New Comment"/>
            <br />
            <br />
            <h:commandLink value="Index" action="welcome" immediate="true" />


        </h:form>
        </body>
    </html>
</f:view>
