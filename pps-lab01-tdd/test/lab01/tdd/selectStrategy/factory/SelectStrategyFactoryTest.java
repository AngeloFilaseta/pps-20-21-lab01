package lab01.tdd.selectStrategy.factory;

import lab01.tdd.selectStrategy.SelectEvenStrategy;
import lab01.tdd.selectStrategy.SelectMultipleOfStrategy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

class SelectStrategyFactoryTest {

    private SelectStrategyFactory abstractFactory;

    @Test
    void createEvenStrategy(){
        abstractFactory = new SelectEvenStrategyFactory();
        assertTrue(abstractFactory.createStrategy() instanceof SelectEvenStrategy);
        try{
            abstractFactory.createStrategy(1);
            fail();
        }catch (IllegalCallerException e){
            System.out.println("Exception launched as expected: " + e.getClass().getName());
        }
    }

    @Test
    void createMultipleOfStrategy(){
        abstractFactory = new SelectMultipleOfStrategyFactory();
        assertTrue(abstractFactory.createStrategy(1) instanceof SelectMultipleOfStrategy);
        try{
            abstractFactory.createStrategy();
            fail();
        }catch (IllegalCallerException e){
            System.out.println("Exception launched as expected: " + e.getClass().getName());
        }
    }

}