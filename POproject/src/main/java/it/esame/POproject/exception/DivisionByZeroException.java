package it.esame.POproject.exception;

public class DivisionByZeroException extends Exception {

/** Eccezione che viene lanciata nel caso venga fatta una divisione per zero
	 * 
	 */
	private static final long serialVersionUID = 1L;


public DivisionByZeroException (String message) { 
	
	super(message); 
	
}
		

}
