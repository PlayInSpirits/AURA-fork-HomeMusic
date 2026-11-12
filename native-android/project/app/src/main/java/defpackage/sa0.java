package defpackage;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sa0 implements x34, l13 {
    public final x34 n;
    public final l13 o;
    public ne0 p;
    public Throwable q;

    public sa0(x34 r2) {
        n13 r0 = new n13();
        r2.getClass();
        this.n = r2;
        this.o = r0;
    }

    @Override // defpackage.x34
    public final z34 U(String r1) {
        r1.getClass();
        return this.n.U(r1);
    }

    @Override // defpackage.l13
    public final Object b(wd0 r1) {
        return this.o.b(r1);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.n.close();
    }

    @Override // defpackage.l13
    public final void f(Object r1) {
        this.o.f(null);
    }

    public final void j(StringBuilder r5) {
        if (this.p == null) goto L5;
    L9:
        r5.append("\t\tStatus: Acquired connection");
        r5.append('\n');
        ne0 r0 = this.p;
        if (r0 == null) goto L12;
        r5.append("\t\tCoroutine: " + r0);
        r5.append('\n');
    L12:
        Throwable r4 = this.q;
        if (r4 == null) goto L18;
        r5.append("\t\tAcquired:");
        r5.append('\n');
        StringWriter r1 = new StringWriter();
        PrintWriter r2 = new PrintWriter(r1);
        r4.printStackTrace(r2);
        r2.flush();
        String r6 = r1.toString();
        r6.getClass();
        Iterator r7 = q40.u0(qm4.w0(r6), 1).iterator();
    L16:
        if (r7.hasNext() == false) goto L20;
        r5.append("\t\t" + ((String) r7.next()));
        r5.append('\n');
        goto L16
    L20:
        return;
    L18:
        return;
    L5:
        if (this.q != null) goto L9;
        r5.append("\t\tStatus: Free connection");
        r5.append('\n');
    }

    public final String toString() {
        return this.n.toString();
    }
}
