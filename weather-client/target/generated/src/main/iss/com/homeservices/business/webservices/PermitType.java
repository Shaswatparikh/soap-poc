
package com.homeservices.business.webservices;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for permitType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="permitType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BUILDING"/>
 *     &lt;enumeration value="ELECTRICAL"/>
 *     &lt;enumeration value="PLUMBING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "permitType")
@XmlEnum
public enum PermitType {

    BUILDING,
    ELECTRICAL,
    PLUMBING;

    public String value() {
        return name();
    }

    public static PermitType fromValue(String v) {
        return valueOf(v);
    }

}
