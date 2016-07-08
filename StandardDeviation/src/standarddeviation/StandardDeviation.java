/*
Summary Info: Programming Assignment #5 - Testing Class
Programmer: Dean Choi
Date due: 6/28/16
Date completed: 7/2/16
*/
package standarddeviation;

public class StandardDeviation {
    
    /*Summary Info : java main console method that creates various double arrays and calculates
    their means and standard deviations.
    Parameters : none.
    Return type : none.
    */
    public static void main(String[] args) {
        
        //Instantiate the example array from the HW as array1
        double[] array1 = {1.9, 2.5, 3.7, 2, 1, 6, 3, 4, 5, 2};
        
        //Run the static mean() and deviation() methods for array1 and print out the values
        System.out.printf("The mean of array1 is %6.4f.\n", mean(array1));
        System.out.printf("The standard deviation of array1 is %6.6f.\n", deviation(array1));
        
        //Instantiate my example array as array2
        double[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        
        //Run the static mean() and deviation() methods for array2 and print out the values
        System.out.printf("\nThe mean of array2 is %6.4f.\n", mean(array2));
        System.out.printf("The standard deviation of array2 is %6.6f.\n", deviation(array2));
        
        //Instantiate my 2nd example array as array3
        double[] array3 = {100, 95, 90.5, 85, 80.5, 20, 3.14, 70.7, 1337, 58008};
        
        //Run the static mean() and deviation() methods for array2 and print out the values
        System.out.printf("\nThe mean of array3 is %6.4f.\n", mean(array3));
        System.out.printf("The standard deviation of array3 is %6.6f.\n", deviation(array3));

    }
    
    /*Summary: method that calculates the mean of the values in a double array
    Parameters: one double array variable
    Return: one double value that is the mean of the values in the array
    */
    public static double mean(double[] x) {
        double sum = 0;
        
        for (double i : x){
            sum += i;
        }
        
        return sum/(double)x.length;
    }
    
    /*Summary: method that calculates the standard deviation of the values in a double array
    Parameters: one double array variable
    Return: one double value that is the standard deviation of the values in the array
    */
    public static double deviation(double[] x) {
        double sumDiffsSq = 0;
        double mean = mean(x);
        
        for (double i : x) {
            sumDiffsSq += Math.pow(i - mean, 2);
        }
        
        return Math.pow(sumDiffsSq/(double)(x.length - 1), 0.5);
    }
    
}
