/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat, Inc. and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.mobicents.slee.resource.diameter.sh.events.avp.userdata;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import net.java.slee.resource.diameter.sh.events.avp.userdata.Extension;
import net.java.slee.resource.diameter.sh.events.avp.userdata.IFCs;


/**
 * <p>Java class for tIFCs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tIFCs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InitialFilterCriteria" type="{}tInitialFilterCriteria" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Extension" type="{}tExtension" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * @author <a href="mailto:brainslog@gmail.com"> Alexandre Mendonca </a>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tIFCs", propOrder = {
    "initialFilterCriteria",
    "extension",
    "any"
})
public class TIFCs implements IFCs {

    @XmlElement(name = "InitialFilterCriteria")
    protected List<TInitialFilterCriteria> initialFilterCriteria;
    @XmlElement(name = "Extension")
    protected TExtension extension;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.IFCs#getInitialFilterCriteria()
     */
    public List<TInitialFilterCriteria> getInitialFilterCriteria() {
        if (initialFilterCriteria == null) {
            initialFilterCriteria = new ArrayList<TInitialFilterCriteria>();
        }
        return this.initialFilterCriteria;
    }

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.IFCs#getExtension()
     */
    public Extension getExtension() {
        return extension;
    }

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.IFCs#setExtension(org.mobicents.slee.resource.diameter.sh.events.avp.userdata.Extension)
     */
    public void setExtension(Extension value) {
        this.extension = (TExtension) value;
    }

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.IFCs#getAny()
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

}
