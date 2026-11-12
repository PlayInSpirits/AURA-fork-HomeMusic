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

    public sa0(x34 x34Var) {
        n13 n13Var = new n13();
        x34Var.getClass();
        this.n = x34Var;
        this.o = n13Var;
    }

    @Override // defpackage.x34
    public final z34 U(String str) {
        str.getClass();
        return this.n.U(str);
    }

    @Override // defpackage.l13
    public final Object b(wd0 wd0Var) {
        return this.o.b(wd0Var);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        this.n.close();
    }

    @Override // defpackage.l13
    public final void f(Object obj) {
        this.o.f(null);
    }

    public final void j(StringBuilder sb) {
        if (this.p == null && this.q == null) {
            sb.append("\t\tStatus: Free connection");
            sb.append('\n');
            return;
        }
        sb.append("\t\tStatus: Acquired connection");
        sb.append('\n');
        ne0 ne0Var = this.p;
        if (ne0Var != null) {
            sb.append("\t\tCoroutine: " + ne0Var);
            sb.append('\n');
        }
        Throwable th = this.q;
        if (th != null) {
            sb.append("\t\tAcquired:");
            sb.append('\n');
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            printWriter.flush();
            String string = stringWriter.toString();
            string.getClass();
            Iterator it = q40.u0(qm4.w0(string), 1).iterator();
            while (it.hasNext()) {
                sb.append("\t\t" + ((String) it.next()));
                sb.append('\n');
            }
        }
    }

    public final String toString() {
        return this.n.toString();
    }
}
