package com.ta.framework.framework.interfaces;
/**
 * 
 * @author gentjan kolicaj
 *
 */
public interface ActionContext {

    public abstract void preAction() throws Exception;

    public abstract void postAction() throws Exception;
}
