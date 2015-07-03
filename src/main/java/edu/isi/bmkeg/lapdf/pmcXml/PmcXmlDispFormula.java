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
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import edu.isi.bmkeg.lapdf.pmcXml.mathml.PmcXmlMath;


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
 *         &lt;element ref="{}alt-text"/>
 *         &lt;element ref="{}long-desc"/>
 *         &lt;element ref="{}email"/>
 *         &lt;element ref="{}ext-link"/>
 *         &lt;element ref="{}uri"/>
 *         &lt;element ref="{}break"/>
 *         &lt;element ref="{}bold"/>
 *         &lt;element ref="{}italic"/>
 *         &lt;element ref="{}monospace"/>
 *         &lt;element ref="{}overline"/>
 *         &lt;element ref="{}roman"/>
 *         &lt;element ref="{}sans-serif"/>
 *         &lt;element ref="{}sc"/>
 *         &lt;element ref="{}strike"/>
 *         &lt;element ref="{}underline"/>
 *         &lt;element ref="{}inline-graphic"/>
 *         &lt;element ref="{}private-char"/>
 *         &lt;element ref="{}chem-struct"/>
 *         &lt;element ref="{}inline-formula"/>
 *         &lt;element ref="{}label"/>
 *         &lt;element ref="{}named-content"/>
 *         &lt;element ref="{}styled-content"/>
 *         &lt;element ref="{}tex-math"/>
 *         &lt;element ref="{http://www.w3.org/1998/Math/MathML}math"/>
 *         &lt;element ref="{}alternatives"/>
 *         &lt;element ref="{}array"/>
 *         &lt;element ref="{}graphic"/>
 *         &lt;element ref="{}media"/>
 *         &lt;element ref="{}preformat"/>
 *         &lt;element ref="{}sub"/>
 *         &lt;element ref="{}sup"/>
 *       &lt;/choice>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="content-type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="specific-use" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
@XmlRootElement(name = "disp-formula")
public class PmcXmlDispFormula {

    @XmlElementRefs({
        @XmlElementRef(name = "graphic", type = PmcXmlGraphic.class, required = false),
        @XmlElementRef(name = "inline-formula", type = PmcXmlInlineFormula.class, required = false),
        @XmlElementRef(name = "preformat", type = PmcXmlPreformat.class, required = false),
        @XmlElementRef(name = "tex-math", type = PmcXmlTexMath.class, required = false),
        @XmlElementRef(name = "inline-graphic", type = PmcXmlInlineGraphic.class, required = false),
        @XmlElementRef(name = "sub", type = PmcXmlSub.class, required = false),
        @XmlElementRef(name = "sup", type = PmcXmlSup.class, required = false),
        @XmlElementRef(name = "array", type = PmcXmlArray.class, required = false),
        @XmlElementRef(name = "ext-link", type = PmcXmlExtLink.class, required = false),
        @XmlElementRef(name = "chem-struct", type = PmcXmlChemStruct.class, required = false),
        @XmlElementRef(name = "private-char", type = PmcXmlPrivateChar.class, required = false),
        @XmlElementRef(name = "alternatives", type = PmcXmlAlternatives.class, required = false),
        @XmlElementRef(name = "math", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlMath.class, required = false),
        @XmlElementRef(name = "sc", type = PmcXmlSc.class, required = false),
        @XmlElementRef(name = "long-desc", type = PmcXmlLongDesc.class, required = false),
        @XmlElementRef(name = "named-content", type = PmcXmlNamedContent.class, required = false),
        @XmlElementRef(name = "monospace", type = PmcXmlMonospace.class, required = false),
        @XmlElementRef(name = "alt-text", type = PmcXmlAltText.class, required = false),
        @XmlElementRef(name = "underline", type = PmcXmlUnderline.class, required = false),
        @XmlElementRef(name = "overline", type = PmcXmlOverline.class, required = false),
        @XmlElementRef(name = "sans-serif", type = PmcXmlSansSerif.class, required = false),
        @XmlElementRef(name = "label", type = PmcXmlLabel.class, required = false),
        @XmlElementRef(name = "email", type = PmcXmlEmail.class, required = false),
        @XmlElementRef(name = "uri", type = PmcXmlUri.class, required = false),
        @XmlElementRef(name = "italic", type = PmcXmlItalic.class, required = false),
        @XmlElementRef(name = "bold", type = PmcXmlBold.class, required = false),
        @XmlElementRef(name = "roman", type = PmcXmlRoman.class, required = false),
        @XmlElementRef(name = "break", type = PmcXmlBreak.class, required = false),
        @XmlElementRef(name = "styled-content", type = PmcXmlStyledContent.class, required = false),
        @XmlElementRef(name = "strike", type = PmcXmlStrike.class, required = false),
        @XmlElementRef(name = "media", type = PmcXmlMedia.class, required = false)
    })
    @XmlMixed
    protected List<Object> content;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "content-type")
    @XmlSchemaType(name = "anySimpleType")
    protected String contentType;
    @XmlAttribute(name = "specific-use")
    @XmlSchemaType(name = "anySimpleType")
    protected String specificUse;

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
     * {@link PmcXmlInlineFormula }
     * {@link PmcXmlSub }
     * {@link PmcXmlSup }
     * {@link PmcXmlArray }
     * {@link PmcXmlExtLink }
     * {@link PmcXmlChemStruct }
     * {@link PmcXmlPrivateChar }
     * {@link PmcXmlMath }
     * {@link PmcXmlSc }
     * {@link PmcXmlLongDesc }
     * {@link PmcXmlMonospace }
     * {@link PmcXmlAltText }
     * {@link PmcXmlUnderline }
     * {@link PmcXmlSansSerif }
     * {@link PmcXmlItalic }
     * {@link PmcXmlLabel }
     * {@link PmcXmlEmail }
     * {@link PmcXmlRoman }
     * {@link PmcXmlBreak }
     * {@link PmcXmlStyledContent }
     * {@link PmcXmlMedia }
     * {@link PmcXmlGraphic }
     * {@link PmcXmlPreformat }
     * {@link PmcXmlTexMath }
     * {@link PmcXmlInlineGraphic }
     * {@link String }
     * {@link PmcXmlAlternatives }
     * {@link PmcXmlNamedContent }
     * {@link PmcXmlOverline }
     * {@link PmcXmlUri }
     * {@link PmcXmlBold }
     * {@link PmcXmlStrike }
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
     * Gets the value of the specificUse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecificUse() {
        return specificUse;
    }

    /**
     * Sets the value of the specificUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecificUse(String value) {
        this.specificUse = value;
    }

}
