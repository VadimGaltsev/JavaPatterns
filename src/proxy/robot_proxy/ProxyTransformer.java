package proxy.robot_proxy;

public class ProxyTransformer implements Transformer {

    /**
     * for test make it public
     */
    public Transformer __Transformer;

    @Override
    public Transformer _transform() {
        return new ProxyTransformer() {
            private String __Name_ID = "TransformerProxy car";
            @Override
            public void _shoot() {
                System.out.println("Transformer now in car mode");
            }

            @Override
            public String _get_ID() {
                return __Name_ID;
            }
        };
    }

    @Override
    public Transformer _create() {
        if (__Transformer == null)
        return this;
        else return __Transformer;
    }

    @Override
    public void _shoot() {
        System.out.println("Transformer piu piu");
    }

    @Override
    public String _get_ID() {
        return OptimusTransformer.__Proxy_Name = "ProxyTransformer";
    }

    @Override
    public Transformer constructTransformer() {
        __Transformer = new OptimusTransformer();
        Transformer _Transformer = __Transformer;
        __Transformer = null;
        return _Transformer;
    }


}
