package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xl4 implements j35 {
    public final Object a;

    public xl4(Object r1) {
        this.a = r1;
    }

    @Override // defpackage.j35
    public final Object a(mf3 r1) {
        return this.a;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof xl4) == true) goto L9;
        return false;
    L9:
        if (h12.c(this.a, ((xl4) r4).a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public final int hashCode() {
        Object r0 = this.a;
        if (r0 != null) goto L7;
        return 0;
    L7:
        return r0.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.a + ")";
    }
}
