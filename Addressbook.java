
import java.util.Scanner;
class Data
{
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private int zipcode;
    private long mobileNo;

    public String getfirstName()
    {
        return firstName;
    }
    public void setfirstName(String firstName)
    {
        this.firstName=firstName;
    }
    public String getlastName()
    {
        return lastName;
    }
    public void setlasttName(String lastName)
    {
        this.lastName=lastName;
    }
    public String getaddress()
    {
        return address;
    }
    public void setaddress(String address)
    {
        this.address=address;
    }
    public String getcity()
    {
        return city;
    }
    public void setcity(String city)
    {
        this.city=city;
    }
    public String getstate()
    {
        return state;
    }
    public void setstate(String state)
    {
        this.state=state;
    }
    public int getzipcode()
    {
        return zipcode;
    }
    public void setzipcode(int zipcode)
    {
        this.zipcode=zipcode;
    }
    public long getmobileNo()
    {
        return mobileNo;
    }
    public void setmobileNo(long mobileNo)
    {
        this.mobileNo=mobileNo;
    }
    public Data(String firstName, String lastName, String address, String city, String state, int zipcode, long mobileNo)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.address=address;
        this.city=city;
        this.state=state;
        this.zipcode=zipcode;
        this.mobileNo=mobileNo;
    }
    public String toString()
    {
        return "First Name:"+firstName+"\tLast Name:"+lastName+"\tAddress:"+address+"\tCity:"+city+"\tState:"+state+"\tZipcode:"+zipcode+"\tMobile No:"+mobileNo;
    }
}

public class Addressbook
{
    public static void main(String[] args)
    {
        String firstName;
        String lastName;
        String address = null;
        String city = null;
        String state = null;
        int zipcode = 0;
        long mobileNo = 0;
        int count=0;
        Scanner sc=new Scanner(System.in);

        Data a[]=new Data[20];
        System.out.println("Enter the First Name:");
        firstName=sc.next();
        System.out.println("Enter the Last Name:");
        lastName=sc.next();
        System.out.println("Enter Address:");
        address=sc.next();
        System.out.println("Enter City:");
        city=sc.next();
        System.out.println("Enter State:");
        state=sc.next();
        System.out.println("Enter Zipcode:");
        zipcode=sc.nextInt();
        System.out.println("Enter Mobile No:");
        mobileNo=sc.nextLong();
        a[count]=new Data(firstName,lastName,address,city,state,zipcode,mobileNo);
        count++;
        System.out.println("Added successfully\n");
    }
}

