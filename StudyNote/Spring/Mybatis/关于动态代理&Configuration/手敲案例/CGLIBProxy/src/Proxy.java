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
        /**实现了固定代理,每次生成的代理类是固定的(这与克隆十分相像,克隆的clone()应该放在克隆对象本体中)*/

        //读取存放在Cookie中的缓存
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
