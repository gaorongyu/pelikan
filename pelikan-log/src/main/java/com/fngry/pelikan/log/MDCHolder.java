package com.fngry.pelikan.log;

import org.slf4j.MDC;

import java.util.concurrent.Callable;

public class MDCHolder {

    public static final String TRACE_ID = "traceId";

    private static final ThreadLocal<Boolean> holder = new ThreadLocal<>();

    public static <T> T execute(Callable<T> callable) {
        return execute(callable, null);
    }

    public static <T> T execute(Callable<T> callable, String traceId) {
        if (hold()) {
            try {
                return callable.call();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        // todo generate traceId
        String currentTraceId = null;
        MDC.put(TRACE_ID, currentTraceId);
        holder.set(true);

        try {
            return callable.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            MDC.remove(TRACE_ID);
            holder.remove();
        }

    }

    public static boolean hold() {
        Boolean status = holder.get();
        return status != null ? status : false;
    }

}
