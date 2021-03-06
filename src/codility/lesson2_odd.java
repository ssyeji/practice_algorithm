package codility;

import java.util.*;

public class lesson2_odd {

    public static int solution(int[] A) {
        Arrays.sort(A);

        int tmp = A[0];
        int result = tmp;
        int cnt = 1;

        for(int i = 1; i<A.length; i++){
            if(tmp == A[i])
                cnt++;
            else {
                if(cnt%2 != 0){
                    result = tmp;
                    break;
                }
                tmp = A[i];
                cnt = 1;
            }

            if(i == A.length-1 && cnt%2 != 0){
                result = tmp;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] N = {2,2,3,3,4};

        int result = solution(N);
        System.out.println(result);
    }
}
