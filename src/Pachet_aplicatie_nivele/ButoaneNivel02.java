package Pachet_aplicatie_nivele;


public class ButoaneNivel02 implements IButoaneNivel02{
    public ArrayList<Button> butoaneNivel02;
    
    @Override
    public IIteratorNivel02 getIterator(int numberOfButtonsPerRow){
        butoaneNivel02 = new ArrayList<Button>();
        for(){
          //Button btn1 = new ButtonNivel02();
          //preparingButton(btn1);
          butoaneNivel02.add(new Button());
        }
        return new IteratorButoane();
    }
    
    private class IteratorButoane implements IIteratorNivel02{
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
}
