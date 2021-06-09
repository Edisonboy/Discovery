package com.nepxion.discovery.plugin.strategy.sentinel.datasource.entity;

/**
 * <p>Title: Nepxion Discovery</p>
 * <p>Description: Nepxion Discovery</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @version 1.0
 */

import com.nepxion.discovery.plugin.strategy.sentinel.datasource.constant.SentinelStrategyDataSourceConstant;

public enum SentinelStrategyRuleType {
    FLOW(SentinelStrategyDataSourceConstant.SENTINEL_STRATEGY_FLOW_KEY, SentinelStrategyDataSourceConstant.SENTINEL_STRATEGY_FLOW_DESCRIPTION),
    DEGRADE(SentinelStrategyDataSourceConstant.SENTINEL_STRATEGY_DEGRADE_KEY, SentinelStrategyDataSourceConstant.SENTINEL_STRATEGY_DEGRADE_DESCRIPTION),
    AUTHORITY(SentinelStrategyDataSourceConstant.SENTINEL_STRATEGY_AUTHORITY_KEY, SentinelStrategyDataSourceConstant.SENTINEL_STRATEGY_AUTHORITY_DESCRIPTION),
    SYSTEM(SentinelStrategyDataSourceConstant.SENTINEL_STRATEGY_SYSTEM_KEY, SentinelStrategyDataSourceConstant.SENTINEL_STRATEGY_SYSTEM_DESCRIPTION),
    PARAM_FLOW(SentinelStrategyDataSourceConstant.SENTINEL_STRATEGY_PARAM_FLOW_KEY, SentinelStrategyDataSourceConstant.SENTINEL_STRATEGY_PARAM_FLOW_DESCRIPTION);

    private String value;
    private String description;

    private SentinelStrategyRuleType(String value, String description) {
        this.value = value;
        this.description = description;
    }

    public String getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    public static SentinelStrategyRuleType fromString(String value) {
        for (SentinelStrategyRuleType type : SentinelStrategyRuleType.values()) {
            if (type.getValue().equalsIgnoreCase(value)) {
                return type;
            }
        }

        throw new IllegalArgumentException("No matched type with value=" + value);
    }

    @Override
    public String toString() {
        return value;
    }
}