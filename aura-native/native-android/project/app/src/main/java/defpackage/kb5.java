package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class kb5 extends jb5 {
    public static final pb5 w = pb5.g(WindowInsets.CONSUMED, null);

    public kb5(pb5 pb5Var, WindowInsets windowInsets) {
        super(pb5Var, windowInsets);
    }

    @Override // defpackage.ib5, defpackage.cb5, defpackage.mb5
    public vz1 h(int i) {
        return vz1.c(this.c.getInsets(ob5.a(i)));
    }

    @Override // defpackage.ib5, defpackage.cb5, defpackage.mb5
    public vz1 i(int i) {
        return vz1.c(this.c.getInsetsIgnoringVisibility(ob5.a(i)));
    }

    @Override // defpackage.cb5, defpackage.mb5
    public void o(View view) {
    }

    @Override // defpackage.ib5, defpackage.cb5, defpackage.mb5
    public boolean t(int i) {
        return this.c.isVisible(ob5.a(i));
    }
}
