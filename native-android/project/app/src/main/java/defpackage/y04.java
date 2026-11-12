package defpackage;

import java.io.FileNotFoundException;
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
    public static final ge3 f;
    public final ClassLoader c;
    public final b71 d;
    public final rp4 e;

    static {
        String str = ge3.o;
        f = tv1.z("/");
    }

    public y04(ClassLoader classLoader) {
        s32 s32Var = b71.a;
        s32Var.getClass();
        this.c = classLoader;
        this.d = s32Var;
        this.e = new rp4(new zf0(6, this));
    }

    @Override // defpackage.b71
    public final of4 a(ge3 ge3Var) throws IOException {
        ge3Var.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.b71
    public final void b(ge3 ge3Var, ge3 ge3Var2) throws IOException {
        ge3Var.getClass();
        ge3Var2.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.b71
    public final void c(ge3 ge3Var) throws IOException {
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.b71
    public final void d(ge3 ge3Var) throws IOException {
        ge3Var.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.b71
    public final List f(ge3 ge3Var) throws FileNotFoundException {
        ge3 ge3Var2 = f;
        ge3Var2.getClass();
        String strQ = f.b(ge3Var2, ge3Var, true).c(ge3Var2).n.q();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z = false;
        for (kd3 kd3Var : (List) this.e.getValue()) {
            b71 b71Var = (b71) kd3Var.n;
            ge3 ge3Var3 = (ge3) kd3Var.o;
            try {
                List listF = b71Var.f(ge3Var3.d(strQ));
                ArrayList arrayList = new ArrayList();
                for (Object obj : listF) {
                    if (hh3.d((ge3) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(r40.k0(arrayList, 10));
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    ge3 ge3Var4 = (ge3) obj2;
                    ge3Var4.getClass();
                    String strReplace = qm4.z0(ge3Var4.n.q(), ge3Var3.n.q()).replace('\\', '/');
                    strReplace.getClass();
                    arrayList2.add(ge3Var2.d(strReplace));
                }
                v40.n0(arrayList2, linkedHashSet);
                z = true;
            } catch (IOException unused) {
            }
        }
        if (z) {
            return q40.Q0(linkedHashSet);
        }
        mj0.k(ge3Var, "file not found: ");
        return null;
    }

    @Override // defpackage.b71
    public final xo0 h(ge3 ge3Var) {
        ge3Var.getClass();
        if (!hh3.d(ge3Var)) {
            return null;
        }
        ge3 ge3Var2 = f;
        ge3Var2.getClass();
        String strQ = f.b(ge3Var2, ge3Var, true).c(ge3Var2).n.q();
        for (kd3 kd3Var : (List) this.e.getValue()) {
            xo0 xo0VarH = ((b71) kd3Var.n).h(((ge3) kd3Var.o).d(strQ));
            if (xo0VarH != null) {
                return xo0VarH;
            }
        }
        return null;
    }

    @Override // defpackage.b71
    public final r32 i(ge3 ge3Var) throws FileNotFoundException {
        if (!hh3.d(ge3Var)) {
            mj0.k(ge3Var, "file not found: ");
            return null;
        }
        ge3 ge3Var2 = f;
        ge3Var2.getClass();
        String strQ = f.b(ge3Var2, ge3Var, true).c(ge3Var2).n.q();
        Iterator it = ((List) this.e.getValue()).iterator();
        while (it.hasNext()) {
            kd3 kd3Var = (kd3) it.next();
            try {
                return ((b71) kd3Var.n).i(((ge3) kd3Var.o).d(strQ));
            } catch (FileNotFoundException unused) {
            }
        }
        mj0.k(ge3Var, "file not found: ");
        return null;
    }

    @Override // defpackage.b71
    public final of4 j(ge3 ge3Var) throws IOException {
        ge3Var.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.b71
    public final ej4 k(ge3 ge3Var) throws IOException {
        ge3Var.getClass();
        if (!hh3.d(ge3Var)) {
            mj0.k(ge3Var, "file not found: ");
            return null;
        }
        ge3 ge3Var2 = f;
        ge3Var2.getClass();
        URL resource = this.c.getResource(f.b(ge3Var2, ge3Var, false).c(ge3Var2).n.q());
        if (resource == null) {
            mj0.k(ge3Var, "file not found: ");
            return null;
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        if (uRLConnectionOpenConnection instanceof JarURLConnection) {
            ((JarURLConnection) uRLConnectionOpenConnection).setUseCaches(false);
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        inputStream.getClass();
        Logger logger = p83.a;
        return new tk(1, inputStream, new fu4());
    }
}
