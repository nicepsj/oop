class Prob5 {
    public static void main(String args[]){
        int i = 10;
        int j = 20;
        
        MySum ms1 = new MySum(i, j);
        MySum ms2 = new MySum(i, j);

        System.out.println(ms1);

        if(ms1.equals(ms2))
            System.out.println("ms1과 ms2의 합계는 동일합니다.");
    }
}

class MySum {
    int first;
    int second;
    
    MySum (int first, int second){
        this.first = first;
        this.second = second;
    }

    /* 정수 덧셈 결과를 String으로 변환하도록  toString 메소드 오버라이딩하는 부분 */


    /* 매개변수가 MySum 객체를 참조하고 두 객체의 toString() 결과가 동일하면 true를, 
　　　매개변수가 MySum 객체가 아니거나 또는 현재 객체와 매개변수가 참조하는 객체의 
　　　toString() 메소드의 결과가 동일하지 않으면 false를 리턴하도록 
　　　equals 메소드 오버라이딩하는 부분 */


}
