package defpackage;

import android.os.SystemClock;
import android.util.Log;
import app.homemusic.R;
import com.eddyizm.tempus.homemusic.HubFavoriteSnapshot;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ns1 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ long o;

    public /* synthetic */ ns1(int r1, long r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        long r2 = this.o;
        switch(r0) {
            case 0: goto L8;
            default: goto L5;
        };
    L8:
        long r4 = SystemClock.elapsedRealtime();
        if (rs1.j == r2) goto L11;
    L23:
        rr1 r10 = rr1.a;     // Catch: Throwable -> L17
        n61.i(r2, ((HubFavoriteSnapshot) rr1.d(new or1(22), new k2(24, (byte) 0))).states());     // Catch: Throwable -> L17
        rs1.i = r4;     // Catch: Throwable -> L17
        rs1.j = r2;     // Catch: Throwable -> L17
        Object r11 = j15.a;     // Catch: Throwable -> L17
    L19:
        Throwable r12 = bb3.a(r11);
        if (r12 == null) goto L26;
        Log.d("HubPlays", "favorite snapshot unavailable: ".concat(r12.getClass().getSimpleName()));
        return;
    L26:
        return;
    L17:
        th = move-exception;
        r11 = new s14(th);
        goto L19
    L11:
        if (rs1.i == Long.MIN_VALUE) goto L23;
        if ((r4 - rs1.i) >= 30000) goto L23;
        return;
    L5:
        if (u52.i != r2) goto L25;
        u52.b.k(v52.a(u52.c(), 0, 0, R.string.lan_reconnecting, 536739837));
        z52.b();
        return;
    }
}
