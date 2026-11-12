package androidx.mediarouter.app;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import defpackage.cp2;
import defpackage.e5;
import defpackage.rq2;
import defpackage.tp2;
import defpackage.yq2;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class MediaRouteActionProvider extends e5 {
    public rq2 c;
    public final tp2 d;
    public cp2 e;

    public MediaRouteActionProvider(Context context) {
        super(context);
        this.c = rq2.c;
        this.d = tp2.a;
        yq2.d(context);
    }

    @Override // defpackage.e5
    public final View c() {
        if (this.e != null) {
            Log.e("MRActionProvider", "onCreateActionView: this ActionProvider is already associated with a menu item. Don't reuse MediaRouteActionProvider instances! Abandoning the old menu item...");
        }
        cp2 cp2Var = new cp2(this.a);
        this.e = cp2Var;
        cp2Var.setCheatSheetEnabled(true);
        this.e.setRouteSelector(this.c);
        this.e.setDialogFactory(this.d);
        this.e.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        return this.e;
    }

    @Override // defpackage.e5
    public final boolean e() {
        cp2 cp2Var = this.e;
        if (cp2Var != null) {
            return cp2Var.c();
        }
        return false;
    }
}
