package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class qm4 extends xm4 {
    public static final void A0(int r1) {
        if (r1 < 0) goto L4;
        return;
    L4:
        kf2.e(f34.f(r1, "Limit must be non-negative, but was "));
    }

    public static final List B0(String r8, CharSequence r9, int r10) {
        A0(r10);
        int r1 = q0(r9, r8, 0, false);
        if (r1 == (-1)) goto L25;
        if (r10 == 1) goto L25;
        if (r10 <= 0) goto L9;
        boolean r4 = true;
    L10:
        int r6 = 10;
        if (r4 == false) goto L15;
        if (r10 > 10) goto L15;
        r6 = r10;
    L15:
        ArrayList r5 = new ArrayList(r6);
        int r7 = 0;
    L16:
        r5.add(r9.subSequence(r7, r1).toString());
        r7 = r8.length() + r1;
        if (r4 == true) goto L19;
    L20:
        r1 = q0(r9, r8, r7, false);
        if (r1 != (-1)) goto L16;
    L22:
        r5.add(r9.subSequence(r7, r9.length()).toString());
        return r5;
    L19:
        if (r5.size() == (r10 - 1)) goto L22;
    L9:
        r4 = false;
    L25:
        return gb.O(r9.toString());
    }

    public static List C0(CharSequence r4, String[] r5, int r6) {
        if ((r6 & 4) == 0) goto L5;
        int r7 = 0;
    L6:
        r4.getClass();
        if (r5.length != 1) goto L13;
        String r0 = r5[0];
        if (r0.length() == 0) goto L13;
        return B0(r0, r4, r7);
    L13:
        A0(r7);
        List r8 = Arrays.asList(r5);
        r8.getClass();
        ha4 r9 = new ha4(new mo0(r4, r7, new z(15, r8)));
        ArrayList r10 = new ArrayList(r40.k0(r9, 10));
        Iterator r11 = r9.iterator();
    L14:
        lo0 r1 = (lo0) r11;
        if (r1.hasNext() == false) goto L17;
        j02 r2 = (j02) r1.next();
        r2.getClass();
        r10.add(r4.subSequence(r2.n, r2.o + 1).toString());
        goto L14
    L17:
        return r10;
    L5:
        r7 = 2;
        goto L6
    }

    public static List D0(String r5, char[] r6) {
        r5.getClass();
        if (r6.length == 1) goto L5;
        A0(0);
        ha4 r7 = new ha4(new mo0(r5, 0, new z(14, r6)));
        ArrayList r0 = new ArrayList(r40.k0(r7, 10));
        Iterator r8 = r7.iterator();
    L7:
        lo0 r1 = (lo0) r8;
        if (r1.hasNext() == false) goto L10;
        j02 r2 = (j02) r1.next();
        r2.getClass();
        r0.add(r5.subSequence(r2.n, r2.o + 1).toString());
        goto L7
    L10:
        return r0;
    L5:
        return B0(String.valueOf(r6[0]), r5, 0);
    }

    public static String E0(String r2, char r3) {
        int r4 = r0(r2, r3, 0, 6);
        if (r4 != (-1)) goto L6;
        return r2;
    L6:
        return r2.substring(r4 + 1, r2.length());
    }

    public static String F0(String r2, String r3) {
        r2.getClass();
        r2.getClass();
        int r0 = s0(r2, r3, 0, 6);
        if (r0 != (-1)) goto L6;
        return r2;
    L6:
        return r2.substring(r3.length() + r0, r2.length());
    }

    public static String G0(String r2, char r3, String r4) {
        r2.getClass();
        r4.getClass();
        int r5 = v0(r2, r3, 0, 6);
        if (r5 != (-1)) goto L6;
        return r4;
    L6:
        return r2.substring(r5 + 1, r2.length());
    }

    public static String H0(String r2, char r3) {
        r2.getClass();
        r2.getClass();
        int r4 = r0(r2, r3, 0, 6);
        if (r4 != (-1)) goto L6;
        return r2;
    L6:
        return r2.substring(0, r4);
    }

    public static CharSequence I0(int r1, String r2) {
        r2.getClass();
        if (r1 < 0) goto L9;
        int r0 = r2.length();
        if (r1 <= r0) goto L8;
        r1 = r0;
    L8:
        return r2.subSequence(0, r1);
    L9:
        kf2.e(b11.j(r1, "Requested character count ", " is less than zero."));
        return null;
    }

    public static String J0(int r1, String r2) {
        r2.getClass();
        if (r1 < 0) goto L9;
        int r0 = r2.length();
        if (r1 <= r0) goto L8;
        r1 = r0;
    L8:
        return r2.substring(0, r1);
    L9:
        kf2.e(b11.j(r1, "Requested character count ", " is less than zero."));
        return null;
    }

    public static CharSequence K0(CharSequence r5) {
        r5.getClass();
        int r0 = r5.length() - 1;
        int r2 = 0;
        boolean r3 = false;
    L3:
        if (r2 > r0) goto L16;
        if (r3 == true) goto L6;
        int r4 = r2;
    L7:
        boolean r6 = ya4.y(r5.charAt(r4));
        if (r3 == false) goto L9;
        if (r6 == false) goto L16;
        r0 = r0 - 1;
        goto L3
    L9:
        if (r6 == false) goto L10;
        r2 = r2 + 1;
        goto L3
    L10:
        r3 = true;
        goto L3
    L6:
        r4 = r0;
    L16:
        return r5.subSequence(r2, r0 + 1);
    }

    public static String L0(String r8, char... r9) {
        r8.getClass();
        int r0 = r8.length() - 1;
        if (r0 < 0) goto L16;
    L4:
        int r2 = r0 - 1;
        char r3 = r8.charAt(r0);
        int r4 = r9.length;
        int r6 = 0;
    L5:
        if (r6 >= r4) goto L10;
        if (r3 == r9[r6]) goto L11;
        r6 = r6 + 1;
    L11:
        if (r6 < 0) goto L15;
        if (r2 < 0) goto L16;
        r0 = r2;
        goto L4
    L15:
        CharSequence r10 = r8.subSequence(0, r0 + 1);
    L18:
        return r10.toString();
    L10:
        r6 = -1;
    L16:
        r10 = "";
        goto L18
    }

    public static boolean n0(CharSequence r2, char r3) {
        r2.getClass();
        if (r0(r2, r3, 0, 2) < 0) goto L6;
        return true;
    L6:
        return false;
    }

    public static boolean o0(CharSequence r2, String r3) {
        r2.getClass();
        r3.getClass();
        if (s0(r2, r3, 0, 2) < 0) goto L6;
        return true;
    L6:
        return false;
    }

    public static boolean p0(CharSequence r8, String r9) {
        if ((r8 instanceof String) == false) goto L7;
        return xm4.e0((String) r8, r9, false);
    L7:
        return y0(r8, r8.length() - r9.length(), r9, 0, r9.length(), false);
    }

    public static final int q0(CharSequence r11, String r12, int r13, boolean r14) {
        r11.getClass();
        r12.getClass();
        if (r14 == false) goto L5;
    L9:
        int r0 = r11.length();
        if (r13 >= 0) goto L12;
        r13 = 0;
    L12:
        int r2 = r11.length();
        if (r0 <= r2) goto L15;
        r0 = r2;
    L15:
        j02 r1 = new j02(r13, r0, 1);
        boolean r15 = r11 instanceof String;
        int r3 = r1.p;
        int r4 = r1.o;
        int r5 = r1.n;
        if (r15 == true) goto L18;
    L29:
        boolean r8 = r14;
        if (r3 <= 0) goto L32;
        if (r5 > r4) goto L32;
    L34:
        CharSequence r7 = r11;
        boolean r10 = r8;
        int r9 = r5;
        if (y0(r12, 0, r7, r9, r12.length(), r10) == true) goto L46;
        if (r9 == r4) goto L39;
        r5 = r9 + r3;
        r11 = r7;
        r8 = r10;
    L39:
        return -1;
    L46:
        return r9;
    L32:
        if (r3 >= 0) goto L39;
        if (r4 > r5) goto L39;
    L18:
        if ((r12 instanceof String) == false) goto L29;
        if (r3 <= 0) goto L21;
        if (r5 > r4) goto L21;
    L23:
        int r6 = r5;
    L24:
        int r16 = r12.length();
        String r17 = r12;
        boolean r18 = r14;
        if (xm4.g0(0, r6, r16, r17, (String) r11, r18) == true) goto L47;
        if (r6 == r4) goto L39;
        r6 = r6 + r3;
        r12 = r17;
        r14 = r18;
        goto L24
    L47:
        return r6;
    L21:
        if (r3 >= 0) goto L39;
        if (r4 > r5) goto L39;
    L5:
        if ((r11 instanceof String) == false) goto L9;
        return ((String) r11).indexOf(r12, r13);
    }

    public static int r0(CharSequence r1, char r2, int r3, int r4) {
        if ((r4 & 2) == 0) goto L5;
        r3 = 0;
    L5:
        r1.getClass();
        if ((r1 instanceof String) == true) goto L10;
        return t0(r1, new char[]{r2}, r3, false);
    L10:
        return ((String) r1).indexOf(r2, r3);
    }

    public static /* synthetic */ int s0(CharSequence r1, String r2, int r3, int r4) {
        if ((r4 & 2) == 0) goto L6;
        r3 = 0;
    L6:
        return q0(r1, r2, r3, false);
    }

    public static final int t0(CharSequence r6, char[] r7, int r8, boolean r9) {
        r6.getClass();
        if (r9 == true) goto L11;
        if (r7.length != 1) goto L11;
        if ((r6 instanceof String) == false) goto L11;
        return ((String) r6).indexOf(ti.o0(r7), r8);
    L11:
        if (r8 >= 0) goto L13;
        r8 = 0;
    L13:
        int r2 = r6.length() - 1;
        if (r8 > r2) goto L23;
    L15:
        char r0 = r6.charAt(r8);
        int r3 = r7.length;
        int r4 = 0;
    L16:
        if (r4 >= r3) goto L21;
        if (ya4.o(r7[r4], r0, r9) == true) goto L19;
        r4 = r4 + 1;
        goto L16
    L19:
        return r8;
    L21:
        if (r8 == r2) goto L28;
        r8 = r8 + 1;
        goto L15
    L28:
        return -1;
    L23:
        return -1;
    }

    public static boolean u0(CharSequence r3) {
        r3.getClass();
        int r1 = 0;
    L4:
        if (r1 >= r3.length()) goto L9;
        if (ya4.y(r3.charAt(r1)) == false) goto L7;
        r1 = r1 + 1;
        goto L4
    L7:
        return false;
    L9:
        return true;
    }

    public static int v0(String r0, char r1, int r2, int r3) {
        if ((r3 & 2) == 0) goto L5;
        r0.getClass();
        r2 = r0.length() - 1;
    L5:
        r0.getClass();
        return r0.lastIndexOf(r1, r2);
    }

    public static List w0(String r2) {
        fb2 r0 = new fb2(r2);
        if (r0.hasNext() == false) goto L5;
        Object r3 = r0.next();
        if (r0.hasNext() == false) goto L9;
        ArrayList r1 = new ArrayList();
        r1.add(r3);
    L12:
        if (r0.hasNext() == false) goto L14;
        r1.add(r0.next());
        goto L12
    L14:
        return r1;
    L9:
        return gb.O(r3);
    L5:
        return u01.n;
    }

    public static String x0(int r3, String r4) {
        r4.getClass();
        if (r3 >= 0) goto L5;
        kf2.n(b11.j(r3, "Desired length ", " is less than zero."));
        return null;
    L5:
        if (r3 > r4.length()) goto L7;
        CharSequence r5 = r4.subSequence(0, r4.length());
    L14:
        return r5.toString();
    L7:
        StringBuilder r0 = new StringBuilder(r3);
        int r6 = r3 - r4.length();
        int r1 = 1;
        if (1 > r6) goto L12;
    L9:
        r0.append('0');
        if (r1 == r6) goto L12;
        r1 = r1 + 1;
    L12:
        r0.append(r4);
        r5 = r0;
        goto L14
    }

    public static final boolean y0(CharSequence r4, int r5, CharSequence r6, int r7, int r8, boolean r9) {
        r4.getClass();
        r6.getClass();
        if (r7 < 0) goto L18;
        if (r5 < 0) goto L18;
        if (r5 > (r4.length() - r8)) goto L18;
        if (r7 > (r6.length() - r8)) goto L18;
        int r1 = 0;
    L11:
        if (r1 >= r8) goto L16;
        if (ya4.o(r4.charAt(r5 + r1), r6.charAt(r7 + r1), r9) == false) goto L14;
        r1 = r1 + 1;
        goto L11
    L14:
        return false;
    L16:
        return true;
    L18:
        return false;
    }

    public static String z0(String r1, String r2) {
        r1.getClass();
        if (xm4.k0(r1, r2, false) == true) goto L5;
        return r1;
    L5:
        return r1.substring(r2.length());
    }
}
