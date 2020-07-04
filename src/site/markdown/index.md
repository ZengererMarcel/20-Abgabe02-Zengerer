#Was ist eine Queue?
Mit einer Queue ist es möglich eine Folge von Objekten zu verwalten. Es geht nach dem FIFO (First in First out) Prinzip vor, heißt, das Element, dass als erstes eingefügt wurde, wird auch als erstes genommen.

Beispiele: Wiedergabeliste bei Musik, Drucker

####Code Snippet
```java
class Main
 {
 	public static void main (String[] args)
 	{
 		// create a queue of capacity 5
 		Queue q = new Queue(5);
 
 		q.enqueue(1);
 		q.enqueue(2);
 		q.enqueue(3);
 
 		System.out.println("Front element is: " + q.peek());
 		q.dequeue();
 		System.out.println("Front element is: " + q.peek());
 
 		System.out.println("Queue size is " + q.size());
 
 		q.dequeue();
 		q.dequeue();
 
 		if (q.isEmpty())
 			System.out.println("Queue Is Empty");
 		else
 			System.out.println("Queue Is Not Empty");
 	}
 }
```
Quelle: https://www.techiedelight.com/queue-implementation-in-java/

#Wie kann ich eine Queue testen?
Um eine Queue zu testen muss man jede einzelne Methode testen. Heißt also wenn man die Methode enqueue hat schreibt man einen test der Objekte in die Queue gibt und überprüft ob diese in die queue gegeben werden. Das macht man mit allen Methoden um eine Queue komplett testen zu können.

#Was sind Generics
Generic steht Stellvertretend für einen Variablentyp. Damit ist es möglich eine Klasse Typ unabhängig zu machen, heißt man kann die klasse für alle Datentypen verwenden. Dadurch kann man sich viel arbeit ersparen, wenn man mehrere Klassen hat die das gleiche machen und nur im Datentyp den sie benutzen unterscheiden, ist es mit Generic möglich nur eine Klasse verwenden zu müssen.

####Code Snippet
```java
public class GenericMethodTest {
   // generic method printArray
   public static < E > void printArray( E[] inputArray ) {
      // Display array elements
      for(E element : inputArray) {
         System.out.printf("%s ", element);
      }
      System.out.println();
   }

   public static void main(String args[]) {
      // Create arrays of Integer, Double and Character
      Integer[] intArray = { 1, 2, 3, 4, 5 };
      Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
      Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

      System.out.println("Array integerArray contains:");
      printArray(intArray);   // pass an Integer array

      System.out.println("\nArray doubleArray contains:");
      printArray(doubleArray);   // pass a Double array

      System.out.println("\nArray characterArray contains:");
      printArray(charArray);   // pass a Character array
   }
}
```
######Output
```
Array integerArray contains:
1 2 3 4 5 

Array doubleArray contains:
1.1 2.2 3.3 4.4 

Array characterArray contains:
H E L L O
```

#Was ist eine Code Coverage bei Source Code Tests?
Die code Coverage(Codeabdeckung) gibt an wie viel Prozent des Source Codes getestet wird. Es wird während dem Test geschaut welche Zeilen im Code besucht werden