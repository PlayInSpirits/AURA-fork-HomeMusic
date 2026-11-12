package defpackage;

import android.view.View;
import android.view.ViewGroup;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zd5 {
    public static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Code duplicated, block: B:23:0x005f  */
    /* JADX WARN: Code duplicated, block: B:26:0x007a  */
    /* JADX WARN: Code duplicated, block: B:29:0x008b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0090  */
    public static final wd5 a(b0 b0Var, h80 h80Var, r70 r70Var) {
        ra raVar;
        wd5 wd5Var;
        if (zi1.a.compareAndSet(false, true)) {
            aw awVarA = su3.a(1, 6, null);
            fu.G(te5.a((ne0) bd.z.getValue()), null, null, new r(awVarA, null), 3);
            x xVar = new x(13, awVarA);
            synchronized (jh4.c) {
                jh4.i = q40.F0(xVar, jh4.i);
            }
            jh4.a();
        }
        if (b0Var.getChildCount() > 0) {
            View childAt = b0Var.getChildAt(0);
            raVar = childAt instanceof ra ? (ra) childAt : null;
            if (raVar != null) {
                raVar.setComposeViewContext(h80Var);
            }
            if (raVar == null) {
                raVar = new ra(b0Var.getContext(), h80Var);
                b0Var.addView(raVar.getView(), a);
            }
            raVar.setComposeViewContext(h80Var);
            if (b0Var.getComposeViewContext$ui() != null) {
                h80Var.e();
                raVar.setComposeViewContextIncrementedDuringInit$ui(true);
            }
            Object tag = raVar.getTag(R.id.wrapped_composition_tag);
            wd5Var = tag instanceof wd5 ? (wd5) tag : null;
            if (wd5Var == null) {
                wd5Var = new wd5(raVar, new z80(h80Var.c(), new d15(raVar.getRoot())));
                raVar.setTag(R.id.wrapped_composition_tag, wd5Var);
            }
            wd5Var.c(r70Var);
            raVar.setFrameEndScheduler$ui(new yd5(h80Var.c()));
            return wd5Var;
        }
        b0Var.removeAllViews();
        raVar = null;
        if (raVar == null) {
            raVar = new ra(b0Var.getContext(), h80Var);
            b0Var.addView(raVar.getView(), a);
        }
        raVar.setComposeViewContext(h80Var);
        if (b0Var.getComposeViewContext$ui() != null) {
            h80Var.e();
            raVar.setComposeViewContextIncrementedDuringInit$ui(true);
        }
        Object tag2 = raVar.getTag(R.id.wrapped_composition_tag);
        if (tag2 instanceof wd5) {
        }
        if (wd5Var == null) {
            wd5Var = new wd5(raVar, new z80(h80Var.c(), new d15(raVar.getRoot())));
            raVar.setTag(R.id.wrapped_composition_tag, wd5Var);
        }
        wd5Var.c(r70Var);
        raVar.setFrameEndScheduler$ui(new yd5(h80Var.c()));
        return wd5Var;
    }
}
