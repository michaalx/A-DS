public class Triangle{
//	recommended MAXSIZE = 20;
	private static int size;
	private static boolean dia[] = new boolean[20];
	private static boolean col[] = new boolean[20];
	
	public Triangle(int n){
		this.size = n;
	} 

	public static int count(){
		for(int queens=size;queens>0;queens--){
			addQueen(0,queens);
			}
		return 0;
	}

	public static boolean addQueen(int row, int queens){
		for(int x=row;x<size;x++){
			if(!(col[x]||dia[x-row])){
				col[x] = true;
				dia[x-row] = true;
				if(row == queens-1){ 
					System.out.println("f("+size+") = "+queens);
					System.exit(1);
					return true;
				} else {
					addQueen(row+1,queens);
				}
				col[x] = false;
				dia[x-row] = false;			
			}
		}
		return false;
	}
	
	public static void main(String[] args){
		Triangle temp = new Triangle(Integer.parseInt(args[0]));
		temp.count();
	}
}