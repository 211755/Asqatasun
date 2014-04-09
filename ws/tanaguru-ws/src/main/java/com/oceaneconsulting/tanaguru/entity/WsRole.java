package com.oceaneconsulting.tanaguru.entity;
import org.opens.tanaguru.sdk.entity.Entity;

/**
 * Interface de l'entit� des r�les 
 * @author msobahi
 *
 */
public interface WsRole extends Entity{
	
	/**
	 * Getter du r�le
	 * @return 
	 */
	String getRole();
	
	/**
	 * Setter du r�le  
	 * @param role Le r�le
	 */
	void setRole(String role);
	
	/**
	 * Getter du label du r�le
	 * @return La label du r�le
	 */
	String getLabel();
	
	/**
	 * Setter du label du r�le 
	 * @param label Le label du r�le
	 */
	void setLabel(String label);
	
}