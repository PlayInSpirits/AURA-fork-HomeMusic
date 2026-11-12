package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vj4 extends zz1 {
    public final be3 n;
    public final h00 o;
    public iu4 p;

    public vj4() {
        this.n = new be3();
        this.o = new h00();
    }

    @Override // defpackage.zz1
    public final qv2 k(uv2 r19, ByteBuffer r20) {
        be3 r2 = this.n;
        h00 r3 = this.o;
        iu4 r4 = this.p;
        if (r4 == null) goto L14;
        long r5 = r19.x;
        monitor-enter(r4);
        long r7 = r4.b;     // Catch: Throwable -> L11
        monitor-exit(r4);
        if (r5 != r7) goto L14;
    L15:
        byte[] r1 = r20.array();
        int r6 = r20.limit();
        r2.L(r6, r1);
        r3.o(r6, r1);
        r3.t(39);
        long r12 = (((long) r3.i(1)) << 32) | ((long) r3.i(32));
        r3.t(20);
        int r8 = r3.i(12);
        int r9 = r3.i(8);
        r2.O(14);
        if (r9 != 0) goto L18;
        pv2 r0 = new wj4();
    L93:
        if (r0 != null) goto L97;
        return new qv2(new pv2[0]);
    L97:
        return new qv2(new pv2[]{r0});
    L18:
        if (r9 != 255) goto L20;
        long r10 = r2.C();
        int r11 = r8 - 4;
        r2.k(new byte[r11], 0, r11);
        r0 = new iq3(0, r10, r12);
        goto L93
    L20:
        if (r9 == 4) goto L63;
        if (r9 != 5) goto L23;
        iu4 r13 = this.p;
        r2.C();
        if ((r2.A() & 128) == 0) goto L29;
        boolean r14 = true;
    L30:
        List r15 = Collections.EMPTY_LIST;
        if (r14 == true) goto L61;
        int r16 = r2.A();
        if ((r16 & 64) == 0) goto L35;
        boolean r17 = true;
    L37:
        if ((r16 & 32) == 0) goto L39;
        boolean r18 = true;
    L41:
        if ((r16 & 16) == 0) goto L43;
        boolean r21 = true;
    L44:
        if (r17 == false) goto L47;
        if (r21 == true) goto L47;
        long r110 = iq3.d(r12, r2);
    L48:
        if (r17 == true) goto L57;
        int r22 = r2.A();
        ArrayList r23 = new ArrayList(r22);
        int r111 = 0;
    L50:
        if (r111 >= r22) goto L56;
        r2.A();
        if (r21 == true) goto L54;
        long r24 = iq3.d(r12, r2);
    L55:
        r13.b(r24);
        r23.add(new xi4(3));
        r111 = r111 + 1;
        goto L50
    L54:
        r24 = -9223372036854775807L;
        goto L55
    L56:
        r15 = r23;
    L57:
        if (r18 == false) goto L59;
        r2.A();
        r2.C();
    L59:
        r2.H();
        r2.A();
        r2.A();
        long r112 = r110;
    L62:
        r0 = new iq3(r112, r13.b(r112), r15);
    L47:
        r110 = -9223372036854775807L;
        goto L48
    L43:
        r21 = false;
        goto L44
    L39:
        r18 = false;
        goto L41
    L35:
        r17 = false;
        goto L37
    L61:
        r112 = -9223372036854775807L;
        goto L62
    L29:
        r14 = false;
        goto L30
    L23:
        if (r9 == 6) goto L25;
        r0 = null;
        goto L93
    L25:
        iu4 r25 = this.p;
        long r26 = iq3.d(r12, r2);
        r0 = new iq3(2, r26, r25.b(r26));
        goto L93
    L63:
        int r27 = r2.A();
        ArrayList r28 = new ArrayList(r27);
        int r29 = 0;
    L64:
        if (r29 >= r27) goto L90;
        r2.C();
        if ((r2.A() & 128) == 0) goto L68;
        boolean r30 = true;
    L69:
        ArrayList r31 = new ArrayList();
        if (r30 == true) goto L89;
        int r32 = r2.A();
        if ((r32 & 64) == 0) goto L74;
        boolean r113 = true;
    L76:
        if ((r32 & 32) == 0) goto L78;
        boolean r33 = true;
    L79:
        if (r113 == false) goto L81;
        r2.C();
    L81:
        if (r113 == true) goto L86;
        int r34 = r2.A();
        ArrayList r114 = new ArrayList(r34);
        int r115 = 0;
    L83:
        if (r115 >= r34) goto L85;
        r2.A();
        r2.C();
        r114.add(new xi4(4));
        r115 = r115 + 1;
        goto L83
    L85:
        r31 = r114;
    L86:
        if (r33 == false) goto L88;
        r2.A();
        r2.C();
    L88:
        r2.H();
        r2.A();
        r2.A();
        goto L89
    L78:
        r33 = false;
        goto L79
    L74:
        r113 = false;
    L89:
        xi4 r35 = new xi4(5);
        Collections.unmodifiableList(r31);
        r28.add(r35);
        r29 = r29 + 1;
        goto L64
    L68:
        r30 = false;
        goto L69
    L90:
        r0 = new wj4();
        Collections.unmodifiableList(r28);
    L11:
        th = move-exception;
        throw th;
    L14:
        iu4 r36 = new iu4(r19.t);
        this.p = r36;
        r36.a(r19.t - r19.x);
        goto L15
    }
}
