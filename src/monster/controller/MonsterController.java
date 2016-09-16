package monster.controller;

import model.monster.MarshmallowMonster;
import java.util.Scanner;

public class MonsterController
{
		private MarshmallowMonster firstMonster;
		private Scanner keyboardInput;
	
		public MonsterController()
		{
			firstMonster = new MarshmallowMonster("Kä-pōō-Chįn¡!!!", 0, 2, 4, 1, false);
			keyboardInput = new Scanner(System.in);
		}
		
		public void start()
		{
			printChars("I hear something in the bushes.");
			printChars(". . .");
			printChars("You encountered a wild " + firstMonster);
			printChars("It has " + firstMonster.getAntennaCount() + " antennas.");
			printChars("It has " + firstMonster.getEyeCount() + " eyes.");
			printChars("It has " + firstMonster.getLegCount() + " legs.");
			printChars("It has " + firstMonster.getNoseCount() + " nose.");
			
			printChars("Do you want to change its name?");
			String answer = keyboardInput.nextLine();
			
			if(answer.equalsIgnoreCase("Yes") || answer.equalsIgnoreCase("Yes."))
			{
				printChars("What would you like its name to be?");
				String newName = keyboardInput.nextLine();
				firstMonster.setName(newName);
				printChars("Ok, its name is now " + firstMonster + ".");
			}else{
				printChars("Alright, " + firstMonster + " it is.");
			}
			
			printChars("Would you like to save?");
			String answerTwo = keyboardInput.nextLine();
			
			if(answerTwo.equalsIgnoreCase("Yes") || answerTwo.equalsIgnoreCase("Yes."))
			{
				printChars(". . .");
				printChars("Progress Saved.");
			} else {
				printChars("Are you sure? Your progress will be lost.");
				String answerThree = keyboardInput.nextLine();
				
				if(answerThree.equalsIgnoreCase("Yes") || answerThree.equalsIgnoreCase("Yes."))
				{
					printChars("Closing Pokeman G0");
				} else {
					printChars(". . .");
					printChars("Progress Saved.");
				}
			}
		}
		
		private void printChars(String str){
			for(char ch : str.toCharArray()){
				if(ch != ' '){
					try {
						Thread.sleep(50);
					} catch (InterruptedException e){
						e.printStackTrace();
					}
				}
				System.out.print(ch);
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e){
				e.printStackTrace();
			}
			System.out.println(" ");
		}
}
