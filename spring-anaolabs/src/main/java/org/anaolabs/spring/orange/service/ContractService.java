/**
 * 
 */
package org.anaolabs.spring.orange.service;

import org.springframework.stereotype.Component;

/**
 * @author SDSB3717
 *
 */
@Component
public class ContractService implements GenericService {

	/* (non-Javadoc)
	 * @see org.anaolabs.orange.spring.service.GenericService#getName()
	 */
	public String getName() {
		return this.getClass().getSimpleName();
	}

}
