package Practice;

/**
 * @ClassName Sub
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月30日  09:57:46
 * @Version 1.0.0
 */

public class Sub  extends Parent{

    public  void show(){
        method();
        printMsg();
        this.printMsg();
        this.method();
        this.i = i;
        this.j = j;
        super.printMsg();
        super.method();
        int i = this.i;
        int j = this.j;
        System.out.println(i+"  "+j);
    }
    public static  void main(String[] args){
        Sub sub = new Sub();
        sub.show();
    }

}
