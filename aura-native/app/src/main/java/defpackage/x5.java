package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class x5 {
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public static final String q;
    public static final String r;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static final String x;
    public final long a;
    public final int b;
    public final int c;
    public final Uri[] d;
    public final gn2[] e;
    public final int[] f;
    public final long[] g;
    public final String[] h;
    public final y5[] i;
    public final long j;
    public final boolean k;
    public final boolean l;

    static {
        String str = f35.a;
        m = Integer.toString(0, 36);
        n = Integer.toString(1, 36);
        o = Integer.toString(2, 36);
        p = Integer.toString(3, 36);
        q = Integer.toString(4, 36);
        r = Integer.toString(5, 36);
        s = Integer.toString(6, 36);
        t = Integer.toString(7, 36);
        u = Integer.toString(8, 36);
        v = Integer.toString(9, 36);
        w = Integer.toString(10, 36);
        x = Integer.toString(11, 36);
    }

    public x5(long j, int i, int i2, int[] iArr, gn2[] gn2VarArr, long[] jArr, long j2, boolean z, String[] strArr, y5[] y5VarArr, boolean z2) {
        Uri uri;
        int i3 = 0;
        rr2.l(iArr.length == gn2VarArr.length);
        rr2.l(iArr.length == y5VarArr.length);
        this.a = j;
        this.b = i;
        this.c = i2;
        this.f = iArr;
        this.e = gn2VarArr;
        this.g = jArr;
        this.j = j2;
        this.k = z;
        this.d = new Uri[gn2VarArr.length];
        while (true) {
            Uri[] uriArr = this.d;
            if (i3 >= uriArr.length) {
                this.h = strArr;
                this.i = y5VarArr;
                this.l = z2;
                return;
            }
            gn2 gn2Var = gn2VarArr[i3];
            if (gn2Var == null) {
                uri = null;
            } else {
                bn2 bn2Var = gn2Var.b;
                bn2Var.getClass();
                uri = bn2Var.a;
            }
            uriArr[i3] = uri;
            i3++;
        }
    }

    public final int a(int i) {
        int i2;
        int i3 = i + 1;
        while (true) {
            int[] iArr = this.f;
            if (i3 >= iArr.length || this.k || (i2 = iArr[i3]) == 0 || i2 == 1) {
                break;
            }
            i3++;
        }
        return i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x5.class == obj.getClass()) {
            x5 x5Var = (x5) obj;
            if (this.a == x5Var.a && this.b == x5Var.b && this.c == x5Var.c && Arrays.equals(this.e, x5Var.e) && Arrays.equals(this.f, x5Var.f) && Arrays.equals(this.g, x5Var.g) && this.j == x5Var.j && this.k == x5Var.k && Arrays.equals(this.h, x5Var.h) && Arrays.equals(this.i, x5Var.i) && this.l == x5Var.l) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((this.b * 31) + this.c) * 31;
        long j = this.a;
        int hashCode = (Arrays.hashCode(this.g) + ((Arrays.hashCode(this.f) + ((Arrays.hashCode(this.e) + ((i + ((int) (j ^ (j >>> 32)))) * 31)) * 31)) * 31)) * 31;
        long j2 = this.j;
        return ((Arrays.hashCode(this.i) + ((((((hashCode + ((int) ((j2 >>> 32) ^ j2))) * 31) + (this.k ? 1 : 0)) * 31) + Arrays.hashCode(this.h)) * 31)) * 31) + (this.l ? 1 : 0);
    }
}
