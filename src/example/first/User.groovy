package example.first

/**
 * Created by cravo on 29/08/2016.
 */
@groovy.transform.ToString()
class User {
    String firstName;
    String lastName;

//    User(String first, String lastname) {
//        this.firstName = first;
//        this.lastName = lastname;
//    }

    void printFullName() {
        println "Fullname: $firstName $lastName";
    }
}