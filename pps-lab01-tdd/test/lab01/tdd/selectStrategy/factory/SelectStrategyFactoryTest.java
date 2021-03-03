package lab01.tdd.selectStrategy.factory;

import lab01.tdd.selectStrategy.SelectEqualsStrategy;
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
        testCreateStrategyPassingParameter(true);
    }

    @Test
    void createMultipleOfStrategy(){
        abstractFactory = new SelectMultipleOfStrategyFactory();
        assertTrue(abstractFactory.createStrategy(1) instanceof SelectMultipleOfStrategy);
        testCreateStrategyPassingParameter(false);
    }

    @Test
    void createEqualsStrategy(){
        abstractFactory = new SelectEqualsStrategyFactory();
        assertTrue(abstractFactory.createStrategy(1) instanceof SelectEqualsStrategy);
        testCreateStrategyPassingParameter(false);
    }

    private void testCreateStrategyPassingParameter(final boolean usingParameter) {
        try{
            if(usingParameter){
                abstractFactory.createStrategy(1);
            }else{
                abstractFactory.createStrategy();
            }
            fail();
        }catch (IllegalCallerException e){
            System.out.println("Exception launched as expected: " + e.getClass().getName());
        }
    }

}