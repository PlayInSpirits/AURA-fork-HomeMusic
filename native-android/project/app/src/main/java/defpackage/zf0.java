package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.credentials.exceptions.GetCredentialUnsupportedException;
import androidx.navigation.fragment.NavHostFragment;
import androidx.work.Worker;
import app.homemusic.R;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zf0 extends q42 implements gf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ zf0(int r1, Object r2) {
        this.n = r1;
        this.o = r2;
        super(0);
    }

    @Override // defpackage.gf1
    public final Object invoke() {
        int r1 = this.n;
        j15 r2 = j15.a;
        int r3 = 2;
        int r4 = -1;
        boolean r5 = false;
        Object r0 = this.o;
        switch(r1) {
            case 0: goto L245;
            case 1: goto L239;
            case 2: goto L233;
            case 3: goto L231;
            case 4: goto L230;
            case 5: goto L163;
            case 6: goto L10;
            case 7: goto L9;
            case 8: goto L7;
            default: goto L5;
        };
    L10:
        y04 r6 = (y04) r0;
        ClassLoader r7 = r6.c;
        b71 r8 = r6.d;
        Enumeration<URL> r9 = r7.getResources("");
        r9.getClass();
        ArrayList r10 = Collections.list(r9);
        r10.getClass();
        ArrayList r11 = new ArrayList();
        int r12 = r10.size();
        int r13 = 0;
    L11:
        if (r13 >= r12) goto L18;
        Object r14 = r10.get(r13);
        r13 = r13 + 1;
        URL r15 = (URL) r14;
        r15.getClass();
        if (h12.c(r15.getProtocol(), "file") == true) goto L15;
        kd3 r16 = null;
    L16:
        if (r16 == null) goto L11;
        r11.add(r16);
        goto L11
    L15:
        String r17 = ge3.o;
        r16 = new kd3(r8, tv1.A(new File(r15.toURI())));
        goto L16
    L18:
        Enumeration<URL> r18 = r7.getResources("META-INF/MANIFEST.MF");
        r18.getClass();
        ArrayList r19 = Collections.list(r18);
        r19.getClass();
        ArrayList r20 = new ArrayList();
        int r21 = r19.size();
        int r22 = 0;
    L19:
        if (r22 >= r21) goto L162;
        int r110 = r22 + 1;
        URL r23 = (URL) r19.get(r22);
        r23.getClass();
        String r24 = r23.toString();
        r24.getClass();
        if (xm4.k0(r24, "jar:file:", r5) == true) goto L23;
    L22:
        int r35 = r110;
        kd3 r25 = null;
    L128:
        if (r25 == null) goto L130;
        r20.add(r25);
    L130:
        r22 = r35;
        r4 = -1;
        r5 = false;
        goto L19
    L23:
        boolean r111 = true;
        int r26 = r24.lastIndexOf("!", r24.length() - 1);
        if (r26 == r4) goto L22;
        String r112 = ge3.o;
        ge3 r27 = tv1.A(new File(URI.create(r24.substring(4, r26))));
        r32 r113 = r8.i(r27);
        long r114 = r113.size();     // Catch: Throwable -> L151
        long r115 = r114 - 22;     // Catch: Throwable -> L151
        if (r115 < 0) goto L154;
        long r116 = Math.max(r114 - 65558, 0);     // Catch: Throwable -> L151
        long r117 = 0;
        long r28 = r115;
    L30:
        xu3 r118 = new xu3(r113.b(r28));     // Catch: Throwable -> L151
    L147:
        th = th;
    L149:
        r118.close();     // Catch: Throwable -> L93
        throw th;     // Catch: Throwable -> L93
    L32:
        if (r118.f() == 101010256) goto L33;
        long r29 = r28;
        int r36 = r110;
        boolean r210 = r111;
        r32 r30 = r113;
        r118.close();     // Catch: Throwable -> L93
        r28 = r29 - 1;     // Catch: Throwable -> L93
        if (r28 < r116) goto L146;
        r110 = r36;
        r113 = r30;
        r111 = r210;
        goto L30
    L146:
        throw new IOException("not a zip: end of central directory signature not found");     // Catch: Throwable -> L93
    L33:
        int r31 = r118.n() & 65535;     // Catch: Throwable -> L147
        int r119 = r118.n() & 65535;     // Catch: Throwable -> L147
        long r211 = r28;
        long r32 = r118.n() & 65535;     // Catch: Throwable -> L147
        r32 r212 = r113;
        if (r32 != (r118.n() & 65535)) goto L259;
        if (r31 != 0) goto L259;
        if (r119 != 0) goto L259;
        r118.skip(4);     // Catch: Throwable -> L134
        long r213 = ((long) r118.f()) & 4294967295L;     // Catch: Throwable -> L134
        int r33 = r118.n() & 65535;     // Catch: Throwable -> L134
        pu r120 = new pu(r33, r32, r213);     // Catch: Throwable -> L134
        r118.q(r33);     // Catch: Throwable -> L134
        r118.close();     // Catch: Throwable -> L132
        long r34 = r211 - 20;
        if (r34 <= 0) goto L95;
        r32 r37 = r212;
        xu3 r38 = new xu3(r37.b(r34));     // Catch: Throwable -> L93
    L77:
        th = move-exception;
        r38.close();     // Catch: Throwable -> L87
    L89:
        Throwable th = th;
    L90:
        if (th != null) goto L92;
    L91:
        pu r39 = r120;
        ArrayList r40 = new ArrayList();     // Catch: Throwable -> L93
        xu3 r121 = new xu3(r37.b(r39.b));     // Catch: Throwable -> L93
        long r122 = r39.a;     // Catch: Throwable -> L112
    L99:
        if (r117 >= r122) goto L114;
        ne5 r41 = gb.V(r121);     // Catch: Throwable -> L112
        r35 = r110;
        xu3 r123 = r121;
    L107:
        th = th;
    L108:
        Throwable r42 = th;
        r123.close();     // Catch: Throwable -> L121
    L123:
        Throwable th2 = r42;
    L124:
        if (th2 != null) goto L131;
        oe5 r43 = new oe5(r27, r8, gb.g(r40));     // Catch: Throwable -> L93
        r37.close();     // Catch: Throwable -> L247
    L127:
        r25 = new kd3(r43, y04.f);
        goto L128
    L131:
        throw th2;     // Catch: Throwable -> L93
    L121:
        th = move-exception;
        j51.d(r42, th);     // Catch: Throwable -> L93
        goto L123
    L103:
        if (r41.h >= r39.b) goto L111;
        ge3 r124 = y04.f;     // Catch: Throwable -> L107
        if (hh3.d(r41.a) == false) goto L109;
        r40.add(r41);     // Catch: Throwable -> L107
    L109:
        r117 = r117 + 1;     // Catch: Throwable -> L107
        r110 = r35;
        r121 = r123;
        goto L99
    L111:
        throw new IOException("bad zip: local file header offset >= central directory offset");     // Catch: Throwable -> L107
    L114:
        r35 = r110;
        r121.close();     // Catch: Throwable -> L117
        th2 = null;
    L117:
        th2 = th;
    L112:
        th = th;
        r35 = r110;
        r123 = r121;
        goto L108
    L92:
        throw th;     // Catch: Throwable -> L93
    L87:
        th = move-exception;
        j51.d(th, th);     // Catch: Throwable -> L93
        goto L89
    L46:
        if (r38.f() != 117853008) goto L283;
        int r44 = r38.f();     // Catch: Throwable -> L77
        long r125 = r38.j();     // Catch: Throwable -> L77
        if (r38.f() != 1) goto L80;
        if (r44 != 0) goto L80;
        xu3 r126 = new xu3(r37.b(r125));     // Catch: Throwable -> L77
        int r45 = r126.f();     // Catch: Throwable -> L67
        if (r45 != 101075792) goto L66;
        r126.skip(12);     // Catch: Throwable -> L67
        int r46 = r126.f();     // Catch: Throwable -> L67
        int r127 = r126.f();     // Catch: Throwable -> L67
        long r310 = r126.j();     // Catch: Throwable -> L67
        if (r310 != r126.j()) goto L63;
        if (r46 != 0) goto L63;
        if (r127 != 0) goto L63;
        r126.skip(8);     // Catch: Throwable -> L67
        pu r214 = new pu(r33, r310, r126.j());     // Catch: Throwable -> L67
        r126.close();     // Catch: Throwable -> L60
        Throwable th3 = null;
    L61:
        r120 = r214;
    L74:
        if (th3 == null) goto L283;
        throw th3;     // Catch: Throwable -> L77
    L60:
        th3 = th;
    L63:
        throw new IOException("unsupported zip: spanned");     // Catch: Throwable -> L67
    L66:
        throw new IOException("bad zip: expected " + gb.B(101075792) + " but was " + gb.B(r45));     // Catch: Throwable -> L67
    L67:
        th = move-exception;
        r126.close();     // Catch: Throwable -> L71
    L73:
        th3 = th;
        goto L74
    L71:
        th = move-exception;
        j51.d(th, th);     // Catch: Throwable -> L77
    L80:
        throw new IOException("unsupported zip: spanned");     // Catch: Throwable -> L77
    L283:
        r38.close();     // Catch: Throwable -> L83
        th = null;
    L83:
        th = th;
    L93:
        th = th;
    L94:
        Throwable r47 = th;
        if (r37 == null) goto L320;
        r37.close();     // Catch: Throwable -> L158
        throw r47;
    L158:
        th = move-exception;
        j51.d(r47, th);
        throw r47;
    L320:
        throw r47;
    L95:
        r37 = r212;
    L132:
        th = th;
        r37 = r212;
    L134:
        th = th;
    L259:
    L139:
        th = th;
        goto L149
    L138:
        throw new IOException("unsupported zip: spanned");     // Catch: Throwable -> L139
    L154:
        throw new IOException("not a zip: size=" + r113.size());     // Catch: Throwable -> L93
    L151:
        th = th;
        r37 = r113;
        goto L94
    L162:
        return q40.G0(r11, r20);
    L163:
        NavHostFragment r48 = (NavHostFragment) r0;
        Context r49 = r48.n();
        if (r49 == null) goto L227;
        v23 r50 = new v23(r49);
        ba2 r51 = r50.n;
        if (r48 == r51) goto L173;
        pd1 r52 = r50.r;
        if (r51 == null) goto L172;
        ea2 r53 = r51.h();
        if (r53 == null) goto L172;
        r53.f(r52);
    L172:
        r50.n = r48;
        r48.c0.a(r52);
    L173:
        e75 r54 = r48.d();
        if (h12.c(r50.o, su3.s(r54)) == false) goto L177;
    L179:
        Context r55 = r48.Z();
        ld1 r56 = r48.m();
        r56.getClass();
        tp0 r57 = new tp0(r55, r56);
        u43 r58 = r50.u;
        r58.a(r57);
        Context r59 = r48.Z();
        ld1 r60 = r48.m();
        r60.getClass();
        int r61 = r48.J;
        if (r61 != 0) goto L182;
    L184:
        r61 = R.id.nav_host_fragment_container;
    L185:
        r58.a(new rd1(r59, r60, r61));
        Bundle r62 = ((rm3) r48.g0.p).A("android-support-nav:fragment:navControllerState");
        if (r62 == null) goto L210;
        r62.setClassLoader(r49.getClassLoader());
        r50.d = r62.getBundle("android-support-nav:controller:navigatorState");
        r50.e = r62.getParcelableArray("android-support-nav:controller:backStack");
        LinkedHashMap r63 = r50.m;
        r63.clear();
        int[] r64 = r62.getIntArray("android-support-nav:controller:backStackDestIds");
        ArrayList<String> r65 = r62.getStringArrayList("android-support-nav:controller:backStackIds");
        if (r64 == null) goto L193;
        if (r65 == null) goto L193;
        int r66 = r64.length;
        int r67 = 0;
        int r128 = 0;
    L191:
        if (r67 >= r66) goto L193;
        r50.l.put(Integer.valueOf(r64[r67]), r65.get(r128));
        r67 = r67 + 1;
        r128 = r128 + 1;
    L193:
        ArrayList<String> r68 = r62.getStringArrayList("android-support-nav:controller:backStackStates");
        if (r68 == null) goto L209;
        int r69 = r68.size();
        int r70 = 0;
    L196:
        if (r70 >= r69) goto L209;
        String r71 = r68.get(r70);
        r70 = r70 + 1;
        String r72 = r71;
        Parcelable[] r129 = r62.getParcelableArray("android-support-nav:controller:backStackStates:" + r72);
        if (r129 == null) goto L196;
        r72.getClass();
        ii r130 = new ii(r129.length);
        int r131 = 0;
    L201:
        if (r131 >= r129.length) goto L208;
        int r132 = r131 + 1;
        Parcelable r133 = r129[r131];     // Catch: ArrayIndexOutOfBoundsException -> L205
        r133.getClass();
        r130.addLast((c23) r133);
        r131 = r132;
    L205:
        e = move-exception;
        kf2.m(e.getMessage());
    L207:
        return null;
    L208:
        r63.put(r72, r130);
    L209:
        r50.f = r62.getBoolean("android-support-nav:controller:deepLinkHandled");
    L210:
        ((rm3) r48.g0.p).L("android-support-nav:fragment:navControllerState", new cs0(r3, r50));
        Bundle r73 = ((rm3) r48.g0.p).A("android-support-nav:fragment:graphId");
        if (r73 == null) goto L213;
        r48.n0 = r73.getInt("android-support-nav:fragment:graphId");
    L213:
        ((rm3) r48.g0.p).L("android-support-nav:fragment:graphId", new cs0(3, r48));
        int r74 = r48.n0;
        rp4 r75 = r50.B;
        if (r74 == 0) goto L217;
        r50.v(((w23) r75.getValue()).b(r74), null);
    L322:
        return r50;
    L217:
        Bundle r76 = r48.s;
        if (r76 == null) goto L220;
        int r77 = r76.getInt("android-support-nav:fragment:graphId");
    L221:
        if (r76 == null) goto L223;
        Bundle r78 = r76.getBundle("android-support-nav:fragment:startDestinationArgs");
    L224:
        if (r77 == 0) goto L322;
        r50.v(((w23) r75.getValue()).b(r77), r78);
        goto L322
    L223:
        r78 = null;
        goto L224
    L220:
        r77 = 0;
        goto L221
    L182:
        if (r61 == (-1)) goto L184;
    L177:
        if (r50.g.isEmpty() == false) goto L226;
        r50.o = su3.s(r54);
        goto L179
    L226:
        kf2.o("ViewModelStore should be set before setGraph call");
        goto L207
    L227:
        kf2.o("NavController cannot be created before the fragment is attached");
        goto L207
    L231:
        v23 r79 = (v23) r0;
        return new w23(r79.a, r79.u);
    L233:
        a23 r80 = (a23) r0;
        Context r81 = r80.n.getApplicationContext();
        if ((r81 instanceof Application) == false) goto L236;
        Application r82 = (Application) r81;
    L238:
        return new k54(r82, r80, r80.c());
    L236:
        r82 = null;
        goto L238
    L239:
        rq1 r83 = (rq1) r0;
        r83.getClass();
        r83.J.s(2, 0, false);     // Catch: IOException -> L242
    L244:
        return r2;
    L242:
        e = move-exception;
        r83.f(e);
        goto L244
    L245:
        ((wo0) r0).F(new GetCredentialUnsupportedException("Your device doesn't support credential manager"));
        return r2;
    L5:
        return ((Worker) r0).d();
    L7:
        return new tc0[((p81[]) r0).length];
    L9:
        return ((r21) ((y10) r0).f).i();
    L230:
        return new n23((String) r0, null, null);
    }
}
