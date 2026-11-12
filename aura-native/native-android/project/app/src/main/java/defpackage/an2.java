package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class an2 {
    public static final an2 f = new an2(new zm2());
    public static final String g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public final long a;
    public final long b;
    public final long c;
    public final float d;
    public final float e;

    static {
        String str = f35.a;
        g = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        i = Integer.toString(2, 36);
        j = Integer.toString(3, 36);
        k = Integer.toString(4, 36);
    }

    public an2(zm2 zm2Var) {
        long j2 = zm2Var.a;
        long j3 = zm2Var.b;
        long j4 = zm2Var.c;
        float f2 = zm2Var.d;
        float f3 = zm2Var.e;
        this.a = j2;
        this.b = j3;
        this.c = j4;
        this.d = f2;
        this.e = f3;
    }

    public static an2 b(Bundle bundle) {
        zm2 zm2Var = new zm2();
        an2 an2Var = f;
        zm2Var.a = bundle.getLong(g, an2Var.a);
        zm2Var.b = bundle.getLong(h, an2Var.b);
        zm2Var.c = bundle.getLong(i, an2Var.c);
        zm2Var.d = bundle.getFloat(j, an2Var.d);
        zm2Var.e = bundle.getFloat(k, an2Var.e);
        return new an2(zm2Var);
    }

    public final zm2 a() {
        zm2 zm2Var = new zm2();
        zm2Var.a = this.a;
        zm2Var.b = this.b;
        zm2Var.c = this.c;
        zm2Var.d = this.d;
        zm2Var.e = this.e;
        return zm2Var;
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        an2 an2Var = f;
        long j2 = an2Var.a;
        long j3 = this.a;
        if (j3 != j2) {
            bundle.putLong(g, j3);
        }
        long j4 = an2Var.b;
        long j5 = this.b;
        if (j5 != j4) {
            bundle.putLong(h, j5);
        }
        long j6 = an2Var.c;
        long j7 = this.c;
        if (j7 != j6) {
            bundle.putLong(i, j7);
        }
        float f2 = an2Var.d;
        float f3 = this.d;
        if (f3 != f2) {
            bundle.putFloat(j, f3);
        }
        float f4 = an2Var.e;
        float f5 = this.e;
        if (f5 != f4) {
            bundle.putFloat(k, f5);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof an2)) {
            return false;
        }
        an2 an2Var = (an2) obj;
        return this.a == an2Var.a && this.b == an2Var.b && this.c == an2Var.c && this.d == an2Var.d && this.e == an2Var.e;
    }

    public final int hashCode() {
        long j2 = this.a;
        long j3 = this.b;
        int i2 = ((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.c;
        int i3 = (i2 + ((int) ((j4 >>> 32) ^ j4))) * 31;
        float f2 = this.d;
        int iFloatToIntBits = (i3 + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
        float f3 = this.e;
        return iFloatToIntBits + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0);
    }
}
