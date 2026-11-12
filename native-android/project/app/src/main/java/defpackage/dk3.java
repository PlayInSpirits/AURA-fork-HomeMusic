package defpackage;

import android.widget.Button;
import com.eddyizm.tempus.homemusic.a;
import com.eddyizm.tempus.homemusic.b;
import com.eddyizm.tempus.model.Queue;
import com.eddyizm.tempus.service.MediaService;
import com.eddyizm.tempus.subsonic.models.Child;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dk3 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ hk3 o;

    public /* synthetic */ dk3(hk3 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [u01] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.util.ArrayList] */
    @Override // defpackage.if1
    public final Object invoke(Object r8) {
        int r0 = this.n;
        final int r1 = 1;
        final int r2 = 0;
        j15 r3 = j15.a;
        final hk3 r7 = this.o;
        switch(r0) {
            case 0: goto L95;
            case 1: goto L44;
            case 2: goto L39;
            case 3: goto L33;
            case 4: goto L19;
            case 5: goto L15;
            case 6: goto L11;
            default: goto L5;
        };
    L11:
        List r9 = (List) r8;
        if (u52.c().a == false) goto L14;
        r7.j0();
    L14:
        return r3;
    L15:
        boolean r10 = h12.c((Boolean) r8, Boolean.TRUE);
        r7.y0.setValue(Boolean.valueOf(r10));
        bj2 r11 = r7.o0;
        if (r11 == null) goto L18;
        r7.i0(r11);
    L18:
        return r3;
    L19:
        List r12 = (List) r8;
        if (r12 == null) goto L25;
        ?? r4 = new ArrayList(r40.k0(r12, 10));
        Iterator r13 = r12.iterator();
    L23:
        if (r13.hasNext() == false) goto L26;
        Queue r5 = (Queue) r13.next();
        r5.getClass();
        r4.add(r5);
    L26:
        r7.r0 = r4;
        if (u52.c().a == true) goto L32;
        bj2 r14 = r7.o0;
        if (r14 == null) goto L31;
        r7.i0(r14);
        goto L32
    L31:
        List r15 = r7.r0;
        r7.q0.setValue(r15);
    L32:
        return r3;
    L25:
        r4 = u01.n;
        goto L26
    L33:
        final Child r16 = (Child) r8;
        ey r6 = r7.l0;
        if (r6 == null) goto L38;
        if (r16 == null) goto L38;
        ((Button) r6.e).setOnClickListener(new ek3(r7, r16, r2));
        ((Button) r6.f).setOnClickListener(new ek3(r7, r16, r1));
        final int r17 = 2;
        ((Button) r6.b).setOnClickListener(new ek3(r7, r16, r17));
        ((Button) r6.c).setOnClickListener(new fk3(r7, r2));
        ((Button) r6.d).setOnClickListener(new fk3(r7, r1));
    L38:
        return r3;
    L39:
        List r18 = (List) r8;
        bl2 r19 = r7.n0;
        if (r19 == null) goto L43;
        if (r18 == null) goto L43;
        bo2.e(r19, r18, true);
    L43:
        return r3;
    L44:
        int r20 = ((Integer) r8).intValue();
        if (r20 == r7.h0().size()) goto L47;
    L66:
        if (r20 >= 0) goto L68;
    L94:
        return r3;
    L68:
        if (r20 >= r7.h0().size()) goto L94;
        if (u52.c().a == true) goto L72;
        r7.k0(r20);
        bj2 r21 = r7.o0;
        int[] r22 = r7.w0;
        r22.getClass();
        if (r20 >= 0) goto L77;
    L79:
        Integer r23 = null;
    L80:
        if (r21 == null) goto L87;
        if (r23 == null) goto L87;
        if (r23.intValue() >= r21.Q0()) goto L87;
        if (h12.c(r21.Y(r23.intValue()).a, ((Child) r7.h0().get(r20)).getId()) == false) goto L87;
        r21.W(r23.intValue());
        r21.m0();
    L87:
        if (r21 != null) goto L89;
    L91:
        bl2 r24 = r7.n0;
        if (r24 == null) goto L94;
        bo2.q(r24, r7.h0(), r20, "queue");
        goto L94
    L89:
        if (r21.Q0() <= 0) goto L91;
        do2 r25 = r21.K0();
        r25.getClass();
        r7.m0(r25, r21.o0());
        goto L94
    L77:
        if (r20 >= r22.length) goto L79;
        r23 = Integer.valueOf(r22[r20]);
        goto L80
    L72:
        if (u52.k() == false) goto L94;
        u52.q("select", r20, r20);
        goto L94
    L47:
        if (((Boolean) r7.x0.getValue()).booleanValue() == false) goto L66;
        if (u52.c().a == true) goto L66;
        MediaService r26 = is3.c;
        if (r26 == null) goto L94;
        qi3 r27 = r26.b();
        if (r27 == null) goto L94;
        if (r27.f0() == false) goto L60;
        r27.c0();
        goto L94
    L60:
        if (a.j(r27) == true) goto L94;
        is3.e.k(Boolean.TRUE);
        if (b.h(r27) == false) goto L65;
        io1.b.post(new u6(14));
        goto L94
    L65:
        is3.d = false;
        is3.a(r27, r26);
        goto L94
    L95:
        Child r28 = (Child) r8;
        if (u52.c().a == false) goto L98;
    L114:
        return r3;
    L98:
        if (r7.o0 != null) goto L114;
        if (r28 == null) goto L114;
        if (r7.h0().isEmpty() == true) goto L114;
        Iterator r29 = r7.h0().iterator();
    L104:
        if (r29.hasNext() == false) goto L109;
        if (h12.c(((Child) r29.next()).getId(), r28.getId()) == true) goto L110;
        r2 = r2 + 1;
    L110:
        if (r2 < 0) goto L114;
        if (r2 == r7.s0.g()) goto L114;
        r7.k0(r2);
        goto L114
    L109:
        r2 = -1;
        goto L110
    L5:
        if (((v52) r8).a == false) goto L7;
        r7.j0();
    L10:
        return r3;
    L7:
        List r30 = r7.r0;
        r7.q0.setValue(r30);
        bj2 r31 = r7.o0;
        if (r31 == null) goto L10;
        do2 r32 = r31.K0();
        r32.getClass();
        r7.m0(r32, r31.o0());
        goto L10
    }
}
