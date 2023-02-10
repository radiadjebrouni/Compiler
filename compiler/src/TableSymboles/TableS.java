package TableSymboles;

import java.util.HashMap;


public class TableS

{

   public HashMap<String,TSobjects> table= new HashMap<String,TSobjects>();



  public boolean lookUp(String s)
  {
  return table.containsKey(s);
  }

  public void addObject(String s,TSobjects o)
  {

      table.put(s,o);
  }

  public void deleteObject(String s)
  {
     table.remove(s);
  }
  public void update(String s,Object value)
  {
      TSobjects o=table.get(s);
      o.setValue(value);
     table.put(s,o);
  }

  public TSobjects getObject(String s)
  {
      return table.get(s);
  }

}
