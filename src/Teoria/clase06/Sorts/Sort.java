package Teoria.clase06.Sorts;

public abstract class Sort {

	public static void sortObject(Sortable[] losObj) {
		
		for (int i=0; i<losObj.length-2;i++) {
			
			for (int j=i+1; j<losObj.length-1;j++) {
				
				if (losObj[i].compare(losObj[j])>0)
						
						{
					
					
					Sortable temp= losObj[i];
					losObj[i]=losObj[j];
					losObj[j] =temp;
					
					
					
					
						}
				
			}
			
			
		}
		
		
	}
	
}
