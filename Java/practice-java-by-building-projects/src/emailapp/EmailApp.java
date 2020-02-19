package emailapp;

public class EmailApp {

        public static void main(String[] args) {
            Email em1 = new Email("Gerardo", "Gutierrez","ACME");
            em1.setAlternateEmail("someEmail@company.com");
            em1.setMailboxCapacity(2);
            em1.setPassword("thisIsAneWPa55WD");
            //System.out.println(em1.getAlternateEmail() + em1.getMailboxCapacity() + em1.getPassword());
            System.out.println(em1.showInfo());

        }


}
