/**
 * 
 */
package guru.springframework.webapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author a.b.viswanathan
 *
 */
@Entity
public class UnitofMeasure {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String discription;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUom() {
		return discription;
	}
	public void setUom(String discription) {
		this.discription = discription;
	}

	
	
	
}
