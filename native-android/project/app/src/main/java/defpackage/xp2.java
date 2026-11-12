package defpackage;

import android.content.Context;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xp2 implements View.OnClickListener {
    public final /* synthetic */ int n;
    public final Object o;
    public final /* synthetic */ Object p;

    public xp2(gv4 r4) {
        this.n = 1;
        this.p = r4;
        Context r1 = r4.a.getContext();
        CharSequence r5 = r4.h;
        q4 r0 = new q4();
        r0.e = 4096;
        r0.g = 4096;
        r0.l = null;
        r0.m = null;
        r0.n = false;
        r0.o = false;
        r0.p = 16;
        r0.i = r1;
        r0.a = r5;
        this.o = r0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r3) {
        int r4 = this.n;
        Object r0 = this.o;
        Object r2 = this.p;
        switch(r4) {
            case 0: goto L10;
            default: goto L4;
        };
    L4:
        gv4 r5 = (gv4) r2;
        Window.Callback r6 = r5.k;
        if (r6 != null) goto L7;
        return;
    L7:
        if (r5.l == false) goto L13;
        r6.onMenuItemSelected(0, (q4) r0);
        return;
    L13:
        return;
    L10:
        yp2 r7 = (yp2) r2;
        wq2 r1 = (wq2) r0;
        r7.y.w.B = r1;
        r1.k(true);
        r7.v.setVisibility(4);
        r7.w.setVisibility(0);
    }

    public xp2(yp2 r2, wq2 r3) {
        this.n = 0;
        this.p = r2;
        this.o = r3;
    }
}
