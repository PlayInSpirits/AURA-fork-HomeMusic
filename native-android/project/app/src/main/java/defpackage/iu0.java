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
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class iu0 {
    public static final ab3 f = ab3.a(vi0.p, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");
    public static final ab3 g = new ab3("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, ab3.e);
    public static final ab3 h;
    public static final ab3 i;
    public static final om0 j;
    public static final ArrayDeque k;
    public final zs a;
    public final DisplayMetrics b;
    public final qj0 c;
    public final ArrayList d;
    public final ll1 e = ll1.a();

    static {
        gu0 gu0Var = gu0.b;
        Boolean bool = Boolean.FALSE;
        h = ab3.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        i = ab3.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        j = new om0(10);
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        k = new ArrayDeque(0);
    }

    public iu0(ArrayList arrayList, DisplayMetrics displayMetrics, zs zsVar, qj0 qj0Var) {
        this.d = arrayList;
        h12.f(displayMetrics, "Argument must not be null");
        this.b = displayMetrics;
        h12.f(zsVar, "Argument must not be null");
        this.a = zsVar;
        h12.f(qj0Var, "Argument must not be null");
        this.c = qj0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
    
        throw r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap c(aw1 aw1Var, BitmapFactory.Options options, hu0 hu0Var, zs zsVar) {
        if (!options.inJustDecodeBounds) {
            hu0Var.x();
            aw1Var.k();
        }
        int i2 = options.outWidth;
        int i3 = options.outHeight;
        String str = options.outMimeType;
        Lock lock = xw4.b;
        lock.lock();
        try {
            try {
                Bitmap bitmapI = aw1Var.i(options);
                lock.unlock();
                return bitmapI;
            } catch (IllegalArgumentException e) {
                StringBuilder sbT = b11.t("Exception decoding bitmap, outWidth: ", ", outHeight: ", i2, i3, ", outMimeType: ");
                sbT.append(str);
                sbT.append(", inBitmap: ");
                sbT.append(d(options.inBitmap));
                IOException iOException = new IOException(sbT.toString(), e);
                if (Log.isLoggable("Downsampler", 3)) {
                    Log.d("Downsampler", "Failed to decode with inBitmap, trying again without Bitmap re-use", iOException);
                }
                Bitmap bitmap = options.inBitmap;
                if (bitmap == null) {
                    throw iOException;
                }
                try {
                    zsVar.d(bitmap);
                    options.inBitmap = null;
                    Bitmap bitmapC = c(aw1Var, options, hu0Var, zsVar);
                    xw4.b.unlock();
                    return bitmapC;
                } catch (IOException unused) {
                    throw iOException;
                }
            }
        } catch (Throwable th) {
            xw4.b.unlock();
            throw th;
        }
    }

    public static String d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    public static void e(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public final at a(aw1 aw1Var, int i2, int i3, db3 db3Var, hu0 hu0Var) {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options;
        byte[] bArr = (byte[]) this.c.d(65536, byte[].class);
        synchronized (iu0.class) {
            arrayDeque = k;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                e(options);
            }
        }
        options.inTempStorage = bArr;
        vi0 vi0Var = (vi0) db3Var.c(f);
        tp3 tp3Var = (tp3) db3Var.c(g);
        gu0 gu0Var = (gu0) db3Var.c(gu0.g);
        boolean zBooleanValue = ((Boolean) db3Var.c(h)).booleanValue();
        ab3 ab3Var = i;
        try {
            at atVarC = at.c(this.a, b(aw1Var, options, gu0Var, vi0Var, tp3Var, db3Var.c(ab3Var) != null && ((Boolean) db3Var.c(ab3Var)).booleanValue(), i2, i3, zBooleanValue, hu0Var));
            e(options);
            synchronized (arrayDeque) {
                arrayDeque.offer(options);
            }
            return atVarC;
        } finally {
            e(options);
            ArrayDeque arrayDeque2 = k;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options);
                this.c.h(bArr);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:102:0x024e  */
    /* JADX WARN: Code duplicated, block: B:160:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:85:0x0197  */
    /* JADX WARN: Code duplicated, block: B:86:0x019a  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:97:0x01dd  */
    public final Bitmap b(aw1 aw1Var, BitmapFactory.Options options, gu0 gu0Var, vi0 vi0Var, tp3 tp3Var, boolean z, int i2, int i3, boolean z2, hu0 hu0Var) {
        int i4;
        boolean z3;
        int i5;
        int i6;
        int i7;
        String str;
        String str2;
        zs zsVar;
        int i8;
        int i9;
        zs zsVar2;
        Bitmap bitmapH;
        Bitmap.Config config;
        boolean zHasAlpha;
        int i10;
        int i11;
        int iFloor;
        int iFloor2;
        int iRound;
        int iRound2;
        double dB;
        double d;
        int i12;
        int i13;
        double d2;
        int i14;
        int i15 = ee2.b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        options.inJustDecodeBounds = true;
        zs zsVar3 = this.a;
        c(aw1Var, options, hu0Var, zsVar3);
        options.inJustDecodeBounds = false;
        int[] iArr = {options.outWidth, options.outHeight};
        int i16 = iArr[0];
        int i17 = iArr[1];
        String str3 = options.outMimeType;
        boolean z4 = (i16 == -1 || i17 == -1) ? false : z;
        int iC = aw1Var.c();
        switch (iC) {
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
            case 4:
                i4 = 180;
                break;
            case 5:
            case 6:
                i4 = 90;
                break;
            case 7:
            case 8:
                i4 = 270;
                break;
            default:
                i4 = 0;
                break;
        }
        switch (iC) {
            case 2:
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                z3 = true;
                break;
            default:
                z3 = false;
                break;
        }
        if (i2 == Integer.MIN_VALUE) {
            if (i4 != 90) {
                i5 = 270;
                if (i4 != 270) {
                    i6 = i16;
                }
            } else {
                i5 = 270;
            }
            i6 = i17;
        } else {
            i5 = 270;
            i6 = i2;
        }
        if (i3 == Integer.MIN_VALUE) {
            i7 = (i4 == 90 || i4 == i5) ? i16 : i17;
        } else {
            i7 = i3;
        }
        ImageHeaderParser$ImageType imageHeaderParser$ImageTypeL = aw1Var.l();
        boolean z5 = z4;
        if (i16 <= 0 || i17 <= 0) {
            str = ", density: ";
            str2 = ", target density: ";
            zsVar = zsVar3;
            i8 = i6;
            if (Log.isLoggable("Downsampler", 3)) {
                Log.d("Downsampler", "Unable to determine dimensions for: " + imageHeaderParser$ImageTypeL + " with target [" + i8 + "x" + i7 + "]");
            }
        } else {
            if (i4 == 90 || i4 == 270) {
                i10 = i17;
                i11 = i16;
            } else {
                i11 = i17;
                i10 = i16;
            }
            i8 = i6;
            float fB = gu0Var.b(i10, i11, i8, i7);
            if (fB <= 0.0f) {
                throw new IllegalArgumentException("Cannot scale with factor: " + fB + " from: " + gu0Var + ", source: [" + i16 + "x" + i17 + "], target: [" + i8 + "x" + i7 + "]");
            }
            int iA = gu0Var.a(i10, i11, i8, i7);
            if (iA == 0) {
                kf2.n("Cannot round with null rounding");
                return null;
            }
            int i18 = i4;
            float f2 = i10;
            int i19 = i10;
            float f3 = i11;
            int i20 = i11;
            int i21 = (int) (((double) (fB * f3)) + 0.5d);
            int i22 = i19 / ((int) (((double) (fB * f2)) + 0.5d));
            int i23 = i20 / i21;
            int iMax = Math.max(1, Integer.highestOneBit(iA == 1 ? Math.max(i22, i23) : Math.min(i22, i23)));
            if (iA == 1 && iMax < 1.0f / fB) {
                iMax <<= 1;
            }
            options.inSampleSize = iMax;
            if (imageHeaderParser$ImageTypeL == ImageHeaderParser$ImageType.JPEG) {
                float fMin = Math.min(iMax, 8);
                float f4 = f3 / fMin;
                iFloor = (int) Math.ceil(f2 / fMin);
                iFloor2 = (int) Math.ceil(f4);
                int i24 = iMax / 8;
                if (i24 > 0) {
                    iFloor /= i24;
                    iFloor2 /= i24;
                }
            } else {
                if (imageHeaderParser$ImageTypeL == ImageHeaderParser$ImageType.PNG || imageHeaderParser$ImageTypeL == ImageHeaderParser$ImageType.PNG_A) {
                    float f5 = iMax;
                    float f6 = f3 / f5;
                    iFloor = (int) Math.floor(f2 / f5);
                    iFloor2 = (int) Math.floor(f6);
                } else if (imageHeaderParser$ImageTypeL.isWebp()) {
                    float f7 = iMax;
                    iRound2 = Math.round(f2 / f7);
                    iRound = Math.round(f3 / f7);
                } else if (i19 % iMax == 0 && i20 % iMax == 0) {
                    iRound2 = i19 / iMax;
                    iRound = i20 / iMax;
                } else {
                    options.inJustDecodeBounds = true;
                    c(aw1Var, options, hu0Var, zsVar3);
                    options.inJustDecodeBounds = false;
                    int[] iArr2 = {options.outWidth, options.outHeight};
                    int i25 = iArr2[0];
                    iRound = iArr2[1];
                    iRound2 = i25;
                }
                zsVar = zsVar3;
                dB = gu0Var.b(iRound2, iRound, i8, i7);
                if (dB <= 1.0d) {
                    d = dB;
                } else {
                    d = 1.0d / dB;
                }
                int iRound3 = (int) Math.round(d * 2.147483647E9d);
                int i26 = (int) ((((double) iRound3) * dB) + 0.5d);
                float f8 = i26 / iRound3;
                i12 = iMax;
                i13 = iRound;
                options.inTargetDensity = (int) (((dB / ((double) f8)) * ((double) i26)) + 0.5d);
                if (dB <= 1.0d) {
                    d2 = dB;
                } else {
                    d2 = 1.0d / dB;
                }
                int iRound4 = (int) Math.round(d2 * 2.147483647E9d);
                options.inDensity = iRound4;
                i14 = options.inTargetDensity;
                if (i14 > 0 || iRound4 <= 0 || i14 == iRound4) {
                    options.inTargetDensity = 0;
                    options.inDensity = 0;
                } else {
                    options.inScaled = true;
                }
                if (Log.isLoggable("Downsampler", 2)) {
                    StringBuilder sbT = b11.t("Calculate scaling, source: [", "x", i16, i17, "], degreesToRotate: ");
                    sbT.append(i18);
                    sbT.append(", target: [");
                    sbT.append(i8);
                    sbT.append("x");
                    sbT.append(i7);
                    sbT.append("], power of two scaled: [");
                    sbT.append(iRound2);
                    sbT.append("x");
                    sbT.append(i13);
                    sbT.append("], exact scale factor: ");
                    sbT.append(fB);
                    sbT.append(", power of 2 sample size: ");
                    sbT.append(i12);
                    sbT.append(", adjusted scale factor: ");
                    sbT.append(dB);
                    str2 = ", target density: ";
                    sbT.append(str2);
                    sbT.append(options.inTargetDensity);
                    str = ", density: ";
                    sbT.append(str);
                    sbT.append(options.inDensity);
                    Log.v("Downsampler", sbT.toString());
                } else {
                    str = r6;
                    str2 = ", target density: ";
                }
            }
            int i27 = iFloor2;
            iRound2 = iFloor;
            iRound = i27;
            zsVar = zsVar3;
            dB = gu0Var.b(iRound2, iRound, i8, i7);
            if (dB <= 1.0d) {
                d = dB;
            } else {
                d = 1.0d / dB;
            }
            int iRound5 = (int) Math.round(d * 2.147483647E9d);
            int i28 = (int) ((((double) iRound5) * dB) + 0.5d);
            float f9 = i28 / iRound5;
            i12 = iMax;
            i13 = iRound;
            options.inTargetDensity = (int) (((dB / ((double) f9)) * ((double) i28)) + 0.5d);
            if (dB <= 1.0d) {
                d2 = dB;
            } else {
                d2 = 1.0d / dB;
            }
            int iRound6 = (int) Math.round(d2 * 2.147483647E9d);
            options.inDensity = iRound6;
            i14 = options.inTargetDensity;
            if (i14 > 0) {
                options.inTargetDensity = 0;
                options.inDensity = 0;
            } else {
                options.inTargetDensity = 0;
                options.inDensity = 0;
            }
            if (Log.isLoggable("Downsampler", 2)) {
                StringBuilder sbT2 = b11.t("Calculate scaling, source: [", "x", i16, i17, "], degreesToRotate: ");
                sbT2.append(i18);
                sbT2.append(", target: [");
                sbT2.append(i8);
                sbT2.append("x");
                sbT2.append(i7);
                sbT2.append("], power of two scaled: [");
                sbT2.append(iRound2);
                sbT2.append("x");
                sbT2.append(i13);
                sbT2.append("], exact scale factor: ");
                sbT2.append(fB);
                sbT2.append(", power of 2 sample size: ");
                sbT2.append(i12);
                sbT2.append(", adjusted scale factor: ");
                sbT2.append(dB);
                str2 = ", target density: ";
                sbT2.append(str2);
                sbT2.append(options.inTargetDensity);
                str = ", density: ";
                sbT2.append(str);
                sbT2.append(options.inDensity);
                Log.v("Downsampler", sbT2.toString());
            } else {
                str = r6;
                str2 = ", target density: ";
            }
        }
        boolean zC = this.e.c(i8, i7, z5, z3);
        if (zC) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        if (!zC) {
            if (vi0Var != vi0.n) {
                try {
                    zHasAlpha = aw1Var.l().hasAlpha();
                } catch (IOException e) {
                    if (Log.isLoggable("Downsampler", 3)) {
                        Log.d("Downsampler", "Cannot determine whether the image has alpha or not from header, format " + vi0Var, e);
                    }
                    zHasAlpha = false;
                }
                Bitmap.Config config2 = zHasAlpha ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
                options.inPreferredConfig = config2;
                if (config2 == Bitmap.Config.RGB_565) {
                    options.inDither = true;
                }
            } else {
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            }
        }
        if (i16 < 0 || i17 < 0 || !z2) {
            int i29 = options.inTargetDensity;
            float f10 = (i29 <= 0 || (i9 = options.inDensity) <= 0 || i29 == i9) ? 1.0f : i29 / i9;
            int i30 = options.inSampleSize;
            float f11 = i30;
            int iCeil = (int) Math.ceil(i16 / f11);
            int iCeil2 = (int) Math.ceil(i17 / f11);
            int iRound7 = Math.round(iCeil * f10);
            int iRound8 = Math.round(iCeil2 * f10);
            if (Log.isLoggable("Downsampler", 2)) {
                StringBuilder sbT3 = b11.t("Calculated target [", "x", iRound7, iRound8, "] for source [");
                sbT3.append(i16);
                sbT3.append("x");
                sbT3.append(i17);
                sbT3.append("], sampleSize: ");
                sbT3.append(i30);
                sbT3.append(", targetDensity: ");
                sbT3.append(options.inTargetDensity);
                sbT3.append(str);
                sbT3.append(options.inDensity);
                sbT3.append(", density multiplier: ");
                sbT3.append(f10);
                Log.v("Downsampler", sbT3.toString());
            }
            i8 = iRound7;
            i7 = iRound8;
        }
        if (i8 <= 0 || i7 <= 0) {
            zsVar2 = zsVar;
        } else {
            if (Build.VERSION.SDK_INT < 26) {
                config = null;
            } else if (options.inPreferredConfig == Bitmap.Config.HARDWARE) {
                zsVar2 = zsVar;
            } else {
                config = options.outConfig;
            }
            if (config == null) {
                config = options.inPreferredConfig;
            }
            zsVar2 = zsVar;
            options.inBitmap = zsVar2.c(i8, i7, config);
        }
        if (tp3Var != null) {
            int i31 = Build.VERSION.SDK_INT;
            if (i31 >= 28) {
                options.inPreferredColorSpace = ColorSpace.get((tp3Var == tp3.n && options.outColorSpace != null && options.outColorSpace.isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
            } else if (i31 >= 26) {
                ColorSpace.Named unused = ColorSpace.Named.SRGB;
                options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
        }
        Bitmap bitmapC = c(aw1Var, options, hu0Var, zsVar2);
        hu0Var.E(zsVar2, bitmapC);
        if (Log.isLoggable("Downsampler", 2)) {
            Log.v("Downsampler", "Decoded " + d(bitmapC) + " from [" + i16 + "x" + i17 + "] " + str3 + " with inBitmap " + d(options.inBitmap) + " for [" + i2 + "x" + i3 + "], sample size: " + options.inSampleSize + str + options.inDensity + str2 + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + ee2.a(jElapsedRealtimeNanos));
        }
        if (bitmapC == null) {
            return null;
        }
        bitmapC.setDensity(this.b.densityDpi);
        switch (iC) {
            case 2:
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                Matrix matrix = new Matrix();
                switch (iC) {
                    case 2:
                        matrix.setScale(-1.0f, 1.0f);
                        break;
                    case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                        matrix.setRotate(180.0f);
                        break;
                    case 4:
                        matrix.setRotate(180.0f);
                        matrix.postScale(-1.0f, 1.0f);
                        break;
                    case 5:
                        matrix.setRotate(90.0f);
                        matrix.postScale(-1.0f, 1.0f);
                        break;
                    case 6:
                        matrix.setRotate(90.0f);
                        break;
                    case 7:
                        matrix.setRotate(-90.0f);
                        matrix.postScale(-1.0f, 1.0f);
                        break;
                    case 8:
                        matrix.setRotate(-90.0f);
                        break;
                }
                RectF rectF = new RectF(0.0f, 0.0f, bitmapC.getWidth(), bitmapC.getHeight());
                matrix.mapRect(rectF);
                bitmapH = zsVar2.h(Math.round(rectF.width()), Math.round(rectF.height()), bitmapC.getConfig() != null ? bitmapC.getConfig() : Bitmap.Config.ARGB_8888);
                matrix.postTranslate(-rectF.left, -rectF.top);
                bitmapH.setHasAlpha(bitmapC.hasAlpha());
                xw4.a(bitmapC, bitmapH, matrix);
                break;
            default:
                bitmapH = bitmapC;
                break;
        }
        if (!bitmapC.equals(bitmapH)) {
            zsVar2.d(bitmapC);
        }
        return bitmapH;
    }
}
