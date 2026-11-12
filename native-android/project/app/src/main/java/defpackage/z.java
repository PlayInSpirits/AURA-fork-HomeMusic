package defpackage;

import android.net.Uri;
import androidx.compose.ui.platform.ComposeView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements wf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ z(int r1, int r2, Object r3) {
        this.n = r2;
        this.o = r3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wf1
    public final Object invoke(Object r28, Object r29) {
        char r10 = 7;
        int r12 = 3;
        az r13 = null;
        y94 r14 = null;
        r14 = null;
        r14 = null;
        r14 = null;
        s22 r15 = null;
        boolean r16 = false;
        boolean r17 = false;
        int r18 = 0;
        int r19 = 0;
        int r110 = 1;
        switch(this.n) {
            case 0: goto L273;
            case 1: goto L271;
            case 2: goto L269;
            case 3: goto L255;
            case 4: goto L247;
            case 5: goto L245;
            case 6: goto L243;
            case 7: goto L227;
            case 8: goto L198;
            case 9: goto L181;
            case 10: goto L133;
            case 11: goto L110;
            case 12: goto L77;
            case 13: goto L56;
            case 14: goto L51;
            default: goto L4;
        };
    L4:
        List r0 = (List) this.o;
        CharSequence r3 = (CharSequence) r28;
        int r1 = ((Integer) r29).intValue();
        r3.getClass();
        if (r0.size() != 1) goto L11;
        String r2 = (String) q40.I0(r0);
        int r4 = qm4.s0(r3, r2, r1, 4);
        if (r4 >= 0) goto L9;
    L8:
        kd3 r5 = null;
    L48:
        if (r5 != null) goto L50;
        return null;
    L50:
        return new kd3(r5.n, Integer.valueOf(((String) r5.o).length()));
    L9:
        r5 = new kd3(Integer.valueOf(r4), r2);
        goto L48
    L11:
        if (r1 >= 0) goto L13;
        r1 = 0;
    L13:
        j02 r6 = new j02(r1, r3.length(), 1);
        int r7 = r6.p;
        int r8 = r6.o;
        if ((r3 instanceof String) == false) goto L31;
        if (r7 <= 0) goto L17;
        if (r1 > r8) goto L17;
    L19:
        Iterator r9 = r0.iterator();
    L21:
        if (r9.hasNext() == false) goto L25;
        Object r11 = r9.next();
        String r20 = (String) r11;
        if (r20.regionMatches(0, (String) r3, r1, r20.length()) == false) goto L21;
    L26:
        String r21 = (String) r11;
        if (r21 != null) goto L28;
        if (r1 == r8) goto L8;
        r1 = r1 + r7;
        goto L19
    L28:
        r5 = new kd3(Integer.valueOf(r1), r21);
        goto L48
    L25:
        r11 = null;
    L17:
        if (r7 >= 0) goto L8;
        if (r8 > r1) goto L8;
    L31:
        if (r7 <= 0) goto L33;
        if (r1 > r8) goto L33;
    L35:
        int r22 = r1;
    L36:
        Iterator r23 = r0.iterator();
    L38:
        if (r23.hasNext() == false) goto L42;
        Object r111 = r23.next();
        String r24 = (String) r111;
        if (qm4.y0(r24, 0, r3, r22, r24.length(), false) == false) goto L38;
    L43:
        String r112 = (String) r111;
        if (r112 != null) goto L45;
        if (r22 == r8) goto L8;
        r22 = r22 + r7;
        goto L36
    L45:
        r5 = new kd3(Integer.valueOf(r22), r112);
        goto L48
    L42:
        r111 = null;
    L33:
        if (r7 >= 0) goto L8;
        if (r8 > r1) goto L8;
    L51:
        char[] r25 = (char[]) this.o;
        CharSequence r26 = (CharSequence) r28;
        int r27 = ((Integer) r29).intValue();
        r26.getClass();
        int r30 = qm4.t0(r26, r25, r27, false);
        if (r30 >= 0) goto L55;
        return null;
    L55:
        return new kd3(Integer.valueOf(r30), 1);
    L56:
        pp3 r31 = (pp3) this.o;
        Set r32 = (Set) r28;
        ch4 r33 = (ch4) r29;
        AtomicReference r34 = (AtomicReference) r31.d;
    L57:
        Object r35 = r34.get();
        if (r35 != null) goto L61;
        Object r36 = r32;
    L67:
        if (r34.compareAndSet(r35, r36) == true) goto L69;
        if (r34.get() == r35) goto L67;
    L69:
        if (r31.a() == false) goto L344;
        ((ja) r31.c).invoke(new wc(26, r31));
    L344:
        return j15.a;
    L61:
        if ((r35 instanceof Set) == false) goto L64;
        r36 = gb.P(new Set[]{r35, r32});
        goto L67
    L64:
        if ((r35 instanceof List) == false) goto L75;
        r36 = q40.G0((Collection) r35, gb.O(r32));
        goto L67
    L75:
        l80.b("Unexpected notification");
        er1.a();
        return null;
    L77:
        jf4 r37 = (jf4) this.o;
        Set r38 = (Set) r28;
        ch4 r39 = (ch4) r29;
        Object r40 = r37.a;
        monitor-enter(r40);
        x03 r113 = r37.d;     // Catch: Throwable -> L84
        if (r113 == null) goto L82;
        Object[] r114 = r113.b;     // Catch: Throwable -> L84
        long[] r115 = r113.a;     // Catch: Throwable -> L84
        int r41 = r115.length - 2;     // Catch: Throwable -> L84
        if (r41 < 0) goto L103;
        int r42 = 0;
    L89:
        long r43 = r115[r42];     // Catch: Throwable -> L84
        if (((((~r43) << 7) & r43) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L101;
        int r44 = 8 - ((~(r42 - r41)) >>> 31);     // Catch: Throwable -> L84
        int r45 = 0;
    L92:
        if (r45 >= r44) goto L100;
        if ((r43 & 255) >= 128) goto L99;
        if (r38.contains(r114[(r42 << 3) + r45]) == false) goto L99;
        r14 = r37.f;     // Catch: Throwable -> L84
    L99:
        r43 = r43 >> 8;
        r45 = r45 + 1;
        goto L92
    L100:
        if (r44 != 8) goto L103;
    L101:
        if (r42 == r41) goto L103;
        r42 = r42 + 1;
    L103:
        monitor-exit(r40);
        if (r14 == null) goto L107;
        r14.d(j15.a);
    L107:
        return j15.a;
    L82:
        if (q40.s0(r38, r37.b) == false) goto L103;
        r14 = r37.f;     // Catch: Throwable -> L84
    L84:
        th = move-exception;
        throw th;
    L110:
        a44 r46 = (a44) this.o;
        int r47 = ((Integer) r28).intValue();
        le0 r48 = (le0) r29;
        me0 r49 = r48.getKey();
        le0 r50 = r46.o.K(r49);
        if (r49 == fz0.h0) goto L115;
        if (r48 == r50) goto L114;
        r47 = Integer.MIN_VALUE;
    L126:
        return Integer.valueOf(r47);
    L114:
        r47 = r47 + 1;
        goto L126
    L115:
        s22 r51 = (s22) r50;
        s22 r52 = (s22) r48;
    L116:
        if (r52 == null) goto L123;
        if (r52 == r51) goto L122;
        if ((r52 instanceof e64) == false) goto L122;
        c20 r53 = ((e64) r52).G();
        if (r53 != null) goto L131;
        r52 = null;
        goto L116
    L131:
        r52 = r53.getParent();
    L122:
        r15 = r52;
    L123:
        if (r15 != r51) goto L128;
        if (r51 != null) goto L114;
    L128:
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + r15 + ", expected child of " + r51 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    L133:
        tv3 r54 = (tv3) this.o;
        Set r55 = (Set) r28;
        ch4 r56 = (ch4) r29;
        Object r57 = r54.c;
        monitor-enter(r57);
    L153:
        th = move-exception;
        throw th;
    L136:
        if (((ov3) r54.u.getValue()).compareTo(ov3.r) < 0) goto L174;
        x03 r58 = r54.h;     // Catch: Throwable -> L153
        if ((r55 instanceof x54) == false) goto L164;
        x03 r59 = ((x54) r55).n;     // Catch: Throwable -> L153
        Object[] r60 = r59.b;     // Catch: Throwable -> L153
        long[] r61 = r59.a;     // Catch: Throwable -> L153
        int r62 = r61.length - 2;     // Catch: Throwable -> L153
        if (r62 < 0) goto L173;
        int r63 = 0;
    L142:
        long r64 = r61[r63];     // Catch: Throwable -> L153
        if (((((~r64) << r10) & r64) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L161;
        int r116 = 8 - ((~(r63 - r62)) >>> 31);     // Catch: Throwable -> L153
        int r117 = 0;
    L145:
        if (r117 >= r116) goto L158;
        if ((r64 & 255) >= 128) goto L156;
        Object r118 = r60[(r63 << 3) + r117];     // Catch: Throwable -> L153
        char r210 = r10;
        if ((r118 instanceof sl4) == true) goto L151;
    L155:
        r58.a(r118);     // Catch: Throwable -> L153
    L157:
        r64 = r64 >> 8;     // Catch: Throwable -> L153
        r117 = r117 + 1;     // Catch: Throwable -> L153
        r10 = r210;
        goto L145
    L151:
        if (((sl4) r118).e(1) == true) goto L155;
    L156:
        r210 = r10;
        goto L157
    L158:
        char r211 = r10;
        if (r116 != 8) goto L173;
    L162:
        if (r63 == r62) goto L173;
        r63 = r63 + 1;     // Catch: Throwable -> L153
        r10 = r211;
        goto L142
    L161:
        r211 = r10;
    L173:
        r13 = r54.y();     // Catch: Throwable -> L153
        goto L174
    L164:
        Iterator r65 = r55.iterator();     // Catch: Throwable -> L153
    L166:
        if (r65.hasNext() == false) goto L173;
        Object r66 = r65.next();     // Catch: Throwable -> L153
        if ((r66 instanceof sl4) == false) goto L172;
        if (((sl4) r66).e(1) == false) goto L166;
    L172:
        r58.a(r66);     // Catch: Throwable -> L153
    L174:
        monitor-exit(r57);
        if (r13 == null) goto L178;
        ((cz) r13).resumeWith(j15.a);
    L178:
        return j15.a;
    L181:
        hk3 r67 = (hk3) this.o;
        rg1 r68 = (rg1) r28;
        int r69 = ((Integer) r29).intValue();
        i80 r70 = j80.a;
        if ((r69 & 3) == 2) goto L185;
        r17 = true;
    L185:
        if (r68.K(r69 & 1, r17) == false) goto L195;
        List r119 = r67.h0();
        int r120 = r67.s0.g();
        boolean r121 = ((Boolean) r67.t0.getValue()).booleanValue();
        Uri r122 = (Uri) r67.u0.getValue();
        String r212 = (String) r67.v0.getValue();
        boolean r213 = ((Boolean) r67.x0.getValue()).booleanValue();
        boolean r214 = ((Boolean) r67.y0.getValue()).booleanValue();
        boolean r71 = r68.g(r67);
        Object r72 = r68.H();
        if (r71 == true) goto L189;
        if (r72 == r70) goto L189;
    L190:
        if1 r215 = (if1) r72;
        boolean r73 = r68.g(r67);
        Object r74 = r68.H();
        if (r73 == true) goto L193;
        if (r74 == r70) goto L193;
    L194:
        e35.e(r119, r120, r121, r122, r212, r213, r214, r215, (gf1) r74, r68, 0);
    L197:
        return j15.a;
    L193:
        r74 = new wc(17, r67);
        r68.b0(r74);
    L189:
        r72 = new dk3(r67, r110);
        r68.b0(r72);
        goto L190
    L195:
        r68.N();
        goto L197
    L198:
        kz2 r75 = (kz2) this.o;
        Set r76 = (Set) r28;
        ch4 r77 = (ch4) r29;
        jx3 r78 = new jx3();
        Object r79 = r75.a;
        monitor-enter(r79);
        w03 r80 = r75.b;     // Catch: Throwable -> L220
        dd0 r81 = new dd0(r76, r75, r78, r12);     // Catch: Throwable -> L220
        jz4.j(1, r81);     // Catch: Throwable -> L220
        Object[] r82 = r80.b;     // Catch: Throwable -> L220
        long[] r83 = r80.a;     // Catch: Throwable -> L220
        int r84 = r83.length - 2;     // Catch: Throwable -> L220
        if (r84 < 0) goto L214;
        int r85 = 0;
    L203:
        long r86 = r83[r85];     // Catch: Throwable -> L220
        if (((((~r86) << 7) & r86) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L212;
        int r123 = 8 - ((~(r85 - r84)) >>> 31);     // Catch: Throwable -> L220
        int r124 = 0;
    L206:
        if (r124 >= r123) goto L211;
        if ((r86 & 255) >= 128) goto L210;
        r81.invoke(r82[(r85 << 3) + r124]);     // Catch: Throwable -> L220
    L210:
        r86 = r86 >> 8;     // Catch: Throwable -> L220
        r124 = r124 + 1;     // Catch: Throwable -> L220
        goto L206
    L211:
        if (r123 != 8) goto L214;
    L212:
        if (r85 == r84) goto L214;
        r85 = r85 + 1;     // Catch: Throwable -> L220
    L214:
        List r87 = (List) r78.n;     // Catch: Throwable -> L220
        if (r87 == null) goto L222;
        int r88 = r87.size();     // Catch: Throwable -> L220
    L217:
        if (r18 >= r88) goto L222;
        ((y94) r87.get(r18)).d(j15.a);     // Catch: Throwable -> L220
        r18 = r18 + 1;
    L222:
        monitor-exit(r79);
        return j15.a;
    L220:
        th = move-exception;
        throw th;
    L227:
        t44 r89 = (t44) r28;
        List r90 = (List) ((d60) this.o).invoke(r89, r29);
        int r91 = r90.size();
    L228:
        if (r19 >= r91) goto L240;
        Object r92 = r90.get(r19);
        if (r92 == null) goto L238;
        x44 r93 = r89.o;
        if (r93 == null) goto L238;
        if (r93.b(r92) == true) goto L238;
        throw new IllegalArgumentException(("item at index " + r19 + " can't be saved: " + r92).toString());
    L238:
        r19 = r19 + 1;
        goto L228
    L240:
        if (r90.isEmpty() == false) goto L242;
        return null;
    L242:
        return new ArrayList(r90);
    L243:
        ((Integer) r29).getClass();
        q05.a((r70) this.o, (rg1) r28, xl.O(7));
        return j15.a;
    L245:
        ((Integer) r29).getClass();
        ((ty1) this.o).a(xl.O(1), (rg1) r28);
        return j15.a;
    L247:
        rg1 r94 = (rg1) r28;
        int r95 = ((Integer) r29).intValue();
        if ((r95 & 3) == 2) goto L251;
        r16 = true;
    L251:
        if (r94.K(r95 & 1, r16) == true) goto L254;
        r94.N();
        return j15.a;
    L254:
        throw null;
    L255:
        uy3 r96 = (uy3) this.o;
        ((Integer) r28).getClass();
        if ((r29 instanceof u70) == false) goto L262;
        u70 r97 = (u70) r29;
        x03 r98 = r96.h;
        if (r98 != null) goto L260;
        x03 r99 = w54.a;
        r98 = new x03();
        r96.h = r98;
    L260:
        r98.k(r97);
        r96.f.b(r97);
    L262:
        if ((r29 instanceof wg1) == false) goto L265;
        r96.e((wg1) r29);
    L265:
        if ((r29 instanceof lv3) == false) goto L268;
        ((lv3) r29).c();
    L268:
        return j15.a;
    L269:
        ((Integer) r29).getClass();
        int r100 = ComposeView.y;
        ((ComposeView) this.o).a(xl.O(1), (rg1) r28);
        return j15.a;
    L271:
        z64 r101 = (z64) this.o;
        fu.G(r101.e0(), null, null, new i2(r101, ((Float) r28).floatValue(), ((Float) r29).floatValue(), null), 3);
        return Boolean.TRUE;
    L273:
        b0 r102 = (b0) this.o;
        rg1 r103 = (rg1) r28;
        int r104 = ((Integer) r29).intValue();
        if ((r104 & 3) == 2) goto L276;
        boolean r105 = true;
    L278:
        if (r103.K(r104 & 1, r105) == false) goto L280;
        r102.a(0, r103);
    L282:
        return j15.a;
    L280:
        r103.N();
        goto L282
    L276:
        r105 = false;
        goto L278
    }

    public /* synthetic */ z(int r1, Object r2) {
        this.n = r1;
        this.o = r2;
    }
}
