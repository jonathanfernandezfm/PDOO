 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;
import java.util.ArrayList;
import napakalaki.Treasure;
import napakalaki.TreasureKind;
/**
 *
 * @author manuelvf
 */
public abstract class BadConsequence {
    static final int MAXTREASURES = 10;
    private String text;
    protected int levels;
    private int nVisibleTreasures;
    private int nHiddenTreasures;
    private boolean death;
    private ArrayList<TreasureKind> specificHiddenTreasures = new ArrayList();
    private ArrayList<TreasureKind> specificVisibleTreasures = new ArrayList();
    
    public abstract boolean isEmpty();
    public abstract void substractVisibleTreasure(Treasure t);
    public abstract void substractHiddenTreasure(Treasure t);
    public abstract BadConsequence adjustToFitTreasureLists(ArrayList<Treasure> v,ArrayList<Treasure> h);
    public BadConsequence(String text, int levels){
        this.text = text;
        this.levels = levels;
    }
   /* BadConsequence(String text, int levels, int nVisible, int nHidden){
        this.text = text;
        this.levels = levels;
        nVisibleTreasures = nVisible;
        nHiddenTreasures = nHidden;
    }
    BadConsequence(String text, boolean death){
        this.text = text;
        this.death = death;
    }
    BadConsequence(String text, int levels, ArrayList<TreasureKind> tVisible, ArrayList<TreasureKind> tHidden){
        this.text = text;
        this.levels = levels;
        specificHiddenTreasures = tHidden;
        specificVisibleTreasures = tVisible;
    }
    */
    public String getText(){
        return text;
    }
    public int getLevels(){
        return levels;
    }
    public String toString(){
        return "\nMal rollo: \n" + text + "  //  Niveles: " + Integer.toString(levels) + "\nTesoros Visibles: " + Integer.toString(nVisibleTreasures) +
                "\nHidden Treasures: " + Integer.toString(nHiddenTreasures);
    }
    public boolean getDeath(){
        return death;
    }
    /*
    public int getVisible(){
        return nVisibleTreasures;
    }
    public int getHidden(){
        return nHiddenTreasures;
    }

    public ArrayList getTVisible(){
        return specificVisibleTreasures;
    }
    public ArrayList getTHidden(){
        return specificHiddenTreasures;
    }
    
    public boolean isEmpty(){
        boolean empty=false;
        if(levels==0 && nVisibleTreasures==0 && nHiddenTreasures==0 && specificHiddenTreasures.isEmpty() && specificVisibleTreasures.isEmpty())
            empty=true;
        return empty;
        
    }
    public void substractVisibleTreasure(Treasure t){
        if(nVisibleTreasures!=0)
            nVisibleTreasures--;
        else
            specificVisibleTreasures.remove(t.getType());
        
    }
    public void substractHiddenTreasure(Treasure t){
        if(nHiddenTreasures != 0)
             nHiddenTreasures--;
        else
            specificHiddenTreasures.remove(t.getType());
        
    }
    
    public BadConsequence adjustToFitTreasureLists(ArrayList<Treasure> v, ArrayList<Treasure> h){     
        ArrayList<TreasureKind> tVisible = new ArrayList();
        ArrayList<TreasureKind> tHidden = new ArrayList();
            
        if(!specificVisibleTreasures.isEmpty() || !specificHiddenTreasures.isEmpty()){
            if(!specificVisibleTreasures.isEmpty()){
                for (Treasure t: v) {
                    if (specificVisibleTreasures.contains(t.getType())) {
                        tVisible.add(t.getType());
                    }
            if(!specificHiddenTreasures.isEmpty()){
                for (Treasure t: h) {
                    if (specificHiddenTreasures.contains(t.getType())) {
                        tHidden.add(t.getType());
                    }
                }
            }
            BadConsequence bc = new BadConsequence(this.text, 0, tVisible, tHidden);
            return bc;
        }else{
            int nHidden;
            int nVisible;
            if(nHiddenTreasures < h.size())
                nHidden = nHiddenTreasures;
            else
                nHidden = h.size();
            if(nVisibleTreasures < v.size())
                nVisible = nVisibleTreasures;
            else
                nVisible = v.size();
            BadConsequence bc = new BadConsequence(this.text, 0, nVisible, nHidden);
            return bc;
        }
}
*/
}