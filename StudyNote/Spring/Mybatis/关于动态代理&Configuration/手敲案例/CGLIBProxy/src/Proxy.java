import java.util.Iterator;
import java.util.Map;

public class Proxy extends Cookie{
    CookieInterface getCookieProxy(){
        return super.cookieInterface;
    }

    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        CookieInterface cookieInterface1=proxy.getCookieProxy();
        CookieInterface cookieInterface2=proxy.getCookieProxy();
        System.out.println(cookieInterface1+" "+cookieInterface2);  //Proxy@4554617c Proxy@4554617c
        /**ʵ���˹̶�����,ÿ�����ɵĴ������ǹ̶���(�����¡ʮ������,��¡��clone()Ӧ�÷��ڿ�¡��������)*/

        //��ȡ�����Cookie�еĻ���
        Map map=proxy.getCache();
        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            CookieInterface value = (CookieInterface) map.get(key);
            System.out.println("key = " + key + ", value = " + value.makeCookie());
            System.out.println(value.hashCode());
        }
    }
}
