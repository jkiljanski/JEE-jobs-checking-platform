package pl.mu.training.competirors.persist;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import pl.mu.training.competirors.Competitor;

public class CompetitorDAO {

	@PersistenceContext
	private EntityManager entityManager;


	public void save(Competitor competitor) {
		entityManager.merge(competitor);
	}

}
