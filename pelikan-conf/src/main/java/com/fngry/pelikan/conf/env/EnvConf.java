package com.fngry.pelikan.conf.env;

import java.util.function.Consumer;

/**
 * environment configuration
 * @author gaorongyu
 */
public interface EnvConf {

    enum ENV {
        UNKNOWN,
        DAILY,
        PRE_PRODUCT,
        PRODUCT
    }

    ENV get();

    boolean isProProduct();

    boolean isProduct();

    /**
     * get config value from config center
     * @param groupId cluster tag
     * @param configItem config key
     * @return
     */
    String get(String groupId, String configItem);

    /**
     * listen config change
     * @param groupId cluster tag
     * @param configItem config key
     * @param consumer config change processor
     */
    void listen(String groupId, String configItem, Consumer consumer);

}
