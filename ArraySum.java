package pattern;

public class ArraySum {

	public static void main(String[] args) {
		//create matrix
int a[] []= {{1,2},{3,4}};
int b[] []= {{4,5},{5,6}};
int sum[][]=new int [2][2];
for(int i=0;i<2;i++) {
	for(int j=0;j<2;j++) {
		sum[i][j]=a[i][j]+b[i][j]; //sum matrix
		System.out.println(sum[i][j]);
	}
}
	}

}
