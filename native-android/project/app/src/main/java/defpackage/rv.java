package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rv extends InputStream {
    public final /* synthetic */ int n;
    public final /* synthetic */ fw o;

    public /* synthetic */ rv(fw fwVar, int i) {
        this.n = i;
        this.o = fwVar;
    }

    private final void b() {
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        int i = this.n;
        fw fwVar = this.o;
        switch (i) {
            case 0:
                return (int) Math.min(((tv) fwVar).o, 2147483647L);
            default:
                xu3 xu3Var = (xu3) fwVar;
                if (!xu3Var.p) {
                    return (int) Math.min(xu3Var.o.o, 2147483647L);
                }
                mj0.i("closed");
                return 0;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.n) {
            case 0:
                break;
            default:
                ((xu3) this.o).close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i = this.n;
        fw fwVar = this.o;
        switch (i) {
            case 0:
                tv tvVar = (tv) fwVar;
                if (tvVar.o > 0) {
                    return tvVar.readByte() & 255;
                }
                return -1;
            default:
                xu3 xu3Var = (xu3) fwVar;
                tv tvVar2 = xu3Var.o;
                if (xu3Var.p) {
                    mj0.i("closed");
                    return 0;
                }
                if (tvVar2.o == 0 && xu3Var.n.read(tvVar2, 8192L) == -1) {
                    return -1;
                }
                return tvVar2.readByte() & 255;
        }
    }

    public final String toString() {
        int i = this.n;
        fw fwVar = this.o;
        switch (i) {
            case 0:
                return ((tv) fwVar) + ".inputStream()";
            default:
                return ((xu3) fwVar) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.n;
        fw fwVar = this.o;
        bArr.getClass();
        switch (i3) {
            case 0:
                return ((tv) fwVar).read(bArr, i, i2);
            default:
                xu3 xu3Var = (xu3) fwVar;
                tv tvVar = xu3Var.o;
                if (!xu3Var.p) {
                    zz1.i(bArr.length, i, i2);
                    if (tvVar.o == 0 && xu3Var.n.read(tvVar, 8192L) == -1) {
                        return -1;
                    }
                    return tvVar.read(bArr, i, i2);
                }
                mj0.i("closed");
                return 0;
        }
    }
}
