package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class dg extends n70 implements gf {
    public bg r;
    public final cg s;

    /* JADX WARN: Type inference failed for: r2v2, types: [cg] */
    public dg(Context context, int i) {
        int i2;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = i;
        }
        super(context, i2);
        this.s = new h42() { // from class: cg
            @Override // defpackage.h42
            public final boolean c(KeyEvent keyEvent) {
                return this.n.g(keyEvent);
            }
        };
        pf pfVarE = e();
        if (i == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i = typedValue2.resourceId;
        }
        ((bg) pfVarE).g0 = i;
        pfVarE.f();
    }

    @Override // defpackage.n70, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d();
        bg bgVar = (bg) e();
        bgVar.B();
        ((ViewGroup) bgVar.N.findViewById(android.R.id.content)).addView(view, layoutParams);
        bgVar.z.a(bgVar.y.getCallback());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        e().g();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return fu.r(this.s, getWindow().getDecorView(), this, keyEvent);
    }

    public final pf e() {
        if (this.r == null) {
            ia4 ia4Var = pf.n;
            this.r = new bg(getContext(), getWindow(), this, this);
        }
        return this.r;
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        bg bgVar = (bg) e();
        bgVar.B();
        return bgVar.y.findViewById(i);
    }

    public final boolean g(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        e().d();
    }

    @Override // defpackage.n70, android.app.Dialog
    public void onCreate(Bundle bundle) {
        e().c();
        super.onCreate(bundle);
        e().f();
    }

    @Override // defpackage.n70, android.app.Dialog
    public final void onStop() {
        super.onStop();
        bg bgVar = (bg) e();
        bgVar.G();
        l93 l93Var = bgVar.A;
        if (l93Var != null) {
            l93Var.j0(false);
        }
    }

    @Override // defpackage.n70, android.app.Dialog
    public void setContentView(int i) {
        d();
        e().k(i);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        e().p(getContext().getString(i));
    }

    @Override // defpackage.n70, android.app.Dialog
    public void setContentView(View view) {
        d();
        e().l(view);
    }

    @Override // defpackage.n70, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d();
        e().n(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        e().p(charSequence);
    }
}
