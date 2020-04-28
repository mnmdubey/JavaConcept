package Z_Java_Interview;

public class FindMissingNum {
	public static void main(String[] args) {
		
	
	int OrigNum [] = {1, 2, 3, 4, 6, 7, 8};
	
	int OnCnt = OrigNum.length;
	System.out.println("Tot num count: "+OnCnt);
	
	int gnSum = 0;
	for(int i = 0; i<=OnCnt-1; i++)
	gnSum = gnSum + OrigNum[i];
	System.out.println(gnSum);
	System.out.println("---------------");
	
	int gnAllSum = 0;
	for(int i = 1; i<=(OnCnt+1); i++)
	{
		gnAllSum = gnAllSum + i;
		System.out.println(gnAllSum);
	}
	System.out.println(gnAllSum);
	
	System.out.println("Missing Num: "+(gnAllSum-gnSum));
	
}
}