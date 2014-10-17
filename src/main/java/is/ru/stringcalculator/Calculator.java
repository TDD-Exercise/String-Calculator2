package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text){
		if(text.equals("")){
			return 0;
		}
		else if(text.contains(",") || text.contains("\n") 
			|| text.contains("\\;") || text.contains("\\***")
			|| text.contains("\\*" && "\\%"){
			return sum(splitNumbers(text));
		}
		else
			return 1;
	} 

	private static int toInt(String number){
		return Integer.parseInt(number);
	}

	private static String[] splitNumbers(String numbers){
		return numbers.split("\\W");
	}
     
    private static int sum(String[] numbers) throws Exception{
 		NegitiveNumbers(numbers);
    
		return Biggerthan1000(numbers);

    }


 private static int NegitiveNumbers(String[] numbers) throws Exception{
    for(String number : numbers){
    		if(toInt(number) < 0){
    			throw new Exception ("Negitives not allowed");
    		}
    	}
    }


private static int Biggerthan1000(String[] numbers) throws Exception{
   int total = 0;
    for(String number : numbers){
			if(toInt(number) > 1000){
				continue;
			}
			total += toInt(number);
	}
	return total;
}
}
