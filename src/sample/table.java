package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.YearMonth;
import java.util.regex.Pattern;

public class table {

    @FXML
    private TextField latetime;

    @FXML
    private TableColumn<?, ?> LEAVE_HDAY;

    @FXML
    private TextField noworktime;

    @FXML
    private TableColumn<?, ?> WORK_HOUR;

    @FXML
    private TableColumn<?, ?> BASIC_TOTAL3;

    @FXML
    private TableColumn<?, ?> BONUS3;

    @FXML
    private TextArea liyou;

    @FXML
    private TextField namefie;

    @FXML
    private TextField notime;

    @FXML
    private ComboBox<String> type;

    @FXML
    private TableColumn<?, ?> ERRAND_HDAY;

    @FXML
    private TableColumn<?, ?> DESCRIPTION2;

    @FXML
    private TableColumn<?, ?> SUB_TOTAL3;

    @FXML
    private TextField bouns;
    @FXML
    private TextField BOUNSYM;
    @FXML
    private TableView<SALAY_OTHER> qitagonzi;

    @FXML
    private TableColumn<?, ?> YEARMONTH3;

    @FXML
    private TableColumn<?, ?> TOTAL3;


    @FXML
    private TableColumn<?, ?> ID;

    @FXML
    private TableColumn<?, ?> EARLY_TIMES;

    @FXML
    private TextField workuptime;

    @FXML
    private TableColumn<?, ?> PERSON;

    @FXML
    private TableView<SALARY> jieguo;

    @FXML
    private TableColumn<?, ?> ADD_TOTAIL3;

    @FXML
    private TextField gonzinumber;

    @FXML
    private TableColumn<?, ?> PERSON3;

    @FXML
    private TableColumn<?, ?> PERSON2;

    @FXML
    private TextField gonzi;

    @FXML
    private TableColumn<?, ?> NAME2;

    @FXML
    private TableColumn<?, ?> MONEY2;

    @FXML
    private TableColumn<?, ?> LATE_TIMES;

    @FXML
    private TableColumn<?, ?> TYPE2;

    @FXML
    private TableColumn<?, ?> OVER_HOUR;

    @FXML
    private TableColumn<?, ?> YEAR_MONTH2;

    @FXML
    private TableColumn<?, ?> ID2;

    @FXML
    private TableColumn<?, ?> ABSENT_TIMES;

    @FXML
    private TableColumn<?, ?> ID3;
    @FXML
    private TextField bounsnumber;

    @FXML
    private TableColumn<?, ?> nameone;
    @FXML
    private TableColumn<?, ?> YEAR_MONTH;
    @FXML
    private TableColumn<?, ?> ID4;
    @FXML
    private TableColumn<?, ?> BIRTHDAY4;
    @FXML
    private TableColumn<?, ?> NAME4;
    @FXML
    private TableColumn<?, ?> DEPARTMENT4;
    @FXML
    private TableView<SALARY> PERSON4;
    @FXML
    private TableColumn<?, ?> JOB4;
    @FXML
    private TableColumn<?, ?> SEX4;
    @FXML
    private TableColumn<?, ?> AUTHORITY;
    @FXML
    private TableView<ATTENDANCE_STATE> kaoqin;
    @FXML
    private Label NOW;
    @FXML

