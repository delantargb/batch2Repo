package classes;

/**
 * Created by JPMPC-B210 on 11/10/2016.
 */
public class Customer extends Person{

    public int customer_Id;
    public boolean mebership_Lvl ;
    public long cretid_Card_No;

    public int getCustomer_Id() {
        return customer_Id;
    }

    public boolean isMebership_Lvl() {
        return mebership_Lvl;
    }

    public long getCretid_Card_No() {
        return cretid_Card_No;
    }


    public void setCustomer_Id(int customer_Id) {
        this.customer_Id = customer_Id;
    }

    public void setMebership_Lvl(boolean mebership_Lvl) {
        this.mebership_Lvl = mebership_Lvl;
    }

    public void setCretid_Card_No(long cretid_Card_No) {
        this.cretid_Card_No = cretid_Card_No;
    }
}
