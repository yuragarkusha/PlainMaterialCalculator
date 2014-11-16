package com.Ge0rge.Plain_Material_Calculator.Calculator;

import net.sourceforge.jeval.EvaluationException;
import net.sourceforge.jeval.Evaluator;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Stack;

/**
 * Created by Гаркуша on 15.11.2014.
 */
public class Calculation {

    public static ArrayList<String> ListOfCalculations = new ArrayList<String>();
    public static boolean EndComputing = false;
    public static int OpenParenthesis = 0;
    public static double  LastResultOfCalculations;

    public static void listOfCalculationsAdd(String addSymbol)
    {
        ListOfCalculations.add(addSymbol);
    }

    public static double calculation()
    {
        Evaluator evaluator = new Evaluator();

        String expressionString = "";

        for (String symbol : ListOfCalculations)
        {
            expressionString += symbol;
        }

        try {
            return Double.parseDouble(evaluator.evaluate(expressionString));
        } catch (EvaluationException e) {
            e.printStackTrace();
        }
        return 0;
    }

}
