/**
 * Anaolabs R&D 
 *
 * Copyright (c) Anaolabs
 */
package org.anaolabs.jpa.daos;

import java.util.List;

import org.springframework.dao.DataAccessException;

/**
 * GenericDao.java
 *
 * (Add your comments here...)
 *
 * @author Akamanouche
 *
 */
public interface GenericDao<ENTITY,PK> {
	
	/**
	 * Load a persistent object with specified id, return null if it does not
	 * 
	 * @param id
	 * @return
	 */
	public ENTITY find(PK id);
	
	/**
	 * Synchronise entityManager objects in database
	 * 
	 * @throws DataAccessException
	 */
	public void flush();
	
	/**
	 * persist an object in database
	 * 
	 * @param o
	 *            the persistent object to be persisted
	 * @throws DataAccessException
	 */
	public void persist(ENTITY item);

	
	/**
	 * merge an object in database
	 * 
	 * @param o
	 * @throws DataAccessException
	 */
	public void merge(ENTITY item);

	
	/**
	 * Remove an given entity
	 * 
	 * @param e An entity to remove
	 */
	public void remove(ENTITY e);
	
	/**
	 * load all persistent objects specified by DAO component
	 * 
	 * @return List list of persistent objects
	 */
	public List<ENTITY> findAll();

}
