package flyweightexample;

//main demonstration of flyweight in action

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Tree with hard-coded number of branches
public class ChristmasTree {

    private LampFactory lampFactory;
    private List<TreeBranch> branches;
    private int lampsHung;

    public ChristmasTree(){
        lampFactory = new LampFactory();
        lampsHung = 0;
        branches = new ArrayList<>();
        initBranches();
    }
    
    //generate branches 1 through 10 on the tree
    private void initBranches(){
        for(int i = 0; i <= 9; i++){
            branches.add(new TreeBranch(i));
        }
    }
    
    //hang lamps on branches by calling the lampFactory to get the passed lamp color and hang it on the
    //indicated branch. Defaults to branch 0 if invalid branchNum passed.
    public void hangLamp(String color, int branchNum){
        TreeBranch branchBeingHung;
        
        //default to branch 0 if out of bounds branch is passed
        if((branchNum < 0) || (branchNum > 9)){
            branchBeingHung = branches.get(0);
        }else{
            branchBeingHung = branches.get(branchNum);
        }
        
        branchBeingHung.hangLamp(lampFactory.getLamp(color)); //hang the lamp by calling the lampFactory to get appropriate object
        lampsHung++; //count lamps hung
    }
    
    //Decorate the tree with a pre-arranged set of lamp colors and branch values.
    //Note that three colors are hung on each of 8 branches for a total of 24 lamps hung.
    public void decorateTree(){
        hangLamp("red", 1);
        hangLamp("blue", 1);
        hangLamp("yellow", 1);
        hangLamp("red", 2);
        hangLamp("blue", 2);
        hangLamp("yellow", 2);
        hangLamp("red", 3);
        hangLamp("blue", 3);
        hangLamp("yellow", 3);
        hangLamp("red", 4);
        hangLamp("blue", 4);
        hangLamp("yellow", 4);
        hangLamp("red", 5);
        hangLamp("blue", 5);
        hangLamp("yellow", 5);
        hangLamp("red", 6);
        hangLamp("blue", 6);
        hangLamp("yellow", 6);
        hangLamp("red", 7);
        hangLamp("blue", 7);
        hangLamp("yellow", 7);
        hangLamp("red", 8);
        hangLamp("blue", 8);
        hangLamp("yellow", 8);
    }
    
    public int getLampsHung(){
        return lampsHung;
    }
    
    public int getLampsMade(){
        return lampFactory.totalLampsMade();
    }
    
}
