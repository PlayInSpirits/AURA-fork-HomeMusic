package defpackage;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class r4 extends vb1 {
    public final /* synthetic */ int w = 0;
    public final /* synthetic */ View x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.x = actionMenuItemView;
    }

    @Override // defpackage.vb1
    public final nd4 b() {
        t4 t4Var;
        int i = this.w;
        View view = this.x;
        switch (i) {
            case 0:
                s4 s4Var = ((ActionMenuItemView) view).z;
                if (s4Var == null || (t4Var = ((u4) s4Var).a.H) == null) {
                    return null;
                }
                return t4Var.a();
            default:
                t4 t4Var2 = ((v4) view).q.G;
                if (t4Var2 == null) {
                    return null;
                }
                return t4Var2.a();
        }
    }

    @Override // defpackage.vb1
    public final boolean c() {
        nd4 nd4VarB;
        int i = this.w;
        View view = this.x;
        switch (i) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) view;
                pu2 pu2Var = actionMenuItemView.x;
                return pu2Var != null && pu2Var.a(actionMenuItemView.u) && (nd4VarB = b()) != null && nd4VarB.b();
            default:
                ((v4) view).q.n();
                return true;
        }
    }

    @Override // defpackage.vb1
    public boolean d() {
        switch (this.w) {
            case 1:
                y4 y4Var = ((v4) this.x).q;
                if (y4Var.I != null) {
                    return false;
                }
                y4Var.f();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(v4 v4Var, v4 v4Var2) {
        super(v4Var2);
        this.x = v4Var;
    }
}
