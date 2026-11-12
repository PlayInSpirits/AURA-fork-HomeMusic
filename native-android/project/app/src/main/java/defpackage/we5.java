package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class we5 extends tz3 {
    public final /* synthetic */ hu2 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ int d;

    public we5(hu2 r1, byte[] r2, int r3, int r4) {
        this.a = r1;
        this.b = r3;
        this.c = r2;
        this.d = r4;
    }

    @Override // defpackage.tz3
    public final long contentLength() {
        return this.b;
    }

    @Override // defpackage.tz3
    public final hu2 contentType() {
        return this.a;
    }

    @Override // defpackage.tz3
    public final void writeTo(ew r3) {
        r3.getClass();
        int r0 = this.d;
        int r1 = this.b;
        r3.write(this.c, r0, r1);
    }
}
