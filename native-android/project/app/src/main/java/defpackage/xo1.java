package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.eddyizm.tempus.viewmodel.b;
import java.util.List;
import java.util.stream.Collectors;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xo1 implements a83 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cp1 b;

    public /* synthetic */ xo1(cp1 r1, int r2) {
        this.a = r2;
        this.b = r1;
    }

    @Override // defpackage.a83
    public final void b(Object r7) {
        int r0 = this.a;
        boolean r3 = true;
        int r4 = 8;
        cp1 r6 = this.b;
        switch(r0) {
            case 0: goto L277;
            case 1: goto L256;
            case 2: goto L246;
            case 3: goto L232;
            case 4: goto L221;
            case 5: goto L207;
            case 6: goto L185;
            case 7: goto L174;
            case 8: goto L160;
            case 9: goto L149;
            case 10: goto L138;
            case 11: goto L127;
            case 12: goto L113;
            case 13: goto L95;
            case 14: goto L73;
            case 15: goto L62;
            case 16: goto L51;
            case 17: goto L41;
            case 18: goto L31;
            case 19: goto L25;
            case 20: goto L21;
            case 21: goto L15;
            default: goto L4;
        };
    L4:
        List r8 = (List) r7;
        tc1 r1 = r6.l0;
        if (r8 != null) goto L8;
        if (r1 == null) goto L287;
        r1.f0.setVisibility(8);
        return;
    L287:
        return;
    L8:
        if (r1 == null) goto L13;
        LinearLayout r2 = r1.f0;
        if (r8.isEmpty() == true) goto L12;
        r4 = 0;
    L12:
        r2.setVisibility(r4);
    L13:
        r6.w0.p(r8);
        return;
    L15:
        List r9 = (List) r7;
        e03.o(r9);
        if (r9 != null) goto L18;
        return;
    L18:
        if (r9.isEmpty() == true) goto L290;
        bo2.o(r6.F0, r9, 0);
        ((au) r6.m0.V.n).d(true);
        return;
    L290:
        return;
    L21:
        List r10 = (List) r7;
        e03.o(r10);
        if (r10.isEmpty() == true) goto L291;
        bo2.o(r6.F0, r10, 0);
        ((au) r6.m0.V.n).d(true);
        return;
    L291:
        return;
    L25:
        List r11 = (List) r7;
        e03.o(r11);
        if (r11 != null) goto L28;
        return;
    L28:
        if (r11.isEmpty() == true) goto L293;
        bo2.o(r6.F0, r11, 0);
        ((au) r6.m0.V.n).d(true);
        return;
    L293:
        return;
    L31:
        Boolean r12 = (Boolean) r7;
        if (r6.u0 == null) goto L294;
        String r5 = (String) r6.p0.b.d();
        ni4 r13 = r6.u0;
        if (r12 != null) goto L36;
    L38:
        r3 = false;
    L39:
        r13.s(r5, r3);
        return;
    L36:
        if (r12.booleanValue() == false) goto L38;
    L294:
        return;
    L41:
        String r14 = (String) r7;
        if (r6.u0 == null) goto L295;
        Boolean r15 = (Boolean) r6.p0.c.d();
        ni4 r16 = r6.u0;
        if (r15 != null) goto L46;
    L48:
        r3 = false;
    L49:
        r16.s(r14, r3);
        return;
    L46:
        if (r15.booleanValue() == false) goto L48;
    L295:
        return;
    L51:
        List r17 = (List) r7;
        tc1 r18 = r6.l0;
        if (r17 != null) goto L55;
        if (r18 == null) goto L296;
        r18.o.setVisibility(8);
        return;
    L296:
        return;
    L55:
        if (r18 == null) goto L60;
        LinearLayout r19 = r18.o;
        if (r17.isEmpty() == true) goto L59;
        r4 = 0;
    L59:
        r19.setVisibility(r4);
    L60:
        uc4 r20 = r6.C0;
        r20.s = r17;
        r20.d();
        return;
    L62:
        List r21 = (List) r7;
        tc1 r22 = r6.l0;
        if (r21 != null) goto L66;
        if (r22 == null) goto L298;
        r22.u.setVisibility(8);
        return;
    L298:
        return;
    L66:
        if (r22 == null) goto L71;
        LinearLayout r23 = r22.u;
        if (r21.isEmpty() == true) goto L70;
        r4 = 0;
    L70:
        r23.setVisibility(r4);
    L71:
        r6.y0.p(r21);
        return;
    L73:
        List r24 = (List) r7;
        if (r24 != null) goto L76;
    L88:
        tc1 r25 = r6.l0;
        if (r25 == null) goto L91;
        r25.p.setVisibility(8);
    L91:
        tc1 r26 = r6.l0;
        if (r26 == null) goto L301;
        r26.c.setVisibility(8);
        return;
    L301:
        return;
    L76:
        if (r24.isEmpty() == true) goto L88;
        tc1 r27 = r6.l0;
        if (r27 == null) goto L81;
        r27.p.setVisibility(0);
    L81:
        tc1 r28 = r6.l0;
        if (r28 == null) goto L84;
        r28.c.setVisibility(0);
    L84:
        tc1 r29 = r6.l0;
        if (r29 == null) goto L87;
        RecyclerView r30 = r29.q0;
        r6.Z();
        r30.setLayoutManager(new GridLayoutManager(g12.y(r24.size(), 5), 0));
    L87:
        r6.v0.r((List) r24.stream().map(new m7(25)).collect(Collectors.toList()));
        r6.i0();
        return;
    L95:
        List r31 = (List) r7;
        tc1 r32 = r6.l0;
        if (r31 != null) goto L99;
        if (r32 == null) goto L302;
        r32.t.setVisibility(8);
        return;
    L302:
        return;
    L99:
        if (r32 == null) goto L105;
        LinearLayout r33 = r32.t;
        if (r31.isEmpty() == true) goto L103;
        int r34 = 0;
    L104:
        r33.setVisibility(r34);
        goto L105
    L103:
        r34 = 8;
    L105:
        tc1 r35 = r6.l0;
        if (r35 == null) goto L111;
        View r36 = r35.d;
        if (r31.isEmpty() == true) goto L110;
        r4 = 0;
    L110:
        r36.setVisibility(r4);
    L111:
        vi r37 = r6.s0;
        r37.u = r31;
        r37.d();
        return;
    L113:
        List r38 = (List) r7;
        tc1 r39 = r6.l0;
        if (r38 != null) goto L117;
        if (r39 == null) goto L304;
        r39.a0.setVisibility(8);
        return;
    L304:
        return;
    L117:
        if (r39 == null) goto L122;
        LinearLayout r40 = r39.a0;
        if (r38.isEmpty() == true) goto L121;
        r4 = 0;
    L121:
        r40.setVisibility(r4);
    L122:
        tc1 r41 = r6.l0;
        if (r41 == null) goto L125;
        RecyclerView r42 = r41.Z;
        r6.Z();
        r42.setLayoutManager(new GridLayoutManager(g12.y(r38.size(), 10), 0));
    L125:
        uc4 r43 = r6.E0;
        r43.s = r38;
        r43.d();
        return;
    L127:
        List r44 = (List) r7;
        tc1 r45 = r6.l0;
        if (r44 != null) goto L131;
        if (r45 == null) goto L306;
        r45.v.setVisibility(8);
        return;
    L306:
        return;
    L131:
        if (r45 == null) goto L136;
        LinearLayout r46 = r45.v;
        if (r44.isEmpty() == true) goto L135;
        r4 = 0;
    L135:
        r46.setVisibility(r4);
    L136:
        r6.z0.p(r44);
        return;
    L138:
        List r47 = (List) r7;
        tc1 r48 = r6.l0;
        if (r47 != null) goto L142;
        if (r48 == null) goto L308;
        r48.l.setVisibility(8);
        return;
    L308:
        return;
    L142:
        if (r48 == null) goto L147;
        LinearLayout r49 = r48.l;
        if (r47.isEmpty() == true) goto L146;
        r4 = 0;
    L146:
        r49.setVisibility(r4);
    L147:
        vi r50 = r6.t0;
        r50.u = r47;
        r50.d();
        return;
    L149:
        List r51 = (List) r7;
        e03.o(r51);
        tc1 r52 = r6.l0;
        if (r51 != null) goto L153;
        if (r52 == null) goto L310;
        r52.x.setVisibility(8);
        return;
    L310:
        return;
    L153:
        if (r52 == null) goto L158;
        LinearLayout r53 = r52.x;
        if (r51.isEmpty() == true) goto L157;
        r4 = 0;
    L157:
        r53.setVisibility(r4);
    L158:
        s6 r54 = r6.r0;
        r54.r = r51;
        r54.d();
        return;
    L160:
        List r55 = (List) r7;
        tc1 r56 = r6.l0;
        if (r55 != null) goto L164;
        if (r56 == null) goto L312;
        r56.n0.setVisibility(8);
        return;
    L312:
        return;
    L164:
        if (r56 == null) goto L169;
        LinearLayout r57 = r56.n0;
        if (r55.isEmpty() == true) goto L168;
        r4 = 0;
    L168:
        r57.setVisibility(r4);
    L169:
        tc1 r58 = r6.l0;
        if (r58 == null) goto L172;
        RecyclerView r59 = r58.m0;
        r6.Z();
        r59.setLayoutManager(new GridLayoutManager(g12.y(r55.size(), 5), 0));
    L172:
        r6.u0.r(r55);
        r6.h0();
        return;
    L174:
        List r60 = (List) r7;
        e03.o(r60);
        tc1 r61 = r6.l0;
        if (r60 != null) goto L178;
        if (r61 == null) goto L314;
        r61.n.setVisibility(8);
        return;
    L314:
        return;
    L178:
        if (r61 == null) goto L183;
        LinearLayout r62 = r61.n;
        if (r60.isEmpty() == true) goto L182;
        r4 = 0;
    L182:
        r62.setVisibility(r4);
    L183:
        vq0 r63 = r6.q0;
        r63.r = r60;
        r63.d();
        return;
    L185:
        String r64 = (String) r7;
        b r65 = r6.n0;
        le1 r66 = r6.v();
        boolean r67 = r65.e();
        rv2 r68 = r65.d;
        if (r67 == true) goto L189;
        return;
    L189:
        if (r65.d("HOME_SECTOR_DISCOVERY") == true) goto L192;
        r65.c.getClass();
        xi4.q(10, null, null).e(r66, r65.h(r65.l));
    L192:
        if (r65.d("HOME_SECTOR_NEW_RELEASES") == true) goto L195;
        r65.f(r66);
    L195:
        if (r65.d("HOME_SECTOR_MOST_PLAYED") == true) goto L198;
        r68.getClass();
        rv2.m("frequent", 20, null, null).e(r66, r65.h(r65.t));
    L198:
        if (r65.d("HOME_SECTOR_LAST_PLAYED") == true) goto L201;
        r68.getClass();
        rv2.m("recent", 20, null, null).e(r66, r65.h(r65.u));
    L201:
        if (r65.d("HOME_SECTOR_RECENTLY_ADDED") == true) goto L204;
        r68.getClass();
        rv2.m("newest", 20, null, null).e(r66, r65.h(r65.w));
    L204:
        if (r65.d("HOME_SECTOR_FLASHBACK") == true) goto L316;
        r68.n().e(r66, r65.h(r65.v));
        return;
    L316:
        return;
    L207:
        List r69 = (List) r7;
        tc1 r70 = r6.l0;
        if (r69 != null) goto L211;
        if (r70 == null) goto L318;
        r70.s.setVisibility(8);
        return;
    L318:
        return;
    L211:
        if (r70 == null) goto L216;
        LinearLayout r71 = r70.s;
        if (r69.isEmpty() == true) goto L215;
        r4 = 0;
    L215:
        r71.setVisibility(r4);
    L216:
        tc1 r72 = r6.l0;
        if (r72 == null) goto L219;
        RecyclerView r73 = r72.N;
        r6.Z();
        r73.setLayoutManager(new GridLayoutManager(g12.y(r69.size(), 5), 0));
    L219:
        b8 r74 = r6.B0;
        r74.s = r69;
        ((o7) r74.v).filter(r74.u);
        r74.d();
        return;
    L221:
        List r75 = (List) r7;
        tc1 r76 = r6.l0;
        if (r75 != null) goto L225;
        if (r76 == null) goto L320;
        r76.r.setVisibility(8);
        return;
    L320:
        return;
    L225:
        if (r76 == null) goto L230;
        LinearLayout r77 = r76.r;
        if (r75.isEmpty() == true) goto L229;
        r4 = 0;
    L229:
        r77.setVisibility(r4);
    L230:
        r6.A0.p(r75);
        return;
    L232:
        List r78 = (List) r7;
        tc1 r79 = r6.l0;
        if (r78 != null) goto L236;
        if (r79 == null) goto L322;
        r79.P.setVisibility(8);
        return;
    L322:
        return;
    L236:
        if (r79 == null) goto L241;
        LinearLayout r80 = r79.P;
        if (r78.isEmpty() == true) goto L240;
        r4 = 0;
    L240:
        r80.setVisibility(r4);
    L241:
        tc1 r81 = r6.l0;
        if (r81 == null) goto L244;
        RecyclerView r82 = r81.O;
        r6.Z();
        r82.setLayoutManager(new GridLayoutManager(g12.y(r78.size(), 5), 0));
    L244:
        r6.D0.p(r78);
        return;
    L246:
        Boolean r83 = (Boolean) r7;
        if (r6.v0 == null) goto L324;
        String r84 = (String) r6.p0.b.d();
        ni4 r85 = r6.v0;
        if (r83 != null) goto L251;
    L253:
        r3 = false;
    L254:
        r85.s(r84, r3);
        return;
    L251:
        if (r83.booleanValue() == false) goto L253;
    L324:
        return;
    L256:
        List r86 = (List) r7;
        tc1 r87 = r6.l0;
        if (r86 != null) goto L260;
        if (r87 == null) goto L325;
        r87.j0.setVisibility(8);
        return;
    L325:
        return;
    L260:
        if (r87 == null) goto L266;
        LinearLayout r88 = r87.j0;
        if (r86.isEmpty() == true) goto L264;
        int r89 = 0;
    L265:
        r88.setVisibility(r89);
        goto L266
    L264:
        r89 = 8;
    L266:
        tc1 r90 = r6.l0;
        if (r90 == null) goto L272;
        View r91 = r90.b;
        if (r86.isEmpty() == true) goto L271;
        r4 = 0;
    L271:
        r91.setVisibility(r4);
    L272:
        tc1 r92 = r6.l0;
        if (r92 == null) goto L275;
        RecyclerView r93 = r92.i0;
        r6.Z();
        r93.setLayoutManager(new GridLayoutManager(g12.y(r86.size(), 5), 0));
    L275:
        b8 r94 = r6.x0;
        r94.s = r86;
        ((o7) r94.v).filter(r94.u);
        r94.d();
        return;
    L277:
        String r95 = (String) r7;
        if (r6.v0 == null) goto L327;
        Boolean r96 = (Boolean) r6.p0.c.d();
        ni4 r97 = r6.v0;
        if (r96 != null) goto L282;
    L284:
        r3 = false;
    L285:
        r97.s(r95, r3);
        return;
    L282:
        if (r96.booleanValue() == false) goto L284;
    }
}
