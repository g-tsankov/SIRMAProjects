/**
 * this class is used for calculating the 
 *	Greatest Common Divisor. The algorythm
 *	used is pretty simple. You take the two 
 *	variables and subtract the smaller variable
 *	from the bigger variable. Do this until
 *	both variables are equal. This is the
 *	greatest common divisor between the two numbers.
 */

package com.sirma.itt.javacourse.intro;

/**
 * The class is used to calculate the Greatest Common Divisor. It contains the
 * method calculate, in which we calculate the Greatest Common Divisor.The
 * algorythm used is: while both numbers are not equal subtract the less from
 * the bigger and assign the result to the bigger one
 * 
 * @author Georgi Tsankov
 */
public class GreatestCommonDivisor {

	/**
	 * this is the method that calculates the Greatest Common Divisor. First, it
	 * checks if both passed variables are zero.If one or both are its clear
	 * that 0 is the Greatest Common Divisor. The while loop checks if both
	 * varibles are equal. If they are not,it subtracts the bigger number from
	 * the smaller using resultVariable as a temporary variable. This loop will
	 * be done until both variables are equal. After that resultVariable takes
	 * the value of one of the two variables we subtracted and is passed as a
	 * result to the Runner class.
	 * 
	 * resultVariable is used as a temporary variable within the loop,
	 * eventually taking the value of the Greatest Common Divisor when the loop
	 * is finished.
	 * 
	 * @param originalFirstVariable
	 *            the first variable passed from main
	 * @param originalSecondVariable
	 *            the second variable passed from main
	 * @return resultVariable passed as a end result, when both variables are
	 *         equal (aka when we have found the Greatest Common Divisor between
	 *         the initial values)
	 */
	public int calculate(final int originalFirstVariable, final int originalSecondVariable) {
		/*
		 * firstVariable and secondVariable are local variables that are used
		 * for the calculations.
		 */
		int firstVariable = originalFirstVariable;
		int secondVariable = originalSecondVariable;
		int resultVariable;
		if ((firstVariable == 0) || (secondVariable == 0)) {
			resultVariable = 0;
			return resultVariable;
		}

		while (firstVariable != secondVariable) {
			if (firstVariable > secondVariable) {
				int resultVariable1 = firstVariable - secondVariable;
				firstVariable = resultVariable1;
			} else {
				resultVariable = secondVariable - firstVariable;
				secondVariable = resultVariable;
			}
		}

		resultVariable = firstVariable;

		return resultVariable;
	}
}
