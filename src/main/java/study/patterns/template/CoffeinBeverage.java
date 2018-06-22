package study.patterns.template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class CoffeinBeverage {
    
    final void prepareRecipe()  {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments())
            addCondiments();
    }

    abstract void addCondiments();
    abstract void brew();

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }

    boolean customerWantsCondiments()   {
        String answer = getUserInput();
        if (answer.toLowerCase().startsWith("y"))   {
            return true;
        }   else    {
            return false;
        }
    }

    public String getUserInput()    {
        String answer = null;
        System.out.println("Would you like milk and sugar with your coffee (y/n)?");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        }   catch (IOException e)   {
            System.out.println("IO error trying to read your answer");
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }

}
