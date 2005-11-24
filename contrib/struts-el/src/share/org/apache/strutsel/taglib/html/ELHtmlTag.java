/*
 * $Header: /home/cvs/jakarta-struts/contrib/struts-el/src/share/org/apache/strutsel/taglib/html/ELHtmlTag.java,v 1.5 2003/02/19 03:52:49 dmkarr Exp $
 * $Revision: 1.5 $
 * $Date: 2003/02/19 03:52:49 $
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

import org.apache.struts.taglib.html.HtmlTag;
import javax.servlet.jsp.JspException;
import org.apache.strutsel.taglib.utils.EvalHelper;
import org.apache.taglibs.standard.tag.common.core.NullAttributeException;

/**
 * Renders an HTML <html> element with appropriate language attributes if
 * there is a current Locale available in the user's session.
 *<p>
 * This class is a subclass of the class
 * <code>org.apache.struts.taglib.html.HtmlTag</code> which provides most of
 * the described functionality.  This subclass allows all attribute values to
 * be specified as expressions utilizing the JavaServer Pages Standard Library
 * expression language.
 *
 * @author David M. Karr
 * @version $Revision: 1.5 $
 */
public class ELHtmlTag extends HtmlTag {

    /**
     * Instance variable mapped to "locale" tag attribute.
     * (Mapping set in associated BeanInfo class.)
     */
    private String localeExpr;
    /**
     * Instance variable mapped to "xhtml" tag attribute.
     * (Mapping set in associated BeanInfo class.)
     */
    private String xhtmlExpr;

    /**
     * Getter method for "locale" tag attribute.
     * (Mapping set in associated BeanInfo class.)
     */
    public String getLocaleExpr() { return (localeExpr); }
    /**
     * Getter method for "xhtml" tag attribute.
     * (Mapping set in associated BeanInfo class.)
     */
    public String getXhtmlExpr() { return (xhtmlExpr); }

    /**
     * Setter method for "locale" tag attribute.
     * (Mapping set in associated BeanInfo class.)
     */
    public void setLocaleExpr(String localeExpr) { this.localeExpr = localeExpr; }
    /**
     * Setter method for "xhtml" tag attribute.
     * (Mapping set in associated BeanInfo class.)
     */
    public void setXhtmlExpr(String xhtmlExpr) { this.xhtmlExpr = xhtmlExpr; }

    /**
     * Resets attribute values for tag reuse.
     */
    public void release()
    {
        super.release();
        setLocaleExpr(null);
        setXhtmlExpr(null);
    }
    
    /**
     * Process the start tag.
     *
     * @exception JspException if a JSP exception has occurred
     */
    public int doStartTag() throws JspException {
        evaluateExpressions();
        return (super.doStartTag());
    }

    /**
     * Evaluates and returns a single attribute value, given the attribute
     * name, attribute value, and attribute type.  It uses the
     * <code>EvalHelper</code> class to interface to
     * <code>ExpressionUtil.evalNotNull</code> to do the actual evaluation, and
     * it passes to this the name of the current tag, the <code>this</code>
     * pointer, and the current pageContext.
     *
     * @param attrName attribute name being evaluated
     * @param attrValue String value of attribute to be evaluated using EL
     * @param attrType Required resulting type of attribute value
     * @exception NullAttributeException if either the <code>attrValue</code>
     * was null, or the resulting evaluated value was null.
     * @return Resulting attribute value
     */
    private Object   evalAttr(String   attrName,
                              String   attrValue,
                              Class    attrType)
        throws JspException, NullAttributeException
    {
        return (EvalHelper.eval("html", attrName, attrValue, attrType,
                                this, pageContext));
    }

    /**
     * Processes all attribute values which use the JSTL expression evaluation
     * engine to determine their values.  If any evaluation fails with a
     * <code>NullAttributeException</code> it will just use <code>null</code>
     * as the value.
     *
     * @exception JspException if a JSP exception has occurred
     */
    private void evaluateExpressions() throws JspException {
        try {
            setLocale(((Boolean) evalAttr("locale", getLocaleExpr(),
                                          Boolean.class)).
                      booleanValue());
        } catch (NullAttributeException ex) {
        }

        try {
            setXhtml(((Boolean) evalAttr("xhtml", getXhtmlExpr(),
                                         Boolean.class)).
                     booleanValue());
        } catch (NullAttributeException ex) {
        }
    }
}