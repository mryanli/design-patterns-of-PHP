package structure.visitor;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

	@Override
	public void vist(Computer computer) {
		System.out.println("Displaying Computer.");

	}

	@Override
	public void vist(Keyboard keyboard) {
		System.out.println("Displaying Computer.");

	}

	@Override
	public void vist(Monitor monitor) {
		System.out.println("Displaying Computer.");

	}

	@Override
	public void vist(Mouse mouse) {
		System.out.println("Displaying Computer.");

	}

}
