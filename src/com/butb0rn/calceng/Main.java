package com.butb0rn.calceng;

public class Main {

	public static void main(String[] args) {
		double[] leftvals = {100.0d, 25.0d, 225.0d, 11.0d};
		double[] rightvals = {50.0d, 92.0d, 17.0d, 3.0d};
		char[] opCodes = {'d','a','s','m'};
		double[] results = new double[opCodes.length];
		
		for(int i = 0; i < opCodes.length; i++) {
			if (opCodes[i] == 'a') 
				results[i] = leftvals[i] + rightvals[i];
			else if(opCodes[i] == 's')
				results[i] = leftvals[i] - rightvals[i];
			else if(opCodes[i] == 'd')
				results[i] = rightvals[i] != 0.0d ? leftvals[i] / rightvals[i] : 0.0d;
			else if(opCodes[i] == 'm')
				results[i] = leftvals[i] * rightvals[i];
			else {
				System.out.println("Error - invalid opCode");
				results[i] = 0.0d;
			}
		}
		for(double res: results) {
			System.out.println(res);
		}
		
	}
}
