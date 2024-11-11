class AnotherHealthProfessional extends HealthProfessional {
	private String specialization;
	
    public AnotherHealthProfessional(int ID, String name, String basicInfo, String specialization) {
        super(ID, name, basicInfo);
        this.specialization = specialization;
    }

    public void printDetails() {
        System.out.println("Health Professional Type: Another Health Professional");
        super.printDetails();
        System.out.println("Specialization: " + specialization);
    }
}