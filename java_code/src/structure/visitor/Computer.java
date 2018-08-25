package structure.visitor;

import java.util.List;

public class Computer implements ComputerPart {
	
	ComputerPart[] parts;
	
	public Computer () {
		parts = new ComputerPart[] {new Keyboard(),new Monitor(),new Mouse()};
	}
	
	@Override
	public void doByVisit() {
		System.out.println("computer is visted");
		
	}

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		for (ComputerPart part:parts ) {
			part.accept(computerPartVisitor);
		}
		computerPartVisitor.vist(this);
	}

}
