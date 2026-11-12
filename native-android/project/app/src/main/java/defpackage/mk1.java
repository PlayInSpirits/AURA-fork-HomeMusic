package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mk1 extends ja4 {
    public bz4 a;

    @Override // defpackage.bz4
    public final Object a(l32 r1) {
        bz4 r0 = this.a;
        if (r0 != null) goto L5;
        kf2.o("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        return null;
    L5:
        return r0.a(r1);
    }

    @Override // defpackage.bz4
    public final void b(q32 r1, Object r2) {
        bz4 r0 = this.a;
        if (r0 == null) goto L6;
        r0.b(r1, r2);
        return;
    L6:
        kf2.o("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override // defpackage.ja4
    public final bz4 c() {
        bz4 r0 = this.a;
        if (r0 == null) goto L5;
        return r0;
    L5:
        kf2.o("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        return null;
    }
}
