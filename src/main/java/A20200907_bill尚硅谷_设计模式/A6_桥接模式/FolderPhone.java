package A20200907_bill尚硅谷_设计模式.A6_桥接模式;

/**
 * @author : Mr huangye
 * @URL : CSDN 皇夜_
 * @createTime : 2020/10/31 16:10
 * @Description :
 */
public class FolderPhone extends Phone {

    public FolderPhone(Brand brand) {
        super(brand);
    }

    public void call() {
        super.call();
        System.out.println(" 折叠样式手机 ");
    }
}
