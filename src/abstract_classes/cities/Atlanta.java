package abstract_classes.cities;
//Atlanta gets a multiplication bonus of twice the growthRate
public class Atlanta extends City {

	public Atlanta(int population, double growthRate) {
		super(population, growthRate);
		// TODO Auto-generated constructor stub
	}

	@Override
	double getAnnualTaxes() {
		double AnnualTaxes = population * growthRate * (2 * growthRate);
		return AnnualTaxes;
	}
}
