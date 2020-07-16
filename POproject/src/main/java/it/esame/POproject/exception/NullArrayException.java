package it.esame.POproject.exception;

public class NullArrayException extends Exception {

	/** Eccezione nel caso l'array considerato sia nullo
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public NullArrayException(String message) {
	
		super (message);
		
	}

}
