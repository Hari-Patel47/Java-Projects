/**
 * This class models a tally counter.
 */
public class Counter
{
   private int value;
   
   /**
    * Constructor that sets value to 0.
    */
   public Counter()
   {
      value = 0;
   }

   /**
    * Gets the current value of the counter.
    * @return the current value
    */
   public int getValue()
   {
      return value;
   }

   /**
    * Adds 1 to the counter.
    */
   public void click() 
   {
      value = value + 1;
   }

   /**
    * Resets the value of the counter to 0.
    */
   public void reset()
   {
      value = 0;
   }
   
   /**
    * Subtracts 1 from the counter
    */
   public void undo() 
   {
        value = value - 1;
   }
}
