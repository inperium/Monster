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
			System.out.println("We made monsters today!");
			System.out.println("Here is mine " + firstMonster);
			System.out.println("He has " + firstMonster.getAntennaCount() + " antennas.");
			System.out.println("He has " + firstMonster.getEyeCount() + " eyes.");
			System.out.println("He has " + firstMonster.getLegCount() + " legs.");
			System.out.println("He has " + firstMonster.getNoseCount() + " nose.");
			
			System.out.println("You want to change my name?");
			String answer = keyboardInput.nextLine();
		}
		
		/*
		 * monster name is Kä-pōō-Chįn¡!!!
		 * Has no antennas
		 * Has two eyes.
		 * Has four legs.
		 * Has one nose.
		 * Has no belly button.
		 */
}
