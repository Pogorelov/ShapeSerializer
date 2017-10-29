package ua.codegym.serializer.shape;


import java.io.Serializable;

public class Square extends AbstractShape implements Serializable {

    private Integer x;
    private Integer y;
    private Integer side;

    public Square(int x, int y, int side) {
        this.x = x;
        this.y = y;
        this.side = side;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getSide() {
        return side;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("<square");
        if (x != null) sb.append(format("x", x));
        if (y != null) sb.append(format("y", y));
        if (side != null) sb.append(format("side", side));
        sb.append("></square>");

        return sb.toString();
    }

}
