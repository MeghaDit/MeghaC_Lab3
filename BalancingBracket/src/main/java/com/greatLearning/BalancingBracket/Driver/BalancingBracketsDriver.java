package com.greatLearning.BalancingBracket.Driver;

import java.util.Stack;

import com.greatLearning.BalancingBracket.Service.CheckBalancedBracket;

public class BalancingBracketsDriver {

	public static void main(String[] args) {
		CheckBalancedBracket checkBalanced = new CheckBalancedBracket();
		String bracketExp = "{[(a)s]}";
		Boolean result;
		result = checkBalanced.checkBalancedBracketExp(bracketExp);
		Display(result);
        
	}

	public static void Display(boolean result) {
		if (result) {
			System.out.println("Entered String has balanced brackets");
		}
		else {
			System.out.println("Entered string donot contain balanced brackets");
		}
		
	}

	

}
