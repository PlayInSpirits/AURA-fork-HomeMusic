package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.RawResourceDataSource$RawResourceDataSourceException;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ru3 extends kp {
    public final Context r;
    public ii0 s;
    public AssetFileDescriptor t;
    public FileInputStream u;
    public long v;
    public boolean w;

    public ru3(Context context) {
        super(false);
        this.r = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    @Override // defpackage.ci0
    public final long b(ii0 ii0Var) throws RawResourceDataSource$RawResourceDataSourceException {
        Resources resourcesForApplication;
        int identifier;
        int i;
        Resources resources;
        this.s = ii0Var;
        q(ii0Var);
        Uri uri = ii0Var.a;
        long j = ii0Var.g;
        long j2 = ii0Var.f;
        Uri uriNormalizeScheme = uri.normalizeScheme();
        boolean zEquals = TextUtils.equals("rawresource", uriNormalizeScheme.getScheme());
        Context context = this.r;
        if (zEquals) {
            resources = context.getResources();
            List<String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new RawResourceDataSource$RawResourceDataSourceException("rawresource:// URI must have exactly one path element, found " + pathSegments.size(), null, 2000);
            }
            try {
                i = Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new RawResourceDataSource$RawResourceDataSourceException("Resource identifier must be an integer.", null, 1004);
            }
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new RawResourceDataSource$RawResourceDataSourceException("Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only android.resource is supported.", null, 1004);
            }
            String path = uriNormalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String packageName = TextUtils.isEmpty(uriNormalizeScheme.getHost()) ? context.getPackageName() : uriNormalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e) {
                    throw new RawResourceDataSource$RawResourceDataSourceException("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e, 2005);
                }
            }
            if (path.matches("\\d+")) {
                try {
                    identifier = Integer.parseInt(path);
                } catch (NumberFormatException unused2) {
                    throw new RawResourceDataSource$RawResourceDataSourceException("Resource identifier must be an integer.", null, 1004);
                }
            } else {
                identifier = resourcesForApplication.getIdentifier(b11.o(packageName, ":", path), "raw", null);
                if (identifier == 0) {
                    throw new RawResourceDataSource$RawResourceDataSourceException("Resource not found.", null, 2005);
                }
            }
            i = identifier;
            resources = resourcesForApplication;
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resources.openRawResourceFd(i);
            if (assetFileDescriptorOpenRawResourceFd == null) {
                throw new RawResourceDataSource$RawResourceDataSourceException("Resource is compressed: " + uriNormalizeScheme, null, 2000);
            }
            this.t = assetFileDescriptorOpenRawResourceFd;
            long length = assetFileDescriptorOpenRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(this.t.getFileDescriptor());
            this.u = fileInputStream;
            try {
                if (length != -1 && j2 > length) {
                    throw new RawResourceDataSource$RawResourceDataSourceException(null, null, 2008);
                }
                long startOffset = this.t.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j2) - startOffset;
                if (jSkip != j2) {
                    throw new RawResourceDataSource$RawResourceDataSourceException(null, null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    if (channel.size() == 0) {
                        this.v = -1L;
                    } else {
                        long size = channel.size() - channel.position();
                        this.v = size;
                        if (size < 0) {
                            throw new RawResourceDataSource$RawResourceDataSourceException(null, null, 2008);
                        }
                    }
                } else {
                    long j3 = length - jSkip;
                    this.v = j3;
                    if (j3 < 0) {
                        throw new DataSourceException(2008);
                    }
                }
                if (j != -1) {
                    long j4 = this.v;
                    this.v = j4 == -1 ? j : Math.min(j4, j);
                }
                this.w = true;
                r(ii0Var);
                return j != -1 ? j : this.v;
            } catch (RawResourceDataSource$RawResourceDataSourceException e2) {
                throw e2;
            } catch (IOException e3) {
                throw new RawResourceDataSource$RawResourceDataSourceException(null, e3, 2000);
            }
        } catch (Resources.NotFoundException e4) {
            throw new RawResourceDataSource$RawResourceDataSourceException(null, e4, 2005);
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
                    throw new RawResourceDataSource$RawResourceDataSourceException(null, e, 2000);
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
            throw new RawResourceDataSource$RawResourceDataSourceException(null, e2, 2000);
        }
    }

    @Override // defpackage.ci0
    public final Uri m() {
        ii0 ii0Var = this.s;
        if (ii0Var != null) {
            return ii0Var.a;
        }
        return null;
    }

    @Override // defpackage.wh0
    public final int read(byte[] bArr, int i, int i2) throws RawResourceDataSource$RawResourceDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.v;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new RawResourceDataSource$RawResourceDataSourceException(null, e, 2000);
                }
            }
            FileInputStream fileInputStream = this.u;
            String str = f35.a;
            int i3 = fileInputStream.read(bArr, i, i2);
            long j2 = this.v;
            if (i3 != -1) {
                if (j2 != -1) {
                    this.v = j2 - ((long) i3);
                }
                o(i3);
                return i3;
            }
            if (j2 != -1) {
                throw new RawResourceDataSource$RawResourceDataSourceException("End of stream reached having not read sufficient data.", new EOFException(), 2000);
            }
        }
        return -1;
    }
}
