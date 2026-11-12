package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jv extends ko {
    public cz a;
    public if1 b;

    @Override // defpackage.ko
    public final void a() {
        this.b = null;
        this.a = null;
    }

    @Override // defpackage.ko
    public final void b(Throwable r1) {
        cz r0 = this.a;
        if (r0 == null) goto L6;
        r0.resumeWith(kb4.o(r1));
        return;
    }
}
