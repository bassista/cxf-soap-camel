package camel.order;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.2.10
 * Sun Mar 18 12:08:46 CET 2012
 * Generated source version: 2.2.10
 * 
 */
 
@WebService(targetNamespace = "http://order.camel", name = "OrderEndpoint")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface OrderEndpoint {

    @WebResult(name = "resultCode", targetNamespace = "http://order.camel", partName = "resultCode")
    @WebMethod(operationName = "Order", action = "http://order.camelinaction/Order")
    public java.lang.String order(
        @WebParam(partName = "partName", name = "partName", targetNamespace = "http://order.camel")
        java.lang.String partName,
        @WebParam(partName = "amount", name = "amount", targetNamespace = "http://order.camel")
        int amount,
        @WebParam(partName = "customerName", name = "customerName", targetNamespace = "http://order.camel")
        java.lang.String customerName
    );
}
