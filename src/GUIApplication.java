
public class GUIApplication {
	private Button button;
	private Form form;
	private GraphicalUIFactory factory;
	
	public GUIApplication(GraphicalUIFactory factory) {
		this.factory = factory;
	}
	
	public void createUI() {
		this.button = this.factory.createButton();
		this.form = this.factory.createForm();
	}
	
	public void drawUI() {
		if (button != null) {
			this.button.click();
		}
		if (form != null) {
			this.form.fill();
		}
	}
}
