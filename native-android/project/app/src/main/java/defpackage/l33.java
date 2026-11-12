package defpackage;

import android.content.Context;
import android.view.SubMenu;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class l33 extends qu2 {
    public final int A;
    public final Class z;

    public l33(Context r1, Class r2, int r3) {
        super(r1);
        this.z = r2;
        this.A = r3;
    }

    @Override // defpackage.qu2
    public final tu2 a(int r4, int r5, int r6, CharSequence r7) {
        int r0 = this.f.size() + 1;
        int r2 = this.A;
        if (r0 > r2) goto L6;
        y();
        tu2 r8 = super.a(r4, r5, r6, r7);
        r8.f(true);
        x();
        return r8;
    L6:
        String r3 = this.z.getSimpleName();
        StringBuilder r9 = new StringBuilder("Maximum number of items supported by ");
        r9.append(r3);
        r9.append(" is ");
        r9.append(r2);
        r9.append(". Limit can be checked with ");
        kf2.n(b11.q(r9, r3, "#getMaxItemCount()"));
        return null;
    }

    @Override // defpackage.qu2, android.view.Menu
    public final SubMenu addSubMenu(int r1, int r2, int r3, CharSequence r4) {
        throw new UnsupportedOperationException(this.z.getSimpleName().concat(" does not support submenus"));
    }
}
