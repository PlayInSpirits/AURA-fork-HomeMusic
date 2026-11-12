package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class h02 implements Iterable, x32 {
    public final int n;
    public final int o;
    public final int p;

    public h02(int i, int i2, int i3) {
        if (i3 == 0) {
            kf2.n("Step must be non-zero.");
            throw null;
        }
        if (i3 == Integer.MIN_VALUE) {
            kf2.n("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.n = i;
        this.o = q05.n(i, i2, i3);
        this.p = i3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h02)) {
            return false;
        }
        if (isEmpty() && ((h02) obj).isEmpty()) {
            return true;
        }
        h02 h02Var = (h02) obj;
        return this.n == h02Var.n && this.o == h02Var.o && this.p == h02Var.p;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.n * 31) + this.o) * 31) + this.p;
    }

    public boolean isEmpty() {
        int i = this.o;
        int i2 = this.p;
        int i3 = this.n;
        if (i2 > 0) {
            return i3 > i;
        }
        return i3 < i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new i02(this.n, this.o, this.p);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.o;
        int i2 = this.p;
        int i3 = this.n;
        if (i2 > 0) {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i2);
        } else {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i2);
        }
        return sb.toString();
    }
}
