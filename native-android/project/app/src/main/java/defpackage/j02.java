package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class j02 extends h02 {
    public static final j02 q = new j02(1, 0, 1);

    @Override // defpackage.h02
    public final boolean equals(Object obj) {
        if (!(obj instanceof j02)) {
            return false;
        }
        if (isEmpty() && ((j02) obj).isEmpty()) {
            return true;
        }
        j02 j02Var = (j02) obj;
        return this.n == j02Var.n && this.o == j02Var.o;
    }

    @Override // defpackage.h02
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.n * 31) + this.o;
    }

    @Override // defpackage.h02
    public final boolean isEmpty() {
        return this.n > this.o;
    }

    @Override // defpackage.h02
    public final String toString() {
        return this.n + ".." + this.o;
    }
}
