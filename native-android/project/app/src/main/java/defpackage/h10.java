package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class h10 extends i10 {
    public final Throwable a;

    public h10(Throwable r1) {
        this.a = r1;
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof h10) == false) goto L8;
        Throwable r3 = ((h10) r2).a;
        if (h12.c(this.a, r3) == false) goto L10;
        return true;
    L10:
        return false;
    L8:
        return false;
    }

    public final int hashCode() {
        Throwable r0 = this.a;
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.hashCode();
    }

    @Override // defpackage.i10
    public final String toString() {
        return "Closed(" + this.a + ')';
    }
}
