package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class k93 {
    public final String a;

    public k93(String r1) {
        this.a = r1;
    }

    public final boolean equals(Object r2) {
        if (this != r2) goto L5;
        return true;
    L5:
        if ((r2 instanceof k93) == true) goto L8;
        return false;
    L8:
        if (this.a.equals(((k93) r2).a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return xa3.h("OpaqueKey(key=", this.a, ")");
    }
}
