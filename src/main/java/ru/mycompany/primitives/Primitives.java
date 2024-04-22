package ru.mycompany.primitives;

public class Primitives {
  public static void main(String[] args) {
    byte b = 120;
    Byte bb = b;
    short s = 230;
    Short ss = s;
    int i = 23425;
    Integer ii = i;
    long l = 45624L;
    Long ll = l;

    boolean bl = true;
    Boolean Bl = bl;
    char ch = '#';
    Character Ch = ch;
    float fl = 35.3221f;
    Float Fl = fl;
    double dbl = 36434.636346;
    Double Dbl = dbl;

    System.out.println("byte: " + b + "  Max value: " + bb.MAX_VALUE + "  Min value: " + bb.MIN_VALUE);
    System.out.println("short: " + s + "  Max value: " + ss.MAX_VALUE + "  Min value: " + ss.MIN_VALUE);
    System.out.println("int: " + i + "  Max value: " + ii.MAX_VALUE + "  Min value: " + ii.MIN_VALUE);
    System.out.println("long: " + l + "  Max value: " + ll.MAX_VALUE + "  Min value: " + ll.MIN_VALUE);

    System.out.println("boolean: " + bl + "  values: true / false");
    System.out.println("char: " + ch + "  Max value: " + (int)Ch.MAX_VALUE + "  Min value: " + (int)Ch.MIN_VALUE);
    System.out.println("float: " + fl + "  Max value: " + Fl.MAX_VALUE + "  Min value: " + Fl.MIN_VALUE);
    System.out.println("double: " + dbl + "  Max value: " + Dbl.MAX_VALUE + "  Min value: " + Dbl.MIN_VALUE);

  }
}
