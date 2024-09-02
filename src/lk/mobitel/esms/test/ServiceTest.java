/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.mobitel.esms.test;

import wsdl.EnterpriseSMSImplService;
import wsdl.EnterpriseSMSWS;
import wsdl.User;


public class ServiceTest {
    
 

    public String testService(User user)
    {
        String result = null;
        try 
        { 
            // Call Web Service Operation
            EnterpriseSMSImplService service = new EnterpriseSMSImplService();
            EnterpriseSMSWS port = service.getEnterpriseSMSImplPort();
            // TODO process result here
            result = port.serviceTest(user);
        } 
        catch (Exception ex) 
        {
            // TODO handle custom exceptions here
        } 
        finally 
        {
            return result;
        }
    }
    
}
