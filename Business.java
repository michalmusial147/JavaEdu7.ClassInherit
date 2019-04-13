

public class Business extends Record {
    private String name, address;
    private TelephoneNumber tel;
    public Business(String name,String address, String DirNumber,String TelNumber){
        this.name = name;
        this.address = address;
        this.tel = new TelephoneNumber(DirNumber, TelNumber);
    }
    @Override
    public void description(){
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Tel Nr: " + tel.GetDirNumber() + tel.GetTelNumber());
    }
}