package defpackage;

import com.eddyizm.tempus.viewmodel.b;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mp1 implements a83 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ k03 c;
    public final /* synthetic */ hd d;

    public /* synthetic */ mp1(hd r1, int r2, k03 r3, int r4) {
        this.a = r4;
        this.d = r1;
        this.b = r2;
        this.c = r3;
    }

    @Override // defpackage.a83
    public final void b(Object r4) {
        int r0 = this.a;
        k03 r1 = this.c;
        int r2 = this.b;
        hd r3 = this.d;
        switch(r0) {
            case 0: goto L9;
            default: goto L5;
        };
    L5:
        if (r2 != ((n92) r3).n) goto L12;
        r1.k(r4);
        return;
    L12:
        return;
    L9:
        if (r2 != ((b) r3).F) goto L13;
        r1.k(r4);
        return;
    }
}
