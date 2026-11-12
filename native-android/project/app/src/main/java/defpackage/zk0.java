package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser$DeltaUpdateException;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker$PlaylistResetException;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker$PlaylistStuckException;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zk0 implements hd2 {
    public final Uri n;
    public final i61 o;
    public final ci0 p;
    public ym1 q;
    public long r;
    public long s;
    public long t;
    public long u;
    public boolean v;
    public IOException w;
    public boolean x;
    public final /* synthetic */ al0 y;

    public zk0(al0 r2, Uri r3) {
        this.y = r2;
        this.n = r3;
        this.o = new i61("DefaultHlsPlaylistTracker:MediaPlaylist");
        this.p = ((bi0) r2.n.o).m();
    }

    public static boolean a(zk0 r8, long r9) {
        r8.u = SystemClock.elapsedRealtime() + r9;
        Uri r10 = r8.n;
        al0 r11 = r8.y;
        if (r10.equals(r11.x) == false) goto L12;
        List r12 = r11.w.e;
        int r0 = r12.size();
        long r1 = SystemClock.elapsedRealtime();
        int r4 = 0;
    L5:
        if (r4 >= r0) goto L11;
        zk0 r5 = (zk0) r11.q.get(((bn1) r12.get(r4)).a);
        r5.getClass();
        if (r1 > r5.u) goto L8;
        r4 = r4 + 1;
        goto L5
    L8:
        Uri r13 = r5.n;
        r11.x = r13;
        r5.f(r11.c(r13));
        return true;
    L11:
        return false;
    L12:
        return true;
    }

    @Override // defpackage.hd2
    public final void b(jd2 r12, long r13, long r15, boolean r17) {
        de3 r14 = (de3) r12;
        long r1 = r14.a;
        ii0 r2 = r14.b;
        yl4 r16 = r14.d;
        ed2 r0 = new ed2(r2, r16.p, r16.q, r13, r15, r16.o);
        al0 r11 = this.y;
        r11.p.getClass();
        r11.s.q(r0, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final Uri c() {
        ym1 r0 = this.q;
        Uri r1 = this.n;
        if (r0 == null) goto L28;
        xm1 r2 = r0.v;
        if (r2.a == (-9223372036854775807L)) goto L7;
    L9:
        Uri.Builder r3 = r1.buildUpon();
        ym1 r4 = this.q;
        if (r4.v.e == false) goto L19;
        r3.appendQueryParameter("_HLS_msn", String.valueOf(r4.k + ((long) r4.r.size())));
        ym1 r5 = this.q;
        if (r5.n == (-9223372036854775807L)) goto L19;
        yw1 r6 = r5.s;
        int r7 = r6.size();
        if (r6.isEmpty() == false) goto L16;
    L18:
        r3.appendQueryParameter("_HLS_part", String.valueOf(r7));
        goto L19
    L16:
        if (((tm1) te5.w(r6)).z == false) goto L18;
        r7 = r7 - 1;
    L19:
        xm1 r8 = this.q.v;
        if (r8.a == (-9223372036854775807L)) goto L27;
        if (r8.b == false) goto L24;
        String r9 = "v2";
    L25:
        r3.appendQueryParameter("_HLS_skip", r9);
        goto L27
    L24:
        r9 = "YES";
    L27:
        return r3.build();
    L7:
        if (r2.e == true) goto L9;
    L28:
        return r1;
    }

    public final void d(boolean r1) {
        if (r1 == false) goto L4;
        Uri r2 = c();
    L5:
        f(r2);
        return;
    L4:
        r2 = this.n;
        goto L5
    }

    public final void e(Uri r17) {
        al0 r1 = this.y;
        ce3 r2 = r1.o.e(r1.w, this.q);
        Map r9 = Collections.EMPTY_MAP;
        rr2.s(r17, "The uri must be set.");
        ii0 r3 = new ii0(r17, 0, 1, null, r9, 0, -1, null, 1);
        de3 r4 = new de3(this.p, r3, r2);
        int r5 = r1.p.D(r4.c);
        this.o.u(r4, this, r5);
    }

    public final void f(Uri r8) {
        this.u = 0;
        if (this.v == true) goto L15;
        i61 r0 = this.o;
        if (r0.l() == false) goto L7;
        return;
    L7:
        if (((IOException) r0.q) == null) goto L9;
        return;
    L9:
        long r1 = SystemClock.elapsedRealtime();
        long r2 = this.t;
        if (r1 >= r2) goto L13;
        this.v = true;
        this.y.u.postDelayed(new k6(19, this, r8), r2 - r1);
        return;
    L13:
        e(r8);
        return;
    }

    @Override // defpackage.hd2
    public final void g(jd2 r17, long r18, long r20) {
        de3 r1 = (de3) r17;
        dn1 r2 = (dn1) r1.f;
        ii0 r4 = r1.b;
        yl4 r3 = r1.d;
        ed2 r5 = new ed2(r4, r3.p, r3.q, r18, r20, r3.o);
        if ((r2 instanceof ym1) == false) goto L5;
        h((ym1) r2, r5);
        this.y.s.r(r5, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    L6:
        this.y.p.getClass();
        return;
    L5:
        ParserException r14 = ParserException.b("Loaded playlist has unexpected type.");
        this.w = r14;
        this.y.s.s(r5, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, r14, true);
        goto L6
    }

    public final void h(ym1 r71, ed2 r72) {
        ym1 r2 = this.q;
        long r3 = SystemClock.elapsedRealtime();
        this.r = r3;
        al0 r5 = this.y;
        CopyOnWriteArrayList r6 = r5.r;
        if (r2 == null) goto L21;
        long r9 = r71.k;
        long r11 = r2.k;
        if (r9 > r11) goto L12;
        if (r9 >= r11) goto L9;
    L8:
        boolean r10 = false;
    L22:
        long r12 = r71.k;
        yw1 r13 = r71.r;
        long r39 = 0;
        if (r10 == false) goto L25;
        r6 = r6;
        boolean r68 = true;
        if (r71.p == false) goto L36;
        long r7 = r71.h;
    L35:
        long r19 = r7;
    L54:
        if (r71.i == false) goto L56;
        int r22 = r71.j;
    L69:
        IOException r8 = null;
        ym1 r14 = new ym1(r71.d, r71.a, r71.b, r71.e, r71.g, r19, true, r22, r71.k, r71.l, r71.m, r71.n, r71.c, r71.o, r71.p, r71.q, r13, r71.s, r71.v, r71.t, r71.w);
    L70:
        this.q = r14;
        Uri r15 = this.n;
        if (r14 == r2) goto L83;
        this.w = r8;
        this.s = r3;
        if (r15.equals(r5.x) == true) goto L75;
    L78:
        Iterator r1 = r6.iterator();
    L80:
        if (r1.hasNext() == false) goto L97;
        ((gn1) r1.next()).a();
    L97:
        ym1 r4 = this.q;
        xm1 r16 = r4.v;
        long r17 = r4.m;
        if (r16.e == true) goto L102;
        if (r4 == r2) goto L101;
    L100:
        r39 = r17;
    L107:
        this.t = (f35.i0(r39) + r3) - r72.e;
        if (this.q.o == false) goto L110;
        return;
    L110:
        if (r15.equals(r5.x) == false) goto L112;
    L113:
        f(c());
        return;
    L112:
        if (this.x == true) goto L113;
        return;
    L101:
        r17 = r17 / 2;
        goto L100
    L102:
        if (r4 != r2) goto L107;
        long r18 = r4.n;
        if (r18 == (-9223372036854775807L)) goto L106;
        r39 = r18 / 2;
        goto L107
    L106:
        r17 = r17 / 2;
        goto L100
    L75:
        if (r5.y != null) goto L77;
        r5.z = !r14.o;
        r5.A = r14.h;
    L77:
        r5.y = r14;
        r5.v.u(r14);
        goto L78
    L83:
        if (r14.o == true) goto L97;
        long r20 = r71.k + ((long) r71.r.size());
        ym1 r21 = this.q;
        if (r20 >= r21.k) goto L88;
        IOException r110 = new HlsPlaylistTracker$PlaylistResetException();
        boolean r23 = r68;
    L92:
        if (r110 == null) goto L97;
        this.w = r110;
        x7 r24 = new x7(r68 ? 1 : 0, 8, r110);
        Iterator r25 = r6.iterator();
    L95:
        if (r25.hasNext() == false) goto L97;
        ((gn1) r25.next()).b(r15, r24, r23);
        goto L95
    L88:
        if ((r3 - this.s) <= (f35.i0(r21.m) * 3.5d)) goto L91;
        r110 = new HlsPlaylistTracker$PlaylistStuckException();
    L90:
        r23 = false;
        goto L92
    L91:
        r110 = r8;
        goto L90
    L56:
        ym1 r26 = r5.y;
        if (r26 == null) goto L59;
        int r27 = r26.j;
    L60:
        if (r2 == null) goto L68;
        int r28 = (int) (r12 - r2.k);
        yw1 r29 = r2.r;
        if (r28 >= r29.size()) goto L65;
        vm1 r30 = (vm1) r29.get(r28);
    L66:
        if (r30 == null) goto L68;
        r27 = (r2.j + r30.q) - ((vm1) r13.get(0)).q;
        goto L68
    L65:
        r30 = null;
    L68:
        r22 = r27;
        goto L69
    L59:
        r27 = 0;
        goto L60
    L36:
        ym1 r31 = r5.y;
        if (r31 == null) goto L39;
        long r32 = r31.h;
    L40:
        if (r2 == null) goto L52;
        long r33 = r2.h;
        long r111 = r2.k;
        yw1 r112 = r2.r;
        int r34 = r112.size();
        int r35 = (int) (r12 - r111);
        if (r35 >= r112.size()) goto L45;
        vm1 r36 = (vm1) r112.get(r35);
    L46:
        if (r36 == null) goto L50;
        long r37 = r36.r;
    L48:
        r7 = r33 + r37;
        goto L35
    L50:
        if (r34 != (r12 - r111)) goto L52;
        r37 = r2.u;
        goto L48
    L45:
        r36 = null;
    L52:
        r19 = r32;
        goto L54
    L39:
        r32 = 0;
        goto L40
    L25:
        if (r71.o == true) goto L27;
        r68 = true;
        r14 = r2;
    L30:
        r8 = null;
        goto L70
    L27:
        if (r2.o == false) goto L29;
        r14 = r2;
        r6 = r6;
        r8 = null;
        r68 = true;
        goto L70
    L29:
        r68 = true;
        r14 = new ym1(r2.d, r2.a, r2.b, r2.e, r2.g, r2.h, r2.i, r2.j, r2.k, r2.l, r2.m, r2.n, r2.c, true, r2.p, r2.q, r2.r, r2.s, r2.v, r2.t, r2.w);
        goto L30
    L9:
        int r38 = r71.r.size() - r2.r.size();
        if (r38 == 0) goto L13;
        if (r38 <= 0) goto L8;
    L13:
        int r40 = r71.s.size();
        int r113 = r2.s.size();
        if (r40 > r113) goto L12;
        if (r40 != r113) goto L8;
        if (r71.o == false) goto L8;
        if (r2.o == true) goto L8;
    L12:
        r10 = true;
        goto L22
    L21:
        r71.getClass();
        goto L12
    }

    @Override // defpackage.hd2
    public final void j(jd2 r17, long r18, long r20, int r22) {
        de3 r0 = (de3) r17;
        if (r22 != 0) goto L6;
        long r2 = r0.a;
        ed2 r5 = new ed2(r18, r0.b);
    L7:
        this.y.s.u(r5, r0.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, r22);
        return;
    L6:
        long r1 = r0.a;
        ii0 r4 = r0.b;
        yl4 r3 = r0.d;
        r5 = new ed2(r4, r3.p, r3.q, r18, r20, r3.o);
        goto L7
    }

    @Override // defpackage.hd2
    public final dd2 s(jd2 r23, long r24, long r26, IOException r28, int r29) {
        de3 r1 = (de3) r23;
        long r2 = r1.a;
        int r3 = r1.c;
        ii0 r13 = r1.b;
        yl4 r4 = r1.d;
        Uri r14 = r4.p;
        ed2 r12 = new ed2(r13, r14, r4.q, r24, r26, r4.o);
        if (r14.getQueryParameter("_HLS_msn") == null) goto L5;
        boolean r5 = true;
    L6:
        boolean r6 = r28 instanceof HlsPlaylistParser$DeltaUpdateException;
        dd2 r15 = i61.s;
        al0 r7 = this.y;
        if (r5 == true) goto L10;
        if (r6 == true) goto L10;
    L19:
        x7 r8 = new x7(r29, 8, r28);
        Iterator r9 = r7.r.iterator();
        boolean r10 = false;
    L21:
        if (r9.hasNext() == false) goto L23;
        r10 = r10 | (!((gn1) r9.next()).b(this.n, r8, false));
        goto L21
    L23:
        i80 r16 = r7.p;
        if (r10 == false) goto L30;
        r16.getClass();
        long r11 = i80.E(r8);
        if (r11 == (-9223372036854775807L)) goto L29;
        dd2 r0 = new dd2(0, r11, false);
    L28:
        r15 = r0;
        goto L30
    L29:
        r0 = i61.t;
    L30:
        int r17 = r15.a;
        if (r17 == 0) goto L35;
        if (r17 == 1) goto L35;
        boolean r18 = false;
    L36:
        r7.s.s(r12, r3, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, r28, !r18);
        if (r18 == true) goto L39;
        r16.getClass();
    L39:
        return r15;
    L35:
        r18 = true;
    L10:
        if ((r28 instanceof HttpDataSource$InvalidResponseCodeException) == false) goto L12;
        int r19 = ((HttpDataSource$InvalidResponseCodeException) r28).p;
    L13:
        if (r6 == false) goto L15;
    L40:
        this.t = SystemClock.elapsedRealtime();
        d(false);
        ue1 r20 = r7.s;
        String r21 = f35.a;
        r20.s(r12, r3, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, r28, true);
        return r15;
    L15:
        if (r19 == 400) goto L40;
        if (r19 != 503) goto L19;
    L12:
        r19 = Integer.MAX_VALUE;
        goto L13
    L5:
        r5 = false;
        goto L6
    }
}
