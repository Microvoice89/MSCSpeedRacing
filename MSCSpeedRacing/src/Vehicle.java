
public class Vehicle
{
    private int widghWorld,heightWorld;
	private String name;
	private int maxSpeed;
	private int speed;
	private Direction direction;
	private int dimesion;
	private int posX, posY, posZ;
	
	
	//COSTRUTTORE 
	public Vehicle(String name, int maxSpeed, int dimesion)
	{
		this.posX = 0;
		this.posY = 0;
		this.posZ = 0;
		this.name = name;
		this.maxSpeed = maxSpeed;
		this.speed = 0;
		this.direction = Direction.STOP;
		this.dimesion=dimesion;
		
	}
	
	
	public enum Direction
	{
		STOP, RIGHT, LEFT, FRONT, BACK;
	}

     public void move()
     {
    	 

    	 
    	 
    	 
    	 
     } 
	
	public int getWidghWorld() {
		return widghWorld;
	}


	public void setWidghWorld(int widghWorld) {
		this.widghWorld = widghWorld;
	}


	public int getHeightWorld() {
		return heightWorld;
	}


	public void setHeightWorld(int heightWorld) {
		this.heightWorld = heightWorld;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMaxSpeed() {
		return maxSpeed;
	}


	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}


	public Direction getDirection() {
		return direction;
	}


	public void setDirection(Direction direction) {
		this.direction = direction;
	}


	public int getDimesion() {
		return dimesion;
	}


	public void setDimesion(int dimesion) {
		this.dimesion = dimesion;
	}


	public int getPosX() {
		return posX;
	}


	public void setPosX(int posX) {
		this.posX = posX;
	}


	public int getPosY() {
		return posY;
	}


	public void setPosY(int posY) {
		this.posY = posY;
	}


	public int getPosZ() {
		return posZ;
	}


	public void setPosZ(int posZ) {
		this.posZ = posZ;
	}



	

}
