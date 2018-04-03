package proxy;

import proxy.robot_proxy.ProxyTransformer;
import proxy.robot_proxy.Transformer;

public class ProxyMain {
    public static void main(String[] args) {
        ProxyTransformer _Proxy = new ProxyTransformer();
        _Proxy._shoot();
        System.out.println("Name " + _Proxy._get_ID());
        Transformer transformer = _Proxy._create();
        transformer._shoot();
        System.out.println(_Proxy._get_ID());
        System.out.println(_Proxy._transform()._get_ID());
        Transformer __Optimus = _Proxy.constructTransformer();
        System.out.println(__Optimus._get_ID());
        Transformer _Optimus_Car = __Optimus._transform();
        System.out.println(_Optimus_Car._get_ID());
        //null here, cause no reference for this from proxy
        System.out.println(_Proxy.__Transformer._get_ID());
    }
}
