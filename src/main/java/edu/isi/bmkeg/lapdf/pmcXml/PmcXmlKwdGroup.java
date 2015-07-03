//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.07.23 at 10:09:05 AM PDT 
//


package edu.isi.bmkeg.lapdf.pmcXml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
 *         &lt;element ref="{}label" minOccurs="0"/>
 *         &lt;element ref="{}title" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element ref="{}kwd"/>
 *           &lt;element ref="{}compound-kwd"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="kwd-group-type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "label",
    "title",
    "kwdsAndCompoundKwds"
})
@XmlRootElement(name = "kwd-group")
public class PmcXmlKwdGroup {

    protected PmcXmlLabel label;
    protected PmcXmlTitle title;
    @XmlElements({
        @XmlElement(name = "kwd", type = PmcXmlKwd.class),
        @XmlElement(name = "compound-kwd", type = PmcXmlCompoundKwd.class)
    })
    protected List<Object> kwdsAndCompoundKwds;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "kwd-group-type")
    @XmlSchemaType(name = "anySimpleType")
    protected String kwdGroupType;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String lang;

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link PmcXmlLabel }
     *     
     */
    public PmcXmlLabel getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmcXmlLabel }
     *     
     */
    public void setLabel(PmcXmlLabel value) {
        this.label = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link PmcXmlTitle }
     *     
     */
    public PmcXmlTitle getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmcXmlTitle }
     *     
     */
    public void setTitle(PmcXmlTitle value) {
        this.title = value;
    }

    /**
     * Gets the value of the kwdsAndCompoundKwds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kwdsAndCompoundKwds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKwdsAndCompoundKwds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PmcXmlKwd }
     * {@link PmcXmlCompoundKwd }
     * 
     * 
     */
    public List<Object> getKwdsAndCompoundKwds() {
        if (kwdsAndCompoundKwds == null) {
            kwdsAndCompoundKwds = new ArrayList<Object>();
        }
        return this.kwdsAndCompoundKwds;
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
     * Gets the value of the kwdGroupType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKwdGroupType() {
        return kwdGroupType;
    }

    /**
     * Sets the value of the kwdGroupType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKwdGroupType(String value) {
        this.kwdGroupType = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

}
