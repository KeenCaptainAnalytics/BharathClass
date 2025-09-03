class Callstack{
    static int doSomethingEvenMore(){
       System.out.println("line 6");
       return 10;
    }
    static int doSomethingMore(){
        System.out.println("line 4");
        int b = doSomethingEvenMore();//10
        int a = 23;
        a = a*b;
        System.out.println("line 5"); 
        return a;
    }
    static int doSomething(){
        System.out.println("line3");
        int a = 100;
        int b = doSomethingMore();
        return a*b;
    }
    public static void main(String[] args) {
        System.out.println("line1");
        doSomething();
        System.out.println("line2");
    }
}