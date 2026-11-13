package defpackage;

import android.view.Window;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class rb5 extends qb5 {
    public rb5(android.view.Window a0, defpackage.om1 a1) {
        super(a0, a1);
    }

    @Override // defpackage.su3
    public final void C(boolean z) {
        if (!z) {
            K(16);
            return;
        }
        Window window = this.g;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        J(16);
    }
}
