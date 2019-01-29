package com.ta.framework.framework.interfaces;

import java.util.List;

/**
 * 
 * @author gentjan kolicaj
 *
 */
public interface ActionContext<I,O> {

    public abstract List<O> preAction(I... inputs) throws Exception;

    public abstract List<O> postAction(I... inputs) throws Exception;
}
