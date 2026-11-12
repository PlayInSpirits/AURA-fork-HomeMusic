package defpackage;

import android.view.KeyEvent;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import com.eddyizm.tempus.homemusic.HubMe;
import com.eddyizm.tempus.lan.LanReceiverService;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fa implements gf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    public /* synthetic */ fa(int r1, Object r2, Object r3) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37, types: [cx2] */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40, types: [cx2] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26, types: [f13] */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29, types: [f13] */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r7v23 */
    @Override // defpackage.gf1
    public final Object invoke() {
        int r0 = this.n;
        u73 r3 = null;
        j15 r4 = j15.a;
        Object r5 = this.p;
        Object r15 = this.o;
        switch(r0) {
            case 0: goto L201;
            case 1: goto L160;
            case 2: goto L158;
            case 3: goto L145;
            case 4: goto L93;
            case 5: goto L91;
            case 6: goto L89;
            case 7: goto L87;
            case 8: goto L81;
            case 9: goto L75;
            case 10: goto L36;
            case 11: goto L34;
            case 12: goto L33;
            case 13: goto L28;
            case 14: goto L23;
            case 15: goto L8;
            case 16: goto L6;
            default: goto L4;
        };
    L4:
        ((ea2) r15).f((pd1) r5);
        return r4;
    L6:
        ((b0) r15).removeOnAttachStateChangeListener((vc1) r5);
        return r4;
    L8:
        x03 r16 = (x03) r15;
        z80 r6 = (z80) r5;
        Object[] r1 = r16.b;
        long[] r17 = r16.a;
        int r7 = r17.length - 2;
        if (r7 < 0) goto L22;
        int r8 = 0;
    L11:
        long r9 = r17[r8];
        if (((((~r9) << 7) & r9) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L20;
        int r10 = 8 - ((~(r8 - r7)) >>> 31);
        int r11 = 0;
    L14:
        if (r11 >= r10) goto L19;
        if ((255 & r9) >= 128) goto L18;
        r6.z(r1[(r8 << 3) + r11]);
    L18:
        r9 = r9 >> 8;
        r11 = r11 + 1;
        goto L14
    L19:
        if (r10 != 8) goto L22;
    L20:
        if (r8 == r7) goto L22;
        r8 = r8 + 1;
    L22:
        return r4;
    L23:
        mv3 r12 = (mv3) r5;
        if (((fl) ((jv3) r15).n).get() != 0) goto L27;
        r12.invoke();
    L27:
        return r4;
    L28:
        ArrayAdapter r18 = (ArrayAdapter) r15;
        AutoCompleteTextView r13 = (AutoCompleteTextView) r5;
        if (r18.getCount() <= 0) goto L31;
        r18.getFilter().filter(null);
        r13.showDropDown();
    L31:
        return r4;
    L34:
        lm0 r14 = (lm0) r5;
        lc3 r19 = (lc3) ((dp0) r15).getValue();
        return new nc3(r14, r19, new ue1((j02) ((g82) r14.d.s).getValue(), r19));
    L36:
        jx3 r20 = (jx3) r5;
        w12 r110 = ((c72) r15).Q;
        if ((((cx2) r110.g).q & 8) == 0) goto L74;
        cx2 r111 = (sq4) r110.f;
    L39:
        if (r111 == null) goto L74;
        if ((r111.p & 8) == 0) goto L73;
        ?? r2 = r111;
        ?? r21 = 0;
    L43:
        if (r2 == 0) goto L73;
        if ((r2 instanceof g94) == true) goto L46;
        if ((r2.p & 8) == 0) goto L72;
        if ((r2 instanceof fo0) == false) goto L72;
        cx2 r22 = ((fo0) r2).C;
        int r23 = 0;
        r2 = r2;
        r21 = r21;
    L58:
        if (r22 == null) goto L70;
        if ((r22.p & 8) == 0) goto L69;
        r23 = r23 + 1;
        r21 = r21;
        if (r23 != 1) goto L64;
        r2 = r22;
        goto L69
    L64:
        if (r21 != 0) goto L66;
        r21 = new f13(new cx2[16]);
    L66:
        if (r2 == 0) goto L68;
        r21.b(r2);
        r2 = 0;
    L68:
        r21.b(r22);
    L69:
        r22 = r22.s;
        r2 = r2;
        r21 = r21;
        goto L58
    L70:
        if (r23 == 1) goto L43;
    L72:
        r2 = j51.c(r21);
        goto L43
    L46:
        g94 r24 = (g94) r2;
        if (r24.u() == false) goto L50;
        e94 r25 = new e94();
        r20.n = r25;
        r25.q = true;
    L50:
        if (r24.d0() == false) goto L52;
        ((e94) r20.n).p = true;
    L52:
        r24.c0((q94) r20.n);
    L73:
        r111 = r111.r;
    L74:
        return r4;
    L75:
        j52 r26 = (j52) r5;
        bl2 r112 = ((LanReceiverService) r15).v;
        if (r112 == null) goto L79;
        ((bj2) r112.get()).v(r26);
        return r4;
    L79:
        h12.Q("browserFuture");
        throw null;
    L81:
        String r113 = (String) r15;
        String r27 = (String) r5;
        rr1 r28 = rr1.a;
        String r29 = ((HubMe) rr1.s(lg2.X(new kd3[]{new kd3("username", r113), new kd3("password", r27)}), "/api/auth/login", HubMe.class)).getUsername();
        if (r29 == null) goto L86;
        r113 = r29;
    L86:
        return new kd3(r113, r27);
    L87:
        ((cm1) r15).d((cx2) r5);
        return r4;
    L89:
        ((jx3) r15).n = kb4.q((ea1) r5, fg3.a);
        return r4;
    L91:
        ((jx3) r15).n = ((ba1) r5).s0();
        return r4;
    L93:
        rg1 r114 = ((x80) r15).n;
        ig4 r30 = r114.c;
        hg4 r31 = r30.d();
        int r32 = 0;
    L206:
    L110:
        th = move-exception;
        r31.c();
        throw th;
    L95:
        if (r32 >= r30.o) goto L131;
        if (r31.l(r32) == false) goto L112;
        Object r33 = r31.n(r32);     // Catch: Throwable -> L110
        if (r33 == r5) goto L108;
        if ((r33 instanceof wg1) == false) goto L103;
        wg1 r34 = (wg1) r33;     // Catch: Throwable -> L110
    L104:
        if (r34 == null) goto L106;
        vy3 r35 = r34.a;     // Catch: Throwable -> L110
    L107:
        if (r35 != r5) goto L112;
    L106:
        r35 = null;
        goto L107
    L103:
        r34 = null;
    L108:
        u73 r36 = new u73(r32, null);     // Catch: Throwable -> L110
        r31.c();
        r3 = r36;
    L133:
        if (r3 == null) goto L140;
        int r37 = r3.a;
        Integer r38 = r3.b;
        hg4 r39 = r30.d();
        ArrayList r40 = gh0.H(r39, r37, r38);     // Catch: Throwable -> L137
        r39.c();
        List r41 = q40.G0(r40, r114.A());
    L142:
        return new c80(r41, r114.C);
    L137:
        th = move-exception;
        r39.c();
        throw th;
    L140:
        r41 = u01.n;
    L112:
        int[] r42 = r31.b;     // Catch: Throwable -> L110
        int r43 = kg4.b(r42, r32);     // Catch: Throwable -> L110
        int r44 = r32 + 1;     // Catch: Throwable -> L110
        if (r44 >= r31.c) goto L115;
        int r45 = r42[(r44 * 5) + 4];     // Catch: Throwable -> L110
    L116:
        int r46 = r45 - r43;     // Catch: Throwable -> L110
        int r47 = 0;
    L117:
        if (r47 >= r46) goto L132;
        Object r48 = r31.h(r32, r47);     // Catch: Throwable -> L110
        if (r48 == r5) goto L130;
        if ((r48 instanceof wg1) == false) goto L123;
        wg1 r49 = (wg1) r48;     // Catch: Throwable -> L110
    L124:
        if (r49 == null) goto L126;
        vy3 r50 = r49.a;     // Catch: Throwable -> L110
    L127:
        if (r50 == r5) goto L130;
        r47 = r47 + 1;     // Catch: Throwable -> L110
        goto L117
    L126:
        r50 = null;
        goto L127
    L123:
        r49 = null;
    L130:
        r3 = new u73(r32, Integer.valueOf(r47));     // Catch: Throwable -> L110
        goto L131
    L132:
        r32 = r44;
        goto L206
    L115:
        r45 = r31.e;     // Catch: Throwable -> L110
    L131:
        r31.c();
        goto L133
    L145:
        gf1 r115 = (gf1) r15;
        f63 r51 = (f63) r5;
        if (r115 == null) goto L152;
        wv3 r116 = (wv3) r115.invoke();
        if (r116 == null) goto L152;
        return r116;
    L152:
        if (r51.A0().A == true) goto L155;
        r51 = null;
    L155:
        if (r51 != null) goto L157;
        return null;
    L157:
        return bu.d(0, l93.o0(r51.p));
    L158:
        vo r117 = (vo) r15;
        e72 r52 = (e72) r5;
        r117.H = r117.C.a(r52.n.P(), r52.getLayoutDirection(), r52);
        return r4;
    L160:
        p64 r118 = (p64) r15;
        ya r53 = (ya) r5;
        h64 r54 = r118.r;
        h64 r55 = r118.s;
        Float r56 = r118.p;
        Float r57 = r118.q;
        if (r54 == null) goto L164;
        if (r56 == null) goto L164;
        float r58 = ((Number) r54.a.invoke()).floatValue() - r56.floatValue();
    L165:
        if (r55 == null) goto L168;
        if (r57 == null) goto L168;
        float r59 = ((Number) r55.a.invoke()).floatValue() - r57.floatValue();
    L170:
        if (r58 == 0.0f) goto L172;
    L174:
        int r60 = r53.A(r118.n);
        k94 r61 = (k94) r53.s().b(r53.x);
        if (r61 != null) goto L209;
    L179:
        k94 r62 = (k94) r53.s().b(r53.y);
        if (r62 != null) goto L207;
    L184:
        r53.q.invalidate();
        k94 r63 = (k94) r53.s().b(r60);
        if (r63 == null) goto L195;
        i94 r64 = r63.a;
        if (r64 == null) goto L195;
        c72 r65 = r64.c;
        if (r65 == null) goto L195;
        if (r54 == null) goto L192;
        r53.C.i(r60, r54);
    L192:
        if (r55 == null) goto L194;
        r53.D.i(r60, r55);
    L194:
        r53.w(r65);
    L195:
        if (r54 == null) goto L197;
        r118.p = (Float) r54.a.invoke();
    L197:
        if (r55 == null) goto L199;
        r118.q = (Float) r55.a.invoke();
    L199:
        return r4;
    L207:
        v3 r66 = r53.A;     // Catch: IllegalStateException -> L203
        if (r66 == null) goto L184;
        r66.a.setBoundsInScreen(r53.k(r62));     // Catch: IllegalStateException -> L203
        goto L184
    L209:
        v3 r67 = r53.z;     // Catch: IllegalStateException -> L202
        if (r67 == null) goto L179;
        r67.a.setBoundsInScreen(r53.k(r61));     // Catch: IllegalStateException -> L202
        goto L179
    L172:
        if (r59 != 0.0f) goto L174;
    L168:
        r59 = 0.0f;
    L164:
        r58 = 0.0f;
        goto L165
    L33:
        return new z82((x44) r15, v01.n, (w44) r5);
    L201:
        return Boolean.valueOf(ra.c((ra) r15, (KeyEvent) r5));
    }
}
