module Unit6_GUI_With_JavaFx {
	requires javafx.controls;
	
	opens application to javafx.graphics, javafx.fxml;
}
