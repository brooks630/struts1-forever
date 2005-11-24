/*
 * $Header: /home/cvs/jakarta-struts/contrib/struts-el/src/share/org/apache/strutsel/taglib/html/ELSelectTagBeanInfo.java,v 1.3 2003/02/19 03:54:38 dmkarr Exp $
 * $Revision: 1.3 $
 * $Date: 2003/02/19 03:54:38 $
 * ====================================================================
 *
 * The Apache Software License, Version 1.1
 *
 * Copyright (c) 1999-2002 The Apache Software Foundation.  All rights
 * reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the
 *    distribution.
 *
 * 3. The end-user documentation included with the redistribution, if
 *    any, must include the following acknowledgement:
 *       "This product includes software developed by the
 *        Apache Software Foundation (http://www.apache.org/)."
 *    Alternately, this acknowlegement may appear in the software itself,
 *    if and wherever such third-party acknowlegements normally appear.
 *
 * 4. The names "The Jakarta Project", "Struts", and "Apache Software
 *    Foundation" must not be used to endorse or promote products derived
 *    from this software without prior written permission. For written
 *    permission, please contact apache@apache.org.
 *
 * 5. Products derived from this software may not be called "Apache"
 *    nor may "Apache" appear in their names without prior written
 *    permission of the Apache Group.
 *
 * THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED.  IN NO EVENT SHALL THE APACHE SOFTWARE FOUNDATION OR
 * ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF
 * USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
 * OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the Apache Software Foundation.  For more
 * information on the Apache Software Foundation, please see
 * <http://www.apache.org/>.
 *
 */

package org.apache.strutsel.taglib.html;

import java.beans.PropertyDescriptor;
import java.beans.IntrospectionException;
import java.beans.SimpleBeanInfo;

/**
 * This is the <code>BeanInfo</code> descriptor for the
 * <code>org.apache.strutsel.taglib.html.ELSelectTag</code> class.  It is needed
 * to override the default mapping of custom tag attribute names to class
 * attribute names.
 *<p>
 * This is necessary because the base class,
 * <code>org.apache.struts.taglib.html.SelectTag</code> defines some
 * attributes whose type is not <code>java.lang.String</code>, so the subclass
 * needs to define setter methods of a different name, which this class maps
 * to.
 *<p>
 * Unfortunately, if a <code>BeanInfo</code> class needs to be provided to
 * change the mapping of one attribute, it has to specify the mappings of ALL
 * attributes, even if all the others use the expected mappings of "name" to
 * "method".
 */
public class ELSelectTagBeanInfo extends SimpleBeanInfo
{
    public  PropertyDescriptor[] getPropertyDescriptors()
    {
        PropertyDescriptor[]  result   = new PropertyDescriptor[28];

        try {
            result[0] = new PropertyDescriptor("alt", ELSelectTag.class,
                                               null, "setAltExpr");
            result[1] = new PropertyDescriptor("altKey", ELSelectTag.class,
                                               null, "setAltKeyExpr");
            result[2] = new PropertyDescriptor("disabled", ELSelectTag.class,
                                               null, "setDisabledExpr");
            result[3] = new PropertyDescriptor("indexed", ELSelectTag.class,
                                               null, "setIndexedExpr");
            result[4] = new PropertyDescriptor("multiple", ELSelectTag.class,
                                               null, "setMultipleExpr");
            result[5] = new PropertyDescriptor("name", ELSelectTag.class,
                                               null, "setNameExpr");
            result[6] = new PropertyDescriptor("onblur", ELSelectTag.class,
                                               null, "setOnblurExpr");
            result[7] = new PropertyDescriptor("onchange", ELSelectTag.class,
                                               null, "setOnchangeExpr");
            result[8] = new PropertyDescriptor("onclick", ELSelectTag.class,
                                               null, "setOnclickExpr");
            result[9] = new PropertyDescriptor("ondblclick", ELSelectTag.class,
                                               null, "setOndblclickExpr");
            result[10] = new PropertyDescriptor("onfocus", ELSelectTag.class,
                                               null, "setOnfocusExpr");
            result[11] = new PropertyDescriptor("onkeydown", ELSelectTag.class,
                                               null, "setOnkeydownExpr");
            result[12] = new PropertyDescriptor("onkeypress", ELSelectTag.class,
                                               null, "setOnkeypressExpr");
            result[13] = new PropertyDescriptor("onkeyup", ELSelectTag.class,
                                               null, "setOnkeyupExpr");
            result[14] = new PropertyDescriptor("onmousedown",
                                               ELSelectTag.class,
                                               null, "setOnmousedownExpr");
            result[15] = new PropertyDescriptor("onmousemove",
                                               ELSelectTag.class,
                                               null, "setOnmousemoveExpr");
            result[16] = new PropertyDescriptor("onmouseout", ELSelectTag.class,
                                               null, "setOnmouseoutExpr");
            result[17] = new PropertyDescriptor("onmouseover",
                                               ELSelectTag.class,
                                               null, "setOnmouseoverExpr");
            result[18] = new PropertyDescriptor("onmouseup", ELSelectTag.class,
                                               null, "setOnmouseupExpr");
            result[19] = new PropertyDescriptor("property", ELSelectTag.class,
                                               null, "setPropertyExpr");
            result[20] = new PropertyDescriptor("size", ELSelectTag.class,
                                               null, "setSizeExpr");
            result[21] = new PropertyDescriptor("style", ELSelectTag.class,
                                               null, "setStyleExpr");
            result[22] = new PropertyDescriptor("styleClass",
                                               ELSelectTag.class,
                                               null, "setStyleClassExpr");
            result[23] = new PropertyDescriptor("styleId", ELSelectTag.class,
                                               null, "setStyleIdExpr");
            result[24] = new PropertyDescriptor("tabindex", ELSelectTag.class,
                                               null, "setTabindexExpr");
            result[25] = new PropertyDescriptor("title", ELSelectTag.class,
                                               null, "setTitleExpr");
            result[26] = new PropertyDescriptor("titleKey", ELSelectTag.class,
                                               null, "setTitleKeyExpr");
            result[27] = new PropertyDescriptor("value", ELSelectTag.class,
                                               null, "setValueExpr");
        }
        catch (IntrospectionException ex) {
            ex.printStackTrace();
        }
        
        return (result);
    }
}