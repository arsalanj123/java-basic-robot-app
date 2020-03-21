public class Droid {
  
  private String name;
  private int batteryLevel;

  public Droid(String droidName){
    name = droidName;
    batteryLevel = 100;
  }

  public void performTask(String task){
    batteryLevel = batteryLevel - 10;
    System.out.println(name+" is performing task: "+task);
  }

  public void checkBattery(){
    System.out.println(batteryLevel);
  }

  public String toString(){
    return "Hello, I'm the driod: "+name;
  }

  public static void main(String[] args){
    Droid Codey = new Droid("Codey");
    System.out.println(Codey);
    Codey.checkBattery();
    Codey.performTask("Dancing");
    Codey.checkBattery();
    Codey.performTask("Cleaning");
    Codey.checkBattery();
  }

}
