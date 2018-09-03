package Browser;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class TitanController implements Initializable{

	String httpLink = "http://";
	String address;
	String previous, former = null;

	@FXML
	WebView web;

	@FXML
	TextField searchbar;

	WebEngine engine;

	public void search(ActionEvent evt){// NOTE: Use exact link. Example www.youtube.com
		previous = engine.getLocation();
		address = searchbar.getText().toString();
		engine.load(httpLink + address);
		searchbar.setText("");
		searchbar.setText(engine.getLocation());
	}

	public void back(ActionEvent evt){
		if(previous != null){
			former = engine.getLocation();
			engine.load(previous);
			searchbar.setText(engine.getLocation());
		}
	}

	public void forward(ActionEvent evt){
		if(former != null){
			engine.load(former);
			searchbar.setText(engine.getLocation());

		}
	}

	@Override
	public void initialize(URL url, ResourceBundle resourceBundle){
		engine = web.getEngine();
		engine.load(httpLink + "www.google.ca");
		searchbar.setText(engine.getLocation());
	}

}
