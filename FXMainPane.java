import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * This panel is the basic panel, inside which other panels are placed.  
 * Before beginning to implement, design the structure of your GUI in order to 
 * understand what panels go inside which ones, and what buttons or other components
 * go in which panels.  
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
public class FXMainPane extends VBox {

	//student Task #2:
	//  declare five buttons, a label, and a textfield
	Button buttonOne;
	Button buttonTwo;
	Button buttonThree;
	Button buttonFour;
	Button buttonFive;
	Button buttonSix;
	Label label;
	TextField text_field;
	//  declare two HBoxes
	HBox hboxOne;
	HBox hboxTwo;
	
	//student Task #4:
	//  declare an instance of DataManager
	DataManager dataManager ;
	
	
	/**
	 * The MainPanel constructor sets up the entire GUI in this approach.  Remember to
	 * wait to add a component to its containing component until the container has
	 * been created.  This is the only constraint on the order in which the following 
	 * statements appear.
	 */
	FXMainPane() {
		//student Task #2:
		//  instantiate the buttons, label, and textfield
		 buttonOne = new Button("Hello");
		 buttonTwo = new Button("Howdy");
		 buttonThree = new Button("Chinese");
		 buttonFour = new Button("clear");
		 buttonFive = new Button("exit");
		 buttonSix = new Button("French");
         label = new Label("Feedback");
         text_field = new TextField();
		//  instantiate the HBoxes
		 hboxOne = new HBox();
		 hboxTwo = new HBox();
		
		//student Task #4:
		//  instantiate the DataManager instance
		 dataManager = new DataManager();
		//  set margins and set alignment of the components
		 HBox.setMargin(buttonOne, new Insets(9));
		 HBox.setMargin(buttonTwo, new Insets(9));
		 HBox.setMargin(buttonThree, new Insets(9));
		 HBox.setMargin(buttonFour, new Insets(9));
		 HBox.setMargin(buttonSix, new Insets(9));
		 HBox.setMargin(buttonFive, new Insets(9));
		 hboxOne.setAlignment(Pos.CENTER);
		 hboxTwo.setAlignment(Pos.CENTER);
		 buttonOne.setOnAction(new ButtonHandler() );
		 buttonTwo.setOnAction(new ButtonHandler());
		 buttonThree.setOnAction(new ButtonHandler());
		 buttonFour.setOnAction(new ButtonHandler());
		 buttonFive.setOnAction(new ButtonHandler());
		 buttonSix.setOnAction(new ButtonHandler());
		//student Task #3:
		//  add the label and textfield to one of the HBoxes
		hboxOne.getChildren().addAll(label,text_field);
		//  add the buttons to the other HBox
		hboxTwo.getChildren().addAll(buttonOne,buttonTwo,buttonThree,buttonSix,buttonFour,buttonFive);
		//  add the HBoxes to this FXMainPanel (a VBox)
		this.getChildren().addAll(hboxOne,hboxTwo);
		
	}
	
	private void setOnAction(FXMainPane.ButtonHandler buttonHandler) {
		// TODO Auto-generated method stub
		
	}

	//Task #4:
	//  create a private inner class to handle the button clicks
	private  class  ButtonHandler implements EventHandler<ActionEvent>
	{

		public void handle(ActionEvent event) {
			
			if(event.getTarget()== buttonOne)
			{
				text_field.setText(dataManager.getHello());
			}
			else if(event.getTarget()== buttonTwo) 
			{
				text_field.setText(dataManager.getHowdy());
			}
			else if(event.getTarget()==buttonThree)
			{
				text_field.setText(dataManager.getChinese());
			}
			else if(event.getTarget()==buttonFour)
			{
				text_field.setText("");
			}
			else if (event.getTarget()==buttonFive)
			{
				Platform.exit();
				System.exit(0);
			}
			else if (event.getTarget()==buttonSix)
			{
				text_field.setText(dataManager.getFrench());
			}
		}
		
	}
	
	//{}
}
	
