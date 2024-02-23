public class Git {
    public static void main(String[] args) {
        English eng = new English();
        eng.getMessage();
        CompterScience cs = new CompterScience();
        cs.getMessage();

    }
}

class Mathmatics {
    public int add(int a, int b) {
        System.out.println("this is addition");
        return a + b;
    }

    public int subtract(int a, int b) {
        System.out.println("this is substraction");
        return a - b;
    }
}

class English {
    public String getMessage() {
        System.out.println("this is english");
        return "hello my name is aniket nigam and i am learning git";
    }
}

class CompterScience {
    public String getMessage() {
        System.out.println("git learning");
        System.out.println("i am using get merge tool now ");
        return "hello my name is aniket nigam and i am learning git and this is computer science branch ";
    }
}
