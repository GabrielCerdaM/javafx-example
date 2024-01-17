/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javafx;

import javafx.application.HostServices;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 *
 * @author Gabriel
 */
public class LoginUIController {

    private final HostServices HostServices;

    public LoginUIController(HostServices HostServices) {
        this.HostServices = HostServices;
    }

    @FXML
    TextField txtUserName;

    @FXML
    PasswordField passwordField;

    @FXML
    Button btnLogin;

    @FXML
    Button btnClean;

    @FXML
    public void initialize() {
        this.btnClean.setOnAction((actionEvent) -> {
            this.txtUserName.setText(this.HostServices.getDocumentBase());
        });
    }
}
