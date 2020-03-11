package T1908a.lap4.bookandauthor;

public class author {
    String name;
    String email;
    char gender;

    public author(String name, String email, char gender) {
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
        return "Author[name ="+name+"email="+email+"gender="+gender+"]";
    }
}
