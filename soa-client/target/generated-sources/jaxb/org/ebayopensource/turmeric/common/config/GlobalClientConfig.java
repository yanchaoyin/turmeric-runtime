//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.08.11 at 04:38:10 AM PDT 
//


package org.ebayopensource.turmeric.common.config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalClientConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalClientConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="monitor-config" type="{http://www.ebayopensource.org/turmeric/common/config}MonitorConfig" minOccurs="0"/>
 *         &lt;element name="local-binding-thread-pool" type="{http://www.ebayopensource.org/turmeric/common/config}ThreadPoolConfig" minOccurs="0"/>
 *         &lt;element name="client-config-groups" type="{http://www.ebayopensource.org/turmeric/common/config}ClientConfigGroups" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalClientConfig", propOrder = {
    "monitorConfig",
    "localBindingThreadPool",
    "clientConfigGroups"
})
public class GlobalClientConfig {

    @XmlElement(name = "monitor-config")
    protected MonitorConfig monitorConfig;
    @XmlElement(name = "local-binding-thread-pool")
    protected ThreadPoolConfig localBindingThreadPool;
    @XmlElement(name = "client-config-groups")
    protected ClientConfigGroups clientConfigGroups;

    /**
     * Gets the value of the monitorConfig property.
     * 
     * @return
     *     possible object is
     *     {@link MonitorConfig }
     *     
     */
    public MonitorConfig getMonitorConfig() {
        return monitorConfig;
    }

    /**
     * Sets the value of the monitorConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitorConfig }
     *     
     */
    public void setMonitorConfig(MonitorConfig value) {
        this.monitorConfig = value;
    }

    /**
     * Gets the value of the localBindingThreadPool property.
     * 
     * @return
     *     possible object is
     *     {@link ThreadPoolConfig }
     *     
     */
    public ThreadPoolConfig getLocalBindingThreadPool() {
        return localBindingThreadPool;
    }

    /**
     * Sets the value of the localBindingThreadPool property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThreadPoolConfig }
     *     
     */
    public void setLocalBindingThreadPool(ThreadPoolConfig value) {
        this.localBindingThreadPool = value;
    }

    /**
     * Gets the value of the clientConfigGroups property.
     * 
     * @return
     *     possible object is
     *     {@link ClientConfigGroups }
     *     
     */
    public ClientConfigGroups getClientConfigGroups() {
        return clientConfigGroups;
    }

    /**
     * Sets the value of the clientConfigGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientConfigGroups }
     *     
     */
    public void setClientConfigGroups(ClientConfigGroups value) {
        this.clientConfigGroups = value;
    }

}