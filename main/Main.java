package main;

/**
 * @author Stephen
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Loading Paragade...");
		
		if (data.Data.firstTime) {
			Setup setup = new Setup();
				setup.initialize();
		} else {
			return;
		}
	}
}
