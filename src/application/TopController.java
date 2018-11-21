package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class TopController {
	private final String nextPage = "nextPage.fxml";

	@FXML
	private Button nextButton;

	@FXML
	private Label label;

	@FXML
	public void moveNextPage(){
		Main.getInstance().setPage(nextPage);
	}


}
