package com.tcs;

/**
 * Hello world!
 *
 */
public class App 
{
    String str=null;
    public static void main( String[] args )
    {
        System.out.println( "Hello- This is app.java" );
    }

    public void setMessage(String msg){
        this.msg=msg;
   
   
   //BUG-1 partially fixed
    public String getMessage(String str){
      System.out.pritln("Get Message");
        return str.toLowercase();
    }
}
