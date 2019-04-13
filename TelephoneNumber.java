
public class TelephoneNumber implements  Comparable <TelephoneNumber>{
    private String DirNumber;
    private String TelNumber;

    public TelephoneNumber(){
        this.DirNumber = "0";
        this.TelNumber = "0";
    }
    public TelephoneNumber(String DirNumber, String TelNumber){
        this.DirNumber = DirNumber;
        this.TelNumber = TelNumber;
    }
    public int compareTo(TelephoneNumber other){
        if(this.DirNumber.compareTo(other.DirNumber) == 0)
        {
            return this.TelNumber.compareTo(other.TelNumber);
        }
        else return this.DirNumber.compareTo(other.DirNumber);
    }
    String GetDirNumber(){
        return this.DirNumber;
    }
    String GetTelNumber(){
        return this.TelNumber;
    }
    void SetDirNumber(String n){
        this.DirNumber = n;
    }
    void SetTelNumber(String n){
        this.TelNumber = n;
    }
}