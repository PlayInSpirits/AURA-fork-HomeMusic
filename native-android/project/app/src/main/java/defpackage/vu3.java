package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vu3 implements ll4, p81, jg1 {
    public final /* synthetic */ nl4 n;

    public vu3(nl4 r1) {
        this.n = r1;
    }

    @Override // defpackage.p81
    public final Object a(q81 r1, vd0 r2) {
        this.n.a(r1, r2);
        return xe0.n;
    }

    @Override // defpackage.jg1
    public final p81 c(ne0 r2, int r3, wv r4) {
        if (r3 < 0) goto L7;
        if (r3 >= 2) goto L7;
    L9:
        if (r4 != wv.o) goto L12;
        return this;
    L12:
        return g12.o(this, r2, r3, r4);
    L7:
        if (r3 != (-2)) goto L12;
        goto L9
    }

    @Override // defpackage.ll4
    public final Object getValue() {
        return this.n.getValue();
    }
}
