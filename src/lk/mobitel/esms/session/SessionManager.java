/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.mobitel.esms.session;

import java.util.Timer;
import java.util.TimerTask;
import javax.xml.ws.Holder;
import wsdl.EnterpriseSMSImplService;
import wsdl.EnterpriseSMSWS;
import wsdl.Session;
import wsdl.User;


public class SessionManager {
    
            private static SessionManager sessionMgr = null;
	private Session session = null;
	private Timer timer;
	private TimerTask sessionTimer;
    
    public static SessionManager getInstance() {
	if(sessionMgr == null) {
            sessionMgr = new SessionManager();
	}
		
            return sessionMgr;
    }
    
    private static Session createSession(User user) {
		Session session = null;
		try { // Call Web Service Operation
			EnterpriseSMSImplService service = new EnterpriseSMSImplService();
			EnterpriseSMSWS port = service.getEnterpriseSMSImplPort();
			// TODO process result here
			session = port.createSession(user);
		} catch (Exception ex) {
		// TODO handle custom exceptions here
		} finally {
			return session;
		}
    }
    
    private static void closeSession(Session session) {
		try { // Call Web Service Operation
			EnterpriseSMSImplService service = new EnterpriseSMSImplService();
			EnterpriseSMSWS port = service.getEnterpriseSMSImplPort();
			port.closeSession(session);
		} catch (Exception ex) {
		// TODO handle custom exceptions here
		}
    }
    
    public boolean isSession() {
		if(session == null)
			return false;
		else
			return isSession_1(session);
    }
	
    public void renewSession() {
		session = renewSession_1(session);
	//	timer.schedule(sessionTimer, session.getExpiryDate().toGregorianCalendar().getTime());
    }
    
    public Session getSession() throws NullSessionException {
		if(session == null)
			throw new NullSessionException();
		else
			return session;
    }
    
    private static Boolean isSession_1(Session session) {
		Boolean result = false;
                Holder<String> status = new Holder<String>();
		try { // Call Web Service Operation
			EnterpriseSMSImplService service = new EnterpriseSMSImplService();
			EnterpriseSMSWS port = service.getEnterpriseSMSImplPort();
			// TODO process result here
			result = port.isSession(session,status);
		} catch (Exception ex) {
		// TODO handle custom exceptions here
		} finally {
			return result;
		}
    }
    
    private static Session renewSession_1(Session session) {
		Session result = null;

		try { // Call Web Service Operation
                        Holder<String> status = new Holder<String>();

			EnterpriseSMSImplService service = new EnterpriseSMSImplService();
			EnterpriseSMSWS port = service.getEnterpriseSMSImplPort();
			// TODO process result here
			result = port.renewSession(session,status);
		} catch (Exception ex) {
		// TODO handle custom exceptions here
		} finally {
			return result;
		}
    }
        
    
    public void login(User user) {
	session = createSession(user);
		
        if(timer == null)			
            timer = new Timer();
		
        sessionTimer = new SessionTimer(this);
	//timer.schedule(sessionTimer, session.getExpiryDate().toGregorianCalendar().getTime());
    }
    
    public void logout() {
		closeSession(session);
		session = null;
		sessionTimer.cancel();
		timer.purge();
//		System.out.println("cancelling timer task : " + sessionTimer.cancel());
//		System.out.println("No. of tasks cancelled : " + timer.purge());
    }
	
    public void exit() {
	timer.cancel();
	
    }  
    
    
}
