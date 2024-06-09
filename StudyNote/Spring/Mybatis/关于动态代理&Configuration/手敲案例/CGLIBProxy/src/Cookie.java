import java.util.HashMap;
import java.util.Map;

interface CookieInterface{
    String makeCookie();
}
public class Cookie implements CookieInterface{
    //�������ɵĹ̶�����
    CookieInterface cookieInterface=this;

    //���Խ�����������벢��֮���(����Ļ���ָ����ʵ��CookieInterface������������)
    CookieInterface cookieInterfaceCompare=new CookieInterface() {
        @Override
        public String makeCookie() {
            return "����ʵ�ֽӿں��޸ĵ�����";
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
