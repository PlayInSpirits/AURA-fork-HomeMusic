package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class om4 implements fe {
    public final String a;

    public /* synthetic */ om4(String r1) {
        this.a = r1;
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof om4) == false) goto L11;
        String r3 = ((om4) r2).a;
        if (this.a.equals(r3) == true) goto L9;
        return false;
    L9:
        return true;
    L11:
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return xa3.h("StringAnnotation(value=", this.a, ")");
    }
}
