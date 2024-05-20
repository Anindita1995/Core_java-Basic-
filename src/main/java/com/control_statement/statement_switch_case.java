package com.control_statement;

public class statement_switch_case {
public static void main(String[] args) {
	String arrow = "->";
	switch(arrow) {
	case "<-": System.out.println("Turn Left");
	break;
	case "->": System.out.println("Turn Right");
	break;
	case "^": System.out.println("Go straight");
	break;
	case "(*)": System.out.println("Stop");
	break;
	default : System.out.println("do not stop");
	}
}
}
