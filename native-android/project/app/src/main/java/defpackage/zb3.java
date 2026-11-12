package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zb3 implements h30 {
    public final Class n;

    public zb3(Class r1) {
        r1.getClass();
        this.n = r1;
    }

    @Override // defpackage.h30
    public final Class a() {
        throw null;
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof zb3) == false) goto L8;
        Class r3 = ((zb3) r2).n;
        if (h12.c(this.n, r3) == false) goto L10;
        return true;
    L10:
        return false;
    L8:
        return false;
    }

    public final int hashCode() {
        return this.n.hashCode();
    }

    public final String toString() {
        return this.n.toString() + " (Kotlin reflection is not available)";
    }
}
