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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{}bold"/>
 *         &lt;element ref="{}italic"/>
 *         &lt;element ref="{}monospace"/>
 *         &lt;element ref="{}overline"/>
 *         &lt;element ref="{}roman"/>
 *         &lt;element ref="{}sans-serif"/>
 *         &lt;element ref="{}sc"/>
 *         &lt;element ref="{}strike"/>
 *         &lt;element ref="{}underline"/>
 *         &lt;element ref="{}sub"/>
 *         &lt;element ref="{}sup"/>
 *         &lt;element ref="{}named-content"/>
 *         &lt;element ref="{}styled-content"/>
 *       &lt;/choice>
 *       &lt;attribute name="content-type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "series-text")
public class PmcXmlSeriesText {

    @XmlElementRefs({
        @XmlElementRef(name = "sub", type = PmcXmlSub.class, required = false),
        @XmlElementRef(name = "sup", type = PmcXmlSup.class, required = false),
        @XmlElementRef(name = "sc", type = PmcXmlSc.class, required = false),
        @XmlElementRef(name = "named-content", type = PmcXmlNamedContent.class, required = false),
        @XmlElementRef(name = "monospace", type = PmcXmlMonospace.class, required = false),
        @XmlElementRef(name = "underline", type = PmcXmlUnderline.class, required = false),
        @XmlElementRef(name = "overline", type = PmcXmlOverline.class, required = false),
        @XmlElementRef(name = "sans-serif", type = PmcXmlSansSerif.class, required = false),
        @XmlElementRef(name = "italic", type = PmcXmlItalic.class, required = false),
        @XmlElementRef(name = "bold", type = PmcXmlBold.class, required = false),
        @XmlElementRef(name = "roman", type = PmcXmlRoman.class, required = false),
        @XmlElementRef(name = "styled-content", type = PmcXmlStyledContent.class, required = false),
        @XmlElementRef(name = "strike", type = PmcXmlStrike.class, required = false)
    })
    @XmlMixed
    protected List<Object> content;
    @XmlAttribute(name = "content-type")
    @XmlSchemaType(name = "anySimpleType")
    protected String contentType;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PmcXmlSub }
     * {@link String }
     * {@link PmcXmlSup }
     * {@link PmcXmlSc }
     * {@link PmcXmlNamedContent }
     * {@link PmcXmlMonospace }
     * {@link PmcXmlUnderline }
     * {@link PmcXmlOverline }
     * {@link PmcXmlSansSerif }
     * {@link PmcXmlItalic }
     * {@link PmcXmlBold }
     * {@link PmcXmlRoman }
     * {@link PmcXmlStrike }
     * {@link PmcXmlStyledContent }
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
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

}
