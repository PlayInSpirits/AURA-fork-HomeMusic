package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n14 implements Closeable {
    public static final m14 Companion = new m14();
    private Reader reader;

    @zo0
    public static final n14 create(hu2 hu2Var, yw ywVar) {
        m14 m14Var = Companion;
        m14Var.getClass();
        ywVar.getClass();
        tv tvVar = new tv();
        tvVar.X(ywVar);
        long jD = ywVar.d();
        m14Var.getClass();
        return new fv3(hu2Var, jD, tvVar, 1);
    }

    public final InputStream byteStream() {
        return source().V();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final yw byteString() throws IOException {
        long jContentLength = contentLength();
        yw th = null;
        if (jContentLength > 2147483647L) {
            mj0.i(b11.k("Cannot buffer entire body for content length: ", jContentLength));
            return null;
        }
        fw fwVarSource = source();
        try {
            yw ywVarE = fwVarSource.E();
            try {
                fwVarSource.close();
            } catch (Throwable th2) {
                th = th2;
            }
            yw ywVar = th;
            th = ywVarE;
            th = ywVar;
        } catch (Throwable th3) {
            th = th3;
            if (fwVarSource != null) {
                try {
                    fwVarSource.close();
                } catch (Throwable th4) {
                    j51.d(th, th4);
                }
            }
        }
        if (th != 0) {
            throw th;
        }
        int iD = th.d();
        if (jContentLength == -1 || jContentLength == iD) {
            return th;
        }
        throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + iD + ") disagree");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final byte[] bytes() throws IOException {
        long jContentLength = contentLength();
        byte[] th = null;
        if (jContentLength > 2147483647L) {
            mj0.i(b11.k("Cannot buffer entire body for content length: ", jContentLength));
            return null;
        }
        fw fwVarSource = source();
        try {
            byte[] bArrI = fwVarSource.i();
            try {
                fwVarSource.close();
            } catch (Throwable th2) {
                th = th2;
            }
            byte[] bArr = th;
            th = bArrI;
            th = bArr;
        } catch (Throwable th3) {
            th = th3;
            if (fwVarSource != null) {
                try {
                    fwVarSource.close();
                } catch (Throwable th4) {
                    j51.d(th, th4);
                }
            }
        }
        if (th != 0) {
            throw th;
        }
        int length = th.length;
        if (jContentLength == -1 || jContentLength == length) {
            return th;
        }
        throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + length + ") disagree");
    }

    public final Reader charStream() {
        Charset charsetA;
        Reader l14Var = this.reader;
        if (l14Var == null) {
            fw fwVarSource = source();
            hu2 hu2VarContentType = contentType();
            if (hu2VarContentType == null || (charsetA = hu2.a(hu2VarContentType)) == null) {
                charsetA = w10.a;
            }
            l14Var = new l14(fwVarSource, charsetA);
            this.reader = l14Var;
        }
        return l14Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        xe5.b(source());
    }

    public abstract long contentLength();

    public abstract hu2 contentType();

    public abstract fw source();

    public final String string() {
        Charset charsetA;
        fw fwVarSource = source();
        try {
            hu2 hu2VarContentType = contentType();
            if (hu2VarContentType == null || (charsetA = hu2.a(hu2VarContentType)) == null) {
                charsetA = w10.a;
            }
            String strB = fwVarSource.B(ze5.g(fwVarSource, charsetA));
            fwVarSource.close();
            return strB;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                q05.h(fwVarSource, th);
                throw th2;
            }
        }
    }

    @zo0
    public static final n14 create(hu2 hu2Var, long j, fw fwVar) {
        Companion.getClass();
        fwVar.getClass();
        return new fv3(hu2Var, j, fwVar, 1);
    }

    @zo0
    public static final n14 create(hu2 hu2Var, String str) {
        Companion.getClass();
        str.getClass();
        return m14.a(str, hu2Var);
    }

    @zo0
    public static final n14 create(hu2 hu2Var, byte[] bArr) {
        Companion.getClass();
        bArr.getClass();
        return m14.b(bArr, hu2Var);
    }

    public static final n14 create(String str, hu2 hu2Var) {
        Companion.getClass();
        return m14.a(str, hu2Var);
    }

    public static final n14 create(byte[] bArr, hu2 hu2Var) {
        Companion.getClass();
        return m14.b(bArr, hu2Var);
    }

    public static final n14 create(yw ywVar, hu2 hu2Var) {
        m14 m14Var = Companion;
        m14Var.getClass();
        ywVar.getClass();
        tv tvVar = new tv();
        tvVar.X(ywVar);
        long jD = ywVar.d();
        m14Var.getClass();
        return new fv3(hu2Var, jD, tvVar, 1);
    }

    public static final n14 create(fw fwVar, hu2 hu2Var, long j) {
        Companion.getClass();
        fwVar.getClass();
        return new fv3(hu2Var, j, fwVar, 1);
    }
}
