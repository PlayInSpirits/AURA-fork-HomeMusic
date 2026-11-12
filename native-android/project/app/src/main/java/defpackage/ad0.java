package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import androidx.media3.datasource.ContentDataSource$ContentDataSourceException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ad0 extends kp {
    public final ContentResolver r;
    public Uri s;
    public AssetFileDescriptor t;
    public FileInputStream u;
    public long v;
    public boolean w;

    public ad0(Context context) {
        super(false);
        this.r = context.getContentResolver();
    }

    @Override // defpackage.ci0
    public final long b(ii0 ii0Var) throws ContentDataSource$ContentDataSourceException {
        int i;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            try {
                Uri uri = ii0Var.a;
                long j = ii0Var.g;
                long j2 = ii0Var.f;
                Uri uriNormalizeScheme = uri.normalizeScheme();
                this.s = uriNormalizeScheme;
                q(ii0Var);
                boolean zEquals = Objects.equals(uriNormalizeScheme.getScheme(), "content");
                ContentResolver contentResolver = this.r;
                if (zEquals) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
                } else {
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriNormalizeScheme, "r");
                }
                this.t = assetFileDescriptorOpenAssetFileDescriptor;
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    i = 2000;
                    try {
                        throw new ContentDataSource$ContentDataSourceException(new IOException("Could not open file descriptor for: " + uriNormalizeScheme), 2000);
                    } catch (IOException e) {
                        e = e;
                        throw new ContentDataSource$ContentDataSourceException(e, e instanceof FileNotFoundException ? 2005 : i);
                    }
                }
                long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                this.u = fileInputStream;
                if (length != -1 && j2 > length) {
                    throw new ContentDataSource$ContentDataSourceException(null, 2008);
                }
                long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j2) - startOffset;
                if (jSkip != j2) {
                    throw new ContentDataSource$ContentDataSourceException(null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.v = -1L;
                    } else {
                        long jPosition = size - channel.position();
                        this.v = jPosition;
                        if (jPosition < 0) {
                            throw new ContentDataSource$ContentDataSourceException(null, 2008);
                        }
                    }
                } else {
                    long j3 = length - jSkip;
                    this.v = j3;
                    if (j3 < 0) {
                        throw new ContentDataSource$ContentDataSourceException(null, 2008);
                    }
                }
                if (j != -1) {
                    long j4 = this.v;
                    this.v = j4 == -1 ? j : Math.min(j4, j);
                }
                this.w = true;
                r(ii0Var);
                return j != -1 ? j : this.v;
            } catch (ContentDataSource$ContentDataSourceException e2) {
                throw e2;
            }
        } catch (IOException e3) {
            e = e3;
            i = 2000;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x000e */
    /* JADX WARN: Bottom block not found for handler: all -> 0x004e */
    @Override // defpackage.ci0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        this.s = null;
        try {
            FileInputStream fileInputStream = this.u;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            this.u = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor = this.t;
                    if (assetFileDescriptor != null) {
                        assetFileDescriptor.close();
                    }
                    this.t = null;
                    if (this.w) {
                        this.w = false;
                        p();
                    }
                } catch (IOException e) {
                    throw new ContentDataSource$ContentDataSourceException(e, 2000);
                }
            } catch (Throwable th) {
                this.t = null;
                if (this.w) {
                    this.w = false;
                    p();
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new ContentDataSource$ContentDataSourceException(e2, 2000);
        }
    }

    @Override // defpackage.ci0
    public final Uri m() {
        return this.s;
    }

    @Override // defpackage.wh0
    public final int read(byte[] bArr, int i, int i2) throws ContentDataSource$ContentDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.v;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new ContentDataSource$ContentDataSourceException(e, 2000);
                }
            }
            FileInputStream fileInputStream = this.u;
            String str = f35.a;
            int i3 = fileInputStream.read(bArr, i, i2);
            if (i3 != -1) {
                long j2 = this.v;
                if (j2 != -1) {
                    this.v = j2 - ((long) i3);
                }
                o(i3);
                return i3;
            }
        }
        return -1;
    }
}
