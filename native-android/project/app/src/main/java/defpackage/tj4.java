package defpackage;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.ViewGroup;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tj4 extends pz1 {
    public final fe0 p;

    public tj4(df r2) {
        super(24, r2);
        this.p = new fe0(this, r2);
    }

    @Override // defpackage.pz1
    public final void v() {
        df r0 = (df) this.o;
        Resources.Theme r1 = r0.getTheme();
        r1.getClass();
        TypedValue r2 = new TypedValue();
        if (r1.resolveAttribute(R.attr.postSplashScreenTheme, r2, true) == false) goto L7;
        int r3 = r2.resourceId;
        if (r3 == 0) goto L7;
        r0.setTheme(r3);
    L7:
        ((ViewGroup) r0.getWindow().getDecorView()).setOnHierarchyChangeListener(this.p);
    }
}
