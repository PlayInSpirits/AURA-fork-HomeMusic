package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import app.homemusic.R;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mm implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ long o;
    public final /* synthetic */ Object p;

    public /* synthetic */ mm(long r1, Object r3, int r4) {
        this.n = r4;
        this.o = r1;
        this.p = r3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.n) {
            case 0: goto L47;
            case 1: goto L41;
            case 2: goto L27;
            case 3: goto L10;
            case 4: goto L6;
            default: goto L4;
        };
    L4:
        wk3 r0 = (wk3) this.p;
        long r1 = this.o;
        ((RecyclerView) r0.l0.t).j0((int) r1);
        return;
    L6:
        h62 r2 = (h62) this.p;
        if (r2.l0(this.o) == false) goto L52;
        r2.H0 = null;
        r2.I0 = false;
        r2.s0(R.string.lan_discovery_error);
        return;
    L52:
        return;
    L10:
        long r3 = this.o;
        bl2 r6 = (bl2) this.p;
    L19:
        e = move-exception;
        w42.a.a("Controller could not pause local playback", e);     // Catch: Throwable -> L17
    L21:
        sk2.Z0(r6);
        return;
    L17:
        th = move-exception;
        sk2.Z0(r6);
        throw th;
    L12:
        if (u52.i != r3) goto L21;
        if (u52.c().a == false) goto L21;
        ((bj2) r6.get()).c();     // Catch: Throwable -> L17 Exception -> L19
    L27:
        long r4 = this.o;
        Exception r7 = (Exception) this.p;
        if (u52.i != r4) goto L53;
        z52.b();
        k03 r5 = u52.b;
        v52 r8 = u52.c();
        if ((r7 instanceof p52) == false) goto L33;
        int r9 = R.string.lan_pair_first;
    L39:
        r5.k(v52.a(r8, 0, 0, r9, 536739837));
        return;
    L33:
        if ((r7 instanceof s52) == false) goto L36;
        r9 = R.string.lan_server_mismatch;
        goto L39
    L36:
        if ((r7 instanceof t52) == false) goto L38;
        r9 = R.string.lan_update_both;
        goto L39
    L38:
        r9 = R.string.lan_connection_error;
        goto L39
    L53:
        return;
    L41:
        ye4 r10 = (ye4) this.p;
        long r11 = this.o;
        Calendar r12 = a35.d();
        Calendar r13 = a35.e(null);
        r13.setTimeInMillis(r11);
        if (r12.get(1) != r13.get(1)) goto L44;
        String r14 = a35.b("MMMd", Locale.getDefault()).format(new Date(r11));
    L45:
        r10.n.setError(String.format(r10.r, new Object[]{r14.replace(' ', 160)}));
        ze4 r15 = r10.x;
        r10.w.getError();
        r15.getClass();
        r10.v.a();
        return;
    L44:
        r14 = hw.q(r11);
        goto L45
    L47:
        xc5 r16 = (xc5) this.p;
        long r17 = this.o;
        qm r18 = (qm) r16.p;
        String r19 = f35.a;
        r18.F(r17);
    }

    public /* synthetic */ mm(Object r1, long r2, int r4) {
        this.n = r4;
        this.p = r1;
        this.o = r2;
    }
}
