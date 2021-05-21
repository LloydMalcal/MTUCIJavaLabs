package Lab2;

public class Point3d {
    private double x;
    private double y;
    private double z;
    /*Конструктор инициализации*/
    public Point3d(double x, double y, double z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    /*Конструктор по умолчанию*/
    public Point3d()
    {
        double x = 0.0;
        double y = 0.0;
        double z = 0.0;
    }
    public double getX ()
    {
        return x;
    }
    public double getY ()
    {
        return y;
    }
    public double getZ ()
    {
        return z;
    }
    public void setX ( double val)
    {
        x = val;
    }
    public void setY ( double val)
    {
        y = val;
    }
    public void setZ ( double val)
    {
        z = val;
    }
    public boolean equals(Point3d obj)
    {
        if (this.x == obj.x && this.y == obj.y && this.z == obj.z)
            return true;
        else return false;
    }
    public double distanceTo (Point3d obj)
    {
        double X = this.x - obj.x;
        double Y = this.y - obj.y;
        double Z = this.z - obj.z;
        double dist = Math.sqrt(X*X + Y*Y + Z*Z);
        dist = Math.round(dist*100)/100.0d;
        System.out.println("Расстояние между точками равно = " + dist);
        return dist;
    }
}
