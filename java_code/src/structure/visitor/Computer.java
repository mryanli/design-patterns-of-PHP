package structure.visitor;

import java.util.List;

public class Computer implements ComputerPart {
	
	ComputerPart[] parts;
	
	public Computer () {
		parts = new ComputerPart[] {new Keyboard(),new Monitor(),new Mouse()};
	}

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		for (ComputerPart part:parts ) {
			part.accept(computerPartVisitor);
		}
		computerPartVisitor.vist(this);
	}

}
