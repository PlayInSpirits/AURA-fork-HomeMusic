package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.media3.datasource.AssetDataSource$AssetDataSourceException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ek extends kp {
    public final AssetManager r;
    public Uri s;
    public InputStream t;
    public long u;
    public boolean v;

    public ek(Context r2) {
        super(false);
        this.r = r2.getAssets();
    }

    @Override // defpackage.ci0
    public final long b(ii0 r8) {
        Uri r0 = r8.a;     // Catch: IOException -> L20 AssetDataSource$AssetDataSourceException -> L27
        long r1 = r8.f;     // Catch: IOException -> L20 AssetDataSource$AssetDataSourceException -> L27
        this.s = r0;     // Catch: IOException -> L20 AssetDataSource$AssetDataSourceException -> L27
        String r2 = r0.getPath();     // Catch: IOException -> L20 AssetDataSource$AssetDataSourceException -> L27
        r2.getClass();     // Catch: IOException -> L20 AssetDataSource$AssetDataSourceException -> L27
        if (r2.startsWith("/android_asset/") == false) goto L6;
        r2 = r2.substring(15);     // Catch: IOException -> L20 AssetDataSource$AssetDataSourceException -> L27
    L8:
        q(r8);     // Catch: IOException -> L20 AssetDataSource$AssetDataSourceException -> L27
        InputStream r3 = this.r.open(r2, 1);     // Catch: IOException -> L20 AssetDataSource$AssetDataSourceException -> L27
        this.t = r3;     // Catch: IOException -> L20 AssetDataSource$AssetDataSourceException -> L27
        if (r3.skip(r1) < r1) goto L19;
        long r4 = r8.g;     // Catch: IOException -> L20 AssetDataSource$AssetDataSourceException -> L27
        if (r4 == (-1)) goto L13;
        this.u = r4;     // Catch: IOException -> L20 AssetDataSource$AssetDataSourceException -> L27
    L16:
        this.v = true;
        r(r8);
        return this.u;
    L13:
        long r5 = this.t.available();     // Catch: IOException -> L20 AssetDataSource$AssetDataSourceException -> L27
        this.u = r5;     // Catch: IOException -> L20 AssetDataSource$AssetDataSourceException -> L27
        if (r5 != 2147483647L) goto L16;
        this.u = -1;     // Catch: IOException -> L20 AssetDataSource$AssetDataSourceException -> L27
        goto L16
    L19:
        throw new AssetDataSource$AssetDataSourceException(null, 2008);     // Catch: IOException -> L20 AssetDataSource$AssetDataSourceException -> L27
    L6:
        if (r2.startsWith("/") == false) goto L8;
        r2 = r2.substring(1);     // Catch: IOException -> L20 AssetDataSource$AssetDataSourceException -> L27
    L27:
        e = move-exception;
        throw e;
    L20:
        e = move-exception;
        if ((e instanceof FileNotFoundException) == false) goto L24;
        int r6 = 2005;
    L26:
        throw new AssetDataSource$AssetDataSourceException(e, r6);
    L24:
        r6 = 2000;
        goto L26
    }

    @Override // defpackage.ci0
    public final void close() {
        this.s = null;
        InputStream r2 = this.t;     // Catch: Throwable -> L7 IOException -> L9
        if (r2 == null) goto L11;
        r2.close();     // Catch: Throwable -> L7 IOException -> L9
    L11:
        this.t = null;
        if (this.v == false) goto L23;
        this.v = false;
        p();
        return;
    L23:
        return;
    L7:
        th = move-exception;
        this.t = null;
        if (this.v == false) goto L20;
        this.v = false;
        p();
    L20:
        throw th;
    L9:
        e = move-exception;
        throw new AssetDataSource$AssetDataSourceException(e, 2000);     // Catch: Throwable -> L7
    }

    @Override // defpackage.ci0
    public final Uri m() {
        return this.s;
    }

    @Override // defpackage.wh0
    public final int read(byte[] r9, int r10, int r11) {
        if (r11 != 0) goto L5;
        return 0;
    L5:
        long r0 = this.u;
        if (r0 != 0) goto L9;
    L15:
        return -1;
    L9:
        if (r0 != (-1)) goto L24;
    L13:
        InputStream r1 = this.t;     // Catch: IOException -> L21
        String r2 = f35.a;     // Catch: IOException -> L21
        int r12 = r1.read(r9, r10, r11);     // Catch: IOException -> L21
        if (r12 == (-1)) goto L15;
        long r13 = this.u;
        if (r13 == (-1)) goto L19;
        this.u = r13 - ((long) r12);
    L19:
        o(r12);
        return r12;
    L21:
        e = move-exception;
        throw new AssetDataSource$AssetDataSourceException(e, 2000);
    L24:
        r11 = (int) Math.min(r0, r11);     // Catch: IOException -> L21
        goto L13
    }
}
