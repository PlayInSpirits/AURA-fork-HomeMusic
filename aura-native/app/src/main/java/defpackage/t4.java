package defpackage;

import android.content.Context;
import android.view.View;
import app.homemusic.R;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class t4 extends av2 {
    public final /* synthetic */ int l = 0;
    public final /* synthetic */ y4 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4(y4 y4Var, Context context, en4 en4Var, View view) {
        super(context, en4Var, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.m = y4Var;
        if ((en4Var.A.x & 32) != 32) {
            View view2 = y4Var.w;
            this.e = view2 == null ? (View) y4Var.u : view2;
        }
        zg5 zg5Var = y4Var.K;
        this.h = zg5Var;
        yu2 yu2Var = this.i;
        if (yu2Var != null) {
            yu2Var.i(zg5Var);
        }
    }

    @Override // defpackage.av2
    public final void c() {
        int i = this.l;
        y4 y4Var = this.m;
        switch (i) {
            case 0:
                y4Var.H = null;
                y4Var.L = 0;
                super.c();
                break;
            default:
                qu2 qu2Var = y4Var.p;
                if (qu2Var != null) {
                    qu2Var.c(true);
                }
                y4Var.G = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4(y4 y4Var, Context context, qu2 qu2Var, View view) {
        super(context, qu2Var, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.m = y4Var;
        this.f = 8388613;
        zg5 zg5Var = y4Var.K;
        this.h = zg5Var;
        yu2 yu2Var = this.i;
        if (yu2Var != null) {
            yu2Var.i(zg5Var);
        }
    }
}
