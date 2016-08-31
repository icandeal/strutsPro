package com.ycf.controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by sniper on 16-8-31.
 */
public class BaseAction  extends ActionSupport {

    protected ActionContext getContext(){
        return ActionContext.getContext();
    }
}
