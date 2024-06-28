package zipcode.rocks;

public class Person {
    private String firstname;
    private String lastname;
    private String pets;
    private String favoriteColor;
    private String birthMonth;
    private String favoriteBeverage;


//    public Person(String fname, String lname) {
//        this.firstname = fname;
//        this.lastname = lname;
//        this.pets = pets;
//        this.favoriteColor = favoriteColor;
//        this.birthMonth = birthMonth;
//        this.favoriteBeverage = favoriteBeverage;
//    }

    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.pets = pets;
        this.favoriteColor = favoriteColor;
        this.birthMonth = birthMonth;
        this.favoriteBeverage = favoriteBeverage;
    }

    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPets() {
        return pets;
    }

    public void setPets(String pets) {
        this.pets = pets;
    }

    public void setFavoriteColor(String favoriteColor) {
        this.favoriteColor = favoriteColor;
    }

    public void setBirthMonth(String birthMonth) {
        this.birthMonth = birthMonth;
    }

    public void setFavoriteBeverage(String favoriteBeverage) {
        this.favoriteBeverage = favoriteBeverage;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    public String getBirthMonth() {
        return birthMonth;
    }

    public String getFavoriteBeverage() {
        return favoriteBeverage;
    }

    public String toString() {
        return this.lastname + ", " + this.firstname + ", " + this.pets + ", " + this.favoriteColor + ", " + this.birthMonth + ", " + this.birthMonth;
    }
}
