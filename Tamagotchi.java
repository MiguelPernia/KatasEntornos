package actividadesKatas;

public class Tamagotchi {
	
	
		//Atribbutos de nuestra mascota
	
	    private int hunger;
	    private int energy;
	    private int mood;

	    // Constructor para inicializar los atributos con valor 4
	    
	    public Tamagotchi() {
	        this.hunger = 4;
	        this.energy = 4;
	        this.mood = 4;
	    }

	    // Método play: aumenta el hambre y el humor, pero baja la energía
	    
	    public String play() {
	    	
	        hunger += 1;
	        energy -= 1;
	        mood += 1;
	        
	        return EstadoActualizado();
	    }

	    // Método eat: disminuye el hambre bastante y un poco la energía
	    
	    public String eat() {
	    	
	        hunger -= 2;
	        energy -= 1;
	        
	        return EstadoActualizado();
	    }

	    // Método sleep: aumenta bastante la energía
	    
	    public String sleep() {
	    	
	        energy += 2;
	        
	        return EstadoActualizado();
	    }

	    // Método privado que actualiza el estado de nuestra mascota para consultar después de cada acción
	    
	    private String EstadoActualizado() {
	    	
	        if (energy == 0) {
	        	
	            return "(-_-) zZZ"; // Dormidito
	        }
	        if (mood < 2) {
	        	
	            return "ఠ_ఠ"; // Enfadado
	        }
	        if (mood > 8) {
	        	
	            return ":-)"; // Contento
	        }
	        if (energy < 3) {
	        	
	            return "(-_-)"; // Cansado
	        }
	        	return ":-|"; // Otros casos
	    }
		 //Creamos un main para probar nuestro tamagotchi
	    public static void main(String[] args) {
	    	
	    	//Creamos uno nuevo que se llamará Pepito
	    	
	    	Tamagotchi Pepillo = new Tamagotchi();
	    	
	    	//Y lo ponemos a jugar, comer y dormir
	    	
	    	Pepillo.play();
	    	Pepillo.eat();
	    	Pepillo.sleep();
	    }

	    }
	
