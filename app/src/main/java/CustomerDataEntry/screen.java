package CustomerDataEntry;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.MongoClientSettings;
import com.mongodb.ConnectionString;

public class screen {
	// Method to connect to the database and insert Document.
	public MongoClient CreateConnection() {

		// Connection String
		ConnectionString conn = new ConnectionString("mongodb+srv://lee:Gamez2232@cluster0.guc9f.mongodb.net/GaugeDB?retryWrites=true&w=majority");
	
		// MongoSettings
		MongoClientSettings settings = MongoClientSettings.builder()
		  .applyConnectionString(conn)
		  .build();
		// Initialzing the client with the settings.
		MongoClient mongoClient = MongoClients.create(settings);
	
		return mongoClient;
	
	  }
	  public void DocumentInsert(MongoClient client) {
		// Initializing the variable for connecting to the GaugeDB database.
		MongoDatabase database = client.getDatabase("GaugeDB");
	
		// Initializing the variable for connecting to the collection. 
		MongoCollection < Document > coll = database.getCollection("Suppliers");
		
		JList list = new JList();
		
		for(int i = 0; i < len(coll.find()); i++) {}find())
		list.add();
		coll.find();
		if(models!= null){
			JOptionPane.showMessageDialog(panel, "Documents Found");
		}
		}

	public JPanel createPanel() {
		//Setting up the panel.
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
	
		//Creating the textarea variables

		JTextArea firstNameArea = new JTextArea(1, 1);
		JTextArea lastNameArea = new JTextArea(1, 1);
		JTextArea zipCodeArea = new JTextArea(1, 1);
	
		JTextArea text = new JTextArea();
		
		//Creating the label variables
		JLabel firstNameLabel = new JLabel("First Name");
		JLabel lastNameLabel = new JLabel("Last Name");
		JLabel zipCodeLabel = new JLabel("Zip Code");
		JButton subButton = new JButton("Submit Information");

	
		//Adding components to the panel.
		panel.add(firstNameLabel);
		panel.add(firstNameArea);
		panel.add(lastNameLabel);
		panel.add(lastNameArea);
		panel.add(zipCodeLabel);
		panel.add(zipCodeArea);
		panel.add(subButton);
	
		// Returns the panel.
		return panel;
		CreateConnection();
		DocumentInsert();
	  }


}
