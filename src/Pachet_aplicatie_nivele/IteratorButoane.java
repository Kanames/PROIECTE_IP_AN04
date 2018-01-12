public class IteratorButoane implements IIteratorNivel02{
      int index;
      
      @Override
      public boolean hasNext(){
          if(index < butoaneNivel02.size()){
              return true;
          }
         return false;
      }
      
      @Override
       public Object next(){
          if(this.hasNext()){
              return butoaneNive02.iterator();
          }
       }
