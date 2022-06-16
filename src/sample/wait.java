package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.*;

public class wait {
    public Statement statement=null;
    public Connection connection=null;
    public Stage side_stage= new Stage();
    @FXML
    private TextField password;

    @FXML
    private Button Con;

    @FXML
    private AnchorPane wait1;

    @FXML
    private Label Now;

    @FXML
    private TextField name;

    @FXML
    private Button longin;

    @FXML
    private TextField urll;

    @FXML
    private AnchorPane Login;

    @FXML
    private TextField password1;

    @FXML
    private TextField username1;

    @FXML
    private Label Now1;

    @FXML
    private TextField username;

    @FXML
    void Connect(ActionEvent event) {
        String connectionUrl = "jdbc:sqlserver://"+urll.getText()+";"
                + "databaseName="+name.getText()+";"
                + "user="+username.getText()+";"
                + "password="+password.getText()+";";
        Now.setText("尝试连接");
        try {
            connection = DriverManager.getConnection(connectionUrl);
            statement = connection.createStatement();
            System.out.println("连接成功了");
            Now.setText("连接成功了");
            wait1.setDisable(true);
            wait1.setVisible(false);
            Login.setDisable(false);
            Login.setVisible(true);
        } catch (SQLException e) {
            Now.setText(e.getMessage());
        }


    }

    @FXML
    void go(ActionEvent event)  {
        if(username1.getText() == null || username1.getText().equals("")||password1.getText() == null || password1.getText().equals("")){
            Now1.setText("用户名或者密码不能为空。");
        }else {
            String DB = "PERSON";
            String s = " select PASSWD,AUTHORITY"
                    + " from " + DB
                    + " where ID = " + username1.getText();

            System.out.println(s);

            String statement = s;
            ResultSet resultSet = null;
            try {
                resultSet = connection.createStatement().executeQuery(statement);
                resultSet.next();
                System.out.println(resultSet.getString("PASSWD"));
                System.out.println(password1.getText());
                String result=resultSet.getString("PASSWD");
                result=result.replace(" ","");
                if (result.equals(password1.getText())) {

                    if(Integer.parseInt(resultSet.getString("AUTHORITY"))==1) {
                        /********************************/
                        Now1.setText("请稍等");
                        Parent root = null;
                        URL url = getClass().getResource("table.fxml");
                        FXMLLoader fxmlLoader = new FXMLLoader();

                        try {
                            fxmlLoader.setLocation(url);
                            fxmlLoader.setBuilderFactory(new JavaFXBuilderFactory());
                            root = fxmlLoader.load();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                        table fun = fxmlLoader.getController();
                        fun.init(connection);

                        Scene scene = new Scene(root);
                        side_stage.setScene(scene);
                        side_stage.setTitle("工资管理系统");
                        side_stage.setResizable(false);
                        side_stage.show();
                        Stage stage = (Stage) longin.getScene().getWindow();
                        stage.close();
                    }else{
                        Now1.setText("没有所需的权限。");
                        Parent root = null;
                        URL url = getClass().getResource("Someone.fxml");
                        FXMLLoader fxmlLoader = new FXMLLoader();

                        try {
                            fxmlLoader.setLocation(url);
                            fxmlLoader.setBuilderFactory(new JavaFXBuilderFactory());
                            root = fxmlLoader.load();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                        Someone fun = fxmlLoader.getController();
                        fun.init(connection,username1.getText());

                        Scene scene = new Scene(root);
                        side_stage.setScene(scene);
                        side_stage.setTitle("员工工资");
                        side_stage.setResizable(false);
                        side_stage.show();
                        Stage stage = (Stage) longin.getScene().getWindow();
                        stage.close();
                    }

                } else {
                    Now1.setText("用户名或者密码错误。");
                }
            } catch (SQLException e) {
                Now1.setText("出现错误："+e.getMessage());
            }

        }
    }
}
