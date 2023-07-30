# Task 3

The following code is given, correct it where required:

```java
public static void main(String[] args) throws Exception {
    try {
        int a = 90;
        int b = 3;
        System.out.println(a / b);
        printSum(23, 234);
        int[] abc = { 1, 2 };
        abc[3] = 9;
    } catch (Throwable ex) {
        System.out.println("Something went wrong...");
    } catch (NullPointerException ex) {
        System.out.println("The pointer cannot point to null!");
    } catch (IndexOutOfBoundsException ex) {
        System.out.println("The array goes beyond its size!");
    }
}

public static void printSum(Integer a, Integer b) throws FileNotFoundException {
    System.out.println(a + b);
}
```
