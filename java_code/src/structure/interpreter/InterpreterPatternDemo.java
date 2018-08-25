package structure.interpreter;

public class InterpreterPatternDemo {

	public static Expression getMaleExpression() {
		Expression robert = new TerminalExpression("robert");
		Expression john = new TerminalExpression("john");
		return new OrExpression(robert, john);
	}

	public static Expression getMarriedWomanExpression() {
		Expression julie = new TerminalExpression("julie");
		Expression married = new TerminalExpression("Married");
		return new AndExpression(julie, married);
	}

	public static void main(String[] args) {
		Expression isMale = getMaleExpression();
		Expression isMarriedWoman = getMarriedWomanExpression();

		System.out.println("john is male?" + isMale.interpret("john"));
		System.out.println("julie is a married women?" + isMarriedWoman.interpret("Married julie"));
	}
}

interface Expression {
	public boolean interpret(String context);
}

class TerminalExpression implements Expression {

	private String data;

	public TerminalExpression(String data) {
		this.data = data;
	}

	@Override
	public boolean interpret(String context) {
		if (context.contains(data)) {
			return true;
		}
		return false;
	}
}

class OrExpression implements Expression {

	private Expression expr1 = null;
	private Expression expr2 = null;

	public OrExpression(Expression expr1, Expression expr2) {
		this.expr1 = expr1;
		this.expr2 = expr2;
	}

	@Override
	public boolean interpret(String context) {
		return expr1.interpret(context) || expr2.interpret(context);
	}
}

class AndExpression implements Expression {
	private Expression expr1 = null;
	private Expression expr2 = null;

	public AndExpression(Expression expr1, Expression expr2) {
		this.expr1 = expr1;
		this.expr2 = expr2;
	}

	@Override
	public boolean interpret(String context) {
		return expr1.interpret(context) && expr2.interpret(context);
	}
}
