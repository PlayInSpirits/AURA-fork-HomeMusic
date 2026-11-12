package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sf extends si0 {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ sf(int r1, Object r2) {
        this.g = r1;
        this.h = r2;
    }

    @Override // defpackage.si0, defpackage.u75
    public void b() {
        int r0 = this.g;
        Object r2 = this.h;
        switch(r0) {
            case 0: goto L9;
            case 1: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        bg r3 = (bg) r2;
        r3.H.setVisibility(0);
        if ((r3.H.getParent() instanceof View) == false) goto L11;
        View r4 = (View) r3.H.getParent();
        WeakHashMap r1 = j65.a;
        r4.requestApplyInsets();
        return;
    L11:
        return;
    L9:
        ((qf) r2).o.H.setVisibility(0);
    }

    @Override // defpackage.u75
    public final void c() {
        int r0 = this.g;
        Object r3 = this.h;
        switch(r0) {
            case 0: goto L14;
            case 1: goto L12;
            default: goto L4;
        };
    L4:
        bg r4 = (bg) ((rm3) r3).o;
        r4.H.setVisibility(8);
        PopupWindow r1 = r4.I;
        if (r1 == null) goto L8;
        r1.dismiss();
    L10:
        r4.H.e();
        r4.K.d(null);
        r4.K = null;
        ViewGroup r5 = r4.N;
        WeakHashMap r2 = j65.a;
        r5.requestApplyInsets();
        return;
    L8:
        if ((r4.H.getParent() instanceof View) == false) goto L10;
        View r6 = (View) r4.H.getParent();
        WeakHashMap r7 = j65.a;
        r6.requestApplyInsets();
        goto L10
    L12:
        bg r8 = (bg) r3;
        r8.H.setAlpha(1.0f);
        r8.K.d(null);
        r8.K = null;
        return;
    L14:
        bg r9 = ((qf) r3).o;
        r9.H.setAlpha(1.0f);
        r9.K.d(null);
        r9.K = null;
    }
}
