package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class oo1 extends e22 {
    public final /* synthetic */ int f = 0;
    public int g;
    public int h;
    public int i;
    public final /* synthetic */ kc1 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo1(wk3 wk3Var) {
        super(4);
        this.j = wk3Var;
        this.g = -1;
        this.h = -1;
        this.i = -1;
    }

    private final void j(cx3 cx3Var) {
    }

    @Override // defpackage.e22
    public final void a(RecyclerView recyclerView, cx3 cx3Var) {
        int i;
        int i2 = this.f;
        kc1 kc1Var = this.j;
        switch (i2) {
            case 0:
                super.a(recyclerView, cx3Var);
                po1 po1Var = (po1) kc1Var;
                po1Var.C0.c = po1Var.D0.q;
                this.g = -1;
                this.h = -1;
                this.i = -1;
                break;
            default:
                super.a(recyclerView, cx3Var);
                int i3 = this.g;
                if (i3 != -1 && this.h != -1 && (i = this.i) != -1) {
                    wk3 wk3Var = (wk3) kc1Var;
                    bl2 bl2Var = wk3Var.v0;
                    List list = wk3Var.w0.s;
                    WeakReference weakReference = bo2.a;
                    if (!u52.q("move", i3, i) && bl2Var != null) {
                        bl2Var.f(new vn2(bl2Var, i3, i, list, 2), gq0.n);
                    }
                }
                this.g = -1;
                this.h = -1;
                this.i = -1;
                break;
        }
    }

    @Override // defpackage.e22
    public final boolean h(RecyclerView recyclerView, cx3 cx3Var, cx3 cx3Var2) {
        int i = this.f;
        kc1 kc1Var = this.j;
        switch (i) {
            case 0:
                if (this.g == -1) {
                    this.g = cx3Var.c();
                }
                this.h = cx3Var.c();
                int iC = cx3Var2.c();
                this.i = iC;
                Collections.swap(((po1) kc1Var).D0.q, this.h, iC);
                dw3 adapter = recyclerView.getAdapter();
                Objects.requireNonNull(adapter);
                adapter.n.c(this.h, this.i);
                break;
            default:
                if (this.g == -1) {
                    this.g = cx3Var.c();
                }
                this.h = cx3Var.c();
                int iC2 = cx3Var2.c();
                this.i = iC2;
                Collections.swap(((wk3) kc1Var).w0.s, this.h, iC2);
                dw3 adapter2 = recyclerView.getAdapter();
                adapter2.n.c(this.h, this.i);
                break;
        }
        return false;
    }

    @Override // defpackage.e22
    public final void i(cx3 cx3Var) {
        switch (this.f) {
            case 0:
                break;
            default:
                wk3 wk3Var = (wk3) this.j;
                bl2 bl2Var = wk3Var.v0;
                List list = wk3Var.w0.s;
                int iC = cx3Var.c();
                WeakReference weakReference = bo2.a;
                if (!u52.q("remove", iC, iC + 1) && bl2Var != null) {
                    bl2Var.f(new gk(bl2Var, iC, list, 7), gq0.n);
                }
                cx3Var.s.d();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo1(po1 po1Var) {
        super(0);
        this.j = po1Var;
        this.g = -1;
        this.h = -1;
        this.i = -1;
    }
}
