package com.fngry.pelikan.sequence;


import com.fngry.pelikan.sequence.exception.SequenceException;

/**
 * 序列接口
 * from taobao tddl-sequence
 */
public interface Sequence {

    /**
     * 取得序列下一个值
     * 
     * @return 返回序列下一个值
     * @throws SequenceException
     */
    long nextValue() throws SequenceException;

    /**
     * 返回size大小后的值，比如针对batch拿到size大小的值，自己内存中顺序分配
     * 
     * @param size
     * @return
     * @throws SequenceException
     */
    long nextValue(int size) throws SequenceException;
}
