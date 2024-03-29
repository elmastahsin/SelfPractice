package day17_customMethod;

public class Address {
    public String buildingNumber, street, city, state, zipCode;

    public static String country = "United States", planet = " Earth";

    public void setInfo(String buildingNumber, String street, String city, String state, String zipCode) {
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return buildingNumber + " " + street + "\n" + city + " " + state + ", " + zipCode;
    }
}
/*5. Create a class named Address
    Attributes:
        buildingNumber, street, city, state, zipCode

    Actions
            setInfo: sets all the instances
            toString: returns the address
                        EX:
                            7925 Jones Branch Dr
                            McLean Va, 22012
*/