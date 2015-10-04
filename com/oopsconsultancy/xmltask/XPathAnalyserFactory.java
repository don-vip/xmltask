package com.oopsconsultancy.xmltask;

/**
 * builds a XPathAnalyser.
 * 
 * @author <a href="mailto:brian@oopsconsultancy.com">Brian Agnew</a>
 * @version $Id: XPathAnalyserFactory.java,v 1.6 2009/09/14 17:18:50 bagnew Exp $
 */
public class XPathAnalyserFactory {

  public static XPathAnalyser getAnalyser() throws Exception {
    return (XPathAnalyser)Class.forName("com.oopsconsultancy.xmltask.jdk15.XPathAnalyser15").newInstance();
  }
}
