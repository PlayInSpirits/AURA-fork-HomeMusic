package defpackage;

import android.view.View;
import android.view.ViewGroup;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class j85 extends fx4 {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ View b;
    public final /* synthetic */ View c;
    public final /* synthetic */ l85 d;

    public j85(l85 r1, ViewGroup r2, View r3, View r4) {
        this.d = r1;
        this.a = r2;
        this.b = r3;
        this.c = r4;
    }

    @Override // defpackage.fx4, defpackage.bx4
    public final void b() {
        this.a.getOverlay().remove(this.b);
    }

    @Override // defpackage.bx4
    public final void c(dx4 r4) {
        this.c.setTag(R.id.save_overlay_view, null);
        this.a.getOverlay().remove(this.b);
        r4.u(this);
    }

    @Override // defpackage.fx4, defpackage.bx4
    public final void e() {
        View r0 = this.b;
        if (r0.getParent() != null) goto L6;
        this.a.getOverlay().add(r0);
        return;
    L6:
        this.d.cancel();
    }
}
