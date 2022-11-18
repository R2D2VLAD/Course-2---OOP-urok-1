public class Human {
    public String name;
    public String town;
    public int yearOfBirth;
    public String jobTitle;


    public Human(String name, String town, int yearOfBirth, String jobTitle) {
        this.name = name;
        this.town = town;
        this.yearOfBirth = yearOfBirth;
        this.jobTitle = jobTitle;
    }

    public String getName() {
        return this.name;
    }

    public String getTown() {
        return this.town;
    }

    public int getYearOfBirth() {
        return this.yearOfBirth;
    }

    public String getJobTitle() {
        return this.jobTitle;
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + getName() + ". Я из города " + getTown() + ". Я родился(родилась) в "
                + getYearOfBirth() + " году. Я работаю на должности " + getJobTitle() + ". Будем знакомы!";
    }
}
