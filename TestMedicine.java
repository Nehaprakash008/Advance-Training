package ProblemStatement;

public class TestMedicine {

	public static void main(String[] args) {
		int max=3 ,min=1;
		MedicineInfo medicinelist[] = new MedicineInfo[10];
		for(int i=0; i<10; i++)
		{
			MedicineInfo medicine;
		int a = (int) (Math.random()*(max-min+1)+min); 
      if(a ==1 )
      {
    	 medicine = new Syrup(); 
      }
      else if(a ==2 )
      {
    	  medicine = new Tablet(); 
      }
      else
      {
    	  medicine = new Ointment(); 
      }
      medicinelist[i] = medicine;
		}
		for(int i=0; i<10; i++)
		{
			medicinelist[i].displayLabel();
		}
		
				
			
			
		}

}
