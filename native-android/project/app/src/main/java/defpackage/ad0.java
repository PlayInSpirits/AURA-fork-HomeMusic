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

    public ad0(Context r2) {
        super(false);
        this.r = r2.getContentResolver();
    }

    @Override // defpackage.ci0
    public final long b(ii0 r21) {
        Uri r4 = r21.a;     // Catch: IOException -> L7 ContentDataSource$ContentDataSourceException -> L61
        long r5 = r21.g;     // Catch: IOException -> L7 ContentDataSource$ContentDataSourceException -> L61
        long r7 = r21.f;     // Catch: IOException -> L7 ContentDataSource$ContentDataSourceException -> L61
        Uri r6 = r4.normalizeScheme();     // Catch: IOException -> L7 ContentDataSource$ContentDataSourceException -> L61
        this.s = r6;     // Catch: IOException -> L7 ContentDataSource$ContentDataSourceException -> L61
        q(r21);     // Catch: IOException -> L7 ContentDataSource$ContentDataSourceException -> L61
        boolean r9 = Objects.equals(r6.getScheme(), "content");     // Catch: IOException -> L7 ContentDataSource$ContentDataSourceException -> L61
        ContentResolver r10 = this.r;
        if (r9 == false) goto L9;
        Bundle r11 = new Bundle();     // Catch: IOException -> L7 ContentDataSource$ContentDataSourceException -> L61
        r11.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);     // Catch: IOException -> L7 ContentDataSource$ContentDataSourceException -> L61
        AssetFileDescriptor r12 = r10.openTypedAssetFileDescriptor(r6, "*/*", r11);     // Catch: IOException -> L7 ContentDataSource$ContentDataSourceException -> L61
    L10:
        this.t = r12;     // Catch: IOException -> L7 ContentDataSource$ContentDataSourceException -> L61
        if (r12 == null) goto L51;
        long r13 = r12.getLength();     // Catch: IOException -> L7 ContentDataSource$ContentDataSourceException -> L61
        FileInputStream r2 = new FileInputStream(r12.getFileDescriptor());     // Catch: IOException -> L7 ContentDataSource$ContentDataSourceException -> L61
        this.u = r2;     // Catch: IOException -> L7 ContentDataSource$ContentDataSourceException -> L61
        if (r13 != (-1)) goto L15;
    L19:
        long r16 = r12.getStartOffset();     // Catch: IOException -> L7 ContentDataSource$ContentDataSourceException -> L61
        long r14 = r2.skip(r16 + r7) - r16;     // Catch: IOException -> L7 ContentDataSource$ContentDataSourceException -> L61
        if (r14 != r7) goto L49;
        if (r13 != (-1)) goto L31;
        FileChannel r3 = r2.getChannel();     // Catch: IOException -> L7 ContentDataSource$ContentDataSourceException -> L61
        long r15 = r3.size();     // Catch: IOException -> L7 ContentDataSource$ContentDataSourceException -> L61
        if (r15 != 0) goto L26;
        this.v = -1;     // Catch: IOException -> L7 ContentDataSource$ContentDataSourceException -> L61
    L35:
        if (r5 == (-1)) goto L41;
        long r8 = this.v;
        if (r8 != (-1)) goto L39;
        long r17 = r5;
    L40:
        this.v = r17;
        goto L41
    L39:
        r17 = Math.min(r8, r5);
    L41:
        this.w = true;
        r(r21);
        if (r5 == (-1)) goto L45;
        return r5;
    L45:
        return this.v;
    L26:
        long r18 = r15 - r3.position();     // Catch: IOException -> L7 ContentDataSource$ContentDataSourceException -> L61
        this.v = r18;     // Catch: IOException -> L7 ContentDataSource$ContentDataSourceException -> L61
        if (r18 >= 0) goto L35;
        throw new ContentDataSource$ContentDataSourceException(null, 2008);     // Catch: IOException -> L7 ContentDataSource$ContentDataSourceException -> L61
    L31:
        long r19 = r13 - r14;     // Catch: IOException -> L7 ContentDataSource$ContentDataSourceException -> L61
        this.v = r19;     // Catch: IOException -> L7 ContentDataSource$ContentDataSourceException -> L61
        if (r19 >= 0) goto L35;
        throw new ContentDataSource$ContentDataSourceException(null, 2008);     // Catch: IOException -> L7 ContentDataSource$ContentDataSourceException -> L61
    L49:
        throw new ContentDataSource$ContentDataSourceException(null, 2008);     // Catch: IOException -> L7 ContentDataSource$ContentDataSourceException -> L61
    L15:
        if (r7 <= r13) goto L19;
        throw new ContentDataSource$ContentDataSourceException(null, 2008);     // Catch: IOException -> L7 ContentDataSource$ContentDataSourceException -> L61
    L51:
        int r20 = 2000;
    L54:
        e = e;
    L56:
        if ((e instanceof FileNotFoundException) == false) goto L58;
        int r22 = 2005;
    L60:
        throw new ContentDataSource$ContentDataSourceException(e, r22);
    L58:
        r22 = r20;
        goto L60
    L53:
        throw new ContentDataSource$ContentDataSourceException(new IOException("Could not open file descriptor for: " + r6), 2000);     // Catch: IOException -> L54 ContentDataSource$ContentDataSourceException -> L61
    L9:
        r12 = r10.openAssetFileDescriptor(r6, "r");     // Catch: IOException -> L7 ContentDataSource$ContentDataSourceException -> L61
    L61:
        e = move-exception;
        throw e;
    L7:
        e = e;
        r20 = 2000;
        goto L56
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
        throw new ContentDataSource$ContentDataSourceException(e, 2000);     // Catch: Throwable -> L16
    L9:
        e = move-exception;
        throw new ContentDataSource$ContentDataSourceException(e, 2000);     // Catch: Throwable -> L7
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
        throw new ContentDataSource$ContentDataSourceException(e, 2000);     // Catch: Throwable -> L37
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
        return this.s;
    }

    @Override // defpackage.wh0
    public final int read(byte[] r9, int r10, int r11) {
        if (r11 != 0) goto L5;
        return 0;
    L5:
        long r0 = this.v;
        if (r0 != 0) goto L9;
    L15:
        return -1;
    L9:
        if (r0 != (-1)) goto L24;
    L13:
        FileInputStream r1 = this.u;     // Catch: IOException -> L21
        String r2 = f35.a;     // Catch: IOException -> L21
        int r12 = r1.read(r9, r10, r11);     // Catch: IOException -> L21
        if (r12 == (-1)) goto L15;
        long r13 = this.v;
        if (r13 == (-1)) goto L19;
        this.v = r13 - ((long) r12);
    L19:
        o(r12);
        return r12;
    L21:
        e = move-exception;
        throw new ContentDataSource$ContentDataSourceException(e, 2000);
    L24:
        r11 = (int) Math.min(r0, r11);     // Catch: IOException -> L21
        goto L13
    }
}
