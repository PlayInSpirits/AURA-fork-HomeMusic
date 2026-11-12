package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bq2 implements View.OnClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ lq2 o;

    public /* synthetic */ bq2(lq2 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r1) {
        int r2 = this.n;
        lq2 r0 = this.o;
        switch(r2) {
            case 0: goto L9;
            default: goto L5;
        };
    L9:
        r0.dismiss();
        return;
    L5:
        if (r0.w.g() == false) goto L7;
        r0.t.getClass();
        yq2.f(2);
    L7:
        r0.dismiss();
    }
}
