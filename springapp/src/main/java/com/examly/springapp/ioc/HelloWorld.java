package com.examly.springapp.ioc;
public class HelloWorld {
    private String message;

    public HelloWorld(){}
    public String getMessage(){
        return message;
    }

    public void setMessage(String message){
        this.message=message;
    }

}
