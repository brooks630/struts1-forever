/*
 * The Apache Software License, Version 1.1
 *
 * Copyright (c) 1999-2003 The Apache Software Foundation.  All rights
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
 *    any, must include the following acknowlegement:
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
package org.apache.struts.taglib.html;

import java.util.Locale;

import javax.servlet.jsp.PageContext;
import junit.framework.Test;
import junit.framework.TestSuite;

import org.apache.cactus.JspTestCase;
import org.apache.struts.Globals;
import org.apache.struts.taglib.SimpleBeanForTesting;

/**
 * Suite of unit tests for the
 * <code>org.apache.struts.taglib.bean.HtmlTag</code> class.
 *
 * @author James Mitchell
 */
public class TestHtmlTag extends JspTestCase {

    /**
     * Defines the testcase name for JUnit.
     *
     * @param theName the testcase's name.
     */
    public TestHtmlTag(String theName) {
        super(theName);
    }

    /**
     * Start the tests.
     *
     * @param theArgs the arguments. Not used
     */
    public static void main(String[] theArgs) {
        junit.awtui.TestRunner.main(new String[] {TestHtmlTag.class.getName()});
    }

    /**
     * @return a test suite (<code>TestSuite</code>) that includes all methods
     *         starting with "test"
     */
    public static Test suite() {
        // All methods starting with "test" will be executed in the test suite.
        return new TestSuite(TestHtmlTag.class);
    }

    private void runMyTest(String whichTest, String locale){
    	pageContext.setAttribute(Globals.LOCALE_KEY, new Locale(locale, locale), PageContext.SESSION_SCOPE);
    	pageContext.setAttribute(Constants.BEAN_KEY, new SimpleBeanForTesting("Test Value"), PageContext.REQUEST_SCOPE);
		request.setAttribute("runTest", whichTest);
        try {
			pageContext.forward("/test/org/apache/struts/taglib/html/TestHtmlTag.jsp");
		}
		catch (Exception e) {
			e.printStackTrace();
			fail("There is a problem that is preventing the tests to continue!");
		}
    }

    /*
     * Testing HtmlTag.
     */
    public void testHtml(){ 
    	runMyTest("testHtml", "");
	}

    public void testHtmlLocale1(){ 
    	runMyTest("testHtmlLocale1", "");
	}

    public void testHtmlLocale2(){ 
    	runMyTest("testHtmlLocale2", "");
	}

    public void testHtmlLocale3(){ 
    	runMyTest("testHtmlLocale3", "");
	}

    public void testHtmlLocale4(){ 
    	runMyTest("testHtmlLocale4", "");
	}

    public void testHtmlLocale5(){ 
    	runMyTest("testHtmlLocale5", "");
	}

    public void testHtmlLocale6(){ 
    	runMyTest("testHtmlLocale6", "");
	}

    public void testHtmlLocale_fr1(){ 
    	runMyTest("testHtmlLocale_fr1", "fr");
	}

    public void testHtmlLocale_fr2(){ 
    	runMyTest("testHtmlLocale_fr2", "fr");
	}

    public void testHtmlLocale_fr3(){ 
    	runMyTest("testHtmlLocale_fr3", "fr");
	}

    public void testHtmlLocale_fr4(){ 
    	runMyTest("testHtmlLocale_fr4", "fr");
	}

    public void testHtmlLocale_fr5(){ 
    	runMyTest("testHtmlLocale_fr5", "fr");
	}

    public void testHtmlLocale_fr6(){ 
    	runMyTest("testHtmlLocale_fr6", "fr");
	}

    public void testHtmlXhtml1(){ 
    	runMyTest("testHtmlXhtml1", "");
	}

    public void testHtmlXhtml2(){ 
    	runMyTest("testHtmlXhtml2", "");
	}

    public void testHtmlXhtml3(){ 
    	runMyTest("testHtmlXhtml3", "");
	}

    public void testHtmlXhtml4(){ 
    	runMyTest("testHtmlXhtml4", "");
	}

    public void testHtmlXhtml5(){ 
    	runMyTest("testHtmlXhtml5", "");
	}

    public void testHtmlXhtml6(){ 
    	runMyTest("testHtmlXhtml6", "");
	}

    public void testHtmlLocaleXhtml1(){ 
    	runMyTest("testHtmlLocaleXhtml1", "");
	}

    public void testHtmlLocaleXhtml2(){ 
    	runMyTest("testHtmlLocaleXhtml2", "");
	}

    public void testHtmlLocaleXhtml3(){ 
    	runMyTest("testHtmlLocaleXhtml3", "");
	}

    public void testHtmlLocaleXhtml_fr1(){ 
    	runMyTest("testHtmlLocaleXhtml_fr1", "fr");
	}

    public void testHtmlLocaleXhtml_fr2(){ 
    	runMyTest("testHtmlLocaleXhtml_fr2", "fr");
	}

    public void testHtmlLocaleXhtml_fr3(){ 
    	runMyTest("testHtmlLocaleXhtml_fr3", "fr");
	}


}
