
package flyweightexample;

//This is the object which would need instantiating potentially many times
public class Lamp {
    private String color;
    
    public Lamp(String newColor){
        color = newColor;
    }
    
    public String getLampColor(){
        return color;
    }
    
}
