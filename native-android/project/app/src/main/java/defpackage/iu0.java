package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.concurrent.locks.Lock;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class iu0 {
    public static final ab3 f = null;
    public static final ab3 g = null;
    public static final ab3 h = null;
    public static final ab3 i = null;
    public static final om0 j = null;
    public static final ArrayDeque k = null;
    public final zs a;
    public final DisplayMetrics b;
    public final qj0 c;
    public final ArrayList d;
    public final ll1 e;

    static {
        f = ab3.a(vi0.p, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");
        g = new ab3("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, ab3.e);
        gu0 r0 = gu0.b;
        Boolean r1 = Boolean.FALSE;
        h = ab3.a(r1, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        i = ab3.a(r1, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"image/vnd.wap.wbmp", "image/x-ico"})));
        j = new om0(10);
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        k = new ArrayDeque(0);
    }

    public iu0(ArrayList r2, DisplayMetrics r3, zs r4, qj0 r5) {
        this.e = ll1.a();
        this.d = r2;
        h12.f(r3, "Argument must not be null");
        this.b = r3;
        h12.f(r4, "Argument must not be null");
        this.a = r4;
        h12.f(r5, "Argument must not be null");
        this.c = r5;
    }

    public static Bitmap c(aw1 r9, BitmapFactory.Options r10, hu0 r11, zs r12) {
        if (r10.inJustDecodeBounds == true) goto L5;
        r11.x();
        r9.k();
    L5:
        int r1 = r10.outWidth;
        int r2 = r10.outHeight;
        String r3 = r10.outMimeType;
        Lock r4 = xw4.b;
        r4.lock();
        Bitmap r13 = r9.i(r10);     // Catch: IllegalArgumentException -> L9 Throwable -> L20
        r4.unlock();
        return r13;
    L9:
        e = move-exception;
        StringBuilder r5 = b11.t("Exception decoding bitmap, outWidth: ", ", outHeight: ", r1, r2, ", outMimeType: ");     // Catch: Throwable -> L20
        r5.append(r3);     // Catch: Throwable -> L20
        r5.append(", inBitmap: ");     // Catch: Throwable -> L20
        r5.append(d(r10.inBitmap));     // Catch: Throwable -> L20
        IOException r6 = new IOException(r5.toString(), e);     // Catch: Throwable -> L20
        if (Log.isLoggable("Downsampler", 3) == false) goto L13;
        Log.d("Downsampler", "Failed to decode with inBitmap, trying again without Bitmap re-use", r6);     // Catch: Throwable -> L20
    L13:
        Bitmap r0 = r10.inBitmap;     // Catch: Throwable -> L20
        if (r0 != null) goto L25;
        throw r6;     // Catch: Throwable -> L20
    L25:
        r12.d(r0);     // Catch: IOException -> L18 Throwable -> L20
        r10.inBitmap = null;     // Catch: IOException -> L18 Throwable -> L20
        Bitmap r14 = c(r9, r10, r11, r12);     // Catch: IOException -> L18 Throwable -> L20
        xw4.b.unlock();
        return r14;
    L27:
        throw r6;     // Catch: Throwable -> L20
    L18:
        throw r6;     // Catch: Throwable -> L20
    L20:
        th = move-exception;
        xw4.b.unlock();
        throw th;
    }

    public static String d(Bitmap r3) {
        if (r3 != null) goto L6;
        return null;
    L6:
        return "[" + r3.getWidth() + "x" + r3.getHeight() + "] " + r3.getConfig() + (" (" + r3.getAllocationByteCount() + ")");
    }

    public static void e(BitmapFactory.Options r5) {
        r5.inTempStorage = null;
        r5.inDither = false;
        r5.inScaled = false;
        r5.inSampleSize = 1;
        r5.inPreferredConfig = null;
        r5.inJustDecodeBounds = false;
        r5.inDensity = 0;
        r5.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT < 26) goto L5;
        gm0.r(r5);
        gm0.A(r5);
        gm0.D(r5);
    L5:
        r5.outWidth = 0;
        r5.outHeight = 0;
        r5.outMimeType = null;
        r5.inBitmap = null;
        r5.inMutable = true;
    }

    public final at a(aw1 r15, int r16, int r17, db3 r18, hu0 r19) {
        byte[] r12 = (byte[]) this.c.d(65536, byte[].class);
        monitor-enter(iu0.class);
        ArrayDeque r13 = k;     // Catch: Throwable -> L11
        monitor-enter(r13);     // Catch: Throwable -> L11
        BitmapFactory.Options r3 = (BitmapFactory.Options) r13.poll();     // Catch: Throwable -> L41
        monitor-exit(r13);     // Catch: Throwable -> L41
        if (r3 != null) goto L13;
        r3 = new BitmapFactory.Options();     // Catch: Throwable -> L11
        e(r3);     // Catch: Throwable -> L11
    L13:
        monitor-exit(iu0.class);
        r3.inTempStorage = r12;
        vi0 r5 = (vi0) r18.c(f);
        tp3 r6 = (tp3) r18.c(g);
        gu0 r4 = (gu0) r18.c(gu0.g);
        boolean r10 = ((Boolean) r18.c(h)).booleanValue();
        ab3 r2 = i;
        if (r18.c(r2) != null) goto L17;
    L20:
        boolean r0 = false;
    L46:
        Bitmap r1 = b(r15, r3, r4, r5, r6, r0, r16, r17, r10, r19);     // Catch: Throwable -> L31
        at r7 = at.c(this.a, r1);     // Catch: Throwable -> L31
        e(r3);
        monitor-enter(r13);
        r13.offer(r3);     // Catch: Throwable -> L28
        monitor-exit(r13);     // Catch: Throwable -> L28
        this.c.h(r12);
        return r7;
    L28:
        th = move-exception;
        throw th;
    L31:
        th = move-exception;
        e(r3);
        ArrayDeque r8 = k;
        monitor-enter(r8);
        r8.offer(r3);     // Catch: Throwable -> L38
        this.c.h(r12);
        throw th;
    L38:
        th = move-exception;
        throw th;
    L17:
        if (((Boolean) r18.c(r2)).booleanValue() == false) goto L20;
        r0 = true;
        goto L46
    L41:
        th = move-exception;
        throw th;     // Catch: Throwable -> L11
    L11:
        th = move-exception;
        throw th;
    }

    public final Bitmap b(aw1 r42, BitmapFactory.Options r43, gu0 r44, vi0 r45, tp3 r46, boolean r47, int r48, int r49, boolean r50, hu0 r51) {
        int r9 = ee2.b;
        long r10 = SystemClock.elapsedRealtimeNanos();
        r43.inJustDecodeBounds = true;
        zs r12 = this.a;
        c(r42, r43, r51, r12);
        r43.inJustDecodeBounds = false;
        int[] r14 = {r43.outWidth, r43.outHeight};
        int r15 = r14[0];
        int r16 = r14[1];
        String r13 = r43.outMimeType;
        if (r15 == (-1)) goto L7;
        if (r16 == (-1)) goto L7;
        boolean r11 = r47;
    L8:
        int r17 = r42.c();
        switch(r17) {
            case 3: goto L13;
            case 4: goto L13;
            case 5: goto L12;
            case 6: goto L12;
            case 7: goto L11;
            case 8: goto L11;
            default: goto L10;
        };
    L10:
        int r18 = 0;
    L14:
        switch(r17) {
            case 2: goto L17;
            case 3: goto L17;
            case 4: goto L17;
            case 5: goto L17;
            case 6: goto L17;
            case 7: goto L17;
            case 8: goto L17;
            default: goto L15;
        };
    L15:
        boolean r20 = false;
    L19:
        if (r48 != Integer.MIN_VALUE) goto L27;
        if (r18 == 90) goto L25;
        int r19 = 270;
        if (r18 == 270) goto L26;
        int r22 = r15;
    L28:
        if (r49 == Integer.MIN_VALUE) goto L30;
        int r21 = r49;
    L36:
        ImageHeaderParser$ImageType r110 = r42.l();
        boolean r26 = r11;
        if (r15 <= 0) goto L39;
        if (r16 <= 0) goto L39;
        if (r18 != 90) goto L43;
    L47:
        int r111 = r16;
        int r6 = r15;
    L46:
        int r1 = r22;
        float r7 = r44.b(r111, r6, r1, r21);
        if (r7 <= 0.0f) goto L106;
        int r8 = r44.a(r111, r6, r1, r21);
        if (r8 == 0) goto L103;
        int r28 = r18;
        float r112 = r111;
        int r29 = r111;
        float r113 = r6;
        int r32 = r6;
        int r23 = (int) (((double) (r7 * r113)) + 0.5d);
        int r114 = r29 / ((int) (((double) (r7 * r112)) + 0.5d));
        int r24 = r32 / r23;
        if (r8 != 1) goto L55;
        int r25 = Math.max(r114, r24);
    L56:
        int r27 = Math.max(1, Integer.highestOneBit(r25));
        if (r8 == 1) goto L59;
    L61:
        r43.inSampleSize = r27;
        if (r110 != ImageHeaderParser$ImageType.JPEG) goto L67;
        float r30 = Math.min(r27, 8);
        float r115 = r113 / r30;
        int r31 = (int) Math.ceil(r112 / r30);
        int r116 = (int) Math.ceil(r115);
        int r117 = r27 / 8;
        if (r117 <= 0) goto L82;
        r31 = r31 / r117;
        r116 = r116 / r117;
    L82:
        int r40 = r116;
        int r118 = r31;
        int r33 = r40;
    L83:
        zs r210 = r12;
        double r119 = r44.b(r118, r33, r1, r21);
        if (r119 > 1.0d) goto L86;
        double r34 = r119;
    L87:
        int r120 = (int) Math.round(r34 * 2.147483647E9d);
        int r121 = (int) ((((double) r120) * r119) + 0.5d);
        float r122 = r121 / r120;
        int r123 = r27;
        int r35 = r33;
        r43.inTargetDensity = (int) (((r119 / ((double) r122)) * ((double) r121)) + 0.5d);
        if (r119 > 1.0d) goto L90;
        double r36 = r119;
    L91:
        int r0 = (int) Math.round(r36 * 2.147483647E9d);
        r43.inDensity = r0;
        int r37 = r43.inTargetDensity;
        if (r37 <= 0) goto L97;
        if (r0 <= 0) goto L97;
        if (r37 == r0) goto L97;
        r43.inScaled = true;
    L99:
        if (Log.isLoggable("Downsampler", 2) == false) goto L102;
        StringBuilder r2 = b11.t("Calculate scaling, source: [", "x", r15, r16, "], degreesToRotate: ");
        r2.append(r28);
        r2.append(", target: [");
        r2.append(r1);
        r2.append("x");
        r2.append(r21);
        r2.append("], power of two scaled: [");
        r2.append(r118);
        r2.append("x");
        r2.append(r35);
        r2.append("], exact scale factor: ");
        r2.append(r7);
        r2.append(", power of 2 sample size: ");
        r2.append(r123);
        r2.append(", adjusted scale factor: ");
        r2.append(r119);
        String r38 = ", target density: ";
        r2.append(r38);
        r2.append(r43.inTargetDensity);
        String r39 = ", density: ";
        r2.append(r39);
        r2.append(r43.inDensity);
        Log.v("Downsampler", r2.toString());
    L110:
        boolean r3 = this.e.c(r1, r21, r26, r20);
        if (r3 == false) goto L114;
        r43.inPreferredConfig = j3.D();
        r43.inMutable = false;
    L114:
        if (r3 == false) goto L117;
    L132:
        if (r15 < 0) goto L136;
        if (r16 < 0) goto L136;
        if (r50 == false) goto L136;
    L148:
        if (r1 <= 0) goto L160;
        if (r21 <= 0) goto L160;
        if (Build.VERSION.SDK_INT >= 26) goto L153;
        Bitmap.Config r124 = null;
    L157:
        if (r124 != null) goto L159;
        r124 = r43.inPreferredConfig;
    L159:
        zs r125 = r210;
        r43.inBitmap = r125.c(r1, r21, r124);
    L161:
        if (r46 == null) goto L175;
        int r4 = Build.VERSION.SDK_INT;
        if (r4 >= 28) goto L165;
        if (r4 < 26) goto L175;
        tn.A();
        gm0.s(r43, gm0.g());
        goto L175
    L165:
        if (r46 == tp3.n) goto L167;
    L171:
        ColorSpace.Named r5 = tn.A();
    L172:
        gm0.s(r43, tn.e(r5));
        goto L175
    L167:
        if (gm0.h(r43) == null) goto L171;
        if (tn.y(gm0.h(r43)) == false) goto L171;
        r5 = tn.d();
    L175:
        Bitmap r41 = c(r42, r43, r51, r125);
        r51.E(r125, r41);
        if (Log.isLoggable("Downsampler", 2) == false) goto L178;
        Log.v("Downsampler", "Decoded " + d(r41) + " from [" + r15 + "x" + r16 + "] " + r13 + " with inBitmap " + d(r43.inBitmap) + " for [" + r48 + "x" + r49 + "], sample size: " + r43.inSampleSize + r39 + r43.inDensity + r38 + r43.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + ee2.a(r10));
    L178:
        if (r41 == null) goto L204;
        r41.setDensity(this.b.densityDpi);
        switch(r17) {
            case 2: goto L182;
            case 3: goto L182;
            case 4: goto L182;
            case 5: goto L182;
            case 6: goto L182;
            case 7: goto L182;
            case 8: goto L182;
            default: goto L181;
        };
    L181:
        Bitmap r52 = r41;
    L198:
        if (r41.equals(r52) == true) goto L201;
        r125.d(r41);
    L201:
        return r52;
    L182:
        Matrix r53 = new Matrix();
        switch(r17) {
            case 2: goto L191;
            case 3: goto L190;
            case 4: goto L189;
            case 5: goto L188;
            case 6: goto L187;
            case 7: goto L186;
            case 8: goto L185;
            default: goto L192;
        };
    L185:
        r53.setRotate(-90.0f);
        goto L192
    L186:
        r53.setRotate(-90.0f);
        r53.postScale(-1.0f, 1.0f);
        goto L192
    L187:
        r53.setRotate(90.0f);
        goto L192
    L188:
        r53.setRotate(90.0f);
        r53.postScale(-1.0f, 1.0f);
        goto L192
    L189:
        r53.setRotate(180.0f);
        r53.postScale(-1.0f, 1.0f);
        goto L192
    L190:
        r53.setRotate(180.0f);
        goto L192
    L191:
        r53.setScale(-1.0f, 1.0f);
    L192:
        RectF r54 = new RectF(0.0f, 0.0f, r41.getWidth(), r41.getHeight());
        r53.mapRect(r54);
        int r55 = Math.round(r54.width());
        int r56 = Math.round(r54.height());
        if (r41.getConfig() == null) goto L195;
        Bitmap.Config r57 = r41.getConfig();
    L196:
        r52 = r125.h(r55, r56, r57);
        r53.postTranslate(-r54.left, -r54.top);
        r52.setHasAlpha(r41.hasAlpha());
        xw4.a(r41, r52, r53);
        goto L198
    L195:
        r57 = Bitmap.Config.ARGB_8888;
        goto L196
    L204:
        return null;
    L153:
        if (r43.inPreferredConfig == j3.D()) goto L160;
        r124 = gm0.f(r43);
    L160:
        r125 = r210;
    L136:
        int r58 = r43.inTargetDensity;
        if (r58 <= 0) goto L142;
        int r59 = r43.inDensity;
        if (r59 <= 0) goto L142;
        if (r58 == r59) goto L142;
        float r60 = r58 / r59;
    L143:
        int r61 = r43.inSampleSize;
        float r126 = r61;
        int r62 = (int) Math.ceil(r15 / r126);
        int r127 = (int) Math.ceil(r16 / r126);
        int r63 = Math.round(r62 * r60);
        int r128 = Math.round(r127 * r60);
        if (Log.isLoggable("Downsampler", 2) == false) goto L146;
        StringBuilder r129 = b11.t("Calculated target [", "x", r63, r128, "] for source [");
        r129.append(r15);
        r129.append("x");
        r129.append(r16);
        r129.append("], sampleSize: ");
        r129.append(r61);
        r129.append(", targetDensity: ");
        r129.append(r43.inTargetDensity);
        r129.append(r39);
        r129.append(r43.inDensity);
        r129.append(", density multiplier: ");
        r129.append(r60);
        Log.v("Downsampler", r129.toString());
    L146:
        r1 = r63;
        r21 = r128;
    L142:
        r60 = 1.0f;
        goto L143
    L117:
        if (r45 != vi0.n) goto L202;
        r43.inPreferredConfig = Bitmap.Config.ARGB_8888;
        goto L132
    L202:
        boolean r130 = r42.l().hasAlpha();     // Catch: IOException -> L120
    L125:
        if (r130 == false) goto L127;
        Bitmap.Config r64 = Bitmap.Config.ARGB_8888;
    L128:
        r43.inPreferredConfig = r64;
        if (r64 != Bitmap.Config.RGB_565) goto L132;
        r43.inDither = true;
        goto L132
    L127:
        r64 = Bitmap.Config.RGB_565;
    L120:
        e = move-exception;
        if (Log.isLoggable("Downsampler", 3) == false) goto L124;
        Log.d("Downsampler", "Cannot determine whether the image has alpha or not from header, format " + r45, e);
    L124:
        r130 = false;
        goto L125
    L102:
        r39 = r6;
        r38 = ", target density: ";
    L97:
        r43.inTargetDensity = 0;
        r43.inDensity = 0;
        goto L99
    L90:
        r36 = 1.0d / r119;
        goto L91
    L86:
        r34 = 1.0d / r119;
        goto L87
    L67:
        if (r110 != ImageHeaderParser$ImageType.PNG) goto L69;
    L81:
        float r65 = r27;
        float r131 = r113 / r65;
        r31 = (int) Math.floor(r112 / r65);
        r116 = (int) Math.floor(r131);
        goto L82
    L69:
        if (r110 == ImageHeaderParser$ImageType.PNG_A) goto L81;
        if (r110.isWebp() == false) goto L75;
        float r66 = r27;
        r118 = Math.round(r112 / r66);
        r33 = Math.round(r113 / r66);
        goto L83
    L75:
        if ((r29 % r27) != 0) goto L80;
        if ((r32 % r27) != 0) goto L80;
        r118 = r29 / r27;
        r33 = r32 / r27;
    L80:
        r43.inJustDecodeBounds = true;
        c(r42, r43, r51, r12);
        r43.inJustDecodeBounds = false;
        int[] r132 = {r43.outWidth, r43.outHeight};
        int r133 = r132[0];
        r33 = r132[1];
        r118 = r133;
        goto L83
    L59:
        if (r27 >= (1.0f / r7)) goto L61;
        r27 = r27 << 1;
        goto L61
    L55:
        r25 = Math.min(r114, r24);
        goto L56
    L103:
        kf2.n("Cannot round with null rounding");
        return null;
    L106:
        throw new IllegalArgumentException("Cannot scale with factor: " + r7 + " from: " + r44 + ", source: [" + r15 + "x" + r16 + "], target: [" + r1 + "x" + r21 + "]");
    L43:
        if (r18 == 270) goto L47;
        r6 = r16;
        r111 = r15;
    L39:
        r39 = ", density: ";
        r38 = ", target density: ";
        r210 = r12;
        r1 = r22;
        if (Log.isLoggable("Downsampler", 3) == false) goto L110;
        Log.d("Downsampler", "Unable to determine dimensions for: " + r110 + " with target [" + r1 + "x" + r21 + "]");
        goto L110
    L30:
        if (r18 == 90) goto L34;
        if (r18 == r19) goto L34;
        r21 = r16;
    L34:
        r21 = r15;
    L26:
        r22 = r16;
        goto L28
    L25:
        r19 = 270;
        goto L26
    L27:
        r19 = 270;
        r22 = r48;
        goto L28
    L17:
        r20 = true;
        goto L19
    L11:
        r18 = 270;
        goto L14
    L12:
        r18 = 90;
        goto L14
    L13:
        r18 = 180;
    L7:
        r11 = false;
        goto L8
    }
}
