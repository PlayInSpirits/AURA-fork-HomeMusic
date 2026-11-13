package defpackage;

import android.view.SubMenu;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class a43 extends qu2 {
    public a43(android.content.Context a0) {
        super(a0);
    }

    @Override // defpackage.qu2, android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        tu2 a = a(i, i2, i3, charSequence);
        m43 m43Var = new m43(this.a, this, a);
        a.o = m43Var;
        m43Var.setHeaderTitle(a.e);
        return m43Var;
    }
}
