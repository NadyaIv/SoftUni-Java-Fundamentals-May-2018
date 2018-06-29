package Lab_P05_SayHelloExtend;


public class European extends BasePerson implements Person{
    public European(String name) {
        super(name);
    }
    @Override
    public String sayHello() {
        return "Hello";
    }
}
