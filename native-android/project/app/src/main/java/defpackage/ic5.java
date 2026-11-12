package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ic5 {
    public static final w03 a;

    static {
        long[] jArr = v54.a;
        a = new w03();
    }

    public static final u80 a(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof u80) {
            return (u80) tag;
        }
        return null;
    }

    public static final tv3 b(View view) {
        ne0 ne0Var;
        ed edVar;
        if (!view.isAttachedToWindow()) {
            cz1.b("Cannot locate windowRecomposer; View " + view + " is not attached to a window");
        }
        Object objZ = au0.z(view);
        while (objZ instanceof View) {
            View view2 = (View) objZ;
            if (view2.getId() == 16908290) {
                break;
            }
            objZ = view2.getParent();
            view = view2;
        }
        u80 u80VarA = a(view);
        vd0 vd0Var = null;
        if (u80VarA != null) {
            if (u80VarA instanceof tv3) {
                return (tv3) u80VarA;
            }
            kf2.o("root viewTreeParentCompositionContext is not a Recomposer");
            return null;
        }
        ((ec5) fc5.a.get()).getClass();
        ne0 ne0Var2 = q01.n;
        rp4 rp4Var = bd.z;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            ne0Var = (ne0) bd.z.getValue();
        } else {
            ne0Var = (ne0) bd.A.get();
            if (ne0Var == null) {
                kf2.o("no AndroidUiDispatcher for this thread");
                return null;
            }
        }
        ne0 ne0VarJ = ne0Var.J(ne0Var2);
        ed edVar2 = (ed) ne0VarJ.K(rv2.p);
        if (edVar2 != null) {
            edVar = new ed(edVar2);
            ll llVar = (ll) edVar.p;
            synchronized (llVar.p) {
                llVar.o = false;
            }
        } else {
            edVar = null;
        }
        jx3 jx3Var = new jx3();
        ne0 rx2Var = (qx2) ne0VarJ.K(rv2.q);
        if (rx2Var == null) {
            rx2Var = new rx2(view.getContext().getApplicationContext());
            jx3Var.n = rx2Var;
        }
        if (edVar != null) {
            ne0Var2 = edVar;
        }
        ne0 ne0VarJ2 = ne0VarJ.J(ne0Var2).J(rx2Var);
        tv3 tv3Var = new tv3(ne0VarJ2);
        synchronized (tv3Var.c) {
            tv3Var.t = true;
        }
        td0 td0VarA = te5.a(ne0VarJ2);
        ba2 ba2VarU = j51.u(view);
        ea2 ea2VarH = ba2VarU != null ? ba2VarU.h() : null;
        if (ea2VarH == null) {
            cz1.c("ViewTreeLifecycleOwner not found from " + view);
            er1.a();
            return null;
        }
        view.addOnAttachStateChangeListener(new vc1(2, view, tv3Var));
        ea2VarH.a(new ed1(td0VarA, edVar, tv3Var, jx3Var));
        view.setTag(R.id.androidx_compose_ui_view_composition_context, tv3Var);
        xi1 xi1Var = xi1.n;
        Handler handler = view.getHandler();
        int i = gl1.a;
        view.addOnAttachStateChangeListener(new bc(8, fu.G(xi1Var, new fl1(handler, "windowRecomposer cleanup", false).s, null, new p(tv3Var, view, vd0Var, 19), 2)));
        return tv3Var;
    }
}
