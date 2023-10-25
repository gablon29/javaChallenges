import com.sun.jdi.event.ClassUnloadEvent;

public class Clubes {
    String name;
    int people;
    String deport;

    void events(){
        System.out.println("Make event tomorrow");
    }
    String generateEvents(String day){
        return ("Events save successfully");
    }
    public static void main(String[] args) {
        Clubes clubes = new Clubes();
        clubes.name = "Gabriel";
        System.out.println(clubes.name);
        clubes.events();
    }
}
