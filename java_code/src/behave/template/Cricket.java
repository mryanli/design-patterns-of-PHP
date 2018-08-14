package behave.template;

public class Cricket extends Game {
	

	@Override
	void initialize() {
		System.out.println("initializing cricket");
	}

	@Override
	void startPlay() {
		
		System.out.println("start cricket");

	}

	@Override
	void endPlay() {
		System.out.println("end cricket");

	}

}
