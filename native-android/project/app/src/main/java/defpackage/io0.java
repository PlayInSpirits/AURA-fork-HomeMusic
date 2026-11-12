package defpackage;

import android.view.View;
import com.eddyizm.tempus.App;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class io0 implements View.OnClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ f9 o;

    public /* synthetic */ io0(f9 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r4) {
        switch(this.n) {
            case 0: goto L12;
            case 1: goto L10;
            case 2: goto L8;
            case 3: goto L6;
            default: goto L4;
        };
    L4:
        ud3.A0(true);
        this.o.dismiss();
        return;
    L6:
        App.b().getClass();
        App.c().edit().putBoolean("sync_starred_artists_for_offline_use", true).apply();
        this.o.dismiss();
        return;
    L8:
        ud3.z0(true);
        this.o.dismiss();
        return;
    L10:
        App.b().getClass();
        App.c().edit().putLong("server_unreachable", System.currentTimeMillis()).apply();
        this.o.dismiss();
        return;
    L12:
        this.o.dismiss();
    }
}
