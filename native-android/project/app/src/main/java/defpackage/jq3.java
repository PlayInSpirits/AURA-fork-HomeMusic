package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.Log;
import android.view.Surface;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.database.AppDatabase;
import com.eddyizm.tempus.database.AppDatabase_Impl;
import com.eddyizm.tempus.model.InternetRadioStationCache;
import com.eddyizm.tempus.service.MediaService;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jq3 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ jq3(hh3 r1, k03 r2) {
        this.n = 2;
        this.o = r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        Context r2 = null;
        Object[] r3 = 0;
        boolean r4 = true;
        int r5 = 0;
        Object r9 = this.o;
        switch(r0) {
            case 0: goto L141;
            case 1: goto L139;
            case 2: goto L135;
            case 3: goto L126;
            case 4: goto L74;
            case 5: goto L65;
            case 6: goto L63;
            case 7: goto L54;
            case 8: goto L30;
            case 9: goto L21;
            case 10: goto L8;
            case 11: goto L6;
            default: goto L4;
        };
    L4:
        j55 r10 = (j55) r9;
        i55.b(r10.n, r10);
        return;
    L6:
        int[] r1 = SwipeRefreshLayout.a0;
        ((SwipeRefreshLayout) r9).l();
        return;
    L8:
        sj4 r11 = (sj4) r9;
        Surface r6 = r11.u;
        if (r6 == null) goto L14;
        Iterator r7 = r11.n.iterator();
    L12:
        if (r7.hasNext() == false) goto L14;
        ((d41) r7.next()).n.t1(null);
    L14:
        SurfaceTexture r8 = r11.t;
        if (r8 == null) goto L17;
        r8.release();
    L17:
        if (r6 == null) goto L19;
        r6.release();
    L19:
        r11.t = null;
        r11.u = null;
        return;
    L21:
        ni4 r12 = (ni4) ((o7) r9).b;
        Iterator r13 = r12.z.iterator();
    L23:
        if (r13.hasNext() == false) goto L29;
        int r14 = ((Integer) r13.next()).intValue();
        if (r14 < 0) goto L23;
        if (r14 >= r12.v.f.size()) goto L23;
        r12.e(r14, "payload_playback");
        goto L23
    L29:
        return;
    L30:
        yf4 r15 = (yf4) r9;
        boolean r16 = r15.f;
        if (r16 == false) goto L176;
        boolean r17 = r15.g;
        if (r17 == false) goto L36;
        return;
    L36:
        if (r16 == false) goto L40;
        if (r17 == true) goto L40;
        long r18 = Math.max(0, r15.e - System.currentTimeMillis());
    L42:
        if (r18 > 0) goto L49;
        r15.f = false;
        r15.b = null;
        yf4.b();
        vj3 r19 = r15.h;
        if (r19 == null) goto L46;
        r19.a.x0();
    L46:
        zh0 r20 = r15.i;
        if (r20 == null) goto L177;
        yf4 r21 = yf4.c();
        r21.c = false;
        r21.a.post(new pb0(r21, ((MediaService) r20.o).p().a(), new float[]{1.0f}, 6));
        return;
    L177:
        return;
    L49:
        vj3 r22 = r15.h;
        if (r22 == null) goto L52;
        r22.a.x0();
    L52:
        jq3 r23 = new jq3(8, r15);
        r15.b = r23;
        r15.a.postDelayed(r23, 1000);
        return;
    L40:
        r18 = 0;
        goto L42
    L176:
        return;
    L54:
        bk r24 = (bk) r9;
        r24.p = false;
        SideSheetBehavior r25 = (SideSheetBehavior) r24.r;
        o65 r26 = r25.v;
        if (r26 == null) goto L60;
        if (r26.g() == false) goto L60;
        r24.c(r24.o);
        return;
    L60:
        if (r25.u != 2) goto L181;
        r25.x(r24.o);
        return;
    L181:
        return;
    L63:
        ((yk) r9).a();
        return;
    L65:
        t24 r27 = (t24) r9;
        if (r27.c <= 0) goto L68;
        Object[] r28 = true;
    L70:
        if (r27.o.compareAndSet(false, true) == false) goto L182;
        if (r28 == false) goto L183;
        fu.G(r27.l.h(), r27.r, null, new x24(r27, r3 == true ? 1 : 0, r5), 2);
        return;
    L183:
        return;
    L182:
        return;
    L68:
        r28 = false;
        goto L70
    L74:
        gn2 r29 = (gn2) r9;
        App r30 = App.b();     // Catch: Throwable -> L78
        if (r30 == null) goto L80;
        r2 = r30.getApplicationContext();     // Catch: Throwable -> L78
    L80:
        if (r2 == null) goto L82;
        boolean r31 = true;
    L83:
        rr2.v("Context must be provided if MediaSource.Factory is not set.", r31);     // Catch: Throwable -> L78
        sk0 r32 = new sk0();     // Catch: Throwable -> L78
        monitor-enter(r32);     // Catch: Throwable -> L78
        r32.b = 260;     // Catch: Throwable -> L121
        monitor-exit(r32);     // Catch: Throwable -> L78
        aw2 r33 = new aw2(new hw2(r29, new dm0(r2, r32)));     // Catch: Throwable -> L78
        tv4 r34 = (tv4) r33.b().get(20, TimeUnit.SECONDS);     // Catch: Throwable -> L109
        ArrayList r35 = new ArrayList();     // Catch: Throwable -> L109
        if (r34 == null) goto L103;
        int r36 = 0;
    L94:
        if (r36 >= r34.a) goto L103;
        sv4 r37 = r34.a(r36);     // Catch: Throwable -> L109
        int r38 = 0;
    L97:
        if (r38 >= r37.a) goto L102;
        qv2 r39 = r37.d[r38].l;     // Catch: Throwable -> L109
        if (r39 == null) goto L101;
        r35.add(r39);     // Catch: Throwable -> L109
    L101:
        r38 = r38 + 1;     // Catch: Throwable -> L109
        goto L97
    L102:
        r36 = r36 + 1;     // Catch: Throwable -> L109
    L103:
        ArrayList r40 = jz3.e(r35);     // Catch: Throwable -> L109
        if (jz3.m(r40) == 0.0f) goto L106;
    L111:
        if (r4 == false) goto L113;
        jz3.b.put(r29.a, r40);     // Catch: Throwable -> L109
    L113:
        Log.d("ReplayGainUtil", "Prefetched " + r29.a + " trackGain=" + jz3.m(r40) + " valid=" + r4);     // Catch: Throwable -> L109
        jz3.g.post(new ur2(18, r29, r40));     // Catch: Throwable -> L109
        r33.close();     // Catch: Throwable -> L78
        return;
    L106:
        if (jz3.j(r40) != 0.0f) goto L111;
        r4 = false;
    L109:
        th = move-exception;
        r33.close();     // Catch: Throwable -> L118
    L120:
        throw th;     // Catch: Throwable -> L78
    L118:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L78
        goto L120
    L121:
        th = move-exception;
        throw th;     // Catch: Throwable -> L78
    L82:
        r31 = false;
    L78:
        th = move-exception;
        Log.d("ReplayGainUtil", "Prefetch failed for " + r29.a + ": " + th);
        jz3.c.remove(r29.a);
        return;
    L126:
        AppDatabase r41 = AppDatabase.y();
        xl.E((AppDatabase_Impl) r41.z().o, false, true, new or1(27));
        List r42 = (List) ((List) r9).stream().map(new hu3(1)).collect(Collectors.toList());
        c12 r43 = r41.z();
        xl.E((AppDatabase_Impl) r43.o, false, true, new o(13, r43, r42));
        Iterator r44 = r42.iterator();
    L128:
        if (r44.hasNext() == false) goto L134;
        InternetRadioStationCache r45 = (InternetRadioStationCache) r44.next();
        if (r45.getCoverArtUrl() == null) goto L128;
        if (r45.getCoverArtUrl().isEmpty() == true) goto L128;
        xt3.b(r45.getId(), r45.getCoverArtUrl());
        goto L128
    L134:
        return;
    L135:
        k03 r46 = (k03) r9;
        List r47 = (List) ((List) xl.E((AppDatabase_Impl) AppDatabase.y().z().o, true, false, new or1(25))).stream().map(new hu3(0)).collect(Collectors.toList());
        if (r47.isEmpty() == true) goto L185;
        r47.sort(Comparator.comparing(new hu3(2), String.CASE_INSENSITIVE_ORDER));
        r46.i(r47);
        return;
    L185:
        return;
    L139:
        xl.E((s24) ((ns3) r9).o, false, true, new k52(29));
        return;
    L141:
        lq3 r48 = (lq3) r9;
        ea2 r49 = r48.s;
        if (r48.o != 0) goto L145;
        r48.p = true;
        r49.d(q92.ON_PAUSE);
    L145:
        if (r48.n == 0) goto L147;
        return;
    L147:
        if (r48.p == false) goto L187;
        r49.d(q92.ON_STOP);
        r48.q = true;
        return;
    }

    public /* synthetic */ jq3(int r1, Object r2) {
        this.n = r1;
        this.o = r2;
    }
}
