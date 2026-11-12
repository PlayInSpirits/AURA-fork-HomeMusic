package defpackage;

import app.homemusic.R;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class js1 {
    public static final k03 a = null;

    static {
        a = new k03(null);
    }

    public static final void a(MainActivity r2, String r3) {
        r3.getClass();
        a.k(r3);
        qp4 r4 = r2.R;
        if (r4 == null) goto L20;
        BottomNavigationView r5 = (BottomNavigationView) r4.a;
        r23 r0 = r2.T.g();
        if (r0 != null) goto L7;
    L9:
        r5.setSelectedItemId(R.id.hubFragment);
    L10:
        zg5 r6 = r2.V;
        if (r6 == null) goto L21;
        au r7 = (au) r6.n;
        if (r7.a == true) goto L18;
        int r8 = ((BottomSheetBehavior) r7.b).Y;
        if (r8 == 3) goto L18;
        if (r8 == 2) goto L18;
        return;
    L18:
        r2.q();
        return;
    L21:
        return;
    L7:
        if (r0.u != R.id.hubFragment) goto L9;
    }
}
