package defpackage;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ga5 extends si0 {
    public final /* synthetic */ int g;
    public final /* synthetic */ ia5 h;

    public /* synthetic */ ga5(ia5 r1, int r2) {
        this.g = r2;
        this.h = r1;
    }

    @Override // defpackage.u75
    public final void c() {
        int r0 = this.g;
        ia5 r3 = this.h;
        switch(r0) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        r3.v = null;
        r3.g.requestLayout();
        return;
    L7:
        if (r3.r == false) goto L11;
        View r1 = r3.j;
        if (r1 == null) goto L11;
        r1.setTranslationY(0.0f);
        r3.g.setTranslationY(0.0f);
    L11:
        r3.g.setVisibility(8);
        r3.g.setTransitioning(false);
        r3.v = null;
        rm3 r2 = r3.n;
        if (r2 == null) goto L14;
        r2.H(r3.m);
        r3.m = null;
        r3.n = null;
    L14:
        ActionBarOverlayLayout r4 = r3.f;
        if (r4 == null) goto L18;
        WeakHashMap r5 = j65.a;
        r4.requestApplyInsets();
        return;
    }
}
