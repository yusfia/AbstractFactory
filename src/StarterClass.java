
public class StarterClass {
	public static void main(String[] args) {
		GUIApplication application = new GUIApplication(new GraphicalUIFactoryImpl());
		application.createUI();
		application.drawUI();
	}
}
