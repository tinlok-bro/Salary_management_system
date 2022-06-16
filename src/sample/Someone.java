
    package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;


    public class Someone {

        @FXML
        private TableColumn<?, ?> MONEY2;

        @FXML
        private TableColumn<?, ?> TYPE2;

        @FXML
        private Text NOWTIME;

        @FXML
        private TableColumn<?, ?> YEAR_MONTH2;

        @FXML
        private TableColumn<?, ?> ID2;

        @FXML
        private ImageView IM;
        @FXML
        private TableColumn<?, ?> PERSON2;

        @FXML
        private TableView<SALAY_OTHER> qitagonzi;

        @FXML
        private Text hello;

        @FXML
        private Text welcome;

        @FXML
        private TableColumn<?, ?> NAME2;
        public Connection connection=null;
        private final ObservableList<SALAY_OTHER> list2 = FXCollections.observableArrayList();
        @FXML
        private TableColumn<?, ?> DESCRIPTION2;
        public void init(Connection e,String PERSON){
            try{
            connection=e;
                String DB = "PERSON";
                String s = " select *"
                        + " from " + DB+" WHERE ID="+PERSON;
                ResultSet resultSet2 = connection.createStatement().executeQuery(s);
                System.out.println(s);
                resultSet2.next();
            welcome.setText("欢迎您，"+resultSet2.getString("NAME"));
            NOWTIME.setText(LocalDate.now().toString());
            ID2.setCellValueFactory(new PropertyValueFactory<>("id"));
            YEAR_MONTH2.setCellValueFactory(new PropertyValueFactory<>("YM"));
            PERSON2.setCellValueFactory(new PropertyValueFactory<>("PS"));
            TYPE2.setCellValueFactory(new PropertyValueFactory<>("TY"));
            NAME2.setCellValueFactory(new PropertyValueFactory<>("NA"));
            MONEY2.setCellValueFactory(new PropertyValueFactory<>("MN"));
            DESCRIPTION2.setCellValueFactory(new PropertyValueFactory<>("DC"));


                String DB2 = "SALAY_OTHER";
                String s2 = " select *"
                        + " from " + DB2+" WHERE PERSON="+PERSON;
                ResultSet resultSet = connection.createStatement().executeQuery(s2);
                System.out.println(s2);

                //循环
                while(resultSet.next()){
                    //LIST.clear();
                    SALAY_OTHER sa=new SALAY_OTHER();
                    sa.setId(resultSet.getString("ID"));
                    sa.setPS(resultSet.getString("PERSON"));
                    sa.setYM(resultSet.getString("YEAR_MONTH"));
                    String TY=resultSet.getString("TYPE");
                    if(TY.equals("0"))TY="奖金";
                    else if(TY.equals("1"))TY="其他应发";
                    else TY="扣发";
                    sa.setTY(TY);
                    sa.setNA(resultSet.getString("NAME"));
                    sa.setMN(resultSet.getString("MONEY"));
                    sa.setDC(resultSet.getString("DESCRIPTION"));

                    list2.add(sa);
                }
                qitagonzi.setItems(list2);
                String DB3 = "SALARY";
                String s3 = " select *"
                        + " from " + DB3+" WHERE PERSON="+PERSON;
                ResultSet resultSet3 = connection.createStatement().executeQuery(s3);
                System.out.println(s);
                if(resultSet3.next()){
                    hello.setText(welcome.getText()+",本月\n你的基本工资为"+resultSet3.getString("BASIC")+"\n实际应发："+resultSet3.getString("BASIC_TOTAL")+"\n最终应发为："+resultSet3.getString("TOTAL"));
                }

            }catch (SQLException a){
                System.out.println(a.getMessage());
            }
            /*File file = new File("ima.jpg");
            try {
                IM.setImage(new Image(file.toURI().toURL().toString()));
            } catch (MalformedURLException z) {
                z.printStackTrace();
            }*/

        }
    }


