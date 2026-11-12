package defpackage;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jh2 implements View.OnClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ lx2 o;
    public final /* synthetic */ nh2 p;

    public /* synthetic */ jh2(nh2 r1, lx2 r2, int r3) {
        this.n = r3;
        this.p = r1;
        this.o = r2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r4) {
        int r5 = this.n;
        lx2 r1 = this.o;
        nh2 r3 = this.p;
        switch(r5) {
            case 0: goto L8;
            default: goto L4;
        };
    L4:
        int r6 = ((LinearLayoutManager) r3.t0.getLayoutManager()).P0() + 1;
        if (r6 >= r3.t0.getAdapter().a()) goto L12;
        Calendar r2 = a35.c(r1.q.n.n);
        r2.add(2, r6);
        r3.i0(new ix2(r2));
        return;
    L12:
        return;
    L8:
        int r7 = ((LinearLayoutManager) r3.t0.getLayoutManager()).Q0() - 1;
        if (r7 < 0) goto L13;
        Calendar r8 = a35.c(r1.q.n.n);
        r8.add(2, r7);
        r3.i0(new ix2(r8));
        return;
    }
}
