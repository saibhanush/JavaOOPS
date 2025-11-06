import java.util.*;
public class NearestSmallestelement {
    public static void main(String[] args) {
        int []A={8,5,4,1,10,13,23,4,7};
        int[]res=prevoiussmall(A);
        for(int x:res){
            System.out.print(x+" ");
        }
    }
    public static int[] prevoiussmall(int[] A){
        int n=A.length;
        int[]res=new int[n];
        Stack<Integer> st=new Stack<>();
        st.push(A[0]);
        res[0]=-1;
        for(int i=1;i<n;i++){
            while(!st.isEmpty()&&st.peek()>=A[i]){
                st.pop();
            }
            if(st.isEmpty()){
                res[i]=-1;
            }else {
                res[i]=st.peek();
            }
            st.push(A[i]);
        }
        return res;
    }
}
