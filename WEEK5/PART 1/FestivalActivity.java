class FestivalplanningException extends Exception{
    FestivalplanningException(String message){
        super(message);
    }
}
public abstract class FestivalActivity{
    String activityName;
    double estimatedCost;
    FestivalActivity(String an,double ec){
        this.activityName=an;
        this.estimatedCost=ec;
    }
   public abstract void planActivity() throws FestivalplanningException;
   void display(){
    System.out.println("Activity Name:"+activityName);
    System.out.println("Estimated COst:"+estimatedCost);
   }

}