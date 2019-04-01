package com.lf.commom.exception;

public interface ExceptionInterface {
  public Integer getCode();
  
  public String  getMessage(); 
  
  public ExceptionInterface setMeaasge(String message);
}
