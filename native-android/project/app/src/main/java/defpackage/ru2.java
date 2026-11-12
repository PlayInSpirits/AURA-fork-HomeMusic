package defpackage;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ru2 implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, fv2 {
    public en4 n;
    public f9 o;
    public ub2 p;

    @Override // defpackage.fv2
    public final void a(qu2 qu2Var, boolean z) {
        f9 f9Var;
        if ((z || qu2Var == this.n) && (f9Var = this.o) != null) {
            f9Var.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        en4 en4Var = this.n;
        ub2 ub2Var = this.p;
        if (ub2Var.s == null) {
            ub2Var.s = new tb2(ub2Var);
        }
        en4Var.q(ub2Var.s.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.p.a(this.n, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        en4 en4Var = this.n;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.o.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.o.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                en4Var.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return en4Var.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.fv2
    public final boolean w(qu2 qu2Var) {
        return false;
    }
}
