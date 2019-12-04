public class ApplicationTest{
       
    public static void main(String[]args){
		//obiect from the Sort class
        Sort sort=new Sort();
		//sortValuesArray method call which order the elemente of an array
		sort.sortValuesArray();
		System.out.println();
		
		//object from the Add class
		Add add=new Add();
		// addValuesArray method call which sum the elemente of the array
		add.addValuesArray();
		System.out.println();
		
		//object from the Print class
		Print print=new Print();
		//printGrid method call which print specific form
		print.printGrid();
		System.out.println();
		
		//object from the Avg class
		Avg avg=new Avg();
		// calculateAvgOfArray method call which calculate the avg of the array elemente
		avg.calculateAvgOfArray();
		System.out.println();
		
		//object from the TestSpecificValue
		TestSpecificValue test=new TestSpecificValue();
		// arrayContainSpecificValue method call which cheack if the element in the array is or not
		test.arrayContainSpecificValue();
		System.out.println();
		
		//object from the FindIndex class 
		FindIndex index=new FindIndex();
		//findElementIndex method call which returns the index of the value
		index.findElementIndex();
		System.out.println();
		
		//RemoveElemente remove=new RemoveElemente();
		//remove.rem();
		
		//object from the CopyArray class
		CopyArray element=new CopyArray();
		//call the copyArrayElement method which returns a copy of an array
		element.copyArrayElement();
		System.out.println();
		
		//object from the InsertElement class
		InsertElement insert=new InsertElement();
		//call the insertElementIntoArray method which replace a value with another
		insert.insertElementIntoArray();
		System.out.println();
		
		//object from the FindMaxMinArray class
		FindMaxMinArray find=new FindMaxMinArray();
		//call the findMaxMinArray method which returns the max and min values
		find.findMaxMinArray();
		System.out.println();
		
		//object from the Reverse class
		Reverse j=new Reverse();
		//call the reverse method
		j.reverse();
		System.out.println();
		
		//object from the DuplicateValues class
		DuplicateValues f=new DuplicateValues();
		//call the findDuplicateValues method
		f.findDuplicateValues();
		System.out.println();
		
		FindCommonElements d=new FindCommonElements();
		d.findCommonElements();
	}
}



				 