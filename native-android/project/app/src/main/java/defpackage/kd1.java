package defpackage;

import android.os.Bundle;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kd1 implements id1 {
    public final /* synthetic */ int a;
    public final String b;
    public final /* synthetic */ ld1 c;

    public /* synthetic */ kd1(ld1 r1, String r2, int r3) {
        this.a = r3;
        this.c = r1;
        this.b = r2;
    }

    @Override // defpackage.id1
    public final boolean a(ArrayList r22, ArrayList r23) {
        int r3 = this.a;
        Throwable r5 = null;
        String r6 = this.b;
        ld1 r0 = this.c;
        switch(r3) {
            case 0: goto L95;
            default: goto L4;
        };
    L4:
        byte r4 = -1;
        int r8 = r0.B(-1, r6, true);
        if (r8 >= 0) goto L7;
        return false;
    L7:
        int r9 = r8;
    L9:
        if (r9 >= r0.d.size()) goto L15;
        po r10 = (po) r0.d.get(r9);
        if (r10.p == false) goto L13;
        r9 = r9 + 1;
        goto L9
    L13:
        r0.g0(new IllegalArgumentException("saveBackStack(\"" + r6 + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + r10 + " that did not use setReorderingAllowed(true)."));
        throw null;
    L15:
        HashSet r11 = new HashSet();
        int r12 = r8;
    L17:
        if (r12 >= r0.d.size()) goto L49;
        po r13 = (po) r0.d.get(r12);
        HashSet r15 = new HashSet();
        byte r21 = r4;
        HashSet r7 = new HashSet();
        ArrayList r14 = r13.a;
        Throwable r17 = r5;
        int r16 = r14.size();
        int r18 = 0;
    L19:
        if (r18 >= r16) goto L40;
        Object r19 = r14.get(r18);
        r18 = r18 + 1;
        je1 r110 = (je1) r19;
        kc1 r20 = r110.b;
        if (r20 == null) goto L19;
        int r111 = r16;
        if (r110.c == false) goto L32;
        int r24 = r110.a;
        ArrayList r25 = r14;
        if (r24 != 1) goto L28;
    L33:
        r11.add(r20);
        r15.add(r20);
    L34:
        int r26 = r110.a;
        if (r26 != 1) goto L37;
    L38:
        r7.add(r20);
    L39:
        r16 = r111;
        r14 = r25;
        goto L19
    L37:
        if (r26 != 2) goto L39;
    L28:
        if (r24 == 2) goto L33;
        if (r24 != 8) goto L34;
    L32:
        r25 = r14;
        goto L33
    L40:
        r15.removeAll(r7);
        if (r15.isEmpty() == false) goto L42;
        r12 = r12 + 1;
        r4 = r21;
        r5 = r17;
        goto L17
    L42:
        StringBuilder r2 = xa3.j("saveBackStack(\"", r6, "\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
        if (r15.size() != 1) goto L45;
        String r27 = " " + r15.iterator().next();
    L46:
        r2.append(r27);
        r2.append(" in ");
        r2.append(r13);
        r2.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
        r0.g0(new IllegalArgumentException(r2.toString()));
        throw r17;
    L45:
        r27 = "s " + r15;
        goto L46
    L49:
        Throwable r112 = r5;
        ArrayDeque r28 = new ArrayDeque(r11);
    L51:
        if (r28.isEmpty() == true) goto L65;
        kc1 r29 = (kc1) r28.removeFirst();
        if (r29.O == true) goto L54;
        ArrayList r30 = r29.H.c.w();
        int r31 = r30.size();
        int r32 = 0;
    L61:
        if (r32 >= r31) goto L51;
        Object r113 = r30.get(r32);
        r32 = r32 + 1;
        kc1 r114 = (kc1) r113;
        if (r114 == null) goto L61;
        r28.addLast(r114);
        goto L61
    L54:
        StringBuilder r33 = xa3.j("saveBackStack(\"", r6, "\") must not contain retained fragments. Found ");
        if (r11.contains(r29) == false) goto L57;
        String r34 = "direct reference to retained ";
    L58:
        r33.append(r34);
        r33.append("fragment ");
        r33.append(r29);
        r0.g0(new IllegalArgumentException(r33.toString()));
        throw r112;
    L57:
        r34 = "retained child ";
        goto L58
    L65:
        ArrayList r35 = new ArrayList();
        Iterator r36 = r11.iterator();
    L67:
        if (r36.hasNext() == false) goto L69;
        r35.add(((kc1) r36.next()).r);
        goto L67
    L69:
        ArrayList r37 = new ArrayList(r0.d.size() - r8);
        int r38 = r8;
    L71:
        if (r38 >= r0.d.size()) goto L73;
        r37.add(r112);
        r38 = r38 + 1;
        r112 = null;
        goto L71
    L73:
        ro r39 = new ro(r35, r37);
        boolean r115 = true;
        int r40 = r0.d.size() - 1;
    L74:
        if (r40 < r8) goto L93;
        po r41 = (po) r0.d.remove(r40);
        po r42 = new po(r41);
        ArrayList r116 = r42.a;
        int r117 = r116.size() - 1;
    L76:
        if (r117 < 0) goto L92;
        je1 r118 = (je1) r116.get(r117);
        if (r118.c == false) goto L91;
        if (r118.a != 8) goto L83;
        r118.c = false;
        r116.remove(r117 - 1);
        r117 = r117 - 1;
        goto L91
    L83:
        int r119 = r118.b.K;
        r118.a = 2;
        r118.c = false;
        int r120 = r117 - 1;
    L84:
        if (r120 < 0) goto L91;
        je1 r121 = (je1) r116.get(r120);
        if (r121.c == false) goto L90;
        if (r121.b.K != r119) goto L90;
        r116.remove(r120);
        r117 = r117 - 1;
    L90:
        r120 = r120 - 1;
    L91:
        r117 = r117 - 1;
        goto L76
    L92:
        r37.set(r40 - r8, new qo(r42));
        r41.t = true;
        r22.add(r41);
        r23.add(Boolean.TRUE);
        r40 = r40 - 1;
        r115 = true;
        goto L74
    L93:
        boolean r43 = r115;
        r0.j.put(r6, r39);
        return r43;
    L95:
        ro r44 = (ro) r0.j.remove(r6);
        if (r44 != null) goto L98;
    L97:
        return false;
    L98:
        HashMap r45 = new HashMap();
        int r46 = r22.size();
        int r47 = 0;
    L99:
        if (r47 >= r46) goto L107;
        Object r48 = r22.get(r47);
        r47 = r47 + 1;
        po r49 = (po) r48;
        if (r49.t == false) goto L99;
        ArrayList r50 = r49.a;
        int r51 = r50.size();
        int r122 = 0;
    L103:
        if (r122 >= r51) goto L99;
        Object r123 = r50.get(r122);
        r122 = r122 + 1;
        kc1 r124 = ((je1) r123).b;
        if (r124 == null) goto L103;
        r45.put(r124.r, r124);
        goto L103
    L107:
        ArrayList r52 = r44.n;
        HashMap r53 = new HashMap(r52.size());
        int r54 = r52.size();
        int r55 = 0;
    L108:
        if (r55 >= r54) goto L122;
        Object r125 = r52.get(r55);
        r55 = r55 + 1;
        String r126 = (String) r125;
        kc1 r127 = (kc1) r45.get(r126);
        if (r127 != null) goto L111;
        Bundle r128 = r0.c.G(r126, null);
        if (r128 == null) goto L108;
        ClassLoader r129 = r0.v.B.getClassLoader();
        kc1 r130 = ((be1) r128.getParcelable("state")).a(r0.F());
        r130.o = r128;
        if (r128.getBundle("savedInstanceState") != null) goto L117;
        r130.o.putBundle("savedInstanceState", new Bundle());
    L117:
        Bundle r56 = r128.getBundle("arguments");
        if (r56 == null) goto L120;
        r56.setClassLoader(r129);
    L120:
        r130.c0(r56);
        r53.put(r130.r, r130);
        goto L108
    L111:
        r53.put(r127.r, r127);
        goto L108
    L122:
        ArrayList r57 = new ArrayList();
        ArrayList r58 = r44.o;
        int r59 = r58.size();
        int r60 = 0;
    L123:
        if (r60 >= r59) goto L135;
        Object r61 = r58.get(r60);
        r60 = r60 + 1;
        qo r62 = (qo) r61;
        ArrayList r63 = r62.o;
        po r131 = new po(r0);
        r62.a(r131);
        int r132 = 0;
    L126:
        if (r132 >= r63.size()) goto L134;
        String r133 = (String) r63.get(r132);
        if (r133 == null) goto L133;
        kc1 r134 = (kc1) r53.get(r133);
        if (r134 == null) goto L132;
        ((je1) r131.a.get(r132)).b = r134;
        goto L133
    L132:
        tb4.j("Restoring FragmentTransaction ", r62.s, " failed due to missing saved state for Fragment (", r133, ")");
    L133:
        r132 = r132 + 1;
        goto L126
    L134:
        r57.add(r131);
        goto L123
    L135:
        int r1 = r57.size();
        int r64 = 0;
        boolean r65 = false;
    L136:
        if (r64 >= r1) goto L186;
        Object r66 = r57.get(r64);
        r64 = r64 + 1;
        ((po) r66).a(r22, r23);
        r65 = true;
        goto L136
    L186:
        return r65;
    }
}
