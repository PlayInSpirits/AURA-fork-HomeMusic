package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rz3 extends tz3 {
    public final /* synthetic */ tz3 a;

    public rz3(tz3 r1) {
        this.a = r1;
    }

    @Override // defpackage.tz3
    public final long contentLength() {
        return -1;
    }

    @Override // defpackage.tz3
    public final hu2 contentType() {
        return this.a.contentType();
    }

    @Override // defpackage.tz3
    public final boolean isOneShot() {
        return this.a.isOneShot();
    }

    @Override // defpackage.tz3
    public final void writeTo(ew r2) {
        r2.getClass();
        wu3 r3 = new wu3(new sk1(r2));
        this.a.writeTo(r3);     // Catch: Throwable -> L6
        r3.close();
        return;
    L6:
        th = move-exception;
        throw th;     // Catch: Throwable -> L8
    L8:
        th = move-exception;
        q05.h(r3, th);
        throw th;
    }
}
