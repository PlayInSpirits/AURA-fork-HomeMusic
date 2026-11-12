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

    public ru3(Context r2) {
        super(false);
        this.r = r2.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int r2) {
        return Uri.parse("rawresource:///" + r2);
    }

    @Override // defpackage.ci0
    public final long b(ii0 r20) {
        this.s = r20;
        q(r20);
        Uri r2 = r20.a;
        long r3 = r20.g;
        long r5 = r20.f;
        Uri r4 = r2.normalizeScheme();
        boolean r7 = TextUtils.equals("rawresource", r4.getScheme());
        Context r10 = this.r;
        if (r7 == false) goto L14;
        Resources r8 = r10.getResources();
        List<String> r11 = r4.getPathSegments();
        if (r11.size() != 1) goto L12;
        int r9 = Integer.parseInt(r11.get(0));     // Catch: NumberFormatException -> L9
    L94:
        AssetFileDescriptor r12 = r8.openRawResourceFd(r9);     // Catch: Resources.NotFoundException -> L84
        if (r12 == null) goto L83;
        this.t = r12;
        long r13 = r12.getLength();
        FileInputStream r6 = new FileInputStream(this.t.getFileDescriptor());
        this.u = r6;
        if (r13 != (-1)) goto L41;
    L47:
        long r17 = this.t.getStartOffset();     // Catch: IOException -> L45 RawResourceDataSource$RawResourceDataSourceException -> L80
        long r14 = r6.skip(r17 + r5) - r17;     // Catch: IOException -> L45 RawResourceDataSource$RawResourceDataSourceException -> L80
        if (r14 != r5) goto L77;
        if (r13 != (-1)) goto L59;
        FileChannel r15 = r6.getChannel();     // Catch: IOException -> L45 RawResourceDataSource$RawResourceDataSourceException -> L80
        if (r15.size() != 0) goto L54;
        this.v = -1;     // Catch: IOException -> L45 RawResourceDataSource$RawResourceDataSourceException -> L80
    L63:
        if (r3 == (-1)) goto L69;
        long r16 = this.v;
        if (r16 != (-1)) goto L67;
        long r18 = r3;
    L68:
        this.v = r18;
        goto L69
    L67:
        r18 = Math.min(r16, r3);
    L69:
        this.w = true;
        r(r20);
        if (r3 == (-1)) goto L73;
        return r3;
    L73:
        return this.v;
    L54:
        long r19 = r15.size() - r15.position();     // Catch: IOException -> L45 RawResourceDataSource$RawResourceDataSourceException -> L80
        this.v = r19;     // Catch: IOException -> L45 RawResourceDataSource$RawResourceDataSourceException -> L80
        if (r19 >= 0) goto L63;
        throw new RawResourceDataSource$RawResourceDataSourceException(null, null, 2008);     // Catch: IOException -> L45 RawResourceDataSource$RawResourceDataSourceException -> L80
    L59:
        long r21 = r13 - r14;     // Catch: IOException -> L45 RawResourceDataSource$RawResourceDataSourceException -> L80
        this.v = r21;     // Catch: IOException -> L45 RawResourceDataSource$RawResourceDataSourceException -> L80
        if (r21 >= 0) goto L63;
        throw new DataSourceException(2008);     // Catch: IOException -> L45 RawResourceDataSource$RawResourceDataSourceException -> L80
    L77:
        throw new RawResourceDataSource$RawResourceDataSourceException(null, null, 2008);     // Catch: IOException -> L45 RawResourceDataSource$RawResourceDataSourceException -> L80
    L41:
        if (r5 <= r13) goto L47;
        throw new RawResourceDataSource$RawResourceDataSourceException(null, null, 2008);     // Catch: IOException -> L45 RawResourceDataSource$RawResourceDataSourceException -> L80
    L80:
        e = move-exception;
        throw e;
    L45:
        e = move-exception;
        throw new RawResourceDataSource$RawResourceDataSourceException(null, e, 2000);
    L83:
        throw new RawResourceDataSource$RawResourceDataSourceException("Resource is compressed: " + r4, null, 2000);
    L84:
        e = move-exception;
        throw new RawResourceDataSource$RawResourceDataSourceException(null, e, 2005);
    L10:
        throw new RawResourceDataSource$RawResourceDataSourceException("Resource identifier must be an integer.", null, 1004);
    L12:
        throw new RawResourceDataSource$RawResourceDataSourceException("rawresource:// URI must have exactly one path element, found " + r11.size(), null, 2000);
    L14:
        if (TextUtils.equals("android.resource", r4.getScheme()) == false) goto L93;
        String r22 = r4.getPath();
        r22.getClass();
        if (r22.startsWith("/") == false) goto L19;
        r22 = r22.substring(1);
    L19:
        if (TextUtils.isEmpty(r4.getHost()) == false) goto L21;
        String r110 = r10.getPackageName();
    L23:
        if (r110.equals(r10.getPackageName()) == false) goto L98;
        Resources r111 = r10.getResources();
    L27:
        if (r22.matches("\\d+") == true) goto L100;
        int r23 = r111.getIdentifier(b11.o(r110, ":", r22), "raw", null);
        if (r23 == 0) goto L88;
    L29:
        r9 = r23;
        r8 = r111;
        goto L94
    L88:
        throw new RawResourceDataSource$RawResourceDataSourceException("Resource not found.", null, 2005);
    L100:
        r23 = Integer.parseInt(r22);     // Catch: NumberFormatException -> L30
    L31:
        throw new RawResourceDataSource$RawResourceDataSourceException("Resource identifier must be an integer.", null, 1004);
    L98:
        r111 = r10.getPackageManager().getResourcesForApplication(r110);     // Catch: PackageManager.NameNotFoundException -> L89
    L89:
        e = move-exception;
        throw new RawResourceDataSource$RawResourceDataSourceException("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e, 2005);
    L21:
        r110 = r4.getHost();
        goto L23
    L93:
        throw new RawResourceDataSource$RawResourceDataSourceException("Unsupported URI scheme (" + r4.getScheme() + "). Only android.resource is supported.", null, 1004);
    }

    @Override // defpackage.ci0
    public final void close() {
        this.s = null;
        FileInputStream r3 = this.u;     // Catch: Throwable -> L7 IOException -> L9
        if (r3 == null) goto L11;
        r3.close();     // Catch: Throwable -> L7 IOException -> L9
    L11:
        this.u = null;
        AssetFileDescriptor r4 = this.t;     // Catch: Throwable -> L16 IOException -> L18
        if (r4 == null) goto L20;
        r4.close();     // Catch: Throwable -> L16 IOException -> L18
    L20:
        this.t = null;
        if (this.w == false) goto L59;
        this.w = false;
        p();
        return;
    L59:
        return;
    L16:
        th = move-exception;
        this.t = null;
        if (this.w == false) goto L29;
        this.w = false;
        p();
    L29:
        throw th;
    L18:
        e = move-exception;
        throw new RawResourceDataSource$RawResourceDataSourceException(null, e, 2000);     // Catch: Throwable -> L16
    L9:
        e = move-exception;
        throw new RawResourceDataSource$RawResourceDataSourceException(null, e, 2000);     // Catch: Throwable -> L7
    L7:
        th = move-exception;
        this.u = null;
        AssetFileDescriptor r5 = this.t;     // Catch: Throwable -> L37 IOException -> L39
        if (r5 == null) goto L41;
        r5.close();     // Catch: Throwable -> L37 IOException -> L39
    L41:
        this.t = null;
        if (this.w == false) goto L44;
        this.w = false;
        p();
    L44:
        throw th;
    L39:
        e = move-exception;
        throw new RawResourceDataSource$RawResourceDataSourceException(null, e, 2000);     // Catch: Throwable -> L37
    L37:
        th = move-exception;
        this.t = null;
        if (this.w == false) goto L50;
        this.w = false;
        p();
    L50:
        throw th;
    }

    @Override // defpackage.ci0
    public final Uri m() {
        ii0 r0 = this.s;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.a;
    }

    @Override // defpackage.wh0
    public final int read(byte[] r10, int r11, int r12) {
        if (r12 != 0) goto L5;
        return 0;
    L5:
        long r0 = this.v;
        if (r0 != 0) goto L9;
    L18:
        return -1;
    L9:
        if (r0 != (-1)) goto L29;
    L13:
        FileInputStream r1 = this.u;     // Catch: IOException -> L26
        String r2 = f35.a;     // Catch: IOException -> L26
        int r13 = r1.read(r10, r11, r12);     // Catch: IOException -> L26
        long r14 = this.v;
        if (r13 != (-1)) goto L22;
        if (r14 == (-1)) goto L18;
        throw new RawResourceDataSource$RawResourceDataSourceException("End of stream reached having not read sufficient data.", new EOFException(), 2000);
    L22:
        if (r14 == (-1)) goto L24;
        this.v = r14 - ((long) r13);
    L24:
        o(r13);
        return r13;
    L26:
        e = move-exception;
        throw new RawResourceDataSource$RawResourceDataSourceException(null, e, 2000);
    L29:
        r12 = (int) Math.min(r0, r12);     // Catch: IOException -> L26
        goto L13
    }
}
