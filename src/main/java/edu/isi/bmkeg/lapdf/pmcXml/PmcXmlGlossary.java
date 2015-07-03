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
 *       &lt;sequence>
 *         &lt;element ref="{}label" minOccurs="0"/>
 *         &lt;element ref="{}title" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{}address"/>
 *           &lt;element ref="{}alternatives"/>
 *           &lt;element ref="{}array"/>
 *           &lt;element ref="{}boxed-text"/>
 *           &lt;element ref="{}chem-struct-wrap"/>
 *           &lt;element ref="{}fig"/>
 *           &lt;element ref="{}fig-group"/>
 *           &lt;element ref="{}graphic"/>
 *           &lt;element ref="{}media"/>
 *           &lt;element ref="{}preformat"/>
 *           &lt;element ref="{}supplementary-material"/>
 *           &lt;element ref="{}table-wrap"/>
 *           &lt;element ref="{}table-wrap-group"/>
 *           &lt;element ref="{}disp-formula"/>
 *           &lt;element ref="{}disp-formula-group"/>
 *           &lt;element ref="{}p"/>
 *           &lt;element ref="{}def-list"/>
 *           &lt;element ref="{}list"/>
 *           &lt;element ref="{}tex-math"/>
 *           &lt;element ref="{http://www.w3.org/1998/Math/MathML}math"/>
 *           &lt;element ref="{}related-article"/>
 *           &lt;element ref="{}related-object"/>
 *           &lt;element ref="{}disp-quote"/>
 *           &lt;element ref="{}speech"/>
 *           &lt;element ref="{}statement"/>
 *           &lt;element ref="{}verse-group"/>
 *         &lt;/choice>
 *         &lt;element ref="{}glossary" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
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
    "label",
    "title",
    "addressesAndAlternativesAndArraies",
    "glossaries"
})
@XmlRootElement(name = "glossary")
public class PmcXmlGlossary {

    protected PmcXmlLabel label;
    protected PmcXmlTitle title;
    @XmlElements({
        @XmlElement(name = "address", type = PmcXmlAddress.class),
        @XmlElement(name = "alternatives", type = PmcXmlAlternatives.class),
        @XmlElement(name = "array", type = PmcXmlArray.class),
        @XmlElement(name = "boxed-text", type = PmcXmlBoxedText.class),
        @XmlElement(name = "chem-struct-wrap", type = PmcXmlChemStructWrap.class),
        @XmlElement(name = "fig", type = PmcXmlFig.class),
        @XmlElement(name = "fig-group", type = PmcXmlFigGroup.class),
        @XmlElement(name = "graphic", type = PmcXmlGraphic.class),
        @XmlElement(name = "media", type = PmcXmlMedia.class),
        @XmlElement(name = "preformat", type = PmcXmlPreformat.class),
        @XmlElement(name = "supplementary-material", type = PmcXmlSupplementaryMaterial.class),
        @XmlElement(name = "table-wrap", type = PmcXmlTableWrap.class),
        @XmlElement(name = "table-wrap-group", type = PmcXmlTableWrapGroup.class),
        @XmlElement(name = "disp-formula", type = PmcXmlDispFormula.class),
        @XmlElement(name = "disp-formula-group", type = PmcXmlDispFormulaGroup.class),
        @XmlElement(name = "p", type = PmcXmlP.class),
        @XmlElement(name = "def-list", type = PmcXmlDefList.class),
        @XmlElement(name = "list", type = PmcXmlList.class),
        @XmlElement(name = "tex-math", type = PmcXmlTexMath.class),
        @XmlElement(name = "math", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlMath.class),
        @XmlElement(name = "related-article", type = PmcXmlRelatedArticle.class),
        @XmlElement(name = "related-object", type = PmcXmlRelatedObject.class),
        @XmlElement(name = "disp-quote", type = PmcXmlDispQuote.class),
        @XmlElement(name = "speech", type = PmcXmlSpeech.class),
        @XmlElement(name = "statement", type = PmcXmlStatement.class),
        @XmlElement(name = "verse-group", type = PmcXmlVerseGroup.class)
    })
    protected List<Object> addressesAndAlternativesAndArraies;
    @XmlElement(name = "glossary")
    protected List<PmcXmlGlossary> glossaries;
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
     * Gets the value of the addressesAndAlternativesAndArraies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressesAndAlternativesAndArraies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressesAndAlternativesAndArraies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PmcXmlAddress }
     * {@link PmcXmlAlternatives }
     * {@link PmcXmlArray }
     * {@link PmcXmlBoxedText }
     * {@link PmcXmlChemStructWrap }
     * {@link PmcXmlFig }
     * {@link PmcXmlFigGroup }
     * {@link PmcXmlGraphic }
     * {@link PmcXmlMedia }
     * {@link PmcXmlPreformat }
     * {@link PmcXmlSupplementaryMaterial }
     * {@link PmcXmlTableWrap }
     * {@link PmcXmlTableWrapGroup }
     * {@link PmcXmlDispFormula }
     * {@link PmcXmlDispFormulaGroup }
     * {@link PmcXmlP }
     * {@link PmcXmlDefList }
     * {@link PmcXmlList }
     * {@link PmcXmlTexMath }
     * {@link PmcXmlMath }
     * {@link PmcXmlRelatedArticle }
     * {@link PmcXmlRelatedObject }
     * {@link PmcXmlDispQuote }
     * {@link PmcXmlSpeech }
     * {@link PmcXmlStatement }
     * {@link PmcXmlVerseGroup }
     * 
     * 
     */
    public List<Object> getAddressesAndAlternativesAndArraies() {
        if (addressesAndAlternativesAndArraies == null) {
            addressesAndAlternativesAndArraies = new ArrayList<Object>();
        }
        return this.addressesAndAlternativesAndArraies;
    }

    /**
     * Gets the value of the glossaries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the glossaries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGlossaries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PmcXmlGlossary }
     * 
     * 
     */
    public List<PmcXmlGlossary> getGlossaries() {
        if (glossaries == null) {
            glossaries = new ArrayList<PmcXmlGlossary>();
        }
        return this.glossaries;
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
