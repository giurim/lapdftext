//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.07.23 at 10:09:05 AM PDT 
//


package edu.isi.bmkeg.lapdf.pmcXml.mathml;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * <p>Java class for mphantom.type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mphantom.type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.w3.org/1998/Math/MathML}Presentation-expr.class" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;attGroup ref="{http://www.w3.org/1998/Math/MathML}mphantom.attlist"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mphantom.type", propOrder = {
    "misAndMosAndMns"
})
@XmlRootElement(name = "mphantom")
public class PmcXmlMphantom {

    @XmlElementRefs({
        @XmlElementRef(name = "median", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlMedian.class, required = false),
        @XmlElementRef(name = "card", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlCard.class, required = false),
        @XmlElementRef(name = "set", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlSet.class, required = false),
        @XmlElementRef(name = "partialdiff", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlPartialdiff.class, required = false),
        @XmlElementRef(name = "cos", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "merror", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlMerror.class, required = false),
        @XmlElementRef(name = "rationals", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "real", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "condition", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlCondition.class, required = false),
        @XmlElementRef(name = "arccoth", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "declare", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlDeclare.class, required = false),
        @XmlElementRef(name = "maction", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlMaction.class, required = false),
        @XmlElementRef(name = "sech", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "mrow", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlMrow.class, required = false),
        @XmlElementRef(name = "true", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "malignmark", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlMalignmark.class, required = false),
        @XmlElementRef(name = "determinant", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlDeterminant.class, required = false),
        @XmlElementRef(name = "mtable", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlMtable.class, required = false),
        @XmlElementRef(name = "integers", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "csch", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "msqrt", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlMsqrt.class, required = false),
        @XmlElementRef(name = "abs", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "mean", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlMean.class, required = false),
        @XmlElementRef(name = "uplimit", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlUplimit.class, required = false),
        @XmlElementRef(name = "intersect", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlIntersect.class, required = false),
        @XmlElementRef(name = "notprsubset", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlNotprsubset.class, required = false),
        @XmlElementRef(name = "sinh", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "notanumber", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "cartesianproduct", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlCartesianproduct.class, required = false),
        @XmlElementRef(name = "apply", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlApply.class, required = false),
        @XmlElementRef(name = "csymbol", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlCsymbol.class, required = false),
        @XmlElementRef(name = "selector", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlSelector.class, required = false),
        @XmlElementRef(name = "cot", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "cosh", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "notin", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlNotin.class, required = false),
        @XmlElementRef(name = "mfrac", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlMfrac.class, required = false),
        @XmlElementRef(name = "and", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "csc", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "interval", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlInterval.class, required = false),
        @XmlElementRef(name = "min", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "quotient", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "conjugate", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "outerproduct", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlOuterproduct.class, required = false),
        @XmlElementRef(name = "mn", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlMn.class, required = false),
        @XmlElementRef(name = "arccosh", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "lcm", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "naturalnumbers", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "mtext", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlMtext.class, required = false),
        @XmlElementRef(name = "mo", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlMo.class, required = false),
        @XmlElementRef(name = "plus", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "transpose", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlTranspose.class, required = false),
        @XmlElementRef(name = "neq", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "vectorproduct", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlVectorproduct.class, required = false),
        @XmlElementRef(name = "tendsto", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlTendsto.class, required = false),
        @XmlElementRef(name = "approx", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "eulergamma", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "subset", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlSubset.class, required = false),
        @XmlElementRef(name = "times", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "mpadded", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlMpadded.class, required = false),
        @XmlElementRef(name = "mi", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlMi.class, required = false),
        @XmlElementRef(name = "sum", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "arcsin", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "list", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlList.class, required = false),
        @XmlElementRef(name = "leq", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "sin", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "max", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ceiling", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "lt", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "complexes", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "inverse", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlInverse.class, required = false),
        @XmlElementRef(name = "factorial", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "curl", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlCurl.class, required = false),
        @XmlElementRef(name = "scalarproduct", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlScalarproduct.class, required = false),
        @XmlElementRef(name = "or", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "factorof", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "setdiff", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlSetdiff.class, required = false),
        @XmlElementRef(name = "divergence", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlDivergence.class, required = false),
        @XmlElementRef(name = "exp", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "munderover", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlMunderover.class, required = false),
        @XmlElementRef(name = "maligngroup", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlMaligngroup.class, required = false),
        @XmlElementRef(name = "imaginaryi", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "codomain", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "minus", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "gt", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "imaginary", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ci", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlCi.class, required = false),
        @XmlElementRef(name = "sec", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "primes", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "root", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "exists", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "tanh", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "in", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlIn.class, required = false),
        @XmlElementRef(name = "equivalent", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "arcsinh", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "arccot", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "emptyset", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ms", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlMs.class, required = false),
        @XmlElementRef(name = "arccos", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "sdev", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlSdev.class, required = false),
        @XmlElementRef(name = "domainofapplication", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlDomainofapplication.class, required = false),
        @XmlElementRef(name = "lowlimit", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlLowlimit.class, required = false),
        @XmlElementRef(name = "mode", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlMode.class, required = false),
        @XmlElementRef(name = "arccsc", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "divide", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "laplacian", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlLaplacian.class, required = false),
        @XmlElementRef(name = "logbase", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlLogbase.class, required = false),
        @XmlElementRef(name = "limit", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlLimit.class, required = false),
        @XmlElementRef(name = "menclose", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlMenclose.class, required = false),
        @XmlElementRef(name = "arg", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "implies", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "mmultiscripts", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlMmultiscripts.class, required = false),
        @XmlElementRef(name = "arcsech", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "gcd", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "not", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "piecewise", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlPiecewise.class, required = false),
        @XmlElementRef(name = "bvar", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlBvar.class, required = false),
        @XmlElementRef(name = "semantics", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlSemantics.class, required = false),
        @XmlElementRef(name = "mroot", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlMroot.class, required = false),
        @XmlElementRef(name = "munder", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlMunder.class, required = false),
        @XmlElementRef(name = "image", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "exponentiale", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "mover", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlMover.class, required = false),
        @XmlElementRef(name = "degree", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlDegree.class, required = false),
        @XmlElementRef(name = "log", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ln", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "geq", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "moment", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlMoment.class, required = false),
        @XmlElementRef(name = "forall", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "union", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlUnion.class, required = false),
        @XmlElementRef(name = "notsubset", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlNotsubset.class, required = false),
        @XmlElementRef(name = "vector", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlVector.class, required = false),
        @XmlElementRef(name = "rem", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "variance", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlVariance.class, required = false),
        @XmlElementRef(name = "arccsch", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "compose", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "prsubset", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlPrsubset.class, required = false),
        @XmlElementRef(name = "arcsec", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "mstyle", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlMstyle.class, required = false),
        @XmlElementRef(name = "tan", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "cn", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlCn.class, required = false),
        @XmlElementRef(name = "reals", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "false", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "eq", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "msup", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlMsup.class, required = false),
        @XmlElementRef(name = "msub", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlMsub.class, required = false),
        @XmlElementRef(name = "mspace", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlMspace.class, required = false),
        @XmlElementRef(name = "mfenced", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlMfenced.class, required = false),
        @XmlElementRef(name = "arctan", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "msubsup", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlMsubsup.class, required = false),
        @XmlElementRef(name = "matrix", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlMatrix.class, required = false),
        @XmlElementRef(name = "xor", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "momentabout", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlMomentabout.class, required = false),
        @XmlElementRef(name = "product", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "lambda", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlLambda.class, required = false),
        @XmlElementRef(name = "pi", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "grad", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlGrad.class, required = false),
        @XmlElementRef(name = "domain", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "diff", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlDiff.class, required = false),
        @XmlElementRef(name = "int", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlInt.class, required = false),
        @XmlElementRef(name = "power", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "infinity", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "mphantom", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlMphantom.class, required = false),
        @XmlElementRef(name = "coth", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ident", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "floor", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "arctanh", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false)
    })
    protected List<Object> misAndMosAndMns;
    @XmlAttribute(name = "class")
    @XmlSchemaType(name = "NMTOKENS")
    protected List<String> clazzs;
    @XmlAttribute(name = "style")
    protected String style;
    @XmlAttribute(name = "xref")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object xref;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
    @XmlSchemaType(name = "anySimpleType")
    protected String href;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the misAndMosAndMns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the misAndMosAndMns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMisAndMosAndMns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PmcXmlCard }
     * {@link PmcXmlMedian }
     * {@link PmcXmlSet }
     * {@link PmcXmlPartialdiff }
     * {@link JAXBElement }{@code <}{@link PmcXmlElementaryFunctionsType }{@code >}
     * {@link PmcXmlMerror }
     * {@link JAXBElement }{@code <}{@link PmcXmlConstantType }{@code >}
     * {@link JAXBElement }{@code <}{@link PmcXmlArithType }{@code >}
     * {@link PmcXmlCondition }
     * {@link JAXBElement }{@code <}{@link PmcXmlElementaryFunctionsType }{@code >}
     * {@link PmcXmlMaction }
     * {@link PmcXmlDeclare }
     * {@link JAXBElement }{@code <}{@link PmcXmlElementaryFunctionsType }{@code >}
     * {@link JAXBElement }{@code <}{@link PmcXmlConstantType }{@code >}
     * {@link PmcXmlMrow }
     * {@link PmcXmlMalignmark }
     * {@link JAXBElement }{@code <}{@link PmcXmlConstantType }{@code >}
     * {@link PmcXmlMtable }
     * {@link PmcXmlDeterminant }
     * {@link JAXBElement }{@code <}{@link PmcXmlElementaryFunctionsType }{@code >}
     * {@link PmcXmlMsqrt }
     * {@link JAXBElement }{@code <}{@link PmcXmlArithType }{@code >}
     * {@link PmcXmlMean }
     * {@link PmcXmlUplimit }
     * {@link PmcXmlIntersect }
     * {@link PmcXmlNotprsubset }
     * {@link PmcXmlCartesianproduct }
     * {@link JAXBElement }{@code <}{@link PmcXmlConstantType }{@code >}
     * {@link JAXBElement }{@code <}{@link PmcXmlElementaryFunctionsType }{@code >}
     * {@link PmcXmlApply }
     * {@link PmcXmlCsymbol }
     * {@link PmcXmlSelector }
     * {@link JAXBElement }{@code <}{@link PmcXmlElementaryFunctionsType }{@code >}
     * {@link PmcXmlNotin }
     * {@link JAXBElement }{@code <}{@link PmcXmlElementaryFunctionsType }{@code >}
     * {@link PmcXmlMfrac }
     * {@link JAXBElement }{@code <}{@link PmcXmlElementaryFunctionsType }{@code >}
     * {@link JAXBElement }{@code <}{@link PmcXmlElementaryFunctionsType }{@code >}
     * {@link JAXBElement }{@code <}{@link PmcXmlArithType }{@code >}
     * {@link JAXBElement }{@code <}{@link PmcXmlArithType }{@code >}
     * {@link PmcXmlInterval }
     * {@link JAXBElement }{@code <}{@link PmcXmlArithType }{@code >}
     * {@link PmcXmlOuterproduct }
     * {@link PmcXmlMn }
     * {@link JAXBElement }{@code <}{@link PmcXmlElementaryFunctionsType }{@code >}
     * {@link JAXBElement }{@code <}{@link PmcXmlConstantType }{@code >}
     * {@link JAXBElement }{@code <}{@link PmcXmlArithType }{@code >}
     * {@link PmcXmlMo }
     * {@link PmcXmlMtext }
     * {@link JAXBElement }{@code <}{@link PmcXmlArithType }{@code >}
     * {@link PmcXmlTranspose }
     * {@link JAXBElement }{@code <}{@link PmcXmlRelationsType }{@code >}
     * {@link JAXBElement }{@code <}{@link PmcXmlConstantType }{@code >}
     * {@link JAXBElement }{@code <}{@link PmcXmlRelationsType }{@code >}
     * {@link PmcXmlTendsto }
     * {@link PmcXmlVectorproduct }
     * {@link PmcXmlSubset }
     * {@link JAXBElement }{@code <}{@link PmcXmlArithType }{@code >}
     * {@link PmcXmlMpadded }
     * {@link JAXBElement }{@code <}{@link PmcXmlArithType }{@code >}
     * {@link PmcXmlMi }
     * {@link JAXBElement }{@code <}{@link PmcXmlElementaryFunctionsType }{@code >}
     * {@link PmcXmlList }
     * {@link JAXBElement }{@code <}{@link PmcXmlRelationsType }{@code >}
     * {@link JAXBElement }{@code <}{@link PmcXmlElementaryFunctionsType }{@code >}
     * {@link JAXBElement }{@code <}{@link PmcXmlArithType }{@code >}
     * {@link JAXBElement }{@code <}{@link PmcXmlArithType }{@code >}
     * {@link JAXBElement }{@code <}{@link PmcXmlConstantType }{@code >}
     * {@link JAXBElement }{@code <}{@link PmcXmlRelationsType }{@code >}
     * {@link JAXBElement }{@code <}{@link PmcXmlArithType }{@code >}
     * {@link PmcXmlInverse }
     * {@link PmcXmlCurl }
     * {@link PmcXmlScalarproduct }
     * {@link JAXBElement }{@code <}{@link PmcXmlLogicType }{@code >}
     * {@link JAXBElement }{@code <}{@link PmcXmlRelationsType }{@code >}
     * {@link PmcXmlSetdiff }
     * {@link PmcXmlDivergence }
     * {@link PmcXmlMunderover }
     * {@link JAXBElement }{@code <}{@link PmcXmlElementaryFunctionsType }{@code >}
     * {@link PmcXmlMaligngroup }
     * {@link JAXBElement }{@code <}{@link PmcXmlConstantType }{@code >}
     * {@link JAXBElement }{@code <}{@link PmcXmlFunctionsType }{@code >}
     * {@link JAXBElement }{@code <}{@link PmcXmlArithType }{@code >}
     * {@link JAXBElement }{@code <}{@link PmcXmlRelationsType }{@code >}
     * {@link JAXBElement }{@code <}{@link PmcXmlArithType }{@code >}
     * {@link PmcXmlCi }
     * {@link JAXBElement }{@code <}{@link PmcXmlConstantType }{@code >}
     * {@link JAXBElement }{@code <}{@link PmcXmlElementaryFunctionsType }{@code >}
     * {@link JAXBElement }{@code <}{@link PmcXmlArithType }{@code >}
     * {@link JAXBElement }{@code <}{@link PmcXmlLogicType }{@code >}
     * {@link JAXBElement }{@code <}{@link PmcXmlElementaryFunctionsType }{@code >}
     * {@link PmcXmlIn }
     * {@link JAXBElement }{@code <}{@link PmcXmlRelationsType }{@code >}
     * {@link JAXBElement }{@code <}{@link PmcXmlElementaryFunctionsType }{@code >}
     * {@link JAXBElement }{@code <}{@link PmcXmlElementaryFunctionsType }{@code >}
     * {@link JAXBElement }{@code <}{@link PmcXmlConstantType }{@code >}
     * {@link PmcXmlMs }
     * {@link JAXBElement }{@code <}{@link PmcXmlElementaryFunctionsType }{@code >}
     * {@link PmcXmlSdev }
     * {@link PmcXmlDomainofapplication }
     * {@link PmcXmlLowlimit }
     * {@link JAXBElement }{@code <}{@link PmcXmlArithType }{@code >}
     * {@link JAXBElement }{@code <}{@link PmcXmlElementaryFunctionsType }{@code >}
     * {@link PmcXmlMode }
     * {@link PmcXmlLogbase }
     * {@link PmcXmlLaplacian }
     * {@link PmcXmlMenclose }
     * {@link PmcXmlLimit }
     * {@link JAXBElement }{@code <}{@link PmcXmlArithType }{@code >}
     * {@link JAXBElement }{@code <}{@link PmcXmlLogicType }{@code >}
     * {@link PmcXmlMmultiscripts }
     * {@link JAXBElement }{@code <}{@link PmcXmlElementaryFunctionsType }{@code >}
     * {@link JAXBElement }{@code <}{@link PmcXmlLogicType }{@code >}
     * {@link JAXBElement }{@code <}{@link PmcXmlArithType }{@code >}
     * {@link PmcXmlPiecewise }
     * {@link PmcXmlBvar }
     * {@link PmcXmlSemantics }
     * {@link PmcXmlMroot }
     * {@link JAXBElement }{@code <}{@link PmcXmlConstantType }{@code >}
     * {@link JAXBElement }{@code <}{@link PmcXmlFunctionsType }{@code >}
     * {@link PmcXmlMunder }
     * {@link PmcXmlMover }
     * {@link PmcXmlDegree }
     * {@link JAXBElement }{@code <}{@link PmcXmlElementaryFunctionsType }{@code >}
     * {@link JAXBElement }{@code <}{@link PmcXmlRelationsType }{@code >}
     * {@link JAXBElement }{@code <}{@link PmcXmlElementaryFunctionsType }{@code >}
     * {@link PmcXmlMoment }
     * {@link JAXBElement }{@code <}{@link PmcXmlLogicType }{@code >}
     * {@link PmcXmlNotsubset }
     * {@link PmcXmlUnion }
     * {@link JAXBElement }{@code <}{@link PmcXmlArithType }{@code >}
     * {@link PmcXmlVector }
     * {@link PmcXmlVariance }
     * {@link PmcXmlPrsubset }
     * {@link JAXBElement }{@code <}{@link PmcXmlFunctionsType }{@code >}
     * {@link JAXBElement }{@code <}{@link PmcXmlElementaryFunctionsType }{@code >}
     * {@link PmcXmlMstyle }
     * {@link JAXBElement }{@code <}{@link PmcXmlElementaryFunctionsType }{@code >}
     * {@link JAXBElement }{@code <}{@link PmcXmlElementaryFunctionsType }{@code >}
     * {@link JAXBElement }{@code <}{@link PmcXmlRelationsType }{@code >}
     * {@link JAXBElement }{@code <}{@link PmcXmlConstantType }{@code >}
     * {@link JAXBElement }{@code <}{@link PmcXmlConstantType }{@code >}
     * {@link PmcXmlCn }
     * {@link PmcXmlMsup }
     * {@link PmcXmlMsub }
     * {@link PmcXmlMspace }
     * {@link PmcXmlMfenced }
     * {@link PmcXmlMsubsup }
     * {@link JAXBElement }{@code <}{@link PmcXmlElementaryFunctionsType }{@code >}
     * {@link JAXBElement }{@code <}{@link PmcXmlLogicType }{@code >}
     * {@link PmcXmlMatrix }
     * {@link PmcXmlMomentabout }
     * {@link JAXBElement }{@code <}{@link PmcXmlArithType }{@code >}
     * {@link JAXBElement }{@code <}{@link PmcXmlConstantType }{@code >}
     * {@link PmcXmlLambda }
     * {@link JAXBElement }{@code <}{@link PmcXmlFunctionsType }{@code >}
     * {@link PmcXmlGrad }
     * {@link JAXBElement }{@code <}{@link PmcXmlArithType }{@code >}
     * {@link PmcXmlInt }
     * {@link PmcXmlDiff }
     * {@link JAXBElement }{@code <}{@link PmcXmlConstantType }{@code >}
     * {@link PmcXmlMphantom }
     * {@link JAXBElement }{@code <}{@link PmcXmlFunctionsType }{@code >}
     * {@link JAXBElement }{@code <}{@link PmcXmlElementaryFunctionsType }{@code >}
     * {@link JAXBElement }{@code <}{@link PmcXmlArithType }{@code >}
     * {@link JAXBElement }{@code <}{@link PmcXmlElementaryFunctionsType }{@code >}
     * 
     * 
     */
    public List<Object> getMisAndMosAndMns() {
        if (misAndMosAndMns == null) {
            misAndMosAndMns = new ArrayList<Object>();
        }
        return this.misAndMosAndMns;
    }

    /**
     * Gets the value of the clazzs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clazzs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClazzs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getClazzs() {
        if (clazzs == null) {
            clazzs = new ArrayList<String>();
        }
        return this.clazzs;
    }

    /**
     * Gets the value of the style property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyle() {
        return style;
    }

    /**
     * Sets the value of the style property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyle(String value) {
        this.style = value;
    }

    /**
     * Gets the value of the xref property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getXref() {
        return xref;
    }

    /**
     * Sets the value of the xref property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setXref(Object value) {
        this.xref = value;
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
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
