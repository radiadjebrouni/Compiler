import java.util.LinkedList;

public class Quadgen {

    static   LinkedList<Quad>  quad = new LinkedList<>();

      public int addQuad(String op,String label,String param1,String param2){
        return addQuad(new Quad(op,label,param1,param2));
    }
     
    public int addQuad(Quad q){
        quad.add(q);
        return quad.size();
    }

    public Quad getQuad(int i){
        return quad.get(i);
    }

    public int size(){
        return quad.size();
    }
}