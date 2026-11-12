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
    public final void a(qu2 r1, boolean r2) {
        if (r2 == false) goto L4;
    L5:
        f9 r0 = this.o;
        if (r0 == null) goto L10;
        r0.dismiss();
        return;
    L10:
        return;
    L4:
        if (r1 == this.n) goto L5;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface r2, int r3) {
        en4 r4 = this.n;
        ub2 r1 = this.p;
        if (r1.s != null) goto L5;
        r1.s = new tb2(r1);
    L5:
        r4.q(r1.s.b(r3), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface r2) {
        this.p.a(this.n, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface r4, int r5, KeyEvent r6) {
        en4 r0 = this.n;
        if (r5 == 82) goto L7;
        if (r5 == 4) goto L7;
    L33:
        return r0.performShortcut(r5, r6, 0);
    L7:
        if (r6.getAction() != 0) goto L19;
        if (r6.getRepeatCount() != 0) goto L19;
        Window r7 = this.o.getWindow();
        if (r7 == null) goto L33;
        View r8 = r7.getDecorView();
        if (r8 == null) goto L33;
        KeyEvent.DispatcherState r9 = r8.getKeyDispatcherState();
        if (r9 == null) goto L33;
        r9.startTracking(r6, this);
        return true;
    L19:
        if (r6.getAction() != 1) goto L33;
        if (r6.isCanceled() == true) goto L33;
        Window r3 = this.o.getWindow();
        if (r3 == null) goto L33;
        View r10 = r3.getDecorView();
        if (r10 == null) goto L33;
        KeyEvent.DispatcherState r11 = r10.getKeyDispatcherState();
        if (r11 == null) goto L33;
        if (r11.isTracking(r6) == false) goto L33;
        r0.c(true);
        r4.dismiss();
        return true;
    }

    @Override // defpackage.fv2
    public final boolean w(qu2 r1) {
        return false;
    }
}
