package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class iw4 {
    public static final String f = null;
    public static final String g = null;
    public static final String h = null;
    public static final String i = null;
    public final int a;
    public final sv4 b;
    public final boolean c;
    public final int[] d;
    public final boolean[] e;

    static {
        String r0 = f35.a;
        f = Integer.toString(0, 36);
        g = Integer.toString(1, 36);
        h = Integer.toString(3, 36);
        i = Integer.toString(4, 36);
    }

    public iw4(sv4 r5, boolean r6, int[] r7, boolean[] r8) {
        int r0 = r5.a;
        this.a = r0;
        boolean r2 = false;
        if (r0 == r7.length) goto L5;
    L7:
        boolean r1 = false;
    L8:
        rr2.l(r1);
        this.b = r5;
        if (r6 == false) goto L12;
        if (r0 <= 1) goto L12;
        r2 = true;
    L12:
        this.c = r2;
        this.d = (int[]) r7.clone();
        this.e = (boolean[]) r8.clone();
        return;
    L5:
        if (r0 != r8.length) goto L7;
        r1 = true;
        goto L8
    }

    public final tb1 a(int r1) {
        return this.b.d[r1];
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L19:
        return false;
    L8:
        if (iw4.class != r5.getClass()) goto L19;
        iw4 r6 = (iw4) r5;
        if (this.c != r6.c) goto L19;
        if (this.b.equals(r6.b) == false) goto L19;
        if (Arrays.equals(this.d, r6.d) == false) goto L19;
        if (Arrays.equals(this.e, r6.e) == false) goto L19;
        return true;
    }

    public final int hashCode() {
        int r0 = ((this.b.hashCode() * 31) + (this.c ? 1 : 0)) * 31;
        int r1 = (Arrays.hashCode(this.d) + r0) * 31;
        return Arrays.hashCode(this.e) + r1;
    }
}
