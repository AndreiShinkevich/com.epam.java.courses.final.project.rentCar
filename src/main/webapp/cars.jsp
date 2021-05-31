<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link rel="stylesheet"
    	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
    	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
    	crossorigin="anonymous">
</head>
<body>
    <center>
        <h1>Cars Management</h1>
    </center>
    <div align="center">
        <table class="table">
            <h2>List of Cars</h2>
            <thead>
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">Brand</th>
                    <th scope="col">Model</th>
            	    <th scope="col">Transmission</th>
                    <th scope="col">Actions</th>
                </tr>

            <c:forEach var="car" items="${requestScope.carsList}">
            <tr>
                <td><c:out value="${car.idCar}"/></td>
                <td>${car.brand}</td>
                <td>${car.model}</td>
                <td>${car.carsTransmission}
                </td>
                <td>
                                    <c:set var="idCar">${car.idCar}</c:set>
                                    <c:set var="orderStatus">${carsStatus[idCar]}</c:set>
                    <c:choose>
                      <c:when test="${orderStatus == 'IN_PROCESSING'}">
                             <form action="order" method="POST">
                                <input type="text" hidden="true" name="action" value="updateOrder">

                                <input type="text" hidden="true" name="orderId" value="0">
                                <select name="orderStatus" id="orderStatus">
                                  <option value="DECLINED">DECLINED</option>
                                  <option value="IN_PROCESSING">IN_PROCESSING</option>
                                </select>
                                
                                <input class="btn btn-primary" type="submit" value="Change status" />
                                                </form>

                      </c:when>
                      <c:otherwise>
                        <form action="order" method="POST">

                            <input type="text" hidden="true" name="action" value="createOrder">
                            <input type="text" hidden="true" name="idCar" value="${car.idCar}">
                            <input class="btn btn-primary" type="submit" value="Rental car" />
                        </form>
                      </c:otherwise>
                    </c:choose>

                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
