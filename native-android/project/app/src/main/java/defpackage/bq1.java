package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bq1 implements ej4 {
    public final cc1 n;
    public boolean o;
    public final /* synthetic */ hq1 p;

    public bq1(hq1 r2) {
        this.p = r2;
        this.n = new cc1(((fw) r2.d).timeout());
    }

    public final void b() {
        hq1 r0 = this.p;
        int r1 = r0.a;
        if (r1 != 6) goto L6;
        return;
    L6:
        if (r1 != 5) goto L9;
        cc1 r4 = this.n;
        fu4 r2 = r4.e;
        r4.e = fu4.d;
        r2.a();
        r2.b();
        r0.a = 6;
        return;
    L9:
        zr2.c(r0.a, "state: ");
    }

    @Override // defpackage.ej4
    public long read(tv r3, long r4) {
        hq1 r0 = this.p;
        r3.getClass();
        return ((fw) r0.d).read(r3, r4);
    L5:
        e = move-exception;
        ((q21) r0.c).a();
        b();
        throw e;
    }

    @Override // defpackage.ej4
    public final fu4 timeout() {
        return this.n;
    }
}
