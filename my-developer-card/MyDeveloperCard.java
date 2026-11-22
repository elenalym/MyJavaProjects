public class MyDeveloperCard {
    static void main(String[] args) {

        // Store Variables
        String firstName = "Elena";
        String lastName = "Lymperi";
        String title1 = "Aspiring Full Stack Developer";
        String title2 = "Digital Humanist";
        String education1 = "M.Sc. Digital Humanities (AUEB)";
        String education2 = "Coding Factory";
        String skills = "Java, SQL, Python, XML, GIS, NLP";
        int projectsBuilt = 1;

        // Create reusable card borders
        String border = "=".repeat(62);

        // 4. Print
        System.out.println(border);
        System.out.println("                  MY DEVELOPER CARD                   ");
        System.out.println(border);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Role: " + title1 + " " + "||" + " " + title2);
        System.out.println("Background: " + education1 + " " + "||" + " " + education2);
        System.out.println("Skills: " + skills);
        System.out.println("Projects: " + projectsBuilt);
    }
}
