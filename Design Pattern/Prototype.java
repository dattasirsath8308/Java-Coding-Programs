
/* 
5. Protypes Design Pattern
	- The concept is to copy an existing object rather than creating a new instance from scratch.bcoz creating new object may be constly.
	- This approach saves costly resource and time, especially when object creation is a heavy process.


*/

class NetworkConnection implements Cloneable
{
    private String ip;
    private String importantData;


    public String getIp() {
        return ip;
    }

    public String getImportantData() {
        return importantData;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
    
    public void setImportantData(String importantData) {
        this.importantData = importantData;
    }


    // it will takes 5 minutes to load 
    public void loadVaryImportanntData() throws Exception {
        this.importantData = "Very very important Data It take First time for creating Object!.";
        Thread.sleep(5000);
    }


    @Override
    public String toString() {        
        return this.ip +": "+this.importantData;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}



public class Prototype {

    public static void main(String[] args) throws Exception{
        
        System.out.println("creating object using prototype design");
        NetworkConnection nc1 = new NetworkConnection();
        nc1.setIp("184.98.1.1");
        nc1.loadVaryImportanntData();;

        System.out.println(nc1);
        // System.out.println(nc1.hashCode());

        try {
            NetworkConnection nc2  = (NetworkConnection) nc1.clone();
            System.out.println(nc2);
            // System.out.println(nc2.hashCode());


            NetworkConnection nc3  = (NetworkConnection) nc1.clone();
            System.out.println(nc3);
            // System.out.println(nc3.hashCode());


        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
    
}
