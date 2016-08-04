
package com.homeservices.business.webservices;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.homeservices.business.webservices package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Version_QNAME = new QName("http://webservices.business.homeservices.com/", "version");
    private final static QName _ItemPriceStartDate_QNAME = new QName("", "startDate");
    private final static QName _ItemPriceStopDate_QNAME = new QName("", "stopDate");
    private final static QName _ItemPricePrice_QNAME = new QName("", "price");
    private final static QName _ItemPriceDivision_QNAME = new QName("", "division");
    private final static QName _ItemPricePromotionType_QNAME = new QName("", "promotionType");
    private final static QName _ItemPriceStore_QNAME = new QName("", "store");
    private final static QName _ItemPriceItemNumber_QNAME = new QName("", "itemNumber");
    private final static QName _ItemPriceSku_QNAME = new QName("", "sku");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.homeservices.business.webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProductDetail.ItemPrices.Entry }
     * 
     */
    public ProductDetail.ItemPrices.Entry createProductDetailItemPricesEntry() {
        return new ProductDetail.ItemPrices.Entry();
    }

    /**
     * Create an instance of {@link ItemPrice }
     * 
     */
    public ItemPrice createItemPrice() {
        return new ItemPrice();
    }

    /**
     * Create an instance of {@link Permit }
     * 
     */
    public Permit createPermit() {
        return new Permit();
    }

    /**
     * Create an instance of {@link ProductDetail.ItemPrices }
     * 
     */
    public ProductDetail.ItemPrices createProductDetailItemPrices() {
        return new ProductDetail.ItemPrices();
    }

    /**
     * Create an instance of {@link SchedulingInformation }
     * 
     */
    public SchedulingInformation createSchedulingInformation() {
        return new SchedulingInformation();
    }

    /**
     * Create an instance of {@link InstallationInformation }
     * 
     */
    public InstallationInformation createInstallationInformation() {
        return new InstallationInformation();
    }

    /**
     * Create an instance of {@link GasHookup }
     * 
     */
    public GasHookup createGasHookup() {
        return new GasHookup();
    }

    /**
     * Create an instance of {@link Item }
     * 
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link ProductDetail }
     * 
     */
    public ProductDetail createProductDetail() {
        return new ProductDetail();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.business.homeservices.com/", name = "version")
    public JAXBElement<Float> createVersion(Float value) {
        return new JAXBElement<Float>(_Version_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "startDate", scope = ItemPrice.class)
    public JAXBElement<XMLGregorianCalendar> createItemPriceStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ItemPriceStartDate_QNAME, XMLGregorianCalendar.class, ItemPrice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "stopDate", scope = ItemPrice.class)
    public JAXBElement<XMLGregorianCalendar> createItemPriceStopDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ItemPriceStopDate_QNAME, XMLGregorianCalendar.class, ItemPrice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "price", scope = ItemPrice.class)
    public JAXBElement<BigDecimal> createItemPricePrice(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ItemPricePrice_QNAME, BigDecimal.class, ItemPrice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "division", scope = ItemPrice.class)
    public JAXBElement<String> createItemPriceDivision(String value) {
        return new JAXBElement<String>(_ItemPriceDivision_QNAME, String.class, ItemPrice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PromotionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "promotionType", scope = ItemPrice.class)
    public JAXBElement<PromotionType> createItemPricePromotionType(PromotionType value) {
        return new JAXBElement<PromotionType>(_ItemPricePromotionType_QNAME, PromotionType.class, ItemPrice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "store", scope = ItemPrice.class)
    public JAXBElement<String> createItemPriceStore(String value) {
        return new JAXBElement<String>(_ItemPriceStore_QNAME, String.class, ItemPrice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "itemNumber", scope = ItemPrice.class)
    public JAXBElement<String> createItemPriceItemNumber(String value) {
        return new JAXBElement<String>(_ItemPriceItemNumber_QNAME, String.class, ItemPrice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "sku", scope = ItemPrice.class)
    public JAXBElement<String> createItemPriceSku(String value) {
        return new JAXBElement<String>(_ItemPriceSku_QNAME, String.class, ItemPrice.class, value);
    }

}
