/**
 * @version
 * @author
 */
public class Point {
    int x;
    int y;

    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void translate(int dx, int dy) {
        setX(x + dx);
        setY(y + dy);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    @Override
    public boolean equals(Object obj) {
        boolean b = false;
        if (obj instanceof Point) {
            Point that = (Point) obj;
            b = this.x == that.x && this.y == that.y;
        }
        return b;
    }
}