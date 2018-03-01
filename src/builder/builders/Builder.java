package builder.builders;

abstract class Builder<T> {

    protected  abstract T createObject();
    protected abstract T getObject();
}
