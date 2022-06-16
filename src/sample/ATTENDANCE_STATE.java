package sample;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class ATTENDANCE_STATE {
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
    private StringProperty NA;  //也可以在这里直接new
    public void setNA(String value){ NAProperty().set(value);}
    public String getNA(){ return NAProperty().get(); }
    public StringProperty NAProperty(){
        if(NA == null) NA = new SimpleStringProperty(this, "NA");
        return NA;
    }
    private StringProperty wh;  //也可以在这里直接new
    public void setwh(String value){ whProperty().set(value);}
    public String getwh(){ return whProperty().get(); }
    public StringProperty whProperty(){
        if(wh == null) wh = new SimpleStringProperty(this, "wh");
        return wh;
    }
    private StringProperty oh;  //也可以在这里直接new
    public void setoh(String value){ ohProperty().set(value);}
    public String getoh(){ return ohProperty().get(); }
    public StringProperty ohProperty(){
        if(oh == null) oh = new SimpleStringProperty(this, "oh");
        return oh;
    }
    private StringProperty lh;  //也可以在这里直接new
    public void setlh(String value){ lhProperty().set(value);}
    public String getlh(){ return lhProperty().get(); }
    public StringProperty lhProperty(){
        if(lh == null) lh = new SimpleStringProperty(this, "lh");
        return lh;
    }
    private StringProperty eh;  //也可以在这里直接new
    public void seteh(String value){ ehProperty().set(value);}
    public String geteh(){ return ehProperty().get(); }
    public StringProperty ehProperty(){
        if(eh == null) eh = new SimpleStringProperty(this, "eh");
        return eh;
    }
    private StringProperty lt;  //也可以在这里直接new
    public void setlt(String value){ ltProperty().set(value);}
    public String getlt(){ return ltProperty().get(); }
    public StringProperty ltProperty(){
        if(lt == null) lt = new SimpleStringProperty(this, "lt");
        return lt;
    }
    private StringProperty et;  //也可以在这里直接new
    public void setet(String value){ etProperty().set(value);}
    public String getet(){ return etProperty().get(); }
    public StringProperty etProperty(){
        if(et == null) et = new SimpleStringProperty(this, "et");
        return et;
    }
    private StringProperty at;  //也可以在这里直接new
    public void setat(String value){ atProperty().set(value);}
    public String getat(){ return atProperty().get(); }
    public StringProperty atProperty(){
        if(at == null) at = new SimpleStringProperty(this, "at");
        return at;
    }

}
