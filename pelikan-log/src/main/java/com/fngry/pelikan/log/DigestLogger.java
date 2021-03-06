package com.fngry.pelikan.log;

import com.fngry.pelikan.log.template.TemplateRenderManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class  DigestLogger {

    private final Logger logger;

    private final String[] template;

    public DigestLogger(Logger logger, String[] template) {
        this.logger = logger;
        this.template = template;
    }

    /**
     * need app set logger with digest.name in logback.xml
     *
     * @param name
     * @param value
     * @return
     */
    public static DigestLogger newLogger(String name, String... value) {
        Logger logger = LoggerFactory.getLogger("digest." + name);

        if (value == null || value.length == 0) {
            return new DigestLogger(logger, null);
        }

        return new DigestLogger(logger, value);
    }

    private static String createTemplate(String[] value) {
        StringBuffer templateDisplay = new StringBuffer();
        String separator = TemplateRenderManager.getRender().getSeparator();

        for (String exp : value) {
            templateDisplay.append(exp).append(separator);
        }
        return templateDisplay.toString();
    }

    public void log(Map<String, Object> context, boolean succeeded, long startTime, long endTime) {
        logger.info(renderTemplate(context, succeeded, startTime, endTime));
    }

    private String renderTemplate(Map<String, Object> context, boolean succeeded, long startTime, long endTime) {
        StringBuffer logContent = new StringBuffer();

        String separator = TemplateRenderManager.getRender().getSeparator();

        logContent.append(succeeded ? "Y" : "N").append(separator);
        logContent.append(startTime).append(separator);
        logContent.append(endTime).append(separator);

        String expressionValue = TemplateRenderManager.getRender().render(createTemplate(template), context);
        logContent.append(expressionValue);

        return logContent.toString();
    }


}
