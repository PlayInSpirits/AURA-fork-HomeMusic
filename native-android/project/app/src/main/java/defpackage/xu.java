package defpackage;

import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.internal.http2.ConnectionShutdownException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xu implements r02 {
    public final /* synthetic */ int a;
    public final Object b;

    public xu(be0 r2) {
        this.a = 0;
        r2.getClass();
        this.b = r2;
    }

    public static int d(k14 r1, int r2) {
        String r3 = r1.s.a("Retry-After");
        if (r3 != null) goto L5;
        r3 = null;
    L5:
        if (r3 != null) goto L7;
        return r2;
    L7:
        Pattern r4 = Pattern.compile("\\d+");
        r4.getClass();
        if (r4.matcher(r3).matches() == false) goto L11;
        Integer r5 = Integer.valueOf(r3);
        r5.getClass();
        return r5.intValue();
    L11:
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.r02
    public final k14 a(ev3 r45) {
        switch(this.a) {
            case 0: goto L357;
            case 1: goto L96;
            case 2: goto L85;
            default: goto L4;
        };
    L4:
        oz3 r0 = r45.e;
        bv3 r7 = r45.a;
        List r9 = u01.n;
        k14 r10 = null;
        int r11 = 0;
        oz3 r8 = r0;
    L5:
        boolean r1 = true;
    L6:
        r8.getClass();
        if (r7.w != null) goto L83;
        monitor-enter(r7);
    L77:
        th = move-exception;
        throw th;
    L10:
        if (r7.y == true) goto L80;
        if (r7.x == true) goto L76;
        monitor-exit(r7);
        if (r1 == false) goto L441;
        o83 r2 = r7.n;
        gr4 r13 = r2.D;
        dv3 r14 = r7.p;
        int r15 = r2.y;
        int r12 = r2.z;
        int r6 = r45.f;
        int r3 = r45.g;
        boolean r4 = r2.e;
        boolean r5 = r2.f;
        gr1 r16 = r8.a;
        r16.getClass();
        if (r16.f() == false) goto L22;
        SSLSocketFactory r17 = r2.p;
        if (r17 == null) goto L20;
        m83 r18 = r2.t;
        o00 r33 = r2.u;
        SSLSocketFactory r31 = r17;
        m83 r32 = r18;
    L23:
        gv3 r19 = new gv3(r13, r14, r15, r12, r6, r3, r4, r5, new f6(r16.d, r16.e, r2.l, r2.o, r31, r32, r33, r2.n, r2.s, r2.r, r2.m), r7.n.C, new hy(r7, r7.p.a, r45));
        o83 r20 = r7.n;
        if (r20.f == false) goto L26;
        s21 r21 = new lr0(r19, r20.D);
    L27:
        r7.t = r21;
        goto L441
    L26:
        r21 = new om1(23, r19);
        goto L27
    L20:
        kf2.o("CLEARTEXT-only client");
    L21:
        return null;
    L22:
        r31 = null;
        r32 = null;
        r33 = null;
    L441:
    L34:
        th = move-exception;
        r7.d(true);
        throw th;
    L29:
        if (r7.A == true) goto L72;
    L31:
        j14 r22 = r45.b(r8).f();     // Catch: Throwable -> L34
        r22.a = r8;     // Catch: Throwable -> L34
        if (r10 == null) goto L36;
        k14 r23 = xl.M(r10);     // Catch: Throwable -> L34
    L37:
        r22.j = r23;     // Catch: Throwable -> L34
        r10 = r22.a();     // Catch: Throwable -> L34
        y10 r24 = r7.w;     // Catch: Throwable -> L34
        r8 = b(r10, r24);     // Catch: Throwable -> L34
        if (r8 == null) goto L39;
        boolean r25 = false;
        tz3 r26 = r8.d;     // Catch: Throwable -> L34
        if (r26 != null) goto L53;
    L55:
        xe5.b(r10.t);     // Catch: Throwable -> L34
        r11 = r11 + 1;
        if (r11 > 20) goto L60;
        r7.d(true);
        goto L5
    L60:
        throw new ProtocolException("Too many follow-up requests: " + r11);     // Catch: Throwable -> L34
    L53:
        if (r26.isOneShot() == false) goto L55;
    L48:
        r7.d(r25);
        return r10;
    L39:
        if (r24 != null) goto L41;
    L45:
        r25 = false;
        goto L48
    L41:
        if (r24.b == false) goto L45;
        if (r7.v == true) goto L47;
        r7.v = true;     // Catch: Throwable -> L34
        r7.q.i();     // Catch: Throwable -> L34
        goto L45
    L47:
        throw new IllegalStateException("Check failed.");     // Catch: Throwable -> L34
    L36:
        r23 = null;
    L61:
        e = move-exception;
        if (c(e, r7, r8, !(e instanceof ConnectionShutdownException)) == false) goto L64;
        r9 = q40.F0(e, r9);     // Catch: Throwable -> L34
        r7.d(true);
        r1 = false;
        goto L6
    L64:
        Iterator r27 = r9.iterator();     // Catch: Throwable -> L34
    L66:
        if (r27.hasNext() == false) goto L68;
        j51.d(e, (Exception) r27.next());     // Catch: Throwable -> L34
        goto L66
    L68:
        throw e;     // Catch: Throwable -> L34
    L72:
        throw new IOException("Canceled");     // Catch: Throwable -> L34
    L76:
        throw new IllegalStateException("Check failed.");     // Catch: Throwable -> L77
    L80:
        throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");     // Catch: Throwable -> L77
    L83:
        kf2.o("Check failed.");
        goto L21
    L85:
        oz3 r28 = r45.e;
        ArrayList r29 = (ArrayList) this.b;
        int r30 = r29.size();
        int r34 = 0;
        IOException r35 = null;
    L86:
        if (r34 >= r30) goto L92;
        int r36 = r34 + 1;
        String r37 = (String) r29.get(r34);
        nz3 r38 = r28.a();
        fr1 r39 = r28.a.g();
        r39.d(r37);
        r38.a = r39.b();
        return r45.b(new oz3(r38));
    L90:
        e = move-exception;
        StringBuilder r40 = xa3.j("Mirror ", r37, " failed: ");
        r40.append(e.getMessage());
        Log.w("RadioBrowserClient", r40.toString());
        r35 = e;
        r34 = r36;
        goto L86
    L92:
        if (r35 == null) goto L95;
        throw r35;
    L95:
        throw new IOException("All radio-browser mirrors failed");
    L96:
        hx r41 = (hx) this.b;
        if (r41 == null) goto L128;
        oz3 r42 = r45.e;
        r42.getClass();
        gr1 r43 = r42.a;
        fr0 r44 = r41.n.n(si0.D(r43));     // Catch: IOException -> L420
        if (r44 == null) goto L101;
        fx r46 = new fx((ej4) r44.p.get(0));     // Catch: IOException -> L126
        String r47 = r46.c;     // Catch: IOException -> L126
        tl1 r48 = r46.b;     // Catch: IOException -> L126
        gr1 r49 = r46.a;     // Catch: IOException -> L126
        tl1 r50 = r46.g;
        String r110 = r50.a("Content-Type");
        String r111 = r50.a("Content-Length");
        r49.getClass();
        r48.getClass();
        r47.getClass();
        nz3 r112 = new nz3();
        r112.a = r49;
        r112.c = r48.d();
        if (r47.equals("\u0000") == true) goto L107;
        String r113 = r47;
    L108:
        r112.b(r113, null);
        oz3 r114 = new oz3(r112);
        byte[] r115 = xe5.a;
        gq1 r410 = gq1.q;
        new ArrayList(20);
        pr3 r116 = r46.d;
        r116.getClass();
        int r117 = r46.e;
        String r118 = r46.f;
        r118.getClass();
        sl1 r51 = r50.d();
        ex r52 = new ex(r44, r110, r111);
        jl1 r53 = r46.h;
        long r119 = r46.i;
        long r54 = r46.j;
        if (r117 < 0) goto L125;
        tl1 r310 = r51.c();
        k14 r55 = new k14(r114, r116, r118, r117, r53, r310, r52, null, null, null, r119, r54, null, r410);
        if (r49.equals(r43) == true) goto L113;
    L124:
        xe5.b(r55.t);
        goto L101
    L113:
        if (r47.equals(r42.b) == false) goto L124;
        Set r56 = si0.U(r310);
        if ((r56 instanceof Collection) == true) goto L117;
    L119:
        Iterator r57 = r56.iterator();
    L121:
        if (r57.hasNext() == false) goto L127;
        String r58 = (String) r57.next();
        if (r48.f(r58).equals(r42.c.f(r58)) == true) goto L121;
    L127:
        k14 r120 = r55;
    L129:
        long r59 = System.currentTimeMillis();
        oz3 r60 = r45.e;
        r60.getClass();
        if (r120 == null) goto L150;
        long r61 = r120.x;
        long r121 = r120.y;
        tl1 r122 = r120.s;
        int r123 = r122.size();
        int r62 = 0;
        int r63 = -1;
        Date r124 = null;
        Date r125 = null;
        Date r126 = null;
        String r127 = null;
        String r128 = null;
        String r210 = null;
    L132:
        if (r62 >= r123) goto L149;
        String r64 = r122.b(r62);
        long r211 = r59;
        String r65 = r122.e(r62);
        if (r64.equalsIgnoreCase("Date") == false) goto L137;
        r210 = r65;
        r126 = mi0.a(r65);
    L148:
        r62 = r62 + 1;
        r59 = r211;
        goto L132
    L137:
        if (r64.equalsIgnoreCase("Expires") == false) goto L140;
        r124 = mi0.a(r65);
        goto L148
    L140:
        if (r64.equalsIgnoreCase("Last-Modified") == false) goto L143;
        r128 = r65;
        r125 = mi0.a(r65);
        goto L148
    L143:
        if (r64.equalsIgnoreCase("ETag") == false) goto L146;
        r127 = r65;
        goto L148
    L146:
        if (r64.equalsIgnoreCase("Age") == false) goto L148;
        r63 = xe5.o(-1, r65);
    L149:
        long r212 = r59;
        TimeUnit r66 = TimeUnit.SECONDS;
        int r67 = 4;
        if (r120 != null) goto L154;
        hd5 r68 = new hd5(r67, r60, null);
    L241:
        if (((oz3) r68.o) == null) goto L248;
        ix r69 = r60.f;
        if (r69 != null) goto L246;
        int r70 = ix.n;
        r69 = au0.O(r60.c);
        r60.f = r69;
    L246:
        if (r69.j == false) goto L248;
        Object r129 = null;
        r68 = new hd5(4, r129, r129);
    L248:
        oz3 r71 = (oz3) r68.o;
        k14 r72 = (k14) r68.p;
        hx r73 = (hx) this.b;
        if (r73 == null) goto L252;
        monitor-enter(r73);
        monitor-exit(r73);
    L252:
        if (r120 == null) goto L255;
        if (r72 != null) goto L255;
        xe5.b(r120.t);
    L255:
        if (r71 != null) goto L258;
        if (r72 != null) goto L258;
        fv3 r311 = xe5.e;
        gq1 r411 = gq1.q;
        ArrayList r74 = new ArrayList(20);
        oz3 r75 = r45.e;
        r75.getClass();
        return new k14(r75, pr3.q, "Unsatisfiable Request (only-if-cached)", 504, null, new tl1((String[]) r74.toArray(new String[0])), r311, null, null, null, -1, System.currentTimeMillis(), null, r411);
    L258:
        if (r71 != null) goto L444;
        r72.getClass();
        j14 r76 = r72.f();
        k14 r77 = xl.M(r72);
        xl.i("cacheResponse", r77);
        r76.i = r77;
        return r76.a();
    L444:
        k14 r78 = r45.b(r71);     // Catch: Throwable -> L353
        if (r72 != null) goto L263;
    L311:
        j14 r79 = r78.f();
        if (r72 == null) goto L314;
        k14 r130 = xl.M(r72);
    L315:
        xl.i("cacheResponse", r130);
        r79.i = r130;
        k14 r80 = xl.M(r78);
        xl.i("networkResponse", r80);
        r79.h = r80;
        k14 r81 = r79.a();
        if (((hx) this.b) == null) goto L352;
        if (br1.a(r81) == false) goto L349;
        if (kb4.I(r81, r71) == false) goto L349;
        hx r82 = (hx) this.b;
        j14 r83 = r81.f();
        r83.a = r71;
        k14 r84 = r83.a();
        r82.getClass();
        oz3 r85 = r84.n;
        String r86 = r85.b;
        if (gb.J(r86) == false) goto L326;
        r82.b(r85);     // Catch: IOException -> L418
    L424:
        goto L324
    L326:
        if (r86.equals("GET") == false) goto L324;
        if (si0.U(r84.s).contains("*") == true) goto L324;
        fx r87 = new fx(r84);
        jr0 r88 = r82.n;     // Catch: IOException -> L337
        String r89 = si0.D(r85.a);     // Catch: IOException -> L337
        ux3 r90 = jr0.G;     // Catch: IOException -> L337
        ll r131 = r88.j(r89, -1);     // Catch: IOException -> L337
        if (r131 == null) goto L324;
        r87.c(r131);     // Catch: IOException -> L417
        jw r91 = new jw();     // Catch: IOException -> L417
        r91.r = r82;     // Catch: IOException -> L417
        r91.o = r131;     // Catch: IOException -> L417
        of4 r92 = r131.i(1);     // Catch: IOException -> L417
        r91.p = r92;     // Catch: IOException -> L417
        r91.q = new gx(r82, r91, r92);     // Catch: IOException -> L417
        jw r132 = r91;
    L341:
        if (r132 == null) goto L352;
        gx r93 = (gx) r132.q;
        fw r94 = r81.t.source();
        r93.getClass();
        ox r95 = new ox(r94, r132, new wu3(r93));
        String r96 = r81.s.a("Content-Type");
        if (r96 != null) goto L346;
        String r97 = null;
    L347:
        long r98 = r81.t.contentLength();
        j14 r99 = r81.f();
        r99.g = new fv3(r97, r98, new xu3(r95), 0);
        k14 r100 = r99.a();
    L490:
        return r100;
    L346:
        r97 = r96;
    L338:
        if (r131 == null) goto L324;
        r131.a();     // Catch: IOException -> L418
    L337:
        r131 = null;
    L324:
        r132 = null;
    L349:
        if (gb.J(r71.b) == false) goto L352;
        ((hx) this.b).b(r71);     // Catch: IOException -> L419
    L352:
        return r81;
    L314:
        r130 = null;
        goto L315
    L263:
        if (r78.q != 304) goto L310;
        j14 r101 = r72.f();
        tl1 r102 = r72.s;
        tl1 r103 = r78.s;
        ArrayList r104 = new ArrayList(20);
        int r105 = r102.size();
        int r106 = 0;
    L265:
        if (r106 >= r105) goto L284;
        String r107 = r102.b(r106);
        String r133 = r102.e(r106);
        if ("Warning".equalsIgnoreCase(r107) == false) goto L272;
        if (xm4.k0(r133, "1", false) == false) goto L272;
    L283:
        r106 = r106 + 1;
    L272:
        if ("Content-Length".equalsIgnoreCase(r107) == false) goto L274;
    L282:
        r104.add(r107);
        r104.add(qm4.K0(r133).toString());
        goto L283
    L274:
        if ("Content-Encoding".equalsIgnoreCase(r107) == true) goto L282;
        if ("Content-Type".equalsIgnoreCase(r107) == true) goto L282;
        if (j51.C(r107) == false) goto L282;
        if (r103.a(r107) != null) goto L283;
    L284:
        int r108 = r103.size();
        int r109 = 0;
    L285:
        if (r109 >= r108) goto L297;
        String r134 = r103.b(r109);
        if ("Content-Length".equalsIgnoreCase(r134) == true) goto L296;
        if ("Content-Encoding".equalsIgnoreCase(r134) == true) goto L296;
        if ("Content-Type".equalsIgnoreCase(r134) == true) goto L296;
        if (j51.C(r134) == false) goto L296;
        String r135 = r103.e(r109);
        r104.add(r134);
        r104.add(qm4.K0(r135).toString());
    L296:
        r109 = r109 + 1;
        goto L285
    L297:
        String[] r136 = (String[]) r104.toArray(new String[0]);
        r136.getClass();
        sl1 r137 = new sl1();
        ArrayList r138 = r137.a;
        r138.getClass();
        List r139 = Arrays.asList(r136);
        r139.getClass();
        r138.addAll(r139);
        r101.f = r137;
        r101.k = r78.x;
        r101.l = r78.y;
        k14 r140 = xl.M(r72);
        xl.i("cacheResponse", r140);
        r101.i = r140;
        k14 r141 = xl.M(r78);
        xl.i("networkResponse", r141);
        r101.h = r141;
        r100 = r101.a();
        r78.t.close();
        hx r142 = (hx) this.b;
        r142.getClass();
        monitor-enter(r142);
        monitor-exit(r142);
        ((hx) this.b).getClass();
        fx r143 = new fx(r100);
        n14 r144 = r72.t;
        r144.getClass();
        fr0 r145 = ((ex) r144).n;
        ll r146 = r145.q.j(r145.n, r145.o);     // Catch: IOException -> L306
        if (r146 == null) goto L490;
        r143.c(r146);     // Catch: IOException -> L416
        r146.b();     // Catch: IOException -> L416
    L307:
        if (r146 == null) goto L490;
        r146.a();     // Catch: IOException -> L415
    L306:
        r146 = null;
        goto L307
    L310:
        xe5.b(r72.t);
    L353:
        th = move-exception;
        if (r120 == null) goto L356;
        xe5.b(r120.t);
    L356:
        throw th;
    L154:
        Object r147 = null;
        gr1 r148 = r60.a;
        tl1 r149 = r60.c;
        if (r148.f() == true) goto L157;
    L159:
        int r150 = 4;
        if (kb4.I(r120, r60) == true) goto L162;
        r68 = new hd5(r150, r60, r147);
        goto L241
    L162:
        ix r151 = r60.f;
        if (r151 != null) goto L166;
        int r152 = ix.n;
        r151 = au0.O(r60.c);
        r60.f = r151;
    L166:
        if (r151.a == false) goto L168;
    L239:
        r68 = new hd5(4, r60, null);
        goto L241
    L168:
        if (r149.a("If-Modified-Since") != null) goto L239;
        if (r149.a("If-None-Match") != null) goto L239;
        ix r153 = r120.b();
        if (r126 == null) goto L176;
        long r154 = Math.max(0, r121 - r126.getTime());
    L177:
        if (r63 == (-1)) goto L179;
        r154 = Math.max(r154, r66.toMillis(r63));
    L179:
        long r155 = (r154 + Math.max(0, r121 - r61)) + Math.max(0, r212 - r121);
        int r156 = r120.b().c;
        if (r156 == (-1)) goto L183;
        long r157 = r66.toMillis(r156);
    L182:
        long r213 = 0;
    L203:
        int r158 = r151.c;
        if (r158 == (-1)) goto L206;
        r157 = Math.min(r157, r66.toMillis(r158));
    L206:
        int r159 = r151.i;
        if (r159 == (-1)) goto L209;
        long r160 = r66.toMillis(r159);
    L211:
        if (r153.g == true) goto L215;
        int r161 = r151.h;
        if (r161 == (-1)) goto L215;
        long r162 = r66.toMillis(r161);
    L217:
        if (r153.a == true) goto L230;
        long r163 = r155 + r160;
        if (r163 >= (r162 + r157)) goto L230;
        j14 r164 = r120.f();
        if (r163 < r157) goto L224;
        r164.f.a("Warning", "110 HttpURLConnection \"Response is stale\"");
    L224:
        if (r155 > 86400000) goto L226;
    L229:
        int r165 = 4;
        r68 = new hd5(r165, null, r164.a());
        goto L241
    L226:
        if (r120.b().c != (-1)) goto L229;
        if (r124 != null) goto L229;
        r164.f.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
    L230:
        if (r127 == null) goto L232;
        String r166 = r127;
        String r167 = "If-None-Match";
    L237:
        sl1 r168 = r149.d();
        r166.getClass();
        e35.p(r168, r167, r166);
        nz3 r169 = r60.a();
        r169.c = r168.c().d();
        r68 = new hd5(4, new oz3(r169), r120);
        goto L241
    L232:
        if (r125 == null) goto L235;
        r166 = r128;
    L234:
        r167 = "If-Modified-Since";
        goto L237
    L235:
        if (r126 == null) goto L238;
        r166 = r210;
        goto L234
    L238:
        r68 = new hd5(4, r60, null);
    L215:
        r162 = r213;
        goto L217
    L209:
        r160 = r213;
        goto L211
    L183:
        if (r124 == null) goto L190;
        if (r126 == null) goto L186;
        r121 = r126.getTime();
    L186:
        r157 = r124.getTime() - r121;
        if (r157 > 0) goto L182;
        r157 = 0;
        goto L182
    L190:
        if (r125 == null) goto L202;
        List r170 = r120.n.a.g;
        if (r170 != null) goto L194;
        String r171 = null;
    L195:
        if (r171 != null) goto L202;
        if (r126 == null) goto L198;
        r61 = r126.getTime();
    L198:
        long r214 = r61 - r125.getTime();
        r213 = 0;
        if (r214 <= 0) goto L201;
        r157 = r214 / 10;
    L201:
        r157 = r213;
        goto L203
    L194:
        StringBuilder r172 = new StringBuilder();
        y41.h(r170, r172);
        r171 = r172.toString();
    L202:
        r213 = 0;
        goto L201
    L176:
        r154 = 0;
        goto L177
    L157:
        if (r120.r != null) goto L159;
        r68 = new hd5(4, r60, r147);
        goto L241
    L150:
        r63 = -1;
        r61 = 0;
        r121 = 0;
        r124 = null;
        r125 = null;
        r126 = null;
        r127 = null;
        r128 = null;
        r210 = null;
        goto L149
    L117:
        if (r56.isEmpty() == false) goto L119;
    L125:
        nz2.f(f34.f(r117, "code < 0: "));
        return null;
    L107:
        r113 = "GET";
    L126:
        xe5.b(r44);
    L101:
        r55 = null;
        goto L127
    L128:
        r120 = null;
        goto L129
    L357:
        be0 r173 = (be0) this.b;
        oz3 r174 = r45.e;
        nz3 r175 = r174.a();
        gr1 r176 = r174.a;
        tl1 r177 = r174.c;
        tz3 r178 = r174.d;
        if (r178 == null) goto L367;
        hu2 r179 = r178.contentType();
        if (r179 == null) goto L362;
        r175.a("Content-Type", r179.a);
    L362:
        long r180 = r178.contentLength();
        if (r180 == (-1)) goto L365;
        r175.a("Content-Length", String.valueOf(r180));
        r175.c.e("Transfer-Encoding");
        goto L367
    L365:
        r175.a("Transfer-Encoding", "chunked");
        r175.c.e("Content-Length");
    L367:
        if (r177.a("Host") != null) goto L369;
        int r181 = 0;
        r175.a("Host", ze5.j(r176, false));
    L371:
        if (r177.a("Connection") != null) goto L374;
        r175.a("Connection", "Keep-Alive");
    L374:
        if (r177.a("Accept-Encoding") == null) goto L376;
    L378:
        int r215 = r181;
    L379:
        List r182 = r173.w(r176);
        if (r182.isEmpty() == true) goto L393;
        StringBuilder r183 = new StringBuilder();
        Iterator r184 = r182.iterator();
    L383:
        if (r184.hasNext() == false) goto L392;
        Object r185 = r184.next();
        int r186 = r181 + 1;
        if (r181 < 0) goto L390;
        ae0 r187 = (ae0) r185;
        if (r181 <= 0) goto L389;
        r183.append("; ");
    L389:
        r183.append(r187.a);
        r183.append('=');
        r183.append(r187.b);
        r181 = r186;
        goto L383
    L390:
        gb.c0();
        throw null;
    L392:
        String r216 = null;
        r175.a("Cookie", r183.toString());
    L395:
        if (r177.a("User-Agent") != null) goto L397;
        r175.a("User-Agent", "okhttp/5.0.0-alpha.14");
    L397:
        oz3 r188 = new oz3(r175);
        k14 r189 = r45.b(r188);
        tl1 r190 = r189.s;
        br1.b(r173, r188.a, r190);
        j14 r191 = r189.f();
        r191.a = r188;
        if (r215 == 0) goto L414;
        String r192 = r190.a("Content-Encoding");
        if (r192 != null) goto L403;
        r192 = r216;
    L403:
        if ("gzip".equalsIgnoreCase(r192) == false) goto L414;
        if (br1.a(r189) == false) goto L414;
        n14 r193 = r189.t;
        if (r193 == null) goto L414;
        tk1 r194 = new tk1(r193.source());
        sl1 r195 = r190.d();
        r195.e("Content-Encoding");
        r195.e("Content-Length");
        r191.f = r195.c().d();
        String r196 = r190.a("Content-Type");
        if (r196 != null) goto L411;
        String r197 = r216;
    L412:
        r191.g = new fv3(r197, -1, new xu3(r194), 0);
        goto L414
    L411:
        r197 = r196;
    L414:
        return r191.a();
    L393:
        r216 = null;
        goto L395
    L376:
        if (r177.a("Range") != null) goto L378;
        r175.a("Accept-Encoding", "gzip");
        r215 = 1;
        goto L379
    L369:
        r181 = 0;
        goto L371
    }

    public oz3 b(k14 r11, y10 r12) {
        tz3 r0 = null;
        if (r12 == null) goto L5;
        o34 r1 = r12.e().d;
    L6:
        int r2 = r11.q;
        oz3 r3 = r11.n;
        String r4 = r3.b;
        boolean r5 = false;
        if (r2 == 307) goto L74;
        if (r2 == 308) goto L74;
        if (r2 != 401) goto L12;
        ((o83) this.b).g.getClass();
        return null;
    L12:
        if (r2 != 421) goto L14;
        tz3 r10 = r3.d;
        if (r10 != null) goto L57;
    L59:
        if (r12 != null) goto L61;
    L96:
        return null;
    L61:
        if (h12.c(((s21) r12.e).d().n().h.d, ((r21) r12.f).h().h().a.h.d) == true) goto L96;
        cv3 r13 = r12.e();
        monitor-enter(r13);
        r13.n = true;     // Catch: Throwable -> L69
        monitor-exit(r13);
        return r11.n;
    L69:
        th = move-exception;
        throw th;
    L57:
        if (r10.isOneShot() == false) goto L59;
    L14:
        if (r2 != 503) goto L16;
        k14 r14 = r11.w;
        if (r14 == null) goto L51;
        if (r14.q == 503) goto L96;
    L51:
        if (d(r11, Integer.MAX_VALUE) != 0) goto L96;
        return r11.n;
    L16:
        if (r2 != 407) goto L18;
        r1.getClass();
        if (r1.b.type() != Proxy.Type.HTTP) goto L44;
        ((o83) this.b).n.getClass();
        return null;
    L44:
        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
    L18:
        if (r2 == 408) goto L22;
        switch(r2) {
            case 300: goto L74;
            case 301: goto L74;
            case 302: goto L74;
            case 303: goto L74;
            default: goto L96;
        };
    L22:
        if (((o83) this.b).e == false) goto L96;
        tz3 r15 = r3.d;
        if (r15 != null) goto L27;
    L29:
        k14 r16 = r11.w;
        if (r16 == null) goto L35;
        if (r16.q == 408) goto L96;
    L35:
        if (d(r11, 0) > 0) goto L96;
        return r11.n;
    L27:
        if (r15.isOneShot() == false) goto L29;
    L74:
        o83 r17 = (o83) this.b;
        if (r17.h == false) goto L96;
        String r6 = r11.s.a("Location");
        if (r6 != null) goto L80;
        r6 = null;
    L80:
        oz3 r7 = r11.n;
        if (r6 == null) goto L96;
        gr1 r8 = r7.a;
        r8.getClass();
        fr1 r9 = new fr1();     // Catch: IllegalArgumentException -> L86
        r9.e(r8, r6);     // Catch: IllegalArgumentException -> L86
    L87:
        if (r9 == null) goto L89;
        gr1 r18 = r9.b();
    L90:
        if (r18 == null) goto L96;
        if (h12.c(r18.a, r7.a.a) == false) goto L95;
    L97:
        nz3 r19 = r7.a();
        if (gb.T(r4) == false) goto L115;
        int r110 = r11.q;
        if (r4.equals("PROPFIND") == true) goto L103;
        if (r110 == 308) goto L103;
        if (r110 == 307) goto L103;
    L105:
        if (r4.equals("PROPFIND") == true) goto L109;
        if (r110 == 308) goto L109;
        if (r110 == 307) goto L109;
        r19.b("GET", null);
    L112:
        if (r5 == true) goto L115;
        r19.c.e("Transfer-Encoding");
        r19.c.e("Content-Length");
        r19.c.e("Content-Type");
    L109:
        if (r5 == false) goto L111;
        r0 = r7.d;
    L111:
        r19.b(r4, r0);
    L103:
        r5 = true;
    L115:
        if (ze5.a(r7.a, r18) == true) goto L117;
        r19.c.e("Authorization");
    L117:
        r19.a = r18;
        return new oz3(r19);
    L95:
        if (r17.i == true) goto L97;
    L89:
        r18 = null;
    L86:
        r9 = null;
        goto L87
    L5:
        r1 = null;
        goto L6
    }

    public boolean c(IOException r1, bv3 r2, oz3 r3, boolean r4) {
        if (((o83) this.b).e == false) goto L48;
        if (r4 == false) goto L14;
        tz3 r0 = r3.d;
        if (r0 == null) goto L11;
        if (r0.isOneShot() == false) goto L11;
        return false;
    L11:
        if ((r1 instanceof FileNotFoundException) == false) goto L14;
        return false;
    L14:
        if ((r1 instanceof ProtocolException) == false) goto L17;
        return false;
    L17:
        if ((r1 instanceof InterruptedIOException) == false) goto L23;
        if ((r1 instanceof SocketTimeoutException) == false) goto L43;
        if (r4 == true) goto L44;
    L30:
        y10 r5 = r2.B;
        if (r5 != null) goto L33;
        return false;
    L33:
        if (r5.c != true) goto L46;
        s21 r6 = r2.t;
        r6.getClass();
        r34 r7 = r6.d();
        y10 r8 = r2.B;
        if (r8 == null) goto L37;
        cv3 r9 = r8.e();
    L39:
        if (r7.m(r9) == false) goto L47;
        return true;
    L47:
        return false;
    L37:
        r9 = null;
        goto L39
    L46:
        return false;
    L44:
        return false;
    L43:
        return false;
    L23:
        if ((r1 instanceof SSLHandshakeException) == false) goto L28;
        if ((r1.getCause() instanceof CertificateException) == false) goto L28;
        return false;
    L28:
        if ((r1 instanceof SSLPeerUnverifiedException) == false) goto L30;
        return false;
    L48:
        return false;
    }

    public /* synthetic */ xu(int r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }

    public xu(o83 r2) {
        this.a = 3;
        r2.getClass();
        this.b = r2;
    }
}
