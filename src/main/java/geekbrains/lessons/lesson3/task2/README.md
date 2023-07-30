# Task 2

Create a Counter class that has an `add()` method that increases the value of an internal
int variable by 1. Make it so that you can work with an object of this type in the
`try-with-resources` block.

Think about what should happen when this resource is closed? Write a method to check
if the resource is closed. When trying to call `add()` on a closed resource, an
`IOException` should be thrown.
