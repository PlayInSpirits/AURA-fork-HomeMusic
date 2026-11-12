package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cd0 {
    public final av a;
    public final cz b;

    public cd0(av r1, cz r2) {
        this.a = r1;
        this.b = r2;
    }

    public final String toString() {
        cz r0 = this.b;
        se0 r1 = (se0) r0.r.K(se0.p);
        if (r1 == null) goto L5;
        String r2 = r1.o;
    L6:
        int r3 = hashCode();
        ya4.g(16);
        String r4 = Integer.toString(r3, 16);
        r4.getClass();
        if (r2 == null) goto L9;
        String r5 = xa3.h("[", r2, "](");
    L11:
        return "Request@" + r4 + r5 + "currentBounds()=" + this.a.invoke() + ", continuation=" + r0 + ")";
    L9:
        r5 = "(";
        goto L11
    L5:
        r2 = null;
        goto L6
    }
}
