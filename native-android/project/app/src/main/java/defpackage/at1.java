package defpackage;

import com.eddyizm.tempus.homemusic.a;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class at1 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ qi3 o;

    public /* synthetic */ at1(qi3 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        qi3 r1 = this.o;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        r1.R(1.0f);
        return;
    L6:
        a.g(r1);
        r1.s(false);
        ud3.y0(false);
        a.c();
    }
}
