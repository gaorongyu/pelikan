package com.fngry.pelikan.id;

/**
 *
 * seq generator, possible realization:
 *
 * add dependency
 *     <groupId>com.fngry.pelikan</groupId>
 ×     <artifactId>pelikan-sequence</artifactId>
 *
 * add class
 * @Compenent
 * public class DefaultSeqGenerator implements MKIDSeqGenerator {
 *
 *      // can use DefaultSeqGenerator or other realization
 *      @Autowired
 *      SeqGenerator seqGenerator;
 *
 *      long getNextSequence(ModelCode modelCode, String table) {
 *          return seqGenerator.getNextSequence(modelCode.code + "_" + table);
 *      }
 *
 * }
 *
 * @author gaorongyu
 *
 */
public interface MKIDSeqGenerator {

    long getNextSequence(ModelCode modelCode, String table);

}
