package model.exceptions;

// Exceção personalizada
public class DomainException extends RuntimeException{ // Não é obrigado a tratar no código fonte
	// Valor padrão
	private static final long serialVersionUID = 1L;

	// DomainException é o nome dado para a exceção
	public DomainException(String msg) {
		super(msg);
	}

}
