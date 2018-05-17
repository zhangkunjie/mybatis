package com.mybatis;

/**
 * Created by kunjie.zhang on 2018/5/17.
 */
public interface BaseDao<T> {

    public T getById(Integer id);
}
