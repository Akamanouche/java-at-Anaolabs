/**
 * Anaolabs R&D 
 *
 * Copyright (c) Anaolabs
 */

package org.anaolabs.jpa.daos.impl;

import java.util.List;

import javax.persistence.Query;

import org.anaolabs.jpa.entities.Domain;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * DomainJpaDao.java
 *
 * (Add your comments here...)
 *
 * @author Akamanouche
 *
 */

public class DomainJpaDao extends GenericJpaDao<Domain, Long> {
	
	protected static final Logger logger = LoggerFactory.getLogger(DomainJpaDao.class);

	/* All NamedQuerie(s) */
	private final String FIND_ALL = "SELECT d FROM Domain d"; 
	
	@Override
	public List<Domain> findAll() {
		logger.debug("in findAll() method");
		Query hql = em.createQuery(FIND_ALL, Domain.class);
		hql.setHint("org.hibernate.cacheable", true);
		return uncheckedCast(hql.getResultList());
	}

}
