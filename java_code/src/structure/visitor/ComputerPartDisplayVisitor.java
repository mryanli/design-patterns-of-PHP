package structure.visitor;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

	@Override
	public void vist(ComputerPart computerPart) {
		computerPart.doByVisit();
	}

}
