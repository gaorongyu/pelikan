package com.fngry.pelikan.log.operation.compare;

import com.fngry.pelikan.log.ILogEntity;

/**
 * 实体比较接口
 * @author gaorongyu
 */
public interface IValueComparator {

    /**
     * 对比差异
     * @param obj 实体对象
     * @param another 实体对象
     * @return 差异描述
     */
    String compareDifference(ILogEntity obj, ILogEntity another);

}
