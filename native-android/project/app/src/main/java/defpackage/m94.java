package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m94 implements wf1 {
    public final /* synthetic */ int n;

    public /* synthetic */ m94(int r1) {
        this.n = r1;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object r3, Object r4) {
        Integer r0 = null;
        switch(this.n) {
            case 0: goto L59;
            case 1: goto L57;
            case 2: goto L55;
            case 3: goto L53;
            case 4: goto L51;
            case 5: goto L49;
            case 6: goto L47;
            case 7: goto L42;
            case 8: goto L39;
            case 9: goto L30;
            case 10: goto L17;
            case 11: goto L10;
            case 12: goto L6;
            default: goto L4;
        };
    L4:
        j15 r5 = (j15) r4;
        fz0.K.invoke(r3);
        return j15.a;
    L6:
        mt4 r6 = (mt4) r3;
        le0 r7 = (le0) r4;
        if ((r7 instanceof ht4) == false) goto L9;
        ht4 r8 = (ht4) r7;
        ne0 r2 = r6.a;
        Object r9 = r8.c();
        Object[] r1 = r6.b;
        int r10 = r6.d;
        r1[r10] = r9;
        ht4[] r11 = r6.c;
        r6.d = r10 + 1;
        r11[r10] = r8;
    L9:
        return r6;
    L10:
        ht4 r12 = (ht4) r3;
        le0 r13 = (le0) r4;
        if (r12 == null) goto L14;
        return r12;
    L14:
        if ((r13 instanceof ht4) == true) goto L16;
        return null;
    L16:
        return (ht4) r13;
    L17:
        le0 r14 = (le0) r4;
        if ((r14 instanceof ht4) == true) goto L20;
        return r3;
    L20:
        if ((r3 instanceof Integer) == false) goto L23;
        r0 = (Integer) r3;
    L23:
        if (r0 == null) goto L25;
        int r15 = r0.intValue();
    L26:
        if (r15 != 0) goto L29;
        return r14;
    L29:
        return Integer.valueOf(r15 + 1);
    L25:
        r15 = 1;
        goto L26
    L30:
        i94 r16 = (i94) r4;
        Object r17 = Float.valueOf(0.0f);
        e94 r18 = ((i94) r3).d;
        p94 r19 = n94.t;
        Object r20 = r18.n.g(r19);
        if (r20 != null) goto L33;
        r20 = r17;
    L33:
        float r21 = ((Number) r20).floatValue();
        Object r22 = r16.d.n.g(r19);
        if (r22 == null) goto L38;
        r17 = r22;
    L38:
        return Integer.valueOf(Float.compare(r21, ((Number) r17).floatValue()));
    L39:
        if (r3 == null) goto L41;
        return r3;
    L41:
        return r4;
    L42:
        if (r3 != null) goto L45;
        if (r4 != null) goto L45;
    L46:
        return null;
    L45:
        kf2.k();
        goto L46
    L47:
        Boolean r23 = (Boolean) r3;
        ((Boolean) r4).booleanValue();
        return r23;
    L49:
        wb r24 = (wb) r4;
        return (wb) r3;
    L51:
        mb r25 = (mb) r4;
        return (mb) r3;
    L53:
        qd0 r26 = (qd0) r4;
        return (qd0) r3;
    L55:
        String r27 = (String) r3;
        String r28 = (String) r4;
        throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
    L57:
        ac4 r29 = (ac4) r4;
        return (ac4) r3;
    L59:
        List r30 = (List) r3;
        List r31 = (List) r4;
        if (r30 == null) goto L68;
        ArrayList r32 = new ArrayList(r30);
        r32.addAll(r31);
        return r32;
    L68:
        return r31;
    }
}
