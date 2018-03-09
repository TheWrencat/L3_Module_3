package abstract_classes.cities;
//Boston gets a bonus of $0.50 per person
public class Boston extends City {

	public Boston(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double AnnualTaxes = population * growthRate + (0.50 * population);
		return AnnualTaxes;
	}

}
