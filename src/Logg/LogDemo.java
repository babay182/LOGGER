package Logg;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LogDemo {
    private static final Logger LOGGER = Logger.getLogger(LogDemo.class.getName());

    public static void main(String[] args) {

        LOGGER.log(Level.FINE, "Start args:", Arrays.toString(args));
        try {
            randomlyFailingAlgorithm();
        } catch (IllegalStateException e){
            LOGGER.log(Level.SEVERE, "Exception:", e);
            System.exit(2);
        }
        LOGGER.fine("Finish");
    }
    private static void randomlyFailingAlgorithm(){
        double randomNumber = Math.random();
        if(randomNumber<0.5){
            throw new IllegalStateException("Invalid");
        }
    }
}
