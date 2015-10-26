package problem.newclient;

import problem.library.DataGenerator;
import problem.library.IFilter;
import problem.model.IData;

public class DataProcessingApp {

	public static void main(String[] args) {
		IFilter filter = new PrimeFilter();
		DataGenerator generator = new DataGenerator(1, 20, filter);
		
		for(IData d: generator) {
			System.out.format("[%d] %s%n", d.getId(), d.getContent());
		}
	}
}
