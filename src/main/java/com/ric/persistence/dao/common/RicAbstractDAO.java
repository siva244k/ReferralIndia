package com.ric.persistence.dao.common;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

@SuppressWarnings("unchecked")
public abstract class RicAbstractDAO<T extends Serializable> implements
		IOperations<T> {

	private Class<T> clazz;

	@Autowired
	private SessionFactory sessionFactory;

	protected final void setClazz(final Class<T> clazzToSet) {
		clazz = clazzToSet;
	}

	protected Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public final void create(final T entity) {
			getCurrentSession().saveOrUpdate(entity);
	}

	@Override
	public final T update(final T entity) {
		return (T) getCurrentSession().merge(entity);
	}

	@Override
	public final List<T> findAll() {
		List<T> list = null;
		if (clazz != null) {
			list = getCurrentSession().createQuery("from " + clazz.getName())
					.list();
		} else {
			// change this to log4j
			System.out
					.println("set the respective class name in the calling dao");
		}
		return list;
	}

	@Override
	public final T findOne(final long id) {
		T t = null;
		if (clazz != null) {
			t = (T) getCurrentSession().get(clazz, id);
		} else {
			// change this to log4j
			System.out
					.println("set the respective class name in the calling dao");
		}
		return t;

	}

	@Override
	public final void delete(final T entity) {
		getCurrentSession().delete(entity);
	}

	@Override
	public final void deleteById(final long entityId) {
		final T entity = findOne(entityId);
		delete(entity);
	}

}
