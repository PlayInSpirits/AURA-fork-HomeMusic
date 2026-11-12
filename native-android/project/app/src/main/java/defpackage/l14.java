package defpackage;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class l14 extends Reader {
    public final fw n;
    public final Charset o;
    public boolean p;
    public InputStreamReader q;

    public l14(fw fwVar, Charset charset) {
        fwVar.getClass();
        charset.getClass();
        this.n = fwVar;
        this.o = charset;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        j15 j15Var;
        this.p = true;
        InputStreamReader inputStreamReader = this.q;
        if (inputStreamReader != null) {
            inputStreamReader.close();
            j15Var = j15.a;
        } else {
            j15Var = null;
        }
        if (j15Var == null) {
            this.n.close();
        }
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i, int i2) throws IOException {
        cArr.getClass();
        if (this.p) {
            mj0.i("Stream closed");
            return 0;
        }
        InputStreamReader inputStreamReader = this.q;
        if (inputStreamReader == null) {
            fw fwVar = this.n;
            inputStreamReader = new InputStreamReader(fwVar.V(), ze5.g(fwVar, this.o));
            this.q = inputStreamReader;
        }
        return inputStreamReader.read(cArr, i, i2);
    }
}
