package syntax;

import compiler.Position;
import compiler.RichDiagnostic;

public class TypeError extends RichDiagnostic {

	public TypeError(Expression lhs,
			VariableDeclaration lhsDecl, Expression rhs,
			VariableDeclaration rhsDecl,
			Expression expr) {
		// TODO Auto-generated constructor stub
	}

	public TypeError(Expression lhs,
			VariableDeclaration lhsDecl, Expression rhs,
			Expression expr) {
		// for when, e.g., rhs is a literal
		// TODO Auto-generated constructor stub
	}


	
	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Position getPos() {
		// TODO Auto-generated method stub
		return null;
	}

}
