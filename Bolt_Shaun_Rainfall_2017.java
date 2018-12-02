package bolt_shaun_rainfall_2017;
import javax.swing.JOptionPane;

/*
Project/Assignment Title: Rainfall Class
File Name: bolt_shaun_rainfall_2017
Data Complied Last: November 28, 2018
Author: Shaun Bolt
Complied in: NetBeans 8.2
Integrity Statement: By submitting this project, I am taking the integrity oath
that I have not copied any line(s) of code - partially or completely - from any
other individual, former student work, textbook, online resources, website, and
any reference avaliable anywhere.
 * @author shabolt
 */
public class Bolt_Shaun_Rainfall_2017 
{
    public static void main(String[] args) 
    {
        final int MONTHS = 12;    //Number of months.
        double[] Rain = new double[MONTHS];     //Array of Rainfall.
        
        RainFall amount = new RainFall(Rain);   //Calling the RainFall class.
        
        //Displays the total amount of rainfall for the total number of months.
        JOptionPane.showMessageDialog(null, String.format("The total rainfall in 2017 " +
                        "was: %.2f", amount.Total()));
        
        //Displays the average amount of rainfall from the total number of months.
        JOptionPane.showMessageDialog(null, String.format("The average monthly rainfall " +
                    "in 2017 was: %.2f", amount.Average_Monthly(MONTHS)));
        
        //Displays the month that was recorded to have the most amount of rainfall.
        JOptionPane.showMessageDialog(null, "The month with the most rain " +
                    "in 2017 was: " + amount.Month_Most());
        
        //Displays the month that was recorded to have the least amount of rainfall.
        JOptionPane.showMessageDialog(null, "The month with the least rain " +
                    "in 2017 was: " + amount.Month_Least());
    }
}