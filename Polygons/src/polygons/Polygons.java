/*
Summary Info: Programming Assignment #3 - create 3 different RegularPolygons using constructors
Programmer: Dean Choi
Date due: 6/17/16
Date completed: 6/13/16
*/
package polygons;

public class Polygons {

    /*
    Summary Info : java main console method creates 3 RegularPolygon objects with the required constructors
    and prints out their perimeter and area.
    Parameters : none.
    Return type : none.
    */
    public static void main(String[] args) {
        RegularPolygon p1 = new RegularPolygon();
        double perimeter1 = p1.getPerimeter();
        double area1 = p1.getArea();
        
        RegularPolygon p2 = new RegularPolygon(6,4);
        double perimeter2 = p2.getPerimeter();
        double area2 = p2.getArea();
        
        RegularPolygon p3 = new RegularPolygon(10,4,5.6,7.8);
        double perimeter3 = p3.getPerimeter();
        double area3 = p3.getArea();
        
        p1.printRegularPolygon();
        System.out.printf("This polygon has a perimeter of %6.3f and an area of %6.3f.\n\n", perimeter1, area1);
        
        p2.printRegularPolygon();
        System.out.printf("This polygon has a perimeter of %6.3f and an area of %6.3f.\n\n", perimeter2, area2);
        
        p3.printRegularPolygon();
        System.out.printf("This polygon has a perimeter of %6.3f and an area of %6.3f.\n\n", perimeter3, area3);
        
    }
}
