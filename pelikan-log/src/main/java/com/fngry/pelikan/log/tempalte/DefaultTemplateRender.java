package com.fngry.pelikan.log.tempalte;

import java.util.Map;

public class DefaultTemplateRender implements TemplateRender {

    @Override
    public String render(String valueExp, Map<String, Object> context) {
        return TemplateUtil.render(valueExp, context);
    }

}
