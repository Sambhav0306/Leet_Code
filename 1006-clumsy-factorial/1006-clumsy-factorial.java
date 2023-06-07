class Solution {
    public int clumsy(int n) {
        Stack<Integer> stack=new Stack<>();
        int count=1;
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        if(n==3){
            return 6;
        }
        if(n==4){
            return 7;
        }
        stack.push((n*(n-1))/(n-2)+(n-3));
        n=n-4;
        int mid=1;
        while(n!=0){
            if(count==1){
                mid=-n;
            }else if(count==2){
                mid*=n;
            }else if(count==3){
                mid/=n;
            }else if(count==4){
                mid+=n;
            }else if(count==5){
                stack.push(mid);
                mid=1;
                count=0;
                n++;
            }
            count++;
            n--;
        }
        stack.push(mid);
        int a=0;
        while(stack.size()!=0){
            a=a+stack.pop();
        }
        return a;
    }
}