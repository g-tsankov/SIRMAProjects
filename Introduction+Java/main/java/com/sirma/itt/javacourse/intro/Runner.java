package com.sirma.itt.javacourse.intro;

import java.util.logging.Logger;

import org.slf4j.LoggerFactory;


public class Runner {
		private static final org.slf4j.Logger LOGGER =  LoggerFactory.getLogger(Runner.class);
		public static void main(String[] args) {
			GDC a = new GDC();
			int result=a.calc(535215, 516126);
			String resultString = new String();
			resultString=Integer.toString(result);
			LOGGER.info("The Greatest Common Divisor between the numbers is:"+resultString);
			
		}
	}