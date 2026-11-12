package defpackage;

import androidx.appcompat.widget.Toolbar;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vu4 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ Toolbar o;

    public /* synthetic */ vu4(Toolbar r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        Toolbar r1 = this.o;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        r1.n();
        return;
    L6:
        yu4 r2 = r1.c0;
        if (r2 != null) goto L9;
        tu2 r3 = null;
    L10:
        if (r3 == null) goto L13;
        r3.collapseActionView();
        return;
    L13:
        return;
    L9:
        r3 = r2.o;
        goto L10
    }
}
