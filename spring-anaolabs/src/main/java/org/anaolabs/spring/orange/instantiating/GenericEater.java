/**
 * 
 */
package org.anaolabs.spring.orange.instantiating;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SDSB3717
 *
 */
public abstract class GenericEater<E> {
	
	/** inner cache for items to be written **/
	protected List<E> cache = null;

	public GenericEater() {
		super();
		System.out.println("in GenericEater CONSTRUCTOR");
		cache = new ArrayList<E>();
	}
	
	public void load(List<E> items) {
		
		for (E item : items) {
			cache.add(item);
		}
	}
}
