package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class y61 implements sh0 {
    public final /* synthetic */ int n;
    public final Comparable o;
    public final Object p;
    public Object q;

    public /* synthetic */ y61(int r1, Comparable r2, Object r3) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
    }

    public static y61 b(Context r3, Uri r4, st4 r5) {
        qj0 r0 = a.a(r3).q;
        ArrayList r2 = a.a(r3).p.a().e();
        ContentResolver r6 = r3.getContentResolver();
        ss0 r1 = new ss0();
        r1.n = r5;
        r1.o = r0;
        r1.p = r6;
        r1.q = r2;
        return new y61(1, r4, r1);
    }

    private final void f() {
    }

    private final void g() {
    }

    @Override // defpackage.sh0
    public final Class a() {
        switch(this.n) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        return InputStream.class;
    L6:
        switch(((y41) this.p).n) {
            case 7: goto L8;
            default: goto L10;
        };
    L8:
        return ParcelFileDescriptor.class;
    L10:
        return InputStream.class;
    }

    @Override // defpackage.sh0
    public final void c() {
        switch(this.n) {
            case 0: goto L8;
            default: goto L4;
        };
    L4:
        InputStream r1 = (InputStream) this.q;
        if (r1 == null) goto L22;
        r1.close();     // Catch: IOException -> L15
        return;
    L23:
        return;
    L22:
        return;
    L8:
        Object r0 = this.q;
        if (r0 == null) goto L24;
        switch(((y41) this.p).n) {
            case 7: goto L13;
            default: goto L12;
        };     // Catch: IOException -> L16
    L12:
        ((InputStream) r0).close();     // Catch: IOException -> L16
    L17:
        return;
    L13:
        ((ParcelFileDescriptor) r0).close();     // Catch: IOException -> L16
    L25:
        return;
    }

    @Override // defpackage.sh0
    public final void cancel() {
        int r0 = this.n;
    }

    @Override // defpackage.sh0
    public final void d(eq3 r3, rh0 r4) {
        switch(this.n) {
            case 0: goto L26;
            default: goto L24;
        };
    L24:
        InputStream r5 = h();     // Catch: FileNotFoundException -> L6
        this.q = r5;     // Catch: FileNotFoundException -> L6
        r4.f(r5);     // Catch: FileNotFoundException -> L6
        return;
    L6:
        e = move-exception;
        if (Log.isLoggable("MediaStoreThumbFetcher", 3) == false) goto L10;
        Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e);
    L10:
        r4.b(e);
        return;
    L26:
        y41 r6 = (y41) this.p;     // Catch: FileNotFoundException -> L18
        File r1 = (File) this.o;     // Catch: FileNotFoundException -> L18
        switch(r6.n) {
            case 7: goto L15;
            default: goto L14;
        };     // Catch: FileNotFoundException -> L18
    L14:
        Object r7 = new FileInputStream(r1);     // Catch: FileNotFoundException -> L18
    L16:
        this.q = r7;     // Catch: FileNotFoundException -> L18
        r4.f(r7);     // Catch: FileNotFoundException -> L18
        return;
    L15:
        r7 = ParcelFileDescriptor.open(r1, 268435456);     // Catch: FileNotFoundException -> L18
    L18:
        e = move-exception;
        if (Log.isLoggable("FileLoader", 3) == false) goto L22;
        Log.d("FileLoader", "Failed to open file", e);
    L22:
        r4.b(e);
    }

    @Override // defpackage.sh0
    public final int e() {
        switch(this.n) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        return 1;
    L6:
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x002c: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:45), block:B:11:0x002c */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.NullPointerException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r6v0 */
    public InputStream h() {
        ss0 r0 = (ss0) this.p;
        ContentResolver r1 = (ContentResolver) r0.p;
        Uri r11 = (Uri) this.o;
        ?? r5 = 0;
        InputStream r6 = null;
        Cursor r7 = ((st4) r0.n).p(r11);     // Catch: Throwable -> L17 SecurityException -> L19
        if (r7 != null) goto L86;
    L14:
        if (r7 == null) goto L16;
    L15:
        r7.close();
    L16:
        String r3 = null;
    L29:
        if (TextUtils.isEmpty(r3) == false) goto L31;
    L30:
        InputStream r4 = null;
    L42:
        if (r4 != null) goto L84;
    L62:
        int r12 = -1;
    L63:
        if (r12 != (-1)) goto L65;
        return r4;
    L65:
        return new j31(r4, r12);
    L84:
        r6 = r1.openInputStream(r11);     // Catch: Throwable -> L48 Throwable -> L50 IOException -> L52
        r12 = kb4.A((ArrayList) r0.q, r6, (qj0) r0.o);     // Catch: Throwable -> L48 Throwable -> L50 IOException -> L52
        if (r6 == null) goto L63;
        r6.close();     // Catch: IOException -> L69
    L48:
        th = move-exception;
        if (0 != 0) goto L80;
    L61:
        throw th;
    L80:
        r5.close();     // Catch: IOException -> L70
    L50:
        e = move-exception;
        if (Log.isLoggable("ThumbStreamOpener", 3) == false) goto L56;
        Log.d("ThumbStreamOpener", "Failed to open uri: " + r11, e);     // Catch: Throwable -> L48
    L56:
        if (r6 == null) goto L62;
        r6.close();     // Catch: IOException -> L71
        goto L62
    L31:
        File r8 = new File(r3);
        if (r8.exists() == false) goto L30;
        if (0 >= r8.length()) goto L30;
        Uri r9 = Uri.fromFile(r8);
        r4 = r1.openInputStream(r9);     // Catch: NullPointerException -> L38
    L38:
        e = move-exception;
        throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + r11 + " -> " + r9).initCause(e));
    L86:
    L12:
        SecurityException e = e;
    L24:
        if (Log.isLoggable("ThumbStreamOpener", 3) == false) goto L26;
        Log.d("ThumbStreamOpener", "Failed to query for thumbnail for Uri: " + r11, e);     // Catch: Throwable -> L10
    L26:
        if (r7 == null) goto L16;
    L7:
        if (r7.moveToFirst() == false) goto L14;
        r3 = r7.getString(0);     // Catch: Throwable -> L10 SecurityException -> L12
        r7.close();
        goto L29
    L19:
        e = e;
    L20:
        r7 = null;
    L17:
        th = th;
    L66:
        if (r5 == 0) goto L68;
        r5.close();
    L68:
        throw th;
    L21:
        e = move-exception;
        e = e;
    L10:
        th = th;
        r5 = r6;
        goto L66
    }
}
