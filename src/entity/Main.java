package entity;

public class Main{
    public static Object superSettings;
    private  String greeting;
    private String version;

    public Main() {
        this.greeting = "Hello user";
        this.version = "Version - 0.0.1";
    }

    public Main(String greeting, String version) {
        this.greeting = greeting;
        this.version = version;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }


}