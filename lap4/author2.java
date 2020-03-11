package T1908a.lap4.add;

public class author2 {
    String name;
    String email;
    char gender;

    public author2(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }
    public String toString(){
        return "name="+name+"\t email="+email+"\t gender="+gender;
    }
}
