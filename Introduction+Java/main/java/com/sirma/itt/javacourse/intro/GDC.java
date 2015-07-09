package com.sirma.itt.javacourse.intro;
public class GDC {

	int calc (int a,  int b){
		int c=0;
		
		while (a!=b){
			while(a>b){
				c=a-b;
				a=c;
			}
			while(b>a){
				c=b-a;
				b=c	;	
			}
		}
		
		return c;
	}
}


