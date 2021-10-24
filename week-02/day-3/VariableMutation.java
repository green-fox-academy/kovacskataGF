public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;

        a += 10;
        System.out.println(a);

        int b = 100;
        b -= 7;

        System.out.println(b);

        int c = 44;
        c *= 2;

        System.out.println(c);

        int d = 125;
        d /= 5;

        System.out.println(d);

        int e = 8;
        e *= e;

        System.out.println(e);

        int f1 = 123;
        int f2 = 345;

        boolean bigger = f2 > f1;
        System.out.println(bigger);

        int g1 = 350;
        int g2 = 200;

        boolean dbl = ((g2 *= 2) > g1);
        System.out.println(dbl);

        int h = 135798745;

        int hh;
        hh = h % 11;
        boolean divi = hh == 0;
        System.out.println(divi);

        int i1 = 10;
        int i2 = 3;

        int i3 = i2 * i2;
        int i4 = i2 * i2 * i2;
        boolean i5 = (i1 > i3 && i1 < i4);
        System.out.println(i5);

        int j = 1521;

        int jj,jjj;
        jj = j % 3;
        jjj = j % 5;
        boolean jjjj = (jj == 0 && jjj == 0);
        System.out.println(jjjj);

    }
}