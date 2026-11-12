package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wz2 extends tz3 {
    public static final hu2 e = null;
    public static final hu2 f = null;
    public static final byte[] g = null;
    public static final byte[] h = null;
    public static final byte[] i = null;
    public final yw a;
    public final List b;
    public final hu2 c;
    public long d;

    static {
        e = ve5.a("multipart/mixed");
        ve5.a("multipart/alternative");
        ve5.a("multipart/digest");
        ve5.a("multipart/parallel");
        f = ve5.a("multipart/form-data");
        g = new byte[]{58, 32};
        h = new byte[]{13, 10};
        i = new byte[]{45, 45};
    }

    public wz2(yw r1, hu2 r2, List r3) {
        r1.getClass();
        r2.getClass();
        this.a = r1;
        this.b = r3;
        this.c = ve5.a(r2 + "; boundary=" + r1.q());
        this.d = -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long a(ew r17, boolean r18) {
        if (r18 == false) goto L5;
        ew r1 = new tv();
        tv r2 = r1;
    L6:
        List r3 = this.b;
        int r4 = r3.size();
        long r6 = 0;
        int r8 = 0;
    L7:
        yw r9 = this.a;
        byte[] r10 = i;
        byte[] r11 = h;
        if (r8 >= r4) goto L27;
        vz2 r12 = (vz2) r3.get(r8);
        tl1 r13 = r12.a;
        tz3 r14 = r12.b;
        r1.getClass();
        r1.write(r10);
        r1.A(r9);
        r1.write(r11);
        if (r13 == null) goto L14;
        int r15 = r13.size();
        int r16 = 0;
    L12:
        if (r16 >= r15) goto L14;
        r1.y(r13.b(r16)).write(g).y(r13.e(r16)).write(r11);
        r16 = r16 + 1;
    L14:
        hu2 r19 = r14.contentType();
        if (r19 == null) goto L17;
        r1.y("Content-Type: ").y(r19.a).write(r11);
    L17:
        long r20 = r14.contentLength();
        if (r20 != (-1)) goto L22;
        if (r18 == false) goto L22;
        r2.getClass();
        r2.b();
        return -1;
    L22:
        r1.write(r11);
        if (r18 == false) goto L25;
        r6 = r6 + r20;
    L26:
        r1.write(r11);
        r8 = r8 + 1;
        goto L7
    L25:
        r14.writeTo(r1);
        goto L26
    L27:
        r1.getClass();
        r1.write(r10);
        r1.A(r9);
        r1.write(r10);
        r1.write(r11);
        if (r18 == false) goto L36;
        r2.getClass();
        long r7 = r6 + r2.o;
        r2.b();
        return r7;
    L36:
        return r6;
    L5:
        r2 = 0;
        r1 = r17;
        goto L6
    }

    @Override // defpackage.tz3
    public final long contentLength() {
        long r0 = this.d;
        if (r0 != (-1)) goto L6;
        long r1 = a(null, true);
        this.d = r1;
        return r1;
    L6:
        return r0;
    }

    @Override // defpackage.tz3
    public final hu2 contentType() {
        return this.c;
    }

    @Override // defpackage.tz3
    public final boolean isOneShot() {
        List r1 = this.b;
        if (r1.isEmpty() == true) goto L12;
        Iterator r2 = r1.iterator();
    L7:
        if (r2.hasNext() == false) goto L17;
        if (((vz2) r2.next()).b.isOneShot() == false) goto L7;
        return true;
    L17:
        return false;
    L12:
        return false;
    }

    @Override // defpackage.tz3
    public final void writeTo(ew r2) {
        r2.getClass();
        a(r2, false);
    }
}
