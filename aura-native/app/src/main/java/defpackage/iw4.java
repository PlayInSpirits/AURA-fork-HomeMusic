package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class iw4 {
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public final int a;
    public final sv4 b;
    public final boolean c;
    public final int[] d;
    public final boolean[] e;

    static {
        String str = f35.a;
        f = Integer.toString(0, 36);
        g = Integer.toString(1, 36);
        h = Integer.toString(3, 36);
        i = Integer.toString(4, 36);
    }

    public iw4(sv4 sv4Var, boolean z, int[] iArr, boolean[] zArr) {
        int i2 = sv4Var.a;
        this.a = i2;
        boolean z2 = false;
        rr2.l(i2 == iArr.length && i2 == zArr.length);
        this.b = sv4Var;
        if (z && i2 > 1) {
            z2 = true;
        }
        this.c = z2;
        this.d = (int[]) iArr.clone();
        this.e = (boolean[]) zArr.clone();
    }

    public final tb1 a(int i2) {
        return this.b.d[i2];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && iw4.class == obj.getClass()) {
            iw4 iw4Var = (iw4) obj;
            if (this.c == iw4Var.c && this.b.equals(iw4Var.b) && Arrays.equals(this.d, iw4Var.d) && Arrays.equals(this.e, iw4Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.e) + ((Arrays.hashCode(this.d) + (((this.b.hashCode() * 31) + (this.c ? 1 : 0)) * 31)) * 31);
    }
}
