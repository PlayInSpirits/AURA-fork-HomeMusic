package defpackage;

import android.widget.ImageButton;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.homemusic.a;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ri3 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ xi3 o;

    public /* synthetic */ ri3(xi3 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        xi3 r4 = this.o;
        switch(r0) {
            case 0: goto L13;
            default: goto L4;
        };
    L4:
        ns3 r5 = r4.o0;
        if (r5 == null) goto L15;
        ((ImageButton) ((ae1) r5.q).e).setVisibility(8);
        return;
    L15:
        return;
    L13:
        bj2 r1 = (bj2) r4.q0.get();     // Catch: Exception -> L10
        App.b().getClass();     // Catch: Exception -> L10
        r1.s(App.c().getBoolean("shuffle_mode", false));     // Catch: Exception -> L10
        App.b().getClass();     // Catch: Exception -> L10
        r1.p0(App.c().getInt("repeat_mode", 0));     // Catch: Exception -> L10
        r4.j0(r1);     // Catch: Exception -> L10
        a.f.e(r4.v(), new si3(r4, 1));     // Catch: Exception -> L10
        return;
    L10:
        e = move-exception;
        e.printStackTrace();
    }
}
