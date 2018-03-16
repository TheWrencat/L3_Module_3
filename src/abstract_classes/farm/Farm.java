package abstract_classes.farm;

import java.util.ArrayList;
import java.util.List;

public class Farm {

	public static void main(String[] args) {
		List<Animal> farm = new ArrayList<>();
		
		farm.add(new Chicken());
		farm.add(new Cow());
		farm.add(new Pig());
		farm.add(new Sheep());
		for(Animal current: farm) {
			System.out.println(current.makeNoise());
		}
	}
	
}
