package defpackage;

import android.view.View;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class lq4 implements View.OnLayoutChangeListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ mq4 b;

    public lq4(mq4 mq4Var, View view) {
        this.b = mq4Var;
        this.a = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        View view2 = this.a;
        if (view2.getVisibility() == 0) {
            this.b.c(view2);
        }
    }
}
