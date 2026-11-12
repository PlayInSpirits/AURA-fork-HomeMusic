package defpackage;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.ViewGroup;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tj4 extends pz1 {
    public final fe0 p;

    public tj4(df dfVar) {
        super(24, dfVar);
        this.p = new fe0(this, dfVar);
    }

    @Override // defpackage.pz1
    public final void v() {
        int i;
        df dfVar = (df) this.o;
        Resources.Theme theme = dfVar.getTheme();
        theme.getClass();
        TypedValue typedValue = new TypedValue();
        if (theme.resolveAttribute(R.attr.postSplashScreenTheme, typedValue, true) && (i = typedValue.resourceId) != 0) {
            dfVar.setTheme(i);
        }
        ((ViewGroup) dfVar.getWindow().getDecorView()).setOnHierarchyChangeListener(this.p);
    }
}
