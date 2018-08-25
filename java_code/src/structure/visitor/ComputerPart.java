package structure.visitor;

public interface ComputerPart {
	public void accept(ComputerPartVisitor computerPartVisitor);
	
	public void doByVisit();
}
