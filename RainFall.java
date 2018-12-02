package bolt_shaun_rainfall_2017;

/**
 *
 * @author shabolt
 */
public class RainFall 
{
    double[] Rain = {6.09, 2.42, 5.63, 1.68,
                     2.41, 7.19, 6.29, 39.11,
                     1.23, 3.42, 0.50, 3.72};  //Hard Code data.
    
    public RainFall(double[] Rain)
    {
        double[] rainStats;
        rainStats = new double[Rain.length];
        
        System.arraycopy(Rain, 0, rainStats, 0, Rain.length);
    }
    
    //Calculates the total amount of rainfall from the given number of months.
    public double Total()
    {   
        double Sum = 0;
        
        for(int index = 0; index < Rain.length; index++)
        {
            Sum += Rain[index];
        }
        
        return Sum;
    }
    
    //Calculates the average amount of rainfall from the given number of months.
    public double Average_Monthly(double monthAve)
    {
        for(int index = 0; index < Rain.length; index++)
        {
            return Total() / Rain.length;
        }
        
        return monthAve;
    }
    
    //Using the loop, it finds out from the rainfall data given what month had the most amount of rainfall.
    public int Month_Most()
    {
        double most = Rain[0];
        int mostMonth = 1;  /*This is the first month that is initialized;
                              if this month is not the most then the loop will
                              make sure that it finds the month with the most
                              rainfall.
                            */
        
        for(int index = 0; index < Rain.length; index++)
        {
            if(Rain[index] > most)
            {
                most = Rain[index];
                mostMonth = index + 1;
            }
        }
        
        return mostMonth;
    }
    
    //Using the loop, it finds out from the rainfall data given what month had the least amount of rainfall.
    public int Month_Least()
    {
        double least = Rain[0];
        int leastMonth = 1;  /*This is the first month that is initialized;
                               if this month is not the least then the loop will
                               make sure that it finds the month with the least
                               rainfall.
                             */
        
        for(int index = 0; index < Rain.length; index++)
        {
            if(Rain[index] < least)
            {
                least = Rain[index];
                leastMonth = index + 1;
            }
        }
        
        return leastMonth;
    }
}