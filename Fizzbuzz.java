package actividadesKatas;

public class Fizzbuzz {

	    public static void main(String[] args) {
	    	
	        		// Llamamos a un bucle  for que lea los números por pantalla del 1 al 100
	    	
	    			for (int i = 1; i <= 100; i++) {
	        	
	    				// 	Con un bucle if, chequeamos en primer lugar si el número es múltiplo de 3 y 5
	    				
	    				if (i % 3 == 0 && i % 5 == 0) {
	            	
	    					//Imprimimos "Fizzbuzz" en caso positivo
	            	
	    					System.out.println("FizzBuzz");
		            }
	            
	    				// Con un segundo if, chequeamos si el número es exclusivamente divisible por 3
	    				
		            else if (i % 3 == 0) {
		            	
		            	//Imprimimos "Fizz" por pantalla en caso positivo
		            	
		                System.out.println("Fizz");
		                
		            }
	    				
	    				//  Con un tercer if, chequeamos si el número es exclusivamente divisible por 5
	    				
		            else if (i % 5 == 0) {
		            	
		            	//Imprimimos "Fizz" por pantalla en caso positivo
		            	
		                System.out.println("Buzz");
		            }
	    				
		            // Si no es divisible ni entre 3 ni entre 5, imprimimos el número tal cual
	    				
		            else {
		                System.out.println(i);
	            }
	        }
	    }
	}

