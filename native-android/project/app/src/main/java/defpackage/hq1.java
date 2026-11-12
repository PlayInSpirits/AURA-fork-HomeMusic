package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Handler;
import com.eddyizm.tempus.subsonic.models.Child;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hq1 implements r21 {
    public int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public Object f;
    public Object g;

    public hq1(o83 r1, q21 r2, fw r3, ew r4) {
        r3.getClass();
        r4.getClass();
        this.b = r1;
        this.c = r2;
        this.d = r3;
        this.e = r4;
        this.f = new e20(r3);
    }

    @Override // defpackage.r21
    public ej4 a(k14 r10) {
        if (br1.a(r10) == false) goto L5;
        String r0 = r10.s.a("Transfer-Encoding");
        if (r0 != null) goto L10;
        r0 = null;
    L10:
        if ("chunked".equalsIgnoreCase(r0) == false) goto L17;
        gr1 r11 = r10.n.a;
        if (this.a != 4) goto L15;
        this.a = 5;
        return new dq1(this, r11);
    L15:
        nz2.e(this.a, "state: ");
        return null;
    L17:
        long r5 = ze5.e(r10);
        if (r5 == (-1)) goto L22;
        return k(r5);
    L22:
        if (this.a != 4) goto L25;
        this.a = 5;
        ((q21) this.c).a();
        return new fq1(this);
    L25:
        nz2.e(this.a, "state: ");
        return null;
    L5:
        return k(0);
    }

    @Override // defpackage.r21
    public void b(oz3 r5) {
        r5.getClass();
        Proxy.Type r0 = ((q21) this.c).h().b.type();
        r0.getClass();
        StringBuilder r1 = new StringBuilder();
        r1.append(r5.b);
        r1.append(' ');
        gr1 r2 = r5.a;
        if (r2.f() == false) goto L5;
    L7:
        String r3 = r2.b();
        String r4 = r2.d();
        if (r4 == null) goto L10;
        r3 = r3 + '?' + r4;
    L10:
        r1.append(r3);
    L11:
        r1.append(" HTTP/1.1");
        n(r5.c, r1.toString());
        return;
    L5:
        if (r0 != Proxy.Type.HTTP) goto L7;
        r1.append(r2);
        goto L11
    }

    @Override // defpackage.r21
    public void c() {
        ((ew) this.e).flush();
    }

    @Override // defpackage.r21
    public void cancel() {
        ((q21) this.c).cancel();
    }

    @Override // defpackage.r21
    public long d(k14 r2) {
        if (br1.a(r2) == true) goto L6;
        return 0;
    L6:
        String r1 = r2.s.a("Transfer-Encoding");
        if (r1 != null) goto L10;
        r1 = null;
    L10:
        if ("chunked".equalsIgnoreCase(r1) == false) goto L14;
        return -1;
    L14:
        return ze5.e(r2);
    }

    @Override // defpackage.r21
    public of4 e(oz3 r7, long r8) {
        r7.getClass();
        tz3 r0 = r7.d;
        if (r0 == null) goto L10;
        if (r0.isDuplex() != true) goto L10;
        throw new ProtocolException("Duplex connections are not supported for HTTP/1");
    L10:
        if ("chunked".equalsIgnoreCase(r7.c.a("Transfer-Encoding")) == false) goto L18;
        if (this.a != 1) goto L15;
        this.a = 2;
        return new cq1(this);
    L15:
        nz2.e(this.a, "state: ");
        return null;
    L18:
        if (r8 != (-1)) goto L20;
        kf2.o("Cannot stream a request body without chunked encoding or a known content length!");
        return null;
    L20:
        if (this.a != 1) goto L23;
        this.a = 2;
        return new zn0(this);
    L23:
        nz2.e(this.a, "state: ");
        return null;
    }

    @Override // defpackage.r21
    public j14 f(boolean r12) {
        e20 r0 = (e20) this.f;
        int r1 = this.a;
        if (r1 != 1) goto L5;
    L34:
        String r2 = ((fw) r0.p).t(r0.o);     // Catch: EOFException -> L20
        r0.o -= (long) r2.length();     // Catch: EOFException -> L20
        ue1 r3 = hw.C(r2);     // Catch: EOFException -> L20
        int r4 = r3.o;     // Catch: EOFException -> L20
        j14 r5 = new j14();     // Catch: EOFException -> L20
        r5.b = (pr3) r3.p;     // Catch: EOFException -> L20
        r5.c = r4;     // Catch: EOFException -> L20
        r5.d = (String) r3.q;     // Catch: EOFException -> L20
        sl1 r6 = new sl1();     // Catch: EOFException -> L20
    L11:
        String r7 = ((fw) r0.p).t(r0.o);     // Catch: EOFException -> L20
        r0.o -= (long) r7.length();     // Catch: EOFException -> L20
        if (r7.length() == 0) goto L13;
        r6.b(r7);     // Catch: EOFException -> L20
        goto L11
    L13:
        r5.f = r6.c().d();     // Catch: EOFException -> L20
        r5.n = gq1.o;     // Catch: EOFException -> L20
        if (r12 == false) goto L17;
        if (r4 != 100) goto L17;
        return null;
    L17:
        if (r4 != 100) goto L23;
        this.a = 3;     // Catch: EOFException -> L20
        return r5;
    L23:
        if (102 <= r4) goto L25;
    L28:
        this.a = 4;     // Catch: EOFException -> L20
        return r5;
    L25:
        if (r4 >= 200) goto L28;
        this.a = 3;     // Catch: EOFException -> L20
        return r5;
    L20:
        e = move-exception;
        throw new IOException("unexpected end of stream on ".concat(((q21) this.c).h().a.h.i()), e);
    L5:
        if (r1 == 2) goto L34;
        if (r1 == 3) goto L34;
        nz2.e(this.a, "state: ");
        return null;
    }

    @Override // defpackage.r21
    public void g() {
        ((ew) this.e).flush();
    }

    @Override // defpackage.r21
    public q21 h() {
        return (q21) this.c;
    }

    @Override // defpackage.r21
    public tl1 i() {
        if (this.a != 6) goto L8;
        tl1 r2 = (tl1) this.g;
        if (r2 == null) goto L7;
        return r2;
    L7:
        return ze5.a;
    L8:
        kf2.o("too early; can't read the trailers yet");
        return null;
    }

    public void j() {
        int r0 = ((h04) this.d).a((Context) this.b);
        if (this.a == r0) goto L6;
        this.a = r0;
        ((lt0) ((cn) this.c).o).b(this, r0);
        return;
    }

    public eq1 k(long r3) {
        if (this.a != 4) goto L6;
        this.a = 5;
        return new eq1(this, r3);
    L6:
        nz2.e(this.a, "state: ");
        return null;
    }

    public void l() {
        im3 r0 = (im3) this.g;
        k03 r1 = r0.j;
        List r2 = (List) r1.d();
        ArrayList r3 = (ArrayList) this.b;
        if (r2 != r3) goto L5;
        ArrayList r4 = new ArrayList(r3);
        r4.add(this.a, (Child) this.f);
        r1.k(r4);
    L5:
        im3.c(r0, (String) this.c, true);
        ((ew4) this.e).o();
    }

    public int m() {
        h04 r0 = (h04) this.d;
        Context r1 = (Context) this.b;
        this.a = r0.a(r1);
        IntentFilter r2 = new IntentFilter();
        int r3 = r0.n;
        if ((r3 & 1) == 0) goto L6;
        ConnectivityManager r4 = (ConnectivityManager) r1.getSystemService("connectivity");
        r4.getClass();
        j04 r5 = new j04(this);
        this.g = r5;
        r4.registerDefaultNetworkCallback(r5);
    L6:
        if ((r3 & 8) == 0) goto L9;
        r2.addAction("android.intent.action.ACTION_POWER_CONNECTED");
        r2.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
    L9:
        if ((r3 & 4) == 0) goto L12;
        r2.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
    L12:
        if ((r3 & 16) == 0) goto L14;
        r2.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        r2.addAction("android.intent.action.DEVICE_STORAGE_OK");
    L14:
        v9 r6 = new v9(10, this);
        this.f = r6;
        r1.registerReceiver(r6, r2, null, (Handler) this.e);
        return this.a;
    }

    public void n(tl1 r6, String r7) {
        ew r0 = (ew) this.e;
        r6.getClass();
        if (this.a != 0) goto L9;
        r0.y(r7).y("\r\n");
        int r8 = r6.size();
        int r2 = 0;
    L5:
        if (r2 >= r8) goto L7;
        r0.y(r6.b(r2)).y(": ").y(r6.e(r2)).y("\r\n");
        r2 = r2 + 1;
        goto L5
    L7:
        r0.y("\r\n");
        this.a = 1;
        return;
    L9:
        nz2.e(this.a, "state: ");
    }

    public hq1(Context r1, cn r2, h04 r3) {
        this.b = r1.getApplicationContext();
        this.c = r2;
        this.d = r3;
        this.e = f35.q(null);
    }

    public hq1(im3 r1, ArrayList r2, String r3, List r4, int r5, ew4 r6, Child r7) {
        this.g = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.a = r5;
        this.e = r6;
        this.f = r7;
    }
}
