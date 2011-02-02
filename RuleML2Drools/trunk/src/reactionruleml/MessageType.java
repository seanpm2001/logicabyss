//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.3-hudson-jaxb-ri-2.2-70- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.02 at 03:31:08 PM MEZ 
//


package reactionruleml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Message.type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Message.type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.ruleml.org/1.0/xsd}Message.content"/>
 *       &lt;attGroup ref="{http://www.ruleml.org/1.0/xsd}Message.attlist"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Message.type", propOrder = {
    "content"
})
public class MessageType {

    @XmlElementRefs({
        @XmlElementRef(name = "Entails", namespace = "http://www.ruleml.org/1.0/xsd", type = JAXBElement.class),
        @XmlElementRef(name = "And", namespace = "http://www.ruleml.org/1.0/xsd", type = JAXBElement.class),
        @XmlElementRef(name = "Ind", namespace = "http://www.ruleml.org/1.0/xsd", type = JAXBElement.class),
        @XmlElementRef(name = "protocol", namespace = "http://www.ruleml.org/1.0/xsd", type = JAXBElement.class),
        @XmlElementRef(name = "qualification", namespace = "http://www.ruleml.org/1.0/xsd", type = JAXBElement.class),
        @XmlElementRef(name = "Neg", namespace = "http://www.ruleml.org/1.0/xsd", type = JAXBElement.class),
        @XmlElementRef(name = "label", namespace = "http://www.ruleml.org/1.0/xsd", type = JAXBElement.class),
        @XmlElementRef(name = "Atom", namespace = "http://www.ruleml.org/1.0/xsd", type = JAXBElement.class),
        @XmlElementRef(name = "Plex", namespace = "http://www.ruleml.org/1.0/xsd", type = JAXBElement.class),
        @XmlElementRef(name = "Var", namespace = "http://www.ruleml.org/1.0/xsd", type = JAXBElement.class),
        @XmlElementRef(name = "sender", namespace = "http://www.ruleml.org/1.0/xsd", type = JAXBElement.class),
        @XmlElementRef(name = "Equal", namespace = "http://www.ruleml.org/1.0/xsd", type = JAXBElement.class),
        @XmlElementRef(name = "Or", namespace = "http://www.ruleml.org/1.0/xsd", type = JAXBElement.class),
        @XmlElementRef(name = "scope", namespace = "http://www.ruleml.org/1.0/xsd", type = JAXBElement.class),
        @XmlElementRef(name = "content", namespace = "http://www.ruleml.org/1.0/xsd", type = JAXBElement.class),
        @XmlElementRef(name = "receiver", namespace = "http://www.ruleml.org/1.0/xsd", type = JAXBElement.class),
        @XmlElementRef(name = "oid", namespace = "http://www.ruleml.org/1.0/xsd", type = JAXBElement.class),
        @XmlElementRef(name = "Rulebase", namespace = "http://www.ruleml.org/1.0/xsd", type = JAXBElement.class),
        @XmlElementRef(name = "Naf", namespace = "http://www.ruleml.org/1.0/xsd", type = JAXBElement.class),
        @XmlElementRef(name = "Expr", namespace = "http://www.ruleml.org/1.0/xsd", type = JAXBElement.class),
        @XmlElementRef(name = "Exists", namespace = "http://www.ruleml.org/1.0/xsd", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> content;
    @XmlAttribute(name = "mode")
    protected String mode;
    @XmlAttribute(name = "directive", required = true)
    protected String directive;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Ind" is used by two different parts of a schema. See: 
     * line 57 of http://svn.codehaus.org/logicabyss/RuleML2Drools/trunk/resources/rrml/modules/message_module.xsd
     * line 50 of http://svn.codehaus.org/logicabyss/RuleML2Drools/trunk/resources/rrml/modules/message_module.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
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
     * {@link JAXBElement }{@code <}{@link AndQueryType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntailsType }{@code >}
     * {@link JAXBElement }{@code <}{@link ProtocolType }{@code >}
     * {@link JAXBElement }{@code <}{@link IndType }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link AtomType }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link NegType }{@code >}
     * {@link JAXBElement }{@code <}{@link VarType }{@code >}
     * {@link JAXBElement }{@code <}{@link PlexType }{@code >}
     * {@link JAXBElement }{@code <}{@link SenderType }{@code >}
     * {@link JAXBElement }{@code <}{@link OrQueryType }{@code >}
     * {@link JAXBElement }{@code <}{@link EqualType }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link ContentType }{@code >}
     * {@link JAXBElement }{@code <}{@link RulebaseType }{@code >}
     * {@link JAXBElement }{@code <}{@link OidType }{@code >}
     * {@link JAXBElement }{@code <}{@link SenderType }{@code >}
     * {@link JAXBElement }{@code <}{@link NafType }{@code >}
     * {@link JAXBElement }{@code <}{@link ExprType }{@code >}
     * {@link JAXBElement }{@code <}{@link ExistsType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<?>>();
        }
        return this.content;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMode() {
        if (mode == null) {
            return "inbound";
        } else {
            return mode;
        }
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMode(String value) {
        this.mode = value;
    }

    /**
     * Gets the value of the directive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirective() {
        return directive;
    }

    /**
     * Sets the value of the directive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirective(String value) {
        this.directive = value;
    }

}
