package Pachet_nivel_02;

public class IteratorButoane implements IIteratorNivel02 {
	int index;

	@Override
	public boolean hasNext() {
		if (index < ButoaneNivel02.butoaneNivel02.size()) {
			return true;
		}
		return false;
	}

	@Override
	public Object next() {
		if (this.hasNext()) {
			return ButoaneNivel02.butoaneNivel02.toArray()[index++];
		}
		return null;
	}
}
