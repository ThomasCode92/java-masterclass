public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            Student s = new Student("S92300" + i,
                    switch (i) {
                        case 0 -> "Mary";
                        case 1 -> "Caral";
                        case 2 -> "Tim";
                        case 3 -> "Harry";
                        case 4 -> "Lisa";
                        default -> "Unknown Student";
                    },
                    "05/11/1985",
                    "Java Masterclass");
            System.out.println(s);
        }
    }
}
