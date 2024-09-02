/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.mobitel.esms.session;

import java.util.TimerTask;


public class SessionTimer extends TimerTask {
    
    private SessionManager sessionManager;

    public SessionTimer(SessionManager sessionManager) 
    {
        this.sessionManager = sessionManager;
    }

    @Override
    public void run() 
    {
        sessionManager.renewSession();
    }
    
}
