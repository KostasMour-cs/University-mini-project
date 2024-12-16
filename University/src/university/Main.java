package university;

public class Main {

    public static void main(String[] args) {
        Students S1, S2;

        // Δημιουργία του φοιτητή Babis
        S1 = new Students("Babis");
        S1.setID("11314");

        // Δημιουργία μαθημάτων
        Course C1 = new Course("Java");
        Course C2 = new Course("Python");
        Course C3 = new Course("Ruby");

        // Εγγραφή του Babis σε μαθήματα
        S1.addCourse(C1);
        S1.addCourse(C2);
        S1.addCourse(C3);

        // Εκτύπωση πληροφοριών του Babis
        S1.printInfo();

        // Δημιουργία του φοιτητή Takis
        S2 = new Students("Takis");
        S2.setID("12345");

        // Εγγραφή του Takis στο μάθημα Java
        S2.addCourse(C1);

        // Εκτύπωση πληροφοριών του μαθήματος Java
        C1.printInformation();
    }
}
