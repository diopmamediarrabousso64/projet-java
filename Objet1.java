class Objet1 {
    void m(Objet2 o2) {
        o2.afficheHelloWorld();
    }
}

class Objet2 {
    void afficheHelloWorld() {
        System.out.println("Hello world");
    }
}

public class MainProgram {
    public static void main(String[] args) {
        Objet1 o1 = new Objet1();
        Objet2 o2 = new Objet2();

        o1.m(o2);
    }
}
