package Lab2;

import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args)
    {
        double x,y,z;
        Scanner next = new Scanner(System.in);
        System.out.println("Введите координату X,Y,Z 1 точки :");
        x = next.nextDouble();
        y = next.nextDouble();
        z = next.nextDouble();
        Point3d point3d_1 = new Point3d(x,y,z);
        System.out.println("Введите координату X,Y,Z 2 точки :");
        x = next.nextDouble();
        y = next.nextDouble();
        z = next.nextDouble();
        Point3d point3d_2 = new Point3d(x,y,z);
        System.out.println("Введите координату X,Y,Z 3 точки:");
        x = next.nextDouble();
        y = next.nextDouble();
        z = next.nextDouble();
        Point3d point3d_3 = new Point3d(x,y,z);
        if (point3d_1.equals(point3d_2) || point3d_1.equals(point3d_3) || point3d_3.equals(point3d_2))
            System.out.println("Точки равны - треугольника нет");
        else System.out.println("Площадь получившегося треугольника = " + computeArea(point3d_1,point3d_2,point3d_3));
    }
    public static double computeArea(Point3d a,Point3d b,Point3d c)
    {
        double AB,AC,BC,p,S;
        AB = a.distanceTo(b);
        BC = b.distanceTo(c);
        AC = a.distanceTo(c);
        p = (AB + AC + BC)/2;
        S = Math.sqrt(p * (p - AB) * (p - AC) * (p - BC));
        S = Math.round(S*100)/100.0d;
        return S;
    }
}
