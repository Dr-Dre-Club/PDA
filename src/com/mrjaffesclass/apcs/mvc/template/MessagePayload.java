package com.mrjaffesclass.apcs.mvc.template;

/**
 * This is the message payload class.  Instantiate this class when sending
 * strings received from users
 * 
 * @author Roger Jaffe
 * @version 1.0
 */
public class MessagePayload {
  
  private final String text1;
  private final String text2;

  
  /**
   * Class constructor
   * @param _text1
   * 
   */
  public MessagePayload(String _text1) {
    text1 = _text1;
    text2 = null;
  }
  
  public MessagePayload(String _text1, String _text2){
    text1 = _text1;
    text2 = _text2;
  }

  /**
   * Getter method for the 
   * @return text stored in messagePayload
   */
  public String getText1() {
    return text1;
  }
  
  public String getText2() {
      return text2;
  }
}
