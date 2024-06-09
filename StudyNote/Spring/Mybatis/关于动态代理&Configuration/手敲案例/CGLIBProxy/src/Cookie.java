import java.util.HashMap;
import java.util.Map;

interface CookieInterface{
    String makeCookie();
}
public class Cookie implements CookieInterface{
    //代理生成的固定对象
    CookieInterface cookieInterface=this;

    //尝试将缓存机制引入并与之结合(这里的缓存指的是实现CookieInterface后新增的内容)
    CookieInterface cookieInterfaceCompare=new CookieInterface() {
        @Override
        public String makeCookie() {
            return "我是实现接口后修改的属性";
        }
    };
    Map<String, CookieInterface> getCache(){
        Map<String,CookieInterface> map=new HashMap<String, CookieInterface>();
        map.put("cookieInterface",cookieInterface);
        map.put("cookieInterfaceCompare",cookieInterfaceCompare);
        return map;
    }


    @Override
    public String makeCookie() {
        return "cookie have done";
    }

    @Override
    public String toString() {
        return makeCookie();
    }
}
