package com.fngry.pelikan.sequence;

/**
 * seq generator
 * @author gaorongyu
 */
public interface SeqGenerator {

    long getNextSequence(Namespace namespace);

    long getNextSequence(String sequenceKey);

}
