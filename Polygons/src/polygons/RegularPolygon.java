/*
Summary Info: Programming Assignment #3 - RegularPolygon class
Programmer: Dean Choi
Date due: 6/17/16
Date completed: 6/13/16
*/
package polygons;


public class RegularPolygon {
    private int n = 3;          //number of sides in the polygon
    private double s = 1;       //length of the sides of a polygon
    private double x = 0;       //x-coordinate of the polygon's center
    private double y = 0;       //y-coordinate of the polygon's center
    
    //accessor and mutator methods for all data fields
    public int getN() {return this.n; }
    public void setN(int sides) {this.n = sides; }
    
    public double getS() {return this.s; }
    public void setS(double length) {this.s = length; }
    
    public double getX() {return this.x; }
    public void setX(double xcoor) {this.x = xcoor; }
    
    public double getY() {return this.y; }
    public void setY(double ycoor){this.y = ycoor;}
    
    /*Summary: No argument constructor, all constants set to default values
    Parameters: none
    Return: none
    */
    public RegularPolygon() {
    }
    
    /*Summary: Constructor that accepts 2 constants of the Polygon: n (# of sides) and s (side length)
    Parameters: one int and one double corresponding to n and s
    Return: none
    */
    public RegularPolygon(int n, double s){
        this.n = n;
        this.s = s;
    }
    
    /*Summary: Constructor that accepts 4 constants of the Polygon: n (# of sides), s (side length),
    x (x-coord of center), and y (y-coord of center)
    Parameters: one int and 3 doubles corresponding to n, s, x, and y
    Return: none
    */
    public RegularPolygon(int n, double s, double x, double y){
        this.n = n;
        this.s = s;
        this.x = x;
        this.y = y;
    }
    
    /*Summary: method that returns the perimeter of the regular polygon as a double
    Parameters: none
    Return: double value that is the perimeter of the regular polygon
    */
    public double getPerimeter(){
        return n*s;
    }
    
    /*Summary: method that returns the area of the regular polygon as a double
    Parameters: none
    Return: double value that is the area of the regular polygon
    */
    public double getArea() {
        return (n * Math.pow(s,2)/(4*Math.tan(Math.PI/n)));
    }
    
    /*Summary: Prints the # of sides, side length and center of the RegularPolygon
    Parameters: none
    Return: none
    */
    public void printRegularPolygon(){
        System.out.printf("This regular polygon has %d sides, with a side length of %6.3f and"
                + " a center at the point of (%4.3f, %4.3f).\n", n, s, x, y);
    }
}