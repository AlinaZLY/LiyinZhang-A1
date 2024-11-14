class Appointment {
    String patientName;
    String mobilePhone;
    String time;
    HealthProfessional doctor;

    public Appointment(String patientName, String mobilePhone, String time, HealthProfessional doctor) {
        this.patientName = patientName;
        this.mobilePhone = mobilePhone;
        this.time = time;
        this.doctor = doctor;
    }

    public void printDetails() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Mobile Phone: " + mobilePhone);
        System.out.println("Time Slot: " + time);
        System.out.println("Doctor Details:");
        doctor.printDetails();
    }
}
