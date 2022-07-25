package com.greatLearning.BalancingBracket.Service;

import java.util.Stack;

public class CheckBalancedBracket {
	public static Boolean checkBalancedBracketExp(String bracketExp) {
		Stack<Character> stack = new Stack<Character>();
		for(int i=0;i<bracketExp.length();i++) {
			char x = bracketExp.charAt(i);
			if (x == '(' || x == '[' || x == '{') {
				stack.push(x);
				continue;
			}
			if (stack.isEmpty()) {
				return false;
			}
			char check;
			
			switch(x) {
			
			case ')':
				check = stack.pop();
				if(check == '{' || check == '[')
					return false;
				break;
			case '}':
				check = stack.pop();
				if(check == '[' || check == '(')
					return false;				
				break;
			case ']':
				check = stack.pop();
				if(check == '{' || check == '(')
					return false;
				break;
			}
				
			
		}
		return (stack.isEmpty());
	}
}
