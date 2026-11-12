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

    public ek(Context context) {
        super(false);
        this.r = context.getAssets();
    }

    @Override // defpackage.ci0
    public final long b(ii0 ii0Var) throws AssetDataSource$AssetDataSourceException {
        try {
            Uri uri = ii0Var.a;
            long j = ii0Var.f;
            this.s = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            q(ii0Var);
            InputStream inputStreamOpen = this.r.open(path, 1);
            this.t = inputStreamOpen;
            if (inputStreamOpen.skip(j) < j) {
                throw new AssetDataSource$AssetDataSourceException(null, 2008);
            }
            long j2 = ii0Var.g;
            if (j2 != -1) {
                this.u = j2;
            } else {
                long jAvailable = this.t.available();
                this.u = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.u = -1L;
                }
            }
            this.v = true;
            r(ii0Var);
            return this.u;
        } catch (AssetDataSource$AssetDataSourceException e) {
            throw e;
        } catch (IOException e2) {
            throw new AssetDataSource$AssetDataSourceException(e2, e2 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // defpackage.ci0
    public final void close() {
        this.s = null;
        try {
            try {
                InputStream inputStream = this.t;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.t = null;
                if (this.v) {
                    this.v = false;
                    p();
                }
            } catch (IOException e) {
                throw new AssetDataSource$AssetDataSourceException(e, 2000);
            }
        } catch (Throwable th) {
            this.t = null;
            if (this.v) {
                this.v = false;
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
    public final int read(byte[] bArr, int i, int i2) throws AssetDataSource$AssetDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.u;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new AssetDataSource$AssetDataSourceException(e, 2000);
                }
            }
            InputStream inputStream = this.t;
            String str = f35.a;
            int i3 = inputStream.read(bArr, i, i2);
            if (i3 != -1) {
                long j2 = this.u;
                if (j2 != -1) {
                    this.u = j2 - ((long) i3);
                }
                o(i3);
                return i3;
            }
        }
        return -1;
    }
}
