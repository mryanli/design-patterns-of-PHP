package structure.visitor;

public class Mouse implements ComputerPart {

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.vist(this);

	}
	
	
	@Override
	public void doByVisit() {
		System.out.println("mouse be visited");
	}

}
