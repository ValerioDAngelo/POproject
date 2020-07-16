package it.esame.POproject.data;

import it.esame.POproject.exception.DivisionByZeroException;

/** Interfaccia che descrive statistiche generiche
 *  da applicare ai dati
 *
 */

public interface Stats {

/** Il metodo CalcStats() è stato pensato per richiamare tutti gli altri, 
 *  ovvero i metodi che calcolano le statistiche (min, max)
 * @throws DivisionByZeroException 
 * 
 */
		
void CalcStats() throws DivisionByZeroException;


/** Il metodo CalcMin() calcola il minimo del dato selezionato.
 * @throws DivisionByZeroException 
 *  
 */


String CalcMin() throws DivisionByZeroException;


/** Il metodo CalcMax() calcola il massimo del dato selezionato.
 * @throws DivisionByZeroException 
 * 
 * 
 */


String CalcMax() throws DivisionByZeroException;

}
