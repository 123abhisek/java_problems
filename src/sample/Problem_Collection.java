package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*
Problem 1: 
Create a generic method called `printList` that takes a List of any type and prints
its elements.
*/

/*
 * public class Problem_Collection { public static void main(String[] args) {
 * List<String> stringList = Arrays.asList("Java", "Python", "C++");
 * printList(stringList); }
 * 
 * public static <T> void printList(List<T> list) { for(T s : list) {
 * System.out.println(s); } } }
 */

/*
Problem 2: 
Implement a generic method `getMaxElement` that finds and returns the maximum 
element from a List of numbers.
*/

/*
 * public class Problem_Collection { public static void main(String[] args) {
 * List<Integer> numbers = Arrays.asList(5, 12, 8, 3, 15, 7);
 * System.out.println(getMaxElement(numbers));
 * 
 * }
 * 
 * public static <T> int getMaxElement(List<T> list) { Integer max = 0;
 * 
 * for(T i : list) { if (max < (Integer) i) { max = (Integer) i; } }
 * 
 * return max; } }
 */

/*Problem 3: 
Create a generic class `Box` that can hold any type of object. Implement methods 
`get` and `set` to retrieve and update the stored value.*/

/*
 * class Box<T>{ T name; public void set(T name) { this.name = name; }
 * 
 * public T get(){ return (T) name; } }
 * 
 * 
 * public class Problem_Collection { public static void main(String[] args) {
 * 
 * Box<String> stringBox = new Box<>(); stringBox.set("Hello , Generics !");
 * System.out.println(stringBox.get()); } }
 */

/*## 2. Iterator Interface
Problem 1: 
Write a method `printEvenNumbers` that takes a List of integers and uses an 
Iterator to print only the even numbers*/

/*
 * public class Problem_Collection { public static void main(String[] args) {
 * List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
 * printEvenNumbers(numbers); }
 * 
 * public static void printEvenNumbers(List<Integer> list) { Iterator<Integer>
 * it = list.iterator();
 * 
 * while(it.hasNext()) { int val = it.next(); if( val % 2 == 0)
 * System.out.println(val); } } }
 */

/*Problem 2: 
Implement a method `sumList` that takes a List of doubles and calculates the sum 
using an Iterator.*/

/*
 * public class Problem_Collection { public static void main(String[] args) {
 * 
 * List<Double> doubles = Arrays.asList(2.5, 4.3, 1.0, 5.8);
 * System.out.println(sumList(doubles));
 * 
 * }
 * 
 * private static double sumList(List<Double> doubles) {
 * 
 * Iterator<Double> it = doubles.iterator(); double sum = 0; while(it.hasNext())
 * { sum += it.next(); }
 * 
 * return sum; } }
 */

/*
  Problem 3: 
Create a method `removeUpperCase` that takes a List of strings and removes all 
strings containing uppercase letters using an Iterator.

*/

/*
 * public class Problem_Collection { public static void main(String[] args) {
 * 
 * List<String> words = Arrays.asList("apple", "Banana", "orange", "Grapes");
 * removeUpperCase(words);
 * 
 * }
 * 
 * private static void removeUpperCase(List<String> words) {
 * 
 * Iterator<String> it = words.iterator();
 * 
 * List<String> newlist = new ArrayList<String>(); while(it.hasNext()) { String
 * value = it.next();
 * 
 * if(value.charAt(0) >= 'a' && value.charAt(0) <= 'z') { newlist.add(value); }
 * }
 * 
 * System.out.println(newlist); } }
 */

/*
Problem 1: 
Write a method `reverseList` that takes a List of strings and returns a new List 
with the elements reversed.
*/

/*
 * public class Problem_Collection { public static void main(String[] args) {
 * 
 * List<String> originalList = Arrays.asList("Java", "Python", "C++");
 * List<String> reversedList = reverseList(originalList);
 * System.out.println(reversedList);
 * 
 * }
 * 
 * private static List<String> reverseList(List<String> originalList) {
 * 
 * List<String> rev = new ArrayList<String>();
 * 
 * Iterator<String> it = originalList.iterator();
 * 
 * while(it.hasNext()) { rev.add(0, it.next()); } return rev; } }
 */

/*
 Problem 2: 
Create a method `removeDuplicates` that takes a List of integers and removes 
duplicate elements.
*/

/*
 * public class Problem_Collection { public static void main(String[] args) {
 * 
 * List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 3, 6);
 * removeDuplicates(numbers);
 * 
 * 
 * 
 * }
 * 
 * private static void removeDuplicates(List<Integer> numbers) {
 * 
 * Iterator<Integer> it = numbers.iterator();
 * 
 * Set<Integer> st = new TreeSet<>();
 * 
 * while(it.hasNext()) { st.add(it.next()); }
 * 
 * System.out.println(st); } }
 */

/*
Problem 3: 
Implement a method `findElement` that takes a List of strings and a target string, 
and returns the index of the target string in the list.
*/



/*
 * public class Problem_Collection { public static void main(String[] args) {
 * 
 * List<String> words = Arrays.asList("apple", "banana", "orange", "grapes");
 * String target = "orange"; System.out.println(findElement(words, target));
 * 
 * }
 * 
 * private static int findElement(List<String> words, String target) {
 * 
 * if(words.indexOf(target) > -1) { return words.indexOf(target); }
 * 
 * return -1; } }
 */


