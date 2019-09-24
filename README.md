# HelloGluonNestedfxml
The method available for nested fxml files under Java 8 is no longer working under JavaFX 11.

This method requires a java class (HeaderTitle), Presenter and fxml file and is invoked simply by adding into the outer fxml file the following line
<HeaderTitle />

Although this is an example of a simple nested fxml, the same methodolgy works for more complex nested fxml containing entities requiring interaction, simply by adding an fx:id (eg <HeaderTitle fx:id="header" />) and declaring the entity in the Presenter file (eg @FXML HeaderTitle header; ) 
