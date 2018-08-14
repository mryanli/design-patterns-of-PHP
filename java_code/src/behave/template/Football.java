package behave.template;

public class Football extends Game {

	@Override
	void initialize() {
		System.out.println("initializing football");
	}

	@Override
	void startPlay() {
		
		System.out.println("start football");

	}

	@Override
	void endPlay() {
		System.out.println("end football");

	}

}
