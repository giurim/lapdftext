//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.07.23 at 10:09:05 AM PDT 
//


package edu.isi.bmkeg.lapdf.pmcXml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}alt-text" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="content-type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="baseline-shift" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="mimetype" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="mime-subtype" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute ref="{http://www.w3.org/1999/xlink}type"/>
 *       &lt;attribute ref="{http://www.w3.org/1999/xlink}href use="required""/>
 *       &lt;attribute ref="{http://www.w3.org/1999/xlink}role"/>
 *       &lt;attribute ref="{http://www.w3.org/1999/xlink}title"/>
 *       &lt;attribute ref="{http://www.w3.org/1999/xlink}show"/>
 *       &lt;attribute ref="{http://www.w3.org/1999/xlink}actuate"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "altText"
})
@XmlRootElement(name = "inline-graphic")
public class PmcXmlInlineGraphic {

    @XmlElement(name = "alt-text")
    protected PmcXmlAltText altText;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "content-type")
    @XmlSchemaType(name = "anySimpleType")
    protected String contentType;
    @XmlAttribute(name = "baseline-shift")
    @XmlSchemaType(name = "anySimpleType")
    protected String baselineShift;
    @XmlAttribute(name = "mimetype")
    @XmlSchemaType(name = "anySimpleType")
    protected String mimetype;
    @XmlAttribute(name = "mime-subtype")
    @XmlSchemaType(name = "anySimpleType")
    protected String mimeSubtype;
    @XmlAttribute(name = "type", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;
    @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String href;
    @XmlAttribute(name = "role", namespace = "http://www.w3.org/1999/xlink")
    @XmlSchemaType(name = "anySimpleType")
    protected String role;
    @XmlAttribute(name = "title", namespace = "http://www.w3.org/1999/xlink")
    @XmlSchemaType(name = "anySimpleType")
    protected String title;
    @XmlAttribute(name = "show", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String show;
    @XmlAttribute(name = "actuate", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String actuate;

    /**
     * Gets the value of the altText property.
     * 
     * @return
     *     possible object is
     *     {@link PmcXmlAltText }
     *     
     */
    public PmcXmlAltText getAltText() {
        return altText;
    }

    /**
     * Sets the value of the altText property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmcXmlAltText }
     *     
     */
    public void setAltText(PmcXmlAltText value) {
        this.altText = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the contentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * Sets the value of the contentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentType(String value) {
        this.contentType = value;
    }

    /**
     * Gets the value of the baselineShift property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaselineShift() {
        return baselineShift;
    }

    /**
     * Sets the value of the baselineShift property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaselineShift(String value) {
        this.baselineShift = value;
    }

    /**
     * Gets the value of the mimetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMimetype() {
        return mimetype;
    }

    /**
     * Sets the value of the mimetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMimetype(String value) {
        this.mimetype = value;
    }

    /**
     * Gets the value of the mimeSubtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMimeSubtype() {
        return mimeSubtype;
    }

    /**
     * Sets the value of the mimeSubtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMimeSubtype(String value) {
        this.mimeSubtype = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the show property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShow() {
        return show;
    }

    /**
     * Sets the value of the show property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShow(String value) {
        this.show = value;
    }

    /**
     * Gets the value of the actuate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActuate() {
        return actuate;
    }

    /**
     * Sets the value of the actuate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActuate(String value) {
        this.actuate = value;
    }

}
