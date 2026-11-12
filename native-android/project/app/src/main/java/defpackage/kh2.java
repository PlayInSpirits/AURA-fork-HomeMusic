package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kh2 extends LinearLayoutManager {
    public final /* synthetic */ int E;
    public final /* synthetic */ nh2 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kh2(nh2 nh2Var, int i, int i2) {
        super(i);
        this.F = nh2Var;
        this.E = i2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.mw3
    public final void C0(RecyclerView recyclerView, int i) {
        pz pzVar = new pz(recyclerView.getContext());
        pzVar.a = i;
        D0(pzVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void F0(yw3 yw3Var, int[] iArr) {
        nh2 nh2Var = this.F;
        RecyclerView recyclerView = nh2Var.t0;
        if (this.E == 0) {
            iArr[0] = recyclerView.getWidth();
            iArr[1] = nh2Var.t0.getWidth();
        } else {
            iArr[0] = recyclerView.getHeight();
            iArr[1] = nh2Var.t0.getHeight();
        }
    }
}
