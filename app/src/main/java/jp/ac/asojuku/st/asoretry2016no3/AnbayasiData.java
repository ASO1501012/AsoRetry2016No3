package jp.ac.asojuku.st.asoretry2016no3;

/**
 * Created by Garudo24 on 2017/01/13.
 */
public class AnbayasiData {
    private String ken;
    private String syozai;
    private String comment;
    //Constructor
    public AnbayasiData(String ken,String syozai,String comment){
        this.ken = ken;
        this.syozai = syozai;
        this.comment = comment;
    }

    public String getKen(){
        return ken;
    }

    public String getSyozai(){
        return syozai;
    }

    public String getComment(){
        return comment;
    }
}