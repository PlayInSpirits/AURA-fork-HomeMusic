package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class i71 implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ View n;
    public final /* synthetic */ j71 o;

    public i71(j71 j71Var, View view) {
        this.o = j71Var;
        this.n = view;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        e35.C().post(new lg1(this, this, false, 13));
    }
}
