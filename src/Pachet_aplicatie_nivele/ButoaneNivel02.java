package Pachet_aplicatie_nivele;


public class ButoaneNivel02 implements IButoaneNivel02{
    public ArrayList<Button> butoaneNivel02;
    
    @Override
    public IteratorButoane getIterator(int numberOfButtonsPerRow){
        butoaneNivel02 = new ArrayList<Button>();
        for(){
          Button btn = new ButtonNivel02Implementare();
          butoaneNivel02.add(btn);
        }
        return new IteratorButoane();
    }
}
