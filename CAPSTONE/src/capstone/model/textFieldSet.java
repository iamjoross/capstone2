/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package capstone.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author iamjoross
 */
public class textFieldSet {
     // Define a variable to store the property
    private StringProperty txtString = new SimpleStringProperty();
 
    // Define a getter for the property's value
    public final String getString(){return txtString.get();}
 
    // Define a setter for the property's value
    public final void setString(String value){txtString.set(value);}
 
     // Define a getter for the property itself
    public StringProperty stringProperty() {return txtString;}
}
