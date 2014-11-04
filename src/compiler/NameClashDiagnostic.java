

package compiler;

import syntax.Id;

public class NameClashDiagnostic extends RichDiagnostic {

	private Id firstDeclaration;
	private Id secondDeclaration;

	@Override
	public String getText() {
		return this.toString();
	}

	@Override
	public String toString() {
		return "Name Clash between " + firstDeclaration + " and " + secondDeclaration +
				"at "+ firstDeclaration.getPos().describe() +
				" and " + secondDeclaration.getPos().describe();
	}

	@Override
	public Position getPos() {
		return this.firstDeclaration.getPos();
	}

	public NameClashDiagnostic(Id firstDeclaration, Id secondDeclaration) {
		this.firstDeclaration = firstDeclaration;
		this.secondDeclaration = secondDeclaration;
	}
}
