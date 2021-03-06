package com.fngry.pelikan.log.operation;

/**
 * 操作日志服务注册
 * @author gaorongyu
 */
public class OperationLogServiceRegistry {

    private static OperationLogService instance;

    public static void register(OperationLogService operationLogService) {
        OperationLogServiceRegistry.instance = operationLogService;
    }

    public static OperationLogService getInstance() {
        return OperationLogServiceRegistry.instance;
    }

}
