import java.awt.*;
import java.awt.event.*;

public class user_info extends Frame implements ActionListener {
    // Components
    TextField nameField, addressField, ageField, phoneField;
    CheckboxGroup genderGroup;
    Checkbox maleCheckbox, femaleCheckbox;
    List languageList;
    Button showButton;
    
    public user_info() {
        // Frame setup
        setTitle("User Information");
        setSize(400, 300);
        setLayout(new GridLayout(7, 2));
        
        // Components initialization
        add(new Label("Name:"));
        nameField = new TextField();
        add(nameField);
        
        add(new Label("Address:"));
        addressField = new TextField();
        add(addressField);
        
        add(new Label("Age:"));
        ageField = new TextField();
        add(ageField);
        
        add(new Label("Gender:"));
        Panel genderPanel = new Panel();
        genderGroup = new CheckboxGroup();
        maleCheckbox = new Checkbox("Male", genderGroup, true);
        femaleCheckbox = new Checkbox("Female", genderGroup, false);
        genderPanel.add(maleCheckbox);
        genderPanel.add(femaleCheckbox);
        add(genderPanel);
        
        add(new Label("Phone Number:"));
        phoneField = new TextField();
        add(phoneField);
        
        add(new Label("Languages Known:"));
        languageList = new List(3, true);
        languageList.add("Java");
        languageList.add("Python");
        languageList.add("C++");
        languageList.add("JavaScript");
        languageList.add("Swift");
        add(languageList);
        
        showButton = new Button("Show");
        showButton.addActionListener(this);
        add(showButton);
        
        // Event handling for closing the window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == showButton) {
            // Getting the values from the components
            String name = nameField.getText();
            String address = addressField.getText();
            String age = ageField.getText();
            String gender = maleCheckbox.getState() ? "Male" : "Female";
            String phone = phoneField.getText();
            String[] languages = languageList.getSelectedItems();
            
            // Displaying the information
            System.out.println("Name: " + name);
            System.out.println("Address: " + address);
            System.out.println("Age: " + age);
            System.out.println("Gender: " + gender);
            System.out.println("Phone Number: " + phone);
            System.out.println("Languages Known:");
            for (String lang : languages) {
                System.out.println("- " + lang);
            }
        }
    }
    
    public static void main(String[] args) {
        user_info frame = new user_info();
        frame.setVisible(true);
    }
}
