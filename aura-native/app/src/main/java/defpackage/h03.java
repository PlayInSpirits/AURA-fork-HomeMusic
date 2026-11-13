package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class h03 {
    public int[] a;
    public int b;

    public h03(int i) {
        this.a = i == 0 ? m02.a : new int[i];
    }

    public final void a(int i) {
        int i2 = this.b + 1;
        int[] iArr = this.a;
        if (iArr.length < i2) {
            this.a = Arrays.copyOf(iArr, Math.max(i2, (iArr.length * 3) / 2));
        }
        int[] iArr2 = this.a;
        int i3 = this.b;
        iArr2[i3] = i;
        this.b = i3 + 1;
    }

    public final int b(int i) {
        if (i >= 0 && i < this.b) {
            return this.a[i];
        }
        kf2.h("Index must be between 0 and size");
        return 0;
    }

    public final void c(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.b)) {
            kf2.h("Index must be between 0 and size");
            return;
        }
        int[] iArr = this.a;
        int i3 = iArr[i];
        if (i != i2 - 1) {
            ti.Y(i, i + 1, i2, iArr, iArr);
        }
        this.b--;
    }

    public final void d(int i, int i2) {
        if (i < 0 || i >= this.b) {
            kf2.h("Index must be between 0 and size");
            return;
        }
        int[] iArr = this.a;
        int i3 = iArr[i];
        iArr[i] = i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h03) {
            h03 h03Var = (h03) obj;
            int i = h03Var.b;
            int i2 = this.b;
            if (i == i2) {
                int[] iArr = this.a;
                int[] iArr2 = h03Var.a;
                j02 g0 = gb.g0(0, i2);
                int i3 = g0.n;
                int i4 = g0.o;
                if (i3 > i4) {
                    return true;
                }
                while (iArr[i3] == iArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.a;
        int i = this.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += Integer.hashCode(iArr[i3]) * 31;
        }
        return i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            int i3 = iArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(i3);
            i2++;
        }
        return sb.toString();
    }

    public /* synthetic */ h03() {
        this(16);
    }
}
