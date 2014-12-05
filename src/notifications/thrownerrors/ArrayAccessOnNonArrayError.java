package notifications.thrownerrors;

import notifications.implication.Exists;
import notifications.implication.MustBeSubtype;
import notifications.implication.UnsatisfiedImplicationDiagnostic;
import syntax.ArrayAccess;
import syntax.ArrayType;
import syntax.Expression;
import syntax.Type;

public class ArrayAccessOnNonArrayError extends CompilerDiagnosticBuilder {

	private UnsatisfiedImplicationDiagnostic unsatisfiedImplication;

	public ArrayAccessOnNonArrayError(
			ArrayAccess arrayAccess,
			Expression receiver,
			Type receiverType) {
		this.unsatisfiedImplication = new UnsatisfiedImplicationDiagnostic(
				new Exists(arrayAccess),
				new MustBeSubtype(receiver, new ArrayType(null, null, null)));
	}

}
