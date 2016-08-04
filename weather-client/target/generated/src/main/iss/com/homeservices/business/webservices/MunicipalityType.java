
package com.homeservices.business.webservices;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for municipalityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="municipalityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CITY"/>
 *     &lt;enumeration value="COUNTY"/>
 *     &lt;enumeration value="TOWNSHIP"/>
 *     &lt;enumeration value="STATE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "municipalityType")
@XmlEnum
public enum MunicipalityType {

    CITY,
    COUNTY,
    TOWNSHIP,
    STATE;

    public String value() {
        return name();
    }

    public static MunicipalityType fromValue(String v) {
        return valueOf(v);
    }

}
