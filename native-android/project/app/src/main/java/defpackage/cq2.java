package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.v4.media.MediaDescriptionCompat;
import android.util.Log;
import app.homemusic.R;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cq2 extends AsyncTask {
    public final Bitmap a;
    public final Uri b;
    public int c;
    public final /* synthetic */ lq2 d;

    public cq2(lq2 r4) {
        this.d = r4;
        MediaDescriptionCompat r0 = r4.Y;
        Uri r1 = null;
        if (r0 != null) goto L5;
        Bitmap r2 = null;
    L6:
        if (r2 != null) goto L8;
    L10:
        this.a = r2;
        MediaDescriptionCompat r5 = r4.Y;
        if (r5 == null) goto L14;
        r1 = r5.s;
    L14:
        this.b = r1;
        return;
    L8:
        if (r2.isRecycled() == false) goto L10;
        Log.w("MediaRouteCtrlDialog", "Can't fetch the given art bitmap because it's already recycled.");
        r2 = null;
        goto L10
    L5:
        r2 = r0.r;
        goto L6
    }

    public final BufferedInputStream a(Uri r3) {
        String r0 = r3.getScheme().toLowerCase();
        if ("android.resource".equals(r0) == false) goto L5;
    L10:
        InputStream r2 = this.d.B.getContentResolver().openInputStream(r3);
    L11:
        if (r2 != null) goto L15;
        return null;
    L15:
        return new BufferedInputStream(r2);
    L5:
        if ("content".equals(r0) == true) goto L10;
        if ("file".equals(r0) == true) goto L10;
        URLConnection r4 = new URL(r3.toString()).openConnection();
        r4.setConnectTimeout(30000);
        r4.setReadTimeout(30000);
        r2 = r4.getInputStream();
        goto L11
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x002f: MOVE (r3 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:48), block:B:14:0x002f */
    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] r10) {
        Void[] r11 = (Void[]) r10;
        int r0 = 0;
        InputStream r3 = null;
        Bitmap r4 = this.a;
        if (r4 != null) goto L48;
        Uri r5 = this.b;
        if (r5 != null) goto L78;
    L47:
        r4 = null;
        goto L48
    L78:
        BufferedInputStream r6 = a(r5);     // Catch: Throwable -> L36 IOException -> L38
        if (r6 != null) goto L17;
        Log.w("MediaRouteCtrlDialog", "Unable to open: " + r5);     // Catch: Throwable -> L13 IOException -> L15
        if (r6 == null) goto L12;
    L11:
        r6.close();     // Catch: IOException -> L62
    L12:
        return null;
    L17:
        BitmapFactory.Options r7 = new BitmapFactory.Options();     // Catch: Throwable -> L13 IOException -> L15
        r7.inJustDecodeBounds = true;     // Catch: Throwable -> L13 IOException -> L15
        BitmapFactory.decodeStream(r6, null, r7);     // Catch: Throwable -> L13 IOException -> L15
        if (r7.outWidth == 0) goto L11;
        if (r7.outHeight == 0) goto L11;
        r6.reset();     // Catch: Throwable -> L13 IOException -> L24
    L30:
        r7.inJustDecodeBounds = false;     // Catch: Throwable -> L13 IOException -> L15
        r7.inSampleSize = Math.max(1, Integer.highestOneBit(r7.outHeight / this.d.B.getResources().getDimensionPixelSize(R.dimen.mr_cast_meta_art_size)));     // Catch: Throwable -> L13 IOException -> L15
        if (isCancelled() == true) goto L28;
        r4 = BitmapFactory.decodeStream(r6, null, r7);     // Catch: Throwable -> L13 IOException -> L15
        r6.close();     // Catch: IOException -> L65
    L28:
        r6.close();     // Catch: IOException -> L62
        return null;
    L24:
        r6.close();     // Catch: Throwable -> L13 IOException -> L15
        r6 = a(r5);     // Catch: Throwable -> L13 IOException -> L15
        if (r6 != null) goto L30;
        Log.w("MediaRouteCtrlDialog", "Unable to open: " + r5);     // Catch: Throwable -> L13 IOException -> L15
        if (r6 != null) goto L28;
        return null;
    L15:
        e = e;
    L40:
        Log.w("MediaRouteCtrlDialog", "Unable to open: " + r5, e);     // Catch: Throwable -> L13
        if (r6 == null) goto L47;
        r6.close();     // Catch: IOException -> L64
    L83:
        return null;
    L38:
        e = e;
        r6 = null;
    L36:
        th = th;
    L44:
        if (r3 != null) goto L68;
    L46:
        throw th;
    L68:
        r3.close();     // Catch: IOException -> L63
    L13:
        th = th;
        r3 = r5;
    L48:
        if (r4 != null) goto L50;
    L52:
        if (r4 == null) goto L80;
        if (r4.getWidth() >= r4.getHeight()) goto L80;
        g01 r12 = new g01(r4);
        r12.a = 1;
        List r13 = (List) r12.a().n;
        if (Collections.unmodifiableList(r13).isEmpty() == true) goto L59;
        r0 = ((nd3) Collections.unmodifiableList(r13).get(0)).d;
    L59:
        this.c = r0;
    L80:
        return r4;
    L50:
        if (r4.isRecycled() == false) goto L52;
        Log.w("MediaRouteCtrlDialog", "Can't use recycled bitmap: " + r4);
        return null;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object r5) {
        Bitmap r6 = (Bitmap) r5;
        lq2 r1 = this.d;
        r1.Z = null;
        Bitmap r0 = r1.a0;
        Bitmap r2 = this.a;
        boolean r3 = Objects.equals(r0, r2);
        Uri r4 = this.b;
        if (r3 == true) goto L5;
    L8:
        r1.a0 = r2;
        r1.d0 = r6;
        r1.b0 = r4;
        r1.e0 = this.c;
        r1.c0 = true;
        r1.n();
        return;
    L5:
        if (Objects.equals(r1.b0, r4) == false) goto L8;
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        lq2 r2 = this.d;
        r2.c0 = false;
        r2.d0 = null;
        r2.e0 = 0;
    }
}
