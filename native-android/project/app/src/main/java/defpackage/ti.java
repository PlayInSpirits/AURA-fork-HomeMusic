package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class ti extends ji2 {
    public static boolean W(Object[] r7, Object[] r8) {
        if (r7 != r8) goto L6;
        return true;
    L6:
        if (r7 == null) goto L88;
        if (r8 == null) goto L88;
        if (r7.length != r8.length) goto L88;
        int r2 = r7.length;
        int r3 = 0;
    L12:
        if (r3 >= r2) goto L87;
        Object r4 = r7[r3];
        Object r5 = r8[r3];
        if (r4 == r5) goto L85;
        if (r4 == null) goto L86;
        if (r5 == null) goto L86;
        if ((r4 instanceof Object[]) == false) goto L27;
        if ((r5 instanceof Object[]) == false) goto L27;
        if (W((Object[]) r4, (Object[]) r5) == true) goto L85;
        return false;
    L27:
        if ((r4 instanceof byte[]) == false) goto L34;
        if ((r5 instanceof byte[]) == false) goto L34;
        if (Arrays.equals((byte[]) r4, (byte[]) r5) == true) goto L85;
        return false;
    L34:
        if ((r4 instanceof short[]) == false) goto L41;
        if ((r5 instanceof short[]) == false) goto L41;
        if (Arrays.equals((short[]) r4, (short[]) r5) == true) goto L85;
        return false;
    L41:
        if ((r4 instanceof int[]) == false) goto L48;
        if ((r5 instanceof int[]) == false) goto L48;
        if (Arrays.equals((int[]) r4, (int[]) r5) == true) goto L85;
        return false;
    L48:
        if ((r4 instanceof long[]) == false) goto L55;
        if ((r5 instanceof long[]) == false) goto L55;
        if (Arrays.equals((long[]) r4, (long[]) r5) == true) goto L85;
        return false;
    L55:
        if ((r4 instanceof float[]) == false) goto L62;
        if ((r5 instanceof float[]) == false) goto L62;
        if (Arrays.equals((float[]) r4, (float[]) r5) == true) goto L85;
        return false;
    L62:
        if ((r4 instanceof double[]) == false) goto L69;
        if ((r5 instanceof double[]) == false) goto L69;
        if (Arrays.equals((double[]) r4, (double[]) r5) == true) goto L85;
        return false;
    L69:
        if ((r4 instanceof char[]) == false) goto L76;
        if ((r5 instanceof char[]) == false) goto L76;
        if (Arrays.equals((char[]) r4, (char[]) r5) == true) goto L85;
        return false;
    L76:
        if ((r4 instanceof boolean[]) == false) goto L83;
        if ((r5 instanceof boolean[]) == false) goto L83;
        if (Arrays.equals((boolean[]) r4, (boolean[]) r5) == true) goto L85;
        return false;
    L83:
        if (r4.equals(r5) == true) goto L85;
        return false;
    L86:
        return false;
    L85:
        r3 = r3 + 1;
        goto L12
    L87:
        return true;
    L88:
        return false;
    }

    public static void X(int r0, int r1, int r2, byte[] r3, byte[] r4) {
        r3.getClass();
        r4.getClass();
        System.arraycopy(r3, r1, r4, r0, r2 - r1);
    }

    public static void Y(int r0, int r1, int r2, int[] r3, int[] r4) {
        r3.getClass();
        r4.getClass();
        System.arraycopy(r3, r1, r4, r0, r2 - r1);
    }

    public static void Z(int r0, int r1, int r2, Object[] r3, Object[] r4) {
        r3.getClass();
        r4.getClass();
        System.arraycopy(r3, r1, r4, r0, r2 - r1);
    }

    public static void a0(long[] r0, long[] r1, int r2, int r3, int r4) {
        r0.getClass();
        r1.getClass();
        System.arraycopy(r0, r3, r1, r2, r4 - r3);
    }

    public static /* synthetic */ void b0(int r2, int r3, int r4, int[] r5, int[] r6) {
        if ((r4 & 2) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r4 & 8) == 0) goto L8;
        r3 = r5.length;
    L8:
        Y(r2, 0, r3, r5, r6);
    }

    public static /* synthetic */ void c0(int r2, int r3, int r4, Object[] r5, Object[] r6) {
        if ((r4 & 4) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r4 & 8) == 0) goto L8;
        r3 = r5.length;
    L8:
        Z(0, r2, r3, r5, r6);
    }

    public static byte[] d0(byte[] r1, int r2, int r3) {
        r1.getClass();
        ji2.u(r3, r1.length);
        byte[] r4 = Arrays.copyOfRange(r1, r2, r3);
        r4.getClass();
        return r4;
    }

    public static Object[] e0(Object[] r1, int r2, int r3) {
        r1.getClass();
        ji2.u(r3, r1.length);
        Object[] r4 = Arrays.copyOfRange(r1, r2, r3);
        r4.getClass();
        return r4;
    }

    public static void f0(int r0, int r1, Object r2, Object[] r3) {
        r3.getClass();
        Arrays.fill(r3, r0, r1, r2);
    }

    public static void g0(long[] r2, long r3) {
        int r0 = r2.length;
        r2.getClass();
        Arrays.fill(r2, 0, r0, r3);
    }

    public static /* synthetic */ void h0(Object[] r2, f01 r3) {
        f0(0, r2.length, r3, r2);
    }

    public static ArrayList i0(Object[] r4) {
        ArrayList r0 = new ArrayList();
        int r1 = r4.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L8;
        Object r3 = r4[r2];
        if (r3 == null) goto L7;
        r0.add(r3);
    L7:
        r2 = r2 + 1;
        goto L3
    L8:
        return r0;
    }

    public static int j0(long[] r0) {
        r0.getClass();
        return r0.length - 1;
    }

    public static Object k0(int r1, Object[] r2) {
        r2.getClass();
        if (r1 >= 0) goto L5;
        return null;
    L5:
        if (r1 < r2.length) goto L7;
        return null;
    L7:
        return r2[r1];
    }

    public static int l0(int[] r3, int r4) {
        int r0 = r3.length;
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L8;
        if (r4 == r3[r1]) goto L6;
        r1 = r1 + 1;
        goto L3
    L6:
        return r1;
    L8:
        return -1;
    }

    public static int m0(Object[] r3, Object r4) {
        int r0 = 0;
        if (r4 != null) goto L10;
        int r5 = r3.length;
    L5:
        if (r0 >= r5) goto L16;
        if (r3[r0] == null) goto L8;
        r0 = r0 + 1;
        goto L5
    L8:
        return r0;
    L16:
        return -1;
    L10:
        int r1 = r3.length;
    L11:
        if (r0 >= r1) goto L22;
        if (r4.equals(r3[r0]) == true) goto L14;
        r0 = r0 + 1;
        goto L11
    L14:
        return r0;
    L22:
        return -1;
    }

    public static String n0(int r6, Object[] r7) {
        String r1 = "";
        if ((r6 & 2) == 0) goto L5;
        String r0 = "";
    L7:
        if ((r6 & 4) != 0) goto L10;
        r1 = ")";
    L10:
        StringBuilder r8 = new StringBuilder();
        r8.append(r0);
        int r2 = r7.length;
        int r3 = 0;
        int r4 = 0;
    L11:
        if (r3 >= r2) goto L16;
        Object r5 = r7[r3];
        r4 = r4 + 1;
        if (r4 <= 1) goto L15;
        r8.append(", ");
    L15:
        si0.j(r8, r5, null);
        r3 = r3 + 1;
        goto L11
    L16:
        r8.append(r1);
        return r8.toString();
    L5:
        r0 = "innermostOf(";
        goto L7
    }

    public static char o0(char[] r3) {
        int r0 = r3.length;
        if (r0 != 0) goto L5;
        kf2.m("Array is empty.");
        return 0;
    L5:
        if (r0 == 1) goto L7;
        kf2.n("Array has more than one element.");
        return 0;
    L7:
        return r3[0];
    }

    public static List p0(float[] r4) {
        r4.getClass();
        int r0 = r4.length;
        if (r0 == 0) goto L13;
        int r1 = 0;
        if (r0 == 1) goto L11;
        ArrayList r2 = new ArrayList(r4.length);
        int r3 = r4.length;
    L7:
        if (r1 >= r3) goto L9;
        r2.add(Float.valueOf(r4[r1]));
        r1 = r1 + 1;
        goto L7
    L9:
        return r2;
    L11:
        return gb.O(Float.valueOf(r4[0]));
    L13:
        return u01.n;
    }

    public static List q0(long[] r5) {
        r5.getClass();
        int r0 = r5.length;
        if (r0 == 0) goto L13;
        int r1 = 0;
        if (r0 == 1) goto L11;
        ArrayList r2 = new ArrayList(r5.length);
        int r3 = r5.length;
    L7:
        if (r1 >= r3) goto L9;
        r2.add(Long.valueOf(r5[r1]));
        r1 = r1 + 1;
        goto L7
    L9:
        return r2;
    L11:
        return gb.O(Long.valueOf(r5[0]));
    L13:
        return u01.n;
    }

    public static List r0(Object[] r3) {
        int r0 = r3.length;
        if (r0 == 0) goto L11;
        if (r0 == 1) goto L9;
        return new ArrayList(new hi(r3, false));
    L9:
        return gb.O(r3[0]);
    L11:
        return u01.n;
    }

    public static List s0(boolean[] r4) {
        r4.getClass();
        int r0 = r4.length;
        if (r0 == 0) goto L13;
        int r1 = 0;
        if (r0 == 1) goto L11;
        ArrayList r2 = new ArrayList(r4.length);
        int r3 = r4.length;
    L7:
        if (r1 >= r3) goto L9;
        r2.add(Boolean.valueOf(r4[r1]));
        r1 = r1 + 1;
        goto L7
    L9:
        return r2;
    L11:
        return gb.O(Boolean.valueOf(r4[0]));
    L13:
        return u01.n;
    }

    public static Set t0(Object[] r4) {
        r4.getClass();
        int r0 = r4.length;
        if (r0 == 0) goto L13;
        int r1 = 0;
        if (r0 == 1) goto L11;
        LinkedHashSet r2 = new LinkedHashSet(lg2.W(r4.length));
        int r3 = r4.length;
    L7:
        if (r1 >= r3) goto L9;
        r2.add(r4[r1]);
        r1 = r1 + 1;
        goto L7
    L9:
        return r2;
    L11:
        return kb4.S(r4[0]);
    L13:
        return z01.n;
    }
}
