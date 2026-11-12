package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xj5 extends ak5 {
    public final long n;

    public xj5(long j) {
        this.n = j;
    }

    @Override // defpackage.ak5
    public final int a() {
        return ak5.d(this.n >= 0 ? (byte) 0 : (byte) 32);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        ak5 ak5Var = (ak5) obj;
        if (a() != ak5Var.a()) {
            return a() - ak5Var.a();
        }
        long jAbs = Math.abs(this.n);
        long jAbs2 = Math.abs(((xj5) ak5Var).n);
        if (jAbs < jAbs2) {
            return -1;
        }
        return jAbs > jAbs2 ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && xj5.class == obj.getClass() && this.n == ((xj5) obj).n;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(a()), Long.valueOf(this.n)});
    }

    public final String toString() {
        return Long.toString(this.n);
    }
}
