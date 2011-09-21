/** 
 * 2008
 * Please use according to the LGPL license 
 * @author: Stefan Braicu
 */
package com.braicu.jcm.layout;

import java.io.IOException;
import java.io.OutputStream;

import javax.swing.JTextArea;

import com.braicu.jcm.utils.Settings;

public class JTextAreaOutputStream extends OutputStream
{
  private JTextArea ta;
  
  public JTextAreaOutputStream(JTextArea ta)
  {
    this.ta=ta;
  }
    
  
  public void write (byte b)
  {
    if (Settings.isDebugMode())
      ta.append (String.valueOf ((char) b));
  }

  public void write (String s)
  {
    if (Settings.isDebugMode())
      ta.append (s);
  }

  public void write (Object o)
  {
    if (Settings.isDebugMode())    
      ta.append (o.toString());
  }
  
  
  public void write(int b) throws IOException {
    if (Settings.isDebugMode())
      ta.append (String.valueOf ((char) b));  

  }

  public JTextArea getTextArea() {
    return ta;
  }
} 
