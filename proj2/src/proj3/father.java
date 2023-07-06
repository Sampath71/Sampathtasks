package proj3;

public class father {
    public static void showsF() {
        System.out.println("He is the father");
    }
}

class Daughter extends father {
    public static void showsD() {
        System.out.println("She is the daughter");
    }
}

class Son extends father {
    public static void showsS() {
        System.out.println("He is the son");
    }
}

class Grandfather extends father {
    public static void showsG() {
        System.out.println("He is the grandfather");
    }

	}



