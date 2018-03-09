package abstract_classes.cities;
//San Diego gets a flat bonus of $1,000,000 for being the best city ever.
//annual taxes can be calculated by multiplying the population by the growthRate.
public class SanDiego extends City {

	public SanDiego(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double AnnualTaxes = population * growthRate + 1000000;
		return AnnualTaxes;
	}

	

}
