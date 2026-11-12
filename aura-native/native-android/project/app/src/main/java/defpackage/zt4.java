package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zt4 {
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public Object a;
    public Object b;
    public int c;
    public long d;
    public long e;
    public boolean f;
    public z5 g = z5.f;

    static {
        String str = f35.a;
        h = Integer.toString(0, 36);
        i = Integer.toString(1, 36);
        j = Integer.toString(2, 36);
        k = Integer.toString(3, 36);
        l = Integer.toString(4, 36);
    }

    public final long a(int i2, int i3) {
        x5 x5VarA = this.g.a(i2);
        if (x5VarA.b != -1) {
            return x5VarA.g[i3];
        }
        return -9223372036854775807L;
    }

    public final int b(long j2) {
        x5 x5VarA;
        int i2;
        z5 z5Var = this.g;
        long j3 = this.d;
        int i3 = z5Var.a;
        if (j2 != Long.MIN_VALUE && (j3 == -9223372036854775807L || j2 < j3)) {
            int i4 = z5Var.d;
            while (i4 < i3 && ((z5Var.a(i4).a != Long.MIN_VALUE && z5Var.a(i4).a <= j2) || ((i2 = (x5VarA = z5Var.a(i4)).b) != -1 && x5VarA.a(-1) >= i2))) {
                i4++;
            }
            if (i4 < i3 && (j3 == -9223372036854775807L || z5Var.a(i4).a <= j3)) {
                return i4;
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    public final int c(long j2) {
        int i2;
        z5 z5Var = this.g;
        long j3 = this.d;
        int i3 = z5Var.a;
        int i4 = i3 - 1;
        if (i4 == i3 - 1) {
            x5 x5VarA = z5Var.a(i4);
            if (x5VarA.l && x5VarA.a == Long.MIN_VALUE && x5VarA.b == -1) {
                i2 = 1;
            } else {
                i2 = 0;
            }
        } else {
            i2 = 0;
        }
        int i5 = i4 - i2;
        while (i5 >= 0 && j2 != Long.MIN_VALUE) {
            x5 x5VarA2 = z5Var.a(i5);
            long j4 = x5VarA2.a;
            if (j4 != Long.MIN_VALUE) {
                if (j2 >= j4) {
                    break;
                }
                i5--;
            } else {
                if (j3 != -9223372036854775807L && ((!x5VarA2.l || j4 != Long.MIN_VALUE || x5VarA2.b != -1) && j2 >= j3)) {
                    break;
                }
                i5--;
            }
        }
        if (i5 >= 0) {
            x5 x5VarA3 = z5Var.a(i5);
            int i6 = x5VarA3.b;
            if (i6 != -1) {
                for (int i7 = 0; i7 < i6; i7++) {
                    int i8 = x5VarA3.f[i7];
                    if (i8 != 0 && i8 != 1) {
                    }
                }
            }
            return i5;
        }
        return -1;
    }

    public final long d(int i2) {
        return this.g.a(i2).a;
    }

    public final int e(int i2, int i3) {
        x5 x5VarA = this.g.a(i2);
        if (x5VarA.b != -1) {
            return x5VarA.f[i3];
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zt4.class.equals(obj.getClass())) {
            zt4 zt4Var = (zt4) obj;
            if (Objects.equals(this.a, zt4Var.a) && Objects.equals(this.b, zt4Var.b) && this.c == zt4Var.c && this.d == zt4Var.d && this.e == zt4Var.e && this.f == zt4Var.f && Objects.equals(this.g, zt4Var.g)) {
                return true;
            }
        }
        return false;
    }

    public final int f(int i2) {
        return this.g.a(i2).a(-1);
    }

    public final boolean g(int i2) {
        z5 z5Var = this.g;
        int i3 = z5Var.a;
        if (i2 != i3 - 1 || i2 != i3 - 1) {
            return false;
        }
        x5 x5VarA = z5Var.a(i2);
        return x5VarA.l && x5VarA.a == Long.MIN_VALUE && x5VarA.b == -1;
    }

    public final boolean h(int i2) {
        return this.g.a(i2).k;
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.b;
        int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.c) * 31;
        long j2 = this.d;
        int i2 = (iHashCode2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.e;
        return this.g.hashCode() + ((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f ? 1 : 0)) * 31);
    }

    public final void i(Object obj, Object obj2, int i2, long j2, long j3, z5 z5Var, boolean z) {
        this.a = obj;
        this.b = obj2;
        this.c = i2;
        this.d = j2;
        this.e = j3;
        this.g = z5Var;
        this.f = z;
    }
}
