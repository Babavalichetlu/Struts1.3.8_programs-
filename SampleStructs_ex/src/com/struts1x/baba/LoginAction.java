package com.struts1x.baba;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author babavalichetlu
 */
public class LoginAction extends org.apache.struts.action.Action {

	 private final static String SUCCESS = "success";
	    private final static String FAILURE = "failure";
	     
	    public ActionForward execute(ActionMapping mapping, ActionForm form,
	            HttpServletRequest request, HttpServletResponse response)
	            throws Exception {
	        LoginForm loginForm = (LoginForm) form;
	        if (loginForm.getUserName().equals(loginForm.getPassword())) {
	            return mapping.findForward(SUCCESS);
	        } else {
	            return mapping.findForward(FAILURE);
	        }
	    }
	}