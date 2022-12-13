package nttdata.persistence;

import java.io.Serializable;

import javax.persistence.MappedSuperclass;


/**
 * Abstract entity class
 * 
 * @author Samuel Calderón González
 *
 */
@MappedSuperclass
public abstract class AbstractEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
}
