package proxy.robot_proxy;

class OptimusTransformer implements Transformer {

    private static String __Name_ID;
    protected static String __Proxy_Name;

    static {
        __Name_ID = "Optimus 3342";
    }

    @Override
    public Transformer _transform() {
        return new OptimusTransformer() {
            private String __Name_ID = "TransformerOptimus car";
            @Override
            public void _shoot() {
                System.out.println("TransformerOptimus now in car mode");
            }

            @Override
            public String _get_ID() {
                return __Name_ID;
            }
        };
    }

    @Override
    public Transformer _create() {
        return this;
    }

    @Override
    public void _shoot() {
        System.out.println("Optimus transformer piu piu");
    }

    @Override
    public String _get_ID() {
        return __Name_ID;
    }

    @Override
    public Transformer constructTransformer() {
        return this;
    }
}
