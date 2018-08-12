package com.fngry.pelikan.log.tempalte;

import java.util.Map;

/**
 * render template
 *
 */
public interface TemplateRender {

    /**
     *
     * render template with context
     *
     * @param valueExp value expression
     * @param context  value context
     * @return
     */
    String render(String valueExp, Map<String, Object> context);

}
