package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rz3 extends tz3 {
    public final /* synthetic */ tz3 a;

    public rz3(tz3 tz3Var) {
        this.a = tz3Var;
    }

    @Override // defpackage.tz3
    public final long contentLength() {
        return -1L;
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
    public final void writeTo(ew ewVar) {
        ewVar.getClass();
        wu3 wu3Var = new wu3(new sk1(ewVar));
        try {
            this.a.writeTo(wu3Var);
            wu3Var.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                q05.h(wu3Var, th);
                throw th2;
            }
        }
    }
}
