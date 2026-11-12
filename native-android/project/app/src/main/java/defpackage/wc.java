package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.homemusic.HubException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wc implements gf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ wc(uo r1, long r2) {
        this.n = 0;
        this.o = r1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gf1
    public final Object invoke() {
        long r7 = -9187201950435737472L;
        char r9 = 7;
        int r10 = 2;
        boolean r11 = true;
        String r12 = null;
        Context r13 = null;
        r13 = null;
        int r14 = 0;
        switch(this.n) {
            case 0: goto L260;
            case 1: goto L210;
            case 2: goto L179;
            case 3: goto L178;
            case 4: goto L175;
            case 5: goto L167;
            case 6: goto L160;
            case 7: goto L159;
            case 8: goto L156;
            case 9: goto L147;
            case 10: goto L142;
            case 11: goto L135;
            case 12: goto L134;
            case 13: goto L124;
            case 14: goto L123;
            case 15: goto L121;
            case 16: goto L119;
            case 17: goto L116;
            case 18: goto L109;
            case 19: goto L104;
            case 20: goto L97;
            case 21: goto L96;
            case 22: goto L93;
            case 23: goto L92;
            case 24: goto L83;
            case 25: goto L81;
            case 26: goto L38;
            case 27: goto L8;
            case 28: goto L7;
            default: goto L4;
        };
    L4:
        ys4 r0 = (ys4) this.o;
        r0.L = null;
        fu.C(r0);
        g12.A(r0);
        jz4.z(r0);
        return Boolean.TRUE;
    L8:
        o72 r1 = ((kn4) this.o).a();
        c72 r2 = r1.n;
        if (r1.A == ((c13) r2.o()).n.p) goto L37;
        w03 r3 = r1.s;
        Object[] r15 = r3.c;
        long[] r4 = r3.a;
        int r16 = r4.length - 2;
        if (r16 < 0) goto L29;
        int r17 = 0;
    L13:
        long r5 = r4[r17];
        if (((((~r5) << 7) & r5) & r7) == r7) goto L25;
        int r6 = 8 - ((~(r17 - r16)) >>> 31);
        int r8 = 0;
    L16:
        if (r8 >= r6) goto L22;
        if ((r5 & 255) >= 128) goto L21;
        ((h72) r15[(r17 << 3) + r8]).d = true;
    L21:
        r5 = r5 >> 8;
        r8 = r8 + 1;
        r7 = r7;
        goto L16
    L22:
        long r20 = r7;
        if (r6 != 8) goto L29;
    L26:
        if (r17 == r16) goto L29;
        r17 = r17 + 1;
        r7 = r20;
        goto L13
    L25:
        r20 = r7;
    L29:
        if (r2.u == null) goto L34;
        if (r2.R.e == true) goto L37;
        c72.U(r2, false, 7);
        goto L37
    L34:
        if (r2.q() == true) goto L37;
        c72.W(r2, false, 7);
    L37:
        return j15.a;
    L38:
        long r18 = 128;
        pp3 r19 = (pp3) this.o;
    L39:
        Object r21 = r19.h;
        monitor-enter(r21);
    L68:
        th = move-exception;
        throw th;
    L42:
        if (r19.a == true) goto L72;
        r19.a = r11;     // Catch: Throwable -> L68
        f13 r22 = (f13) r19.g;     // Catch: Throwable -> L64
        Object[] r23 = r22.n;     // Catch: Throwable -> L64
        int r24 = r22.p;     // Catch: Throwable -> L64
        int r25 = r14;
    L45:
        if (r25 >= r24) goto L66;
        sh4 r26 = (sh4) r23[r25];     // Catch: Throwable -> L64
        x03 r27 = r26.g;     // Catch: Throwable -> L64
        if1 r28 = r26.a;     // Catch: Throwable -> L64
        Object[] r29 = r27.b;     // Catch: Throwable -> L64
        long[] r110 = r27.a;     // Catch: Throwable -> L64
        int r111 = r110.length - r10;     // Catch: Throwable -> L64
        char r112 = r9;
        if (r111 < 0) goto L61;
        int r30 = r14;
    L49:
        long r113 = r110[r30];     // Catch: Throwable -> L64
        int r210 = r111;
        if (((((~r113) << r112) & r113) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L58;
        int r114 = 8 - ((~(r30 - r210)) >>> 31);     // Catch: Throwable -> L64
        int r115 = 0;
    L52:
        if (r115 >= r114) goto L57;
        if ((r113 & 255) >= r18) goto L56;
        r28.invoke(r29[(r30 << 3) + r115]);     // Catch: Throwable -> L64
    L56:
        r113 = r113 >> 8;     // Catch: Throwable -> L64
        r115 = r115 + 1;     // Catch: Throwable -> L64
        r18 = 128;
        goto L52
    L57:
        if (r114 != 8) goto L61;
    L58:
        r111 = r210;
        if (r30 == r111) goto L61;
        r30 = r30 + 1;     // Catch: Throwable -> L64
        r18 = 128;
    L61:
        r27.b();     // Catch: Throwable -> L64
        r25 = r25 + 1;
        r9 = r112;
        r10 = 2;
        r14 = 0;
        r18 = 128;
        goto L45
    L66:
        char r116 = r9;
        r19.a = r14;     // Catch: Throwable -> L68
    L73:
        monitor-exit(r21);
        if (r19.a() == false) goto L77;
        r9 = r116;
        r10 = 2;
        r11 = true;
        r14 = 0;
        r18 = 128;
        goto L39
    L77:
        return j15.a;
    L64:
        th = move-exception;
        r19.a = false;     // Catch: Throwable -> L68
        throw th;     // Catch: Throwable -> L68
    L72:
        r116 = r9;
        goto L73
    L81:
        rx1 r31 = (rx1) this.o;
        String r32 = r31.e();
        s24 r33 = (s24) r31.a;
        r33.getClass();
        r33.a();
        r33.b();
        return r33.j().z().j(r32);
    L83:
        wb4 r34 = (wb4) this.o;
        zd3 r35 = r34.p;
        if (((qf4) r35.getValue()).a != 9205357640488583168L) goto L87;
        return null;
    L87:
        if (qf4.b(((qf4) r35.getValue()).a) == true) goto L293;
        pv r36 = r34.n;
        long r37 = ((qf4) r35.getValue()).a;
        return r36.w;
    L293:
        return null;
    L93:
        j54 r38 = (j54) this.o;
        r38.h().a(new vv3(0, r38));
        return j15.a;
    L97:
        gp3 r39 = ((a54) this.o).p;
        if (r39 == null) goto L294;
        Bundle r40 = fh0.g((kd3[]) Arrays.copyOf(new kd3[0], 0));
        r39.t(r40);
        if (r40.isEmpty() == false) goto L103;
        return null;
    L103:
        return r40;
    L294:
        return null;
    L104:
        t44 r41 = (t44) this.o;
        m54 r42 = r41.n;
        Object r43 = r41.q;
        if (r43 != null) goto L296;
        kf2.n("Value should be initialized");
        return null;
    L296:
        return r42.h(r41, r43);
    L109:
        yv3 r44 = (yv3) this.o;
        r44.i = null;
        Trace.beginSection("OnPositionedDispatch");
        r44.a();     // Catch: Throwable -> L113
        Trace.endSection();
        return j15.a;
    L113:
        th = move-exception;
        Trace.endSection();
        throw th;
    L116:
        ((hk3) this.o).l0(true);
        return j15.a;
    L124:
        wf2 r45 = (wf2) ((ha2) this.o).a.o;
        if (r45.o == true) goto L132;
        if (r45.p == false) goto L130;
        po3.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
    L130:
        r45.a();
        r45.p = true;
    L132:
        return j15.a;
    L135:
        h72 r46 = (h72) this.o;
        if (((Boolean) r46.g.getValue()).booleanValue() == true) goto L141;
        z80 r47 = r46.c;
        if (r47 == null) goto L141;
        r47.l();
    L141:
        return j15.a;
    L142:
        f72 r48 = ((c72) this.o).R;
        r48.p.J = true;
        if2 r49 = r48.q;
        if (r49 == null) goto L146;
        r49.F = true;
    L146:
        return j15.a;
    L147:
        s24 r50 = ((s12) this.o).a;
        if (r50.m() == true) goto L150;
    L153:
        boolean r117 = true;
    L155:
        return Boolean.valueOf(r117);
    L150:
        if (r50.q() == true) goto L153;
        r117 = false;
        goto L155
    L156:
        Object r51 = ((View) ((pz1) this.o).o).getContext().getSystemService("input_method");
        r51.getClass();
        return (InputMethodManager) r51;
    L160:
        vb4 r52 = (vb4) this.o;
        App.b().getClass();
        SharedPreferences r53 = App.c();
        r53.getClass();
        String r54 = r53.getString("homemusic_hub_local_url", null);
        if (r54 != null) goto L163;
        r54 = "http://192.168.0.111:8080";
    L163:
        String r55 = e35.K(r54);
        if (r55 != null) goto L297;
        String r56 = r52.s(R.string.homemusic_settings_local_none);
        r56.getClass();
        return r56;
    L297:
        return r55;
    L167:
        bf1 r57 = (bf1) this.o;
        String r58 = r57.o;
        if (r58 != null) goto L170;
    L172:
        af1 r59 = new af1(r57.n, r57.o, new d34(28), r57.p, r57.r);
    L173:
        r59.setWriteAheadLoggingEnabled(r57.t);
        return r59;
    L170:
        if (r57.q == false) goto L172;
        Context r60 = r57.n;
        r60.getClass();
        File r61 = r60.getNoBackupFilesDir();
        r61.getClass();
        r59 = new af1(r57.n, new File(r61, r58).getAbsolutePath(), new d34(28), r57.p, r57.r);
        goto L173
    L175:
        ((ba1) this.o).s0();
        return j15.a;
    L179:
        h80 r62 = (h80) this.o;
        boolean r63 = n02.a(0, 0);
        View r64 = r62.a;
        if (r63 == false) goto L209;
        Context r65 = r64.getContext();
        Context r66 = r65;
    L183:
        if ((r66 instanceof ContextWrapper) == false) goto L198;
        if ((r66 instanceof Activity) == true) goto L186;
        if ((r66 instanceof InputMethodService) == true) goto L186;
        if ((r66 instanceof Application) == true) goto L186;
        ContextWrapper r67 = (ContextWrapper) r66;
        if (r67.getBaseContext() == null) goto L198;
        r66 = r67.getBaseContext();
    L186:
        r13 = r66;
    L198:
        if (r13 == null) goto L207;
        bc5.a.getClass();
        ac5 r68 = ac5.a;
        cc5 r69 = ac5.b;
        r69.getClass();
        int r70 = Build.VERSION.SDK_INT;
        if (r70 < 34) goto L203;
        dc5 r71 = qo0.o;
    L206:
        zb5 r72 = r71.e(r13, r69.b);
        int r73 = r72.a().width();
        long r74 = (((long) r72.a().height()) & 4294967295L) | (((long) r73) << 32);
        return new ap0(r74, bu.a(r13).i(l93.o0(r74)));
    L203:
        if (r70 < 30) goto L205;
        r71 = ku.o;
        goto L206
    L205:
        r71 = rv2.L;
        goto L206
    L207:
        Configuration r75 = r65.getResources().getConfiguration();
        so0 r76 = bu.a(r65);
        long r77 = l93.a(r75.screenWidthDp, r75.screenHeightDp);
        long r78 = r76.Y(r77);
        return new ap0((((long) ((int) Float.intBitsToFloat((int) (r78 & 4294967295L)))) & 4294967295L) | (((long) ((int) Float.intBitsToFloat((int) (r78 >> 32)))) << 32), r77);
    L209:
        return new ap0(0, bu.a(r64.getContext()).i(l93.o0(0)));
    L210:
        j15 r79 = j15.a;
        vz r80 = (vz) this.o;
        rr1 r81 = rr1.a;
        String r82 = r80.c;
        boolean r83 = r80.d;
        String r84 = r80.f;
        String r85 = r80.g;
        String r86 = r80.h;
        String r87 = r80.i;
        qr1 r88 = (qr1) rr1.e.get();
        if (r88 == null) goto L213;
        String r89 = r88.a;
    L214:
        o83 r90 = (o83) rr1.h.getValue();
        nz3 r118 = new nz3();
        r118.d(r89.concat("/healthz"));
        oz3 r91 = new oz3(r118);
        r90.getClass();
        k14 r92 = new bv3(r90, r91).c();
    L220:
        th = move-exception;
        throw th;     // Catch: Throwable -> L256
    L256:
        th = move-exception;
        q05.h(r92, th);
        throw th;
    L216:
        if (r92.C == false) goto L254;
        n14 r93 = r92.t;     // Catch: Throwable -> L220
        if (r93 == null) goto L222;
        r12 = r93.string();     // Catch: Throwable -> L220
    L222:
        if (r12 != null) goto L224;
        r12 = "";
    L224:
        f32 r94 = (f32) e35.N(r12).a().n.get("capabilities");     // Catch: Throwable -> L220
        if (r94 != 0) goto L227;
    L236:
        boolean r119 = false;
    L237:
        r92.close();
        if (r119 == false) goto L252;
        if (r83 == false) goto L241;
        kd3 r95 = new kd3("/api/downloads", lg2.X(new kd3[]{new kd3("track_refs", gb.O(r82)), new kd3("star", Boolean.TRUE), new kd3("favorite_event_id", r84), new kd3("favorite_ts", r85), new kd3("favorite_client", r86), new kd3("favorite_context", r87)}));
    L242:
        String r96 = (String) r95.n;
        Map r97 = (Map) r95.o;
        sz3 r98 = tz3.Companion;
        String r99 = rr1.c.j(r97);
        r99.getClass();
        hu2 r100 = rr1.b;
        r98.getClass();
        we5 r101 = sz3.b(r99, r100);
        rr1 r102 = rr1.a;     // Catch: IOException -> L245
        rr1.d(new pr1(r96, r101, 0), new or1(2));     // Catch: IOException -> L245
    L249:
        return r79;
    L245:
        e = move-exception;
        if ((e instanceof HubException) == true) goto L250;
        rr1 r103 = rr1.a;
        rr1.d(new pr1(r96, r101, 0), new or1(2));
        goto L249
    L250:
        throw e;
    L241:
        r95 = new kd3("/api/star", lg2.X(new kd3[]{new kd3("refs", gb.O(r82)), new kd3("unstar", Boolean.TRUE), new kd3("event_id", r84), new kd3("ts", r85), new kd3("client", r86), new kd3("context", r87)}));
        goto L242
    L252:
        throw new HubException(426, "Обновите Хаб для изменения понравившихся треков каталога");
    L227:
        if ((r94 instanceof Collection) == true) goto L229;
    L231:
        ArrayList r104 = r94.n;     // Catch: Throwable -> L220
        int r120 = r104.size();     // Catch: Throwable -> L220
        int r121 = 0;
    L232:
        if (r121 >= r120) goto L236;
        Object r122 = r104.get(r121);     // Catch: Throwable -> L220
        r121 = r121 + 1;     // Catch: Throwable -> L220
        if (h12.c(((h32) r122).b(), "catalog_favorite_download_v1") == false) goto L232;
        r119 = true;
        goto L237
    L229:
        if (((Collection) r94).isEmpty() == false) goto L231;
    L254:
        throw rr1.i(r92);     // Catch: Throwable -> L220
    L213:
        r89 = rr1.c();
        goto L214
    L7:
        return new BaseInputConnection(((js4) this.o).a, false);
    L92:
        return this.o;
    L96:
        return e54.c((f75) this.o);
    L119:
        return new y83((a93) this.o);
    L121:
        return ((e53) this.o).q0();
    L123:
        return (we0) ((na4) this.o).q;
    L134:
        return (nc3) ((gf1) ((b13) this.o).getValue()).invoke();
    L159:
        return Float.valueOf(j51.v(((we0) this.o).e()));
    L178:
        return ((rf2) this.o).b(":memory:");
    L260:
        return ((pv) ((uo) this.o)).w;
    }

    public /* synthetic */ wc(int r1, Object r2) {
        this.n = r1;
        this.o = r2;
    }
}
