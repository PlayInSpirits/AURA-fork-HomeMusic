package defpackage;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import androidx.media3.exoplayer.audio.AudioOutput$WriteException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class an {
    public static final Object r = null;
    public static ScheduledExecutorService s;
    public static int t;
    public final AudioTrack a;
    public final em b;
    public final zh0 c;
    public bq4 d;
    public final en e;
    public final boolean f;
    public final int g;
    public final jv3 h;
    public final tc2 i;
    public boolean j;
    public long k;
    public long l;
    public long m;
    public ByteBuffer n;
    public int o;
    public int p;
    public int q;

    static {
        r = new Object();
    }

    public an(AudioTrack r10, em r11, zh0 r12, vp4 r13) {
        this.a = r10;
        this.b = r11;
        this.c = r12;
        tc2 r0 = new tc2(Thread.currentThread());
        this.i = r0;
        r0.i = false;
        boolean r1 = f35.L(r11.a);
        this.f = r1;
        if (r1 == false) goto L5;
        int r2 = Integer.bitCount(r11.c);
        this.g = f35.t(r11.a) * r2;
    L6:
        this.e = new en(new d34(8, this), r13, r10, r11.a, this.g, r11.f);
        if (r12 == null) goto L9;
        this.d = new bq4(r10, r12);
    L9:
        jv3 r14 = null;
        if (c() == false) goto L12;
        jv3 r15 = new jv3();
        r15.p = this;
        Handler r16 = f35.p(null);
        r15.n = r16;
        zm r17 = new zm(r15);
        r15.o = r17;
        z9.p(this.a, new ym(r16, 0), r17);
        r14 = r15;
    L12:
        this.h = r14;
        return;
    L5:
        this.g = -1;
        goto L6
    }

    public final long a() {
        en r0 = this.e;
        vp4 r1 = r0.b;
        vm r2 = r0.h;
        AudioTrack r3 = r0.d;
        if (r3.getPlayState() != 3) goto L103;
        long[] r4 = r0.c;
        r1.getClass();
        long r13 = System.nanoTime() / 1000;
        if ((r13 - r0.l) < 30000) goto L16;
        long r17 = 1000;
        long r6 = f35.Y(r0.e, r0.a());
        if (r6 == 0) goto L104;
        r4[r0.s] = f35.E(r6, r0.i) - r13;
        r0.s = (r0.s + 1) % 10;
        int r7 = r0.t;
        if (r7 >= 10) goto L12;
        r0.t = r7 + 1;
    L12:
        r0.l = r13;
        r0.k = 0;
        int r8 = 0;
    L13:
        int r9 = r0.t;
        if (r8 >= r9) goto L17;
        int r15 = r8;
        r0.k = (r4[r15] / ((long) r9)) + r0.k;
        r8 = r15 + 1;
    L17:
        long r5 = r0.n;
        if (r0.g == false) goto L36;
        Method r10 = r0.m;
        if (r10 == null) goto L36;
        if ((r13 - r0.o) < 500000) goto L36;
        Integer r11 = (Integer) r10.invoke(r3, null);     // Catch: Exception -> L32
        String r12 = f35.a;     // Catch: Exception -> L32
        long r21 = r13;
        long r14 = (((long) r11.intValue()) * r17) - r0.f;     // Catch: Exception -> L30
        r0.n = r14;     // Catch: Exception -> L30
        long r16 = Math.max(r14, 0);     // Catch: Exception -> L30
        r0.n = r16;     // Catch: Exception -> L30
        if (r16 <= 10000000) goto L31;
        l93.q0("AudioTrackAudioOutput", "Ignoring impossibly large audio latency: " + r16);     // Catch: Exception -> L30
        r0.n = 0;     // Catch: Exception -> L30
    L31:
        r13 = r21;
        r0.o = r13;
    L30:
        Method r18 = null;
    L33:
        r0.m = r18;
    L32:
        r21 = r13;
        r18 = null;
    L36:
        if (r5 == r0.n) goto L38;
        boolean r19 = true;
    L39:
        float r20 = r0.i;
        long r110 = r0.b(r13);
        um r22 = r2.a;
        um r111 = r2.a;
        long r23 = 0;
        int r24 = r2.b;
        if (r19 == false) goto L42;
    L44:
        r2.g = r13;
        AudioTrack r25 = r22.a;
        AudioTimestamp r26 = r22.b;
        boolean r27 = r25.getTimestamp(r26);
        if (r27 == false) goto L54;
        long r28 = r26.framePosition;
        long r29 = r22.d;
        if (r29 > r28) goto L49;
    L52:
        r22.d = r28;
        r22.e = (r28 + r22.g) + (r22.c << 32);
        goto L54
    L49:
        if (r22.f == false) goto L51;
        r22.g += r29;
        r22.f = false;
        goto L52
    L51:
        r22.c++;
    L54:
        if (r27 == false) goto L64;
        d34 r30 = r2.c;
        long r31 = r26.nanoTime / r17;
        long r32 = r111.e;
        r3 = r3;
        um r33 = r111;
        long r112 = r111.b.nanoTime / r17;
        long r113 = f35.A(r13 - r112, r20) + f35.Y(r24, r32);
        if (Math.abs(r31 - r13) <= 5000000) goto L59;
        long r114 = r22.e;
        r30.getClass();
        l93.q0("AudioTrackAudioOutput", "Spurious audio timestamp (system clock mismatch): " + r114 + ", " + r31 + ", " + r13 + ", " + r110 + ", " + ((an) r30.o).b());
        int r34 = 4;
        r2.a(4);
        boolean r210 = r27;
        AudioTimestamp r211 = r26;
        float r212 = r20;
    L65:
        int r35 = r2.d;
        if (r35 != 0) goto L68;
        long r213 = r13;
        AudioTimestamp r36 = r211;
        boolean r115 = false;
        if (r210 == false) goto L101;
        long r37 = r36.nanoTime;
        if ((r37 / r17) < r2.e) goto L106;
        r2.h = r22.e;
        r2.i = r37 / r17;
        r2.a(1);
    L106:
        r1.getClass();
        long r38 = System.nanoTime() / r17;
        if (r2.d != 2) goto L109;
        boolean r116 = true;
    L110:
        if (r116 == false) goto L112;
        en r39 = r0;
        float r40 = r39.i;
        um r41 = r2.a;
        long r42 = r41.e;
        long r43 = r41.b.nanoTime / r17;
        long r44 = f35.A(r38 - r43, r40) + f35.Y(r2.b, r42);
    L113:
        int r45 = r3.getPlayState();
        if (r45 != 3) goto L131;
        if (r116 == true) goto L121;
        int r46 = r2.d;
        if (r46 != 0) goto L119;
    L122:
        long r47 = r39.z;
        if (r47 == (-9223372036854775807L)) goto L129;
        long r48 = r44 - r39.y;
        long r49 = f35.A(r38 - r47, r39.i);
        long r117 = r39.y + r49;
        long r118 = Math.abs(r117 - r44);
        if (r48 == r23) goto L129;
        if (r118 >= 1000000) goto L129;
        long r50 = (r49 * 10) / 100;
        r44 = f35.k(r44, r117 - r50, r117 + r50);
    L129:
        r39.z = r38;
        r39.y = r44;
    L133:
        return r44;
    L119:
        if (r46 == 1) goto L122;
    L121:
        r39.d(r44);
        goto L122
    L131:
        if (r45 != 1) goto L133;
        r39.d(r44);
        goto L133
    L112:
        r39 = r0;
        r44 = r39.b(r38);
        goto L113
    L109:
        r116 = r115;
        goto L110
    L101:
        if ((r213 - r2.e) <= 500000) goto L106;
        r2.a(3);
        goto L106
    L68:
        if (r35 != 1) goto L70;
        um r51 = r33;
        if (r210 == false) goto L94;
        long r52 = r22.e;
        long r53 = r2.h;
        if (r52 > r53) goto L87;
        long r214 = r13;
    L91:
        if ((r214 - r2.e) <= 2000000) goto L93;
        r2.a(3);
    L105:
        r115 = false;
        goto L106
    L93:
        r2.h = r22.e;
        r2.i = r211.nanoTime / r17;
        goto L105
    L87:
        long r54 = r2.i;
        float r55 = r212;
        long r56 = f35.A(r13 - r54, r55) + f35.Y(r24, r53);
        long r57 = r51.e;
        r214 = r13;
        long r119 = r51.b.nanoTime / r17;
        if (Math.abs((f35.A(r214 - r119, r55) + f35.Y(r24, r57)) - r56) >= r17) goto L91;
        r2.a(2);
        goto L105
    L94:
        r115 = false;
        r2.a(0);
        goto L106
    L70:
        if (r35 == 2) goto L80;
        if (r35 == 3) goto L77;
        if (r35 == r34) goto L105;
        tb4.a();
        return 0;
    L77:
        if (r210 == false) goto L105;
        r115 = false;
        r2.a(0);
        goto L106
    L80:
        if (r210 == true) goto L105;
        r2.a(0);
        goto L105
    L59:
        if (Math.abs(r113 - r110) <= 5000000) goto L61;
        r210 = r27;
        long r58 = r22.e;
        r30.getClass();
        r211 = r26;
        r212 = r20;
        l93.q0("AudioTrackAudioOutput", "Spurious audio timestamp (frame position mismatch): " + r58 + ", " + r31 + ", " + r13 + ", " + r110 + ", " + ((an) r30.o).b());
        r34 = 4;
        r2.a(4);
        goto L65
    L61:
        r210 = r27;
        r211 = r26;
        r212 = r20;
        r34 = 4;
        if (r2.d != 4) goto L65;
        r2.a(0);
        goto L65
    L64:
        r210 = r27;
        r211 = r26;
        r212 = r20;
        r3 = r9;
        r33 = r111;
        r34 = 4;
        goto L65
    L42:
        if ((r13 - r2.g) >= r2.f) goto L44;
        r0 = r0;
        r1 = r1;
        r3 = r3;
        goto L105
    L38:
        r19 = false;
    L104:
        r23 = 0;
        goto L105
    L16:
        r17 = 1000;
        goto L17
    L103:
        r17 = 1000;
        goto L104
    }

    public final long b() {
        if (this.f == false) goto L7;
        long r0 = this.k;
        long r2 = this.g;
        String r6 = f35.a;
        return ((r0 + r2) - 1) / r2;
    L7:
        return this.l;
    }

    public final boolean c() {
        if (Build.VERSION.SDK_INT >= 29) goto L5;
        return false;
    L5:
        if (z9.x(this.a) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public final boolean d(int r12, long r13, ByteBuffer r15) {
        em r0 = this.b;
        boolean r1 = this.f;
        if (r1 == false) goto L5;
    L7:
        b();
        AudioTrack r3 = this.a;
        int r2 = r3.getUnderrunCount();
        boolean r9 = false;
        if (r2 <= this.q) goto L10;
        boolean r4 = true;
    L11:
        this.q = r2;
        if (r4 == false) goto L14;
        this.i.f(-1, new kf2(5));
    L14:
        int r5 = r15.remaining();
        if (r0.d == true) goto L17;
        int r14 = r3.write(r15, r15.remaining(), 1);
    L41:
        if (r14 < 0) goto L43;
        if (r14 != r5) goto L57;
        r9 = true;
    L57:
        if (r1 == false) goto L60;
        this.k += (long) r14;
        return r9;
    L60:
        if (r9 == false) goto L62;
        this.l = (((long) this.p) * ((long) r12)) + this.l;
    L62:
        return r9;
    L43:
        if (r14 != (-6)) goto L45;
    L46:
        r9 = true;
    L47:
        if (r9 == false) goto L54;
        zh0 r11 = this.c;
        if (r11 == null) goto L54;
        dn r16 = (dn) r11.o;
        ql r17 = r16.h;
        if (r17 == null) goto L54;
        nl r18 = nl.c;
        r16.g = r18;
        r17.a(r18);
    L54:
        throw new AudioOutput$WriteException(r14, r9);
    L45:
        if (r14 != (-32)) goto L47;
    L17:
        if (r13 != Long.MIN_VALUE) goto L19;
        r13 = this.m;
    L20:
        int r6 = r15.remaining();
        if (Build.VERSION.SDK_INT < 26) goto L24;
        r14 = r3.write(r15, r6, 1, 1000 * r13);
        goto L41
    L24:
        if (this.n != null) goto L27;
        ByteBuffer r19 = ByteBuffer.allocate(16);
        this.n = r19;
        r19.order(ByteOrder.BIG_ENDIAN);
        this.n.putInt(1431633921);
    L27:
        if (this.o != 0) goto L29;
        this.n.putInt(4, r6);
        this.n.putLong(8, r13 * 1000);
        this.n.position(0);
        this.o = r6;
    L29:
        int r110 = this.n.remaining();
        if (r110 <= 0) goto L36;
        int r111 = r3.write(this.n, r110, 1);
        if (r111 >= 0) goto L34;
        this.o = 0;
        r14 = r111;
        goto L41
    L34:
        if (r111 >= r110) goto L36;
        r14 = 0;
    L36:
        r14 = r3.write(r15, r6, 1);
        if (r14 >= 0) goto L39;
        this.o = 0;
        goto L41
    L39:
        this.o -= r14;
        goto L41
    L19:
        this.m = r13;
        goto L20
    L10:
        r4 = false;
        goto L11
    L5:
        if (this.p != 0) goto L7;
        this.p = tj0.k(r0.a, r15);
        goto L7
    }
}
