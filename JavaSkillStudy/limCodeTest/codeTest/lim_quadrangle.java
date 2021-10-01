package codeTest;

public class lim_quadrangle {

	
	public static void main(String[] args) {
		long answer = 0;
		int w = 8;
		int h = 12;
		/* 전제사항
		 * 사각형이 아닌 수치로 인식함
		 * x축 y축처럼 하나의 축을 기준으로 두 방향으로 나뉘며 그 중 한 방향은 1보다 작은 수로 이루어져있다고 가정 */
		
		// 최대치
        double max=w>h?w:h;
        // 최소치
        double min=w>h?h:w;
        // 1보다 작은 분수를 만들기 위해 max를 분모로, min을 분자로 하였다. 이것은 비교하기 위한 최대치
        double b = min/max;
        for(int i=1;i<min;i++){
        	// 
            for(int j=1;j<max;j++){
                if((double)i/j<=b){
                	System.out.println(i+","+j + " = " + b);
                    answer=answer+((int)max-j);
                    break;
                }
            }
        }
        System.out.print(answer*2);
	}

}
