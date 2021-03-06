
package dk.dtu.imm.fastmoney.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>creditCardInfoType complex type\u7684 Java \u7c7b\u3002
 * 
 * <p>\u4ee5\u4e0b\u6a21\u5f0f\u7247\u6bb5\u6307\u5b9a\u5305\u542b\u5728\u6b64\u7c7b\u4e2d\u7684\u9884\u671f\u5185\u5bb9\u3002
 * 
 * <pre>
 * &lt;complexType name="creditCardInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="expirationDate">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="month" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creditCardInfoType", propOrder = {
    "expirationDate",
    "name",
    "number"
})
public class CreditCardInfoType {

    @XmlElement(required = true)
    protected CreditCardInfoType.ExpirationDate expirationDate;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String number;

    /**
     * \u83b7\u53d6expirationDate\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @return
     *     possible object is
     *     {@link CreditCardInfoType.ExpirationDate }
     *     
     */
    public CreditCardInfoType.ExpirationDate getExpirationDate() {
        return expirationDate;
    }

    /**
     * \u8bbe\u7f6eexpirationDate\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardInfoType.ExpirationDate }
     *     
     */
    public void setExpirationDate(CreditCardInfoType.ExpirationDate value) {
        this.expirationDate = value;
    }

    /**
     * \u83b7\u53d6name\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * \u8bbe\u7f6ename\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * \u83b7\u53d6number\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * \u8bbe\u7f6enumber\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }


    /**
     * <p>anonymous complex type\u7684 Java \u7c7b\u3002
     * 
     * <p>\u4ee5\u4e0b\u6a21\u5f0f\u7247\u6bb5\u6307\u5b9a\u5305\u542b\u5728\u6b64\u7c7b\u4e2d\u7684\u9884\u671f\u5185\u5bb9\u3002
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="month" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "month",
        "year"
    })
    public static class ExpirationDate {

        protected int month;
        protected int year;

        /**
         * \u83b7\u53d6month\u5c5e\u6027\u7684\u503c\u3002
         * 
         */
        public int getMonth() {
            return month;
        }

        /**
         * \u8bbe\u7f6emonth\u5c5e\u6027\u7684\u503c\u3002
         * 
         */
        public void setMonth(int value) {
            this.month = value;
        }

        /**
         * \u83b7\u53d6year\u5c5e\u6027\u7684\u503c\u3002
         * 
         */
        public int getYear() {
            return year;
        }

        /**
         * \u8bbe\u7f6eyear\u5c5e\u6027\u7684\u503c\u3002
         * 
         */
        public void setYear(int value) {
            this.year = value;
        }

    }

}
