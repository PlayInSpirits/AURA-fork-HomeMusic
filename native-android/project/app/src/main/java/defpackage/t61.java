package defpackage;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import androidx.media3.datasource.FileDataSource$FileDataSourceException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class t61 extends kp {
    public RandomAccessFile r;
    public Uri s;
    public long t;
    public boolean u;

    @Override // defpackage.ci0
    public final long b(ii0 ii0Var) throws FileDataSource$FileDataSourceException {
        Uri uri = ii0Var.a;
        long j = ii0Var.f;
        this.s = uri;
        q(ii0Var);
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.r = randomAccessFile;
            try {
                randomAccessFile.seek(j);
                long length = ii0Var.g;
                if (length == -1) {
                    length = this.r.length() - j;
                }
                this.t = length;
                if (length < 0) {
                    throw new FileDataSource$FileDataSourceException(null, null, 2008);
                }
                this.u = true;
                r(ii0Var);
                return this.t;
            } catch (IOException e) {
                throw new FileDataSource$FileDataSourceException(e, 2000);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new FileDataSource$FileDataSourceException(e2, ((e2.getCause() instanceof ErrnoException) && ((ErrnoException) e2.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder sbU = b11.u("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            sbU.append(fragment);
            throw new FileDataSource$FileDataSourceException(sbU.toString(), e2, 1004);
        } catch (SecurityException e3) {
            throw new FileDataSource$FileDataSourceException(e3, 2006);
        } catch (RuntimeException e4) {
            throw new FileDataSource$FileDataSourceException(e4, 2000);
        }
    }

    @Override // defpackage.ci0
    public final void close() {
        this.s = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.r;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.r = null;
                if (this.u) {
                    this.u = false;
                    p();
                }
            } catch (IOException e) {
                throw new FileDataSource$FileDataSourceException(e, 2000);
            }
        } catch (Throwable th) {
            this.r = null;
            if (this.u) {
                this.u = false;
                p();
            }
            throw th;
        }
    }

    @Override // defpackage.ci0
    public final Uri m() {
        return this.s;
    }

    @Override // defpackage.wh0
    public final int read(byte[] bArr, int i, int i2) throws FileDataSource$FileDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.t;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.r;
            String str = f35.a;
            int i3 = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (i3 > 0) {
                this.t -= (long) i3;
                o(i3);
            }
            return i3;
        } catch (IOException e) {
            throw new FileDataSource$FileDataSourceException(e, 2000);
        }
    }
}
