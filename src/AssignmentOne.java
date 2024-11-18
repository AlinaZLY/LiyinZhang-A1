import java.util.ArrayList;

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
        ArrayList<Appointment> appointments = new ArrayList<>();

        createAppointment(appointments, "Liyin Zhang", "17708489078", "10:00", gp1);
        createAppointment(appointments, "Wentao Yin", "13808459999", "14:30", ahp1);

        printExistingAppointments(appointments);

        System.out.println("------------------------------");
        cancelBooking(appointments, "17708489078");
        cancelBooking(appointments, "10086");

        printExistingAppointments(appointments);
    }

    // Create a new booking and add it to the ArrayList of appointments
    public static void createAppointment(ArrayList<Appointment> appointments, String patientName, String mobilePhone, String timeSlot, HealthProfessional doctor) {
        Appointment newAppointment = new Appointment(patientName, mobilePhone, timeSlot, doctor);
        appointments.add(newAppointment);
    }

    // Display existing appointments in the ArrayList
    public static void printExistingAppointments(ArrayList<Appointment> appointments) {
        if (appointments.isEmpty()) {
            System.out.println("No existing appointments.");
        } else {
            for (Appointment appointment : appointments) {
                appointment.printDetails();
                System.out.println();
            }
        }
    }

    // Cancel a booking using a patient's mobile phone
    public static void cancelBooking(ArrayList<Appointment> appointments, String mobilePhone) {
        boolean removed = false;
        for (Appointment appointment : appointments) {
            if (appointment.mobilePhone.equals(mobilePhone)) {
                appointments.remove(appointment);
                removed = true;
                System.out.println("Appointment with mobile phone " + mobilePhone + " is removed.");
                break;
            }
        }
        if (!removed) {
            System.out.println("Appointment with mobile phone " + mobilePhone + " not found.");
        }
    
    }

}
