package Lab_P06_StackOfStrings;

import java.util.ArrayList;
import java.util.List;

public class StackOfStrings {
    private List<String> data;
    public StackOfStrings(){
        this.data= new ArrayList<>();
    }
    public void push(String item){
        this.data.add(item);
    }
    public String pop(){
       String element= this.data.get(this.data.size()-1);
       this.data.remove(this.data.size()-1);
       return element;
    }
    public String peek(){
        return this.data.get(this.data.size()-1);
    }
    public boolean isEmpty(){
        if(this.data.size()==0){
            return true;
        }
        return false;
    }
}
