package model.exceptions;

// Exce��o personalizada
public class DomainException extends RuntimeException{ // N�o � obrigado a tratar no c�digo fonte
	// Valor padr�o
	private static final long serialVersionUID = 1L;

	// DomainException � o nome dado para a exce��o
	public DomainException(String msg) {
		super(msg);
	}

}
