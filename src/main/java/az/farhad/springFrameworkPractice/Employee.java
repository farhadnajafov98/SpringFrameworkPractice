package az.farhad.springFrameworkPractice;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Employee {

    private String name;
    private String surname;
    private int age;
    private double salary;

    private List<Device> device;
    private Map<String, Device> deviceMap;
    private Properties property;

    public Employee(String name, String surname, int age, double salary, List<Device> device, Map<String, Device> deviceMap, Properties property) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.device = device;
        this.deviceMap = deviceMap;
        this.property = property;
    }

    public Employee(String name, String surname, int age, double salary, List<Device> device, Map<String, Device> deviceMap) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.device = device;
        this.deviceMap = deviceMap;
    }

    public Employee(String name, String surname, int age, double salary, List<Device> device) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.device = device;
    }



    public Employee(){}
    public Employee(String name, String surname, int age, double salary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
    }
    public Employee(int age , int salary){
        this.age = age;
        this.salary  =salary;
    }

    public Employee (String name, String surname){
        this.name = name;
        this.surname = surname;
    }
    public Employee(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age  = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<Device> getDevice() {
        return device;
    }

    public void setDevice(List<Device> device) {
        this.device = device;
    }

    public Map<String, Device> getDeviceMap() {
        return deviceMap;
    }

    public void setDeviceMap(Map<String, Device> deviceMap) {
        this.deviceMap = deviceMap;
    }

    public Properties getProperty() {
        return property;
    }

    public void setProperty(Properties property) {
        this.property = property;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", device=" + device +
                ", deviceMap=" + deviceMap +
                ", property=" + property +
                '}';
    }
}
