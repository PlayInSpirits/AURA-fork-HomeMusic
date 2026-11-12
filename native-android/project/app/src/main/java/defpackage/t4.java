package defpackage;

import android.content.Context;
import android.view.View;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class t4 extends av2 {
    public final /* synthetic */ int l;
    public final /* synthetic */ y4 m;

    public t4(y4 r9, Context r10, en4 r11, View r12) {
        this.l = 0;
        this.m = r9;
        super(r10, r11, r12, false, R.attr.actionOverflowMenuStyle, 0);
        if ((r11.A.x & 32) == 32) goto L9;
        View r8 = r9.w;
        if (r8 != null) goto L8;
        r8 = (View) r9.u;
    L8:
        this.e = r8;
    L9:
        zg5 r13 = r9.K;
        this.h = r13;
        yu2 r14 = this.i;
        if (r14 == null) goto L13;
        r14.i(r13);
        return;
    }

    @Override // defpackage.av2
    public final void c() {
        int r0 = this.l;
        y4 r2 = this.m;
        switch(r0) {
            case 0: goto L9;
            default: goto L4;
        };
    L4:
        qu2 r1 = r2.p;
        if (r1 == null) goto L7;
        r1.c(true);
    L7:
        r2.G = null;
        super.c();
        return;
    L9:
        r2.H = null;
        r2.L = 0;
        super.c();
    }

    public t4(y4 r9, Context r10, qu2 r11, View r12) {
        this.l = 1;
        this.m = r9;
        super(r10, r11, r12, true, R.attr.actionOverflowMenuStyle, 0);
        this.f = 8388613;
        zg5 r8 = r9.K;
        this.h = r8;
        yu2 r13 = this.i;
        if (r13 == null) goto L6;
        r13.i(r8);
        return;
    }
}
