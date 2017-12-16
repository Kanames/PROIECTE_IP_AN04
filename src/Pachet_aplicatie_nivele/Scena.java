package Pachet_aplicatie_nivele;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Paint;

public abstract class Scena extends Scene{
	
	public Scena(Parent root) {
		super(root);
	}

	public Scena(Parent root, double width, double height, Paint fill) {
		super(root, width, height, fill);
	}

	
	
}
