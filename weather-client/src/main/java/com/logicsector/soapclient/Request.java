package com.logicsector.soapclient;

import com.homeservices.business.webservices.InstallationInformation;
import com.homeservices.business.webservices.ProductDetail;

import java.util.List;

/**
 * Created by user on 21/7/16.
 */
public class Request extends InstallationInformation {
    public void setProductDetails(List<ProductDetail> productDetails){
        super.productDetails = productDetails;
    }
}
