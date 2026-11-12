package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.util.Log;
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
public final class mp2 extends AsyncTask {
    public final Bitmap a;
    public final Uri b;
    public int c;
    public long d;
    public final /* synthetic */ qp2 e;

    public mp2(qp2 qp2Var) {
        this.e = qp2Var;
        MediaDescriptionCompat mediaDescriptionCompat = qp2Var.h0;
        Bitmap bitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.r;
        if (bitmap != null && bitmap.isRecycled()) {
            Log.w("MediaRouteCtrlDialog", "Can't fetch the given art bitmap because it's already recycled.");
            bitmap = null;
        }
        this.a = bitmap;
        MediaDescriptionCompat mediaDescriptionCompat2 = qp2Var.h0;
        this.b = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.s : null;
    }

    public final BufferedInputStream a(Uri uri) throws IOException {
        InputStream inputStreamOpenInputStream;
        String lowerCase = uri.getScheme().toLowerCase();
        if ("android.resource".equals(lowerCase) || "content".equals(lowerCase) || "file".equals(lowerCase)) {
            inputStreamOpenInputStream = this.e.x.getContentResolver().openInputStream(uri);
        } else {
            URLConnection uRLConnectionOpenConnection = new URL(uri.toString()).openConnection();
            int i = qp2.B0;
            uRLConnectionOpenConnection.setConnectTimeout(i);
            uRLConnectionOpenConnection.setReadTimeout(i);
            inputStreamOpenInputStream = uRLConnectionOpenConnection.getInputStream();
        }
        if (inputStreamOpenInputStream == null) {
            return null;
        }
        return new BufferedInputStream(inputStreamOpenInputStream);
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x002f: MOVE (r3 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:48), block:B:14:0x002f */
    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) throws Throwable {
        InputStream inputStream;
        BufferedInputStream bufferedInputStreamA;
        InputStream inputStream2 = null;
        Bitmap bitmapDecodeStream = this.a;
        if (bitmapDecodeStream == null) {
            Uri uri = this.b;
            try {
                if (uri != null) {
                    try {
                        bufferedInputStreamA = a(uri);
                        try {
                            try {
                                if (bufferedInputStreamA == null) {
                                    Log.w("MediaRouteCtrlDialog", "Unable to open: " + uri);
                                    if (bufferedInputStreamA != null) {
                                    }
                                    return null;
                                }
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inJustDecodeBounds = true;
                                BitmapFactory.decodeStream(bufferedInputStreamA, null, options);
                                if (options.outWidth != 0 && options.outHeight != 0) {
                                    try {
                                        bufferedInputStreamA.reset();
                                    } catch (IOException unused) {
                                        bufferedInputStreamA.close();
                                        bufferedInputStreamA = a(uri);
                                        if (bufferedInputStreamA == null) {
                                            Log.w("MediaRouteCtrlDialog", "Unable to open: " + uri);
                                            if (bufferedInputStreamA == null) {
                                                return null;
                                            }
                                        }
                                        bufferedInputStreamA.close();
                                        return null;
                                    }
                                    options.inJustDecodeBounds = false;
                                    options.inSampleSize = Math.max(1, Integer.highestOneBit(options.outHeight / this.e.o(options.outWidth, options.outHeight)));
                                    if (isCancelled()) {
                                        bufferedInputStreamA.close();
                                        return null;
                                    }
                                    bitmapDecodeStream = BitmapFactory.decodeStream(bufferedInputStreamA, null, options);
                                    try {
                                        bufferedInputStreamA.close();
                                    } catch (IOException unused2) {
                                    }
                                }
                                bufferedInputStreamA.close();
                                return null;
                            } catch (IOException unused3) {
                                return null;
                            }
                        } catch (IOException e) {
                            e = e;
                            Log.w("MediaRouteCtrlDialog", "Unable to open: " + uri, e);
                            if (bufferedInputStreamA != null) {
                                try {
                                    bufferedInputStreamA.close();
                                } catch (IOException unused4) {
                                }
                            }
                            bitmapDecodeStream = null;
                        }
                    } catch (IOException e2) {
                        e = e2;
                        bufferedInputStreamA = null;
                    } catch (Throwable th) {
                        th = th;
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (IOException unused5) {
                            }
                        }
                        throw th;
                    }
                } else {
                    bitmapDecodeStream = null;
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream2 = inputStream;
            }
        }
        if (bitmapDecodeStream != null && bitmapDecodeStream.isRecycled()) {
            Log.w("MediaRouteCtrlDialog", "Can't use recycled bitmap: " + bitmapDecodeStream);
            return null;
        }
        if (bitmapDecodeStream != null && bitmapDecodeStream.getWidth() < bitmapDecodeStream.getHeight()) {
            g01 g01Var = new g01(bitmapDecodeStream);
            g01Var.a = 1;
            List list = (List) g01Var.a().n;
            this.c = Collections.unmodifiableList(list).isEmpty() ? 0 : ((nd3) Collections.unmodifiableList(list).get(0)).d;
        }
        return bitmapDecodeStream;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        qp2 qp2Var = this.e;
        qp2Var.i0 = null;
        Bitmap bitmap2 = qp2Var.j0;
        Bitmap bitmap3 = this.a;
        boolean zEquals = Objects.equals(bitmap2, bitmap3);
        Uri uri = this.b;
        if (zEquals && Objects.equals(qp2Var.k0, uri)) {
            return;
        }
        qp2Var.j0 = bitmap3;
        qp2Var.m0 = bitmap;
        qp2Var.k0 = uri;
        qp2Var.n0 = this.c;
        qp2Var.l0 = true;
        qp2Var.t(SystemClock.uptimeMillis() - this.d > 120);
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        this.d = SystemClock.uptimeMillis();
        qp2 qp2Var = this.e;
        qp2Var.l0 = false;
        qp2Var.m0 = null;
        qp2Var.n0 = 0;
    }
}
