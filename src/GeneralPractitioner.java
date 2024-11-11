class GeneralPractitioner extends HealthProfessional {
	private String specialization;

    public GeneralPractitioner(int ID, String name, String basicInfo, String specialization) {
        super(ID, name, basicInfo);
        this.specialization = specialization;
    }

    public void printDetails() {
        System.out.println("Health Professional Type: General Practitioner");
        super.printDetails();
        System.out.println("Specialization: " + specialization);
    }
}