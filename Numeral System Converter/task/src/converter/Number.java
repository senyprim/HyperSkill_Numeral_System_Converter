package converter;

import java.math.BigInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Number {
    private int number;
    public Number(int number){
        this.number=number;
    }
    public Number(){this(0);}
    public void setNumber(String number, int base){
        if (base>1){
            this.number = (new BigInteger(number,base)).intValue();
        } else if (base==1) {
            this.number = number.length();
        }
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
    public String getNumberWithPrefix(int base){
        return getPrefixBase(base)+getNumber(base);
    }
    public String getNumber(int base){
        if (base>1){
            return Integer.toString(this.number,base);
        }else if (base==1){
            return Stream.generate(()->"1").limit(this.number).collect(Collectors.joining());
        }
        return "";
    }
    public String getNumber(){return Integer.toString(this.number,10);
    }
}
