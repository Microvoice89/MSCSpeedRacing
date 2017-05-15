public abstract class   AbstractStaticObject implements StaticObject
{
    //private int z;
	private int x;
	private int y;
	private int move;
	protected byte livel; 
	private int width = 100;
	private int height = 100;
	private World world;

	public AbstractStaticObject(World world, int x, int y)
	{
		this.world = world;
		this.x = x;
		this.y = y;
	}

	@Override
	public int getHeight()
	{
		return height;
	}

	@Override
	public int getWidth()
	{
		return width;
	}

	protected World getWorld()
	{
		return world;
	}

	/*
	 * #Override assicura l'overriding del metodo (cambiando nome darebbe
	 * errore)
	 */
	@Override
	public int getX()
	{
		return x;
	}

	@Override
	public int getY()
	{
		return y;
	}

	@Override
	public boolean intersect(StaticObject other)
	{
		return intersectInternal(other) || (other instanceof AbstractStaticObject)
				? ((AbstractStaticObject) other).intersectInternal(this) : false;
		/*
		 * IF ternario, controlla se other è ASO, esegue la condizione dopo il
		 * "?", altrimenti false
		 */
	}

	private boolean intersectInternal(StaticObject other)
	{
		return false;   //Da implementare
	}

	protected void setX(int x)
	{
		if (x < 0)
			this.x = 0;
		else if (x > world.getWidth())
			this.x = world.getWidth();
		else
			this.x = x;
	}

	protected void setY(int y)
	{
		if (y < 0)
			this.y = 0;
		else if (y > world.getHeight())
			this.y = world.getHeight();
		else
			this.y = y;
	}

	public int getMove() {
		return move;
	}

	public void setMove(int m) {
		this.move = m;
	}
}
