package defpackage;

import androidx.appcompat.widget.SearchView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class q74 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ SearchView o;

    public /* synthetic */ q74(SearchView r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        SearchView r1 = this.o;
        switch(r0) {
            case 0: goto L8;
            default: goto L4;
        };
    L4:
        pg0 r2 = r1.f0;
        if ((r2 instanceof co4) == false) goto L10;
        r2.b(null);
        return;
    L10:
        return;
    L8:
        r1.s();
    }
}
