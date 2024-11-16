public class AssignmentOne {
    public static void main(String[] args) {
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. Zhang", "General Medicine", "Family Medicine");
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Yin", "General Medicine", "Internal Medicine");
        GeneralPractitioner gp3 = new GeneralPractitioner(3, "Dr. Zhao", "General Medicine", "Pediatrics");

        AnotherHealthProfessional ahp1 = new AnotherHealthProfessional(4, "Dr. Li", "Specialist in Dermatology", "Dermatology");
        AnotherHealthProfessional ahp2 = new AnotherHealthProfessional(5, "Dr. Wang", "Specialist in Cardiology", "Cardiology");

        gp1.printDetails();
        gp2.printDetails();
        gp3.printDetails();
        ahp1.printDetails();
        ahp2.printDetails();

        System.out.println("------------------------------");
    }
}
