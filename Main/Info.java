package Main;

public class Info {
    public static final int studentBook = 3429;
    public static final String group = "ІО-34";
    public static final String name = "Янчук Артур";
    public static final int c6 = studentBook % 6;
    public static final int c5 = studentBook % 5;
    public static final int c2 = studentBook % 2;
    public static final int c3 = studentBook % 3;
    public static final int c4 = studentBook % 4;

    public static String getInfo() {
        return "Info: " + group + " " + name +
                "\nНомер залікової книжки: " + studentBook +
                "\n{c6=" + c6 +
                ", c5=" + c5 +
                ", c4=" + c4 +
                ", c3=" + c3 +
                ", c2=" + c2 +
                '}';
    }
}


