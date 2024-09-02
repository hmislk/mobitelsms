/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.mobitel.esms.session;


public class NullSessionException extends Exception{
    
      public NullSessionException() 
    {
        super("The session has not been created.");
    }
    
}
