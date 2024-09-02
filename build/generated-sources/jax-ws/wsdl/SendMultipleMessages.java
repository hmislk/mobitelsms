
package wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sendMultipleMessages complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendMultipleMessages">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="session" type="{https://ws.esms.mobitel.lk/}session" minOccurs="0"/>
 *         &lt;element name="smsMultipleMessage" type="{https://ws.esms.mobitel.lk/}smsMultipleMessage" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendMultipleMessages", propOrder = {
    "session",
    "smsMultipleMessage"
})
public class SendMultipleMessages {

    protected Session session;
    protected SmsMultipleMessage smsMultipleMessage;

    /**
     * Gets the value of the session property.
     * 
     * @return
     *     possible object is
     *     {@link Session }
     *     
     */
    public Session getSession() {
        return session;
    }

    /**
     * Sets the value of the session property.
     * 
     * @param value
     *     allowed object is
     *     {@link Session }
     *     
     */
    public void setSession(Session value) {
        this.session = value;
    }

    /**
     * Gets the value of the smsMultipleMessage property.
     * 
     * @return
     *     possible object is
     *     {@link SmsMultipleMessage }
     *     
     */
    public SmsMultipleMessage getSmsMultipleMessage() {
        return smsMultipleMessage;
    }

    /**
     * Sets the value of the smsMultipleMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmsMultipleMessage }
     *     
     */
    public void setSmsMultipleMessage(SmsMultipleMessage value) {
        this.smsMultipleMessage = value;
    }

}
