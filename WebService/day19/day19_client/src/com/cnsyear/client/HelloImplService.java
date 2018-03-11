package com.cnsyear.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.5.9
 * 2018-03-10T20:13:29.550+08:00
 * Generated source version: 2.5.9
 * 
 */
@WebServiceClient(name = "HelloImplService", 
                  wsdlLocation = "http://localhost:8080/day19/helloWs?wsdl",
                  targetNamespace = "http://server.cnsyear.com/") 
public class HelloImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://server.cnsyear.com/", "HelloImplService");
    public final static QName HelloImplPort = new QName("http://server.cnsyear.com/", "HelloImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/day19/helloWs?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(HelloImplService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/day19/helloWs?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public HelloImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public HelloImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public HelloImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public HelloImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public HelloImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns Hello
     */
    @WebEndpoint(name = "HelloImplPort")
    public Hello getHelloImplPort() {
        return super.getPort(HelloImplPort, Hello.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Hello
     */
    @WebEndpoint(name = "HelloImplPort")
    public Hello getHelloImplPort(WebServiceFeature... features) {
        return super.getPort(HelloImplPort, Hello.class, features);
    }

}