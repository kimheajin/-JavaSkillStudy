package codeTest;

public class lim_quadrangle {

	public static void main(String[] args) {
		long answer = 0;
		int w = 8;
		int h = 12;
        double max=w>h?w:h;
        double min=w>h?h:w;
        double b = min/max;
        for(int i=1;i<min;i++){
            for(int j=1;j<max;j++){
                if((double)i/j<=b){
                	System.out.println(i+","+j);
                    answer=answer+((int)max-j);
                    break;
                }
            }
        }
        System.out.print(answer*2);
	}

}
