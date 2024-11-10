

class HealthProfessional {
    private int ID;
    private String name;
    private String basicInfo;

    public HealthProfessional(int ID, String name, String basicInfo) {
        this.ID = ID;
        this.name = name;
        this.basicInfo = basicInfo;
    }

    public void printDetails() {
        System.out.println("ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Basic Info: " + basicInfo);
    }
}