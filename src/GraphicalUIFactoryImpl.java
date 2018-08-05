
public class GraphicalUIFactoryImpl implements GraphicalUIFactory{

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new ButtonImpl();
	}

	@Override
	public Form createForm() {
		// TODO Auto-generated method stub
		return new FormImpl();
	}

}
