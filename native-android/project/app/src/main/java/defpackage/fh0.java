package defpackage;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.Property;
import android.util.Size;
import android.util.SizeF;
import android.view.View;
import android.view.ViewGroup;
import com.bumptech.glide.a;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.MalformedJsonException;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class fh0 {
    public static final int[] a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] d = {R.attr.name, R.attr.pathData, R.attr.fillType};
    public static final int[] e = {R.attr.drawable};
    public static final int[] f = {R.attr.name, R.attr.animation};
    public static final of g = new of(1);
    public static final of h = new of(2);
    public static final StackTraceElement[] i = new StackTraceElement[0];
    public static final p61 j;
    public static final p61 k;
    public static final p61[] l;
    public static boolean m = true;

    static {
        p61 p61Var = new p61("auth_api_credentials_begin_sign_in", 9L);
        p61 p61Var2 = new p61("auth_api_credentials_sign_out", 2L);
        p61 p61Var3 = new p61("auth_api_credentials_authorize", 1L);
        p61 p61Var4 = new p61("auth_api_credentials_revoke_access", 1L);
        p61 p61Var5 = new p61("auth_api_credentials_save_password", 4L);
        j = p61Var5;
        p61 p61Var6 = new p61("auth_api_credentials_get_sign_in_intent", 6L);
        k = p61Var6;
        l = new p61[]{p61Var, p61Var2, p61Var3, p61Var4, p61Var5, p61Var6, new p61("auth_api_credentials_save_account_linking_token", 3L), new p61("auth_api_credentials_get_phone_number_hint_intent", 3L)};
    }

    public static void A(ByteArrayOutputStream byteArrayOutputStream, int i2) throws IOException {
        z(byteArrayOutputStream, i2, 2);
    }

    public static void B(Object obj, Object obj2) {
        if (obj == null) {
            nz2.n("null key in entry: null=".concat(String.valueOf(obj2)));
        } else {
            if (obj2 != null) {
                return;
            }
            nz2.n(xa3.h("null value in entry: ", obj.toString(), "=null"));
        }
    }

    public static final long a(int i2) {
        long j2 = ((long) i2) << 32;
        int i3 = g42.p;
        return j2;
    }

    public static final gc b() {
        return new gc(new Paint(7));
    }

    public static final cx2 c(eo0 eo0Var, int i2) {
        cx2 cx2Var = ((cx2) eo0Var).n.s;
        if (cx2Var == null || (cx2Var.q & i2) == 0) {
            return null;
        }
        while (cx2Var != null) {
            int i3 = cx2Var.p;
            if ((i3 & 2) != 0) {
                return null;
            }
            if ((i3 & i2) != 0) {
                return cx2Var;
            }
            cx2Var = cx2Var.s;
        }
        return null;
    }

    public static final mg1 d(mg1 mg1Var) {
        if (mg1Var == null) {
            mg1Var = null;
        }
        if (mg1Var != null) {
            return mg1Var;
        }
        l80.b("Inconsistent composition");
        er1.a();
        return null;
    }

    public static final int f(int i2, int i3) {
        return i2 << (((i3 % 10) * 3) + 1);
    }

    public static final Bundle g(kd3... kd3VarArr) {
        Bundle bundle = new Bundle(kd3VarArr.length);
        for (kd3 kd3Var : kd3VarArr) {
            String str = (String) kd3Var.n;
            Object obj = kd3Var.o;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                componentType.getClass();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        kf2.j("Illegal value array type ", componentType.getCanonicalName(), " for key \"", str, 34);
                        return null;
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    kf2.j("Illegal value type ", obj.getClass().getCanonicalName(), " for key \"", str, 34);
                    return null;
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static byte[] h(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                try {
                    deflaterOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            deflater.end();
            throw th3;
        }
    }

    public static float[] i(float[] fArr, int i2) {
        if (i2 < 0) {
            nz2.c();
            return null;
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i2, length);
        float[] fArr2 = new float[i2];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    public static ey3 j(a aVar, List list, g12 g12Var) {
        t04 nwVar;
        t04 rsVar;
        Class cls;
        int i2;
        zs zsVar = aVar.n;
        qj0 qj0Var = aVar.q;
        ii1 ii1Var = aVar.p;
        Context applicationContext = ii1Var.getApplicationContext();
        d34 d34Var = ii1Var.h;
        ey3 ey3Var = new ey3();
        gl0 gl0Var = new gl0();
        xv1 xv1Var = ey3Var.g;
        synchronized (xv1Var) {
            xv1Var.a.add(gl0Var);
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 27) {
            g31 g31Var = new g31();
            xv1 xv1Var2 = ey3Var.g;
            synchronized (xv1Var2) {
                xv1Var2.a.add(g31Var);
            }
        }
        Resources resources = applicationContext.getResources();
        ArrayList arrayListE = ey3Var.e();
        rw rwVar = new rw(applicationContext, arrayListE, zsVar, qj0Var);
        t04 b55Var = new b55(zsVar, new z45(0));
        iu0 iu0Var = new iu0(ey3Var.e(), resources.getDisplayMetrics(), zsVar, qj0Var);
        if (i3 < 28 || !((Map) d34Var.o).containsKey(kb4.class)) {
            nwVar = new nw(iu0Var, 0);
            rsVar = new rs(2, iu0Var, qj0Var);
        } else {
            rsVar = new ow(1);
            nwVar = new ow(0);
        }
        if (i3 >= 28) {
            ey3Var.d("Animation", InputStream.class, Drawable.class, new md(new wo0(arrayListE, qj0Var), 1));
            ey3Var.d("Animation", ByteBuffer.class, Drawable.class, new md(new wo0(arrayListE, qj0Var), 0));
        }
        t04 v04Var = new v04(applicationContext);
        w04 ssVar = new ss(qj0Var);
        d14 x7Var = new x7(2);
        d14 y41Var = new y41(20);
        ContentResolver contentResolver = applicationContext.getContentResolver();
        ey3Var.a(ByteBuffer.class, new pa(23));
        ey3Var.a(InputStream.class, new pz1(25, qj0Var));
        ey3Var.d("Bitmap", ByteBuffer.class, Bitmap.class, nwVar);
        ey3Var.d("Bitmap", InputStream.class, Bitmap.class, rsVar);
        String str = Build.FINGERPRINT;
        if ("robolectric".equals(str)) {
            cls = ParcelFileDescriptor.class;
        } else {
            t04 nwVar2 = new nw(iu0Var, 1);
            cls = ParcelFileDescriptor.class;
            ey3Var.d("Bitmap", cls, Bitmap.class, nwVar2);
        }
        ey3Var.d("Bitmap", AssetFileDescriptor.class, Bitmap.class, new b55(zsVar, new xi4(27)));
        ey3Var.d("Bitmap", cls, Bitmap.class, b55Var);
        vw2 vw2Var = k15.b;
        ey3Var.c(Bitmap.class, Bitmap.class, vw2Var);
        ey3Var.d("Bitmap", Bitmap.class, Bitmap.class, new u61(1));
        ey3Var.b(Bitmap.class, ssVar);
        ey3Var.d("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new rs(resources, nwVar));
        ey3Var.d("BitmapDrawable", InputStream.class, BitmapDrawable.class, new rs(resources, rsVar));
        ey3Var.d("BitmapDrawable", cls, BitmapDrawable.class, new rs(resources, b55Var));
        ey3Var.b(BitmapDrawable.class, new qr2(zsVar, ssVar, false, 4));
        ey3Var.d("Animation", InputStream.class, vh1.class, new em4(arrayListE, rwVar, qj0Var));
        ey3Var.d("Animation", ByteBuffer.class, vh1.class, rwVar);
        ey3Var.b(vh1.class, new y41(21));
        ey3Var.c(vk4.class, vk4.class, vw2Var);
        ey3Var.d("Bitmap", vk4.class, Bitmap.class, new vs(zsVar));
        ey3Var.d("legacy_append", Uri.class, Drawable.class, v04Var);
        ey3Var.d("legacy_append", Uri.class, Bitmap.class, new rs(1, v04Var, zsVar));
        ey3Var.h(new sw(0));
        ey3Var.c(File.class, ByteBuffer.class, new k15(3));
        ey3Var.c(File.class, InputStream.class, new x61(new y41(8)));
        ey3Var.d("legacy_append", File.class, File.class, new u61(0));
        ey3Var.c(File.class, cls, new x61(new y41(7)));
        ey3Var.c(File.class, File.class, vw2Var);
        ey3Var.h(new tz1(qj0Var));
        if ("robolectric".equals(str)) {
            i2 = 2;
        } else {
            i2 = 2;
            ey3Var.h(new sw(i2));
        }
        vw2 jq0Var = new jq0(applicationContext, i2);
        vw2 jq0Var2 = new jq0(applicationContext, 0);
        vw2 jq0Var3 = new jq0(applicationContext, 1);
        Class cls2 = Integer.TYPE;
        ey3Var.c(cls2, InputStream.class, jq0Var);
        ey3Var.c(Integer.class, InputStream.class, jq0Var);
        ey3Var.c(cls2, AssetFileDescriptor.class, jq0Var2);
        ey3Var.c(Integer.class, AssetFileDescriptor.class, jq0Var2);
        ey3Var.c(cls2, Drawable.class, jq0Var3);
        ey3Var.c(Integer.class, Drawable.class, jq0Var3);
        ey3Var.c(Uri.class, InputStream.class, new jq0(applicationContext, 7));
        ey3Var.c(Uri.class, AssetFileDescriptor.class, new jq0(applicationContext, 6));
        vw2 a14Var = new a14(resources, 2);
        vw2 a14Var2 = new a14(resources, 0);
        vw2 a14Var3 = new a14(resources, 1);
        ey3Var.c(Integer.class, Uri.class, a14Var);
        ey3Var.c(cls2, Uri.class, a14Var);
        ey3Var.c(Integer.class, AssetFileDescriptor.class, a14Var2);
        ey3Var.c(cls2, AssetFileDescriptor.class, a14Var2);
        ey3Var.c(Integer.class, InputStream.class, a14Var3);
        ey3Var.c(cls2, InputStream.class, a14Var3);
        ey3Var.c(String.class, InputStream.class, new ji0(0));
        ey3Var.c(Uri.class, InputStream.class, new ji0(0));
        ey3Var.c(String.class, InputStream.class, new k15(6));
        int i4 = 5;
        ey3Var.c(String.class, cls, new k15(i4));
        int i5 = 4;
        ey3Var.c(String.class, AssetFileDescriptor.class, new k15(i5));
        ey3Var.c(Uri.class, InputStream.class, new kk(applicationContext.getAssets(), 1));
        ey3Var.c(Uri.class, AssetFileDescriptor.class, new kk(applicationContext.getAssets(), 0));
        ey3Var.c(Uri.class, InputStream.class, new jq0(applicationContext, i5));
        ey3Var.c(Uri.class, InputStream.class, new jq0(applicationContext, i4));
        if (i3 >= 29) {
            ey3Var.c(Uri.class, InputStream.class, new fs3(applicationContext, InputStream.class));
            ey3Var.c(Uri.class, cls, new fs3(applicationContext, cls));
        }
        ey3Var.c(Uri.class, InputStream.class, new t25(contentResolver, 2));
        ey3Var.c(Uri.class, cls, new t25(contentResolver, 1));
        ey3Var.c(Uri.class, AssetFileDescriptor.class, new t25(contentResolver, 0));
        ey3Var.c(Uri.class, InputStream.class, new k15(8));
        ey3Var.c(URL.class, InputStream.class, new k15(7));
        ey3Var.c(Uri.class, File.class, new jq0(applicationContext, 3));
        ey3Var.c(qi1.class, InputStream.class, new ji0(1));
        ey3Var.c(byte[].class, ByteBuffer.class, new k15(1));
        int i6 = 2;
        ey3Var.c(byte[].class, InputStream.class, new k15(i6));
        ey3Var.c(Uri.class, Uri.class, vw2Var);
        ey3Var.c(Drawable.class, Drawable.class, vw2Var);
        ey3Var.d("legacy_append", Drawable.class, Drawable.class, new u61(i6));
        ey3Var.i(Bitmap.class, BitmapDrawable.class, new zh0(10, resources));
        ey3Var.i(Bitmap.class, byte[].class, x7Var);
        ey3Var.i(Drawable.class, byte[].class, new jv3(zsVar, x7Var, y41Var));
        ey3Var.i(vh1.class, byte[].class, y41Var);
        t04 b55Var2 = new b55(zsVar, new xi4(28));
        ey3Var.d("legacy_append", ByteBuffer.class, Bitmap.class, b55Var2);
        ey3Var.d("legacy_append", ByteBuffer.class, BitmapDrawable.class, new rs(resources, b55Var2));
        Iterator it = list.iterator();
        if (it.hasNext()) {
            throw xa3.d(it);
        }
        if (g12Var != null) {
            g12Var.M(applicationContext, aVar, ey3Var);
        }
        return ey3Var;
    }

    public static ObjectAnimator k(View view, mx4 mx4Var, int i2, int i3, float f2, float f3, float f4, float f5, TimeInterpolator timeInterpolator, cg4 cg4Var) {
        float f6;
        float f7;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) mx4Var.b.getTag(app.homemusic.R.id.transition_position);
        if (iArr != null) {
            f6 = (iArr[0] - i2) + translationX;
            f7 = (iArr[1] - i3) + translationY;
        } else {
            f6 = f2;
            f7 = f3;
        }
        int iRound = Math.round(f6 - translationX) + i2;
        int iRound2 = Math.round(f7 - translationY) + i3;
        view.setTranslationX(f6);
        view.setTranslationY(f7);
        if (f6 == f4 && f7 == f5) {
            return null;
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f6, f4), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f7, f5));
        nx4 nx4Var = new nx4(view, mx4Var.b, iRound, iRound2, translationX, translationY);
        cg4Var.a(nx4Var);
        objectAnimatorOfPropertyValuesHolder.addListener(nx4Var);
        objectAnimatorOfPropertyValuesHolder.addPauseListener(nx4Var);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(timeInterpolator);
        return objectAnimatorOfPropertyValuesHolder;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:41:0x0091  */
    /* JADX WARN: Code duplicated, block: B:46:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d6 A[SYNTHETIC] */
    public static cf3[] l(String str) {
        int i2;
        String strTrim;
        float[] fArrI;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        int i5 = 1;
        while (i5 < str.length()) {
            while (i5 < str.length()) {
                char cCharAt = str.charAt(i5);
                if ((cCharAt - 'Z') * (cCharAt - 'A') > 0) {
                    if ((cCharAt - 'z') * (cCharAt - 'a') > 0) {
                        continue;
                    } else if (cCharAt != 'e' && cCharAt != 'E') {
                        strTrim = str.substring(i4, i5).trim();
                        if (strTrim.isEmpty()) {
                            if (strTrim.charAt(i3) != 'z' || strTrim.charAt(i3) == 'Z') {
                                fArrI = new float[i3];
                            } else {
                                try {
                                    float[] fArr = new float[strTrim.length()];
                                    int length = strTrim.length();
                                    int i6 = i3;
                                    int i7 = 1;
                                    while (i7 < length) {
                                        int i8 = i3;
                                        int i9 = i8;
                                        int i10 = i9;
                                        int i11 = i10;
                                        for (int i12 = i7; i12 < strTrim.length(); i12++) {
                                            char cCharAt2 = strTrim.charAt(i12);
                                            if (cCharAt2 == ' ') {
                                                i8 = 0;
                                                i10 = 1;
                                            } else if (cCharAt2 != 'E' && cCharAt2 != 'e') {
                                                switch (cCharAt2) {
                                                    case ',':
                                                        i8 = 0;
                                                        i10 = 1;
                                                        break;
                                                    case '-':
                                                        if (i12 == i7 || i8 != 0) {
                                                            i8 = 0;
                                                        } else {
                                                            i8 = 0;
                                                            i10 = 1;
                                                            i11 = 1;
                                                        }
                                                        break;
                                                    case '.':
                                                        if (i9 == 0) {
                                                            i8 = 0;
                                                            i9 = 1;
                                                        } else {
                                                            i8 = 0;
                                                            i10 = 1;
                                                            i11 = 1;
                                                        }
                                                        break;
                                                    default:
                                                        i8 = 0;
                                                        break;
                                                }
                                            } else {
                                                i8 = 1;
                                            }
                                            if (i10 != 0) {
                                                if (i7 < i12) {
                                                    fArr[i6] = Float.parseFloat(strTrim.substring(i7, i12));
                                                    i6++;
                                                }
                                                if (i11 != 0) {
                                                    i7 = i12;
                                                } else {
                                                    i7 = i12 + 1;
                                                }
                                                i3 = 0;
                                            }
                                        }
                                        if (i7 < i12) {
                                            fArr[i6] = Float.parseFloat(strTrim.substring(i7, i12));
                                            i6++;
                                        }
                                        if (i11 != 0) {
                                            i7 = i12;
                                        } else {
                                            i7 = i12 + 1;
                                        }
                                        i3 = 0;
                                    }
                                    fArrI = i(fArr, i6);
                                    i3 = 0;
                                } catch (NumberFormatException e2) {
                                    nz2.s(xa3.h("error in parsing \"", strTrim, "\""), e2);
                                    return null;
                                }
                            }
                            arrayList.add(new cf3(strTrim.charAt(i3), fArrI));
                        }
                        i4 = i5;
                        i5++;
                        i3 = 0;
                    }
                } else if (cCharAt != 'e') {
                    continue;
                }
                i5++;
            }
            strTrim = str.substring(i4, i5).trim();
            if (strTrim.isEmpty()) {
                if (strTrim.charAt(i3) != 'z') {
                    fArrI = new float[i3];
                } else {
                    fArrI = new float[i3];
                }
                arrayList.add(new cf3(strTrim.charAt(i3), fArrI));
            }
            i4 = i5;
            i5++;
            i3 = 0;
        }
        if (i5 - i4 != 1 || i4 >= str.length()) {
            i2 = 0;
        } else {
            i2 = 0;
            arrayList.add(new cf3(str.charAt(i4), new float[0]));
        }
        return (cf3[]) arrayList.toArray(new cf3[i2]);
    }

    public static vd2 m() {
        z05 z05Var = ug3.a;
        z05Var.getClass();
        LocaleList localeList = LocaleList.getDefault();
        synchronized (((xi4) z05Var.q)) {
            try {
                vd2 vd2Var = (vd2) z05Var.p;
                if (vd2Var != null && localeList == ((LocaleList) z05Var.o)) {
                    return vd2Var;
                }
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList.add(new ud2(localeList.get(i2)));
                }
                vd2 vd2Var2 = new vd2(arrayList);
                z05Var.o = localeList;
                z05Var.p = vd2Var2;
                return vd2Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final Paint n(gc gcVar) {
        if (gcVar == null) {
            bz1.a("Extracting native reference is only supported from androidx.compose.ui.graphics.AndroidPaint instances but received " + kx3.a(gcVar.getClass()).b());
        }
        return (Paint) gcVar.b;
    }

    public static final boolean p(i94 i94Var) {
        e94 e94VarK = i94Var.k();
        return e94VarK.n.c(n94.y);
    }

    public static h32 q(l32 l32Var) {
        boolean z;
        try {
            try {
                l32Var.e0();
                z = false;
                try {
                    return (h32) hz4.z.a(l32Var);
                } catch (EOFException e2) {
                    e = e2;
                    if (z) {
                        return i32.n;
                    }
                    throw new JsonSyntaxException(e);
                }
            } catch (EOFException e3) {
                e = e3;
                z = true;
            }
        } catch (MalformedJsonException e4) {
            throw new JsonSyntaxException(e4);
        } catch (IOException e5) {
            throw new JsonIOException(e5);
        } catch (NumberFormatException e6) {
            throw new JsonSyntaxException(e6);
        }
    }

    public static wv2 s(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j2;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i2 = byteBufferDuplicate.getShort() & 65535;
        if (i2 > 100) {
            mj0.i("Cannot read metadata.");
            return null;
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                j2 = -1;
                break;
            }
            int i4 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j2 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i4) {
                break;
            }
            i3++;
        }
        if (j2 != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j2 - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j3 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i5 = 0; i5 < j3; i5++) {
                int i6 = byteBufferDuplicate.getInt();
                long j4 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i6 || 1701669481 == i6) {
                    byteBufferDuplicate.position((int) (j4 + j2));
                    wv2 wv2Var = new wv2();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    wv2Var.q = byteBufferDuplicate;
                    wv2Var.n = iPosition;
                    int i7 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    wv2Var.o = i7;
                    wv2Var.p = ((ByteBuffer) wv2Var.q).getShort(i7);
                    return wv2Var;
                }
            }
        }
        mj0.i("Cannot read metadata.");
        return null;
    }

    public static byte[] t(InputStream inputStream, int i2) throws IOException {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int i4 = inputStream.read(bArr, i3, i2 - i3);
            if (i4 < 0) {
                kf2.o(f34.f(i2, "Not enough bytes to read: "));
                return null;
            }
            i3 += i4;
        }
        return bArr;
    }

    public static byte[] u(FileInputStream fileInputStream, int i2, int i3) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i3];
            byte[] bArr2 = new byte[2048];
            int i4 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i4 < i2) {
                int i5 = fileInputStream.read(bArr2);
                if (i5 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i2 + " bytes");
                }
                inflater.setInput(bArr2, 0, i5);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i3 - iInflate);
                    i4 += i5;
                } catch (DataFormatException e2) {
                    throw new IllegalStateException(e2.getMessage());
                }
            }
            if (i4 == i2) {
                if (!inflater.finished()) {
                    throw new IllegalStateException("Inflater did not finish");
                }
                inflater.end();
                return bArr;
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i2 + " actual=" + i4);
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }

    public static long v(InputStream inputStream, int i2) throws IOException {
        byte[] bArrT = t(inputStream, i2);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 += ((long) (bArrT[i3] & 255)) << (i3 * 8);
        }
        return j2;
    }

    public static final r70 w(int i2, sf1 sf1Var, rg1 rg1Var) {
        Object objH = rg1Var.H();
        if (objH == j80.a) {
            objH = new r70(i2, true, sf1Var);
            rg1Var.b0(objH);
        }
        r70 r70Var = (r70) objH;
        if (!r70Var.p.equals(sf1Var)) {
            r70Var.p = sf1Var;
            if (r70Var.o) {
                lv3 lv3Var = r70Var.q;
                if (lv3Var != null) {
                    z80 z80Var = lv3Var.a;
                    if (z80Var != null) {
                        z80Var.s(lv3Var, null);
                    }
                    r70Var.q = null;
                }
                ArrayList arrayList = r70Var.r;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        lv3 lv3Var2 = (lv3) arrayList.get(i3);
                        z80 z80Var2 = lv3Var2.a;
                        if (z80Var2 != null) {
                            z80Var2.s(lv3Var2, null);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
        return r70Var;
    }

    public static void y(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z);
        } else if (m) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                m = false;
            }
        }
    }

    public static void z(ByteArrayOutputStream byteArrayOutputStream, long j2, int i2) throws IOException {
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = (byte) ((j2 >> (i3 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public abstract int e();

    public abstract boolean o();

    public abstract int r(byte[] bArr, int i2, int i3);

    public abstract int x();
}