    private ObservableList<ATTENDANCE_STATE> list1 = FXCollections.observableArrayList();
    private ObservableList<SALAY_OTHER> list2 = FXCollections.observableArrayList();
    private ObservableList<SALARY> list3 = FXCollections.observableArrayList();
    private ObservableList<SALARY> list4 = FXCollections.observableArrayList();
    public Connection connection=null;
    @FXML
    private TableColumn<?, ?> BASIC3;
    private void showList2() {
        list2 = FXCollections.observableArrayList();
        //??????????????????????????????
        list2.clear();


        try {
            String DB = "SALAY_OTHER";
            String s = " select *"
                    + " from " + DB+"";
            ResultSet resultSet = connection.createStatement().executeQuery(s);
            System.out.println(s);

            //??????
            while(resultSet.next()){
                //LIST.clear();
                SALAY_OTHER sa=new SALAY_OTHER();
                sa.setId(resultSet.getString("ID"));
                sa.setPS(resultSet.getString("PERSON"));
                sa.setYM(resultSet.getString("YEAR_MONTH"));
                String TY=resultSet.getString("TYPE");
                if(TY.equals("0"))TY="??????";
                else if(TY.equals("1"))TY="????????????";
                else TY="??????";
                sa.setTY(TY);
                sa.setNA(resultSet.getString("NAME"));
                sa.setMN(resultSet.getString("MONEY"));
                sa.setDC(resultSet.getString("DESCRIPTION"));

                list2.add(sa);
            }
            qitagonzi.setItems(list2);
        } catch (SQLException e){
            System.out.println(e.getMessage());

        }
    }
    private void showList1() {
        list1 = FXCollections.observableArrayList();
        //??????????????????????????????
        list1.clear();


        try {
            String DB = "ATTENDANCE_STATE";
            String s = " select *,PERSON"
                    + " from " + DB+"";
            ResultSet resultSet = connection.createStatement().executeQuery(s);
            System.out.println(s);
            //?????????????????????
            //List<ATTENDANCE_STATE>LIST=new List<ATTENDANCE_STATE>();

            //??????
            while(resultSet.next()){
                //LIST.clear();
                ATTENDANCE_STATE sa=new ATTENDANCE_STATE();
                sa.setId(resultSet.getString("ID"));
                sa.setPS(resultSet.getString("PERSON"));
                sa.setNA(resultSet.getString("NAME"));
                sa.setYM(resultSet.getString("YEAR_MONTH"));
                sa.setwh(resultSet.getString("WORK_HOUR"));
                sa.setoh(resultSet.getString("OVER_HOUR"));
                sa.setlh(resultSet.getString("LEAVE_HDAY"));
                sa.seteh(resultSet.getString("ERRAND_HDAY"));
                sa.setlt(resultSet.getString("LATE_TIMES"));
                sa.setet(resultSet.getString("EARLY_TIMES"));
                sa.setat(resultSet.getString("ABSENT_TIMES"));
                list1.add(sa);
            }
            kaoqin.setItems(list1);
        } catch (SQLException e){
            System.out.println(e.getMessage());

        }
    }
    private void showList3() {
        list3 = FXCollections.observableArrayList();
        //??????????????????????????????
        list3.clear();


        try {
            String DB = "SALARY";
            String s = " select *"
                    + " from " + DB+"";
            ResultSet resultSet = connection.createStatement().executeQuery(s);
            System.out.println(s);

            //??????
            while(resultSet.next()){
                //LIST.clear();
                SALARY sa=new SALARY();
                sa.setId(resultSet.getString("ID"));
                sa.setPS(resultSet.getString("PERSON"));
                sa.setYM(resultSet.getString("YEARMONTH"));
                sa.setBASIC(resultSet.getString("BASIC"));
                sa.setBASIC_TOTAL(resultSet.getString("BASIC_TOTAL"));
                sa.setBONUS(resultSet.getString("BONUS"));
                sa.setADD_TOTAIL(resultSet.getString("ADD_TOTAIL"));
                sa.setSUB_TOTAL(resultSet.getString("SUB_TOTAL"));
                sa.setTOTAL(resultSet.getString("TOTAL"));
                list3.add(sa);
            }
            jieguo.setItems(list3);
        } catch (SQLException e){
            System.out.println(e.getMessage());

        }
    }
    private void showList4() {
        list4 = FXCollections.observableArrayList();
        //??????????????????????????????
        list4.clear();


        try {
            String DB = "PERSON";
            String s = " select *"
                    + " from " + DB+"";
            ResultSet resultSet = connection.createStatement().executeQuery(s);
            System.out.println(s);

            //??????
            while(resultSet.next()){
                //LIST.clear();
                SALARY sa=new SALARY();
                sa.setId(resultSet.getString("ID"));
                sa.setYM(resultSet.getString("AUTHORITY"));
                sa.setPS(resultSet.getString("NAME"));
                sa.setBASIC(resultSet.getString("SEX"));
                sa.setBASIC_TOTAL(resultSet.getString("BIRTHDAY"));
                sa.setBONUS(resultSet.getString("DEPARTMENT"));
                sa.setADD_TOTAIL(resultSet.getString("JOB"));

                list4.add(sa);
            }
            PERSON4.setItems(list4);
        } catch (SQLException e){
            System.out.println(e.getMessage());

        }
    }
    public void init(Connection e){
        connection=e;
        type.getItems().addAll(
                "??????",
                "????????????",
                "??????/??????"
        );
        ID.setCellValueFactory(new PropertyValueFactory<>("id"));
        YEAR_MONTH.setCellValueFactory(new PropertyValueFactory<>("YM"));
        PERSON.setCellValueFactory(new PropertyValueFactory<>("PS"));
        nameone.setCellValueFactory(new PropertyValueFactory<>("NA"));
        WORK_HOUR.setCellValueFactory(new PropertyValueFactory<>("wh"));
        OVER_HOUR.setCellValueFactory(new PropertyValueFactory<>("oh"));
        LEAVE_HDAY.setCellValueFactory(new PropertyValueFactory<>("lh"));
        ERRAND_HDAY.setCellValueFactory(new PropertyValueFactory<>("eh"));
        LATE_TIMES.setCellValueFactory(new PropertyValueFactory<>("lt"));
        EARLY_TIMES.setCellValueFactory(new PropertyValueFactory<>("et"));
        ABSENT_TIMES.setCellValueFactory(new PropertyValueFactory<>("at"));
        //???????????????
        ID2.setCellValueFactory(new PropertyValueFactory<>("id"));
        YEAR_MONTH2.setCellValueFactory(new PropertyValueFactory<>("YM"));
        PERSON2.setCellValueFactory(new PropertyValueFactory<>("PS"));
        TYPE2.setCellValueFactory(new PropertyValueFactory<>("TY"));
        NAME2.setCellValueFactory(new PropertyValueFactory<>("NA"));
        MONEY2.setCellValueFactory(new PropertyValueFactory<>("MN"));
        DESCRIPTION2.setCellValueFactory(new PropertyValueFactory<>("DC"));
        //????????????
        ID3.setCellValueFactory(new PropertyValueFactory<>("id"));
        YEARMONTH3.setCellValueFactory(new PropertyValueFactory<>("YM"));
        PERSON3.setCellValueFactory(new PropertyValueFactory<>("PS"));
        BASIC3.setCellValueFactory(new PropertyValueFactory<>("BASIC"));
        BASIC_TOTAL3.setCellValueFactory(new PropertyValueFactory<>("BASIC_TOTAL"));
        BONUS3.setCellValueFactory(new PropertyValueFactory<>("BONUS"));
        ADD_TOTAIL3.setCellValueFactory(new PropertyValueFactory<>("ADD_TOTAIL"));
        SUB_TOTAL3.setCellValueFactory(new PropertyValueFactory<>("SUB_TOTAL"));
        TOTAL3.setCellValueFactory(new PropertyValueFactory<>("TOTAL"));
        //????????????
        ID4.setCellValueFactory(new PropertyValueFactory<>("id"));
        AUTHORITY.setCellValueFactory(new PropertyValueFactory<>("YM"));
        NAME4.setCellValueFactory(new PropertyValueFactory<>("PS"));
        SEX4.setCellValueFactory(new PropertyValueFactory<>("BASIC"));
        BIRTHDAY4.setCellValueFactory(new PropertyValueFactory<>("BASIC_TOTAL"));
        DEPARTMENT4.setCellValueFactory(new PropertyValueFactory<>("BONUS"));
        JOB4.setCellValueFactory(new PropertyValueFactory<>("ADD_TOTAIL"));
        try {
        String DB = "AB";
        String s = " select *"
                + " from " + DB+"";
        ResultSet resultSet = connection.createStatement().executeQuery(s);
        System.out.println(s);

            resultSet.next();
            workuptime.setText(resultSet.getString("????????????"));
            noworktime.setText(resultSet.getString("????????????"));
            latetime.setText(resultSet.getString("??????????????????"));
            notime.setText(resultSet.getString("????????????"));
        }catch (SQLException a){
            System.out.println(a.getMessage());
        }

        showList1();
        showList2();
        showList3();
        showList4();
    }
    @FXML
    void inout(ActionEvent event) {
        showList1();
        showList2();
        showList3();
        showList4();
    }

