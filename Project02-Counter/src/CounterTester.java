/**
 * Tests the Counter Class
 */
public class CounterTester
{
    public static void main(String[] args){
        Counter tally = new Counter();
        
        System.out.println("Tally Value: " + tally.getValue());
        
        tally.click();
        tally.click();
        tally.click();
        tally.click();
        tally.click();
        tally.click();
        tally.click();
        tally.click();
        
        
        System.out.println("Tally Value: " + tally.getValue());
        
        tally.undo();
        tally.undo();
        
        System.out.println("Tally Value: " + tally.getValue());
        
        tally.reset();
        
        System.out.println("Tally Value: " + tally.getValue());

    }
}