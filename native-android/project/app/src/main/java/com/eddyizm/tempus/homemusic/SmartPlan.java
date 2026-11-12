package com.eddyizm.tempus.homemusic;

import defpackage.gg4;
import defpackage.h12;
import defpackage.if1;
import defpackage.kd3;
import defpackage.q40;
import defpackage.r40;
import defpackage.s11;
import defpackage.u01;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class SmartPlan {
    public static final int $stable = 0;
    public static final SmartPlan INSTANCE = null;
    public static final int MAX_QUEUE = 500;

    static {
        INSTANCE = new SmartPlan();
    }

    private SmartPlan() {
    }

    public static /* synthetic */ List build$default(SmartPlan r0, List r1, List r2, List r3, String r4, int r5, Object r6) {
        if ((r5 & 8) == 0) goto L6;
        r4 = null;
    L6:
        return r0.build(r1, r2, r3, r4);
    }

    private static final void build$recsAfter(Map<String, ? extends List<SmartRec>> r2, HashSet<String> r3, ArrayList<gg4> r4, String r5) {
        List<SmartRec> r6 = r2.get(r5);
        if (r6 != null) goto L5;
        r6 = u01.n;
    L5:
        Iterator<T> r7 = r6.iterator();
    L7:
        if (r7.hasNext() == false) goto L16;
        SmartRec r8 = (SmartRec) r7.next();
        String r0 = r8.getQueueId();
        if (r0 == null) goto L7;
        if (r3.add(r0) == true) goto L14;
        r0 = null;
    L14:
        if (r0 == null) goto L7;
        r4.add(new gg4(r0, r8));
        goto L7
    }

    public final String anchor(List<s11> r2, int r3, if1 r4) {
        r2.getClass();
        r4.getClass();
        int r1 = r2.size() - 1;
        if (r3 <= r1) goto L6;
        r3 = r1;
    L6:
        if ((-1) >= r3) goto L13;
        s11 r5 = r2.get(r3);
        boolean r0 = r5.b;
        String r6 = r5.a;
        if (r0 == true) goto L12;
        if (((Boolean) r4.invoke(r6)).booleanValue() == false) goto L12;
        return r6;
    L12:
        r3 = r3 - 1;
        goto L6
    L13:
        return null;
    }

    public final List<gg4> build(List<String> r8, List<String> r9, List<SmartRec> r10, String r11) {
        r8.getClass();
        r9.getClass();
        r10.getClass();
        Set r7 = q40.T0(r8);
        List r12 = q40.K0(r10, new SmartPlan$build$$inlined$sortedBy$1());
        LinkedHashMap r0 = new LinkedHashMap();
        Iterator r13 = r12.iterator();
    L4:
        if (r13.hasNext() == false) goto L12;
        Object r1 = r13.next();
        String r2 = ((SmartRec) r1).getAfter();
        if (r2 != null) goto L8;
        r2 = "";
    L8:
        Object r3 = r0.get(r2);
        if (r3 != null) goto L11;
        r3 = new ArrayList();
        r0.put(r2, r3);
    L11:
        ((List) r3).add(r1);
        goto L4
    L12:
        ArrayList r14 = new ArrayList();
        HashSet r4 = new HashSet();
        if (r11 == null) goto L15;
        build$recsAfter(r0, r4, r14, SmartContexts.INSTANCE.hubId(r11));
    L15:
        HashSet r5 = new HashSet();
        Iterator<String> r15 = r9.iterator();
    L17:
        if (r15.hasNext() == false) goto L28;
        String r6 = r15.next();
        String r16 = SmartContexts.INSTANCE.mediaId(r6);
        r5.add(r16);
        if (r7.contains(r16) == false) goto L24;
        if (r4.add(r16) == false) goto L24;
        r14.add(new gg4(r16, null));
    L24:
        if (r7.contains(r16) == true) goto L27;
        if (h12.c(r16, r11) == false) goto L17;
    L27:
        build$recsAfter(r0, r4, r14, r6);
        goto L17
    L28:
        Iterator<String> r17 = r8.iterator();
    L30:
        if (r17.hasNext() == false) goto L36;
        String r18 = r17.next();
        if (r5.contains(r18) == true) goto L30;
        if (r4.add(r18) == false) goto L30;
        r14.add(new gg4(r18, null));
        goto L30
    L36:
        return r14;
    }

    public final List<kd3> insertions(List<s11> r9, int r10, List<SmartRec> r11) {
        r9.getClass();
        r11.getClass();
        ArrayList r8 = new ArrayList(r9);
        ArrayList r12 = new ArrayList();
        Iterator r13 = q40.K0(r11, new SmartPlan$insertions$$inlined$sortedBy$1()).iterator();
    L4:
        if (r13.hasNext() == false) goto L34;
        SmartRec r0 = (SmartRec) r13.next();
        String r1 = r0.getQueueId();
        if (r1 == null) goto L4;
        String r2 = r0.getAfter();
        if (r2 == null) goto L4;
        String r3 = SmartContexts.INSTANCE.mediaId(r2);
        if (r3 == null) goto L4;
        int r4 = 0;
        if (r8.isEmpty() == true) goto L21;
        int r5 = r8.size();
        int r6 = 0;
    L17:
        if (r6 >= r5) goto L21;
        Object r7 = r8.get(r6);
        r6 = r6 + 1;
        if (h12.c(((s11) r7).a, r1) == false) goto L17;
    L21:
        int r14 = r8.size();
        int r15 = 0;
    L22:
        if (r15 >= r14) goto L29;
        Object r16 = r8.get(r15);
        r15 = r15 + 1;
        s11 r17 = (s11) r16;
        if (r17.b == true) goto L28;
        if (h12.c(r17.a, r3) == false) goto L28;
    L30:
        if (r4 < 0) goto L4;
        if (r4 < r10) goto L4;
        int r18 = r4 + 1;
        r8.add(r18, new s11(r1, true));
        r12.add(new kd3(Integer.valueOf(r18), r0));
    L28:
        r4 = r4 + 1;
        goto L22
    L29:
        r4 = -1;
        goto L30
    L34:
        return r12;
    }

    public final List<String> restore(List<String> r6, List<s11> r7, String r8) {
        r6.getClass();
        r7.getClass();
        ArrayList r5 = new ArrayList();
        Iterator<T> r9 = r7.iterator();
    L4:
        if (r9.hasNext() == false) goto L8;
        Object r0 = r9.next();
        if (((s11) r0).b == true) goto L4;
        r5.add(r0);
        goto L4
    L8:
        ArrayList r10 = new ArrayList(r40.k0(r5, 10));
        int r1 = r5.size();
        int r2 = 0;
        int r3 = 0;
    L9:
        if (r3 >= r1) goto L11;
        Object r4 = r5.get(r3);
        r3 = r3 + 1;
        r10.add(((s11) r4).a);
        goto L9
    L11:
        Set r11 = q40.T0(r10);
        SmartContexts r12 = SmartContexts.INSTANCE;
        ArrayList r13 = new ArrayList(r40.k0(r6, 10));
        Iterator<T> r14 = r6.iterator();
    L13:
        if (r14.hasNext() == false) goto L15;
        r13.add(r12.mediaId((String) r14.next()));
        goto L13
    L15:
        if (r8 == null) goto L17;
        int r15 = r13.indexOf(r8);
    L18:
        int r16 = r15 + 1;
        ArrayList r17 = q40.G0(q40.u0(r13, r16), q40.L0(r13, r16));
        ArrayList r18 = new ArrayList();
        int r19 = r17.size();
        int r20 = 0;
    L19:
        if (r20 >= r19) goto L23;
        Object r21 = r17.get(r20);
        r20 = r20 + 1;
        if (r11.contains((String) r21) == false) goto L19;
        r18.add(r21);
        goto L19
    L23:
        Set r22 = q40.T0(r18);
        ArrayList r23 = new ArrayList();
        int r24 = r10.size();
    L24:
        if (r2 >= r24) goto L29;
        Object r25 = r10.get(r2);
        r2 = r2 + 1;
        if (r22.contains((String) r25) == true) goto L24;
        r23.add(r25);
        goto L24
    L29:
        return q40.G0(r18, r23);
    L17:
        r15 = -1;
        goto L18
    }
}
