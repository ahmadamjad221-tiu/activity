package act2;
public class classActivity1 {
     private String Name;
    private int Age;
    private String Country;

    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getAge() {
        return Age;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getCountry() {
        return Country;
    }
    public void displaydata() {
    System.out.println("Name: " + Name);
    System.out.println("Age: " + Age);
    System.out.println("Country: " + Country);
} 
}
