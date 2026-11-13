package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class pi3 {
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public final Object a;
    public final int b;
    public final gn2 c;
    public final Object d;
    public final int e;
    public final long f;
    public final long g;
    public final int h;
    public final int i;

    static {
        String str = f35.a;
        j = Integer.toString(0, 36);
        k = Integer.toString(1, 36);
        l = Integer.toString(2, 36);
        m = Integer.toString(3, 36);
        n = Integer.toString(4, 36);
        o = Integer.toString(5, 36);
        p = Integer.toString(6, 36);
    }

    public pi3(Object obj, int i, gn2 gn2Var, Object obj2, int i2, long j2, long j3, int i3, int i4) {
        rr2.l(i >= 0);
        rr2.l(i2 >= 0);
        this.a = obj;
        this.b = i;
        this.c = gn2Var;
        this.d = obj2;
        this.e = i2;
        this.f = j2;
        this.g = j3;
        this.h = i3;
        this.i = i4;
    }

    public static pi3 c(Bundle bundle) {
        int max = Math.max(0, bundle.getInt(j, 0));
        Bundle bundle2 = bundle.getBundle(k);
        return new pi3(null, max, bundle2 == null ? null : gn2.b(bundle2), null, Math.max(0, bundle.getInt(l, 0)), bundle.getLong(m, 0L), bundle.getLong(n, 0L), bundle.getInt(o, -1), bundle.getInt(p, -1));
    }

    public final boolean a(pi3 pi3Var) {
        return this.b == pi3Var.b && this.e == pi3Var.e && this.f == pi3Var.f && this.g == pi3Var.g && this.h == pi3Var.h && this.i == pi3Var.i && Objects.equals(this.c, pi3Var.c);
    }

    public final pi3 b(boolean z, boolean z2) {
        if (z && z2) {
            return this;
        }
        return new pi3(this.a, z2 ? this.b : 0, z ? this.c : null, this.d, z2 ? this.e : 0, z ? this.f : 0L, z ? this.g : 0L, z ? this.h : -1, z ? this.i : -1);
    }

    public final Bundle d(int i) {
        Bundle bundle = new Bundle();
        int i2 = this.b;
        if (i < 3 || i2 != 0) {
            bundle.putInt(j, i2);
        }
        gn2 gn2Var = this.c;
        if (gn2Var != null) {
            bundle.putBundle(k, gn2Var.c(false));
        }
        int i3 = this.e;
        if (i < 3 || i3 != 0) {
            bundle.putInt(l, i3);
        }
        long j2 = this.f;
        if (i < 3 || j2 != 0) {
            bundle.putLong(m, j2);
        }
        long j3 = this.g;
        if (i < 3 || j3 != 0) {
            bundle.putLong(n, j3);
        }
        int i4 = this.h;
        if (i4 != -1) {
            bundle.putInt(o, i4);
        }
        int i5 = this.i;
        if (i5 != -1) {
            bundle.putInt(p, i5);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && pi3.class == obj.getClass()) {
            pi3 pi3Var = (pi3) obj;
            if (a(pi3Var) && Objects.equals(this.a, pi3Var.a) && Objects.equals(this.d, pi3Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), this.c, this.d, Integer.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.i));
    }

    public final String toString() {
        String str = "mediaItem=" + this.b + ", period=" + this.e + ", pos=" + this.f;
        int i = this.h;
        if (i == -1) {
            return str;
        }
        StringBuilder s = b11.s(str, ", contentPos=");
        s.append(this.g);
        s.append(", adGroup=");
        s.append(i);
        s.append(", ad=");
        s.append(this.i);
        return s.toString();
    }
}
