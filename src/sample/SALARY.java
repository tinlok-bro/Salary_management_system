package sample;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class SALARY {
    private StringProperty id;  //也可以在这里直接new
    public void setId(String value){ idProperty().set(value);}
    public String getId(){ return idProperty().get(); }
    public StringProperty idProperty(){
        if(id == null) id = new SimpleStringProperty(this, "id");
        return id;
    }
    private StringProperty YM;  //也可以在这里直接new
    public void setYM(String value){ YMProperty().set(value);}
    public String getYM(){ return YMProperty().get(); }
    public StringProperty YMProperty(){
        if(YM == null) YM = new SimpleStringProperty(this, "YM");
        return YM;
    }
    private StringProperty PS;  //也可以在这里直接new
    public void setPS(String value){ PSProperty().set(value);}
    public String getPS(){ return PSProperty().get(); }
    public StringProperty PSProperty(){
        if(PS == null) PS = new SimpleStringProperty(this, "PS");
        return PS;
    }
    private StringProperty BASIC;  //也可以在这里直接new
    public void setBASIC(String value){ BASICProperty().set(value);}
    public String getBASIC(){ return BASICProperty().get(); }
    public StringProperty BASICProperty(){
        if(BASIC == null) BASIC = new SimpleStringProperty(this, "BASIC");
        return BASIC;
    }
    private StringProperty BASIC_TOTAL;  //也可以在这里直接new
    public void setBASIC_TOTAL(String value){ BASIC_TOTALProperty().set(value);}
    public String getBASIC_TOTAL(){ return BASIC_TOTALProperty().get(); }
    public StringProperty BASIC_TOTALProperty(){
        if(BASIC_TOTAL == null) BASIC_TOTAL = new SimpleStringProperty(this, "BASIC_TOTAL");
        return BASIC_TOTAL;
    }
    private StringProperty BONUS;  //也可以在这里直接new
    public void setBONUS(String value){ BONUSProperty().set(value);}
    public String getBONUS(){ return BONUSProperty().get(); }
    public StringProperty BONUSProperty(){
        if(BONUS == null) BONUS = new SimpleStringProperty(this, "BONUS");
        return BONUS;
    }
    private StringProperty ADD_TOTAIL;  //也可以在这里直接new
    public void setADD_TOTAIL(String value){ ADD_TOTAILProperty().set(value);}
    public String getADD_TOTAIL(){ return ADD_TOTAILProperty().get(); }
    public StringProperty ADD_TOTAILProperty(){
        if(ADD_TOTAIL == null) ADD_TOTAIL = new SimpleStringProperty(this, "ADD_TOTAIL");
        return ADD_TOTAIL;
    }
    private StringProperty SUB_TOTAL;  //也可以在这里直接new
    public void setSUB_TOTAL(String value){ SUB_TOTALProperty().set(value);}
    public String getSUB_TOTAL(){ return SUB_TOTALProperty().get(); }
    public StringProperty SUB_TOTALProperty(){
        if(SUB_TOTAL == null) SUB_TOTAL = new SimpleStringProperty(this, "SUB_TOTAL");
        return SUB_TOTAL;
    }
    private StringProperty TOTAL;  //也可以在这里直接new
    public void setTOTAL(String value){ TOTALProperty().set(value);}
    public String getTOTAL(){ return TOTALProperty().get(); }
    public StringProperty TOTALProperty(){
        if(TOTAL == null) TOTAL = new SimpleStringProperty(this, "TOTAL");
        return TOTAL;
    }
}
