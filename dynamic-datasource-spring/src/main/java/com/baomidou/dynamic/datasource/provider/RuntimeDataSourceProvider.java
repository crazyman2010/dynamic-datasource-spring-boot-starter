package com.baomidou.dynamic.datasource.provider;

import javax.sql.DataSource;

public interface RuntimeDataSourceProvider {
    /**
     * 实时获取数据源
     *
     * @param key 数据源名称
     */
    DataSource getDataSource(String key);
}
