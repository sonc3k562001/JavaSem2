using System;

public class InvalidInput : ApplicationException
{
    public InvalidInput():base("enter a number greater than Zero") { }
}
class TestExcept
{
    public static void Main()
    {
        int intCnt;
        int intNumber = 0;
        Console.WriteLine("enter a number:");
        try
        {
            intNumber = Convert.ToInt32(Console.ReadLine());
            if(intNumber <= 0)
            {
                throw new InvalidInput();
            }
        }catch(InvalidInput objInvalidInput)
        {
            Console.WriteLine(objInvalidInput.Message);
        }catch(System.FormatException objFormatException)
        {
            Console.WriteLine(objFormatException.Message);
        }
        finally
        {
            if (intNumber > 0)
            {
                for(intCnt = 1; intCnt <=10;intCnt++)
                {
                    Console.WriteLine(intCnt * intNumber);
                }
            }
        }
        Console.ReadLine();
    }
}
