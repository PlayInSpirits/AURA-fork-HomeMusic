package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class vm2 {
    public static final vm2 i = new vm2(new um2());
    public static final String j = Integer.toString(0, 36);
    public static final String k = Integer.toString(1, 36);
    public static final String l = Integer.toString(2, 36);
    public static final String m = Integer.toString(3, 36);
    public static final String n = Integer.toString(4, 36);
    public static final String o = Integer.toString(5, 36);
    public static final String p = Integer.toString(6, 36);
    public static final String q = Integer.toString(7, 36);
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public vm2(um2 um2Var) {
        this.a = f35.i0(um2Var.a);
        this.c = f35.i0(um2Var.b);
        this.b = um2Var.a;
        this.d = um2Var.b;
        this.e = um2Var.c;
        this.f = um2Var.d;
        this.g = um2Var.e;
        this.h = um2Var.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vm2)) {
            return false;
        }
        vm2 vm2Var = (vm2) obj;
        return this.b == vm2Var.b && this.d == vm2Var.d && this.e == vm2Var.e && this.f == vm2Var.f && this.g == vm2Var.g && this.h == vm2Var.h;
    }

    public final int hashCode() {
        long j2 = this.b;
        int i2 = ((int) (j2 ^ (j2 >>> 32))) * 31;
        long j3 = this.d;
        return ((((((((i2 + ((int) ((j3 >>> 32) ^ j3))) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0);
    }
}
