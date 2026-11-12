package defpackage;

import android.app.Application;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.eddyizm.tempus.model.Chronology;
import com.eddyizm.tempus.model.Download;
import com.eddyizm.tempus.model.LyricsCache;
import com.eddyizm.tempus.model.Queue;
import com.eddyizm.tempus.subsonic.models.Playlist;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lg1 implements Runnable {
    public final /* synthetic */ int n;
    public Object o;
    public Object p;

    public lg1(i61 r2) {
        this.n = 12;
        this.p = new ArrayList();
        this.o = r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int r2 = 6;
        int r3 = 2;
        dd5 r4 = null;
        int r5 = 1;
        byte r6 = 0;
        int r7 = 0;
        int r8 = 0;
        switch(this.n) {
            case 0: goto L245;
            case 1: goto L226;
            case 2: goto L224;
            case 3: goto L222;
            case 4: goto L204;
            case 5: goto L165;
            case 6: goto L161;
            case 7: goto L159;
            case 8: goto L157;
            case 9: goto L149;
            case 10: goto L147;
            case 11: goto L145;
            case 12: goto L143;
            case 13: goto L141;
            case 14: goto L131;
            case 15: goto L129;
            case 16: goto L109;
            case 17: goto L95;
            case 18: goto L93;
            case 19: goto L83;
            case 20: goto L79;
            case 21: goto L77;
            case 22: goto L75;
            case 23: goto L73;
            case 24: goto L71;
            case 25: goto L69;
            case 26: goto L64;
            case 27: goto L261;
            case 28: goto L22;
            default: goto L4;
        };
    L4:
        ka0 r0 = (ka0) this.o;
        nq r1 = (nq) this.p;
        me r9 = (me) r1.o;
        gf5 r10 = (gf5) ((ij1) r1.s).w.get((ve) r1.p);
        if (r10 != null) goto L8;
        return;
    L8:
        if (r0.o != 0) goto L20;
        r1.n = true;
        if (r9.i0() == true) goto L12;
        r9.j0(null, r9.Z());     // Catch: SecurityException -> L18
        return;
    L18:
        e = move-exception;
        Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
        r9.a0("Failed to get service from broker.");
        r10.l(new ka0(10), null);
        return;
    L12:
        if (r1.n == false) goto L303;
        eu1 r11 = (eu1) r1.q;
        if (r11 == null) goto L304;
        r9.j0(r11, (Set) r1.r);
        return;
    L304:
        return;
    L303:
        return;
    L20:
        r10.l(r0, null);
        return;
    L22:
        pq3 r12 = ((wp4) this.p).n.f;
        String r13 = (String) this.o;
        Object r14 = r12.k;
        monitor-enter(r14);
        td5 r15 = r12.c(r13);     // Catch: Throwable -> L29
        if (r15 == null) goto L31;
        r4 = r15.a;     // Catch: Throwable -> L29
        monitor-exit(r14);     // Catch: Throwable -> L29
    L32:
        if (r4 != null) goto L34;
        return;
    L34:
        if (r4.c() == false) goto L309;
        Object r16 = ((wp4) this.p).p;
        monitor-enter(r16);
        ((wp4) this.p).s.put(q05.m(r4), r4);     // Catch: Throwable -> L40
        wp4 r17 = (wp4) this.p;     // Catch: Throwable -> L40
        ((wp4) this.p).t.put(q05.m(r4), lc5.a(r17.u, r4, (pe0) r17.o.o, r17));     // Catch: Throwable -> L40
        monitor-exit(r16);     // Catch: Throwable -> L40
        return;
    L40:
        th = move-exception;
        throw th;
    L309:
        return;
    L31:
        monitor-exit(r14);     // Catch: Throwable -> L29
    L29:
        th = move-exception;
        throw th;
    L64:
        boolean r18 = xa3.u("sort_search_chronologically", false);
        jv3 r19 = (jv3) this.o;
        if (r18 == false) goto L67;
        this.p = (List) xl.E((s24) r19.n, true, false, new ms3(r3));
        return;
    L67:
        this.p = (List) xl.E((s24) r19.n, true, false, new ms3(r5));
        return;
    L69:
        ((cz) this.p).E((y21) this.o);
        return;
    L71:
        ((ua1) this.o).accept(this.p);
        return;
    L73:
        this.p = ((ns3) this.o).c();
        return;
    L75:
        ns3 r20 = (ns3) this.o;
        this.p = (Queue) xl.E((s24) r20.o, true, false, new ks3(r20, r6));
        return;
    L77:
        ml3 r21 = (ml3) this.o;
        xl.E((s24) r21.a, false, true, new hl3(r21, (Playlist) this.p, r6));
        return;
    L79:
        IBinder r22 = ((Messenger) ((hg3) this.o).o).getBinder();
        oj2 r23 = (oj2) ((pn2) ((pz1) this.p).o).r.remove(r22);
        if (r23 == null) goto L312;
        r22.unlinkToDeath(r23, 0);
        return;
    L312:
        return;
    L83:
        bq4 r24 = (bq4) this.p;
        pr2 r25 = (pr2) this.o;
        ArrayList r26 = (ArrayList) r24.n;
        if (r26.isEmpty() == true) goto L91;
        qu1 r27 = r25.a();
        if (r27 == null) goto L90;
        int r28 = r26.size();
    L88:
        if (r7 >= r28) goto L90;
        Object r29 = r26.get(r7);
        r7 = r7 + 1;
        ((Bundle) r29).putBinder("extra_session_binder", r27.asBinder());
    L90:
        r26.clear();
    L91:
        qj2 r30 = (qj2) r24.o;
        r30.getClass();
        r30.setSessionToken(r25.o);
        return;
    L93:
        rf2 r31 = (rf2) this.o;
        xl.E((s24) r31.n, false, true, new o(18, r31, (LyricsCache) this.p));
        return;
    L95:
        la2 r32 = (la2) this.p;
        pe0 r33 = r32.q;
    L270:
        ((Runnable) this.o).run();     // Catch: Throwable -> L98
    L100:
        Runnable r34 = r32.a0();
        if (r34 == null) goto L313;
        this.o = r34;
        r8 = r8 + 1;
        if (r8 < 16) goto L270;
        if (r33.Y(r32) == false) goto L270;
        r33.W(r32, this);
        return;
    L313:
        return;
    L98:
        th = move-exception;
        uc5.s(q01.n, th);
        goto L100
    L109:
        b22 r35 = (b22) this.o;
        cx3 r36 = r35.e;
        f22 r37 = (f22) this.p;
        RecyclerView r38 = r37.r;
        if (r38 != null) goto L112;
        return;
    L112:
        if (r38.F == true) goto L114;
        return;
    L114:
        if (r35.k == false) goto L116;
        return;
    L116:
        if (r36.b() == (-1)) goto L317;
        jw3 r39 = r37.r.getItemAnimator();
        if (r39 != null) goto L120;
    L121:
        ArrayList r40 = r37.p;
        int r41 = r40.size();
    L122:
        if (r6 >= r41) goto L127;
        if (((b22) r40.get(r6)).l == false) goto L125;
        r6 = r6 + 1;
    L125:
        r37.r.post(this);
        return;
    L127:
        r37.m.i(r36);
        return;
    L120:
        if (r39.f() == true) goto L125;
    L317:
        return;
    L129:
        ((cz) this.o).E((fl1) this.p);
        return;
    L131:
        ki1 r42 = (ki1) this.p;
        if (r42.d == false) goto L268;
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
    L268:
        ((Runnable) this.o).run();     // Catch: Throwable -> L136
        return;
    L136:
        th = move-exception;
        r42.c.getClass();
        if (Log.isLoggable("GlideExecutor", 6) == false) goto L319;
        Log.e("GlideExecutor", "Request threw uncaught throwable", th);
        return;
    L319:
        return;
    L141:
        ll1 r43 = ll1.a();
        r43.getClass();
        e35.m();
        r43.d.set(true);
        ((i71) this.p).o.o = true;
        View r44 = ((i71) this.p).n;
        r44.getViewTreeObserver().removeOnDrawListener((i71) this.o);
        ((i71) this.p).o.n.clear();
        return;
    L143:
        this.p = (List) xl.E((s24) ((i61) this.o).o, true, false, new k2(17, r6));
        return;
    L145:
        ss0 r45 = (ss0) this.o;
        xl.E((s24) r45.n, false, true, new o(5, r45, (Download) this.p));
        return;
    L147:
        ss0 r46 = (ss0) this.o;
        this.p = (List) xl.E((s24) r46.n, true, false, new os0(r46, r6));
        return;
    L149:
        ss0 r47 = (ss0) this.o;
        ArrayList r48 = (ArrayList) this.p;
        r47.getClass();
        StringBuilder r49 = new StringBuilder("DELETE FROM download WHERE id IN (");
        int r50 = r48.size();
        int r51 = 0;
    L150:
        if (r51 >= r50) goto L155;
        r49.append("?");
        if (r51 >= (r50 - 1)) goto L154;
        r49.append(",");
    L154:
        r51 = r51 + 1;
        goto L150
    L155:
        r49.append(")");
        xl.E((s24) r47.n, false, true, new o(r2, r49.toString(), r48));
        return;
    L157:
        cx r52 = cx.f();
        String r53 = do0.e;
        StringBuilder r54 = new StringBuilder("Scheduling work ");
        dd5 r55 = (dd5) this.o;
        r54.append(r55.a);
        r52.b(r53, r54.toString());
        ((do0) this.p).a.e(new dd5[]{r55});
        return;
    L159:
        r20 r56 = (r20) this.o;
        xl.E((s24) r56.o, false, true, new o(4, r56, (Chronology) this.p));
        return;
    L161:
        c05 r57 = (c05) this.o;
        Typeface r58 = (Typeface) this.p;
        au0 r59 = (au0) r57.n;
        if (r59 == null) goto L321;
        r59.N(r58);
        return;
    L321:
        return;
    L165:
        nk r60 = (nk) this.p;
        pk r61 = r60.r;
        if (r61.g != r60.p) goto L322;
        List r62 = r60.o;
        xp0 r63 = (xp0) this.o;
        Runnable r64 = r60.q;
        r61.e = r62;
        r61.f = Collections.unmodifiableList(r62);
        hg3 r65 = r61.a;
        int[] r66 = r63.b;
        ArrayList r67 = r63.a;
        int r110 = r63.e;
        zg5 r111 = r63.d;
        qr r112 = new qr(r65);
        ArrayDeque r68 = new ArrayDeque();
        int r113 = r63.f;
        int r114 = r67.size() - 1;
        int r115 = r113;
        int r116 = r110;
    L168:
        if (r114 < 0) goto L202;
        wp0 r69 = (wp0) r67.get(r114);
        int r70 = r69.a;
        int r117 = r5;
        int r71 = r69.c;
        int r72 = r70 + r71;
        int r73 = r69.b;
        int r74 = r73 + r71;
    L170:
        if (r116 <= r72) goto L182;
        r116 = r116 - 1;
        int r118 = r66[r116];
        if ((r118 & 12) == 0) goto L180;
        int r119 = r70;
        int r75 = r118 >> 4;
        int r210 = r72;
        int[] r211 = r66;
        yp0 r76 = xp0.a(r68, r75, false);
        if (r76 == null) goto L179;
        int r77 = (r110 - r76.b) - 1;
        r112.a(r116, r77);
        if ((r118 & 4) == 0) goto L181;
        r111.s(r116, r75);
        r112.y(r77, r117, null);
    L181:
        r70 = r119;
        r72 = r210;
        r66 = r211;
        r117 = 1;
        goto L170
    L179:
        boolean r78 = r117;
        r68.add(new yp0(r116, (r110 - r116) - (r78 ? 1 : 0), r78));
        goto L181
    L180:
        r119 = r70;
        r210 = r72;
        r211 = r66;
        r112.r(r116, r117);
        r110 = r110 - 1;
        goto L181
    L182:
        int r120 = r70;
        int[] r212 = r66;
    L183:
        if (r115 <= r74) goto L194;
        r115 = r115 - 1;
        int r79 = r63.c[r115];
        if ((r79 & 12) == 0) goto L192;
        int r80 = r79 >> 4;
        xp0 r121 = r63;
        yp0 r81 = xp0.a(r68, r80, true);
        if (r81 != null) goto L189;
        r68.add(new yp0(r115, r110 - r116, false));
    L193:
        r63 = r121;
        goto L183
    L189:
        r112.a((r110 - r81.b) - 1, r116);
        if ((r79 & 4) == 0) goto L193;
        r111.s(r80, r115);
        r112.y(r116, 1, null);
        goto L193
    L192:
        r121 = r63;
        r112.k(r116, 1);
        r110 = r110 + 1;
        goto L193
    L194:
        xp0 r122 = r63;
        int r82 = r73;
        int r83 = r120;
        int r84 = 0;
    L195:
        if (r84 >= r71) goto L201;
        if ((r212[r83] & 15) != 2) goto L200;
        r111.s(r83, r82);
        r112.y(r83, 1, null);
    L200:
        r83 = r83 + 1;
        r82 = r82 + 1;
        r84 = r84 + 1;
        goto L195
    L201:
        r114 = r114 - 1;
        r115 = r73;
        r5 = 1;
        r63 = r122;
        r116 = r120;
        r66 = r212;
        goto L168
    L202:
        r112.b();
        r61.a(r64);
        return;
    L322:
        return;
    L204:
        Object r85 = this.p;
        Object r86 = this.o;
        Method r87 = n5.d;     // Catch: Throwable -> L210 RuntimeException -> L212
        if (r87 == null) goto L208;
        r87.invoke(r86, new Object[]{r85, Boolean.FALSE, "AppCompat recreation"});     // Catch: Throwable -> L210 RuntimeException -> L212
    L272:
        return;
    L208:
        n5.e.invoke(r86, new Object[]{r85, Boolean.FALSE});     // Catch: Throwable -> L210 RuntimeException -> L212
    L212:
        e = move-exception;
        if (e.getClass() == RuntimeException.class) goto L216;
        return;
    L216:
        if (e.getMessage() != null) goto L218;
        return;
    L218:
        if (e.getMessage().startsWith("Unable to stop") == false) goto L326;
        throw e;
    L326:
        return;
    L210:
        th = move-exception;
        Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
        return;
    L222:
        ((Application) this.o).unregisterActivityLifecycleCallbacks((m5) this.p);
        return;
    L224:
        ((m5) this.o).n = this.p;
        return;
    L226:
        t4 r88 = (t4) this.o;
        y4 r89 = (y4) this.p;
        qu2 r90 = r89.p;
        if (r90 == null) goto L231;
        ou2 r91 = r90.e;
        if (r91 == null) goto L231;
        r91.y(r90);
    L231:
        View r92 = (View) r89.u;
        if (r92 == null) goto L243;
        if (r92.getWindowToken() == null) goto L243;
        if (r88.b() == false) goto L239;
    L242:
        r89.G = r88;
        goto L243
    L239:
        if (r88.e == null) goto L243;
        r88.d(0, 0, false, false);
    L243:
        r89.I = null;
        return;
    L245:
        kg1 r93 = (kg1) this.p;
        Future r94 = (Future) this.o;
        if ((r94 instanceof u0) == false) goto L275;
        Throwable r95 = ((u0) r94).o();
        if (r95 == null) goto L275;
        r93.o(r95);
        return;
    L275:
        r93.h(hw.j(r94));
        return;
    L254:
        e = move-exception;
        r93.o(e.getCause());
        return;
    L252:
        th = move-exception;
        r93.o(th);
        return;
    L261:
        ((Runnable) this.p).run();     // Catch: Throwable -> L55
        Object r96 = ((ia4) this.o).r;
        monitor-enter(r96);
        ((ia4) this.o).a();     // Catch: Throwable -> L52
        monitor-exit(r96);     // Catch: Throwable -> L52
        return;
    L52:
        th = move-exception;
        throw th;
    L55:
        th = move-exception;
        monitor-enter(((ia4) this.o).r);
        ((ia4) this.o).a();     // Catch: Throwable -> L61
        throw th;
    L61:
        th = move-exception;
        throw th;
    }

    public String toString() {
        switch(this.n) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        c12 r0 = new c12(lg1.class.getSimpleName());
        kg1 r3 = (kg1) this.p;
        rm3 r1 = new rm3();
        ((rm3) r0.q).o = r1;
        r0.q = r1;
        r1.n = r3;
        return r0.toString();
    L5:
        return super.toString();
    }

    public /* synthetic */ lg1(int r1, Object r2, Object r3) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
    }

    public /* synthetic */ lg1(Object r1, Object r2, boolean r3, int r4) {
        this.n = r4;
        this.p = r1;
        this.o = r2;
    }

    public /* synthetic */ lg1(int r1, Object r2) {
        this.n = r1;
        this.o = r2;
    }

    public lg1(jv3 r2) {
        this.n = 26;
        this.p = new ArrayList();
        this.o = r2;
    }

    public lg1(f22 r1, b22 r2, int r3) {
        this.n = 16;
        this.p = r1;
        this.o = r2;
    }
}
