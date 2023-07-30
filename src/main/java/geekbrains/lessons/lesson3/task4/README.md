# Task 4

Write a method whose input is a two-dimensional string array of size 4x4. When submitting
an array of a different size, it is necessary to throw a MyArraySizeException exception.

Next, the method should go through all the elements of the array, convert to int
and sum. If the conversion failed in some element of the array (for example, there
is a symbol or text in the cell instead of a number), a MyArrayDataException exception
should be thrown with details in which cell the incorrect data lies.

In the `main()` method, call the received method, handle possible exceptions `MyArraySizeException`
and `MyArrayDataException` and output the result of the calculation (the sum of
the elements, provided that the correct array was submitted for input).
