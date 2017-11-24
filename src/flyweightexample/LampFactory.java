
package flyweightexample;

import java.util.HashMap;
import java.util.Map;

public class LampFactory {
    
    //map of already created lamps - keys are the color string, values are the actual Lamp objects
    private Map<String, Lamp> lamps;
    
    //constructor
    public LampFactory(){
        lamps = new HashMap<>();
    }
    
    //main method to call for getting a Lamp object. Checks to see if the specified
    //colored lamp has already been created. If it has, return that lamp object. If not,
    //create the new colored lamp, save it to the map, and then return that lamp.
    public Lamp getLamp(String color){
        Lamp returnLamp;
        
        if(lamps.containsKey(color)){
            returnLamp = lamps.get(color);
        }else{
            returnLamp = new Lamp(color);
            lamps.put(color, returnLamp);
        }
        
        return returnLamp;
    }
    
    //return the number of new lamps made, which corresponds to the number of lamps in the map
    public int totalLampsMade(){
        return lamps.size();
    }
    
}
