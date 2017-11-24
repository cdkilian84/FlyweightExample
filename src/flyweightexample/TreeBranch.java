
package flyweightexample;

import java.util.ArrayList;
import java.util.List;

public class TreeBranch {
    private int branchNum;
    private List<Lamp> hungLamps;
    
    public TreeBranch(int branchNum){
        this.branchNum = branchNum;
        hungLamps = new ArrayList<>();
    }
    
    public void hangLamp(Lamp lamp){
        hungLamps.add(lamp);
        System.out.println("Hang " + lamp.getLampColor() + " lamp on branch " + branchNum);
    }
    
    public List<Lamp> getHungLamps(){
        return hungLamps;
    }
    
    public int getBranchNum(){
        return branchNum;
    }
}
