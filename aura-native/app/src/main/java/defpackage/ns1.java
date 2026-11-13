package defpackage;

import android.os.SystemClock;
import android.util.Log;
import app.homemusic.R;
import com.eddyizm.tempus.homemusic.HubFavoriteSnapshot;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class ns1 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ long o;

    public /* synthetic */ ns1(int i, long j) {
        this.n = i;
        this.o = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object s14Var;
        int i = this.n;
        long j = this.o;
        switch (i) {
            case 0:
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (rs1.j != j || rs1.i == Long.MIN_VALUE || elapsedRealtime - rs1.i >= 30000) {
                    try {
                        rr1 rr1Var = rr1.a;
                        n61.i(j, ((HubFavoriteSnapshot) rr1.d(new or1(22), new k2(24, (byte) 0))).states());
                        rs1.i = elapsedRealtime;
                        rs1.j = j;
                        s14Var = j15.a;
                    } catch (Throwable th) {
                        s14Var = new s14(th);
                    }
                    Throwable a = bb3.a(s14Var);
                    if (a != null) {
                        Log.d("HubPlays", "favorite snapshot unavailable: ".concat(a.getClass().getSimpleName()));
                        break;
                    }
                }
                break;
            default:
                if (u52.i == j) {
                    u52.b.k(v52.a(u52.c(), 0, 0, R.string.lan_reconnecting, 536739837));
                    z52.b();
                    break;
                }
                break;
        }
    }
}
