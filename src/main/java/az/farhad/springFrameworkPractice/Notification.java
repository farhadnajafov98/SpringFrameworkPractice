package az.farhad.springFrameworkPractice;

public class Notification {
    private Message message;
    private Employee employee;

    // constructor injection
    public Notification(Message message, Employee employee) {
        this.message = message;
        this.employee=employee;
    }


    //setter injection
    public void setMessage(Message message) {
        this.message = message;
    }

    public void alert(){
        System.out.println("Notification");
        message.send();
        System.out.println(employee);
    }
}
