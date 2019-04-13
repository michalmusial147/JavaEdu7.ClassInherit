

public class Person extends Record {
    private String fName, sName, address;
    private TelephoneNumber tel;
    public Person(String fName,String sName,String address, String DirNumber,String TelNumber){
        this.fName = fName;
        this.sName = sName;
        this.address = address;
        this.tel = new TelephoneNumber(DirNumber, TelNumber);
    }
    @Override
    public void description(){
        System.out.println("Name: " + fName + sName);
        System.out.println("Address: " + address);
        System.out.println("Tel Nr: " + tel.GetDirNumber() + tel.GetTelNumber());
    }
}