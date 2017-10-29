package ua.codegym.serializer.xml.handler;

import ua.codegym.serializer.Serializer;
import ua.codegym.serializer.shape.Shape;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class XmlSerializer implements Serializer {

    @Override
    public void serialize(Shape shape, OutputStream os) {
        try (ObjectOutputStream oos = new ObjectOutputStream(os)) {

           oos.writeObject(shape);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Shape deserialize(InputStream is) {
        Shape shape = null;

        try (ObjectInputStream ois = new ObjectInputStream(is)) {

            shape = (Shape)ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return shape;
    }
}
