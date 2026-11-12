package defpackage;

import androidx.media3.common.ParserException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class un4 implements k51 {
    public final zn4 a;
    public final tb1 b;
    public final ArrayList c;
    public final be3 d;
    public byte[] e;
    public wv4 f;
    public int g;
    public int h;
    public long[] i;
    public long j;

    public un4(zn4 r3) {
        this.a = r3;
        this.e = f35.b;
        this.d = new be3();
        this.b = null;
        this.c = new ArrayList();
        this.h = 0;
        this.i = f35.c;
        this.j = -9223372036854775807L;
    }

    @Override // defpackage.k51
    public final void a() {
        if (this.h != 5) goto L5;
        return;
    L5:
        this.a.reset();
        this.h = 5;
    }

    @Override // defpackage.k51
    public final int b(l51 r21, t71 r22) {
        int r2 = this.h;
        if (r2 != 0) goto L5;
    L7:
        boolean r3 = false;
    L8:
        rr2.w(r3);
        int r6 = 1024;
        if (this.h == 1) goto L11;
    L18:
        int r4 = this.h;
        ArrayList r11 = this.c;
        if (r4 != 2) goto L47;
        byte[] r5 = this.e;
        if (r5.length != this.g) goto L23;
        this.e = Arrays.copyOf(r5, r5.length + 1024);
    L23:
        byte[] r7 = this.e;
        int r8 = this.g;
        int r9 = r21.read(r7, r8, r7.length - r8);
        if (r9 == (-1)) goto L26;
        this.g += r9;
    L26:
        long r14 = r21.getLength();
        if (r14 == (-1)) goto L31;
        int r23 = 0;
        if (this.g == r14) goto L67;
    L32:
        if (r9 == (-1)) goto L67;
    L49:
        if (this.h != 3) goto L64;
        if (r21.getLength() == (-1)) goto L54;
        r6 = jz4.m(r21.getLength());
    L54:
        if (r21.h(r6) != (-1)) goto L64;
        long r1 = this.j;
        if (r1 != (-9223372036854775807L)) goto L58;
        int r10 = r23;
    L60:
        if (r10 >= r11.size()) goto L62;
        g((tn4) r11.get(r10));
        r10 = r10 + 1;
        goto L60
    L62:
        this.h = 4;
        goto L64
    L58:
        r10 = f35.f(this.i, r1, true);
    L64:
        if (this.h != 4) goto L66;
        return -1;
    L66:
        return r23;
    L67:
        long r12 = this.j;     // Catch: RuntimeException -> L44
        if (r12 == (-9223372036854775807L)) goto L37;
        yn4 r13 = new yn4(true, r12);     // Catch: RuntimeException -> L44
    L38:
        this.a.c(this.e, 0, this.g, r13, new ss2(21, this));     // Catch: RuntimeException -> L44
        Collections.sort(r11);     // Catch: RuntimeException -> L44
        this.i = new long[r11.size()];     // Catch: RuntimeException -> L44
        int r15 = r23;
    L40:
        if (r15 >= r11.size()) goto L42;
        this.i[r15] = ((tn4) r11.get(r15)).n;     // Catch: RuntimeException -> L44
        r15 = r15 + 1;     // Catch: RuntimeException -> L44
        goto L40
    L42:
        this.e = f35.b;     // Catch: RuntimeException -> L44
        this.h = 4;
        goto L49
    L37:
        r13 = yn4.c;     // Catch: RuntimeException -> L44
    L44:
        e = move-exception;
        throw ParserException.a(e, "SubtitleParser failed.");
    L31:
        r23 = 0;
        goto L32
    L47:
        r23 = 0;
        goto L49
    L11:
        if (r21.getLength() == (-1)) goto L13;
        int r16 = jz4.m(r21.getLength());
    L15:
        if (r16 <= this.e.length) goto L17;
        this.e = new byte[r16];
    L17:
        this.g = 0;
        this.h = 2;
        goto L18
    L13:
        r16 = 1024;
        goto L15
    L5:
        if (r2 == 5) goto L7;
        r3 = true;
        goto L8
    }

    @Override // defpackage.k51
    public final boolean c(l51 r1) {
        return true;
    }

    @Override // defpackage.k51
    public final void d(long r2, long r4) {
        int r3 = this.h;
        if (r3 != 0) goto L5;
    L7:
        boolean r5 = false;
    L8:
        rr2.w(r5);
        this.j = r4;
        if (this.h != 2) goto L12;
        this.h = 1;
    L12:
        if (this.h != 4) goto L15;
        this.h = 3;
        return;
    L15:
        return;
    L5:
        if (r3 == 5) goto L7;
        r5 = true;
        goto L8
    }

    @Override // defpackage.k51
    public final void f(m51 r8) {
        if (this.h != 0) goto L5;
        boolean r0 = true;
    L6:
        rr2.w(r0);
        wv4 r1 = r8.t(0, 3);
        this.f = r1;
        tb1 r3 = this.b;
        if (r3 == null) goto L9;
        r1.g(r3);
        r8.p();
        r8.w(new ux1(-9223372036854775807L, new long[]{0}, new long[]{0}));
    L9:
        this.h = 1;
        return;
    L5:
        r0 = false;
        goto L6
    }

    public final void g(tn4 r9) {
        this.f.getClass();
        byte[] r0 = r9.o;
        int r5 = r0.length;
        be3 r1 = this.d;
        r1.getClass();
        r1.L(r0.length, r0);
        this.f.e(r5, r1);
        this.f.a(r9.n, 1, r5, 0, null);
    }
}
