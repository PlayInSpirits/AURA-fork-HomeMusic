package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class vm2 {
    public static final vm2 i = null;
    public static final String j = null;
    public static final String k = null;
    public static final String l = null;
    public static final String m = null;
    public static final String n = null;
    public static final String o = null;
    public static final String p = null;
    public static final String q = null;
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    static {
        i = new vm2(new um2());
        j = Integer.toString(0, 36);
        k = Integer.toString(1, 36);
        l = Integer.toString(2, 36);
        m = Integer.toString(3, 36);
        n = Integer.toString(4, 36);
        o = Integer.toString(5, 36);
        p = Integer.toString(6, 36);
        q = Integer.toString(7, 36);
    }

    public vm2(um2 r3) {
        this.a = f35.i0(r3.a);
        this.c = f35.i0(r3.b);
        this.b = r3.a;
        this.d = r3.b;
        this.e = r3.c;
        this.f = r3.d;
        this.g = r3.e;
        this.h = r3.f;
    }

    public final boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof vm2) == true) goto L8;
        return false;
    L8:
        vm2 r9 = (vm2) r8;
        if (this.b == r9.b) goto L11;
    L21:
        return false;
    L11:
        if (this.d != r9.d) goto L21;
        if (this.e != r9.e) goto L21;
        if (this.f != r9.f) goto L21;
        if (this.g != r9.g) goto L21;
        if (this.h != r9.h) goto L21;
        return true;
    }

    public final int hashCode() {
        long r0 = this.b;
        int r1 = ((int) (r0 ^ (r0 >>> 32))) * 31;
        long r3 = this.d;
        return ((((((((r1 + ((int) ((r3 >>> 32) ^ r3))) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0);
    }
}
