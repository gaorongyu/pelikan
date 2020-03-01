package com.fngry.pelikan.log.operation;

import com.fngry.pelikan.log.operation.compare.ComparableIdFetcherRegistry;
import com.fngry.pelikan.log.operation.compare.IComparableIdFetcher;
import com.fngry.pelikan.log.operation.compare.IValueComparator;
import com.fngry.pelikan.log.operation.compare.ValueComparatorRegistry;
import com.fngry.pelikan.log.operation.operator.IOperatorService;
import com.fngry.pelikan.log.operation.operator.OperatorServiceRegistry;
import com.fngry.pelikan.log.operation.value.EntityIdParserRegistry;
import com.fngry.pelikan.log.operation.value.IEntityIdParser;

/**
 * 操作日志配置
 * @author gaorongyu
 */
public class OperationRegistryConfig {

    public void registerOperationLogService(OperationLogService operationLogService) {
        OperationLogServiceRegistry.register(operationLogService);
    }

    public void registerOperatorService(String name, IOperatorService operatorService) {
        OperatorServiceRegistry.register(name, operatorService);
    }

    public void registerValueComparator(String name, IValueComparator comparator) {
        ValueComparatorRegistry.register(name, comparator);
    }

    public void registerEntityIdParser(String name, IEntityIdParser parser) {
        EntityIdParserRegistry.register(name, parser);
    }

    public void registerComparableIdFetcher(Class clazz, IComparableIdFetcher fetcher) {
        ComparableIdFetcherRegistry.register(clazz, fetcher);
    }

}
