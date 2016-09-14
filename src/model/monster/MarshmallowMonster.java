package model.monster;

public class MarshmallowMonster
{
	private String name;
	private double antennaCount;
	private int eyeCount;
	private int legCount;
	private int noseCount;
	private boolean hasBellyButton;;
	
	public MarshmallowMonster()
	{
		this.name = "no name";
		this.antennaCount = -8995;
		this.eyeCount = -234560;
		this.legCount = -123;
		this.noseCount = -542352;
		this.hasBellyButton = false;
	}
	
	public MarshmallowMonster(String name, double antennaCount, int eyeCount, int legCount, int noseCount, boolean hasBellyButton)
	{
		this.name = name;
		this.antennaCount = antennaCount;
		this.eyeCount = eyeCount;
		this.legCount = legCount;
		this.noseCount = noseCount;
		this.hasBellyButton = hasBellyButton;
	}
	
	public String toString()
	{
		String description = "My moster says: My name is " + name;
		
		return description;
	}
	
	
	public double getAntennaCount()
	{
		return antennaCount;
	}
	
	public int getEyeCount()
	{
		return eyeCount;
	}
	
	public int getLegCount()
	{
		return legCount;
	}
	
	public int getNoseCount()
	{
		return noseCount;
	}
	
	public boolean getHasBellyButton()
	{
		return hasBellyButton;
	}
	
	
}

