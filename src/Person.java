public class Person {
    private String name;
    private String nationality;
    private int age;
    private String colour;
    private char sex;

    public void setName(String myName){
        name = myName;
    }

    public String getName(){
        return name;
    }

    public void setNationality(String national){
        nationality = national;
    }

    public String getNationality(){
        return nationality;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int myAge){
        age = myAge;
    }

    public void setColour(String color){
        colour = color;
    }

    public String getColor(){
        return colour;
    }

    public void setSex(char s){
        sex = s;
    }

    public char getSex(){
        return sex;
    }
}
