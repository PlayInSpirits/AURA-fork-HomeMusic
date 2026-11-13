package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class fw1 {
    public static int k;
    public static final tv1 l = new tv1();
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final b45 f;
    public final long g;
    public final int h;
    public final boolean i;
    public final int j;

    public fw1(String str, float f, float f2, float f3, float f4, b45 b45Var, long j, int i, boolean z) {
        int i2;
        synchronized (l) {
            i2 = k;
            k = i2 + 1;
        }
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = b45Var;
        this.g = j;
        this.h = i;
        this.i = z;
        this.j = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fw1)) {
            return false;
        }
        fw1 fw1Var = (fw1) obj;
        return h12.c(this.a, fw1Var.a) && ku0.b(this.b, fw1Var.b) && ku0.b(this.c, fw1Var.c) && this.d == fw1Var.d && this.e == fw1Var.e && this.f.equals(fw1Var.f) && x40.c(this.g, fw1Var.g) && this.h == fw1Var.h && this.i == fw1Var.i;
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + b11.d(b11.d(b11.d(b11.d(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31)) * 31;
        int i = x40.h;
        return Boolean.hashCode(this.i) + f34.d(this.h, xa3.b(hashCode, 31, this.g), 31);
    }
}
