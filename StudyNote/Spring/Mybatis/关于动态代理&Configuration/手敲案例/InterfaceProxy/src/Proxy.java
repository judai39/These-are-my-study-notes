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
        /**从而实现了从"只知道Cookie接口"到通过代理类Proxy实现Cookie接口
         * 并且,我们还可以将getProxy()声明为static,可以实现随时调用
         * */
    }
}
