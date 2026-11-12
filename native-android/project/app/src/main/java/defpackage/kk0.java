package defpackage;

import android.media.ResourceBusyException;
import android.media.UnsupportedSchemeException;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager$MissingSchemeDataException;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kk0 implements ww0 {
    public final UUID b;
    public final mj0 c;
    public final ll d;
    public final HashMap e;
    public final boolean f;
    public final int[] g;
    public final boolean h;
    public final qr2 i;
    public final i80 j;
    public final d34 k;
    public final long l;
    public final ArrayList m;
    public final Set n;
    public final Set o;
    public int p;
    public m31 q;
    public ik0 r;
    public ik0 s;
    public Looper t;
    public Handler u;
    public byte[] v;
    public ik3 w;
    public volatile zk x;

    public kk0(UUID r3, ll r4, HashMap r5, boolean r6, int[] r7, boolean r8, i80 r9) {
        r3.getClass();
        rr2.k("Use C.CLEARKEY_UUID instead", !ax.b.equals(r3));
        this.b = r3;
        this.c = ue1.r;
        this.d = r4;
        this.e = r5;
        this.f = r6;
        this.g = r7;
        this.h = r8;
        this.j = r9;
        this.i = new qr2(6);
        this.k = new d34(19, this);
        this.m = new ArrayList();
        this.n = Collections.newSetFromMap(new IdentityHashMap());
        this.o = Collections.newSetFromMap(new IdentityHashMap());
        this.l = 300000;
    }

    public static boolean h(ik0 r2) {
        r2.o();
        if (r2.p != 1) goto L13;
        DrmSession$DrmSessionException r3 = r2.g();
        r3.getClass();
        Throwable r4 = r3.getCause();
        if ((r4 instanceof ResourceBusyException) == false) goto L8;
    L12:
        return true;
    L8:
        if (gb.N(r4) == true) goto L12;
        return false;
    L13:
        return false;
    }

    public static ArrayList k(ow0 r4, UUID r5, boolean r6) {
        ArrayList r0 = new ArrayList(r4.q);
        int r1 = 0;
    L4:
        if (r1 >= r4.q) goto L16;
        nw0 r2 = r4.n[r1];
        if (r2.a(r5) == true) goto L12;
        if (ax.c.equals(r5) == false) goto L15;
        if (r2.a(ax.b) == true) goto L12;
    L15:
        r1 = r1 + 1;
    L12:
        if (r2.r != null) goto L14;
        if (r6 == false) goto L15;
    L14:
        r0.add(r2);
        goto L15
    L16:
        return r0;
    }

    @Override // defpackage.ww0
    public final void a() {
        m(true);
        int r1 = this.p - 1;
        this.p = r1;
        if (r1 == 0) goto L6;
        return;
    L6:
        if (this.l == (-9223372036854775807L)) goto L11;
        ArrayList r0 = new ArrayList(this.m);
        int r2 = 0;
    L9:
        if (r2 >= r0.size()) goto L11;
        ((ik0) r0.get(r2)).d(null);
        r2 = r2 + 1;
    L11:
        o15 r3 = jx1.k(this.n).h();
    L13:
        if (r3.hasNext() == false) goto L15;
        ((jk0) r3.next()).a();
        goto L13
    L15:
        l();
    }

    @Override // defpackage.ww0
    public final void b() {
        m(true);
        int r0 = this.p;
        this.p = r0 + 1;
        if (r0 == 0) goto L6;
        return;
    L6:
        if (this.q != null) goto L22;
        UUID r1 = this.b;
        this.c.getClass();
        m31 r2 = new ue1(r1);     // Catch: Exception -> L10 UnsupportedSchemeException -> L12
    L19:
        this.q = r2;
        r2.D(new zg5(this));
        return;
    L18:
        l93.F("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + r1 + ".");
        r2 = new om0(12);
    L10:
        e = move-exception;
        throw new UnsupportedDrmException(e);     // Catch: UnsupportedDrmException -> L18
    L12:
        e = move-exception;
        throw new UnsupportedDrmException(e);     // Catch: UnsupportedDrmException -> L18
    L22:
        if (this.l == (-9223372036854775807L)) goto L27;
        int r3 = 0;
    L24:
        ArrayList r4 = this.m;
        if (r3 >= r4.size()) goto L32;
        ((ik0) r4.get(r3)).e(null);
        r3 = r3 + 1;
        goto L24
    L32:
        return;
    }

    @Override // defpackage.ww0
    public final pw0 c(sw0 r4, tb1 r5) {
        boolean r0 = false;
        m(false);
        if (this.p <= 0) goto L5;
        r0 = true;
    L5:
        rr2.w(r0);
        this.t.getClass();
        return g(this.t, r4, r5, true);
    }

    @Override // defpackage.ww0
    public final vw0 d(sw0 r3, tb1 r4) {
        if (this.p <= 0) goto L5;
        boolean r0 = true;
    L6:
        rr2.w(r0);
        this.t.getClass();
        jk0 r1 = new jk0(this, r3);
        Handler r2 = this.u;
        r2.getClass();
        r2.post(new k6(18, r1, r4));
        return r1;
    L5:
        r0 = false;
        goto L6
    }

    @Override // defpackage.ww0
    public final void e(Looper r2, ik3 r3) {
        monitor-enter(this);
        Looper r0 = this.t;     // Catch: Throwable -> L6
        if (r0 != null) goto L8;
        this.t = r2;     // Catch: Throwable -> L6
        this.u = new Handler(r2);     // Catch: Throwable -> L6
    L12:
        monitor-exit(this);
        this.w = r3;
        return;
    L8:
        if (r0 != r2) goto L10;
        boolean r4 = true;
    L11:
        rr2.w(r4);     // Catch: Throwable -> L6
        this.u.getClass();     // Catch: Throwable -> L6
        goto L12
    L10:
        r4 = false;
    L6:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.ww0
    public final int f(tb1 r7) {
        m(false);
        m31 r1 = this.q;
        r1.getClass();
        int r2 = r1.P();
        ow0 r3 = r7.r;
        if (r3 != null) goto L16;
        int r8 = lw2.h(r7.n);
        int r4 = 0;
    L5:
        int[] r5 = this.g;
        if (r4 >= r5.length) goto L11;
        if (r5[r4] == r8) goto L12;
        r4 = r4 + 1;
    L12:
        if (r4 != (-1)) goto L40;
        return 0;
    L40:
        return r2;
    L11:
        r4 = -1;
        goto L12
    L16:
        if (this.v != null) goto L40;
        UUID r6 = this.b;
        if (k(r3, r6, true).isEmpty() == true) goto L21;
    L25:
        String r9 = r3.p;
        if (r9 == null) goto L40;
        if ("cenc".equals(r9) == true) goto L40;
        if ("cbcs".equals(r9) == false) goto L36;
        if (Build.VERSION.SDK_INT >= 25) goto L40;
    L39:
        return 1;
    L36:
        if ("cbc1".equals(r9) == true) goto L39;
        if ("cens".equals(r9) == false) goto L40;
    L21:
        if (r3.q != 1) goto L39;
        if (r3.n[0].a(ax.b) == false) goto L39;
        l93.q0("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + r6);
        goto L25
    }

    public final pw0 g(Looper r7, sw0 r8, tb1 r9, boolean r10) {
        int r1 = 2;
        if (this.x != null) goto L5;
        this.x = new zk(this, r7, r1);
    L5:
        ow0 r11 = r9.r;
        int r0 = 0;
        ik0 r2 = null;
        if (r11 != null) goto L32;
        int r12 = lw2.h(r9.n);
        m31 r13 = this.q;
        r13.getClass();
        if (r13.P() == 2) goto L10;
    L12:
        int[] r14 = this.g;
    L14:
        if (r0 >= r14.length) goto L19;
        if (r14[r0] == r12) goto L20;
        r0 = r0 + 1;
    L20:
        if (r0 != (-1)) goto L22;
    L30:
        return null;
    L22:
        if (r13.P() == 1) goto L30;
        ik0 r15 = this.r;
        if (r15 != null) goto L27;
        vw1 r16 = yw1.o;
        ik0 r17 = j(gy3.r, true, null, r10);
        this.m.add(r17);
        this.r = r17;
    L29:
        return this.r;
    L27:
        r15.e(null);
        goto L29
    L19:
        r0 = -1;
        goto L20
    L10:
        if (se1.c == false) goto L12;
    L32:
        if (this.v != null) goto L37;
        ArrayList r18 = k(r11, this.b, false);
        if (r18.isEmpty() == false) goto L39;
        DefaultDrmSessionManager$MissingSchemeDataException r19 = new DefaultDrmSessionManager$MissingSchemeDataException("Media does not support uuid: " + this.b);
        l93.G("DefaultDrmSessionMgr", "DRM error", r19);
        r8.d(r19);
        return new f21(new DrmSession$DrmSessionException(r19, 6003));
    L39:
        if (this.f == true) goto L41;
        r2 = this.s;
    L46:
        if (r2 != null) goto L52;
        ik0 r20 = j(r18, false, r8, r10);
        if (this.f == true) goto L50;
        this.s = r20;
    L50:
        this.m.add(r20);
        return r20;
    L52:
        r2.e(r8);
        return r2;
    L41:
        ArrayList r21 = this.m;
        int r3 = r21.size();
        int r4 = 0;
    L42:
        if (r4 >= r3) goto L46;
        Object r5 = r21.get(r4);
        r4 = r4 + 1;
        ik0 r6 = (ik0) r5;
        if (Objects.equals(r6.a, r18) == false) goto L42;
        r2 = r6;
        goto L46
    L37:
        r18 = null;
        goto L39
    }

    public final ik0 i(List r17, boolean r18, sw0 r19) {
        this.q.getClass();
        boolean r8 = this.h | r18;
        m31 r4 = this.q;
        byte[] r10 = this.v;
        Looper r13 = this.t;
        r13.getClass();
        ik3 r15 = this.w;
        r15.getClass();
        ik0 r2 = new ik0(this.b, r4, this.i, this.k, r17, r8, r18, r10, this.e, this.d, r13, this.j, r15);
        r2.e(r19);
        if (this.l == (-9223372036854775807L)) goto L5;
        r2.e(null);
    L5:
        return r2;
    }

    public final ik0 j(List r10, boolean r11, sw0 r12, boolean r13) {
        ik0 r0 = i(r10, r11, r12);
        boolean r1 = h(r0);
        long r4 = this.l;
        Set r7 = this.o;
        if (r1 == false) goto L15;
        if (r7.isEmpty() == true) goto L15;
        o15 r2 = jx1.k(r7).h();
    L8:
        if (r2.hasNext() == false) goto L10;
        ((pw0) r2.next()).d(null);
        goto L8
    L10:
        r0.d(r12);
        if (r4 == (-9223372036854775807L)) goto L13;
        r0.d(null);
    L13:
        r0 = i(r10, r11, r12);
    L15:
        if (h(r0) == false) goto L34;
        if (r13 == false) goto L34;
        Set r14 = this.n;
        if (r14.isEmpty() == true) goto L34;
        o15 r15 = jx1.k(r14).h();
    L21:
        if (r15.hasNext() == false) goto L24;
        ((jk0) r15.next()).a();
        goto L21
    L24:
        if (r7.isEmpty() == true) goto L29;
        o15 r16 = jx1.k(r7).h();
    L27:
        if (r16.hasNext() == false) goto L29;
        ((pw0) r16.next()).d(null);
    L29:
        r0.d(r12);
        if (r4 == (-9223372036854775807L)) goto L33;
        r0.d(null);
    L33:
        return i(r10, r11, r12);
    L34:
        return r0;
    }

    public final void l() {
        if (this.q != null) goto L5;
        return;
    L5:
        if (this.p == 0) goto L7;
        return;
    L7:
        if (this.m.isEmpty() == true) goto L9;
        return;
    L9:
        if (this.n.isEmpty() == false) goto L15;
        m31 r0 = this.q;
        r0.getClass();
        r0.a();
        this.q = null;
        return;
    }

    public final void m(boolean r3) {
        if (r3 == true) goto L5;
    L8:
        Thread r4 = Thread.currentThread();
        Looper r1 = this.t;
        r1.getClass();
        if (r4 == r1.getThread()) goto L12;
        l93.r0("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.t.getThread().getName(), new IllegalStateException());
        return;
    L12:
        return;
    L5:
        if (this.t != null) goto L8;
        l93.r0("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
    }
}
