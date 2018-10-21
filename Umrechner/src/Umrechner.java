import java.util.Scanner;
public class Umrechner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Conversion from Euro to Dollar
		
     do {
    	 Scanner input = new Scanner(System.in);
    	 System.out.println("Was möchten Sie umrechen:\n1:Euro zu Dollar\n2:Dollar zu Euro");
    	 double unity = input.nextDouble();
    	 int currency =(int) unity;
    	 if((currency!=1)&&(currency!= 2))
    	 {
    		 System.out.println("Keine Ausgabe möglich");	 		
    	 }
    	 else
    	 {
    		 Scanner value = new Scanner(System.in);
    		 System.out.println("Geben Sie ihr Geld an das Sie umgerechnet bekommen wollen");
    		 double money = value.nextDouble();
    		 switch(currency) 
    		 {
    		 case 1:
    			 System.out.println(money + "Euro ist" + money*1.34 + "Dollar");
    			 break;
    		 case 2:
    			 System.out.println(money +"Dollar ist" +money*0.87 +"Euro");   
    			 break;
    		 }
    	 }
    	 Scanner finish = new Scanner(System.in);
    	 System.out.println("Wollen Sie das Programm beenden?Y-Ja/N-Nein");
    	 char finalrun;
    	 finalrun = finish.next().charAt(0);
    	 if (finalrun == 'Y') {
    		 break;
    	 }
    	 
    	 
     }while(true);
	}
	}

