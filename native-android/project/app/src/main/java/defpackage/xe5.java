package defpackage;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xe5 {
    public static final byte[] a = null;
    public static final cb3 b = null;
    public static final tl1 c = null;
    public static final we5 d = null;
    public static final fv3 e = null;

    static {
        a = new byte[0];
        yw r1 = yw.q;
        yw[] r2 = {pa.s("efbbbf"), pa.s("feff"), pa.s("fffe"), pa.s("0000ffff"), pa.s("ffff0000")};
        ArrayList r6 = new ArrayList(new hi(r2, false));
        u40.l0(r6);
        int r3 = r6.size();
        ArrayList r9 = new ArrayList(r3);
        int r4 = 0;
    L3:
        if (r4 >= r3) goto L5;
        r9.add(-1);
        r4 = r4 + 1;
        goto L3
    L5:
        int r5 = 0;
        int r7 = 0;
    L7:
        if (r5 >= 5) goto L10;
        r9.set(gb.e(r6, r2[r5]), Integer.valueOf(r7));
        r5 = r5 + 1;
        r7 = r7 + 1;
        goto L7
    L10:
        if (((yw) r6.get(0)).d() <= 0) goto L33;
        int r8 = 0;
    L13:
        if (r8 >= r6.size()) goto L28;
        yw r10 = (yw) r6.get(r8);
        int r11 = r8 + 1;
        int r12 = r11;
    L16:
        if (r12 >= r6.size()) goto L27;
        yw r13 = (yw) r6.get(r12);
        r13.getClass();
        r10.getClass();
        if (r13.m(0, r10, r10.d()) == false) goto L27;
        if (r13.d() == r10.d()) goto L25;
        if (((Number) r9.get(r12)).intValue() > ((Number) r9.get(r8)).intValue()) goto L23;
        r12 = r12 + 1;
        goto L16
    L23:
        r6.remove(r12);
        r9.remove(r12);
        goto L16
    L25:
        nz2.l(r13, "duplicate option: ");
        return;
    L27:
        r8 = r11;
        goto L13
    L28:
        tv r14 = new tv();
        ud3.b(0, r14, 0, r6, 0, r6.size(), r9);
        int r15 = (int) (r14.o / 4);
        int[] r16 = new int[r15];
        int r17 = 0;
    L29:
        if (r17 >= r15) goto L31;
        r16[r17] = r14.readInt();
        r17 = r17 + 1;
        goto L29
    L31:
        b = new cb3((yw[]) Arrays.copyOf(r2, 5), r16);
        c = h12.G(new String[0]);
        sz3 r18 = tz3.Companion;
        byte[] r19 = a;
        d = sz3.c(r18, r19, null, 0, 7);
        n14.Companion.getClass();
        e = m14.b(r19, null);
        return;
    L33:
        kf2.n("the empty byte string is not a supported option");
    }

    public static final void a(long r4, long r6, long r8) {
        if ((r6 | r8) < 0) goto L10;
        if (r6 > r4) goto L10;
        if ((r4 - r6) < r8) goto L10;
        return;
    L10:
        throw new ArrayIndexOutOfBoundsException("length=" + r4 + ", offset=" + r6 + ", count=" + r6);
    }

    public static final void b(Closeable r0) {
        r0.getClass();
        r0.close();     // Catch: Exception -> L7 RuntimeException -> L5
        return;
    L5:
        e = move-exception;
        throw e;
    }

    public static final void c(b71 r3, ge3 r4) {
        r3.getClass();
        Iterator r5 = r3.f(r4).iterator();
        IOException r0 = null;
    L6:
        if (r5.hasNext() == false) goto L17;
        ge3 r1 = (ge3) r5.next();
        if (r3.g(r1).c == false) goto L13;
        c(r3, r1);     // Catch: IOException -> L11
    L13:
        r3.d(r1);     // Catch: IOException -> L11
    L11:
        e = move-exception;
        if (r0 != null) goto L6;
        r0 = e;
        goto L6
    L17:
        if (r0 != null) goto L19;
        return;
    L19:
        throw r0;
    }

    public static final void d(hr0 r0, ge3 r1) {
        r0.getClass();
        r1.getClass();
        r0.c.d(r1);     // Catch: FileNotFoundException -> L5
        return;
    }

    public static final int e(int r1, int r2, String r3, String r4) {
        r3.getClass();
    L3:
        if (r1 >= r2) goto L8;
        if (qm4.n0(r4, r3.charAt(r1)) == true) goto L6;
        r1 = r1 + 1;
        goto L3
    L6:
        return r1;
    L8:
        return r2;
    }

    public static final int f(String r1, char r2, int r3, int r4) {
        r1.getClass();
    L3:
        if (r3 >= r4) goto L8;
        if (r1.charAt(r3) == r2) goto L6;
        r3 = r3 + 1;
        goto L3
    L6:
        return r3;
    L8:
        return r4;
    }

    public static final boolean g(String[] r7, String[] r8, Comparator r9) {
        r7.getClass();
        if (r7.length == 0) goto L27;
        if (r8 == null) goto L27;
        if (r8.length == 0) goto L27;
        int r0 = r7.length;
        int r2 = 0;
    L10:
        if (r2 >= r0) goto L27;
        String r3 = r7[r2];
        int r4 = 0;
    L13:
        if (r4 >= r8.length) goto L15;
        boolean r5 = true;
    L16:
        if (r5 == false) goto L26;
        int r6 = r4 + 1;
        if (r9.compare(r3, r8[r4]) == 0) goto L21;
        r4 = r6;
        goto L13
    L21:
        return true;
    L23:
        e = move-exception;
        kf2.m(e.getMessage());
        return false;
    L26:
        r2 = r2 + 1;
        goto L10
    L15:
        r5 = false;
    L27:
        return false;
    }

    public static final int h(String r4) {
        int r0 = r4.length();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L11;
        char r2 = r4.charAt(r1);
        if (h12.j(r2, 31) <= 0) goto L10;
        if (h12.j(r2, 127) >= 0) goto L10;
        r1 = r1 + 1;
    L10:
        return r1;
    L11:
        return -1;
    }

    public static final int i(String r2, int r3, int r4) {
        r2.getClass();
    L3:
        if (r3 >= r4) goto L20;
        char r0 = r2.charAt(r3);
        if (r0 == '\t') goto L18;
        if (r0 == '\n') goto L18;
        if (r0 == '\f') goto L18;
        if (r0 == '\r') goto L18;
        if (r0 == ' ') goto L18;
        return r3;
    L18:
        r3 = r3 + 1;
        goto L3
    L20:
        return r4;
    }

    public static final int j(String r2, int r3, int r4) {
        r2.getClass();
        int r5 = r4 - 1;
        if (r3 > r5) goto L22;
    L4:
        char r0 = r2.charAt(r5);
        if (r0 != '\t') goto L8;
    L18:
        if (r5 == r3) goto L22;
        r5 = r5 - 1;
        goto L4
    L8:
        if (r0 == '\n') goto L18;
        if (r0 == '\f') goto L18;
        if (r0 == '\r') goto L18;
        if (r0 == ' ') goto L18;
        return r5 + 1;
    L22:
        return r3;
    }

    public static final String[] k(String[] r8, String[] r9, Comparator r10) {
        r8.getClass();
        r9.getClass();
        ArrayList r0 = new ArrayList();
        int r1 = r8.length;
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L12;
        String r4 = r8[r3];
        int r5 = r9.length;
        int r6 = 0;
    L5:
        if (r6 >= r5) goto L10;
        if (r10.compare(r4, r9[r6]) == 0) goto L8;
        r6 = r6 + 1;
        goto L5
    L8:
        r0.add(r4);
    L10:
        r3 = r3 + 1;
        goto L3
    L12:
        return (String[]) r0.toArray(new String[0]);
    }

    public static final boolean l(String r1) {
        r1.getClass();
        if (r1.equalsIgnoreCase("Authorization") == false) goto L5;
        return true;
    L5:
        if (r1.equalsIgnoreCase("Cookie") == false) goto L7;
        return true;
    L7:
        if (r1.equalsIgnoreCase("Proxy-Authorization") == false) goto L9;
        return true;
    L9:
        if (r1.equalsIgnoreCase("Set-Cookie") == true) goto L17;
        return false;
    L17:
        return true;
    }

    public static final int m(char r2) {
        if ('0' > r2) goto L9;
        if (r2 >= ':') goto L9;
        return r2 - '0';
    L9:
        if ('a' > r2) goto L15;
        if (r2 >= 'g') goto L15;
        return r2 - 'W';
    L15:
        if ('A' <= r2) goto L17;
        return -1;
    L17:
        if (r2 < 'G') goto L19;
        return -1;
    L19:
        return r2 - '7';
    }

    public static final int n(fw r2) {
        r2.getClass();
        int r0 = ((r2.readByte() & 255) << 16) | ((r2.readByte() & 255) << 8);
        return (r2.readByte() & 255) | r0;
    }

    public static final int o(int r2, String r3) {
        if (r3 == null) goto L17;
        long r4 = Long.parseLong(r3);     // Catch: NumberFormatException -> L14
        if (r4 <= 2147483647L) goto L9;
        return Integer.MAX_VALUE;
    L9:
        if (r4 >= 0) goto L13;
        return 0;
    L13:
        return (int) r4;
    L18:
        return r2;
    L17:
        return r2;
    }

    public static final String p(String r0, int r1, int r2) {
        r0.getClass();
        int r3 = i(r0, r1, r2);
        return r0.substring(r3, j(r0, r3, r2));
    }
}
