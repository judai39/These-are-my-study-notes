public class Proxy {
    public static Cookie getCookieProxy(){
        return new Cookie() {
            @Override
            public void makeCookie() {
                System.out.println("cookie have done");
            }
        };
    }

    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        Cookie cookie1=proxy.getCookieProxy();
        Cookie cookie2=proxy.getCookieProxy();
        System.out.println(cookie1+" "+cookie2);    //Proxy$1@4554617c Proxy$1@74a14482
        /**�Ӷ�ʵ���˴�"ֻ֪��Cookie�ӿ�"��ͨ��������Proxyʵ��Cookie�ӿ�
         * ����,���ǻ����Խ�getProxy()����Ϊstatic,����ʵ����ʱ����
         * */
    }
}
