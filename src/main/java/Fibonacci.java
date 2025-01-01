package main.java;

// Class to calculate Fibonacci numbers
public class Fibonacci {

  // Method to generate Fibonacci series up to n terms
  public static void generateFibonacci(int n) {
      int first = 0, second = 1;

      // Print the first n Fibonacci numbers
      System.out.println("Fibonacci Series up to " + n + " terms:");
      for (int i = 1; i <= n; i++) {
          System.out.print(first + " ");
          int next = first + second;
          first = second;
          second = next;
      }
  }

  // Main method
  public static void main(String[] args) {
      int terms = 10; // Number of terms to generate
      generateFibonacci(terms);
  }
}

