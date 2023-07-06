package proj3;

public class family {
    public static void main(String[] args) {
        Daughter daughter = new Daughter();
        Son son = new Son();
        father father = new father();
        Grandfather grandfather = new Grandfather();

        Daughter.showsD();
        Son.showsS();
        father.showsF();
        Grandfather.showsG();
    }
}