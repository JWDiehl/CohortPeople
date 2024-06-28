package zipcode.rocks;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private List handWrittenLoadOfData() {
        ArrayList<Person> students = new ArrayList<>();

        //Cohort Data
        Person newPerson = new Person("Teddy", "Archibald");
        newPerson.setFirstname("Teddy");
        newPerson.setLastname("Archibald");
        newPerson.setPets("No");
        newPerson.setFavoriteColor("Red");
        newPerson.setBirthMonth("March");
        newPerson.setFavoriteBeverage("Half & Half");
        students.add(newPerson);

        Person newPerson1 = new Person("Peter", "Murray Hopper");
        newPerson1.setFirstname("Peter");
        newPerson1.setLastname("Van Beever");
        newPerson1.setPets("Yes");
        newPerson1.setFavoriteColor("Purple");
        newPerson1.setBirthMonth("February");
        newPerson1.setFavoriteBeverage("Latte");
        students.add(newPerson1);

        Person newPerson2 = new Person("Tim", "Hamilton");
        newPerson2.setFirstname("Tim");
        newPerson2.setLastname("Linkous");
        newPerson2.setPets("No");
        newPerson2.setFavoriteColor("Green");
        newPerson2.setBirthMonth("September");
        newPerson2.setFavoriteBeverage("Water");
        students.add(newPerson2);

        Person newPerson3 = new Person("Grace", "Murray Hopper");
        newPerson3.setFirstname("Qian");
        newPerson3.setLastname("Wang");
        newPerson3.setPets("No");
        newPerson3.setFavoriteColor("Blue");
        newPerson3.setBirthMonth("October");
        newPerson3.setFavoriteBeverage("Water");
        students.add(newPerson3);

        Person newPerson4 = new Person("Margaret", "Hamilton");
        newPerson4.setFirstname("Diptka");
        newPerson4.setLastname("Devi");
        newPerson4.setPets("No");
        newPerson4.setFavoriteColor("Orange");
        newPerson4.setBirthMonth("June");
        newPerson4.setFavoriteBeverage("Tea");
        students.add(newPerson4);

        Person newPerson5 = new Person("Grace", "Murray Hopper");
        newPerson5.setFirstname("Ian");
        newPerson5.setLastname("Gordon");
        newPerson5.setPets("Yes");
        newPerson5.setFavoriteColor("Green");
        newPerson5.setBirthMonth("April");
        newPerson5.setFavoriteBeverage("Water");
        students.add(newPerson5);

        Person newPerson6 = new Person("Margaret", "Hamilton");
        newPerson6.setFirstname("Tim");
        newPerson6.setLastname("Nyugen");
        newPerson6.setPets("Yes");
        newPerson6.setFavoriteColor("White");
        newPerson6.setBirthMonth("November");
        newPerson6.setFavoriteBeverage("Bubble Tea");
        students.add(newPerson6);

        Person newPerson7 = new Person("Grace", "Murray Hopper");
        newPerson7.setFirstname("Bryan");
        newPerson7.setLastname("Smith");
        newPerson7.setPets("No");
        newPerson7.setFavoriteColor("Brown");
        newPerson7.setBirthMonth("May");
        newPerson7.setFavoriteBeverage("Water");
        students.add(newPerson7);

        Person newPerson8 = new Person("Margaret", "Hamilton");
        newPerson8.setFirstname("Jonathan");
        newPerson8.setLastname("Diehl");
        newPerson8.setPets("Yes");
        newPerson8.setFavoriteColor("Green");
        newPerson8.setBirthMonth("February");
        newPerson8.setFavoriteBeverage("Coffee");
        students.add(newPerson8);

        Person newPerson9 = new Person("Grace", "Murray Hopper");
        newPerson9.setFirstname("Jared");
        newPerson9.setLastname("Thacker");
        newPerson9.setPets("Yes");
        newPerson9.setFavoriteColor("Green");
        newPerson9.setBirthMonth("December");
        newPerson9.setFavoriteBeverage("Water");
        students.add(newPerson9);

        Person newPerson10 = new Person("Margaret", "Hamilton");
        newPerson10.setFirstname("Robbie");
        newPerson10.setLastname("Niemeyer");
        newPerson10.setPets("No");
        newPerson10.setFavoriteColor("Blue");
        newPerson10.setBirthMonth("January");
        newPerson10.setFavoriteBeverage("Water");
        students.add(newPerson10);

        Person newPerson11 = new Person("Grace", "Murray Hopper");
        newPerson11.setFirstname("Mohammed");
        newPerson11.setLastname("N.");
        newPerson11.setPets("No");
        newPerson11.setFavoriteColor("Green");
        newPerson11.setBirthMonth("August");
        newPerson11.setFavoriteBeverage("Snapple");
        students.add(newPerson11);

        Person newPerson12 = new Person("Margaret", "Hamilton");
        newPerson12.setFirstname("Josue");
        newPerson12.setLastname("Castro");
        newPerson12.setPets("Yes");
        newPerson12.setFavoriteColor("Blue");
        newPerson12.setBirthMonth("June");
        newPerson12.setFavoriteBeverage("coffee");
        students.add(newPerson12);

        Person newPerson13 = new Person("Grace", "Murray Hopper");
        newPerson13.setFirstname("Corey");
        newPerson13.setLastname("Ross");
        newPerson13.setPets("No");
        newPerson13.setFavoriteColor("Black");
        newPerson13.setBirthMonth("October");
        newPerson13.setFavoriteBeverage("Water");
        students.add(newPerson13);

        Person newPerson14 = new Person("Margaret", "Hamilton");
        newPerson14.setFirstname("Will");
        newPerson14.setLastname("Chapman");
        newPerson14.setPets("No");
        newPerson14.setFavoriteColor("Purple");
        newPerson14.setBirthMonth("December");
        newPerson14.setFavoriteBeverage("Water");
        students.add(newPerson14);

        return students;
    }

        // adding the comma
        private static final String COMMA_DELIMITER = ",";

        public static void main (String[]args){
            String student_source = "FakeData.csv";

            // Load data file into an ArrayList<Person> of Person objects.
            Main programObject = new Main();

            List listOfStudents = programObject.handWrittenLoadOfData();

            //Prints in order
            int numberOfPersons = listOfStudents.size();
            for (int i = 0; i < numberOfPersons; i++) {
                System.out.println(listOfStudents.get(i).toString());
            }
        }

        private List loadCSVFile (String student_source){
            ArrayList<Person> records = new ArrayList<>();

            InputStream inputStream = getClass().getClassLoader().getResourceAsStream(student_source);

            try (Scanner scanner = new Scanner(inputStream)) {
                while (scanner.hasNextLine()) {
                    records.add(this.getRecordFromLine(scanner.nextLine()));
                }
            } catch (Exception e) {
                System.out.println("File NOT FOUND.");
                e.printStackTrace();
            }
            return records;
        }

        private Person getRecordFromLine (String line){
            // take the String of lastname,firstname and create a new Person object with it.
            String[] values = line.split(COMMA_DELIMITER);
            Person newPerson = new Person(values[0], values[1]);
            return newPerson;
        }

    }
