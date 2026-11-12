package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xw4 {
    public static final Paint a = null;
    public static final Lock b = null;

    static {
        a = new Paint(6);
        new Paint(7);
        if (new HashSet(Arrays.asList(new String[]{"XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"})).contains(Build.MODEL) == false) goto L5;
        Lock r0 = new ReentrantLock();
    L6:
        b = r0;
        new Paint(7).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        return;
    L5:
        r0 = new ww4();
        goto L6
    }

    public static void a(Bitmap r2, Bitmap r3, Matrix r4) {
        Lock r0 = b;
        r0.lock();
        Canvas r1 = new Canvas(r3);     // Catch: Throwable -> L6
        r1.drawBitmap(r2, r4, a);     // Catch: Throwable -> L6
        r1.setBitmap(null);     // Catch: Throwable -> L6
        r0.unlock();
        return;
    L6:
        th = move-exception;
        r0.unlock();
        throw th;
    }

    public static Bitmap b(zs r6, Bitmap r7, int r8, int r9) {
        if (r7.getWidth() == r8) goto L5;
    L10:
        float r0 = Math.min(r8 / r7.getWidth(), r9 / r7.getHeight());
        int r3 = Math.round(r7.getWidth() * r0);
        int r4 = Math.round(r7.getHeight() * r0);
        if (r7.getWidth() == r3) goto L13;
    L18:
        int r5 = (int) (r7.getWidth() * r0);
        int r10 = (int) (r7.getHeight() * r0);
        if (r7.getConfig() == null) goto L21;
        Bitmap.Config r11 = r7.getConfig();
    L22:
        Bitmap r12 = r6.h(r5, r10, r11);
        r12.setHasAlpha(r7.hasAlpha());
        if (Log.isLoggable("TransformationUtils", 2) == false) goto L25;
        Log.v("TransformationUtils", "request: " + r8 + "x" + r9);
        Log.v("TransformationUtils", "toFit:   " + r7.getWidth() + "x" + r7.getHeight());
        Log.v("TransformationUtils", "toReuse: " + r12.getWidth() + "x" + r12.getHeight());
        StringBuilder r13 = new StringBuilder("minPct:   ");
        r13.append(r0);
        Log.v("TransformationUtils", r13.toString());
    L25:
        Matrix r14 = new Matrix();
        r14.setScale(r0, r0);
        a(r7, r12, r14);
        return r12;
    L21:
        r11 = Bitmap.Config.ARGB_8888;
        goto L22
    L13:
        if (r7.getHeight() != r4) goto L18;
        if (Log.isLoggable("TransformationUtils", 2) == false) goto L17;
        Log.v("TransformationUtils", "adjusted target size matches input, returning input");
    L17:
        return r7;
    L5:
        if (r7.getHeight() != r9) goto L10;
        if (Log.isLoggable("TransformationUtils", 2) == false) goto L17;
        Log.v("TransformationUtils", "requested target size matches input, returning input");
        return r7;
    }

    public static Bitmap c(zs r9, Bitmap r10, vw4 r11) {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 >= 26) goto L5;
    L7:
        Bitmap.Config r2 = Bitmap.Config.ARGB_8888;
    L8:
        if (r0 >= 26) goto L10;
    L12:
        Bitmap.Config r1 = Bitmap.Config.ARGB_8888;
    L14:
        if (r1.equals(r10.getConfig()) == false) goto L16;
        Bitmap r3 = r10;
    L17:
        Bitmap r4 = r9.h(r3.getWidth(), r3.getHeight(), r2);
        r4.setHasAlpha(true);
        Shader.TileMode r6 = Shader.TileMode.CLAMP;
        BitmapShader r5 = new BitmapShader(r3, r6, r6);
        Paint r7 = new Paint();
        r7.setAntiAlias(true);
        r7.setShader(r5);
        RectF r8 = new RectF(0.0f, 0.0f, r4.getWidth(), r4.getHeight());
        Lock r12 = b;
        r12.lock();
        Canvas r13 = new Canvas(r4);     // Catch: Throwable -> L23
        r13.drawColor(0, PorterDuff.Mode.CLEAR);     // Catch: Throwable -> L23
        r11.a(r13, r7, r8);     // Catch: Throwable -> L23
        r13.setBitmap(null);     // Catch: Throwable -> L23
        r12.unlock();
        if (r3.equals(r10) == true) goto L22;
        r9.d(r3);
    L22:
        return r4;
    L23:
        th = move-exception;
        r12.unlock();
        throw th;
    L16:
        r3 = r9.h(r10.getWidth(), r10.getHeight(), r1);
        new Canvas(r3).drawBitmap(r10, 0.0f, 0.0f, null);
        goto L17
    L10:
        if (j3.d().equals(r10.getConfig()) == false) goto L12;
        r1 = j3.d();
        goto L14
    L5:
        if (j3.d().equals(r10.getConfig()) == false) goto L7;
        r2 = j3.d();
        goto L8
    }
}