    @FXML
    void xiugaiok(ActionEvent event) {
        try {
            String s1 = "update SALARY set BASIC=" + gonzi.getText()
                    + " where PERSON=" + gonzinumber.getText();
            System.out.println(s1);
                connection.createStatement().executeUpdate(s1);
                updatasalary();
                NOW.setText("??????????????????????????????");
        }catch (SQLException A){
            NOW.setText(A.getMessage());
        }
    }
    @FXML
    void GETB(ActionEvent event) {
        try {
            String DB = "PERSON";
            String s = " select NAME"
                    + " from " + DB + " WHERE ID=" + bounsnumber.getText();
            ResultSet resultSet = connection.createStatement().executeQuery(s);
            System.out.println(s);
            resultSet.next();
            namefie.setText(resultSet.getString("NAME"));
            BOUNSYM.setText(YearMonth.now().toString());
            NOW.setText("????????????");
        }catch (SQLException A){
            NOW.setText(A.getMessage());
        }
    }
    @FXML
    //????????????
    void ok(ActionEvent event) {
        if(BOUNSYM.getText().equals("")||bounsnumber.getText().equals("")||namefie.getText().equals("")||bouns.getText().equals("")||liyou.getText().equals(""))
        {
            NOW.setText("???????????????????????????????????????????????????");
        }else{
            if(type.getValue()==null){
                NOW.setText("?????????????????????????????????");
            }else if(!isInteger(bouns.getText())){
                NOW.setText("??????????????????????????????????????????");
            }else{
                String TY=type.getValue();
                if(TY.equals("??????"))TY="0";
                else if(TY.equals("????????????"))TY="1";
                else TY="2";
                try {
                    String DB = "SALAY_OTHER";
                    String s = "INSERT INTO " + DB + "(YEAR_MONTH,PERSON,TYPE,NAME,MONEY,DESCRIPTION) "
                            + "VALUES ('" + BOUNSYM.getText() + "'," + bounsnumber.getText() + "," + TY + ",'" + namefie.getText() + "'," + bouns.getText() + ",'" + liyou.getText() + "')";
                    System.out.println(s);
                    connection.createStatement().executeUpdate(s);
                    showList2();
                    updatasalary();
                    showList3();
                    NOW.setText("????????????");
                }catch (SQLException A){
                    NOW.setText(A.getMessage());
                }
            }
        }

    }
    @FXML//??????????????????
    void getbasic(ActionEvent event) {
        try {
            String DB = "SALARY";
            String s = " select BASIC"
                    + " from " + DB + " WHERE PERSON=" + gonzinumber.getText();
            ResultSet resultSet = connection.createStatement().executeQuery(s);
            System.out.println(s);
            resultSet.next();
            gonzi.setText(resultSet.getString("BASIC"));
        }catch (SQLException A){
            NOW.setText(A.getMessage());
        }
    }
    //???????????????????????????
    @FXML
    void USE(ActionEvent event) {
        String DB="AB";
        String s="UPDATE " +DB
                +" SET ????????????="+workuptime.getText()
                +",????????????="+noworktime.getText()
                +",??????????????????="+latetime.getText()
                +",????????????="+notime.getText();
        System.out.println(s);
        updatasalary();
        try {
            connection.createStatement().executeUpdate(s);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    void updatasalary(){
        try {
            //??????
            String s1 = "update SALARY set BONUS=x.Score from (select PERSON sid,sum(MONEY) Score,TYPE ty ,YEAR_MONTH YM from SALAY_OTHER group by PERSON,TYPE,YEAR_MONTH) x"
                    + " where SALARY.PERSON=x.sid AND x.ty=0 AND x.YM=SALARY.YEARMONTH";
            System.out.println(s1);

            connection.createStatement().executeUpdate(s1);
            //??????????????????
            s1="update SALARY set BASIC_TOTAL=x.Score"
                    +" from (select D.PERSON SIZ,(C.BASIC * (D.WORK_HOUR+(S.????????????*D.OVER_HOUR)-(S.????????????*D.LEAVE_HDAY))-(S.??????????????????*(D.LATE_TIMES+D.EARLY_TIMES))-(S.????????????*D.ABSENT_TIMES)) Score ,D.YEAR_MONTH YM from  SALARY C , AB S ,ATTENDANCE_STATE D where C.PERSON=D.PERSON group by D.ABSENT_TIMES,D.EARLY_TIMES,D.LATE_TIMES,D.LEAVE_HDAY,D.OVER_HOUR,D.PERSON,D.WORK_HOUR,C.BASIC,S.????????????,S.????????????,S.??????????????????,S.????????????,D.YEAR_MONTH) x"
                    +"  where SALARY.PERSON=x.SIZ AND SALARY.YEARMONTH=x.YM";
            System.out.println(s1);
            connection.createStatement().executeUpdate(s1);
            //??????????????????
            s1 = "update SALARY set ADD_TOTAIL=x.Score from (select PERSON sid,sum(MONEY) Score,TYPE ty ,YEAR_MONTH YM from SALAY_OTHER group by PERSON,TYPE,YEAR_MONTH) x" +
                    " where SALARY.PERSON=x.sid AND x.ty=1 AND x.YM=SALARY.YEARMONTH";
            System.out.println(s1);
            connection.createStatement().executeUpdate(s1);
            //????????????
            s1 = "update SALARY set SUB_TOTAL=x.Score from (select PERSON sid,sum(MONEY) Score,TYPE ty ,YEAR_MONTH YM from SALAY_OTHER group by PERSON,TYPE,YEAR_MONTH) x" +
                    " where SALARY.PERSON=x.sid AND x.ty=2 AND x.YM=SALARY.YEARMONTH";
            System.out.println(s1);
            connection.createStatement().executeUpdate(s1);
            showList3();
            NOW.setText("????????????????????????");

        }catch (SQLException a){
            NOW.setText(a.getMessage());
        }
    }

    public static boolean isInteger(String str) {
        Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
        return pattern.matcher(str).matches();
    }

}
