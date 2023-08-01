# Task

Write an application that will request the following data from the user in any order,
separated by a space (the data is entered in one line without commas):
Surname, first name, Patronymic, date of birth, phone number, gender.

Data formats:

- surname, first name, patronymic - strings.
- date of birth - string format `dd.mm.yyyy`.
- phone number - unsigned integer without formatting.
- gender - Latin character `f` or `m`.

The application should check the entered data by quantity. If the quantity does
not match the required one, return the error code. Create a method that will process
it and show the user a message that he has entered less or more data than required.

The application should try to parse the received values and select the required
parameters from them. If the data formats do not match, you need to throw an exception
corresponding to the type of problem. You can use the built-in java types or create
your own. The exception must be handled correctly, a message is displayed to the
user with information about what exactly is wrong.

If everything is entered and processed correctly, a file with a name equal to the
last name should be created. The received data should be recorded in it in one line,
of the form.

```plain
Surname FirstName patronymic, dateOfBirth, phone, gender
```

Namesakes should be written to the same file, in separate lines.

Don't forget to close the connection to the file.

If there is a problem with reading-writing to the file, the exception should be
handled correctly, the user should see the error stack trace.
