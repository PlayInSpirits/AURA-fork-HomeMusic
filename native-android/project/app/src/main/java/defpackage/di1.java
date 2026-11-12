package defpackage;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class di1 {
    public final byte[] a;
    public ByteBuffer b;
    public ci1 c;
    public int d;

    public di1() {
        this.a = new byte[256];
        this.d = 0;
    }

    public final boolean a() {
        if (this.c.b == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public final ci1 b() {
        if (this.b != null) goto L5;
        kf2.o("You must call setData() before parseHeader()");
        return null;
    L5:
        if (a() == true) goto L7;
        StringBuilder r0 = new StringBuilder();
        int r3 = 0;
    L10:
        if (r3 >= 6) goto L12;
        r0.append((char) c());
        r3 = r3 + 1;
        goto L10
    L12:
        boolean r1 = r0.toString().startsWith("GIF");
        ci1 r4 = this.c;
        if (r1 == true) goto L15;
        r4.b = 1;
    L25:
        if (a() == true) goto L100;
        boolean r2 = false;
    L27:
        if (r2 == true) goto L96;
        if (a() == true) goto L96;
        if (this.c.c > Integer.MAX_VALUE) goto L96;
        int r5 = c();
        if (r5 != 33) goto L35;
        int r6 = c();
        if (r6 != 1) goto L62;
        f();
        goto L27
    L62:
        if (r6 != 249) goto L64;
        this.c.d = new yh1();
        c();
        int r7 = c();
        yh1 r8 = this.c.d;
        int r9 = (r7 & 28) >> 2;
        r8.g = r9;
        if (r9 != 0) goto L88;
        r8.g = 1;
    L88:
        if ((r7 & 1) == 0) goto L90;
        boolean r10 = true;
    L91:
        r8.f = r10;
        short r11 = this.b.getShort();
        if (r11 >= 2) goto L94;
        r11 = 10;
    L94:
        yh1 r12 = this.c.d;
        r12.i = r11 * 10;
        r12.h = c();
        c();
        goto L27
    L90:
        r10 = false;
        goto L91
    L64:
        if (r6 != 254) goto L66;
        f();
        goto L27
    L66:
        if (r6 != 255) goto L67;
        d();
        StringBuilder r13 = new StringBuilder();
        int r14 = 0;
    L69:
        byte[] r15 = this.a;
        if (r14 >= 11) goto L73;
        r13.append((char) r15[r14]);
        r14 = r14 + 1;
        goto L69
    L73:
        if (r13.toString().equals("NETSCAPE2.0") == true) goto L74;
        f();
    L74:
        d();
        if (r15[0] != 1) goto L78;
        byte r16 = r15[1];
        byte r17 = r15[2];
        this.c.getClass();
    L78:
        if (this.d <= 0) goto L27;
        if (a() == false) goto L74;
    L67:
        f();
        goto L27
    L35:
        if (r5 != 44) goto L37;
        ci1 r18 = this.c;
        if (r18.d != null) goto L43;
        r18.d = new yh1();
    L43:
        r18.d.a = this.b.getShort();
        this.c.d.b = this.b.getShort();
        this.c.d.c = this.b.getShort();
        this.c.d.d = this.b.getShort();
        int r19 = c();
        if ((r19 & 128) == 0) goto L46;
        boolean r20 = true;
    L47:
        int r21 = (int) Math.pow(2.0d, (r19 & 7) + 1);
        yh1 r22 = this.c.d;
        if ((r19 & 64) == 0) goto L50;
        boolean r23 = true;
    L51:
        r22.e = r23;
        if (r20 == false) goto L54;
        r22.k = e(r21);
    L55:
        this.c.d.j = this.b.position();
        c();
        f();
        if (a() == true) goto L27;
        ci1 r24 = this.c;
        r24.c++;
        r24.e.add(r24.d);
        goto L27
    L54:
        r22.k = null;
        goto L55
    L50:
        r23 = false;
        goto L51
    L46:
        r20 = false;
        goto L47
    L37:
        if (r5 != 59) goto L38;
        r2 = true;
        goto L27
    L38:
        this.c.b = 1;
    L96:
        ci1 r25 = this.c;
        if (r25.c >= 0) goto L100;
        r25.b = 1;
    L100:
        return this.c;
    L15:
        r4.f = this.b.getShort();
        this.c.g = this.b.getShort();
        int r26 = c();
        ci1 r27 = this.c;
        if ((r26 & 128) == 0) goto L18;
        boolean r28 = true;
    L19:
        r27.h = r28;
        r27.i = (int) Math.pow(2.0d, (r26 & 7) + 1);
        this.c.j = c();
        ci1 r29 = this.c;
        c();
        r29.getClass();
        if (this.c.h == false) goto L25;
        if (a() == true) goto L25;
        ci1 r30 = this.c;
        r30.a = e(r30.i);
        ci1 r31 = this.c;
        r31.k = r31.a[r31.j];
        goto L25
    L18:
        r28 = false;
        goto L19
    L7:
        return this.c;
    }

    public final int c() {
        return this.b.get() & 255;
    L5:
        this.c.b = 1;
        return 0;
    }

    public final void d() {
        int r0 = c();
        this.d = r0;
        if (r0 <= 0) goto L18;
        int r1 = 0;
        int r2 = 0;
    L15:
        int r3 = this.d;     // Catch: Exception -> L9
        if (r1 >= r3) goto L19;
        r2 = r3 - r1;     // Catch: Exception -> L9
        this.b.get(this.a, r1, r2);     // Catch: Exception -> L9
        r1 = r1 + r2;
        goto L15
    L19:
        return;
    L9:
        e = move-exception;
        if (Log.isLoggable("GifHeaderParser", 3) == false) goto L13;
        StringBuilder r4 = b11.t("Error Reading Block n: ", " count: ", r1, r2, " blockSize: ");
        r4.append(this.d);
        Log.d("GifHeaderParser", r4.toString(), e);
    L13:
        this.c.b = 1;
        return;
    }

    public final int[] e(int r10) {
        byte[] r0 = new byte[r10 * 3];
        int[] r1 = null;
        this.b.get(r0);     // Catch: BufferUnderflowException -> L7
        r1 = new int[256];     // Catch: BufferUnderflowException -> L7
        int r2 = 0;
        int r3 = 0;
    L4:
        if (r2 >= r10) goto L9;
        int r5 = r0[r3] & 255;     // Catch: BufferUnderflowException -> L7
        int r6 = r3 + 2;     // Catch: BufferUnderflowException -> L7
        int r4 = r0[r3 + 1] & 255;     // Catch: BufferUnderflowException -> L7
        r3 = r3 + 3;     // Catch: BufferUnderflowException -> L7
        int r7 = r2 + 1;     // Catch: BufferUnderflowException -> L7
        r1[r2] = ((r4 << 8) | ((r5 << 16) | (-16777216))) | (r0[r6] & 255);     // Catch: BufferUnderflowException -> L7
        r2 = r7;
        goto L4
    L9:
        return r1;
    L7:
        e = move-exception;
        if (Log.isLoggable("GifHeaderParser", 3) == false) goto L13;
        Log.d("GifHeaderParser", "Format Error Reading Color Table", e);
    L13:
        this.c.b = 1;
        return r1;
    }

    public final void f() {
    L2:
        int r0 = c();
        int r1 = Math.min(this.b.position() + r0, this.b.limit());
        this.b.position(r1);
        if (r0 > 0) goto L2;
    }
}
