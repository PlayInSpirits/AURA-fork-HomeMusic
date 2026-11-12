package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class uq1 implements Closeable {
    public static final Logger q = null;
    public final fw n;
    public final tq1 o;
    public final yp1 p;

    static {
        Logger r0 = Logger.getLogger(iq1.class.getName());
        r0.getClass();
        q = r0;
    }

    public uq1(fw r2) {
        r2.getClass();
        this.n = r2;
        tq1 r0 = new tq1(r2);
        this.o = r0;
        this.p = new yp1(r0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b(boolean r18, mq1 r19) {
        boolean r2 = false;
        int r3 = 0;
        Object[] r4 = 0;
        this.n.P(9);     // Catch: EOFException -> L233
        int r5 = xe5.n(this.n);
        if (r5 > 16384) goto L231;
        int r6 = this.n.readByte() & 255;
        byte r7 = this.n.readByte();
        int r8 = r7 & 255;
        int r9 = this.n.readInt();
        int r10 = Integer.MAX_VALUE & r9;
        if (r6 == 8) goto L12;
        Logger r12 = q;
        if (r12.isLoggable(Level.FINE) == false) goto L12;
        r12.fine(iq1.b(true, r10, r5, r6, r8));
    L12:
        if (r18 == false) goto L17;
        if (r6 == 4) goto L17;
        mj0.m(iq1.a(r6), "Expected a SETTINGS frame but was ");
        return false;
    L17:
        int r13 = 2;
        switch(r6) {
            case 0: goto L229;
            case 1: goto L227;
            case 2: goto L219;
            case 3: goto L182;
            case 4: goto L132;
            case 5: goto L130;
            case 6: goto L102;
            case 7: goto L57;
            case 8: goto L241;
            default: goto L19;
        };
    L19:
        this.n.skip(r5);
        return true;
    L57:
        if (r5 < 8) goto L100;
        if (r10 != 0) goto L98;
        int r11 = this.n.readInt();
        int r14 = this.n.readInt();
        int r15 = r5 - 8;
        b21.o.getClass();
        b21[] r16 = b21.values();
        int r17 = r16.length;
        int r20 = 0;
    L60:
        if (r20 >= r17) goto L65;
        b21 r21 = r16[r20];
        if (r21.n == r14) goto L63;
        r20 = r20 + 1;
        goto L60
    L63:
        b21 r110 = r21;
    L66:
        if (r110 == null) goto L96;
        yw r22 = yw.q;
        if (r15 <= 0) goto L70;
        r22 = this.n.g(r15);
    L70:
        r22.getClass();
        r22.d();
        rq1 r23 = r19.o;
        monitor-enter(r23);
        Object[] r0 = r23.o.values().toArray(new yq1[0]);     // Catch: Throwable -> L93
        r23.s = true;     // Catch: Throwable -> L93
        monitor-exit(r23);
        yq1[] r1 = (yq1[]) r0;
        int r24 = r1.length;
    L75:
        if (r3 >= r24) goto L211;
        yq1 r25 = r1[r3];
        if (r25.a <= r11) goto L92;
        if (r25.g() == false) goto L92;
        b21 r26 = b21.t;
        monitor-enter(r25);
    L86:
        th = move-exception;
        throw th;
    L83:
        if (r25.l != null) goto L88;
        r25.l = r26;     // Catch: Throwable -> L86
        r25.notifyAll();     // Catch: Throwable -> L86
    L88:
        monitor-exit(r25);
        r19.o.n(r25.a);
    L92:
        r3 = r3 + 1;
    L211:
        return true;
    L93:
        th = move-exception;
        throw th;
    L96:
        mj0.i(f34.f(r14, "TYPE_GOAWAY unexpected error code: "));
        return false;
    L65:
        r110 = null;
        goto L66
    L98:
        mj0.i("TYPE_GOAWAY streamId != 0");
        return false;
    L100:
        mj0.i(f34.f(r5, "TYPE_GOAWAY length < 8: "));
        return false;
    L102:
        if (r5 != 8) goto L128;
        if (r10 != 0) goto L126;
        int r27 = this.n.readInt();
        int r28 = this.n.readInt();
        if ((r7 & 1) == 0) goto L107;
        r4 = 1;
    L107:
        rq1 r29 = r19.o;
        if (r4 == 0) goto L124;
        monitor-enter(r29);
        if (r27 == 1) goto L119;
        if (r27 == 2) goto L118;
        if (r27 != 3) goto L120;
        r29.notifyAll();     // Catch: Throwable -> L116
    L242:
    L120:
        monitor-exit(r29);
        return true;
    L118:
        r29.A++;     // Catch: Throwable -> L116
        goto L242
    L119:
        r29.y++;     // Catch: Throwable -> L116
    L116:
        th = move-exception;
        throw th;
    L124:
        fr4.c(r29.u, b11.q(new StringBuilder(), r19.o.p, " ping"), new lq1(r19.o, r27, r28));
        return true;
    L126:
        mj0.i("TYPE_PING streamId != 0");
        return false;
    L128:
        mj0.i(f34.f(r5, "TYPE_PING length != 8: "));
        return false;
    L130:
        q(r19, r5, r8, r10);
        return true;
    L132:
        fw r30 = this.n;
        if (r10 == 0) goto L135;
        mj0.i("TYPE_SETTINGS streamId != 0");
        return false;
    L135:
        if ((r7 & 1) == 0) goto L141;
        if (r5 == 0) goto L211;
        mj0.i("FRAME_SIZE_ERROR ack frame should be empty!");
        return false;
    L141:
        if ((r5 % 6) != 0) goto L177;
        pb4 r31 = new pb4();
        int r32 = 6;
        h02 r33 = gb.b0(gb.g0(0, r5), 6);
        int r34 = r33.n;
        int r35 = r33.o;
        int r36 = r33.p;
        if (r36 <= 0) goto L145;
        if (r34 > r35) goto L145;
    L147:
        short r37 = r30.readShort();
        byte[] r111 = xe5.a;
        int r38 = r37 & 65535;
        int r112 = r30.readInt();
        if (r38 == 2) goto L166;
        if (r38 == 3) goto L165;
        if (r38 == 4) goto L160;
        if (r38 == 5) goto L153;
        boolean r113 = r2;
    L172:
        r31.b(r38, r112);
        if (r34 == r35) goto L175;
        r34 = r34 + r36;
        r2 = r113;
    L175:
        rq1 r39 = r19.o;
        fr4.c(r39.u, b11.q(new StringBuilder(), r39.p, " applyAndAckSettings"), new gp(r32, r19, r31));
        return true;
    L153:
        r113 = r2;
        if (r112 < 16384) goto L158;
        if (r112 <= 16777215) goto L172;
    L158:
        mj0.i(f34.f(r112, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
        return r113;
    L160:
        r113 = r2;
        if (r112 < 0) goto L163;
        r38 = 7;
        goto L172
    L163:
        mj0.i("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
        return r113;
    L165:
        r113 = r2;
        r38 = 4;
        goto L172
    L166:
        r113 = r2;
        if (r112 == 0) goto L172;
        if (r112 == 1) goto L172;
        mj0.i("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
        return r113;
    L145:
        if (r36 >= 0) goto L175;
        if (r35 > r34) goto L175;
    L177:
        mj0.i(f34.f(r5, "TYPE_SETTINGS length % 6 != 0: "));
        return false;
    L227:
        n(r19, r5, r8, r10);
        return true;
    L229:
        f(r19, r5, r8, r10);
        return true;
    L241:
        if (r5 != 4) goto L54;
        long r40 = 2147483647L & ((long) this.n.readInt());
        if (r40 == 0) goto L50;
        Logger r41 = q;
        if (r41.isLoggable(Level.FINE) == false) goto L29;
        r41.fine(iq1.c(r10, r5, r40, true));
    L29:
        rq1 r42 = r19.o;
        if (r10 != 0) goto L38;
        monitor-enter(r42);
        r42.H += r40;     // Catch: Throwable -> L35
        r42.notifyAll();     // Catch: Throwable -> L35
        monitor-exit(r42);
        return true;
    L35:
        th = move-exception;
        throw th;
    L38:
        yq1 r43 = r42.j(r10);
        if (r43 == null) goto L211;
        monitor-enter(r43);
        r43.e += r40;     // Catch: Throwable -> L46
        if (r40 <= 0) goto L44;
        r43.notifyAll();     // Catch: Throwable -> L46
    L44:
        monitor-exit(r43);
        return true;
    L46:
        th = move-exception;
        throw th;
    L50:
        throw new IOException("windowSizeIncrement was 0");     // Catch: Exception -> L51
    L54:
        throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + r5);     // Catch: Exception -> L51
    L51:
        e = move-exception;
        q.fine(iq1.b(true, r10, r5, 8, r8));
        throw e;
    L182:
        if (r5 != 4) goto L216;
        if (r10 == 0) goto L214;
        int r44 = this.n.readInt();
        b21.o.getClass();
        b21[] r45 = b21.values();
        int r46 = r45.length;
        int r47 = 0;
    L185:
        if (r47 >= r46) goto L190;
        b21 r48 = r45[r47];
        if (r48.n == r44) goto L191;
        r47 = r47 + 1;
    L191:
        if (r48 == null) goto L212;
        rq1 r49 = r19.o;
        if (r10 != 0) goto L195;
    L198:
        yq1 r50 = r49.n(r10);
        if (r50 == null) goto L211;
        monitor-enter(r50);
    L205:
        th = move-exception;
        throw th;
    L202:
        if (r50.l != null) goto L207;
        r50.l = r48;     // Catch: Throwable -> L205
        r50.notifyAll();     // Catch: Throwable -> L205
    L207:
        monitor-exit(r50);
        return true;
    L195:
        if ((r9 & 1) != 0) goto L198;
        fr4.c(r49.v, r49.p + '[' + r10 + "] onReset", new oq1(r49, r10, r48, r13));
        return true;
    L212:
        mj0.i(f34.f(r44, "TYPE_RST_STREAM unexpected error code: "));
        return false;
    L190:
        r48 = null;
        goto L191
    L214:
        mj0.i("TYPE_RST_STREAM streamId == 0");
        return false;
    L216:
        mj0.i(b11.j(r5, "TYPE_RST_STREAM length: ", " != 4"));
        return false;
    L219:
        if (r5 != 5) goto L225;
        if (r10 == 0) goto L223;
        fw r51 = this.n;
        r51.readInt();
        r51.readByte();
        return true;
    L223:
        mj0.i("TYPE_PRIORITY streamId == 0");
        return false;
    L225:
        mj0.i(b11.j(r5, "TYPE_PRIORITY length: ", " != 5"));
        return false;
    L231:
        mj0.i(f34.f(r5, "FRAME_SIZE_ERROR: "));
        return false;
    L234:
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.n.close();
    }

    public final void f(mq1 r17, int r18, int r19, int r20) {
        if (r20 == 0) goto L72;
        boolean r6 = true;
        if ((r19 & 1) != 0) goto L9;
        r6 = false;
    L9:
        if ((r19 & 32) == 0) goto L11;
        mj0.i("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        return;
    L11:
        if ((r19 & 8) == 0) goto L14;
        byte r7 = this.n.readByte();
        byte[] r8 = xe5.a;
        int r9 = r7 & 255;
    L15:
        int r2 = te5.E(r18, r19, r9);
        fw r10 = this.n;
        r10.getClass();
        rq1 r11 = r17.o;
        if (r20 != 0) goto L18;
    L20:
        boolean r12 = false;
    L21:
        if (r12 == false) goto L23;
        tv r4 = new tv();
        long r13 = r2;
        r10.P(r13);
        r10.read(r4, r13);
        fr4.c(r11.v, r11.p + '[' + r20 + "] onData", new nq1(r11, r20, r4, r2, r6));
    L68:
        this.n.skip(r9);
        return;
    L23:
        yq1 r14 = r11.j(r20);
        if (r14 != null) goto L26;
        r17.o.v(r20, b21.q);
        long r3 = r2;
        r17.o.s(r3);
        r10.skip(r3);
        goto L68
    L26:
        tl1 r1 = ze5.a;
        wq1 r5 = r14.h;
        long r15 = r2;
        r5.getClass();
        long r16 = r15;
    L27:
        yq1 r110 = r5.t;
        if (r16 <= 0) goto L65;
        monitor-enter(r110);
        boolean r111 = r5.o;     // Catch: Throwable -> L62
        if ((r5.q.o + r16) <= r5.n) goto L34;
        boolean r21 = true;
    L35:
        monitor-exit(r110);
        if (r21 == true) goto L37;
        if (r111 == true) goto L39;
        long r22 = r10.read(r5.p, r16);
        if (r22 == (-1)) goto L61;
        r16 = r16 - r22;
        yq1 r23 = r5.t;
        monitor-enter(r23);
        if (r5.s == false) goto L49;
        r5.p.b();     // Catch: Throwable -> L47
    L56:
        monitor-exit(r23);
        goto L27
    L49:
        tv r24 = r5.q;     // Catch: Throwable -> L47
        if (r24.o != 0) goto L52;
        boolean r112 = true;
    L53:
        r24.p(r5.p);     // Catch: Throwable -> L47
        if (r112 == false) goto L56;
        r23.notifyAll();     // Catch: Throwable -> L47
        goto L56
    L52:
        r112 = false;
    L47:
        th = move-exception;
        throw th;
    L61:
        throw new EOFException();
    L39:
        r10.skip(r16);
    L66:
        if (r6 == false) goto L68;
        r14.i(ze5.a, true);
        goto L68
    L37:
        r10.skip(r16);
        r5.t.e(b21.s);
        goto L66
    L34:
        r21 = false;
    L62:
        th = move-exception;
        throw th;
    L65:
        tl1 r25 = ze5.a;
        r110.b.s(r15);
        r5.t.b.C.getClass();
        goto L66
    L18:
        if ((r20 & 1) != 0) goto L20;
        r12 = true;
        goto L21
    L14:
        r9 = 0;
        goto L15
    L72:
        mj0.i("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
    }

    public final List j(int r4, int r5, int r6, int r7) {
        tq1 r0 = this.o;
        r0.r = r4;
        r0.o = r4;
        r0.s = r5;
        r0.p = r6;
        r0.q = r7;
        yp1 r3 = this.p;
        xu3 r8 = r3.c;
        ArrayList r9 = r3.b;
    L4:
        if (r8.l() == true) goto L48;
        byte r10 = r8.readByte();
        byte[] r11 = xe5.a;
        int r12 = r10 & 255;
        if (r12 == 128) goto L46;
        if ((r10 & 128) == 128) goto L9;
        if (r12 == 64) goto L23;
        if ((r10 & 64) == 64) goto L26;
        if ((r10 & 32) == 32) goto L29;
        if (r12 == 16) goto L45;
        if (r12 == 0) goto L45;
        r9.add(new pl1(r3.b(r3.e(r12, 15) - 1), r3.d()));
    L45:
        pl1[] r13 = aq1.a;
        yw r14 = r3.d();
        aq1.a(r14);
        r9.add(new pl1(r14, r3.d()));
        goto L4
    L29:
        int r15 = r3.e(r12, 31);
        r3.a = r15;
        if (r15 < 0) goto L39;
        if (r15 > 4096) goto L39;
        int r16 = r3.g;
        if (r15 >= r16) goto L4;
        if (r15 == 0) goto L36;
        r3.a(r16 - r15);
        goto L4
    L36:
        ti.h0(r3.d, null);
        r3.e = r3.d.length - 1;
        r3.f = 0;
        r3.g = 0;
    L39:
        throw new IOException("Invalid dynamic table size update " + r3.a);
    L26:
        r3.c(new pl1(r3.b(r3.e(r12, 63) - 1), r3.d()));
        goto L4
    L23:
        pl1[] r17 = aq1.a;
        yw r18 = r3.d();
        aq1.a(r18);
        r3.c(new pl1(r18, r3.d()));
        goto L4
    L9:
        int r19 = r3.e(r12, 127);
        int r20 = r19 - 1;
        if (r20 < 0) goto L14;
        pl1[] r1 = aq1.a;
        if (r20 > (r1.length - 1)) goto L14;
        r9.add(r1[r20]);
    L14:
        int r2 = (r3.e + 1) + (r20 - aq1.a.length);
        if (r2 < 0) goto L19;
        pl1[] r21 = r3.d;
        if (r2 >= r21.length) goto L19;
        pl1 r22 = r21[r2];
        r22.getClass();
        r9.add(r22);
    L19:
        mj0.i(f34.f(r19, "Header index too large "));
        return null;
    L46:
        mj0.i("index == 0");
        return null;
    L48:
        List r23 = q40.Q0(r9);
        r9.clear();
        return r23;
    }

    public final void n(mq1 r10, int r11, int r12, int r13) {
        if (r13 == 0) goto L48;
        boolean r1 = false;
        if ((r12 & 1) == 0) goto L6;
        boolean r7 = true;
    L8:
        if ((r12 & 8) == 0) goto L10;
        byte r0 = this.n.readByte();
        byte[] r3 = xe5.a;
        int r2 = r0 & 255;
    L12:
        if ((r12 & 32) == 0) goto L14;
        fw r4 = this.n;
        r4.readInt();
        r4.readByte();
        byte[] r5 = xe5.a;
        r11 = r11 - 5;
    L14:
        List r9 = j(te5.E(r11, r12, r2), r2, r12, r13);
        rq1 r6 = r10.o;
        if (r13 == 0) goto L20;
        if ((r13 & 1) != 0) goto L20;
        r1 = true;
    L20:
        if (r1 == false) goto L23;
        fr4.c(r6.v, r6.p + '[' + r13 + "] onHeaders", new oq1(r6, r13, r9, r7));
        return;
    L23:
        monitor-enter(r6);
        yq1 r14 = r6.j(r13);     // Catch: Throwable -> L41
        if (r14 == null) goto L27;
        monitor-exit(r6);
        r14.i(ze5.i(r9), r7);
        return;
    L27:
        if (r6.s == false) goto L31;
        monitor-exit(r6);
        return;
    L31:
        if (r13 > r6.q) goto L35;
        monitor-exit(r6);
        return;
    L35:
        if ((r13 % 2) != (r6.r % 2)) goto L38;
        monitor-exit(r6);
        return;
    L38:
        yq1 r8 = new yq1(r13, r6, false, r7, ze5.i(r9));     // Catch: Throwable -> L41
        r6.q = r13;     // Catch: Throwable -> L41
        r6.o.put(Integer.valueOf(r13), r8);     // Catch: Throwable -> L41
        fr4.c(r6.t.e(), r6.p + '[' + r13 + "] onStream", new gp(5, r6, r8));     // Catch: Throwable -> L41
        monitor-exit(r6);
        return;
    L41:
        th = move-exception;
        throw th;
    L10:
        r2 = 0;
        goto L12
    L6:
        r7 = false;
        goto L8
    L48:
        mj0.i("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
    }

    public final void q(mq1 r4, int r5, int r6, int r7) {
        if (r7 != 0) goto L4;
        mj0.i("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        return;
    L4:
        if ((r6 & 8) == 0) goto L6;
        byte r0 = this.n.readByte();
        byte[] r1 = xe5.a;
        int r2 = r0 & 255;
    L7:
        int r3 = this.n.readInt() & Integer.MAX_VALUE;
        List r8 = j(te5.E(r5 - 4, r6, r2), r2, r6, r7);
        rq1 r9 = r4.o;
        monitor-enter(r9);
    L14:
        th = move-exception;
        throw th;
    L10:
        if (r9.L.contains(Integer.valueOf(r3)) == false) goto L16;
        r9.v(r3, b21.q);     // Catch: Throwable -> L14
        monitor-exit(r9);
        return;
    L16:
        r9.L.add(Integer.valueOf(r3));     // Catch: Throwable -> L14
        monitor-exit(r9);
        fr4.c(r9.v, r9.p + '[' + r3 + "] onRequest", new oq1(r9, r3, r8, 1));
        return;
    L6:
        r2 = 0;
        goto L7
    }
}
