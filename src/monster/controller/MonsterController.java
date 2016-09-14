package monster.controller;

import model.monster.MarshmallowMonster;

public class MonsterController
{
		private MarshmallowMonster firstMonster;
	
		public MonsterController()
		{
			firstMonster = new MarshmallowMonster("Kä-pōō-Chįn¡!!!", 0, 2, 4, 1, false);
		}
		
		public void start()
		{
			System.out.println("We made monsters today!");
			System.out.println("Here is mine " + firstMonster);
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
