package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kh2 extends LinearLayoutManager {
    public final /* synthetic */ int E;
    public final /* synthetic */ nh2 F;

    public kh2(nh2 r1, int r2, int r3) {
        this.F = r1;
        this.E = r3;
        super(r2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.mw3
    public final void C0(RecyclerView r2, int r3) {
        pz r0 = new pz(r2.getContext());
        r0.a = r3;
        D0(r0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void F0(yw3 r4, int[] r5) {
        nh2 r6 = this.F;
        RecyclerView r0 = r6.t0;
        if (this.E != 0) goto L6;
        r5[0] = r0.getWidth();
        r5[1] = r6.t0.getWidth();
        return;
    L6:
        r5[0] = r0.getHeight();
        r5[1] = r6.t0.getHeight();
    }
}
