package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gs3 implements sh0 {
    public static final String[] x = null;
    public final Context n;
    public final uw2 o;
    public final uw2 p;
    public final Uri q;
    public final int r;
    public final int s;
    public final db3 t;
    public final Class u;
    public volatile boolean v;
    public volatile sh0 w;

    static {
        x = new String[]{"_data"};
    }

    public gs3(Context r1, uw2 r2, uw2 r3, Uri r4, int r5, int r6, db3 r7, Class r8) {
        this.n = r1.getApplicationContext();
        this.o = r2;
        this.p = r3;
        this.q = r4;
        this.r = r5;
        this.s = r6;
        this.t = r7;
        this.u = r8;
    }

    @Override // defpackage.sh0
    public final Class a() {
        return this.u;
    }

    public final sh0 b() {
        boolean r0 = ek2.s();
        Cursor r1 = null;
        Context r2 = this.n;
        db3 r3 = this.t;
        int r4 = this.s;
        int r5 = this.r;
        if (r0 == false) goto L24;
        Uri r7 = this.q;
        Cursor r6 = r2.getContentResolver().query(r7, x, null, null, null);     // Catch: Throwable -> L19
        if (r6 == null) goto L18;
    L13:
        th = move-exception;
        Throwable r13 = th;
        r1 = r6;
    L21:
        if (r1 == null) goto L40;
        r1.close();
        throw r13;
    L40:
        throw r13;
    L8:
        if (r6.moveToFirst() == false) goto L18;
        String r8 = r6.getString(r6.getColumnIndexOrThrow("_data"));     // Catch: Throwable -> L13
        if (TextUtils.isEmpty(r8) == true) goto L16;
        File r9 = new File(r8);     // Catch: Throwable -> L13
        r6.close();
        tw2 r14 = this.o.b(r9, r5, r4, r3);
    L33:
        if (r14 != null) goto L35;
        return null;
    L35:
        return r14.c;
    L16:
        throw new FileNotFoundException("File path was empty in media store for: " + r7);     // Catch: Throwable -> L13
    L18:
        throw new FileNotFoundException("Failed to media store entry for: " + r7);     // Catch: Throwable -> L13
    L19:
        th = move-exception;
        r13 = th;
        goto L21
    L24:
        Uri r10 = this.q;
        boolean r11 = hw.s(r10);
        uw2 r15 = this.p;
        if (r11 == false) goto L30;
        if (r10.getPathSegments().contains("picker") == false) goto L30;
        r14 = r15.b(r10, r5, r4, r3);
    L30:
        if (r2.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") != 0) goto L32;
        r10 = ek2.j(r10);
    L32:
        r14 = r15.b(r10, r5, r4, r3);
        goto L33
    }

    @Override // defpackage.sh0
    public final void c() {
        sh0 r0 = this.w;
        if (r0 == null) goto L6;
        r0.c();
        return;
    }

    @Override // defpackage.sh0
    public final void cancel() {
        this.v = true;
        sh0 r1 = this.w;
        if (r1 == null) goto L6;
        r1.cancel();
        return;
    }

    @Override // defpackage.sh0
    public final void d(eq3 r3, rh0 r4) {
        sh0 r1 = b();     // Catch: FileNotFoundException -> L7
        if (r1 != null) goto L9;
        r4.b(new IllegalArgumentException("Failed to build fetcher for: " + this.q));     // Catch: FileNotFoundException -> L7
        return;
    L9:
        this.w = r1;     // Catch: FileNotFoundException -> L7
        if (this.v == false) goto L13;
        cancel();     // Catch: FileNotFoundException -> L7
        return;
    L13:
        r1.d(r3, r4);     // Catch: FileNotFoundException -> L7
        return;
    L7:
        e = move-exception;
        r4.b(e);
    }

    @Override // defpackage.sh0
    public final int e() {
        return 1;
    }
}
