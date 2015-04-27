/**
 * Anaolabs R&D 
 *
 * Copyright (c) Anaolabs
 */
package org.anaolabs.jpa.daos.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.anaolabs.jpa.daos.GenericDao;
import org.springframework.stereotype.Repository;


/**
 * GenericJpaDao.java
 *
 * (Add your comments here...)
 *
 * @author Akamanouche
 *
 */
@Repository
public abstract class GenericJpaDao<ENTITY, PK> implements GenericDao<ENTITY, PK> {

	@PersistenceContext(unitName = "jpa-anaolabs-smell")
	public EntityManager em;
	
	protected Class<ENTITY> type;

	/**
     * TRICK :
     * Helps to avoid using {@code @SuppressWarnings({"unchecked"})} when casting to a generic type.
     * (see: http://stackoverflow.com/questions/509076/how-do-i-address-unchecked-cast-warnings/509230#509230)
     */
    @SuppressWarnings({"unchecked"})
    public static <T> T uncheckedCast(Object obj) {
        return (T) obj;
    }
	
	@Override
	public void flush() {
		em.flush();
	}

	@Override
	public void persist(ENTITY item) {
		em.persist(item);
	}

	@Override
	public void merge(ENTITY item) {
		em.merge(item);
	}

	@Override
	public ENTITY find(PK pk) {
		return em.find(type, pk);
	}

	@Override
	public void remove(ENTITY entity) {
		em.remove(entity);
	}
	
}
