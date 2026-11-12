package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.PlaybackMetrics;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.Surface;
import android.widget.EditText;
import android.widget.Toast;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.media3.common.ParserException;
import androidx.media3.common.PlaybackException;
import androidx.media3.datasource.FileDataSource$FileDataSourceException;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import androidx.media3.datasource.HttpDataSource$InvalidContentTypeException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.datasource.UdpDataSource$UdpDataSourceException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.audio.AudioSink$InitializationException;
import androidx.media3.exoplayer.audio.AudioSink$WriteException;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager$MissingSchemeDataException;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$DecoderInitializationException;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import app.homemusic.R;
import com.eddyizm.tempus.lan.LanReceiverService;
import com.eddyizm.tempus.ui.crash.CrashActivity;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ef0 implements q43, rc2, qc2, fz, cp3, gz0, bp3, py, ik2, xl2, lm2, ks2, wc0, it2 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    public /* synthetic */ ef0(boolean r1, va4 r2, Bundle r3) {
        this.n = 24;
        this.o = r2;
        this.p = r3;
    }

    @Override // defpackage.q43
    public boolean a(MenuItem r3) {
        CrashActivity r0 = (CrashActivity) this.o;
        DrawerLayout r2 = (DrawerLayout) this.p;
        int r1 = CrashActivity.T;
        int r4 = r3.getItemId();
        if (r4 != R.id.crash_nav_info) goto L6;
        r0.p(new if0(), r0.getString(R.string.ca_info_title));
    L11:
        r2.e(false);
        return true;
    L6:
        if (r4 != R.id.crash_nav_logs) goto L9;
        r0.p(new jf0(), r0.getString(R.string.ca_logs_title));
        goto L11
    L9:
        if (r4 != R.id.crash_nav_export) goto L11;
        r0.p(new gf0(), r0.getString(R.string.ca_export_title));
        goto L11
    }

    @Override // defpackage.wc0
    public void accept(Object r7) {
        int r0 = this.n;
        Object r1 = this.p;
        kt2 r6 = (kt2) this.o;
        switch(r0) {
            case 23: goto L16;
            case 24: goto L4;
            case 25: goto L9;
            default: goto L4;
        };
    L4:
        Surface r2 = (Surface) r1;
        al3 r8 = (al3) r7;
        ((tn2) r6.e.get()).getClass();
        if (r2 != null) goto L7;
        r8.Q(null);
        r6.j = null;
        return;
    L7:
        jt2 r3 = new jt2(r2);
        r6.j = r3;
        r8.Q(r3);
        return;
    L9:
        fr2 r4 = (fr2) r1;
        al3 r9 = (al3) r7;
        tn2 r10 = (tn2) r6.e.get();
        if (r10 != null) goto L12;
        return;
    L12:
        if (r10.l() == true) goto L40;
        r10.i(r4, false);
        return;
    L40:
        return;
    L16:
        cw4 r5 = (cw4) r1;
        al3 r11 = (al3) r7;
        bx1 r12 = r5.H;
        if (r12.isEmpty() == true) goto L29;
        bw4 r13 = r5.a().c();
        o15 r14 = r12.f().h();
    L21:
        if (r14.hasNext() == false) goto L28;
        yv4 r15 = (yv4) r14.next();
        sv4 r16 = r15.a;
        sv4 r17 = (sv4) r6.h.u.get(r16.b);
        if (r17 == null) goto L27;
        if (r15.a.a != r17.a) goto L27;
        r13.a(new yv4(r17, r15.b));
    L27:
        r13.a(r15);
        goto L21
    L28:
        r5 = r13.b();
    L29:
        r11.M(r5);
    }

    @Override // defpackage.ks2
    public void b(fr2 r6) {
        int r0 = this.n;
        Object r1 = this.p;
        ls2 r5 = (ls2) this.o;
        switch(r0) {
            case 20: goto L20;
            case 21: goto L18;
            default: goto L4;
        };
    L4:
        String r7 = ((pm2) r1).n;
        if (TextUtils.isEmpty(r7) == false) goto L7;
        l93.q0("MediaSessionLegacyStub", "onRemoveQueueItem(): Media ID shouldn't be null");
        return;
    L7:
        al3 r8 = r5.g.s;
        if (r8.S0(17) == true) goto L10;
        l93.q0("MediaSessionLegacyStub", "Can't remove item by ID without COMMAND_GET_TIMELINE being available");
        return;
    L10:
        cu4 r2 = r8.x0();
        bu4 r3 = new bu4();
        int r4 = 0;
    L12:
        if (r4 >= r2.o()) goto L29;
        if (TextUtils.equals(r2.m(r4, r3, 0).b.a, r7) == true) goto L15;
        r4 = r4 + 1;
        goto L12
    L15:
        r8.N(r4);
        return;
    L29:
        return;
    L18:
        ((j60) r1).h(r5.g.s);
        return;
    L20:
        lu3 r9 = (lu3) r1;
        tn2 r10 = r5.g;
        gn2 r11 = r10.s.Y0();
        if (r11 == null) goto L30;
        String r12 = r11.a;
        r10.e.e(r10.k, r10.B(r6), r12, r9);
        return;
    }

    @Override // defpackage.lm2
    public void c(bm2 r11) {
        int r0 = this.n;
        Object r1 = this.p;
        Object r10 = this.o;
        switch(r0) {
            case 18: goto L41;
            default: goto L4;
        };
    L4:
        wa4 r12 = (wa4) r10;
        mi3 r2 = (mi3) r1;
        if (r11.Y() == false) goto L44;
        boolean r3 = Objects.equals(r11.x, r2);
        boolean r4 = Objects.equals(r11.w, r12);
        if (r3 == false) goto L11;
        if (r4 == false) goto L11;
        return;
    L11:
        r11.w = r12;
        boolean r5 = true;
        char r6 = 1;
        if (r3 == true) goto L14;
        r11.x = r2;
        mi3 r7 = r11.z;
        mi3 r8 = bm2.Y0(r2, r11.y);
        r11.z = r8;
        boolean r9 = !r8.equals(r7);
    L15:
        if (r4 == false) goto L19;
        if (r9 == true) goto L19;
        boolean r13 = false;
        boolean r14 = false;
    L20:
        if (r9 == false) goto L22;
        r11.i.f(13, new cl2(r11, r6 == true ? 1 : 0));
    L22:
        if (r4 == true) goto L28;
        sk2 r15 = r11.f1();
        r15.getClass();
        if (Looper.myLooper() != r15.f.getLooper()) goto L26;
        boolean r16 = true;
    L27:
        rr2.w(r16);
        r15.e.l();
        goto L28
    L26:
        r16 = false;
    L28:
        if (r14 == false) goto L34;
        sk2 r17 = r11.f1();
        r17.getClass();
        if (Looper.myLooper() != r17.f.getLooper()) goto L32;
        boolean r18 = true;
    L33:
        rr2.w(r18);
        r17.e.getClass();
        goto L34
    L32:
        r18 = false;
    L34:
        if (r13 == false) goto L43;
        sk2 r19 = r11.f1();
        r19.getClass();
        if (Looper.myLooper() == r19.f.getLooper()) goto L39;
        r5 = false;
    L39:
        rr2.w(r5);
        r19.e.u();
        return;
    L43:
        return;
    L19:
        gy3 r20 = r11.u;
        gy3 r21 = r11.v;
        gy3 r22 = bm2.u1(r11.t, r11.s, r12, r11.z, r11.I);
        r11.u = r22;
        r11.v = bm2.t1(r22, r11.s, r11.I, r12, r11.z);
        r13 = !r11.u.equals(r20);
        r14 = !r11.v.equals(r21);
        goto L20
    L14:
        r9 = false;
        goto L15
    L44:
        return;
    L41:
        r11.o1((lk3) r10, (jk3) r1);
    }

    @Override // defpackage.xl2
    public void d(pu1 r7, int r8) {
        int r0 = this.n;
        Object r1 = this.p;
        bm2 r6 = (bm2) this.o;
        switch(r0) {
            case 11: goto L12;
            case 12: goto L10;
            case 13: goto L8;
            case 14: goto L6;
            default: goto L4;
        };
    L4:
        r7.A(r6.c, r8, ((cw4) r1).c());
        return;
    L6:
        qh3 r2 = (qh3) r1;
        mm2 r9 = r6.c;
        Bundle r3 = new Bundle();
        r3.putFloat(qh3.e, r2.a);
        r3.putFloat(qh3.f, r2.b);
        r7.r0(r9, r8, r3);
        return;
    L8:
        r7.y0(r6.c, r8, ((do2) r1).c());
        return;
    L10:
        mm2 r10 = r6.c;
        r7.m0(r10, r8, (Surface) r1);
        return;
    L12:
        ArrayList r4 = (ArrayList) r1;
        mm2 r11 = r6.c;
        uw1 r5 = yw1.j();
        int r12 = 0;
    L14:
        if (r12 >= r4.size()) goto L16;
        r5.c(((gn2) r4.get(r12)).c(true));
        r12 = r12 + 1;
        goto L14
    L16:
        r7.J(r11, r8, new iw(r5.f()));
    }

    @Override // defpackage.ik2
    public int e(Object r5) {
        Context r0 = (Context) this.o;
        tb1 r4 = (tb1) this.p;
        dk2 r6 = (dk2) r5;
        String r1 = r6.b;
        if (r1.equals(r4.n) == true) goto L9;
        if (r1.equals(jk2.c(r4)) == true) goto L9;
        return 0;
    L9:
        if (r6.c(r0, r4, false) == true) goto L11;
    L14:
        return 0;
    L11:
        if (r6.d(r4) == false) goto L14;
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19, types: [ue1] */
    /* JADX WARN: Type inference failed for: r2v41 */
    @Override // defpackage.rc2
    public void f(Object r23, w71 r24) {
        nj0 r2 = (nj0) this.o;
        qi3 r0 = (qi3) this.p;
        ho2 r3 = (ho2) r23;
        SparseArray r4 = r2.r;
        SparseArray r9 = new SparseArray(r24.a.size());
        int r5 = 0;
    L4:
        if (r5 >= r24.a.size()) goto L6;
        int r6 = r24.b(r5);
        q9 r7 = (q9) r4.get(r6);
        r7.getClass();
        r9.append(r6, r7);
        r5 = r5 + 1;
        goto L4
    L6:
        r3.getClass();
        if (r24.a.size() == 0) goto L460;
        int r8 = 0;
    L10:
        boolean r11 = true;
        if (r8 >= r24.a.size()) goto L66;
        int r10 = r24.b(r8);
        q9 r12 = (q9) r9.get(r10);
        r12.getClass();
        nm0 r13 = r3.c;
        if (r10 != 0) goto L36;
        monitor-enter(r13);
        r13.d.getClass();     // Catch: Throwable -> L23
        cu4 r14 = r13.e;     // Catch: Throwable -> L23
        r13.e = r12.b;     // Catch: Throwable -> L23
        Iterator r15 = r13.c.values().iterator();     // Catch: Throwable -> L23
    L17:
        if (r15.hasNext() == false) goto L31;
        mm0 r16 = (mm0) r15.next();     // Catch: Throwable -> L23
        if (r16.b(r14, r13.e) == false) goto L25;
        if (r16.a(r12) == false) goto L17;
    L25:
        r15.remove();     // Catch: Throwable -> L23
        if (r16.a.equals(r13.f) == false) goto L29;
        r13.a(r16);     // Catch: Throwable -> L23
    L29:
        if (r16.e == false) goto L17;
        r13.d.d(r12, r16.a);     // Catch: Throwable -> L23
        goto L17
    L31:
        r13.d(r12);     // Catch: Throwable -> L23
        monitor-exit(r13);
    L65:
        r8 = r8 + 1;
    L23:
        th = move-exception;
        throw th;
    L36:
        if (r10 != 11) goto L64;
        int r17 = r3.l;
        monitor-enter(r13);
        r13.d.getClass();     // Catch: Throwable -> L51
        if (r17 == 0) goto L43;
        r11 = false;
    L43:
        Iterator r18 = r13.c.values().iterator();     // Catch: Throwable -> L51
    L45:
        if (r18.hasNext() == false) goto L59;
        mm0 r19 = (mm0) r18.next();     // Catch: Throwable -> L51
        if (r19.a(r12) == false) goto L45;
        r18.remove();     // Catch: Throwable -> L51
        boolean r20 = r19.a.equals(r13.f);     // Catch: Throwable -> L51
        if (r20 == false) goto L54;
        r13.a(r19);     // Catch: Throwable -> L51
    L54:
        if (r19.e == false) goto L45;
        if (r11 == false) goto L58;
        if (r20 == false) goto L58;
        boolean r21 = r19.f;     // Catch: Throwable -> L51
    L58:
        r13.d.d(r12, r19.a);     // Catch: Throwable -> L51
        goto L45
    L59:
        r13.d(r12);     // Catch: Throwable -> L51
        monitor-exit(r13);
    L51:
        th = move-exception;
        throw th;
    L64:
        r13.e(r12);
        goto L65
    L66:
        long r22 = SystemClock.elapsedRealtime();
        if (r24.a.get(0) == false) goto L72;
        q9 r25 = (q9) r9.get(0);
        r25.getClass();
        if (r3.k == null) goto L72;
        r3.c(r25.b, r25.d);
    L72:
        if (r24.a.get(2) == false) goto L106;
        if (r3.k == null) goto L106;
        vw1 r26 = r0.e0().a.m(0);
    L77:
        if (r26.hasNext() == false) goto L88;
        iw4 r27 = (iw4) r26.next();
        int r28 = 0;
    L80:
        if (r28 >= r27.a) goto L77;
        if (r27.e[r28] == false) goto L86;
        ow0 r110 = r27.a(r28).r;
        if (r110 == null) goto L86;
    L89:
        if (r110 == null) goto L106;
        PlaybackMetrics.Builder r29 = r3.k;
        String r30 = f35.a;
        PlaybackMetrics.Builder r31 = fo2.h(r29);
        int r32 = 0;
    L92:
        if (r32 >= r110.q) goto L103;
        UUID r33 = r110.n[r32].o;
        if (r33.equals(ax.d) == true) goto L95;
        if (r33.equals(ax.e) == true) goto L98;
        if (r33.equals(ax.c) == true) goto L101;
        r32 = r32 + 1;
        goto L92
    L101:
        int r34 = 6;
    L104:
        fo2.o(r31, r34);
        goto L106
    L98:
        r34 = 2;
        goto L104
    L95:
        r34 = 3;
        goto L104
    L103:
        r34 = 1;
    L86:
        r28 = r28 + 1;
        goto L80
    L88:
        r110 = null;
    L106:
        if (r24.a.get(1011) == false) goto L108;
        r3.A++;
    L108:
        PlaybackException r35 = r3.o;
        if (r35 != null) goto L111;
        int r111 = 1;
        int r36 = 27;
        int r112 = 13;
        int r113 = 6;
        int r114 = 8;
        int r115 = 7;
        int r116 = 9;
    L254:
        if (r24.a.get(2) == false) goto L260;
        jw4 r37 = r0.e0();
        boolean r38 = r37.a(2);
        boolean r117 = r37.a(r111);
        boolean r39 = r37.a(3);
        if (r38 == true) goto L261;
        if (r117 == true) goto L261;
        if (r39 == false) goto L260;
    L261:
        if (r38 == true) goto L270;
        tb1 r40 = null;
        if (Objects.equals(r3.s, null) == false) goto L266;
    L271:
        int r118 = 10;
    L272:
        if (r117 == false) goto L274;
    L281:
        if (r39 == false) goto L283;
    L290:
        ?? r41 = r40;
    L292:
        if (r3.a(r3.p) == false) goto L306;
        ue1 r42 = r3.p;
        tb1 r43 = (tb1) r42.p;
        if (r43.v == (-1)) goto L306;
        int r44 = r42.o;
        if (Objects.equals(r3.s, r43) == false) goto L299;
    L304:
        r3.p = r41;
        goto L306
    L299:
        if (r3.s != null) goto L302;
        if (r44 != 0) goto L302;
        int r45 = 1;
    L303:
        r3.s = r43;
        r3.e(1, r22, r43, r45);
    L302:
        r45 = r44;
    L306:
        if (r3.a(r3.q) == false) goto L318;
        ue1 r46 = r3.q;
        tb1 r47 = (tb1) r46.p;
        int r48 = r46.o;
        if (Objects.equals(r3.t, r47) == false) goto L311;
    L316:
        r3.q = r41;
        goto L318
    L311:
        if (r3.t != null) goto L314;
        if (r48 != 0) goto L314;
        int r49 = 1;
    L315:
        r3.t = r47;
        r3.e(0, r22, r47, r49);
    L314:
        r49 = r48;
    L318:
        if (r3.a(r3.r) == false) goto L330;
        ue1 r50 = r3.r;
        tb1 r51 = (tb1) r50.p;
        int r52 = r50.o;
        if (Objects.equals(r3.u, r51) == false) goto L323;
    L328:
        r3.r = r41;
        goto L330
    L323:
        if (r3.u != null) goto L326;
        if (r52 != 0) goto L326;
        int r53 = 1;
    L327:
        r3.u = r51;
        r3.e(2, r22, r51, r53);
    L326:
        r53 = r52;
    L330:
        switch(v53.a(r3.a).b()) {
            case 0: goto L340;
            case 1: goto L339;
            case 2: goto L338;
            case 3: goto L337;
            case 4: goto L336;
            case 5: goto L335;
            case 6: goto L331;
            case 7: goto L334;
            case 8: goto L331;
            case 9: goto L333;
            case 10: goto L332;
            default: goto L331;
        };
    L331:
        int r54 = 1;
    L342:
        if (r54 == r3.n) goto L345;
        r3.n = r54;
        r3.b.execute(new ws1(24, r3, hd0.i(hd0.h(hd0.g(go2.e(), r54), r22 - r3.e))));
    L345:
        if (r0.g() == 2) goto L348;
        r3.v = false;
    L348:
        if (r0.U() != null) goto L351;
        r3.x = false;
    L353:
        int r55 = r0.g();
        if (r3.v == false) goto L358;
        r118 = 5;
    L356:
        boolean r119 = true;
    L393:
        if (r3.m == r118) goto L396;
        r3.m = r118;
        r3.B = r119;
        r3.b.execute(new ws1(r36, r3, fo2.m(fo2.l(fo2.k(hd0.k(), r3.m), r22 - r3.e))));
    L396:
        if (r24.a.get(1028) == false) goto L417;
        nm0 r56 = r3.c;
        q9 r1 = (q9) r9.get(1028);
        r1.getClass();
        monitor-enter(r56);
        String r57 = r56.f;     // Catch: Throwable -> L402
        if (r57 == null) goto L404;
        mm0 r58 = (mm0) r56.c.get(r57);     // Catch: Throwable -> L402
        r58.getClass();     // Catch: Throwable -> L402
        r56.a(r58);     // Catch: Throwable -> L402
    L404:
        Iterator r59 = r56.c.values().iterator();     // Catch: Throwable -> L402
    L405:
        if (r59.hasNext() == false) goto L413;
        mm0 r60 = (mm0) r59.next();     // Catch: Throwable -> L402
        r59.remove();     // Catch: Throwable -> L402
        if (r60.e == false) goto L405;
        ho2 r61 = r56.d;     // Catch: Throwable -> L402
        if (r61 == null) goto L405;
        r61.d(r1, r60.a);     // Catch: Throwable -> L402
        goto L405
    L413:
        monitor-exit(r56);
        return;
    L402:
        th = move-exception;
        throw th;
    L417:
        return;
    L358:
        if (r3.x == false) goto L361;
        r118 = r112;
        goto L356
    L361:
        if (r55 != 4) goto L363;
        r118 = 11;
        goto L356
    L363:
        int r62 = 2;
        if (r55 != 2) goto L378;
        int r63 = r3.m;
        if (r63 == 0) goto L377;
        if (r63 == 2) goto L377;
        if (r63 == 12) goto L377;
        if (r0.q() == true) goto L374;
        r118 = r115;
        goto L356
    L374:
        if (r0.v0() != 0) goto L356;
        r118 = r113;
    L377:
        r118 = r62;
        goto L356
    L378:
        r62 = 3;
        if (r55 == 3) goto L381;
        r119 = true;
        if (r55 == 1) goto L389;
    L391:
        r118 = r3.m;
        goto L393
    L389:
        if (r3.m == 0) goto L391;
        r118 = 12;
        goto L393
    L381:
        if (r0.q() == true) goto L384;
        r118 = 4;
        goto L356
    L384:
        if (r0.v0() == 0) goto L377;
        r118 = r116;
        goto L356
    L351:
        if (r24.a.get(r118) == false) goto L353;
        r3.x = true;
        goto L353
    L332:
        r54 = r115;
        goto L342
    L333:
        r54 = r114;
        goto L342
    L334:
        r54 = 3;
        goto L342
    L335:
        r54 = r113;
        goto L342
    L336:
        r54 = 5;
        goto L342
    L337:
        r54 = 4;
        goto L342
    L338:
        r54 = 2;
        goto L342
    L339:
        r54 = r116;
        goto L342
    L340:
        r54 = 0;
        goto L342
    L283:
        if (Objects.equals(r3.u, r40) == true) goto L290;
        if (r3.u != null) goto L288;
        int r64 = 1;
    L289:
        r3.u = r40;
        r3.e(2, r22, r40, r64);
        goto L290
    L288:
        r64 = 0;
        goto L289
    L274:
        if (Objects.equals(r3.t, r40) == true) goto L281;
        if (r3.t != null) goto L279;
        int r65 = 1;
    L280:
        r3.t = r40;
        r3.e(0, r22, r40, r65);
        goto L281
    L279:
        r65 = 0;
        goto L280
    L266:
        if (r3.s != null) goto L268;
        int r66 = 1;
    L269:
        r3.s = null;
        r112 = r112;
        r118 = 10;
        r3.e(1, r22, null, r66);
        goto L272
    L268:
        r66 = 0;
        goto L269
    L270:
        r40 = null;
    L260:
        r112 = r112;
        r41 = 0;
        r118 = 10;
        r36 = r36;
        goto L292
    L111:
        int r67 = r35.n;
        Context r120 = r3.a;
        if (r3.w != 4) goto L114;
        boolean r68 = true;
    L116:
        if (r67 != 1001) goto L121;
        n50 r69 = new n50(20, 0);
    L118:
        r36 = 27;
    L119:
        r112 = 13;
        r113 = 6;
        r114 = 8;
        r115 = 7;
        r116 = 9;
    L252:
        r3.b.execute(new ws1(25, r3, fo2.f(fo2.e(fo2.u(fo2.c(fo2.d(go2.f(), r22 - r3.e), r69.a), r69.b), r35))));
        r111 = 1;
        r3.B = true;
        r3.o = null;
        goto L254
    L121:
        if ((r35 instanceof ExoPlaybackException) == false) goto L127;
        ExoPlaybackException r121 = (ExoPlaybackException) r35;
        if (r121.w != 1) goto L125;
        boolean r122 = true;
    L126:
        int r123 = r121.A;
    L128:
        Throwable r124 = r35.getCause();
        r124.getClass();
        if ((r124 instanceof IOException) == true) goto L131;
        r36 = 27;
        r113 = 6;
        r114 = 8;
        r115 = 7;
        r116 = 9;
        if (r122 == false) goto L217;
        if (r123 != 0) goto L214;
    L215:
        n50 r70 = new n50(35, 0);
    L216:
        r69 = r70;
    L204:
        r112 = 13;
        goto L252
    L214:
        if (r123 == 1) goto L215;
    L217:
        if (r122 == true) goto L219;
    L221:
        if (r122 == false) goto L226;
        if (r123 != 2) goto L226;
        r70 = new n50(23, 0);
    L226:
        if ((r124 instanceof MediaCodecRenderer$DecoderInitializationException) == false) goto L228;
        r112 = 13;
        r69 = new n50(13, f35.z(((MediaCodecRenderer$DecoderInitializationException) r124).q));
        goto L252
    L228:
        r112 = 13;
        if ((r124 instanceof MediaCodecDecoderException) == false) goto L233;
        n50 r125 = new n50(14, ((MediaCodecDecoderException) r124).n);
    L231:
        r69 = r125;
        goto L252
    L233:
        if ((r124 instanceof OutOfMemoryError) == false) goto L236;
        r69 = new n50(14, 0);
        goto L252
    L236:
        if ((r124 instanceof AudioSink$InitializationException) == false) goto L239;
        r69 = new n50(17, 0);
        goto L252
    L239:
        if ((r124 instanceof AudioSink$WriteException) == false) goto L242;
        r69 = new n50(18, ((AudioSink$WriteException) r124).n);
        goto L252
    L242:
        if ((r124 instanceof MediaCodec.CryptoException) == false) goto L251;
        int r71 = ((MediaCodec.CryptoException) r124).getErrorCode();
        switch(f35.y(r71)) {
            case 6002: goto L249;
            case 6003: goto L248;
            case 6004: goto L247;
            case 6005: goto L246;
            default: goto L245;
        };
    L245:
        int r72 = 27;
    L250:
        r125 = new n50(r72, r71);
        goto L231
    L246:
        r72 = 26;
        goto L250
    L247:
        r72 = 25;
        goto L250
    L248:
        r72 = 28;
        goto L250
    L249:
        r72 = 24;
        goto L250
    L251:
        r69 = new n50(22, 0);
        goto L252
    L219:
        if (r123 != 3) goto L221;
        r70 = new n50(15, 0);
        goto L216
    L131:
        if ((r124 instanceof HttpDataSource$InvalidResponseCodeException) == false) goto L134;
        r69 = new n50(5, ((HttpDataSource$InvalidResponseCodeException) r124).p);
        goto L118
    L134:
        if ((r124 instanceof HttpDataSource$InvalidContentTypeException) == false) goto L136;
    L137:
        r36 = 27;
        int r126 = 9;
        int r127 = 7;
        r113 = 6;
        if (r68 == false) goto L208;
        int r73 = 10;
    L209:
        r114 = 8;
        r69 = new n50(r73, 0);
    L203:
        r116 = r126;
        r115 = r127;
        goto L204
    L208:
        r73 = 11;
        goto L209
    L136:
        if ((r124 instanceof ParserException) == true) goto L137;
        boolean r74 = r124 instanceof HttpDataSource$HttpDataSourceException;
        if (r74 == false) goto L141;
    L142:
        r36 = 27;
        r126 = 9;
        if (v53.a(r120).b() != 1) goto L190;
        r69 = new n50(3, 0);
    L185:
        r116 = r126;
        r112 = 13;
        r113 = 6;
    L186:
        r114 = 8;
        r115 = 7;
        goto L252
    L190:
        Throwable r75 = r124.getCause();
        if ((r75 instanceof UnknownHostException) == false) goto L193;
        r113 = 6;
        r69 = new n50(6, 0);
        r116 = 9;
        r112 = 13;
        goto L186
    L193:
        r113 = 6;
        if ((r75 instanceof SocketTimeoutException) == false) goto L197;
        r127 = 7;
        r69 = new n50(7, 0);
    L196:
        r116 = 9;
        r115 = r127;
        r112 = 13;
        r114 = 8;
        goto L252
    L197:
        r127 = 7;
        if (r74 == true) goto L200;
    L202:
        r69 = new n50(8, 0);
        r114 = 8;
        goto L203
    L200:
        if (((HttpDataSource$HttpDataSourceException) r124).o != 1) goto L202;
        r69 = new n50(4, 0);
        goto L196
    L141:
        if ((r124 instanceof UdpDataSource$UdpDataSourceException) == true) goto L142;
        if (r67 != 1002) goto L147;
        r69 = new n50(21, 0);
        goto L118
    L147:
        if ((r124 instanceof DrmSession$DrmSessionException) == false) goto L174;
        Throwable r76 = r124.getCause();
        r76.getClass();
        if ((r76 instanceof MediaDrm.MediaDrmStateException) == false) goto L159;
        int r77 = f35.z(((MediaDrm.MediaDrmStateException) r76).getDiagnosticInfo());
        switch(f35.y(r77)) {
            case 6002: goto L156;
            case 6003: goto L155;
            case 6004: goto L154;
            case 6005: goto L153;
            default: goto L152;
        };
    L152:
        int r78 = 27;
    L157:
        r69 = new n50(r78, r77);
        goto L118
    L153:
        r78 = 26;
        goto L157
    L154:
        r78 = 25;
        goto L157
    L155:
        r78 = 28;
        goto L157
    L156:
        r78 = 24;
        goto L157
    L159:
        if ((r76 instanceof MediaDrmResetException) == false) goto L161;
        r36 = 27;
        r69 = new n50(27, 0);
        goto L119
    L161:
        r36 = 27;
        if ((r76 instanceof NotProvisionedException) == false) goto L165;
        r69 = new n50(24, 0);
        goto L119
    L165:
        if ((r76 instanceof DeniedByServerException) == false) goto L168;
        r69 = new n50(29, 0);
        goto L119
    L168:
        if ((r76 instanceof UnsupportedDrmException) == false) goto L171;
        r69 = new n50(23, 0);
        goto L119
    L171:
        if ((r76 instanceof DefaultDrmSessionManager$MissingSchemeDataException) == false) goto L173;
        r69 = new n50(28, 0);
        goto L119
    L173:
        r69 = new n50(30, 0);
        goto L119
    L174:
        r36 = 27;
        if ((r124 instanceof FileDataSource$FileDataSourceException) == true) goto L177;
    L184:
        r126 = 9;
        r69 = new n50(9, 0);
        goto L185
    L177:
        if ((r124.getCause() instanceof FileNotFoundException) == false) goto L184;
        Throwable r79 = r124.getCause();
        r79.getClass();
        Throwable r80 = r79.getCause();
        if ((r80 instanceof ErrnoException) == true) goto L181;
    L183:
        r69 = new n50(31, 0);
        goto L119
    L181:
        if (((ErrnoException) r80).errno != OsConstants.EACCES) goto L183;
        r69 = new n50(32, 0);
        goto L119
    L125:
        r122 = false;
        goto L126
    L127:
        r122 = false;
        r123 = 0;
        goto L128
    L114:
        r68 = false;
        goto L116
    }

    @Override // defpackage.bp3
    public boolean g(Preference r6, Object r7) {
        h62 r8 = (h62) this.o;
        EditTextPreference r5 = (EditTextPreference) this.p;
        String r9 = qm4.K0(r7.toString()).toString();
        if (r9.length() != 0) goto L6;
    L7:
        r8.s0(R.string.lan_name_required);
    L17:
        return false;
    L6:
        if (r9.length() > 40) goto L7;
        boolean r0 = LanReceiverService.y;
        Context r1 = r8.t0;
        if (r1 == null) goto L18;
        r1.getSharedPreferences("lan-playback", 0).edit().putString("name", r9).apply();
        r5.E(r9);
        r5.x(r9);
        if (LanReceiverService.y == false) goto L17;
        Context r10 = r8.t0;
        if (r10 == null) goto L15;
        Toast.makeText(r10, R.string.lan_name_saved, 1).show();
        goto L17
    L15:
        h12.Q("app");
        throw null;
    L18:
        h12.Q("app");
        throw null;
    }

    @Override // defpackage.it2
    public Object h(tn2 r3, fr2 r4, int r5) {
        int r0 = this.n;
        Object r1 = this.p;
        Object r2 = this.o;
        switch(r0) {
            case 24: goto L14;
            case 25: goto L4;
            case 26: goto L11;
            case 27: goto L4;
            case 28: goto L10;
            default: goto L4;
        };
    L4:
        it2 r6 = (it2) r2;
        zr2 r7 = (zr2) r1;
        if (r3.l() == false) goto L8;
        return new mw1(new ab4(-100));
    L8:
        return f35.h0((ic2) r6.h(r3, r4, r5), new eg0(r3, r4, r7, 8));
    L11:
        pq r8 = r3.e;
        kn2 r9 = r3.k;
        fr2 r10 = r3.B(r4);
        return r8.e(r9, r10, (String) r2, (lu3) r1);
    L10:
        return r3.y(r4, (String) r2, (jn2) r1);
    L14:
        return r3.q(r4, (va4) r2, (Bundle) r1);
    }

    @Override // defpackage.gz0
    public void i(EditText r3) {
        EditTextPreference r0 = (EditTextPreference) this.o;
        String r2 = (String) this.p;
        r3.getClass();
        r3.setInputType(17);
        r3.setSingleLine();
        if (r0.h0 != null) goto L5;
        r3.setText(r2);
    L5:
        r3.setSelection(r3.getText().length());
    }

    @Override // defpackage.qc2
    public void invoke(Object r7) {
        int r0 = this.n;
        Object r1 = this.p;
        Object r6 = this.o;
        switch(r0) {
            case 2: goto L8;
            case 15: goto L6;
            default: goto L4;
        };
    L4:
        gn2 r8 = ((lk3) ((ml3) r6).a).s();
        ((oi3) r7).t(((Integer) r1).intValue(), r8);
        return;
    L6:
        oi3 r9 = (oi3) r7;
        int r2 = ((Integer) r1).intValue();
        r9.t(r2, (gn2) r6);
        return;
    L8:
        q9 r10 = (q9) r6;
        un2 r3 = (un2) r1;
        ho2 r11 = (ho2) r7;
        r11.getClass();
        mt2 r4 = r10.d;
        if (r4 == null) goto L26;
        tb1 r5 = r3.c;
        r5.getClass();
        int r12 = r3.d;
        nm0 r13 = r11.c;
        cu4 r14 = r10.b;
        r4.getClass();
        String r15 = r13.c(r14, r4);
        ue1 r16 = new ue1(r12, 6, r5, r15);
        int r17 = r3.b;
        if (r17 != 0) goto L14;
    L22:
        r11.p = r16;
        return;
    L14:
        if (r17 != 1) goto L16;
        r11.q = r16;
        return;
    L16:
        if (r17 == 2) goto L22;
        if (r17 != 3) goto L27;
        r11.r = r16;
        return;
    L27:
        return;
    }

    @Override // defpackage.cp3
    public void j(Preference r5) {
        int r6 = this.n;
        int r0 = 1;
        Object r1 = this.p;
        Object r4 = this.o;
        switch(r6) {
            case 4: goto L19;
            case 5: goto L4;
            case 6: goto L17;
            default: goto L4;
        };
    L4:
        h62 r7 = (h62) r4;
        NsdServiceInfo r8 = ((c62) r1).a;
        if (r7.N0 == false) goto L7;
        return;
    L7:
        if (r7.O0 == true) goto L24;
        r7.N0 = true;
        r7.s0(R.string.lan_connecting);
        long r2 = r7.M0;
        NsdManager r3 = r7.u0;     // Catch: Exception -> L15
        if (r3 == null) goto L13;
        r3.resolveService(r8, new f62(r7, r2, r8));     // Catch: Exception -> L15
        return;
    L13:
        h12.Q("nsd");     // Catch: Exception -> L15
        throw null;     // Catch: Exception -> L15
    L15:
        r7.N0 = false;
        r7.s0(R.string.lan_connection_error);
        return;
    L24:
        return;
    L17:
        ((h62) r4).r0((h52) r1);
        return;
    L19:
        Preference r9 = (Preference) r4;
        vb4 r10 = (vb4) r1;
        r9.x(r10.s(R.string.homemusic_settings_traffic_hint));
        io1.a.execute(new ts1(r10, r9, r0));
    }

    @Override // defpackage.py
    public Object k(oy r6) {
        Executor r0 = (Executor) this.o;
        uy1 r5 = (uy1) this.p;
        AtomicBoolean r1 = new AtomicBoolean(false);
        jc2 r3 = new jc2(r1, 0);
        n04 r2 = r6.c;
        if (r2 == null) goto L5;
        r2.f(r3, fq0.n);
    L5:
        r0.execute(new v6(r1, r6, r5, 24));
        return "setForegroundAsync";
    }

    @Override // defpackage.fz
    public void onCancel() {
        Animator r0 = (Animator) this.o;
        pj4 r2 = (pj4) this.p;
        r0.end();
        if (ld1.I(2) == false) goto L6;
        Log.v("FragmentManager", "Animator from operation " + r2 + " has been canceled.");
        return;
    }

    public /* synthetic */ ef0(int r1, Object r2, Object r3) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
    }
}
