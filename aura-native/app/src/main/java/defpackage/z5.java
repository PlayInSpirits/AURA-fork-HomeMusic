package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class z5 {
    public static final z5 f = new z5(new x5[0], 0, -9223372036854775807L, 0);
    public static final x5 g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public final int a;
    public final long b;
    public final long c;
    public final int d;
    public final x5[] e;

    static {
        x5 x5Var = new x5(0L, -1, -1, new int[0], new gn2[0], new long[0], 0L, false, new String[0], new y5[0], false);
        int[] iArr = x5Var.f;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = x5Var.g;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        gn2[] gn2VarArr = (gn2[]) Arrays.copyOf(x5Var.e, 0);
        String[] strArr = (String[]) Arrays.copyOf(x5Var.h, 0);
        y5[] y5VarArr = x5Var.i;
        g = new x5(x5Var.a, 0, x5Var.c, copyOf, gn2VarArr, copyOf2, x5Var.j, x5Var.k, strArr, (y5[]) Arrays.copyOf(y5VarArr, Math.max(0, y5VarArr.length)), x5Var.l);
        String str = f35.a;
        h = Integer.toString(1, 36);
        i = Integer.toString(2, 36);
        j = Integer.toString(3, 36);
        k = Integer.toString(4, 36);
    }

    public z5(x5[] x5VarArr, long j2, long j3, int i2) {
        this.b = j2;
        this.c = j3;
        this.a = x5VarArr.length + i2;
        this.e = x5VarArr;
        this.d = i2;
    }

    public final x5 a(int i2) {
        int i3 = this.d;
        return i2 < i3 ? g : this.e[i2 - i3];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z5.class != obj.getClass()) {
            return false;
        }
        z5 z5Var = (z5) obj;
        return this.a == z5Var.a && this.b == z5Var.b && this.c == z5Var.c && this.d == z5Var.d && Arrays.equals(this.e, z5Var.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.e) + (((((((this.a * 961) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + this.d) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=");
        sb.append(this.b);
        sb.append(", adGroups=[");
        int i2 = 0;
        while (true) {
            x5[] x5VarArr = this.e;
            if (i2 >= x5VarArr.length) {
                sb.append("])");
                return sb.toString();
            }
            sb.append("adGroup(timeUs=");
            sb.append(x5VarArr[i2].a);
            sb.append(", ads=[");
            for (int i3 = 0; i3 < x5VarArr[i2].f.length; i3++) {
                sb.append("ad(state=");
                int i4 = x5VarArr[i2].f[i3];
                if (i4 == 0) {
                    sb.append('_');
                } else if (i4 == 1) {
                    sb.append('R');
                } else if (i4 == 2) {
                    sb.append('S');
                } else if (i4 == 3) {
                    sb.append('P');
                } else if (i4 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(x5VarArr[i2].g[i3]);
                sb.append(')');
                if (i3 < x5VarArr[i2].f.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i2 < x5VarArr.length - 1) {
                sb.append(", ");
            }
            i2++;
        }
    }
}
