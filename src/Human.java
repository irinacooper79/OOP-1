public class Human {

    public String name;
    public int yearOfBirth;

    public String town;
    public String jobTitle;

    public Human(String name, String town, int yearOfBirth, String jobTitle) {
        this.name = ValidationUtils.validOrDefault (name, "Информация не указана");
        this.town = ValidationUtils.validOrDefault (town, "Информация не указана");
        this.yearOfBirth = Math.max (yearOfBirth, 0);
        this.jobTitle = ValidationUtils.validOrDefault (JobTitle, "Информация не указана");

        private String validOrDefault(String value, String defaultValue);
        if (value == null || value.isBlank()){
            return defaultValue;
        }else{
            return value;
        }
    }
    public String toString(){
        return ("Привет! Меня зовут" + name +". Я из города" + town +".
        Я родилась в"+ yearOfBirth +" году. Я работаю в должности" + jobTitle +".
                Будем знакомы!");
    }
}



