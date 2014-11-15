package com.Ge0rge.Plain_Material_Calculator.Calculator;

import java.util.EmptyStackException;
import java.util.List;
import java.util.Stack;

/**
 * Created by Гаркуша on 15.11.2014.
 */
public class Calculation {

    public List<String> ListOfCalculations;
    public Stack<Double> calculationStack = new Stack<Double>();



    public void listOfCalculationsAdd (String addSymbol)
    {
        ListOfCalculations.add(addSymbol);
    }


    public void stackOfCalculationsAdd (double addSymbol)
    {
        try
        {
            calculationStack.push(addSymbol);
        }
        catch (EmptyStackException ignored)
        {
        }
    }

    public boolean checkSymbol(String symbol)
    {
        try {
            double number = Double.parseDouble(symbol);
            return true;
        }
        catch (NumberFormatException e) {
            return false;
        }
    }

    public int operation(Double a, Double b, String operator)
    {

        return 0;
    }

    public double calculation()
    {
        double result = 0.000;
        for (int i = 1; i < ListOfCalculations.size(); i++)
        {
            if(checkSymbol(ListOfCalculations.get(i))==true || calculationStack.size()<2)
            {
                stackOfCalculationsAdd(Integer.parseInt(ListOfCalculations.get(i)));
            }
            else
            {
              result = operation(calculationStack.pop(),calculationStack.pop(),ListOfCalculations.get(i));
                calculationStack.push(result);
            }
        }

        return result ;
    }

}
