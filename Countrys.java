// Superclass (Parent Class)
class Countrys {
    String name;
    long population;

    public Country(String name, long population) {
        this.name = name;
        this.population = population;
    }

    public void displayCountryInfo() {
        System.out.println("Country Name: " + name);
        System.out.println("Population: " + population);
    }
}

// Subclass (Child Class) inheriting from Country
class Capital extends Country {
    String capitalCityName;

    public Capital(String countryName, long countryPopulation, String capitalCityName) {
        // Call the constructor of the superclass (Country)
        super(countryName, countryPopulation);
        this.capitalCityName = capitalCityName;
    }

    public void displayCapitalInfo() {
        // Access inherited method from Country class
        displayCountryInfo(); 
        System.out.println("Capital City: " + capitalCityName);
    }
}

// Main class to demonstrate single inheritance
public class CountryInheritance {
    public static void main(String[] args) {
        // Create an object of the subclass Capital
        Capital indiaCapital = new Capital("India", 1400000000L, "New Delhi");

        // Call methods of the subclass, which also access inherited methods
        indiaCapital.displayCapitalInfo(); 
    }
}