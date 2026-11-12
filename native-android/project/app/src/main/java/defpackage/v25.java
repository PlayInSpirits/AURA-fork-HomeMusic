package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class v25 implements fe {
    public final String a;

    public v25(String r1) {
        this.a = r1;
    }

    public final boolean equals(Object r2) {
        if (this != r2) goto L5;
        return true;
    L5:
        if ((r2 instanceof v25) == false) goto L13;
        String r3 = ((v25) r2).a;
        if (this.a.equals(r3) == true) goto L11;
        return false;
    L11:
        return true;
    L13:
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return xa3.h("UrlAnnotation(url=", this.a, ")");
    }
}
