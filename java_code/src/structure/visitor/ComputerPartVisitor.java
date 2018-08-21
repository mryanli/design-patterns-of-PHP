package structure.visitor;


public interface ComputerPartVisitor {
	public void vist(Computer computer); 
	public void vist(Keyboard keyboard); 
	public void vist(Monitor monitor); 
	public void vist(Mouse mouse); 
}
