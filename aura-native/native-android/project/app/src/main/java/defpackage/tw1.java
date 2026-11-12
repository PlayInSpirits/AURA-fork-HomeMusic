package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tw1 implements Serializable {
    public static final tw1 p = new tw1(new int[0]);
    public final int[] n;
    public final int o;

    public tw1(int[] iArr) {
        int length = iArr.length;
        this.n = iArr;
        this.o = length;
    }

    public final int a(int i) {
        rr2.q(i, this.o);
        return this.n[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tw1) {
            tw1 tw1Var = (tw1) obj;
            int i = tw1Var.o;
            int i2 = this.o;
            if (i2 == i) {
                for (int i3 = 0; i3 < i2; i3++) {
                    if (a(i3) == tw1Var.a(i3)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.o; i2++) {
            i = (i * 31) + this.n[i2];
        }
        return i;
    }

    public final String toString() {
        int i = this.o;
        if (i == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i * 5);
        sb.append('[');
        int[] iArr = this.n;
        sb.append(iArr[0]);
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(", ");
            sb.append(iArr[i2]);
        }
        sb.append(']');
        return sb.toString();
    }
}
