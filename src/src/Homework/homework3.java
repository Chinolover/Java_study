package src.Homework;

public class homework3 {
    public static void main(String[] args) {
        Week[] ttt = Week.values();
        for (Week t :
                ttt) {
            System.out.println(t.toString());
        }
    }
}

enum Week{

    One("1"),Two("2"),Three("3"),Four("4"),Five("5"),Six("6");

    private String name ;

    public String getName() {
        return name;
    }

    private Week(String name) {
        this.name = name;
    }

}