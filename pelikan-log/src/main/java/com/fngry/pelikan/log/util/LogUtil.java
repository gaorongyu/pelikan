package com.fngry.pelikan.log.util;

import org.slf4j.Logger;
import org.slf4j.helpers.MessageFormatter;

/**
 *
 * provide log utils
 *
 * @author gaorongyu
 */
public class LogUtil {

    /**
     *
     * eg. formatMessage("modify order success, userId:{}, orderNo:{}", "U001", "A001")
     *
     * @param format message format
     * @param args   parameters
     * @return
     */
    public static String formatMessage(String format, Object... args) {
        return MessageFormatter.arrayFormat(format, args).getMessage();
    }

    public static void debug(Logger logger, String message) {
        if (logger.isDebugEnabled()) {
            logger.debug(logMessage(message));
        }
    }
    public static void debug(Logger logger, String message, Object... args) {
        if (logger.isDebugEnabled()) {
            logger.debug(logMessage(message, args));
        }
    }

    public static void info(Logger logger, String message) {
        if (logger.isInfoEnabled()) {
            logger.info(logMessage(message));
        }
    }
    public static void info(Logger logger, String message, Object... args) {
        if (logger.isInfoEnabled()) {
            logger.info(logMessage(message, args));
        }
    }

    public static void warn(Logger logger, String message) {
        if (logger.isWarnEnabled()) {
            logger.warn(logMessage(message));
        }
    }
    public static void warn(Logger logger, String message, Object... args) {
        if (logger.isWarnEnabled()) {
            logger.warn(logMessage(message, args));
        }
    }

    public static void error(Logger logger, String message) {
        if (logger.isErrorEnabled()) {
            logger.error(logMessage(message));
        }
    }
    public static void error(Logger logger, String message, Object... args) {
        if (logger.isErrorEnabled()) {
            logger.error(logMessage(message, args));
        }
    }

    private static String logMessage(String message, Object... args) {
        return buildTraceInfo().append(formatMessage(message, args)).toString();
    }

    private static String logMessage(String message) {
        return buildTraceInfo().append(message).toString();
    }

    private static StringBuffer buildTraceInfo() {
        StringBuffer msg = new StringBuffer();
        // todo add trace info for this request

        return msg;
    }

}
