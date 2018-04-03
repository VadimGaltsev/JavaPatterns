package proxy.robot_proxy;

public interface Transformer {
    Transformer _transform();
    Transformer _create();
    void _shoot();
    String _get_ID();
    Transformer constructTransformer();
}
