package com.logicsector.soapclient;

import com.homeservices.business.webservices.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ISSSoapClient {
    private static final Logger LOGGER = LoggerFactory.getLogger(ISSSoapClient.class);
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("EEEE, MMMM d yyyy");

    public static void main(String[] args) {
        try {
            LOGGER.debug("Creating install service instance (Note: Weather = Service subclass)...");
            long start = new Date().getTime();
            // Get a reference to the SOAP service interface.

            InstallEndpointService installEndpointService = new InstallEndpointService();

            InstallEndpoint installEndpoint = installEndpointService.getInstallEndpointPort();

            // An alternate way to get the SOAP service interface; includes logging interceptors.
            // JaxWsProxyFactoryBean factory = new org.apache.cxf.jaxws.JaxWsProxyFactoryBean();
            // factory.setServiceClass(WeatherSoap.class);
            // factory.setAddress("http://ws.cdyne.com/WeatherWS/Weather.asmx");
            // factory.getInInterceptors().add(new org.apache.cxf.interceptor.LoggingInInterceptor());
            // factory.getOutInterceptors().add(new org.apache.cxf.interceptor.LoggingOutInterceptor());
            // WeatherSoap weatherSoap = (WeatherSoap) factory.create();

            long end = new Date().getTime();
            LOGGER.debug("...Done! installEndpoint instance: {}", installEndpointService);
            LOGGER.debug("Time required to initialize installEndpoint service interface: {} seconds", (end - start) / 1000f);

            // Send a SOAP weather request for zip code 94025 (Menlo Park, CA, USA).
            LOGGER.debug("installEndpoint instance: {}", installEndpoint);

            InstallationInformation installationInformation = new InstallationInformation();
            Request request = new Request();

            List<ProductDetail> productDetailList = new ArrayList<ProductDetail>();

            ProductDetail productDetail = new ProductDetail();

            Address address = new Address();
            address.setZipCode("92501");
            address.setCity("Riverside");
            address.setState("CA");
            address.setCounty("");
            address.setDistance(0);

            productDetail.setAddress(address);
            productDetail.setDeliveryIncluded(false);
            productDetail.setMultipleTownships(false);
            productDetail.setProductId("02252053000");
            productDetail.setStoreNumber("0001004");

            productDetailList.add(productDetail);

            request.setProductDetails(productDetailList);

            InstallationInformation installationInformationResponse = installEndpoint.getInstallInformationV(
                    request, 2);
            LOGGER.debug(installationInformationResponse.toString());

            LOGGER.debug("Program complete, exiting");
        } catch (Exception e) {
            LOGGER.error("An exception occurred, exiting", e);
        }
    }

}
