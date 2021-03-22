package TableSymboles;

import java.util.ArrayList;
import java.util.HashMap;


public class TableS

{

   HashMap<String,TSobjects> table= new HashMap<String,TSobjects>();



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

  public TSobjects getObject(String s)
  {
      return table.get(s);
  }
}
