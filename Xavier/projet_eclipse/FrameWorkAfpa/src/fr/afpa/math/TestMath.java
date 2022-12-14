package fr.afpa.math;

//import static java.lang.Math.*;
import javax.swing.JOptionPane;

import static fr.afpa.math.Math.factorielleFor;
import static fr.afpa.math.Math.factorielleWhile;

import java.math.BigDecimal;

import static fr.afpa.math.Math.facto;


import static fr.afpa.math.Math.dollarToEuro;
import static fr.afpa.math.Math.euroToDollar;


/**
 * @author 77011-05-10 Ratiba tests Unitairse des métodes : récursivité et par
 *         une boucle FOR et une boucle While les testes prennent plusieurs
 *         valeurs avec les methodes de test
 *
 *         factorielleTestZero(); factorielleTest2();
 *         factorielleTestMoinsSept();
 *         
 *         
 *          euroToDollarTest1();
 *			euroToDollarTest2();
 *			dollarToEuroTestUn();
 *			dollarToEuroTestDeux();
 *
 */

  

public class TestMath {
	
	

	public static void main(String[] args) {
		
		
		
						///////************************//////////
						///////// TEST UNITAIRES        ////////
						///////**********************///////////

					

				factorielleTestZero();
				factorielleTest2();
				factorielleTestMoinsSept();
				
				
				
    			euroToDollarTest1();
//				euroToDollarTest2();
				dollarToEuroTestUn();
				euroToDollarToEuroTestDeux();
		
		

	}

	///////////////////////////////////////////////
	//////////// factorielleTestZero() ////////////
	//////////////////////////////////////////////

	public static void factorielleTestZero() {

		if (facto(0) == 1) {

			System.out.println(" factorielleTestZero() : Test OK");
		} else {
			System.err.println(" : Test NOK : La factorielle de zero vaut 1 ");
		}

	}

	///////////////////////////////////////////////
	//////////// factorielleTest2() //////////////
	//////////////////////////////////////////////

	public static void factorielleTest2() {

		System.out.println("   factorielleTest2() :Pas tres précis, on ne sais pas quel test échoué ");
		if (facto(0) == 1 && facto(1) == 1 && facto(3) == 6) {

			System.out.println("factorielleTest2() : Test OK");
		} else {

			System.err.println(" factorielleTest2() : Test NOK : Le factorielleTest2 à échoué ! ");

		}

	}

	////////////////////////////////////////////////////
	//////////// factorielleTestMoinsSept() ////////////
	///////////////////////////////////////////////////

	public static void factorielleTestMoinsSept() {
		try {
			
			facto(-7);
			System.err.println(" Test negatif ");
		}
		catch(IllegalArgumentException   e) {
			System.out.println(" factorielleTestMoinsSept() : Test OK " + e.getMessage());
		}
		catch (Exception e) {
			System.out.println("factorielleTestMoinsSept() : Test NOK " +e.getMessage());
		}
		
//		if (facto(-7) == -1) {
//
//			System.out.println(" factorielleTestMoinsSept() : Test OK ");
//		} else {
//
//			System.out.println("factorielleTestMoinsSept() : Test NOK : La factorielle de -7 retourne -1 ");
//
//		}

	}
	
	
	
						///////************************//////////
						///////// TEST UNITAIRES        ////////
						///////**********************///////////
	
	
	
					 /*  		euroToDollarTest1();-------
					  *			euroToDollarTest2();-------
					  *			dollarToEuroTestUn();-------
					  *			dollarToEuroTestDeux();-----------
					  */
	
	
					public static void euroToDollarTest1() {
						  BigDecimal bg1;
						  BigDecimal res1;
						   
						  bg1 = new BigDecimal("10");
					      
						  res1= euroToDollar(bg1);
						  
						
						if (res1.equals(new BigDecimal("11.87"))) {

							System.out.println(" euroToDollarTest1() : Test OK");
						} else {
							System.err.println(" : Test NOK 1 : La conversion ne vaut pas 11.87 ");
						}
						
						
						
					}
			/////////////////////////////////////////////////////////		
					
					public static void euroToDollarTest2(){
						
						
						
						
					}
					
					///////////////////////////////////////////////
					
					public static void dollarToEuroTestUn() {
						
							BigDecimal bg1, bg2;
							BigDecimal res1, res2;
						   
						  bg1 = new BigDecimal("10");
					      
						  res1= dollarToEuro(bg1);
						
						if (res1.equals(new BigDecimal("11.87"))) {

							System.out.println(" dollarToEuroTestUn() : Test OK");
						} else {
							System.err.println(" : Test NOK UN : La conversion ne vaut pas 11.87 ");
						}
						
						
					}
					
					
					///////////////////////////////////////
					
					public static void euroToDollarToEuroTestDeux() {
						
						BigDecimal bg1;
						BigDecimal res1;
					   
						bg1 = new BigDecimal("11.87");
					      
						res1= dollarToEuro(euroToDollar(bg1));
						
						if (res1==new BigDecimal("10")) {

							System.out.println(" euroToDollarToEuroTestDeux() : Test OK");
						} else {
							System.err.println(" : Test NOK UN : La conversion euros to dollars to euros ne vaut pas 10.00 ");
						}
						
						
					}
					
	

}
	