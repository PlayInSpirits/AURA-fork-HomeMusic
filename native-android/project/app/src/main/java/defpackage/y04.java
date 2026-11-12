package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class y04 extends b71 {
    public static final ge3 f = null;
    public final ClassLoader c;
    public final b71 d;
    public final rp4 e;

    static {
        String r0 = ge3.o;
        f = tv1.z("/");
    }

    public y04(ClassLoader r2) {
        s32 r0 = b71.a;
        r0.getClass();
        this.c = r2;
        this.d = r0;
        this.e = new rp4(new zf0(6, this));
    }

    @Override // defpackage.b71
    public final of4 a(ge3 r2) {
        r2.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.b71
    public final void b(ge3 r1, ge3 r2) {
        r1.getClass();
        r2.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.b71
    public final void c(ge3 r2) {
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.b71
    public final void d(ge3 r2) {
        r2.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.b71
    public final List f(ge3 r15) {
        ge3 r0 = f;
        r0.getClass();
        String r2 = f.b(r0, r15, true).c(r0).n.q();
        LinkedHashSet r3 = new LinkedHashSet();
        Iterator r14 = ((List) this.e.getValue()).iterator();
        boolean r5 = false;
    L4:
        if (r14.hasNext() == false) goto L17;
        kd3 r6 = (kd3) r14.next();
        b71 r7 = (b71) r6.n;
        ge3 r8 = (ge3) r6.o;
        List r9 = r7.f(r8.d(r2));     // Catch: IOException -> L22
        ArrayList r10 = new ArrayList();     // Catch: IOException -> L22
        Iterator r11 = r9.iterator();     // Catch: IOException -> L22
    L8:
        if (r11.hasNext() == false) goto L12;
        Object r12 = r11.next();     // Catch: IOException -> L22
        if (hh3.d((ge3) r12) == false) goto L8;
        r10.add(r12);     // Catch: IOException -> L22
        goto L8
    L12:
        ArrayList r13 = new ArrayList(r40.k0(r10, 10));     // Catch: IOException -> L22
        int r16 = r10.size();     // Catch: IOException -> L22
        int r17 = 0;
    L13:
        if (r17 >= r16) goto L15;
        Object r18 = r10.get(r17);     // Catch: IOException -> L22
        r17 = r17 + 1;     // Catch: IOException -> L22
        ge3 r19 = (ge3) r18;     // Catch: IOException -> L22
        r19.getClass();     // Catch: IOException -> L22
        String r110 = qm4.z0(r19.n.q(), r8.n.q()).replace('\\', '/');     // Catch: IOException -> L22
        r110.getClass();     // Catch: IOException -> L22
        r13.add(r0.d(r110));     // Catch: IOException -> L22
        goto L13
    L15:
        v40.n0(r13, r3);     // Catch: IOException -> L22
        r5 = true;
        goto L4
    L17:
        if (r5 == true) goto L19;
        mj0.k(r15, "file not found: ");
        return null;
    L19:
        return q40.Q0(r3);
    }

    @Override // defpackage.b71
    public final xo0 h(ge3 r3) {
        r3.getClass();
        if (hh3.d(r3) == false) goto L12;
        ge3 r0 = f;
        r0.getClass();
        String r4 = f.b(r0, r3, true).c(r0).n.q();
        Iterator r2 = ((List) this.e.getValue()).iterator();
    L7:
        if (r2.hasNext() == false) goto L17;
        kd3 r1 = (kd3) r2.next();
        xo0 r5 = ((b71) r1.n).h(((ge3) r1.o).d(r4));
        if (r5 == null) goto L7;
        return r5;
    L17:
        return null;
    L12:
        return null;
    }

    @Override // defpackage.b71
    public final r32 i(ge3 r6) {
        if (hh3.d(r6) == false) goto L12;
        ge3 r0 = f;
        r0.getClass();
        String r1 = f.b(r0, r6, true).c(r0).n.q();
        Iterator r5 = ((List) this.e.getValue()).iterator();
    L6:
        if (r5.hasNext() == false) goto L10;
        kd3 r3 = (kd3) r5.next();
        b71 r4 = (b71) r3.n;
        return r4.i(((ge3) r3.o).d(r1));
    L10:
        mj0.k(r6, "file not found: ");
        return null;
    L12:
        mj0.k(r6, "file not found: ");
        return null;
    }

    @Override // defpackage.b71
    public final of4 j(ge3 r2) {
        r2.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.b71
    public final ej4 k(ge3 r6) {
        r6.getClass();
        if (hh3.d(r6) == false) goto L13;
        ge3 r0 = f;
        r0.getClass();
        String r1 = f.b(r0, r6, false).c(r0).n.q();
        URL r5 = this.c.getResource(r1);
        if (r5 == null) goto L11;
        URLConnection r7 = r5.openConnection();
        if ((r7 instanceof JarURLConnection) == false) goto L9;
        ((JarURLConnection) r7).setUseCaches(false);
    L9:
        InputStream r8 = r7.getInputStream();
        r8.getClass();
        Logger r9 = p83.a;
        int r2 = 1;
        return new tk(r2, r8, new fu4());
    L11:
        mj0.k(r6, "file not found: ");
        return null;
    L13:
        mj0.k(r6, "file not found: ");
        return null;
    }
}
