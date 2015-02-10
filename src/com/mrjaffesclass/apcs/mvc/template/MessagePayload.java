package com.mrjaffesclass.apcs.mvc.template;

/**
 * This is the message payload class.  Instantiate this class when sending
 * field / value message data for the up/down buttons
 * 
 * @author Roger Jaffe
 * @version 1.0
 */
public class MessagePayload {
  
  private final String fieldText;

  
  /**
   * Class constructor
   * @param _fieldText
   * 
   */
  public MessagePayload(String _fieldText) {
    fieldText = _fieldText;
   
  }

  /**
   * Getter method for the 
   * @return 
   */
  public String getFieldText() {
    return fieldText;
  }
  
}
