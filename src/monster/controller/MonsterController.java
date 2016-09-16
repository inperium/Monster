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
			printChars("I hear something in the bushes...");
			printChars("You encountered a wild " + firstMonster + ".");
			printChars("He has " + firstMonster.getAntennaCount() + " antennas.");
			printChars("He has " + firstMonster.getEyeCount() + " eyes.");
			printChars("He has " + firstMonster.getLegCount() + " legs.");
			printChars("He has " + firstMonster.getNoseCount() + " nose.");
			
			printChars("You want to change my name?");
			String answer = keyboardInput.nextLine();
			
			if(answer.equalsIgnoreCase("Yes") || answer.equalsIgnoreCase("Yes."))
			{
				printChars("What would you like my name to be?");
				String newName = keyboardInput.nextLine();
				firstMonster.setName(newName);
				printChars("Ok, my name is now " + firstMonster + ".");
			}else{
				printChars("Alright, " + firstMonster + " it is!");
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
				System.out.println(" ");
			}
		}
}
