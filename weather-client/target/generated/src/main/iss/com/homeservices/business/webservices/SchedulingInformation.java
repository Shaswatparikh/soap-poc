
package com.homeservices.business.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for schedulingInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="schedulingInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="blackoutDates" type="{http://www.w3.org/2001/XMLSchema}dateTime" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sima" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "schedulingInformation", propOrder = {
    "blackoutDates",
    "sima"
})
public class SchedulingInformation {

    @XmlElement(nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected List<XMLGregorianCalendar> blackoutDates;
    protected String sima;

    /**
     * Gets the value of the blackoutDates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the blackoutDates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBlackoutDates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLGregorianCalendar }
     * 
     * 
     */
    public List<XMLGregorianCalendar> getBlackoutDates() {
        if (blackoutDates == null) {
            blackoutDates = new ArrayList<XMLGregorianCalendar>();
        }
        return this.blackoutDates;
    }

    /**
     * Gets the value of the sima property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSima() {
        return sima;
    }

    /**
     * Sets the value of the sima property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSima(String value) {
        this.sima = value;
    }

}
