package com.ycf.dao.inter;

import com.ycf.entity.PageResult;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * Created by sniper on 16-8-30.
 */
public interface IBaseDAO<T, ID extends Serializable> {

    void save(T t);

    void saveOrUpdate(T t);

    T load(ID id);

    T get(ID id);

    boolean contains(T t);

    void delete(T t);

    void deleteById(ID id);

    void deleteAll(Collection<T> entities);

    void execHql(String hql, Object ...values);

    void execSql(String sql, Object ...values);

    T getByHql(String hql, Object ...values);

    T getBySql(String sql, Object ...values);

    List<T> queryHql(String hql, Object ...values);

    PageResult<T> queryHql(String hql, String countHql, int pageNo, int pageSize, Object... values);

    List<T> querySql(String sql, Object ...values);

    void refresh(T t);

    void update(T t);

    Long countByHql(String hql, Object... values);
}
