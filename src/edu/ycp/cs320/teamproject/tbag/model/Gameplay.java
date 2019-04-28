 package edu.ycp.cs320.teamproject.tbag.model;

import java.util.ArrayList;
import java.util.Arrays;

import edu.ycp.cs320.teamproject.tbag.db.persist.DerbyDatabase;


public class Gameplay {
	
	private String input; 		//input from the user
	private ArrayList<String> output;//initial story and story as a result of user input
	
	// The 2d array that holds the map
	private int jointLocationID[][] = {{0,0,0,0},{1,4,2,1},{2,5,3,1},{3,6,3,2},{1,7,5,4},{2,8,6,4},{3,9,6,5},{4,7,8,7},{5,8,9,7},{6,9,9,8}}; // Map movement restrictions
	
	public Gameplay() 
	{
		
	}
	
	public void setInput (String input)
	{
		this.input = input;
	}
	
	public String getInput()
	{
		return input; 
	}
	
	public ArrayList<String> getOutput() {
		return output;
	}
	
	public void setOutput(ArrayList<String> output2) {
		this.output = output2;
		for(int i=0; i<output2.size(); i++) {
			System.out.println(output2.get(i));
		}
	}
	
	public void displayMap() {
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.println(jointLocationID[i][j]);
			}
		}
	}
}
