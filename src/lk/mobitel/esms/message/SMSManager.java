/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.mobitel.esms.message;

import java.util.List;
import lk.mobitel.esms.session.NullSessionException;
import lk.mobitel.esms.session.SessionManager;
import wsdl.EnterpriseSMSImplService;
import wsdl.EnterpriseSMSWS;
import wsdl.Session;
import wsdl.SmsMessage;
import wsdl.SmsMessageMultiLang;


public class SMSManager {
    
        public int sendMessage(SmsMessage message) throws NullSessionException 
    {
        Session session = SessionManager.getInstance().getSession();
        int result = 0;
        
        try 
        { 
            // Call Web Service Operation
            EnterpriseSMSImplService service = new EnterpriseSMSImplService();
            EnterpriseSMSWS port = service.getEnterpriseSMSImplPort();
            // TODO process result here
            result = port.sendMessages(session, message);
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
    
    public int sendMessagesMultiLang(SmsMessageMultiLang message) throws NullSessionException 
    {
        Session session = SessionManager.getInstance().getSession();
        int result = 0;
        
        try 
        {
            // Call Web Service Operation
            EnterpriseSMSImplService service = new EnterpriseSMSImplService();
            EnterpriseSMSWS port = service.getEnterpriseSMSImplPort();
            // TODO process result here
            result = port.sendMessagesMultiLang(session, message);
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
    
    public List<SmsMessage> getMessagesFromShortcode(String shortcode) throws NullSessionException 
    {
        Session session = SessionManager.getInstance().getSession();
        java.util.List<SmsMessage> result = null;
        
        try 
        { 
            // Call Web Service Operation
            EnterpriseSMSImplService service = new EnterpriseSMSImplService();
            EnterpriseSMSWS port = service.getEnterpriseSMSImplPort();
            // TODO process result here
            result = port.getMessagesFromShortcode(session, shortcode);
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
    
    
    public List<SmsMessage> getMessagesFromLongNumber(String longNumber) throws NullSessionException 
    {
        Session session = SessionManager.getInstance().getSession();
        java.util.List<SmsMessage> result = null;

        try 
        { 
            // Call Web Service Operation
            EnterpriseSMSImplService service = new EnterpriseSMSImplService();
            EnterpriseSMSWS port = service.getEnterpriseSMSImplPort();
            // TODO process result here
            result = port.getMessagesFromLongNumber(session, longNumber);
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
	
    public List<SmsMessage> getDeliveryReports(String alias) throws NullSessionException 
    {
        Session session = SessionManager.getInstance().getSession();
        java.util.List<SmsMessage> result = null;

        try 
        { 
            // Call Web Service Operation
            EnterpriseSMSImplService service = new EnterpriseSMSImplService();
            EnterpriseSMSWS port = service.getEnterpriseSMSImplPort();
            // TODO process result here
            result = port.getDeliveryReports(session,alias);
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
