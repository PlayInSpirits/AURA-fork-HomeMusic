package defpackage;

import android.view.View;
import android.view.ViewGroup;
import app.homemusic.R;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class j85 extends fx4 {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ View b;
    public final /* synthetic */ View c;
    public final /* synthetic */ l85 d;

    public j85(l85 l85Var, ViewGroup viewGroup, View view, View view2) {
        this.d = l85Var;
        this.a = viewGroup;
        this.b = view;
        this.c = view2;
    }

    @Override // defpackage.fx4, defpackage.bx4
    public final void b() {
        this.a.getOverlay().remove(this.b);
    }

    @Override // defpackage.bx4
    public final void c(dx4 dx4Var) {
        this.c.setTag(R.id.save_overlay_view, null);
        this.a.getOverlay().remove(this.b);
        dx4Var.u(this);
    }

    @Override // defpackage.fx4, defpackage.bx4
    public final void e() {
        View view = this.b;
        if (view.getParent() == null) {
            this.a.getOverlay().add(view);
        } else {
            this.d.cancel();
        }
    }
}
