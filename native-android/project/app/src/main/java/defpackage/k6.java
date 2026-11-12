package defpackage;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioRouting;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import app.homemusic.R;
import com.eddyizm.tempus.homemusic.HubMixToday;
import com.eddyizm.tempus.model.Queue;
import com.eddyizm.tempus.service.MediaService;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import com.eddyizm.tempus.viewmodel.b;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.function.IntConsumer;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k6 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    public /* synthetic */ k6(ArrayList r1, pj4 r2, xm0 r3) {
        this.n = 20;
        this.o = r1;
        this.p = r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int r4 = -1;
        Object r5 = null;
        Queue r6 = null;
        String r7 = null;
        int r8 = 1;
        int r9 = 0;
        switch(this.n) {
            case 0: goto L249;
            case 1: goto L247;
            case 2: goto L240;
            case 3: goto L232;
            case 4: goto L230;
            case 5: goto L228;
            case 6: goto L226;
            case 7: goto L222;
            case 8: goto L212;
            case 9: goto L207;
            case 10: goto L170;
            case 11: goto L168;
            case 12: goto L166;
            case 13: goto L164;
            case 14: goto L140;
            case 15: goto L138;
            case 16: goto L129;
            case 17: goto L127;
            case 18: goto L120;
            case 19: goto L118;
            case 20: goto L114;
            case 21: goto L112;
            case 22: goto L110;
            case 23: goto L108;
            case 24: goto L59;
            case 25: goto L57;
            case 26: goto L43;
            case 27: goto L34;
            case 28: goto L12;
            default: goto L4;
        };
    L4:
        fx3 r1 = (fx3) this.o;
        String r2 = (String) this.p;
        ExecutorService r0 = ur1.a;
        if (r1.n == false) goto L252;
        ur1.d(r2);
        return;
    L252:
        String r3 = rs1.f();     // Catch: Exception -> L9
        Map.Entry r10 = (Map.Entry) q40.v0(rr1.x(r2).entrySet());     // Catch: Exception -> L9
        rr1.d(new qs0((String) r10.getKey(), (String) r10.getValue(), r3, r8), new or1(19));     // Catch: Exception -> L9
        return;
    L9:
        e = move-exception;
        Log.w("HubDislikes", "undislike " + r2 + ": " + e.getMessage());
        ur1.d(r2);
        return;
    L12:
        String r11 = (String) this.o;
        Object r12 = (bj2) ((ic2) this.p).get();     // Catch: Throwable -> L15
    L17:
        boolean r13 = r12 instanceof s14;
        Object r14 = r12;
        if (r13 == false) goto L20;
        r14 = null;
    L20:
        bj2 r15 = (bj2) r14;
        if (r15 == null) goto L277;
        gn2 r16 = r15.a();
        if (r16 == null) goto L27;
        r7 = r16.a;
    L27:
        if (h12.c(r7, r11) == true) goto L30;
        return;
    L30:
        if (r15.f0() == false) goto L32;
        r15.c0();
        return;
    L32:
        r15.c();
        return;
    L277:
        return;
    L15:
        th = move-exception;
        r12 = new s14(th);
        goto L17
    L34:
        cp1 r17 = (cp1) this.o;
        ArtistID3 r18 = (ArtistID3) this.p;
        if (r17.l0 != null) goto L37;
        return;
    L37:
        if (r17.y() == false) goto L281;
        FrameLayout r19 = (FrameLayout) r17.m0.R.c;
        int[] r20 = qg4.E;
        qg4 r21 = qg4.h(r19, r19.getResources().getText(R.string.artist_adapter_radio_station_starting), 0);
        r21.e(r17.m0.u());
        r21.j();
        if (r17.F0 == null) goto L280;
        b r22 = r17.n0;
        le1 r23 = r17.v();
        k03 r24 = r22.z;
        r24.k(Collections.EMPTY_LIST);
        pa r25 = r22.e;
        String r26 = r18.getName();
        r25.getClass();
        pa.z(10, r26).e(r23, new g7(r24, r9));
        r24.e(r17.v(), new xo1(r17, 21));
        return;
    L280:
        return;
    L281:
        return;
    L43:
        cp1 r27 = (cp1) this.o;
        View r28 = (View) this.p;
        Object r29 = (HubMixToday) rr1.d(new or1(r9), new or1(r8));     // Catch: Throwable -> L46
    L48:
        Throwable r30 = bb3.a(r29);
        if (r30 == null) goto L52;
        Log.w("HomeMixCards", "mix: " + r30.getMessage());
    L52:
        if ((r29 instanceof s14) == true) goto L55;
        r5 = r29;
    L55:
        io1.b.post(new v6(r27, (HubMixToday) r5, r28, 13));
        return;
    L46:
        th = move-exception;
        r29 = new s14(th);
        goto L48
    L57:
        ln1 r31 = (ln1) this.o;
        nm1 r32 = (nm1) this.p;
        om1 r33 = r31.p;
        ((zk0) ((pm1) r33.o).o.q.get(r32.m)).d(true);
        return;
    L59:
        i41 r34 = (i41) this.o;
        n41 r35 = (n41) this.p;
        int r36 = r34.K - r35.b;
        r34.K = r36;
        if (r35.e == false) goto L62;
        r34.L = r35.c;
        r34.M = true;
    L62:
        if (r36 != 0) goto L282;
        cu4 r37 = ((ph3) r35.f).a;
        if (r34.p0.a.p() == true) goto L69;
        if (r37.p() == false) goto L69;
        r34.q0 = -1;
        r34.r0 = 0;
    L69:
        if (r37.p() == true) goto L78;
        List r38 = Arrays.asList(((tm3) r37).k);
        if (r38.size() != r34.q.size()) goto L73;
        boolean r39 = true;
    L74:
        rr2.w(r39);
        int r40 = 0;
    L76:
        if (r40 >= r38.size()) goto L78;
        ((f41) r34.q.get(r40)).c = (cu4) r38.get(r40);
        r40 = r40 + 1;
        goto L76
    L73:
        r39 = false;
    L78:
        long r41 = -9223372036854775807L;
        if (r34.M == true) goto L81;
        int r110 = -1;
        boolean r111 = 0;
    L104:
        long r112 = r41;
        r34.M = false;
        r34.x1((ph3) r35.f, 1, r111, r34.L, r112, r110, false);
        return;
    L81:
        if (((ph3) r35.f).a.p() == true) goto L83;
    L85:
        boolean r42 = false;
    L86:
        boolean r43 = ((ph3) r35.f).b.equals(r34.p0.b);
        if (((ph3) r35.f).d != r34.p0.s) goto L89;
        boolean r44 = true;
    L90:
        if (r42 == true) goto L94;
        if (r43 == false) goto L95;
        if (r44 == true) goto L94;
    L95:
        if (r8 == 0) goto L103;
        r4 = r34.o0();
        if (r37.p() == false) goto L99;
    L102:
        r41 = ((ph3) r35.f).d;
        goto L103
    L99:
        if (((ph3) r35.f).b.b() == true) goto L102;
        ph3 r45 = (ph3) r35.f;
        mt2 r46 = r45.b;
        long r47 = r45.d;
        Object r48 = r46.a;
        zt4 r49 = r34.p;
        r37.g(r48, r49);
        r41 = r47 + r49.e;
    L103:
        r110 = r4;
        r111 = r8;
    L94:
        r8 = 0;
        goto L95
    L89:
        r44 = false;
        goto L90
    L83:
        if (r34.p0.a.p() == false) goto L85;
        r42 = true;
        goto L86
    L282:
        return;
    L108:
        ((IntConsumer) this.o).accept(((List) this.p).size());
        return;
    L110:
        vt0.a((vt0) this.p, ((ut0) this.o).b.l);
        return;
    L112:
        gp3 r50 = (gp3) this.o;
        ((tn0) r50.p).h.a((s55) this.p);
        return;
    L114:
        ArrayList r51 = (ArrayList) this.o;
        pj4 r52 = (pj4) this.p;
        if (r51.contains(r52) == false) goto L283;
        r51.remove(r52);
        View r53 = r52.c.T;
        int r54 = r52.a;
        r53.getClass();
        f34.a(r53, r54);
        return;
    L283:
        return;
    L118:
        zk0 r55 = (zk0) this.o;
        Uri r56 = (Uri) this.p;
        r55.v = false;
        r55.e(r56);
        return;
    L120:
        jk0 r57 = (jk0) this.o;
        tb1 r58 = (tb1) this.p;
        kk0 r59 = r57.q;
        if (r59.p != 0) goto L123;
        return;
    L123:
        if (r57.p == true) goto L285;
        Looper r60 = r59.t;
        r60.getClass();
        r57.o = r59.g(r60, r57.n, r58, false);
        r59.n.add(r57);
        return;
    L285:
        return;
    L127:
        ye4 r61 = (ye4) this.o;
        String r62 = (String) this.p;
        TextInputLayout r63 = r61.n;
        SimpleDateFormat r64 = r61.p;
        Context r65 = r63.getContext();
        r63.setError(r65.getString(R.string.mtrl_picker_invalid_format) + "\n" + String.format(r65.getString(R.string.mtrl_picker_invalid_format_use), new Object[]{r62.replace(' ', 160)}) + "\n" + String.format(r65.getString(R.string.mtrl_picker_invalid_format_example), new Object[]{r64.format(new Date(a35.d().getTimeInMillis())).replace(' ', 160)}));
        ze4 r66 = r61.x;
        r61.w.getError();
        r66.getClass();
        r61.v.a();
        return;
    L129:
        List r67 = (List) this.o;
        xb0 r68 = (xb0) this.p;
        Iterator r69 = r67.iterator();
    L131:
        if (r69.hasNext() == false) goto L137;
        hp r70 = (hp) r69.next();
        Object r71 = r68.e;
        ip r72 = r70.a;
        if (r72.e(r71) == false) goto L135;
        Object r73 = new sc0(r72.d());
    L136:
        rq3 r74 = r70.b;
        r74.getClass();
        r74.d(r73);
        goto L131
    L135:
        r73 = rc0.a;
        goto L136
    L137:
        return;
    L138:
        nc1 r75 = (nc1) this.o;
        r75.n.a(new d70(r9, (a93) this.p, r75));
        return;
    L140:
        String r76 = (String) this.o;
        vz r77 = (vz) this.p;
        b00 r78 = b00.a;
        kd3 r79 = b00.b();
        if (r79 == null) goto L143;
        String r80 = (String) r79.n;
    L145:
        if (h12.c(r80, r76) == false) goto L163;
        monitor-enter(r78);
        a00 r81 = (a00) b00.f.remove(r77.f);     // Catch: Throwable -> L160
        monitor-exit(r78);
        if (r81 == null) goto L151;
        n61.a(r81.c);
    L151:
        boolean r82 = n61.f(1, "hub:".concat(r77.c), r77.e);
        if (r77.d == false) goto L157;
        if (r82 == false) goto L157;
        Map r83 = lg2.X(new kd3[]{new kd3("ref", r77.c), new kd3("star", Boolean.TRUE)});
        nk1 r84 = rr1.c;
        WebView r85 = hw.g;
        if (r85 == null) goto L157;
        r85.evaluateJavascript(f34.h("window.dispatchEvent(new CustomEvent(", r84.j("hm:hub-download"), ", {detail: ", r84.j(r83), "}));"), null);
    L157:
        Map r86 = lg2.X(new kd3[]{new kd3("ref", r77.c), new kd3("star", Boolean.valueOf(r82))});
        nk1 r87 = rr1.c;
        WebView r88 = hw.g;
        if (r88 == null) goto L286;
        r88.evaluateJavascript(f34.h("window.dispatchEvent(new CustomEvent(", r87.j("hm:hub-favorite"), ", {detail: ", r87.j(r86), "}));"), null);
        return;
    L286:
        return;
    L160:
        th = move-exception;
        throw th;
    L163:
        return;
    L143:
        r80 = null;
        goto L145
    L164:
        sc5 r89 = (sc5) this.o;
        String r90 = ((UUID) this.p).toString();
        r90.getClass();
        wr1.h(r89, r90);
        return;
    L166:
        au r91 = (au) this.o;
        vf2 r92 = (vf2) this.p;
        r91.g = null;
        r92.getClass();
        r91.d(vf2.c());
        return;
    L168:
        ((pq) this.o).f((kn2) this.p, false);
        return;
    L170:
        MediaService r93 = (MediaService) this.o;
        qi3 r113 = (qi3) this.p;
    L172:
        if (ra0.b() == false) goto L177;
        if (r93.D == true) goto L291;
        Thread.sleep(25);
        goto L172
    L291:
        return;
    L177:
        String r114 = ud3.u();
        vs3 r94 = new vs3();
        List r95 = r94.b();
        if (r95 != null) goto L180;
        return;
    L180:
        if (r95.isEmpty() == true) goto L289;
        ArrayList r115 = gi1.M(r95);
        if (r115.isEmpty() == true) goto L290;
        r6 = r94.a();     // Catch: Exception -> L251
    L186:
        hx3 r116 = new hx3();
        ix3 r117 = new ix3();
        if (r6 == null) goto L205;
        String r96 = r6.getId();
    L190:
        if (r9 >= r115.size()) goto L195;
        if (((gn2) r115.get(r9)).a.equals(r96) == true) goto L193;
        r9 = r9 + 1;
        goto L190
    L193:
        r4 = r9;
    L195:
        if (r4 < 0) goto L205;
        r116.n = r4;
        WeakReference r97 = bo2.a;
        String r98 = r6.getId();
        r98.getClass();
        sp3 r99 = (sp3) ud3.A().get(r98);
        if (r99 == null) goto L199;
        long r100 = r99.b;
    L201:
        if (r100 != 0) goto L204;
        r100 = Math.max(0, r6.getPlayingChanged());
    L204:
        r117.n = r100;
        goto L205
    L199:
        r100 = 0;
    L205:
        r93.B.post(new up(r93, r113, r114, r115, r116, r117, 0));
        return;
    L290:
        return;
    L289:
        return;
    L207:
        c6 r101 = (c6) this.o;
        Object r102 = ((ij0) this.p).mo77apply(r101.f);
        r101.f = r102;
        wo r103 = new wo(r101, r102, r8);
        yp4 r104 = (yp4) r101.c;
        if (r104.a.getLooper().getThread().isAlive() == false) goto L292;
        r104.d(r103);
        return;
    L292:
        return;
    L212:
        bq4 r105 = (bq4) this.o;
        AudioDeviceInfo r106 = (AudioDeviceInfo) this.p;
        if (((wm) r105.q) == null) goto L294;
        ql r107 = ((dn) ((zh0) r105.o).o).h;
        if (r107 != null) goto L218;
        return;
    L218:
        if (r106.equals(r107.h) == true) goto L295;
        r107.h = r106;
        r107.a(nl.b(r107.a, r107.i, r106));
        return;
    L295:
        return;
    L294:
        return;
    L222:
        bq4 r108 = (bq4) this.o;
        AudioDeviceInfo r109 = ((AudioRouting) this.p).getRoutedDevice();
        if (r109 == null) goto L296;
        ((Handler) r108.p).post(new k6(8, r108, r109));
        return;
    L296:
        return;
    L226:
        xc5 r118 = (xc5) this.o;
        h40 r119 = (h40) this.p;
        qm r120 = (qm) r118.p;
        String r121 = f35.a;
        r120.K(r119);
        return;
    L228:
        xc5 r122 = (xc5) this.o;
        String r123 = (String) this.p;
        qm r124 = (qm) r122.p;
        String r125 = f35.a;
        r124.q(r123);
        return;
    L230:
        Context r126 = (Context) this.o;
        q90 r127 = (q90) this.p;
        xl.a = (AudioManager) r126.getSystemService("audio");
        r127.d();
        return;
    L232:
        yk r128 = (yk) this.o;
        ws1 r129 = (ws1) this.p;
        ((ck2) r128.s).j();
        cl r130 = (cl) r128.r;
        Object r131 = r130.a;
        monitor-enter(r131);
        r130.b();     // Catch: Throwable -> L237
        r129.run();     // Catch: Throwable -> L237
        monitor-exit(r131);     // Catch: Throwable -> L237
        return;
    L237:
        th = move-exception;
        throw th;
    L240:
        ia4 r132 = (ia4) this.o;
        ((Runnable) this.p).run();     // Catch: Throwable -> L244
        r132.a();
        return;
    L244:
        th = move-exception;
        r132.a();
        throw th;
    L247:
        uo.p((lb) this.o, (LongSparseArray) this.p);
        return;
    L249:
        ((g60) this.o).q((rw1) this.p);
    }

    public /* synthetic */ k6(int r1, Object r2, Object r3) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
    }
}
