package geekbrains.homeworks.homework2;

import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            UserData userData = askUserData();
            writeFileUserData(userData);
        } catch (InvalidDataException e) {
            System.out.println("Error validating data: " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static UserData askUserData() throws InvalidDataException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter information about user:");
        String[] strs = sc.nextLine().split(" +");

        if (strs.length != 6) {
            throw new InvalidDataException("You have to pass 6 elements, but you passed only " + strs.length);
        }

        String name = null;
        String surname = null;
        String patronymic = null;
        Date birthdate = null;
        Integer phone = null;
        Character gender = null;

        for (String str : strs) {
            if (birthdate == null) {
                try {
                    birthdate = new SimpleDateFormat("dd.MM.yyyy").parse(str);
                    continue;
                } catch (ParseException ignored) {
                }
            }

            if (phone == null && str.matches("^[0-9]+$")) {
                phone = Integer.parseInt(str);
                continue;
            }

            if (gender == null && str.length() == 1) {
                if (str.equals("m")) {
                    gender = 'm';
                    continue;
                }

                if (str.equals("f")) {
                    gender = 'f';
                    continue;
                }
            }

            if (surname == null) {
                surname = str;
            } else if (name == null) {
                name = str;
            } else if (patronymic == null) {
                patronymic = str;
            }
        }

        if (name == null || surname == null || patronymic == null || birthdate == null ||
                phone == null || gender == null) {
            throw new InvalidDataException("Some of entered data is invalid");
        }

        return new UserData(name, surname, patronymic, birthdate, phone, gender);
    }

    public static void writeFileUserData(UserData userData) throws IOException {
        try (FileWriter writer = new FileWriter(userData.getSurname(), true)) {
            writer.write(userData.toFileString());
        }
    }
}
