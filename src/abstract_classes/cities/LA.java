package abstract_classes.cities;

//Los Angeles gets a multiplication bonus of half the growthRate
public class LA extends City {

	public LA(int population, double growthRate) {
		super(population, growthRate);
		// TODO Auto-generated constructor stub
	}

	@Override
	double getAnnualTaxes() {
		double AnnualTaxes = population * growthRate * (.50 * growthRate);
		return AnnualTaxes;
	}
}
