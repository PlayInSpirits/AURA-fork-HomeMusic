package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException;
import androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException;
import com.eddyizm.tempus.homemusic.SmartSession;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class al0 implements hd2 {
    public static final mj0 B = null;
    public long A;
    public final zh0 n;
    public final fn1 o;
    public final i80 p;
    public final HashMap q;
    public final CopyOnWriteArrayList r;
    public ue1 s;
    public i61 t;
    public Handler u;
    public zm1 v;
    public cn1 w;
    public Uri x;
    public ym1 y;
    public boolean z;

    static {
        B = new mj0(4);
    }

    public al0(zh0 r1, i80 r2, fn1 r3) {
        this.n = r1;
        this.o = r3;
        this.p = r2;
        this.r = new CopyOnWriteArrayList();
        this.q = new HashMap();
        this.A = -9223372036854775807L;
    }

    public final ym1 a(boolean r5, Uri r6) {
        HashMap r0 = this.q;
        ym1 r1 = ((zk0) r0.get(r6)).q;
        if (r1 == null) goto L32;
        if (r5 == false) goto L32;
        if (r6.equals(this.x) == true) goto L24;
        List r7 = this.w.e;
        int r2 = 0;
    L9:
        if (r2 >= r7.size()) goto L24;
        if (r6.equals(((bn1) r7.get(r2)).a) == true) goto L12;
        r2 = r2 + 1;
        goto L9
    L12:
        ym1 r8 = this.y;
        if (r8 != null) goto L15;
    L17:
        this.x = r6;
        zk0 r9 = (zk0) r0.get(r6);
        ym1 r3 = r9.q;
        if (r3 != null) goto L20;
    L22:
        r9.f(c(r6));
        goto L24
    L20:
        if (r3.o == false) goto L22;
        this.y = r3;
        this.v.u(r3);
        goto L24
    L15:
        if (r8.o == false) goto L17;
    L24:
        zk0 r4 = (zk0) r0.get(r6);
        ym1 r10 = r4.q;
        if (r4.x == true) goto L32;
        r4.x = true;
        if (r10 == null) goto L32;
        if (r10.o == true) goto L32;
        r4.d(true);
    L32:
        return r1;
    }

    @Override // defpackage.hd2
    public final void b(jd2 r12, long r13, long r15, boolean r17) {
        de3 r14 = (de3) r12;
        long r1 = r14.a;
        ii0 r2 = r14.b;
        yl4 r16 = r14.d;
        ed2 r0 = new ed2(r2, r16.p, r16.q, r13, r15, r16.o);
        this.p.getClass();
        this.s.q(r0, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final Uri c(Uri r3) {
        ym1 r2 = this.y;
        if (r2 != null) goto L5;
    L13:
        return r3;
    L5:
        if (r2.v.e == false) goto L13;
        um1 r4 = (um1) r2.t.get(r3);
        if (r4 == null) goto L13;
        Uri.Builder r5 = r3.buildUpon();
        r5.appendQueryParameter("_HLS_msn", String.valueOf(r4.b));
        int r6 = r4.c;
        if (r6 == (-1)) goto L12;
        r5.appendQueryParameter("_HLS_part", String.valueOf(r6));
    L12:
        return r5.build();
    }

    public final boolean d(Uri r7) {
        zk0 r6 = (zk0) this.q.get(r7);
        if (r6.q == null) goto L16;
        long r0 = SystemClock.elapsedRealtime();
        long r2 = Math.max(30000, f35.i0(r6.q.u));
        ym1 r8 = r6.q;
        if (r8.o == true) goto L15;
        int r9 = r8.d;
        if (r9 == 2) goto L15;
        if (r9 == 1) goto L15;
        if ((r6.r + r2) > r0) goto L15;
        return false;
    L15:
        return true;
    L16:
        return false;
    }

    @Override // defpackage.hd2
    public final void g(jd2 r21, long r22, long r24) {
        de3 r1 = (de3) r21;
        dn1 r2 = (dn1) r1.f;
        boolean r3 = r2 instanceof ym1;
        if (r3 == false) goto L5;
        String r4 = r2.a;
        cn1 r5 = cn1.l;
        Uri r7 = Uri.parse(r4);
        sb1 r6 = new sb1();
        r6.a = "0";
        r6.l = lw2.m("application/x-mpegURL");
        List r10 = Collections.singletonList(new bn1(r7, new tb1(r6), null, null, null, null));
        List r9 = Collections.EMPTY_LIST;
        cn1 r8 = new cn1("", r9, r10, r9, r9, r9, r9, null, null, false, Collections.EMPTY_MAP, r9);
    L6:
        this.w = r8;
        this.x = ((bn1) r8.e.get(0)).a;
        this.r.add(new yk0(this));
        List r11 = r8.d;
        int r12 = r11.size();
        int r13 = 0;
    L7:
        if (r13 >= r12) goto L9;
        Uri r14 = (Uri) r11.get(r13);
        this.q.put(r14, new zk0(this, r14));
        r13 = r13 + 1;
        goto L7
    L9:
        ii0 r15 = r1.b;
        yl4 r16 = r1.d;
        ed2 r17 = new ed2(r15, r16.p, r16.q, r22, r24, r16.o);
        zk0 r18 = (zk0) this.q.get(this.x);
        if (r3 == false) goto L12;
        r18.h((ym1) r2, r17);
    L13:
        this.p.getClass();
        this.s.r(r17, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        return;
    L12:
        r18.d(false);
        goto L13
    L5:
        r8 = (cn1) r2;
        goto L6
    }

    @Override // defpackage.hd2
    public final void j(jd2 r17, long r18, long r20, int r22) {
        de3 r0 = (de3) r17;
        if (r22 != 0) goto L6;
        long r2 = r0.a;
        ed2 r5 = new ed2(r18, r0.b);
    L7:
        this.s.u(r5, r0.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, r22);
        return;
    L6:
        long r1 = r0.a;
        ii0 r4 = r0.b;
        yl4 r3 = r0.d;
        r5 = new ed2(r4, r3.p, r3.q, r18, r20, r3.o);
        goto L7
    }

    @Override // defpackage.hd2
    public final dd2 s(jd2 r19, long r20, long r22, IOException r24, int r25) {
        de3 r1 = (de3) r19;
        long r3 = r1.a;
        ii0 r4 = r1.b;
        yl4 r5 = r1.d;
        ed2 r2 = new ed2(r4, r5.p, r5.q, r20, r22, r5.o);
        int r6 = r1.c;
        this.p.getClass();
        Throwable r7 = r24;
    L4:
        if (r7 == null) goto L20;
        if ((r7 instanceof ParserException) == true) goto L19;
        if ((r7 instanceof FileNotFoundException) == true) goto L19;
        if ((r7 instanceof HttpDataSource$CleartextNotPermittedException) == true) goto L19;
        if ((r7 instanceof Loader$UnexpectedLoaderException) == true) goto L19;
        if ((r7 instanceof DataSourceException) == false) goto L18;
        if (((DataSourceException) r7).n == 2008) goto L19;
    L18:
        r7 = r7.getCause();
    L19:
        long r8 = -9223372036854775807L;
    L22:
        if (r8 != (-9223372036854775807L)) goto L24;
        boolean r14 = true;
    L25:
        long r16 = r8;
        this.s.s(r2, r6, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, r24, r14);
        if (r14 == false) goto L30;
        return i61.t;
    L30:
        return new dd2(0, r16, false);
    L24:
        r14 = false;
        goto L25
    L20:
        r8 = Math.min((r25 - 1) * 1000, SmartSession.MAX_SONGS);
        goto L22
    }
}
