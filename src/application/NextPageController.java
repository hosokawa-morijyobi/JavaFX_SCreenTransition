package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class NextPageController {
	private final String nextPage = "Top.fxml";

	@FXML
	private Button prevButton;

	@FXML
	public void prevPage(){
		Main.getInstance().setPage(nextPage);
	}

}
