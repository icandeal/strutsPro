package com.ycf.dao.impl;

import com.ycf.dao.inter.IBaseDAO;
import com.ycf.entity.PageResult;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.jdbc.Work;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by sniper on 16-8-30.
 */
@Component
public class BaseDAO<T, ID extends Serializable> implements IBaseDAO<T, ID> {

    @Autowired
    SessionFactory sessionFactory;
    protected Class<T> entityClass;

    private Session getSession() {
        return this.sessionFactory.getCurrentSession();
    }

    protected Class getEntityClass() {
        if (entityClass == null) {
            entityClass = (Class<T>)((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        }
        return entityClass;
    }

    public void save(T t) {
        this.getSession().save(t);
    }

    public void saveOrUpdate(T t) {
        this.getSession().saveOrUpdate(t);
    }


    public T load(ID id) {
        return (T)this.getSession().load(this.getEntityClass(), id);
    }

    public T get(ID id) {
        return (T)this.getSession().get(this.getEntityClass(), id);
    }

    public boolean contains(T t) {
        return this.getSession().contains(t);
    }

    public void delete(T t) {
        this.getSession().delete(t);
    }

    public void deleteById(ID id) {
        this.getSession().delete(this.get(id));
    }

    public void deleteAll(Collection<T> entities) {
        for(Object entity : entities) {
            this.getSession().delete(entity);
        }
    }

    public void execHql(String hql, Object... values) {
        Query query = this.getSession().createQuery(hql);
        if(values!=null) {
            for(int i = 0; i < values.length; i++) {
                query.setParameter(i, values[i]);
            }
        }
        query.executeUpdate();
    }

    public void execSql(String sql, Object... values) {
        Query query = this.getSession().createSQLQuery(sql);
        if(values!=null) {
            for(int i = 0; i < values.length; i++) {
                query.setParameter(i, values[i]);
            }
        }
        query.executeUpdate();
    }

    public T getByHql(String hql, Object... values) {
        Query query = this.getSession().createQuery(hql);
        if(values!=null) {
            for(int i = 0; i < values.length; i++) {
                query.setParameter(i, values[i]);
            }
        }
        return (T)query.uniqueResult();
    }

    public T getBySql(String sql, Object... values) {
        Query query = this.getSession().createSQLQuery(sql);
        if(values!=null) {
            for(int i = 0; i < values.length; i++) {
                query.setParameter(i, values[i]);
            }
        }
        return (T)query.uniqueResult();
    }

    public List<T> queryHql(String hql, Object... values) {
        Query query = this.getSession().createQuery(hql);
        if(values!=null) {
            for(int i = 0; i < values.length; i++) {
                query.setParameter(i, values[i]);
            }
        }
        return (List<T>)query.list();
    }

    public List<T> querySql(String sql, Object... values) {
        Query query = this.getSession().createSQLQuery(sql);
        if(values!=null) {
            for(int i = 0; i < values.length; i++) {
                query.setParameter(i, values[i]);
            }
        }
        return (List<T>)query.list();
    }

    public PageResult<T> queryHql(String hql, String countHql, int pageNo, int pageSize, Object... values) {
        PageResult<T> result = new PageResult<T>();
        Query query = this.getSession().createQuery(hql);
        if(values != null){
            for(int i = 0; i < values.length; i++) {
                query.setParameter(i, values[i]);
            }
        }
        result.setPageNo(pageNo);
        result.setPageSize(pageSize);

        if(countHql == null) {
            ScrollableResults results = query.scroll();
            results.last();
            result.setTotalCount(results.getRowNumber() + 1);
        }
        else {
            Long count = countByHql(countHql, values);
            result.setTotalCount(count.intValue());
        }

        List<T> resultList = query.setFirstResult((pageNo - 1) * pageSize).setMaxResults(pageSize).list();
        result.setResults(resultList);
        return result;
    }


    public void refresh(T t) {
        this.getSession().refresh(t);
    }

    public void update(T t) {
        this.getSession().update(t);
    }

    public Long countByHql(String hql, Object... values) {
        return null;
    }
}
