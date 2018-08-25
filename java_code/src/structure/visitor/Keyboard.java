package structure.visitor;

public class Keyboard implements ComputerPart {

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.vist(this);
	}
	
	@Override
	public void doByVisit() {
		System.out.println("keyboard is visited");
		
	}

}
