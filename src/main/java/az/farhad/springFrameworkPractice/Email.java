package az.farhad.springFrameworkPractice;

public class Email implements Message {

    @Override
    public void send() {
        System.out.println("Email was sent succcesfully");
    }
}
