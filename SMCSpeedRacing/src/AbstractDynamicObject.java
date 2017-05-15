

public abstract class AbstractDynamicObject extends AbstractStaticObject implements DynamicObject
{

	private int speed;
	private Direction direction;

	public AbstractDynamicObject(World world, int x, int y, Direction direction, int speed)
	{
		super(world, x, y);
		this.direction = direction;
		this.speed = speed;

	}

	@Override
	public Direction getDirection()
	{
		return direction;
	}

	@Override
	public int getSpeed()
	{
		return speed;
	}

	protected void setDirection(Direction direction)
	{
		this.direction = direction;
	}

	@Override
	public void update()
	{
		switch (getDirection())
		{
		case UP:
			setY(getY() - getSpeed());
			break;
		case DOWN:
			setY(getY() + getSpeed());
			break;
		case LEFT:
			setX(getX() - getSpeed());
			break;
		case RIGHT:
			setX(getX() + getSpeed());
			break;

		default:
			break;
		}
	}

}
