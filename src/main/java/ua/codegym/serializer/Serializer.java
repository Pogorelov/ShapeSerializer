package ua.codegym.serializer;

import ua.codegym.serializer.shape.Shape;

import java.io.InputStream;
import java.io.OutputStream;

public interface Serializer {
    void serialize(Shape shape, OutputStream os);

    Shape deserialize(InputStream is);
}