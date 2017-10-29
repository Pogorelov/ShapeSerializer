package ua.codegym.serializer.shape;

import java.util.List;
import java.util.ArrayList;

public class Group extends AbstractShape {

  private List<Shape> shapes = new ArrayList<>();

  public void add(Shape shape) {
    shapes.add(shape);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("<group>");
    for(Shape shape : shapes) {
      sb.append(shape.toString());
    }
    sb.append("</group>");
    return sb.toString();
  }
}
