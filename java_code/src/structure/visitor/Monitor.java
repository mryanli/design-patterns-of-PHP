package structure.visitor;

public class Monitor implements ComputerPart {

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.vist(this);

	}
	
	@Override
	public void doByVisit() {
		System.out.println("monitor be visited");
		
	}

}
