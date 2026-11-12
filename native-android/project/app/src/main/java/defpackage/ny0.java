package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ny0 implements j35 {
    public final zd3 a;

    public ny0(zd3 r1) {
        this.a = r1;
    }

    @Override // defpackage.j35
    public final Object a(mf3 r1) {
        return this.a.getValue();
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof ny0) == true) goto L9;
        return false;
    L9:
        if (this.a == ((ny0) r4).a) goto L11;
        return false;
    L11:
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.a + ")";
    }
}
