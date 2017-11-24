
package flyweightexample;


public class FlyweightExample {

    public static void main(String[] args) {
        
        ChristmasTree ohChristmasTree = new ChristmasTree();
        
        ohChristmasTree.decorateTree();
        System.out.println("The total number of lamps made was: " + ohChristmasTree.getLampsMade());
        System.out.println("The total number of lamps hung on the tree was: " + ohChristmasTree.getLampsHung());
    }
    
}
