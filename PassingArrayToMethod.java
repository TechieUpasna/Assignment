package pattern;

public class PassingArrayToMethod {
//creating a method which pass an as a parameter
	static void maximumNo(int array[]) {
		int max=array[0];
		for(int i=1;i<array.length;i++) {
			if(max<array[i]) {
				max=array[i];
				System.out.println(max);
			}}}
			static void minimumNo(int array[]) {
				int min=array[0];
				for(int i=1;i<array.length;i++) {
					if(min>array[i]) {
						min=array[i];
						System.out.println(min);
					}
				}
			}
		
	public static void main(String[] args) {
		//declaring and initializing
		int a[]={5,9,56,52,36};
		maximumNo(a);
		minimumNo(a);

	}

}
