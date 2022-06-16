package sample;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class SALAY_OTHER {
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
    private StringProperty TY;  //也可以在这里直接new
    public void setTY(String value){ TYProperty().set(value);}
    public String getTY(){ return TYProperty().get(); }
    public StringProperty TYProperty(){
        if(TY == null) TY = new SimpleStringProperty(this, "TY");
        return TY;
    }
    private StringProperty NA;  //也可以在这里直接new
    public void setNA(String value){ NAProperty().set(value);}
    public String getNA(){ return NAProperty().get(); }
    public StringProperty NAProperty(){
        if(NA == null) NA = new SimpleStringProperty(this, "NA");
        return NA;
    }
    private StringProperty MN;  //也可以在这里直接new
    public void setMN(String value){ MNProperty().set(value);}
    public String getMN(){ return MNProperty().get(); }
    public StringProperty MNProperty(){
        if(MN == null) MN = new SimpleStringProperty(this, "MN");
        return MN;
    }
    private StringProperty DC;  //也可以在这里直接new
    public void setDC(String value){ DCProperty().set(value);}
    public String getDC(){ return DCProperty().get(); }
    public StringProperty DCProperty(){
        if(DC == null) DC = new SimpleStringProperty(this, "DC");
        return DC;
    }
}
