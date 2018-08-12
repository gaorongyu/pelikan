package com.fngry.pelikan.sequence.boot;

import com.fngry.pelikan.sequence.SeqGenerator;
import com.fngry.pelikan.sequence.impl.DefaultSeqGenerator;
import com.fngry.pelikan.sequence.impl.DefaultSequenceDao;

import javax.sql.DataSource;

// for starter
//@Configuration
public class SequenceConfiguration {

//    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
//    @Autowired
    private DataSource dataSource;

//    @Bean
    public SeqGenerator seqGenerator() {
        return new DefaultSeqGenerator();
    }

//    @Bean
    public DefaultSequenceDao sequenceDao() {
        DefaultSequenceDao defaultSequenceDao = new DefaultSequenceDao();
        defaultSequenceDao.setDataSource(dataSource);

        return defaultSequenceDao;
    }

}
