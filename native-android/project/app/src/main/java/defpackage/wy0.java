package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wy0 extends View {
    public final /* synthetic */ mr n;

    public wy0(mr r1, Context r2) {
        this.n = r1;
        super(r2);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration r1) {
        r1.getClass();
        this.n.run();
    }
}
