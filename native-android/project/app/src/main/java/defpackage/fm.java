package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fm {
    public final yw1 a;
    public final ArrayList b;
    public ByteBuffer[] c;
    public boolean d;

    public fm(yw1 r2) {
        this.a = r2;
        this.b = new ArrayList();
        this.c = new ByteBuffer[0];
        gm r0 = gm.e;
        this.d = false;
    }

    public final void a() {
        hm r0 = hm.b;
        ArrayList r1 = this.b;
        r1.clear();
        int r2 = 0;
        this.d = false;
        long r3 = r0.a;
        int r4 = 0;
    L3:
        yw1 r5 = this.a;
        if (r4 >= r5.size()) goto L14;
        im r6 = (im) r5.get(r4);
        new hm(r3);
        r6.flush();
        if (r6.b() == false) goto L13;
        r3 = r6.h(r3);
        if (r3 < 0) goto L11;
        boolean r7 = true;
    L12:
        rr2.w(r7);
        r1.add(r6);
        goto L13
    L11:
        r7 = false;
    L13:
        r4 = r4 + 1;
        goto L3
    L14:
        this.c = new ByteBuffer[r1.size()];
    L16:
        if (r2 > b()) goto L18;
        this.c[r2] = ((im) r1.get(r2)).d();
        r2 = r2 + 1;
        goto L16
    }

    public final int b() {
        return this.c.length - 1;
    }

    public final boolean c() {
        if (this.d == true) goto L5;
        return false;
    L5:
        if (((im) this.b.get(b())).c() == true) goto L7;
        return false;
    L7:
        if (this.c[b()].hasRemaining() == true) goto L13;
        return true;
    L13:
        return false;
    }

    public final boolean d() {
        return !this.b.isEmpty();
    }

    public final void e(ByteBuffer r10) {
        boolean r1 = true;
    L3:
        if (r1 == false) goto L33;
        boolean r2 = false;
        int r3 = 0;
    L6:
        if (r3 > b()) goto L32;
        if (this.c[r3].hasRemaining() == true) goto L31;
        ArrayList r4 = this.b;
        im r5 = (im) r4.get(r3);
        if (r5.c() == true) goto L13;
        if (r3 <= 0) goto L20;
        ByteBuffer r6 = this.c[r3 - 1];
    L23:
        long r7 = r6.remaining();
        r5.e(r6);
        this.c[r3] = r5.d();
        if ((r7 - ((long) r6.remaining())) <= 0) goto L26;
    L29:
        boolean r8 = true;
    L30:
        r2 = r2 | r8;
        goto L31
    L26:
        if (this.c[r3].hasRemaining() == true) goto L29;
        r8 = false;
        goto L30
    L20:
        if (r10.hasRemaining() == false) goto L22;
        r6 = r10;
        goto L23
    L22:
        r6 = im.a;
        goto L23
    L13:
        if (this.c[r3].hasRemaining() == true) goto L31;
        if (r3 >= b()) goto L31;
        ((im) r4.get(r3 + 1)).g();
    L31:
        r3 = r3 + 1;
        goto L6
    L32:
        r1 = r2;
        goto L3
    }

    public final boolean equals(Object r6) {
        if (this != r6) goto L6;
        return true;
    L6:
        if ((r6 instanceof fm) == true) goto L8;
        return false;
    L8:
        yw1 r7 = ((fm) r6).a;
        yw1 r5 = this.a;
        if (r5.size() == r7.size()) goto L11;
        return false;
    L11:
        int r1 = 0;
    L13:
        if (r1 >= r5.size()) goto L18;
        if (r5.get(r1) != r7.get(r1)) goto L16;
        r1 = r1 + 1;
        goto L13
    L16:
        return false;
    L18:
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
