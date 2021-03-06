package A20200807_bili第一季;

/**
 * @author : Mr huangye
 * @URL : CSDN 皇夜_
 * @createTime : 2020/8/7 9:13
 * @Description :
 */
public class Test {

    /**
     * i=4
     * j=1
     * k=11
     * @param args
     */
    public static void main(String[] args) {
        example();
        example2();
    }

    private static void example() {
        // int i  局部变量表：1   操作数栈：null
        int i = 1;
        //运算的过程是要把 值压进 操作数栈中
        //等号右边 i++ ： ++在后，后计算，先压栈
        //      1.压栈：把i的值压入操作数栈 此时，  局部变量表：1   操作数栈：1
        //      2.计算：i自增，此时，局部变量表：2   操作数栈：1
        //等号左边 i变量赋值 此时,将操作数栈的结果再赋值给 i ，即 i=1,在此过程中i是曾经变为2的，后面又变回1
        i = i++;
        //等号右边 i++ ： ++在后，后计算，先压栈
        //      1.压栈：把i的值压入操作数栈 此时，  局部变量表：1   操作数栈：1
        //      2.计算：i自增，此时，局部变量表：2   操作数栈：1
        //等号左边 j变量赋值,此时操作数栈结果1，i的结果为2（取局部变量表），操作数栈结果赋值给j，因此此时 i=2 j=1
        int j = i++;
        //等号右边：i + ++i * i++
        //      1.i压栈 局部变量表：2   操作数栈：2
        //      2.++i压栈，先++，就是先计算，后压栈，所以 ++i的压栈结果为
        //          1.计算后压栈：局部变量表：3 操作数栈：3
        //      3.i++压栈，++在后，后计算，先压栈
        //          1.压栈：把i的值压入操作数栈 此时，  局部变量表：3   操作数栈：3
        //          2.计算：i自增，此时，局部变量表：4   操作数栈：3
        //          3.i局部变量表变为 4 ，故i=4
        //等号右边计算：操作数栈结果分别为 2 3 3 ，计算为 2+3*3=11 赋值给 K ，所以k = 11
        int k = i + ++i * i++;
        //最后 i=4 j=1 k=11
        System.err.println("i=" + i);
        System.err.println("j=" + j);
        System.err.println("k=" + k);
    }
    private static void example2() {
        int i = 2; // 2 0
        //表:2  栈0
        int j = i++;// i++ 3 2 赋值 j=2 i=3
        //先压栈后计算，栈为2 ，变量自增为3，赋值为操作数栈为2，此时 i=3 ,j =2
        i = i++;// i++ 4 3 赋值 i=3
        //先压栈后计算，栈为3 ，变量自增为4,赋值覆盖4为3，此时 i=3 ,j =2
        int k = i + ++i * i++;// ++i 4 4  i++  5 4 k=3+4*4 = 19
        //++i，先计算后压栈 表4 栈4
        //i++，先压栈后计算 表5 栈4
        //右边加和 3+4*4 = k = 19
        //5 2 19
        System.err.println("i=" + i);
        System.err.println("j=" + j);
        System.err.println("k=" + k);
    }

}
