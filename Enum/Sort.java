public class Sort{
	
	/**this method compare the arrayselement with each other and write it from the biggest one to        the littel one 
	**/
	public static void sort(SortMode mode, Isortable []toSort){
		for(int i=0; i< toSort.length-2;i++){
			for(int j=0; j<toSort.length-1;j++){
				if(toSort[i].getSortString(mode).compareTo (toSort[j].getSortString(mode))>0){
					Isortable tmp=toSort[i];
					toSort[i]=toSort[j];
					toSort[j]=tmp;
				}
			}
		}
	}
}
					
				