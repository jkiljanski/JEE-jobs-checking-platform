package pl.mu.training.competirors;

import javax.inject.Inject;
import pl.mu.training.competirors.persist.CompetitorDAO;

public class CompetitorService {

	private final CompetitorDAO competitorDAO;

	@Inject
	public CompetitorService(final CompetitorDAO competitorDAO) {
		this.competitorDAO = competitorDAO;
	}

	public Competitor registerNewCompetitor(Competitor competitor) {
		generateAndAddToken(competitor);
		competitorDAO.save(competitor);
	}

	private void generateAndAddToken(final Competitor competitor) {

	}

}
