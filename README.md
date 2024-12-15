# *KatasEntornos*

  En este proyecto puedes encontrar dos archivos .java. En primer lugar, *Fizzbuzz.java* recrea el famoso juego de niños homónimo. El segundo: *Tamagotchi.java*, es un breve código que recrea una pequeña mascota virtual. Junto al código, he realizado una pequeña tarea de *debugueo*, añadiendo algunos *breakpoints* y observando el comportamiento de las variables.
  

## FIZZBUZZ
  Se trata de un juego en el que se van listando los números naturales en orden ascendente a partir del 1. Si el número es divisible entre 3, debe sustituirse su nombre por el sonido "Fizz". Si es divisible por 5, debe sustituirse por "Buzz". Y cuando ambos criterios se cumplen debe gritarse "FIZZBUZZ".

  En primer lugar, una captura del código al completo:

![image](https://github.com/user-attachments/assets/b1841b84-0d12-499c-b9da-71ed5d4ff324)

### Debug
  Posteriormente, añadimos tres breakpoints en puntos relevantes del código. En la siguiente imagen, hemos puesto los tres puntos en el código donde debe imprimir por pantalla el número tras chequear su divisibilidad. Podemos observar que para el primer bucle, en el último paso el número sigue conservando su valor ya que 1 no es divisible por 3 ni por 5.

![image](https://github.com/user-attachments/assets/797a5596-7077-49be-9e38-79c787a4d1dd)

  Sin embargo, si damos unas cuantas vueltas al bucle observaremos que el 3 es transformado en Fizz, mientras que el valor de nuestra variable se ha vuelto 4:

 ![image](https://github.com/user-attachments/assets/4d340454-bbde-43da-9bba-d81ef6763173)


 ## Tamagotchi
 
   Se trata de crear un breve código que emule un pequeño tamagotchi que haga lo que hacen todos los cachorros: jugar, comer y dormir.

   El siguiente código emula a nuestra mascota:

   ![image](https://github.com/user-attachments/assets/2aaa810a-9627-41c0-b9a1-ac5ecfa631fd)
 
  Aparte de unos atributos y unos métodos, creamos un método privado que actualize el estado de nuestra mascota, y un main donde inicializamos a Pepito para ponerlo a hacer cosas:
 
  ![image](https://github.com/user-attachments/assets/34f33c6f-a883-454c-8666-b595c51f1939)
  
### Debug
  Para la tarea, he añadido breakpoints en los momentos donde tiene que realizar una acción. En la siguiente imagen observamos que ante de empezar a jugar, todos sus atributos valen 4 (valor de inicio).

  ![image](https://github.com/user-attachments/assets/56f6db84-f019-467c-b0ad-d2386ba8af1a)

  Pero tras haber jugado, estos valores se modifican, del mismo modo que tras realizar cualquier otra acción:
  
![image](https://github.com/user-attachments/assets/eab2b066-7146-41d6-9852-1cc60f17c787)

![image](https://github.com/user-attachments/assets/0c753bce-caa0-43c7-bfd2-c790c0e44b7d)




