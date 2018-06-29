package Lab_P05_SayHelloExtend;


public class Chinese extends BasePerson implements Person {
    public Chinese(String name) {
        super(name);
    }
    @Override
    public String sayHello() {
        return "Djydjybydjy";
    }
}
