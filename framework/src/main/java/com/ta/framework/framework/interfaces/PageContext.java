package com.ta.framework.framework.interfaces;

import java.util.List;

/**
 * 
 * @author gentjan kolicaj
 *
 */
public interface PageContext<I,O> {

    public abstract List<O> preConstruct(I... inputs) throws Exception;

    public abstract List<O> postConstruct(I... inputs) throws Exception;


}
