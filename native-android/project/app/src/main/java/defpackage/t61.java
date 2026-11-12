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
    public final long b(ii0 r9) {
        Uri r0 = r9.a;
        long r1 = r9.f;
        this.s = r0;
        q(r9);
        int r4 = 2006;
        String r6 = r0.getPath();     // Catch: RuntimeException -> L19 SecurityException -> L21 FileNotFoundException -> L23
        r6.getClass();     // Catch: RuntimeException -> L19 SecurityException -> L21 FileNotFoundException -> L23
        RandomAccessFile r5 = new RandomAccessFile(r6, "r");     // Catch: RuntimeException -> L19 SecurityException -> L21 FileNotFoundException -> L23
        this.r = r5;
        r5.seek(r1);     // Catch: IOException -> L8
        long r7 = r9.g;     // Catch: IOException -> L8
        if (r7 != (-1)) goto L10;
        r7 = this.r.length() - r1;     // Catch: IOException -> L8
    L10:
        this.t = r7;     // Catch: IOException -> L8
        if (r7 < 0) goto L16;
        this.u = true;
        r(r9);
        return this.t;
    L16:
        throw new FileDataSource$FileDataSourceException(null, null, 2008);
    L8:
        e = move-exception;
        throw new FileDataSource$FileDataSourceException(e, 2000);
    L23:
        e = move-exception;
        if (TextUtils.isEmpty(r0.getQuery()) == true) goto L32;
    L41:
        String r2 = r0.getPath();
        String r3 = r0.getQuery();
        String r8 = r0.getFragment();
        StringBuilder r10 = b11.u("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", r2, ",query=", r3, ",fragment=");
        r10.append(r8);
        throw new FileDataSource$FileDataSourceException(r10.toString(), e, 1004);
    L32:
        if (TextUtils.isEmpty(r0.getFragment()) == false) goto L41;
        if ((e.getCause() instanceof ErrnoException) == true) goto L36;
    L38:
        r4 = 2005;
    L40:
        throw new FileDataSource$FileDataSourceException(e, r4);
    L36:
        if (((ErrnoException) e.getCause()).errno != OsConstants.EACCES) goto L38;
    L21:
        e = move-exception;
        throw new FileDataSource$FileDataSourceException(e, 2006);
    L19:
        e = move-exception;
        throw new FileDataSource$FileDataSourceException(e, 2000);
    }

    @Override // defpackage.ci0
    public final void close() {
        this.s = null;
        RandomAccessFile r2 = this.r;     // Catch: Throwable -> L7 IOException -> L9
        if (r2 == null) goto L11;
        r2.close();     // Catch: Throwable -> L7 IOException -> L9
    L11:
        this.r = null;
        if (this.u == false) goto L23;
        this.u = false;
        p();
        return;
    L23:
        return;
    L7:
        th = move-exception;
        this.r = null;
        if (this.u == false) goto L20;
        this.u = false;
        p();
    L20:
        throw th;
    L9:
        e = move-exception;
        throw new FileDataSource$FileDataSourceException(e, 2000);     // Catch: Throwable -> L7
    }

    @Override // defpackage.ci0
    public final Uri m() {
        return this.s;
    }

    @Override // defpackage.wh0
    public final int read(byte[] r6, int r7, int r8) {
        if (r8 != 0) goto L5;
        return 0;
    L5:
        long r0 = this.t;
        if (r0 != 0) goto L16;
        return -1;
    L16:
        RandomAccessFile r2 = this.r;     // Catch: IOException -> L13
        String r3 = f35.a;     // Catch: IOException -> L13
        int r9 = r2.read(r6, r7, (int) Math.min(r0, r8));     // Catch: IOException -> L13
        if (r9 <= 0) goto L12;
        this.t -= (long) r9;
        o(r9);
    L12:
        return r9;
    L13:
        e = move-exception;
        throw new FileDataSource$FileDataSourceException(e, 2000);
    }
}
