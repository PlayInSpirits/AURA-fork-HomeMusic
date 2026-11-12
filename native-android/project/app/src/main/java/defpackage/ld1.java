package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import app.homemusic.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ld1 {
    public final y41 A;
    public w5 B;
    public w5 C;
    public w5 D;
    public ArrayDeque E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public ArrayList K;
    public ArrayList L;
    public ArrayList M;
    public od1 N;
    public final g5 O;
    public final ArrayList a;
    public boolean b;
    public final ss0 c;
    public ArrayList d;
    public ArrayList e;
    public final wc1 f;
    public a93 g;
    public final bd1 h;
    public final AtomicInteger i;
    public final Map j;
    public final Map k;
    public final Map l;
    public ArrayList m;
    public final wo0 n;
    public final CopyOnWriteArrayList o;
    public final ad1 p;
    public final ad1 q;
    public final ad1 r;
    public final ad1 s;
    public final cd1 t;
    public int u;
    public mc1 v;
    public fu w;
    public kc1 x;
    public kc1 y;
    public final dd1 z;

    /* JADX WARN: Type inference failed for: r0v13, types: [ad1] */
    /* JADX WARN: Type inference failed for: r0v14, types: [ad1] */
    /* JADX WARN: Type inference failed for: r0v15, types: [ad1] */
    /* JADX WARN: Type inference failed for: r0v16, types: [ad1] */
    public ld1() {
        this.a = new ArrayList();
        this.c = new ss0(5);
        this.f = new wc1(this);
        this.h = new bd1(0, this);
        this.i = new AtomicInteger();
        this.j = Collections.synchronizedMap(new HashMap());
        this.k = Collections.synchronizedMap(new HashMap());
        this.l = Collections.synchronizedMap(new HashMap());
        wo0 r0 = new wo0();
        r0.n = new CopyOnWriteArrayList();
        r0.o = this;
        this.n = r0;
        this.o = new CopyOnWriteArrayList();
        final int r1 = 0;
        this.p = new ad1(this, r1);
        final int r2 = 1;
        this.q = new ad1(this, r2);
        final int r3 = 2;
        this.r = new ad1(this, r3);
        final int r4 = 3;
        this.s = new ad1(this, r4);
        this.t = new cd1(this);
        this.u = -1;
        this.z = new dd1(this);
        this.A = new y41(14);
        this.E = new ArrayDeque();
        this.O = new g5(13, this);
    }

    public static boolean I(int r1) {
        if (Log.isLoggable("FragmentManager", r1) == false) goto L6;
        return true;
    L6:
        return false;
    }

    public static boolean J(kc1 r5) {
        if (r5.P == true) goto L5;
    L6:
        ArrayList r6 = r5.H.c.w();
        int r0 = r6.size();
        boolean r2 = false;
        int r3 = 0;
    L7:
        if (r3 >= r0) goto L14;
        Object r4 = r6.get(r3);
        r3 = r3 + 1;
        kc1 r7 = (kc1) r4;
        if (r7 == null) goto L11;
        r2 = J(r7);
    L11:
        if (r2 == false) goto L7;
        return true;
    L14:
        return false;
    L5:
        if (r5.Q == false) goto L6;
        return true;
    }

    public static boolean L(kc1 r1) {
        if (r1 != null) goto L5;
        return true;
    L5:
        if (r1.Q == true) goto L7;
        return false;
    L7:
        if (r1.F != null) goto L9;
        return true;
    L9:
        if (L(r1.I) == false) goto L16;
        return true;
    L16:
        return false;
    }

    public static boolean M(kc1 r2) {
        if (r2 == null) goto L13;
        ld1 r0 = r2.F;
        if (r2 == r0.y) goto L8;
        return false;
    L8:
        if (M(r0.x) == false) goto L11;
        return true;
    L11:
        return false;
    L13:
        return true;
    }

    public static void e0(kc1 r2) {
        if (I(2) == false) goto L6;
        Log.v("FragmentManager", "show: " + r2);
    L6:
        if (r2.M == false) goto L9;
        r2.M = false;
        r2.X = !r2.X;
        return;
    }

    public final void A(ArrayList r30, ArrayList r31, int r32, int r33) {
        String r5 = "FragmentNavigator";
        ss0 r6 = this.c;
        boolean r8 = ((po) r30.get(r32)).p;
        ArrayList r9 = this.M;
        if (r9 != null) goto L5;
        this.M = new ArrayList();
    L6:
        this.M.addAll(r6.x());
        kc1 r10 = this.y;
        int r11 = r32;
        boolean r12 = false;
    L7:
        if (r11 >= r33) goto L75;
        po r13 = (po) r30.get(r11);
        boolean r16 = ((Boolean) r31.get(r11)).booleanValue();
        ArrayList r14 = this.M;
        if (r16 == true) goto L53;
        ArrayList r15 = r13.a;
        int r17 = 0;
    L12:
        if (r17 >= r15.size()) goto L52;
        je1 r7 = (je1) r15.get(r17);
        boolean r18 = r8;
        int r19 = r7.a;
        int r110 = r11;
        int r111 = 1;
        if (r19 == 1) goto L50;
        if (r19 != 2) goto L18;
        r12 = r12;
        kc1 r20 = r7.b;
        int r112 = r20.K;
        int r113 = r14.size() - 1;
        boolean r22 = false;
    L34:
        if (r113 < 0) goto L45;
        int r24 = r113;
        kc1 r114 = (kc1) r14.get(r113);
        String r23 = r5;
        if (r114.K != r112) goto L43;
        if (r114 != r20) goto L39;
        r112 = r112;
        r22 = true;
    L44:
        r113 = r24 - 1;
        r112 = r112;
        r5 = r23;
        goto L34
    L39:
        if (r114 != r10) goto L41;
        r15.add(r17, new je1(9, r114, 0));
        r17 = r17 + 1;
        int r21 = 0;
        r10 = null;
    L42:
        je1 r115 = new je1(3, r114, r21);
        r115.d = r7.d;
        r115.f = r7.f;
        r115.e = r7.e;
        r115.g = r7.g;
        r15.add(r17, r115);
        r14.remove(r114);
        r17 = r17 + 1;
        r10 = r10;
        goto L44
    L41:
        r21 = 0;
        goto L42
    L43:
        r112 = r112;
        goto L44
    L45:
        r5 = r5;
        r111 = 1;
        if (r22 == false) goto L48;
        r15.remove(r17);
        r17 = r17 - 1;
    L51:
        r17 = r17 + r111;
        r8 = r18;
        r11 = r110;
        r12 = r12;
        r5 = r5;
        goto L12
    L48:
        r7.a = 1;
        r7.c = true;
        r14.add(r20);
        goto L51
    L18:
        if (r19 != 3) goto L20;
    L29:
        r12 = r12;
        r14.remove(r7.b);
        kc1 r25 = r7.b;
        if (r25 != r10) goto L27;
        r15.add(r17, new je1(9, r25));
        r17 = r17 + 1;
        r10 = null;
    L27:
        r111 = 1;
        goto L51
    L20:
        if (r19 == 6) goto L29;
        if (r19 != 7) goto L24;
        r111 = 1;
        goto L50
    L24:
        if (r19 == 8) goto L26;
        r12 = r12;
        goto L27
    L26:
        r12 = r12;
        r15.add(r17, new je1(9, r10, 0));
        r7.c = true;
        r17 = r17 + 1;
        r10 = r7.b;
    L50:
        r14.add(r7.b);
        goto L51
    L52:
        String r26 = r5;
        boolean r116 = r8;
        int r117 = r11;
        boolean r27 = r12;
    L68:
        if (r27 == false) goto L70;
    L73:
        r12 = true;
    L74:
        r11 = r117 + 1;
        r8 = r116;
        r5 = r26;
        goto L7
    L70:
        if (r13.g == true) goto L73;
        r12 = false;
        goto L74
    L53:
        r26 = r5;
        r116 = r8;
        r117 = r11;
        r27 = r12;
        int r118 = 1;
        ArrayList r28 = r13.a;
        int r29 = r28.size() - 1;
    L54:
        if (r29 < 0) goto L68;
        je1 r34 = (je1) r28.get(r29);
        int r119 = r34.a;
        if (r119 == r118) goto L66;
        if (r119 == 3) goto L64;
        switch(r119) {
            case 6: goto L64;
            case 7: goto L66;
            case 8: goto L63;
            case 9: goto L62;
            case 10: goto L61;
            default: goto L67;
        };
    L61:
        r34.i = r34.h;
        goto L67
    L62:
        r10 = r34.b;
        goto L67
    L63:
        r10 = null;
    L67:
        r29 = r29 - 1;
        r118 = 1;
    L64:
        r14.add(r34.b);
    L66:
        r14.remove(r34.b);
        goto L67
    L75:
        String r210 = r5;
        boolean r120 = r8;
        boolean r211 = r12;
        this.M.clear();
        if (r120 == false) goto L78;
    L89:
        String r35 = "Unknown cmd: ";
        int r36 = r32;
    L91:
        if (r36 >= r33) goto L165;
        po r37 = (po) r30.get(r36);
        if (((Boolean) r31.get(r36)).booleanValue() == false) goto L135;
        r37.d(-1);
        ld1 r38 = r37.q;
        ArrayList r39 = r37.a;
        int r121 = r39.size() - 1;
    L95:
        if (r121 < 0) goto L164;
        je1 r122 = (je1) r39.get(r121);
        kc1 r123 = r122.b;
        if (r123 == null) goto L120;
        r123.z = r37.t;
        if (r123.W == null) goto L102;
        r123.k().a = true;
    L102:
        int r124 = r37.f;
        int r125 = 8194;
        int r126 = 4097;
        if (r124 == 4097) goto L112;
        if (r124 == 8194) goto L114;
        r126 = 4100;
        if (r124 == 8197) goto L114;
        r125 = 4099;
        if (r124 == 4099) goto L112;
        if (r124 == 4100) goto L111;
        r126 = 0;
        goto L114
    L111:
        r126 = 8197;
    L114:
        if (r123.W != null) goto L117;
        if (r126 != 0) goto L117;
    L118:
        r123.k();
        r123.W.getClass();
    L117:
        r123.k();
        r123.W.f = r126;
    L112:
        r126 = r125;
    L120:
        switch(r122.a) {
            case 1: goto L132;
            case 2: goto L121;
            case 3: goto L131;
            case 4: goto L130;
            case 5: goto L129;
            case 6: goto L128;
            case 7: goto L127;
            case 8: goto L126;
            case 9: goto L125;
            case 10: goto L123;
            default: goto L121;
        };
    L123:
        r38.b0(r123, r122.h);
    L133:
        r121 = r121 - 1;
        goto L95
    L125:
        r38.c0(r123);
        goto L133
    L126:
        r38.c0(null);
        goto L133
    L127:
        r123.b0(r122.d, r122.e, r122.f, r122.g);
        r38.Y(r123, true);
        r38.g(r123);
        goto L133
    L128:
        r123.b0(r122.d, r122.e, r122.f, r122.g);
        r38.c(r123);
        goto L133
    L129:
        r123.b0(r122.d, r122.e, r122.f, r122.g);
        r38.Y(r123, true);
        r38.H(r123);
        goto L133
    L130:
        r123.b0(r122.d, r122.e, r122.f, r122.g);
        r38.getClass();
        e0(r123);
        goto L133
    L131:
        r123.b0(r122.d, r122.e, r122.f, r122.g);
        r38.a(r123);
        goto L133
    L132:
        r123.b0(r122.d, r122.e, r122.f, r122.g);
        r38.Y(r123, true);
        r38.T(r123);
        goto L133
    L121:
        mj0.f(r122.a, r35);
        return;
    L164:
        r36 = r36 + 1;
        r35 = r35;
        goto L91
    L135:
        r37.d(1);
        ld1 r40 = r37.q;
        ArrayList r41 = r37.a;
        int r127 = r41.size();
        int r128 = 0;
    L136:
        if (r128 >= r127) goto L164;
        je1 r129 = (je1) r41.get(r128);
        kc1 r130 = r129.b;
        if (r130 == null) goto L150;
        r130.z = r37.t;
        if (r130.W == null) goto L143;
        r130.k().a = false;
    L143:
        int r131 = r37.f;
        if (r130.W != null) goto L147;
        if (r131 != 0) goto L147;
    L148:
        r130.k();
        r130.W.getClass();
    L147:
        r130.k();
        r130.W.f = r131;
    L150:
        switch(r129.a) {
            case 1: goto L162;
            case 2: goto L151;
            case 3: goto L161;
            case 4: goto L160;
            case 5: goto L159;
            case 6: goto L158;
            case 7: goto L157;
            case 8: goto L156;
            case 9: goto L155;
            case 10: goto L153;
            default: goto L151;
        };
    L153:
        r40.b0(r130, r129.i);
    L163:
        r128 = r128 + 1;
        r35 = r35;
        goto L136
    L155:
        r40.c0(null);
        goto L163
    L156:
        r40.c0(r130);
        goto L163
    L157:
        r130.b0(r129.d, r129.e, r129.f, r129.g);
        r40.Y(r130, false);
        r40.c(r130);
        goto L163
    L158:
        r130.b0(r129.d, r129.e, r129.f, r129.g);
        r40.g(r130);
        goto L163
    L159:
        r130.b0(r129.d, r129.e, r129.f, r129.g);
        r40.Y(r130, false);
        e0(r130);
        goto L163
    L160:
        r130.b0(r129.d, r129.e, r129.f, r129.g);
        r40.H(r130);
        goto L163
    L161:
        r130.b0(r129.d, r129.e, r129.f, r129.g);
        r40.T(r130);
        goto L163
    L162:
        r130.b0(r129.d, r129.e, r129.f, r129.g);
        r40.Y(r130, false);
        r40.a(r130);
        goto L163
    L151:
        mj0.f(r129.a, r35);
        return;
    L165:
        boolean r42 = ((Boolean) r31.get(r33 - 1)).booleanValue();
        if (r211 == false) goto L267;
        ArrayList r43 = this.m;
        if (r43 == null) goto L267;
        if (r43.isEmpty() == true) goto L267;
        LinkedHashSet r44 = new LinkedHashSet();
        int r45 = r30.size();
        int r46 = 0;
    L172:
        if (r46 >= r45) goto L183;
        Object r132 = r30.get(r46);
        r46 = r46 + 1;
        po r133 = (po) r132;
        HashSet r134 = new HashSet();
        int r135 = 0;
    L175:
        if (r135 >= r133.a.size()) goto L182;
        kc1 r136 = ((je1) r133.a.get(r135)).b;
        if (r136 == null) goto L181;
        if (r133.g == false) goto L181;
        r134.add(r136);
    L181:
        r135 = r135 + 1;
        goto L175
    L182:
        r44.addAll(r134);
        goto L172
    L183:
        ArrayList r47 = this.m;
        int r48 = r47.size();
        int r137 = 0;
    L184:
        if (r137 >= r48) goto L212;
        Object r138 = r47.get(r137);
        r137 = r137 + 1;
        vd1 r139 = (vd1) r138;
        Iterator r140 = r44.iterator();
    L187:
        if (r140.hasNext() == false) goto L184;
        kc1 r141 = (kc1) r140.next();
        d23 r142 = r139.a;
        r141.getClass();
        if (r42 == false) goto L209;
        List r143 = (List) r142.e.n.getValue();
        ListIterator r49 = r143.listIterator(r143.size());
    L192:
        if (r49.hasPrevious() == false) goto L197;
        Object r144 = r49.previous();
        LinkedHashSet r145 = r44;
        ListIterator r212 = r49;
        if (h12.c(((a23) r144).s, r141.L) == true) goto L198;
        r44 = r145;
        r49 = r212;
    L198:
        a23 r146 = (a23) r144;
        if (rd1.n() == false) goto L201;
        String r50 = r210;
        Log.v(r50, "OnBackStackChangedStarted for fragment " + r141 + " associated with entry " + r146);
    L202:
        if (r146 == null) goto L210;
        nl4 r51 = r142.c;
        r51.j(null, kb4.Q((Set) r51.getValue(), r146));
        if (r142.h.g.contains(r146) == false) goto L206;
        r146.x = r92.q;
        r146.e();
        goto L210
    L206:
        kf2.o("Cannot transition entry that is not in the back stack");
        return;
    L210:
        r210 = r50;
        r44 = r145;
        r47 = r47;
        goto L187
    L201:
        r50 = r210;
        goto L202
    L197:
        r145 = r44;
        r144 = null;
        goto L198
    L209:
        r145 = r44;
        r50 = r210;
        goto L210
    L212:
        LinkedHashSet r147 = r44;
        String r52 = r210;
        ArrayList r53 = this.m;
        int r54 = r53.size();
        int r148 = 0;
    L213:
        if (r148 >= r54) goto L267;
        Object r149 = r53.get(r148);
        r148 = r148 + 1;
        vd1 r150 = (vd1) r149;
        Iterator r151 = r147.iterator();
    L216:
        if (r151.hasNext() == false) goto L213;
        kc1 r152 = (kc1) r151.next();
        rd1 r153 = r150.b;
        ArrayList r55 = r153.g;
        r152.getClass();
        ArrayList r213 = r53;
        d23 r56 = r150.a;
        int r214 = r54;
        int r215 = r148;
        ArrayList r57 = q40.G0((Collection) r56.e.n.getValue(), (Iterable) r56.f.n.getValue());
        ListIterator r58 = r57.listIterator(r57.size());
    L219:
        if (r58.hasPrevious() == false) goto L224;
        Object r154 = r58.previous();
        ListIterator r216 = r58;
        Object r217 = r154;
        if (h12.c(((a23) r154).s, r152.L) == true) goto L225;
        r58 = r216;
    L225:
        a23 r59 = (a23) r217;
        if (r42 == true) goto L228;
    L232:
        boolean r218 = false;
    L233:
        int r155 = r55.size();
        vd1 r219 = r150;
        int r156 = 0;
    L234:
        if (r156 >= r155) goto L239;
        Object r220 = r55.get(r156);
        int r157 = r156 + 1;
        int r221 = r155;
        if (h12.c(((kd3) r220).n, r152.L) == true) goto L237;
        r155 = r221;
        r156 = r157;
        goto L234
    L237:
        Object r158 = r220;
    L240:
        kd3 r159 = (kd3) r158;
        if (r159 == null) goto L243;
        r55.remove(r159);
    L243:
        if (r218 == false) goto L245;
    L247:
        if (r159 != null) goto L249;
    L251:
        boolean r60 = false;
    L252:
        if (r42 == true) goto L258;
        if (r60 == true) goto L258;
        if (r59 != null) goto L258;
        kf2.e(b11.l("The fragment ", r152, " is unknown to the FragmentNavigator. Please use the navigate() function to add fragments to the FragmentNavigator managed FragmentManager."));
        return;
    L258:
        if (r59 == null) goto L265;
        r153.l(r152, r59, r56);
        if (r218 == false) goto L265;
        if (rd1.n() == false) goto L264;
        Log.v(r52, "OnBackStackChangedCommitted for fragment " + r152 + " popping associated entry " + r59 + " via system back");
    L264:
        r56.f(r59, false);
    L265:
        r53 = r213;
        r54 = r214;
        r148 = r215;
        r150 = r219;
        goto L216
    L249:
        if (((Boolean) r159.o).booleanValue() != true) goto L251;
        r60 = true;
        goto L252
    L245:
        if (rd1.n() == false) goto L247;
        Log.v(r52, "OnBackStackChangedCommitted for fragment " + r152 + " associated with entry " + r59);
        goto L247
    L239:
        r158 = null;
        goto L240
    L228:
        if (r55.isEmpty() == false) goto L232;
        if (r152.y == false) goto L232;
        r218 = true;
        goto L233
    L224:
        r217 = null;
    L267:
        int r4 = r32;
    L268:
        if (r4 >= r33) goto L283;
        po r61 = (po) r30.get(r4);
        if (r42 == false) goto L277;
        int r62 = r61.a.size() - 1;
    L272:
        if (r62 < 0) goto L282;
        kc1 r63 = ((je1) r61.a.get(r62)).b;
        if (r63 == null) goto L276;
        f(r63).k();
    L276:
        r62 = r62 - 1;
    L282:
        r4 = r4 + 1;
        goto L268
    L277:
        ArrayList r64 = r61.a;
        int r65 = r64.size();
        int r160 = 0;
    L278:
        if (r160 >= r65) goto L282;
        Object r66 = r64.get(r160);
        r160 = r160 + 1;
        kc1 r67 = ((je1) r66).b;
        if (r67 == null) goto L278;
        f(r67).k();
        goto L278
    L283:
        O(this.u, true);
        HashSet r68 = new HashSet();
        int r69 = r32;
    L284:
        if (r69 >= r33) goto L293;
        ArrayList r70 = ((po) r30.get(r69)).a;
        int r71 = r70.size();
        int r161 = 0;
    L286:
        if (r161 >= r71) goto L292;
        Object r72 = r70.get(r161);
        r161 = r161 + 1;
        kc1 r73 = ((je1) r72).b;
        if (r73 == null) goto L286;
        ViewGroup r74 = r73.S;
        if (r74 == null) goto L286;
        r68.add(xm0.f(r74, this));
        goto L286
    L292:
        r69 = r69 + 1;
        goto L284
    L293:
        Iterator r75 = r68.iterator();
    L295:
        if (r75.hasNext() == false) goto L327;
        xm0 r76 = (xm0) r75.next();
        r76.d = r42;
        ArrayList r77 = r76.b;
        monitor-enter(r77);
        r76.g();     // Catch: Throwable -> L319
        ArrayList r78 = r76.b;     // Catch: Throwable -> L319
        ListIterator r79 = r78.listIterator(r78.size());     // Catch: Throwable -> L319
    L300:
        if (r79.hasPrevious() == false) goto L321;
        Object r162 = r79.previous();     // Catch: Throwable -> L319
        pj4 r80 = (pj4) r162;     // Catch: Throwable -> L319
        View r163 = r80.c.T;     // Catch: Throwable -> L319
        r163.getClass();     // Catch: Throwable -> L319
        char r164 = 4;
        if (r163.getAlpha() == 0.0f) goto L304;
    L306:
        int r165 = r163.getVisibility();     // Catch: Throwable -> L319
        if (r165 == 0) goto L314;
        if (r165 != 4) goto L310;
    L316:
        if (r80.a != 2) goto L300;
        if (r164 == 2) goto L300;
    L322:
        pj4 r166 = (pj4) r162;     // Catch: Throwable -> L319
        r76.e = false;     // Catch: Throwable -> L319
        monitor-exit(r77);
        r76.c();
        goto L295
    L310:
        if (r165 != 8) goto L313;
        r164 = 3;
        goto L316
    L313:
        throw new IllegalArgumentException("Unknown visibility " + r165);     // Catch: Throwable -> L319
    L314:
        r164 = 2;
        goto L316
    L304:
        if (r163.getVisibility() != 0) goto L306;
    L321:
        r162 = null;
    L319:
        th = move-exception;
        throw th;
    L327:
        int r81 = r32;
    L328:
        if (r81 >= r33) goto L336;
        po r82 = (po) r30.get(r81);
        if (((Boolean) r31.get(r81)).booleanValue() == false) goto L335;
        if (r82.s < 0) goto L335;
        r82.s = -1;
    L335:
        r82.getClass();
        r81 = r81 + 1;
        goto L328
    L336:
        if (r211 == true) goto L338;
        return;
    L338:
        if (this.m == null) goto L438;
        int r167 = 0;
    L341:
        if (r167 >= this.m.size()) goto L439;
        ((vd1) this.m.get(r167)).getClass();
        r167 = r167 + 1;
        goto L341
    L439:
        return;
    L438:
        return;
    L78:
        if (this.u < 1) goto L89;
        int r83 = r32;
    L80:
        if (r83 >= r33) goto L89;
        ArrayList r84 = ((po) r30.get(r83)).a;
        int r85 = r84.size();
        int r86 = 0;
    L82:
        if (r86 >= r85) goto L88;
        Object r168 = r84.get(r86);
        r86 = r86 + 1;
        kc1 r169 = ((je1) r168).b;
        if (r169 == null) goto L82;
        if (r169.F == null) goto L82;
        r6.E(f(r169));
        goto L82
    L88:
        r83 = r83 + 1;
        goto L80
    L5:
        r9.clear();
        goto L6
    }

    public final int B(int r5, String r6, boolean r7) {
        ArrayList r0 = this.d;
        if (r0 != null) goto L5;
    L44:
        return -1;
    L5:
        if (r0.isEmpty() == true) goto L44;
        if (r6 != null) goto L14;
        if (r5 >= 0) goto L14;
        if (r7 == false) goto L13;
        return 0;
    L13:
        return this.d.size() - 1;
    L14:
        int r1 = this.d.size() - 1;
    L15:
        if (r1 < 0) goto L26;
        po r2 = (po) this.d.get(r1);
        if (r6 != null) goto L19;
    L21:
        if (r5 < 0) goto L25;
        if (r5 == r2.s) goto L26;
    L25:
        r1 = r1 - 1;
        goto L15
    L19:
        if (r6.equals(r2.i) == false) goto L21;
    L26:
        if (r1 >= 0) goto L28;
        return r1;
    L28:
        if (r7 == false) goto L40;
    L29:
        if (r1 <= 0) goto L38;
        po r8 = (po) this.d.get(r1 - 1);
        if (r6 != null) goto L33;
    L34:
        if (r5 < 0) goto L38;
        if (r5 != r8.s) goto L38;
    L37:
        r1 = r1 - 1;
        goto L29
    L33:
        if (r6.equals(r8.i) == true) goto L37;
    L38:
        return r1;
    L40:
        if (r1 != (this.d.size() - 1)) goto L43;
        return -1;
    L43:
        return r1 + 1;
    }

    public final kc1 C(int r5) {
        ss0 r4 = this.c;
        ArrayList r0 = (ArrayList) r4.n;
        int r1 = r0.size() - 1;
    L3:
        if (r1 < 0) goto L10;
        kc1 r2 = (kc1) r0.get(r1);
        if (r2 == null) goto L9;
        if (r2.J != r5) goto L9;
        return r2;
    L9:
        r1 = r1 - 1;
        goto L3
    L10:
        Iterator r6 = ((HashMap) r4.o).values().iterator();
    L12:
        if (r6.hasNext() == false) goto L18;
        fe1 r3 = (fe1) r6.next();
        if (r3 == null) goto L12;
        kc1 r7 = r3.c;
        if (r7.J != r5) goto L12;
        return r7;
    L18:
        return null;
    }

    public final kc1 D(String r5) {
        ss0 r4 = this.c;
        ArrayList r0 = (ArrayList) r4.n;
        if (r5 == null) goto L12;
        int r1 = r0.size() - 1;
    L5:
        if (r1 < 0) goto L12;
        kc1 r2 = (kc1) r0.get(r1);
        if (r2 == null) goto L11;
        if (r5.equals(r2.L) == false) goto L11;
        return r2;
    L11:
        r1 = r1 - 1;
    L12:
        if (r5 == null) goto L21;
        Iterator r6 = ((HashMap) r4.o).values().iterator();
    L15:
        if (r6.hasNext() == false) goto L33;
        fe1 r3 = (fe1) r6.next();
        if (r3 == null) goto L15;
        kc1 r7 = r3.c;
        if (r5.equals(r7.L) == false) goto L15;
        return r7;
    L33:
        return null;
    L21:
        return null;
    }

    public final ViewGroup E(kc1 r2) {
        ViewGroup r0 = r2.S;
        if (r0 == null) goto L6;
        return r0;
    L6:
        if (r2.K > 0) goto L9;
        return null;
    L9:
        if (this.w.I() == false) goto L14;
        View r1 = this.w.H(r2.K);
        if ((r1 instanceof ViewGroup) == true) goto L13;
        return null;
    L13:
        return (ViewGroup) r1;
    L14:
        return null;
    }

    public final dd1 F() {
        kc1 r0 = this.x;
        if (r0 == null) goto L7;
        return r0.F.F();
    L7:
        return this.z;
    }

    public final y41 G() {
        kc1 r0 = this.x;
        if (r0 == null) goto L7;
        return r0.F.G();
    L7:
        return this.A;
    }

    public final void H(kc1 r3) {
        if (I(2) == false) goto L6;
        Log.v("FragmentManager", "hide: " + r3);
    L6:
        if (r3.M == true) goto L9;
        r3.M = true;
        r3.X = true ^ r3.X;
        d0(r3);
        return;
    }

    public final boolean K() {
        kc1 r0 = this.x;
        if (r0 != null) goto L6;
        return true;
    L6:
        if (r0.y() == true) goto L8;
        return false;
    L8:
        if (this.x.q().K() == false) goto L12;
        return true;
    L12:
        return false;
    }

    public final boolean N() {
        if (this.G == false) goto L5;
        return true;
    L5:
        if (this.H == true) goto L11;
        return false;
    L11:
        return true;
    }

    public final void O(int r6, boolean r7) {
        if (this.v == null) goto L5;
    L9:
        if (r7 == false) goto L11;
    L13:
        this.u = r6;
        ss0 r8 = this.c;
        HashMap r9 = (HashMap) r8.o;
        ArrayList r0 = (ArrayList) r8.n;
        int r1 = r0.size();
        int r3 = 0;
    L14:
        if (r3 >= r1) goto L18;
        Object r4 = r0.get(r3);
        r3 = r3 + 1;
        fe1 r5 = (fe1) r9.get(((kc1) r4).r);
        if (r5 == null) goto L14;
        r5.k();
        goto L14
    L18:
        Iterator r10 = r9.values().iterator();
    L20:
        if (r10.hasNext() == false) goto L33;
        fe1 r2 = (fe1) r10.next();
        if (r2 == null) goto L20;
        r2.k();
        kc1 r11 = r2.c;
        if (r11.y == false) goto L20;
        if (r11.A() == true) goto L20;
        if (r11.z == true) goto L30;
    L32:
        r8.F(r2);
        goto L20
    L30:
        if (((HashMap) r8.p).containsKey(r11.r) == true) goto L32;
        r8.G(r11.r, r2.o());
        goto L32
    L33:
        f0();
        if (this.F == false) goto L55;
        mc1 r12 = this.v;
        if (r12 != null) goto L38;
        return;
    L38:
        if (this.u != 7) goto L57;
        r12.E.invalidateOptionsMenu();
        this.F = false;
        return;
    L57:
        return;
    L55:
        return;
    L11:
        if (r6 != this.u) goto L13;
        return;
    L5:
        if (r6 == (-1)) goto L9;
        kf2.o("No activity");
    }

    public final void P() {
        if (this.v == null) goto L11;
        this.G = false;
        this.H = false;
        this.N.g = false;
        Iterator r2 = this.c.x().iterator();
    L7:
        if (r2.hasNext() == false) goto L17;
        kc1 r0 = (kc1) r2.next();
        if (r0 == null) goto L7;
        r0.H.P();
        goto L7
    L17:
        return;
    }

    public final boolean Q() {
        return R(-1, 0);
    }

    public final boolean R(int r9, int r10) {
        y(false);
        x(true);
        kc1 r1 = this.y;
        if (r1 == null) goto L8;
        if (r9 >= 0) goto L8;
        if (r1.m().Q() == false) goto L8;
        return true;
    L8:
        boolean r8 = S(this.K, this.L, null, r9, r10);
        if (r8 == false) goto L16;
        this.b = true;
        U(this.K, this.L);     // Catch: Throwable -> L13
        d();
    L13:
        th = move-exception;
        d();
        throw th;
    L16:
        h0();
        u();
        ((HashMap) this.c.o).values().removeAll(Collections.singleton(null));
        return r8;
    }

    public final boolean S(ArrayList r3, ArrayList r4, String r5, int r6, int r7) {
        if ((r7 & 1) == 0) goto L5;
        boolean r8 = true;
    L6:
        int r9 = B(r6, r5, r8);
        if (r9 >= 0) goto L9;
        return false;
    L9:
        int r10 = this.d.size() - 1;
    L10:
        if (r10 < r9) goto L12;
        r3.add((po) this.d.remove(r10));
        r4.add(Boolean.TRUE);
        r10 = r10 - 1;
        goto L10
    L12:
        return true;
    L5:
        r8 = false;
        goto L6
    }

    public final void T(kc1 r4) {
        if (I(2) == false) goto L5;
        Log.v("FragmentManager", "remove: " + r4 + " nesting=" + r4.E);
    L5:
        boolean r0 = r4.A();
        if (r4.N == false) goto L10;
        if (r0 == false) goto L10;
        return;
    L10:
        ss0 r1 = this.c;
        ArrayList r2 = (ArrayList) r1.n;
        monitor-enter(r2);
        ((ArrayList) r1.n).remove(r4);     // Catch: Throwable -> L19
        monitor-exit(r2);     // Catch: Throwable -> L19
        r4.x = false;
        if (J(r4) == false) goto L17;
        this.F = true;
    L17:
        r4.y = true;
        d0(r4);
        return;
    L19:
        th = move-exception;
        throw th;
    }

    public final void U(ArrayList r5, ArrayList r6) {
        if (r5.isEmpty() == false) goto L6;
        return;
    L6:
        if (r5.size() != r6.size()) goto L26;
        int r0 = r5.size();
        int r1 = 0;
        int r2 = 0;
    L8:
        if (r1 >= r0) goto L23;
        if (((po) r5.get(r1)).p == true) goto L22;
        if (r2 == r1) goto L13;
        A(r5, r6, r2, r1);
    L13:
        r2 = r1 + 1;
        if (((Boolean) r6.get(r1)).booleanValue() == false) goto L21;
    L15:
        if (r2 >= r0) goto L21;
        if (((Boolean) r6.get(r2)).booleanValue() == false) goto L21;
        if (((po) r5.get(r2)).p == true) goto L21;
        r2 = r2 + 1;
    L21:
        A(r5, r6, r1, r2);
        r1 = r2 - 1;
    L22:
        r1 = r1 + 1;
        goto L8
    L23:
        if (r2 == r0) goto L34;
        A(r5, r6, r2, r0);
        return;
    L34:
        return;
    L26:
        kf2.o("Internal error with the back stack records");
    }

    public final void V(Bundle r22) {
        Iterator<String> r2 = r22.keySet().iterator();
    L4:
        if (r2.hasNext() == false) goto L10;
        String r3 = r2.next();
        if (r3.startsWith("result_") == false) goto L4;
        Bundle r4 = r22.getBundle(r3);
        if (r4 == null) goto L4;
        r4.setClassLoader(this.v.B.getClassLoader());
        this.k.put(r3.substring(7), r4);
        goto L4
    L10:
        HashMap r5 = new HashMap();
        Iterator<String> r6 = r22.keySet().iterator();
    L12:
        if (r6.hasNext() == false) goto L18;
        String r7 = r6.next();
        if (r7.startsWith("fragment_") == false) goto L12;
        Bundle r8 = r22.getBundle(r7);
        if (r8 == null) goto L12;
        r8.setClassLoader(this.v.B.getClassLoader());
        r5.put(r7.substring(9), r8);
        goto L12
    L18:
        ss0 r9 = this.c;
        HashMap r10 = (HashMap) r9.p;
        HashMap r11 = (HashMap) r9.o;
        r10.clear();
        r10.putAll(r5);
        nd1 r1 = (nd1) r22.getParcelable("state");
        if (r1 != null) goto L21;
        return;
    L21:
        r11.clear();
        ArrayList r12 = r1.n;
        int r13 = r12.size();
        int r14 = 0;
        int r15 = 0;
    L22:
        wo0 r16 = this.n;
        int r17 = 2;
        if (r15 >= r13) goto L38;
        Object r18 = r12.get(r15);
        r15 = r15 + 1;
        Bundle r19 = r9.G((String) r18, null);
        if (r19 == null) goto L22;
        be1 r110 = (be1) r19.getParcelable("state");
        od1 r111 = this.N;
        kc1 r112 = (kc1) r111.b.get(r110.o);
        if (r112 != null) goto L29;
        r17 = 2;
        Bundle r20 = r19;
        fe1 r113 = new fe1(this.n, this.c, this.v.B.getClassLoader(), F(), r19);
    L34:
        kc1 r114 = r113.c;
        r114.o = r20;
        r114.F = this;
        if (I(r17) == false) goto L37;
        Log.v("FragmentManager", "restoreSaveState: active (" + r114.r + "): " + r114);
    L37:
        r113.m(this.v.B.getClassLoader());
        r9.E(r113);
        r113.e = this.u;
        goto L22
    L29:
        if (I(2) == false) goto L32;
        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + r112);
    L32:
        r113 = new fe1(r16, r9, r112, r19);
        r20 = r19;
        goto L34
    L38:
        od1 r21 = this.N;
        r21.getClass();
        ArrayList r23 = new ArrayList(r21.b.values());
        int r24 = r23.size();
        int r25 = 0;
    L40:
        if (r25 >= r24) goto L48;
        Object r115 = r23.get(r25);
        r25 = r25 + 1;
        kc1 r116 = (kc1) r115;
        if (r11.get(r116.r) != null) goto L40;
        if (I(2) == false) goto L47;
        Log.v("FragmentManager", "Discarding retained Fragment " + r116 + " that was not found in the set of active Fragments " + r1.n);
    L47:
        this.N.f(r116);
        r116.F = this;
        fe1 r117 = new fe1(r16, r9, r116);
        r117.e = 1;
        r117.k();
        r116.y = true;
        r117.k();
        goto L40
    L48:
        ArrayList r26 = r1.o;
        ((ArrayList) r9.n).clear();
        if (r26 == null) goto L61;
        int r27 = r26.size();
        int r28 = 0;
    L51:
        if (r28 >= r27) goto L61;
        Object r29 = r26.get(r28);
        r28 = r28 + 1;
        String r30 = (String) r29;
        kc1 r31 = r9.t(r30);
        if (r31 == null) goto L58;
        if (I(2) == false) goto L57;
        Log.v("FragmentManager", "restoreSaveState: added (" + r30 + "): " + r31);
    L57:
        r9.o(r31);
        goto L51
    L58:
        kf2.o(xa3.h("No instantiated fragment for (", r30, ")"));
        return;
    L61:
        if (r1.p == null) goto L76;
        this.d = new ArrayList(r1.p.length);
        int r32 = 0;
    L63:
        qo[] r33 = r1.p;
        if (r32 >= r33.length) goto L77;
        qo r34 = r33[r32];
        ArrayList r35 = r34.o;
        po r36 = new po(this);
        r34.a(r36);
        r36.s = r34.t;
        int r37 = 0;
    L67:
        if (r37 >= r35.size()) goto L72;
        String r38 = (String) r35.get(r37);
        if (r38 == null) goto L71;
        ((je1) r36.a.get(r37)).b = r9.t(r38);
    L71:
        r37 = r37 + 1;
        goto L67
    L72:
        r36.d(1);
        if (I(2) == false) goto L75;
        StringBuilder r39 = f34.j(r32, "restoreAllState: back stack #", " (index ");
        r39.append(r36.s);
        r39.append("): ");
        r39.append(r36);
        Log.v("FragmentManager", r39.toString());
        PrintWriter r40 = new PrintWriter(new fe2());
        r36.h("  ", r40, false);
        r40.close();
    L75:
        this.d.add(r36);
        r32 = r32 + 1;
    L77:
        this.i.set(r1.q);
        String r41 = r1.r;
        if (r41 == null) goto L80;
        kc1 r42 = r9.t(r41);
        this.y = r42;
        q(r42);
    L80:
        ArrayList r43 = r1.s;
        if (r43 != null) goto L83;
    L85:
        this.E = new ArrayDeque(r1.u);
        return;
    L83:
        if (r14 >= r43.size()) goto L85;
        this.j.put((String) r43.get(r14), (ro) r1.t.get(r14));
        r14 = r14 + 1;
        goto L83
    L76:
        this.d = null;
        goto L77
    }

    public final Bundle W() {
        Bundle r0 = new Bundle();
        Iterator r1 = e().iterator();
    L3:
        int r3 = 0;
        if (r1.hasNext() == false) goto L11;
        xm0 r2 = (xm0) r1.next();
        if (r2.e == false) goto L3;
        if (I(2) == false) goto L10;
        Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
    L10:
        r2.e = false;
        r2.c();
        goto L3
    L11:
        Iterator r4 = e().iterator();
    L13:
        if (r4.hasNext() == false) goto L15;
        ((xm0) r4.next()).e();
        goto L13
    L15:
        y(true);
        this.G = true;
        this.N.g = true;
        ss0 r5 = this.c;
        r5.getClass();
        HashMap r6 = (HashMap) r5.o;
        ArrayList r7 = new ArrayList(r6.size());
        Iterator r8 = r6.values().iterator();
    L17:
        if (r8.hasNext() == false) goto L23;
        fe1 r9 = (fe1) r8.next();
        if (r9 == null) goto L17;
        kc1 r10 = r9.c;
        r5.G(r10.r, r9.o());
        r7.add(r10.r);
        if (I(2) == false) goto L17;
        Log.v("FragmentManager", "Saved state of " + r10 + ": " + r10.o);
        goto L17
    L23:
        HashMap r11 = (HashMap) this.c.p;
        if (r11.isEmpty() == true) goto L26;
        ss0 r12 = this.c;
        ArrayList r13 = (ArrayList) r12.n;
        monitor-enter(r13);
    L35:
        th = move-exception;
        throw th;
    L32:
        if (((ArrayList) r12.n).isEmpty() == false) goto L37;
        monitor-exit(r13);     // Catch: Throwable -> L35
        ArrayList r14 = null;
    L43:
        ArrayList r15 = this.d;
        if (r15 == null) goto L53;
        int r16 = r15.size();
        if (r16 <= 0) goto L53;
        qo[] r17 = new qo[r16];
    L48:
        if (r3 >= r16) goto L54;
        r17[r3] = new qo((po) this.d.get(r3));
        if (I(2) == false) goto L52;
        StringBuilder r18 = f34.j(r3, "saveAllState: adding back stack #", ": ");
        r18.append(this.d.get(r3));
        Log.v("FragmentManager", r18.toString());
    L52:
        r3 = r3 + 1;
    L54:
        nd1 r19 = new nd1();
        r19.r = null;
        ArrayList r20 = new ArrayList();
        r19.s = r20;
        ArrayList r21 = new ArrayList();
        r19.t = r21;
        r19.n = r7;
        r19.o = r14;
        r19.p = r17;
        r19.q = this.i.get();
        kc1 r22 = this.y;
        if (r22 == null) goto L57;
        r19.r = r22.r;
    L57:
        r20.addAll(this.j.keySet());
        r21.addAll(this.j.values());
        r19.u = new ArrayList(this.E);
        r0.putParcelable("state", r19);
        Iterator r23 = this.k.keySet().iterator();
    L59:
        if (r23.hasNext() == false) goto L61;
        String r24 = (String) r23.next();
        r0.putBundle(xa3.g("result_", r24), (Bundle) this.k.get(r24));
        goto L59
    L61:
        Iterator r110 = r11.keySet().iterator();
    L63:
        if (r110.hasNext() == false) goto L65;
        String r25 = (String) r110.next();
        r0.putBundle(xa3.g("fragment_", r25), (Bundle) r11.get(r25));
    L65:
        return r0;
    L53:
        r17 = null;
        goto L54
    L37:
        r14 = new ArrayList(((ArrayList) r12.n).size());     // Catch: Throwable -> L35
        ArrayList r26 = (ArrayList) r12.n;     // Catch: Throwable -> L35
        int r27 = r26.size();     // Catch: Throwable -> L35
        int r111 = 0;
    L38:
        if (r111 >= r27) goto L42;
        Object r112 = r26.get(r111);     // Catch: Throwable -> L35
        r111 = r111 + 1;     // Catch: Throwable -> L35
        kc1 r113 = (kc1) r112;     // Catch: Throwable -> L35
        r14.add(r113.r);     // Catch: Throwable -> L35
        if (I(2) == false) goto L38;
        Log.v("FragmentManager", "saveAllState: adding fragment (" + r113.r + "): " + r113);     // Catch: Throwable -> L35
        goto L38
    L42:
        monitor-exit(r13);     // Catch: Throwable -> L35
        goto L43
    L26:
        if (I(2) == false) goto L65;
        Log.v("FragmentManager", "saveAllState: no fragments!");
        return r0;
    }

    public final void X() {
        ArrayList r0 = this.a;
        monitor-enter(r0);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (this.a.size() != 1) goto L9;
        this.v.C.removeCallbacks(this.O);     // Catch: Throwable -> L7
        this.v.C.post(this.O);     // Catch: Throwable -> L7
        h0();     // Catch: Throwable -> L7
    L9:
        monitor-exit(r0);     // Catch: Throwable -> L7
    }

    public final void Y(kc1 r1, boolean r2) {
        ViewGroup r0 = E(r1);
        if (r0 != null) goto L5;
        return;
    L5:
        if ((r0 instanceof FragmentContainerView) == false) goto L9;
        ((FragmentContainerView) r0).setDrawDisappearingViewsLast(!r2);
        return;
    }

    public final void Z(String r4, Bundle r5) {
        hd1 r0 = (hd1) this.l.get(r4);
        if (r0 != null) goto L5;
    L7:
        this.k.put(r4, r5);
    L9:
        if (I(2) == false) goto L12;
        Log.v("FragmentManager", "Setting fragment result with key " + r4 + " and result " + r5);
        return;
    L12:
        return;
    L5:
        if (r0.n.h.compareTo(r92.q) < 0) goto L7;
        r0.d(r4, r5);
        goto L9
    }

    public final fe1 a(kc1 r4) {
        String r0 = r4.a0;
        if (r0 == null) goto L6;
        he1.c(r4, r0);
    L6:
        if (I(2) == false) goto L8;
        Log.v("FragmentManager", "add: " + r4);
    L8:
        fe1 r1 = f(r4);
        r4.F = this;
        ss0 r2 = this.c;
        r2.E(r1);
        if (r4.N == true) goto L16;
        r2.o(r4);
        r4.y = false;
        if (r4.T != null) goto L14;
        r4.X = false;
    L14:
        if (J(r4) == false) goto L16;
        this.F = true;
    L16:
        return r1;
    }

    public final void a0(String r3, le1 r4, zd1 r5) {
        r4.e();
        ea2 r6 = r4.r;
        if (r6.h != r92.n) goto L5;
        return;
    L5:
        ed1 r0 = new ed1(this, r3, r5, r6);
        hd1 r2 = (hd1) this.l.put(r3, new hd1(r6, r5, r0));
        if (r2 == null) goto L9;
        r2.n.f(r2.p);
    L9:
        if (I(2) == false) goto L11;
        Log.v("FragmentManager", "Setting FragmentResultListener with key " + r3 + " lifecycleOwner " + r6 + " and listener " + r5);
    L11:
        r6.a(r0);
    }

    public final void b(mc1 r6, fu r7, kc1 r8) {
        if (this.v != null) goto L61;
        this.v = r6;
        this.w = r7;
        this.x = r8;
        CopyOnWriteArrayList r9 = this.o;
        if (r8 == null) goto L7;
        r9.add(new fd1(r8));
    L10:
        if (this.x == null) goto L12;
        h0();
    L12:
        if (r6 == null) goto L18;
        a93 r10 = r6.E.i();
        this.g = r10;
        if (r8 == null) goto L16;
        ba2 r0 = r8;
    L17:
        r10.a(r0, this.h);
        goto L18
    L16:
        r0 = r6;
    L18:
        int r11 = 0;
        if (r8 == null) goto L24;
        od1 r12 = r8.F.N;
        HashMap r1 = r12.c;
        od1 r2 = (od1) r1.get(r8.r);
        if (r2 != null) goto L23;
        r2 = new od1(r12.e);
        r1.put(r8.r, r2);
    L23:
        this.N = r2;
    L31:
        od1 r13 = this.N;
        r13.g = N();
        ss0 r14 = this.c;
        r14.q = this.N;
        mc1 r15 = this.v;
        if (r15 == null) goto L37;
        if (r8 != null) goto L37;
        rm3 r16 = r15.f();
        r16.L("android:support:fragments", new cs0(1, this));
        Bundle r17 = r16.A("android:support:fragments");
        if (r17 == null) goto L37;
        V(r17);
    L37:
        mc1 r18 = this.v;
        if (r18 == null) goto L44;
        j70 r19 = r18.E.u;
        if (r8 == null) goto L42;
        String r3 = b11.q(new StringBuilder(), r8.r, ":");
    L43:
        String r4 = "FragmentManager:".concat(r3);
        this.B = r19.c(r4.concat("StartActivityForResult"), new q5(2), new hg3(19, this));
        this.C = r19.c(r4.concat("StartIntentSenderForResult"), new q5(3), new zg5(this));
        this.D = r19.c(r4.concat("RequestPermissions"), new q5(r11), new zh0(25, this));
        goto L44
    L42:
        r3 = "";
    L44:
        mc1 r20 = this.v;
        if (r20 == null) goto L47;
        nc1 r21 = r20.E;
        ad1 r22 = this.p;
        r22.getClass();
        r21.v.add(r22);
    L47:
        mc1 r23 = this.v;
        if (r23 == null) goto L50;
        nc1 r24 = r23.E;
        ad1 r25 = this.q;
        r25.getClass();
        r24.w.add(r25);
    L50:
        mc1 r26 = this.v;
        if (r26 == null) goto L53;
        nc1 r27 = r26.E;
        ad1 r28 = this.r;
        r28.getClass();
        r27.y.add(r28);
    L53:
        mc1 r29 = this.v;
        if (r29 == null) goto L56;
        nc1 r30 = r29.E;
        ad1 r31 = this.s;
        r31.getClass();
        r30.z.add(r31);
    L56:
        mc1 r32 = this.v;
        if (r32 == null) goto L63;
        if (r8 != null) goto L64;
        nc1 r33 = r32.E;
        cd1 r5 = this.t;
        r5.getClass();
        r20 r34 = r33.p;
        ((CopyOnWriteArrayList) r34.p).add(r5);
        ((Runnable) r34.o).run();
        return;
    L64:
        return;
    L63:
        return;
    L24:
        if (r6 == null) goto L30;
        e75 r35 = r6.E.d();
        sf0 r36 = sf0.b;
        r36.getClass();
        bq4 r37 = new bq4(r35, od1.h, r36);
        i30 r38 = kx3.a(od1.class);
        String r39 = r38.b();
        if (r39 == null) goto L28;
        this.N = (od1) r37.l(r38, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r39));
        goto L31
    L28:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return;
    L30:
        this.N = new od1(false);
        goto L31
    L7:
        if (r6 == null) goto L10;
        r9.add(r6);
        goto L10
    L61:
        kf2.o("Already attached");
    }

    public final void b0(kc1 r3, r92 r4) {
        String r0 = r3.r;
        if (r3 == this.c.t(r0)) goto L5;
    L10:
        tb4.h("Fragment ", r3, " is not an active fragment of FragmentManager ", this);
        return;
    L5:
        if (r3.G != null) goto L7;
    L8:
        r3.b0 = r4;
        return;
    L7:
        if (r3.F != this) goto L10;
        goto L8
    }

    public final void c(kc1 r5) {
        if (I(2) == false) goto L6;
        Log.v("FragmentManager", "attach: " + r5);
    L6:
        if (r5.N == false) goto L16;
        r5.N = false;
        if (r5.x == true) goto L17;
        this.c.o(r5);
        if (I(2) == false) goto L13;
        Log.v("FragmentManager", "add from attach: " + r5);
    L13:
        if (J(r5) == false) goto L18;
        this.F = true;
        return;
    L18:
        return;
    L17:
        return;
    }

    public final void c0(kc1 r3) {
        if (r3 == null) goto L12;
        String r0 = r3.r;
        if (r3 == this.c.t(r0)) goto L6;
    L10:
        tb4.h("Fragment ", r3, " is not an active fragment of FragmentManager ", this);
        return;
    L6:
        if (r3.G == null) goto L12;
        if (r3.F != this) goto L10;
    L12:
        kc1 r1 = this.y;
        this.y = r3;
        q(r1);
        q(this.y);
    }

    public final void d() {
        this.b = false;
        this.L.clear();
        this.K.clear();
    }

    public final void d0(kc1 r5) {
        ViewGroup r4 = E(r5);
        if (r4 == null) goto L33;
        hc1 r0 = r5.W;
        boolean r1 = false;
        if (r0 != null) goto L7;
        int r2 = 0;
    L8:
        if (r0 != null) goto L10;
        int r3 = 0;
    L11:
        int r6 = r3 + r2;
        if (r0 != null) goto L14;
        int r7 = 0;
    L15:
        int r8 = r7 + r6;
        if (r0 != null) goto L18;
        int r9 = 0;
    L20:
        if ((r9 + r8) > 0) goto L22;
        return;
    L22:
        if (r4.getTag(R.id.visible_removing_fragment_view_tag) != null) goto L24;
        r4.setTag(R.id.visible_removing_fragment_view_tag, r5);
    L24:
        kc1 r10 = (kc1) r4.getTag(R.id.visible_removing_fragment_view_tag);
        hc1 r11 = r5.W;
        if (r11 == null) goto L29;
        r1 = r11.a;
    L29:
        if (r10.W == null) goto L35;
        r10.k().a = r1;
        return;
    L35:
        return;
    L18:
        r9 = r0.e;
        goto L20
    L14:
        r7 = r0.d;
        goto L15
    L10:
        r3 = r0.c;
        goto L11
    L7:
        r2 = r0.b;
        goto L8
    }

    public final HashSet e() {
        HashSet r0 = new HashSet();
        ArrayList r1 = this.c.v();
        int r2 = r1.size();
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L11;
        Object r4 = r1.get(r3);
        r3 = r3 + 1;
        ViewGroup r5 = ((fe1) r4).c.S;
        if (r5 == null) goto L3;
        G().getClass();
        Object r6 = r5.getTag(R.id.special_effects_controller_view_tag);
        if ((r6 instanceof xm0) == false) goto L9;
        xm0 r7 = (xm0) r6;
    L10:
        r0.add(r7);
        goto L3
    L9:
        r7 = new xm0(r5);
        r5.setTag(R.id.special_effects_controller_view_tag, r7);
        goto L10
    L11:
        return r0;
    }

    public final fe1 f(kc1 r4) {
        String r0 = r4.r;
        ss0 r1 = this.c;
        fe1 r2 = (fe1) ((HashMap) r1.o).get(r0);
        if (r2 == null) goto L5;
        return r2;
    L5:
        fe1 r3 = new fe1(this.n, r1, r4);
        r3.m(this.v.B.getClassLoader());
        r3.e = this.u;
        return r3;
    }

    public final void f0() {
        ArrayList r0 = this.c.v();
        int r1 = r0.size();
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L10;
        Object r4 = r0.get(r3);
        r3 = r3 + 1;
        fe1 r5 = (fe1) r4;
        kc1 r6 = r5.c;
        if (r6.U == false) goto L3;
        if (this.b == true) goto L8;
        r6.U = false;
        r5.k();
        goto L3
    L8:
        this.J = true;
        goto L3
    }

    public final void g(kc1 r5) {
        if (I(2) == false) goto L6;
        Log.v("FragmentManager", "detach: " + r5);
    L6:
        if (r5.N == true) goto L24;
        r5.N = true;
        if (r5.x == true) goto L10;
        return;
    L10:
        if (I(2) == false) goto L12;
        Log.v("FragmentManager", "remove from detach: " + r5);
    L12:
        ss0 r0 = this.c;
        ArrayList r1 = (ArrayList) r0.n;
        monitor-enter(r1);
        ((ArrayList) r0.n).remove(r5);     // Catch: Throwable -> L21
        monitor-exit(r1);     // Catch: Throwable -> L21
        r5.x = false;
        if (J(r5) == false) goto L19;
        this.F = true;
    L19:
        d0(r5);
        return;
    L21:
        th = move-exception;
        throw th;
    }

    public final void g0(RuntimeException r8) {
        Log.e("FragmentManager", r8.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter r2 = new PrintWriter(new fe2());
        mc1 r0 = this.v;
        if (r0 == null) goto L15;
        nc1 r1 = r0.E;     // Catch: Exception -> L6
        r1.dump("  ", null, r2, new String[0]);     // Catch: Exception -> L6
        throw r8;
    L6:
        e = move-exception;
        Log.e("FragmentManager", "Failed dumping state", e);
        throw r8;
    L15:
        v("  ", null, r2, new String[0]);     // Catch: Exception -> L10
        throw r8;
    L10:
        e = move-exception;
        Log.e("FragmentManager", "Failed dumping state", e);
        throw r8;
    }

    public final void h(boolean r3, Configuration r4) {
        if (r3 == true) goto L4;
    L8:
        Iterator r2 = this.c.x().iterator();
    L10:
        if (r2.hasNext() == false) goto L16;
        kc1 r0 = (kc1) r2.next();
        if (r0 == null) goto L10;
        r0.onConfigurationChanged(r4);
        if (r3 == false) goto L10;
        r0.H.h(true, r4);
        goto L10
    L16:
        return;
    L4:
        if (this.v == null) goto L8;
        g0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        throw null;
    }

    public final void h0() {
        ArrayList r0 = this.a;
        monitor-enter(r0);
        boolean r2 = true;
        if (this.a.isEmpty() == true) goto L11;
        this.h.c(true);     // Catch: Throwable -> L9
        monitor-exit(r0);     // Catch: Throwable -> L9
        return;
    L11:
        monitor-exit(r0);     // Catch: Throwable -> L9
        bd1 r1 = this.h;
        ArrayList r3 = this.d;
        if (r3 == null) goto L15;
        int r4 = r3.size();
    L16:
        if (r4 > 0) goto L18;
    L20:
        r2 = false;
    L21:
        r1.c(r2);
        return;
    L18:
        if (M(this.x) == false) goto L20;
    L15:
        r4 = 0;
    L9:
        th = move-exception;
        throw th;
    }

    public final boolean i() {
        if (this.u < 1) goto L16;
        Iterator r4 = this.c.x().iterator();
    L7:
        if (r4.hasNext() == false) goto L16;
        kc1 r0 = (kc1) r4.next();
        if (r0 == null) goto L7;
        if (r0.M == true) goto L13;
        boolean r1 = r0.H.i();
    L14:
        if (r1 == false) goto L7;
        return true;
    L13:
        r1 = false;
    L16:
        return false;
    }

    public final boolean j(Menu r9, MenuInflater r10) {
        int r1 = 0;
        if (this.u >= 1) goto L5;
        return false;
    L5:
        Iterator r0 = this.c.x().iterator();
        ArrayList r3 = null;
        boolean r4 = false;
    L7:
        if (r0.hasNext() == false) goto L27;
        kc1 r5 = (kc1) r0.next();
        if (r5 == null) goto L7;
        if (L(r5) == false) goto L7;
        if (r5.M == false) goto L15;
        boolean r6 = false;
    L22:
        if (r6 == false) goto L7;
        if (r3 != null) goto L25;
        r3 = new ArrayList();
    L25:
        r3.add(r5);
        r4 = true;
        goto L7
    L15:
        if (r5.P == true) goto L17;
    L19:
        boolean r7 = false;
    L20:
        r6 = r7 | r5.H.j(r9, r10);
        goto L22
    L17:
        if (r5.Q == false) goto L19;
        r5.G(r9, r10);
        r7 = true;
        goto L20
    L27:
        if (this.e != null) goto L29;
    L36:
        this.e = r3;
        return r4;
    L29:
        if (r1 >= this.e.size()) goto L36;
        kc1 r11 = (kc1) this.e.get(r1);
        if (r3 != null) goto L33;
    L34:
        r11.getClass();
    L35:
        r1 = r1 + 1;
        goto L29
    L33:
        if (r3.contains(r11) == true) goto L35;
        goto L34
    }

    public final void k() {
        boolean r0 = true;
        this.I = true;
        y(true);
        Iterator r1 = e().iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        ((xm0) r1.next()).e();
        goto L4
    L6:
        mc1 r2 = this.v;
        ss0 r3 = this.c;
        if (r2 == null) goto L9;
        r0 = ((od1) r3.q).f;
    L12:
        if (r0 == false) goto L19;
        Iterator r4 = this.j.values().iterator();
    L15:
        if (r4.hasNext() == false) goto L19;
        ArrayList r5 = ((ro) r4.next()).n;
        int r6 = r5.size();
        int r7 = 0;
    L17:
        if (r7 >= r6) goto L15;
        Object r8 = r5.get(r7);
        r7 = r7 + 1;
        ((od1) r3.q).d((String) r8, false);
    L19:
        t(-1);
        mc1 r9 = this.v;
        if (r9 == null) goto L22;
        nc1 r10 = r9.E;
        ad1 r11 = this.q;
        r11.getClass();
        r10.w.remove(r11);
    L22:
        mc1 r12 = this.v;
        if (r12 == null) goto L25;
        nc1 r13 = r12.E;
        ad1 r14 = this.p;
        r14.getClass();
        r13.v.remove(r14);
    L25:
        mc1 r15 = this.v;
        if (r15 == null) goto L28;
        nc1 r16 = r15.E;
        ad1 r17 = this.r;
        r17.getClass();
        r16.y.remove(r17);
    L28:
        mc1 r18 = this.v;
        if (r18 == null) goto L31;
        nc1 r19 = r18.E;
        ad1 r20 = this.s;
        r20.getClass();
        r19.z.remove(r20);
    L31:
        mc1 r21 = this.v;
        if (r21 != null) goto L34;
    L39:
        this.v = null;
        this.w = null;
        this.x = null;
        if (this.g == null) goto L42;
        this.h.b();
        this.g = null;
    L42:
        w5 r22 = this.B;
        if (r22 == null) goto L51;
        r22.b();
        this.C.b();
        this.D.b();
        return;
    L51:
        return;
    L34:
        if (this.x != null) goto L39;
        nc1 r23 = r21.E;
        cd1 r24 = this.t;
        r24.getClass();
        r20 r25 = r23.p;
        ((CopyOnWriteArrayList) r25.p).remove(r24);
        if (((HashMap) r25.q).remove(r24) != null) goto L38;
        ((Runnable) r25.o).run();
        goto L39
    L38:
        kf2.k();
        goto L39
    L9:
        nc1 r26 = r2.B;
        if (r26 == null) goto L12;
        r0 = true ^ r26.isChangingConfigurations();
        goto L12
    }

    public final void l(boolean r3) {
        if (r3 == true) goto L4;
    L8:
        Iterator r2 = this.c.x().iterator();
    L10:
        if (r2.hasNext() == false) goto L16;
        kc1 r0 = (kc1) r2.next();
        if (r0 == null) goto L10;
        r0.R = true;
        if (r3 == false) goto L10;
        r0.H.l(true);
        goto L10
    L16:
        return;
    L4:
        if (this.v == null) goto L8;
        g0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        throw null;
    }

    public final void m(boolean r3) {
        if (r3 == true) goto L4;
    L8:
        Iterator r2 = this.c.x().iterator();
    L10:
        if (r2.hasNext() == false) goto L15;
        kc1 r0 = (kc1) r2.next();
        if (r0 == null) goto L10;
        if (r3 == false) goto L10;
        r0.H.m(true);
        goto L10
    L15:
        return;
    L4:
        if (this.v == null) goto L8;
        g0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        throw null;
    }

    public final void n() {
        ArrayList r3 = this.c.w();
        int r0 = r3.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L7;
        Object r2 = r3.get(r1);
        r1 = r1 + 1;
        kc1 r4 = (kc1) r2;
        if (r4 == null) goto L3;
        r4.z();
        r4.H.n();
        goto L3
    }

    public final boolean o(MenuItem r5) {
        if (this.u < 1) goto L23;
        Iterator r4 = this.c.x().iterator();
    L7:
        if (r4.hasNext() == false) goto L23;
        kc1 r0 = (kc1) r4.next();
        if (r0 == null) goto L7;
        if (r0.M == false) goto L13;
        boolean r1 = false;
    L21:
        if (r1 == false) goto L7;
        return true;
    L13:
        if (r0.P == true) goto L15;
    L19:
        r1 = r0.H.o(r5);
        goto L21
    L15:
        if (r0.Q == false) goto L19;
        if (r0.N(r5) == false) goto L19;
        r1 = true;
    L23:
        return false;
    }

    public final void p() {
        if (this.u < 1) goto L13;
        Iterator r2 = this.c.x().iterator();
    L7:
        if (r2.hasNext() == false) goto L21;
        kc1 r0 = (kc1) r2.next();
        if (r0 == null) goto L7;
        if (r0.M == true) goto L7;
        r0.H.p();
        goto L7
    L21:
        return;
    }

    public final void q(kc1 r2) {
        if (r2 == null) goto L12;
        String r0 = r2.r;
        if (r2 != this.c.t(r0)) goto L14;
        r2.F.getClass();
        boolean r1 = M(r2);
        Boolean r3 = r2.w;
        if (r3 != null) goto L9;
    L10:
        r2.w = Boolean.valueOf(r1);
        md1 r4 = r2.H;
        r4.h0();
        r4.q(r4.y);
        return;
    L9:
        if (r3.booleanValue() != r1) goto L10;
        return;
    L14:
        return;
    }

    public final void r(boolean r3) {
        if (r3 == true) goto L4;
    L8:
        Iterator r2 = this.c.x().iterator();
    L10:
        if (r2.hasNext() == false) goto L15;
        kc1 r0 = (kc1) r2.next();
        if (r0 == null) goto L10;
        if (r3 == false) goto L10;
        r0.H.r(true);
        goto L10
    L15:
        return;
    L4:
        if (this.v == null) goto L8;
        g0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        throw null;
    }

    public final boolean s() {
        if (this.u >= 1) goto L5;
        return false;
    L5:
        Iterator r5 = this.c.x().iterator();
        boolean r0 = false;
    L7:
        if (r5.hasNext() == false) goto L24;
        kc1 r3 = (kc1) r5.next();
        if (r3 == null) goto L7;
        if (L(r3) == false) goto L7;
        if (r3.M == false) goto L15;
        boolean r4 = false;
    L22:
        if (r4 == false) goto L7;
        r0 = true;
        goto L7
    L15:
        if (r3.P == true) goto L17;
    L19:
        boolean r6 = false;
    L20:
        r4 = r3.H.s() | r6;
        goto L22
    L17:
        if (r3.Q == false) goto L19;
        r6 = true;
        goto L20
    L24:
        return r0;
    }

    public final void t(int r5) {
        this.b = true;     // Catch: Throwable -> L14
        Iterator r2 = ((HashMap) this.c.o).values().iterator();     // Catch: Throwable -> L14
    L5:
        if (r2.hasNext() == false) goto L9;
        fe1 r3 = (fe1) r2.next();     // Catch: Throwable -> L14
        if (r3 == null) goto L5;
        r3.e = r5;     // Catch: Throwable -> L14
        goto L5
    L9:
        O(r5, false);     // Catch: Throwable -> L14
        Iterator r6 = e().iterator();     // Catch: Throwable -> L14
    L10:
        if (r6.hasNext() == false) goto L16;
        ((xm0) r6.next()).e();     // Catch: Throwable -> L14
        goto L10
    L16:
        this.b = false;
        y(true);
        return;
    L14:
        th = move-exception;
        this.b = false;
        throw th;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder(128);
        r0.append("FragmentManager{");
        r0.append(Integer.toHexString(System.identityHashCode(this)));
        r0.append(" in ");
        kc1 r1 = this.x;
        if (r1 == null) goto L5;
        r0.append(r1.getClass().getSimpleName());
        r0.append("{");
        r0.append(Integer.toHexString(System.identityHashCode(this.x)));
        r0.append("}");
    L9:
        r0.append("}}");
        return r0.toString();
    L5:
        mc1 r2 = this.v;
        if (r2 == null) goto L8;
        r0.append(r2.getClass().getSimpleName());
        r0.append("{");
        r0.append(Integer.toHexString(System.identityHashCode(this.v)));
        r0.append("}");
        goto L9
    L8:
        r0.append("null");
        goto L9
    }

    public final void u() {
        if (this.J == false) goto L6;
        this.J = false;
        f0();
        return;
    }

    public final void v(String r6, FileDescriptor r7, PrintWriter r8, String[] r9) {
        String r0 = r6 + "    ";
        ss0 r1 = this.c;
        ArrayList r2 = (ArrayList) r1.n;
        String r3 = r6 + "    ";
        HashMap r4 = (HashMap) r1.o;
        if (r4.isEmpty() == true) goto L11;
        r8.print(r6);
        r8.println("Active Fragments:");
        Iterator r5 = r4.values().iterator();
    L6:
        if (r5.hasNext() == false) goto L11;
        fe1 r10 = (fe1) r5.next();
        r8.print(r6);
        if (r10 != null) goto L9;
        r8.println("null");
        goto L6
    L9:
        kc1 r11 = r10.c;
        r8.println(r11);
        r11.j(r3, r7, r8, r9);
    L11:
        int r12 = r2.size();
        int r13 = 0;
        if (r12 <= 0) goto L16;
        r8.print(r6);
        r8.println("Added Fragments:");
        int r14 = 0;
    L14:
        if (r14 >= r12) goto L16;
        kc1 r15 = (kc1) r2.get(r14);
        r8.print(r6);
        r8.print("  #");
        r8.print(r14);
        r8.print(": ");
        r8.println(r15.toString());
        r14 = r14 + 1;
    L16:
        ArrayList r16 = this.e;
        if (r16 == null) goto L23;
        int r17 = r16.size();
        if (r17 <= 0) goto L23;
        r8.print(r6);
        r8.println("Fragments Created Menus:");
        int r18 = 0;
    L21:
        if (r18 >= r17) goto L23;
        kc1 r19 = (kc1) this.e.get(r18);
        r8.print(r6);
        r8.print("  #");
        r8.print(r18);
        r8.print(": ");
        r8.println(r19.toString());
        r18 = r18 + 1;
    L23:
        ArrayList r20 = this.d;
        if (r20 == null) goto L30;
        int r21 = r20.size();
        if (r21 <= 0) goto L30;
        r8.print(r6);
        r8.println("Back Stack:");
        int r22 = 0;
    L28:
        if (r22 >= r21) goto L30;
        po r23 = (po) this.d.get(r22);
        r8.print(r6);
        r8.print("  #");
        r8.print(r22);
        r8.print(": ");
        r8.println(r23.toString());
        r23.h(r0, r8, true);
        r22 = r22 + 1;
    L30:
        r8.print(r6);
        r8.println("Back Stack Index: " + this.i.get());
        ArrayList r24 = this.a;
        monitor-enter(r24);
        int r25 = this.a.size();     // Catch: Throwable -> L37
        if (r25 <= 0) goto L39;
        r8.print(r6);     // Catch: Throwable -> L37
        r8.println("Pending Actions:");     // Catch: Throwable -> L37
    L35:
        if (r13 >= r25) goto L39;
        Object r26 = (id1) this.a.get(r13);     // Catch: Throwable -> L37
        r8.print(r6);     // Catch: Throwable -> L37
        r8.print("  #");     // Catch: Throwable -> L37
        r8.print(r13);     // Catch: Throwable -> L37
        r8.print(": ");     // Catch: Throwable -> L37
        r8.println(r26);     // Catch: Throwable -> L37
        r13 = r13 + 1;     // Catch: Throwable -> L37
    L39:
        monitor-exit(r24);     // Catch: Throwable -> L37
        r8.print(r6);
        r8.println("FragmentManager misc state:");
        r8.print(r6);
        r8.print("  mHost=");
        r8.println(this.v);
        r8.print(r6);
        r8.print("  mContainer=");
        r8.println(this.w);
        if (this.x == null) goto L43;
        r8.print(r6);
        r8.print("  mParent=");
        r8.println(this.x);
    L43:
        r8.print(r6);
        r8.print("  mCurState=");
        r8.print(this.u);
        r8.print(" mStateSaved=");
        r8.print(this.G);
        r8.print(" mStopped=");
        r8.print(this.H);
        r8.print(" mDestroyed=");
        r8.println(this.I);
        if (this.F == false) goto L61;
        r8.print(r6);
        r8.print("  mNeedMenuInvalidate=");
        r8.println(this.F);
        return;
    L61:
        return;
    L37:
        th = move-exception;
        throw th;
    }

    public final void w(id1 r3, boolean r4) {
        if (r4 == false) goto L4;
    L16:
        ArrayList r0 = this.a;
        monitor-enter(r0);
    L23:
        th = move-exception;
        throw th;
    L19:
        if (this.v != null) goto L27;
        if (r4 == false) goto L26;
        monitor-exit(r0);     // Catch: Throwable -> L23
        return;
    L26:
        throw new IllegalStateException("Activity has been destroyed");     // Catch: Throwable -> L23
    L27:
        this.a.add(r3);     // Catch: Throwable -> L23
        X();     // Catch: Throwable -> L23
        monitor-exit(r0);     // Catch: Throwable -> L23
        return;
    L4:
        if (this.v != null) goto L12;
        if (this.I == false) goto L9;
        kf2.o("FragmentManager has been destroyed");
        return;
    L9:
        kf2.o("FragmentManager has not been attached to a host.");
        return;
    L12:
        if (N() == false) goto L16;
        kf2.o("Can not perform this action after onSaveInstanceState");
    }

    public final void x(boolean r3) {
        if (this.b == false) goto L5;
        kf2.o("FragmentManager is already executing transactions");
        return;
    L5:
        if (this.v != null) goto L13;
        if (this.I == false) goto L10;
        kf2.o("FragmentManager has been destroyed");
        return;
    L10:
        kf2.o("FragmentManager has not been attached to a host.");
        return;
    L13:
        if (Looper.myLooper() != this.v.C.getLooper()) goto L24;
        if (r3 == true) goto L21;
        if (N() == false) goto L21;
        kf2.o("Can not perform this action after onSaveInstanceState");
        return;
    L21:
        if (this.K != null) goto L28;
        this.K = new ArrayList();
        this.L = new ArrayList();
        return;
    L28:
        return;
    L24:
        kf2.o("Must be called from main thread of fragment host");
    }

    public final boolean y(boolean r9) {
        x(r9);
        boolean r0 = false;
    L3:
        ArrayList r1 = this.K;
        ArrayList r2 = this.L;
        ArrayList r3 = this.a;
        monitor-enter(r3);
    L9:
        th = move-exception;
        throw th;
    L6:
        if (this.a.isEmpty() == false) goto L36;
        monitor-exit(r3);     // Catch: Throwable -> L9
        boolean r6 = false;
    L21:
        if (r6 == false) goto L28;
        r0 = true;
        this.b = true;
        U(this.K, this.L);     // Catch: Throwable -> L25
        d();
    L25:
        th = move-exception;
        d();
        throw th;
    L28:
        h0();
        u();
        ((HashMap) this.c.o).values().removeAll(Collections.singleton(null));
        return r0;
    L36:
        int r4 = this.a.size();     // Catch: Throwable -> L17
        int r5 = 0;
        r6 = false;
    L13:
        ArrayList r7 = this.a;
        if (r5 >= r4) goto L19;
        r6 = r6 | ((id1) r7.get(r5)).a(r1, r2);
        r5 = r5 + 1;
        goto L13
    L19:
        r7.clear();     // Catch: Throwable -> L9
        this.v.C.removeCallbacks(this.O);     // Catch: Throwable -> L9
        monitor-exit(r3);     // Catch: Throwable -> L9
    L17:
        th = move-exception;
        this.a.clear();     // Catch: Throwable -> L9
        this.v.C.removeCallbacks(this.O);     // Catch: Throwable -> L9
        throw th;     // Catch: Throwable -> L9
    }

    public final void z(po r2, boolean r3) {
        if (r3 == true) goto L4;
    L8:
        x(r3);
        r2.a(this.K, this.L);
        this.b = true;
        U(this.K, this.L);     // Catch: Throwable -> L12
        d();
        h0();
        u();
        ((HashMap) this.c.o).values().removeAll(Collections.singleton(null));
        return;
    L12:
        th = move-exception;
        d();
        throw th;
    L4:
        if (this.v != null) goto L6;
        return;
    L6:
        if (this.I == false) goto L8;
    }
}
