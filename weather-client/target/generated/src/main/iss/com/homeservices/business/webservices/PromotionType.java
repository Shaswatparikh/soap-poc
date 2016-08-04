
package com.homeservices.business.webservices;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for promotionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="promotionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="REGULAR"/>
 *     &lt;enumeration value="CLEARANCE"/>
 *     &lt;enumeration value="PROMOTION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "promotionType")
@XmlEnum
public enum PromotionType {

    REGULAR,
    CLEARANCE,
    PROMOTION;

    public String value() {
        return name();
    }

    public static PromotionType fromValue(String v) {
        return valueOf(v);
    }

}
