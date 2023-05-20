package com.example.java_ui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class LoginController {
   List<Account> Account;
    @FXML
    TextField usernameTextField;
    @FXML
    PasswordField passwordTextField;
    @FXML
    Button loginButton;
    @FXML
    Button registerButton;
    @FXML
    Label notification;

    public  LoginController(){
        this.Account = new ArrayList<Account>();
    }


    @FXML
    protected void loginButtonClick() {
        String username  = usernameTextField.getText();
        String password = passwordTextField.getText();

        System.out.println("Username: "+ username);
        System.out.println("Password: "+ password);

        for (var account : this.Account) {
            if (username.equals(account.Username) &&
                    password.equals(account.Password)){
                notification.setText("Login successfully");
                notification.setTextFill(Color.GREEN);
                return;
            }

                notification.setText("Login failed.");
                notification.setTextFill(Color.RED);
                return;

        }
    }
    @FXML
    protected void registerButtonClick(){
        String username  = usernameTextField.getText();
        String password = passwordTextField.getText();

        if (username.isBlank()){
            notification.setText("Username is blank.");
            notification.setTextFill(Color.RED);
            usernameTextField.isFocused();
            return;
        }
        if(password.isBlank()) {
            notification.setText("Password is blank.");
            notification.setTextFill(Color.RED);
            usernameTextField.isFocused();
            return;
        }
        else{
            boolean isExisted = false;

            for (var account: this.Account) {
                if (username.equals(account.Username)){
                    notification.setText("Username exists.");
                    isExisted =true;
                    return;
                }
                notification.setText("Login failed.");
            }
        }

        Account account = new Account(username,password);
        this.Account.add(account);

        notification.setText("Register successfully");
        notification.setTextFill(Color.GREEN);

        usernameTextField.setText(" ");
        passwordTextField.setText(" ");

        usernameTextField.isFocused();
    }
}

class Account {
    public  String Username;
    public  String Password;

    public Account (String username, String password){
        this.Username = username;
        this.Password = password;
    }
}