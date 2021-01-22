package com.mycompany.parking;
import java.time.LocalTime;


public class ExitStation  extends Tickets{
    private  final double minimumTime=15.0;
    private  final double minimumFee =0.5;
    private char type;
    private double startTime;
    private double endTime;
    
  ExitStation(){//the constructor
      
 }   
  
    public double calculateFee(char type)
    {   
        this.type = type;
        this.startTime = startTime;
        //Suppose that the parking fee is:
        //CAR:          $1.50/hr after 15 minutes
        //BUS:          $2.30/hr after 15 minutes
    
        double payTime = (endTime - startTime); 
        double fee =0.0;
        switch (type) {
            case 'c'://if it is a car
            case 'C':
                if (payTime <= minimumTime) {  //if payTime <= minimumTime the customer will pay minimum fee(0.5 $)
                    fee = minimumFee;
                    break;
                }
                 else
		{
		    fee = ((payTime)*1.50);
		    break;
		 }
	case 'B'://if it is a bus
	case'b' :
	    if (payTime <= minimumTime) //if payTime <= minimumTime the customer will pay minimum fee(0.5 $)
		{
		    fee = minimumFee;
		    break;
		}
		 else
		 {
			 fee = (payTime*2.30);
			 break;
		}
	default:
	      break;
	}
	return fee;
        }
    
    
    public void calculateTime() {
        LocalTime time = LocalTime.now();
        
        int starthour = time.getHour() - 12;
        double startminuts = time.getMinute();
        double startsecond = time.getSecond();
      
        //convert starttime into minuts
        startTime = (starthour*60)+startminuts+(startsecond/60);
        
         int endhour = time.getHour() - 12;
         double endminuts = time.getMinute();
         double endsecond = time.getSecond();
         
         //convert endttime into minuts
         endTime = (endhour*60)+endminuts+(endsecond/60);  
    }   
}