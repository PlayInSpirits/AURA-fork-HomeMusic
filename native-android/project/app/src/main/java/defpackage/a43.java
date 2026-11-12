package defpackage;

import android.view.SubMenu;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class a43 extends qu2 {
    @Override // defpackage.qu2, android.view.Menu
    public final SubMenu addSubMenu(int r1, int r2, int r3, CharSequence r4) {
        tu2 r5 = a(r1, r2, r3, r4);
        m43 r6 = new m43(this.a, this, r5);
        r5.o = r6;
        r6.setHeaderTitle(r5.e);
        return r6;
    }
}
