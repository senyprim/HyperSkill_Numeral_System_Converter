package converter;

import java.math.BigInteger;

public class Number {
    private int number;
    public Number(int number){
        this.number=number;
    }
    public Number(){this(0);}
    public void setNumber(String number, int base){
        this.number = (new BigInteger(number,base)).intValue();
    }
    public void setNumber(int number){
        setNumber(Integer.toString(number),10);
    }
    public String getPrefixBase(int base){
        String result;
        switch (base) {
            case 2:
                result = "0b";
                break;
            case 8:
                result = "0";
                break;
            case 16:
                result = "0x";
                break;
            case 10: result="";break;
            default:
                result = base + "x";
        }
        return result;
    }
    public String getNumber(int base){

        return getPrefixBase(base)+Integer.toString(this.number,base);
    }
    public String getNumber(){return Integer.toString(this.number,10);
    }
}
