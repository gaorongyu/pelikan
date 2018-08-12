package com.fngry.pelikan.sequence.impl;

import com.fngry.pelikan.sequence.Namespace;
import com.fngry.pelikan.sequence.SeqGenerator;
import com.fngry.pelikan.sequence.Sequence;

import java.util.HashMap;
import java.util.Map;

/**
 * 默认序列生成器
 * @author gaorongyu
 */
public class DefaultSeqGenerator implements SeqGenerator {

    private Map<String, DefaultSequence> sequenceMap = new HashMap<>();

    private DefaultSequenceDao sequenceDao;

    @Override
    public long getNextSequence(String sequenceKey) {
        Sequence sequence = sequenceMap.get(sequenceKey);
        if (sequence != null) {
            return sequence.nextValue();
        } else {
            DefaultSequence defaultSequence = new DefaultSequence();
            defaultSequence.setName(sequenceKey);
            defaultSequence.setSequenceDao(sequenceDao);

            DefaultSequence putSequence = sequenceMap.putIfAbsent(sequenceKey, defaultSequence);
            if (putSequence != null) {
                defaultSequence = putSequence;
            }
            return defaultSequence.nextValue();
        }
    }

    @Override
    public long getNextSequence(Namespace namespace) {
        return getNextSequence(namespace.name());
    }

    public void setSequenceDao(DefaultSequenceDao sequenceDao) {
        this.sequenceDao = sequenceDao;
    }
}
