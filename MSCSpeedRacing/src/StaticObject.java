public interface StaticObject
{
	int getHeight();

	int getWidth();

	int getX();

	int getY();

	boolean intersect(StaticObject other);
}
