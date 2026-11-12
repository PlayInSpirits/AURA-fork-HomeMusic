package defpackage;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ss implements w04 {
    public static final ab3 o = ab3.a(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");
    public static final ab3 p = new ab3("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, ab3.e);
    public final qj0 n;

    public ss(qj0 qj0Var) {
        this.n = qj0Var;
    }

    @Override // defpackage.c11
    public final boolean i(Object obj, File file, db3 db3Var) throws Throwable {
        boolean z;
        Bitmap bitmap = (Bitmap) ((q04) obj).get();
        ab3 ab3Var = p;
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) db3Var.c(ab3Var);
        if (compressFormat == null) {
            compressFormat = bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        int i = ee2.b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        int iIntValue = ((Integer) db3Var.c(o)).intValue();
        OutputStream dwVar = null;
        try {
            try {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    qj0 qj0Var = this.n;
                    if (qj0Var != null) {
                        try {
                            dwVar = new dw(fileOutputStream, qj0Var);
                        } catch (IOException e) {
                            e = e;
                            dwVar = fileOutputStream;
                            if (Log.isLoggable("BitmapEncoder", 3)) {
                                Log.d("BitmapEncoder", "Failed to encode Bitmap", e);
                            }
                            if (dwVar != null) {
                                try {
                                    dwVar.close();
                                } catch (IOException unused) {
                                }
                            }
                            z = false;
                        } catch (Throwable th) {
                            th = th;
                            dwVar = fileOutputStream;
                            if (dwVar != null) {
                                try {
                                    dwVar.close();
                                } catch (IOException unused2) {
                                }
                            }
                            throw th;
                        }
                    } else {
                        dwVar = fileOutputStream;
                    }
                    bitmap.compress(compressFormat, iIntValue, dwVar);
                    dwVar.close();
                    try {
                        dwVar.close();
                    } catch (IOException unused3) {
                    }
                    z = true;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e2) {
                e = e2;
            }
            if (Log.isLoggable("BitmapEncoder", 2)) {
                Log.v("BitmapEncoder", "Compressed with type: " + compressFormat + " of size " + e35.v(bitmap) + " in " + ee2.a(jElapsedRealtimeNanos) + ", options format: " + db3Var.c(ab3Var) + ", hasAlpha: " + bitmap.hasAlpha());
            }
            return z;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // defpackage.w04
    public final int l(db3 db3Var) {
        return 2;
    }
}
