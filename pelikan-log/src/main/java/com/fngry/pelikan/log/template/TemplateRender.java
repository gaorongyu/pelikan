package com.fngry.pelikan.log.template;

import java.util.Map;

/**
 *
 * render template. render template for log context
 *
 * default realization: DefaultTemplateRender use jdk reflect util
 * can also use spi:
 *      first define realization class implements TemplateRender
 *      then add file com.fngry.pelikan.log.template.TemplateRender
 *      in which specifics the realization class
 *      under directory resources/META-INF/services/
 *
 * @author gaorongyu
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

    /**
     * log content separator
     *      eg , | ;
     * @return
     */
    String getSeparator();

}
