
package ws.lameduck;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebService(name = "lameduckPortType", targetNamespace = "http://lameduck.ws")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface LameduckPortType {


    /**
     * 
     * @param finput
     * @return
     *     returns ws.lameduck.FlightInformationArray
     */
    @WebMethod
    @WebResult(name = "getFlightsResponse", targetNamespace = "http://lameduck.ws", partName = "foutput")
    public FlightInformationArray getFlightsOperation(
        @WebParam(name = "getFlightsRequest", targetNamespace = "http://lameduck.ws", partName = "finput")
        GetFlightsRequest finput);

    /**
     * 
     * @param binput
     * @return
     *     returns boolean
     * @throws BookFlightOperationFault
     */
    @WebMethod
    @WebResult(name = "bookFlightResponse", targetNamespace = "http://lameduck.ws", partName = "boutput")
    public boolean bookFlightOperation(
        @WebParam(name = "bookFlighRequest", targetNamespace = "http://lameduck.ws", partName = "binput")
        BookFlighRequest binput)
        throws BookFlightOperationFault
    ;

    /**
     * 
     * @param cinput
     * @return
     *     returns boolean
     * @throws CancelFlightOperationFault
     */
    @WebMethod
    @WebResult(name = "cancelFlightResponse", targetNamespace = "http://lameduck.ws", partName = "coutput")
    public boolean cancelFlightOperation(
        @WebParam(name = "cancelFlightRequest", targetNamespace = "http://lameduck.ws", partName = "cinput")
        CancelFlightRequest cinput)
        throws CancelFlightOperationFault
    ;

}
