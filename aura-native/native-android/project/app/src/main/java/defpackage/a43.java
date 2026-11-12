package defpackage;

import android.view.SubMenu;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class a43 extends qu2 {
    @Override // defpackage.qu2, android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        tu2 tu2VarA = a(i, i2, i3, charSequence);
        m43 m43Var = new m43(this.a, this, tu2VarA);
        tu2VarA.o = m43Var;
        m43Var.setHeaderTitle(tu2VarA.e);
        return m43Var;
    }
}
