/**
 * 
 */
package guru.springframework.webapp.repo;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.webapp.model.Recipe;

/**
 * @author a.b.viswanathan
 *
 */
public interface RecipeRepo extends CrudRepository<Recipe, Long> {

	
}
