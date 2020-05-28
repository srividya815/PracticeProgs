package com.vids.may15;

public class RobotGrid {
	
	
	private static void printCordinates(int xaxis, int yaxis, String instruction){
		
		instruction = instruction.toUpperCase();
		String[] instructions = instruction.split("");
		for(String str : instructions){
			if(str.equals("R")){
				xaxis++;
			}else if(str.equals("L")){
				xaxis--;
			}else if(str.equals("U")){
				yaxis++;
			}else if(str.equals("D")){
				yaxis--;
			}else{
				System.out.println("Invalid move");
			}
		}

		System.out.println("(x, y) is ( "+xaxis +", " +yaxis+")");
	}
	
	public static void main(String[] args){
		printCordinates(0, 0, "RRULDDDLR");
	}
	
	
}
