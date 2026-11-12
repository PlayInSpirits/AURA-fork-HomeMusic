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
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class fh0 {
    public static final int[] a = null;
    public static final int[] b = null;
    public static final int[] c = null;
    public static final int[] d = null;
    public static final int[] e = null;
    public static final int[] f = null;
    public static final of g = null;
    public static final of h = null;
    public static final StackTraceElement[] i = null;
    public static final p61 j = null;
    public static final p61 k = null;
    public static final p61[] l = null;
    public static boolean m = true;

    static {
        a = new int[]{R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
        b = new int[]{R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
        c = new int[]{R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
        d = new int[]{R.attr.name, R.attr.pathData, R.attr.fillType};
        e = new int[]{R.attr.drawable};
        f = new int[]{R.attr.name, R.attr.animation};
        g = new of(1);
        h = new of(2);
        i = new StackTraceElement[0];
        p61 r1 = new p61("auth_api_credentials_begin_sign_in", 9);
        p61 r2 = new p61("auth_api_credentials_sign_out", 2);
        p61 r3 = new p61("auth_api_credentials_authorize", 1);
        p61 r4 = new p61("auth_api_credentials_revoke_access", 1);
        p61 r5 = new p61("auth_api_credentials_save_password", 4);
        j = r5;
        p61 r6 = new p61("auth_api_credentials_get_sign_in_intent", 6);
        k = r6;
        l = new p61[]{r1, r2, r3, r4, r5, r6, new p61("auth_api_credentials_save_account_linking_token", 3), new p61("auth_api_credentials_get_phone_number_hint_intent", 3)};
    }

    public static void A(ByteArrayOutputStream r2, int r3) {
        z(r2, r3, 2);
    }

    public static void B(Object r1, Object r2) {
        if (r1 == null) goto L7;
        if (r2 == null) goto L5;
        return;
    L5:
        nz2.n(xa3.h("null value in entry: ", r1.toString(), "=null"));
        return;
    L7:
        nz2.n("null key in entry: null=".concat(String.valueOf(r2)));
    }

    public static final long a(int r2) {
        long r0 = ((long) r2) << 32;
        int r3 = g42.p;
        return r0;
    }

    public static final gc b() {
        return new gc(new Paint(7));
    }

    public static final cx2 c(eo0 r2, int r3) {
        cx2 r4 = ((cx2) r2).n.s;
        if (r4 != null) goto L6;
        return null;
    L6:
        if ((r4.q & r3) == 0) goto L21;
    L8:
        if (r4 == null) goto L22;
        int r0 = r4.p;
        if ((r0 & 2) != 0) goto L23;
        if ((r0 & r3) != 0) goto L14;
        r4 = r4.s;
        goto L8
    L14:
        return r4;
    L23:
        return null;
    L22:
        return null;
    L21:
        return null;
    }

    public static final mg1 d(mg1 r1) {
        if (r1 != null) goto L6;
        r1 = null;
    L6:
        if (r1 == null) goto L8;
        return r1;
    L8:
        l80.b("Inconsistent composition");
        er1.a();
        return null;
    }

    public static final int f(int r0, int r1) {
        return r0 << (((r1 % 10) * 3) + 1);
    }

    public static final Bundle g(kd3... r10) {
        Bundle r0 = new Bundle(r10.length);
        int r1 = r10.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L95;
        kd3 r3 = r10[r2];
        String r4 = (String) r3.n;
        Object r5 = r3.o;
        if (r5 != null) goto L8;
        r0.putString(r4, null);
    L92:
        r2 = r2 + 1;
        goto L3
    L8:
        if ((r5 instanceof Boolean) == false) goto L11;
        r0.putBoolean(r4, ((Boolean) r5).booleanValue());
        goto L92
    L11:
        if ((r5 instanceof Byte) == false) goto L14;
        r0.putByte(r4, ((Number) r5).byteValue());
        goto L92
    L14:
        if ((r5 instanceof Character) == false) goto L17;
        r0.putChar(r4, ((Character) r5).charValue());
        goto L92
    L17:
        if ((r5 instanceof Double) == false) goto L20;
        r0.putDouble(r4, ((Number) r5).doubleValue());
        goto L92
    L20:
        if ((r5 instanceof Float) == false) goto L23;
        r0.putFloat(r4, ((Number) r5).floatValue());
        goto L92
    L23:
        if ((r5 instanceof Integer) == false) goto L26;
        r0.putInt(r4, ((Number) r5).intValue());
        goto L92
    L26:
        if ((r5 instanceof Long) == false) goto L29;
        r0.putLong(r4, ((Number) r5).longValue());
        goto L92
    L29:
        if ((r5 instanceof Short) == false) goto L32;
        r0.putShort(r4, ((Number) r5).shortValue());
        goto L92
    L32:
        if ((r5 instanceof Bundle) == false) goto L35;
        r0.putBundle(r4, (Bundle) r5);
        goto L92
    L35:
        if ((r5 instanceof CharSequence) == false) goto L38;
        r0.putCharSequence(r4, (CharSequence) r5);
        goto L92
    L38:
        if ((r5 instanceof Parcelable) == false) goto L41;
        r0.putParcelable(r4, (Parcelable) r5);
        goto L92
    L41:
        if ((r5 instanceof boolean[]) == false) goto L44;
        r0.putBooleanArray(r4, (boolean[]) r5);
        goto L92
    L44:
        if ((r5 instanceof byte[]) == false) goto L47;
        r0.putByteArray(r4, (byte[]) r5);
        goto L92
    L47:
        if ((r5 instanceof char[]) == false) goto L50;
        r0.putCharArray(r4, (char[]) r5);
        goto L92
    L50:
        if ((r5 instanceof double[]) == false) goto L53;
        r0.putDoubleArray(r4, (double[]) r5);
        goto L92
    L53:
        if ((r5 instanceof float[]) == false) goto L56;
        r0.putFloatArray(r4, (float[]) r5);
        goto L92
    L56:
        if ((r5 instanceof int[]) == false) goto L59;
        r0.putIntArray(r4, (int[]) r5);
        goto L92
    L59:
        if ((r5 instanceof long[]) == false) goto L62;
        r0.putLongArray(r4, (long[]) r5);
        goto L92
    L62:
        if ((r5 instanceof short[]) == false) goto L65;
        r0.putShortArray(r4, (short[]) r5);
        goto L92
    L65:
        if ((r5 instanceof Object[]) == false) goto L81;
        Class<?> r6 = r5.getClass().getComponentType();
        r6.getClass();
        if (Parcelable.class.isAssignableFrom(r6) == false) goto L70;
        r0.putParcelableArray(r4, (Parcelable[]) r5);
        goto L92
    L70:
        if (String.class.isAssignableFrom(r6) == false) goto L73;
        r0.putStringArray(r4, (String[]) r5);
        goto L92
    L73:
        if (CharSequence.class.isAssignableFrom(r6) == false) goto L76;
        r0.putCharSequenceArray(r4, (CharSequence[]) r5);
        goto L92
    L76:
        if (Serializable.class.isAssignableFrom(r6) == false) goto L78;
        r0.putSerializable(r4, (Serializable) r5);
        goto L92
    L78:
        kf2.j("Illegal value array type ", r6.getCanonicalName(), " for key \"", r4, 34);
        return null;
    L81:
        if ((r5 instanceof Serializable) == false) goto L84;
        r0.putSerializable(r4, (Serializable) r5);
        goto L92
    L84:
        if ((r5 instanceof IBinder) == false) goto L87;
        r0.putBinder(r4, (IBinder) r5);
        goto L92
    L87:
        if ((r5 instanceof Size) == false) goto L90;
        r0.putSize(r4, (Size) r5);
        goto L92
    L90:
        if ((r5 instanceof SizeF) == false) goto L93;
        r0.putSizeF(r4, (SizeF) r5);
        goto L92
    L93:
        kf2.j("Illegal value type ", r5.getClass().getCanonicalName(), " for key \"", r4, 34);
        return null;
    L95:
        return r0;
    }

    public static byte[] h(byte[] r3) {
        Deflater r0 = new Deflater(1);
        ByteArrayOutputStream r1 = new ByteArrayOutputStream();
        DeflaterOutputStream r2 = new DeflaterOutputStream(r1, r0);     // Catch: Throwable -> L8
        r2.write(r3);     // Catch: Throwable -> L10
        r2.close();     // Catch: Throwable -> L8
        r0.end();
        return r1.toByteArray();
    L10:
        th = move-exception;
        r2.close();     // Catch: Throwable -> L13
    L15:
        throw th;     // Catch: Throwable -> L8
    L13:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L8
    L8:
        th = move-exception;
        r0.end();
        throw th;
    }

    public static float[] i(float[] r2, int r3) {
        if (r3 < 0) goto L9;
        int r0 = r2.length;
        if (r0 < 0) goto L8;
        int r1 = Math.min(r3, r0);
        float[] r4 = new float[r3];
        System.arraycopy(r2, 0, r4, 0, r1);
        return r4;
    L8:
        throw new ArrayIndexOutOfBoundsException();
    L9:
        nz2.c();
        return null;
    }

    public static ey3 j(a r39, List r40, g12 r41) {
        zs r2 = r39.n;
        qj0 r3 = r39.q;
        ii1 r4 = r39.p;
        Context r5 = r4.getApplicationContext();
        d34 r6 = r4.h;
        ey3 r7 = new ey3();
        gl0 r11 = new gl0();
        xv1 r8 = r7.g;
        monitor-enter(r8);
        r8.a.add(r11);     // Catch: Throwable -> L47
        monitor-exit(r8);
        int r9 = Build.VERSION.SDK_INT;
        if (r9 < 27) goto L19;
        g31 r15 = new g31();
        xv1 r12 = r7.g;
        monitor-enter(r12);
        r12.a.add(r15);     // Catch: Throwable -> L15
        monitor-exit(r12);
    L15:
        th = move-exception;
        throw th;
    L19:
        Resources r10 = r5.getResources();
        ArrayList r13 = r7.e();
        rw r16 = new rw(r5, r13, r2, r3);
        t04 r17 = new b55(r2, new z45(0));
        iu0 r14 = new iu0(r7.e(), r10.getDisplayMetrics(), r2, r3);
        if (r9 >= 28) goto L22;
    L25:
        t04 r18 = new nw(r14, 0);
        t04 r19 = new rs(2, r14, r3);
    L26:
        if (r9 < 28) goto L29;
        r7.d("Animation", InputStream.class, Drawable.class, new md(new wo0(r13, r3), 1));
        r7.d("Animation", ByteBuffer.class, Drawable.class, new md(new wo0(r13, r3), 0));
    L29:
        t04 r20 = new v04(r5);
        w04 r21 = new ss(r3);
        d14 r110 = new x7(2);
        d14 r22 = new y41(20);
        ContentResolver r111 = r5.getContentResolver();
        r7.a(ByteBuffer.class, new pa(23));
        r7.a(InputStream.class, new pz1(25, r3));
        r7.d("Bitmap", ByteBuffer.class, Bitmap.class, r18);
        r7.d("Bitmap", InputStream.class, Bitmap.class, r19);
        String r112 = Build.FINGERPRINT;
        if ("robolectric".equals(r112) == true) goto L32;
        t04 r23 = new nw(r14, 1);
        Class r24 = ParcelFileDescriptor.class;
        r7.d("Bitmap", r24, Bitmap.class, r23);
    L33:
        r7.d("Bitmap", AssetFileDescriptor.class, Bitmap.class, new b55(r2, new xi4(27)));
        r7.d("Bitmap", r24, Bitmap.class, r17);
        vw2 r113 = k15.b;
        r7.c(Bitmap.class, Bitmap.class, r113);
        r7.d("Bitmap", Bitmap.class, Bitmap.class, new u61(1));
        r7.b(Bitmap.class, r21);
        r7.d("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new rs(r10, r18));
        r7.d("BitmapDrawable", InputStream.class, BitmapDrawable.class, new rs(r10, r19));
        r7.d("BitmapDrawable", r24, BitmapDrawable.class, new rs(r10, r17));
        boolean r25 = false;
        r7.b(BitmapDrawable.class, new qr2(r2, r21, r25, 4));
        r7.d("Animation", InputStream.class, vh1.class, new em4(r13, r16, r3));
        r7.d("Animation", ByteBuffer.class, vh1.class, r16);
        r7.b(vh1.class, new y41(21));
        r7.c(vk4.class, vk4.class, r113);
        r7.d("Bitmap", vk4.class, Bitmap.class, new vs(r2));
        r7.d("legacy_append", Uri.class, Drawable.class, r20);
        r7.d("legacy_append", Uri.class, Bitmap.class, new rs(1, r20, r2));
        r7.h(new sw(0));
        r7.c(File.class, ByteBuffer.class, new k15(3));
        r7.c(File.class, InputStream.class, new x61(new y41(8)));
        r7.d("legacy_append", File.class, File.class, new u61(0));
        r7.c(File.class, r24, new x61(new y41(7)));
        r7.c(File.class, File.class, r113);
        r7.h(new tz1(r3));
        if ("robolectric".equals(r112) == true) goto L36;
        int r26 = 2;
        r7.h(new sw(r26));
    L37:
        vw2 r27 = new jq0(r5, r26);
        vw2 r28 = new jq0(r5, 0);
        vw2 r1 = new jq0(r5, 1);
        Class r0 = Integer.TYPE;
        r7.c(r0, InputStream.class, r27);
        r7.c(Integer.class, InputStream.class, r27);
        r7.c(r0, AssetFileDescriptor.class, r28);
        r7.c(Integer.class, AssetFileDescriptor.class, r28);
        r7.c(r0, Drawable.class, r1);
        r7.c(Integer.class, Drawable.class, r1);
        r7.c(Uri.class, InputStream.class, new jq0(r5, 7));
        r7.c(Uri.class, AssetFileDescriptor.class, new jq0(r5, 6));
        vw2 r29 = new a14(r10, 2);
        vw2 r30 = new a14(r10, 0);
        vw2 r31 = new a14(r10, 1);
        r7.c(Integer.class, Uri.class, r29);
        r7.c(r0, Uri.class, r29);
        r7.c(Integer.class, AssetFileDescriptor.class, r30);
        r7.c(r0, AssetFileDescriptor.class, r30);
        r7.c(Integer.class, InputStream.class, r31);
        r7.c(r0, InputStream.class, r31);
        r7.c(String.class, InputStream.class, new ji0(0));
        r7.c(Uri.class, InputStream.class, new ji0(0));
        r7.c(String.class, InputStream.class, new k15(6));
        int r32 = 5;
        r7.c(String.class, r24, new k15(r32));
        int r33 = 4;
        r7.c(String.class, AssetFileDescriptor.class, new k15(r33));
        r7.c(Uri.class, InputStream.class, new kk(r5.getAssets(), 1));
        r7.c(Uri.class, AssetFileDescriptor.class, new kk(r5.getAssets(), 0));
        r7.c(Uri.class, InputStream.class, new jq0(r5, r33));
        r7.c(Uri.class, InputStream.class, new jq0(r5, r32));
        if (r9 < 29) goto L40;
        r7.c(Uri.class, InputStream.class, new fs3(r5, InputStream.class));
        r7.c(Uri.class, r24, new fs3(r5, r24));
    L40:
        r7.c(Uri.class, InputStream.class, new t25(r111, 2));
        r7.c(Uri.class, r24, new t25(r111, 1));
        r7.c(Uri.class, AssetFileDescriptor.class, new t25(r111, 0));
        r7.c(Uri.class, InputStream.class, new k15(8));
        r7.c(URL.class, InputStream.class, new k15(7));
        r7.c(Uri.class, File.class, new jq0(r5, 3));
        r7.c(qi1.class, InputStream.class, new ji0(1));
        r7.c(byte[].class, ByteBuffer.class, new k15(1));
        int r34 = 2;
        r7.c(byte[].class, InputStream.class, new k15(r34));
        r7.c(Uri.class, Uri.class, r113);
        r7.c(Drawable.class, Drawable.class, r113);
        r7.d("legacy_append", Drawable.class, Drawable.class, new u61(r34));
        r7.i(Bitmap.class, BitmapDrawable.class, new zh0(10, r10));
        r7.i(Bitmap.class, byte[].class, r110);
        r7.i(Drawable.class, byte[].class, new jv3(r2, r110, r22));
        r7.i(vh1.class, byte[].class, r22);
        t04 r35 = new b55(r2, new xi4(28));
        r7.d("legacy_append", ByteBuffer.class, Bitmap.class, r35);
        r7.d("legacy_append", ByteBuffer.class, BitmapDrawable.class, new rs(r10, r35));
        Iterator r36 = r40.iterator();
        if (r36.hasNext() == true) goto L46;
        if (r41 == null) goto L44;
        r41.M(r5, r39, r7);
    L44:
        return r7;
    L46:
        throw xa3.d(r36);
    L36:
        r26 = 2;
        goto L37
    L32:
        r24 = ParcelFileDescriptor.class;
        goto L33
    L22:
        if (((Map) r6.o).containsKey(kb4.class) == false) goto L25;
        r19 = new ow(1);
        r18 = new ow(0);
    L47:
        th = move-exception;
        throw th;
    }

    public static ObjectAnimator k(View r10, mx4 r11, int r12, int r13, float r14, float r15, float r16, float r17, TimeInterpolator r18, cg4 r19) {
        float r0 = r10.getTranslationX();
        float r1 = r10.getTranslationY();
        int[] r2 = (int[]) r11.b.getTag(app.homemusic.R.id.transition_position);
        if (r2 == null) goto L5;
        float r5 = (r2[0] - r12) + r0;
        float r3 = (r2[1] - r13) + r1;
    L6:
        int r6 = Math.round(r5 - r0) + r12;
        int r110 = Math.round(r3 - r1) + r13;
        r10.setTranslationX(r5);
        r10.setTranslationY(r3);
        if (r5 == r16) goto L9;
    L12:
        ObjectAnimator r4 = ObjectAnimator.ofPropertyValuesHolder(r10, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{r5, r16}), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{r3, r17})});
        nx4 r7 = new nx4(r10, r11.b, r6, r110, r0, r1);
        r19.a(r7);
        r4.addListener(r7);
        r4.addPauseListener(r7);
        r4.setInterpolator(r18);
        return r4;
    L9:
        if (r3 != r17) goto L12;
        return null;
    L5:
        r5 = r14;
        r3 = r15;
        goto L6
    }

    public static cf3[] l(String r17) {
        ArrayList r1 = new ArrayList();
        int r2 = 0;
        int r5 = 0;
        int r4 = 1;
    L4:
        if (r4 >= r17.length()) goto L61;
    L6:
        if (r4 >= r17.length()) goto L15;
        char r6 = r17.charAt(r4);
        if (((r6 - 'Z') * (r6 - 'A')) > 0) goto L10;
    L11:
        if (r6 == 'e') goto L14;
        if (r6 != 'E') goto L15;
    L14:
        r4 = r4 + 1;
        goto L6
    L10:
        if (((r6 - 'z') * (r6 - 'a')) > 0) goto L14;
    L15:
        String r7 = r17.substring(r5, r4).trim();
        if (r7.isEmpty() == true) goto L59;
        if (r7.charAt(r2) != 'z') goto L20;
    L57:
        float[] r3 = new float[r2];
    L58:
        r1.add(new cf3(r7.charAt(r2), r3));
        goto L59
    L20:
        if (r7.charAt(r2) == 'Z') goto L57;
        float[] r8 = new float[r7.length()];     // Catch: NumberFormatException -> L47
        int r9 = r7.length();     // Catch: NumberFormatException -> L47
        int r11 = r2;
        int r10 = 1;
    L23:
        if (r10 >= r9) goto L54;
        int r13 = r2;
        int r14 = r13;
        int r15 = r14;
        int r16 = r15;
        int r12 = r10;
    L26:
        if (r12 >= r7.length()) goto L45;
        char r18 = r7.charAt(r12);     // Catch: NumberFormatException -> L47
        if (r18 == ' ') goto L41;
        if (r18 == 'E') goto L40;
        if (r18 == 'e') goto L40;
        switch(r18) {
            case 44: goto L41;
            case 45: goto L36;
            case 46: goto L33;
            default: goto L39;
        };     // Catch: NumberFormatException -> L47
    L33:
        if (r14 != 0) goto L35;
        r13 = 0;
        r14 = 1;
    L42:
        if (r15 != 0) goto L45;
        r12 = r12 + 1;     // Catch: NumberFormatException -> L47
    L35:
        r13 = 0;
        r15 = 1;
        r16 = 1;
        goto L42
    L36:
        if (r12 == r10) goto L39;
        if (r13 == 0) goto L35;
    L39:
        r13 = 0;
    L40:
        r13 = 1;
    L41:
        r13 = 0;
        r15 = 1;
    L45:
        if (r10 >= r12) goto L49;
        r8[r11] = Float.parseFloat(r7.substring(r10, r12));     // Catch: NumberFormatException -> L47
        r11 = r11 + 1;     // Catch: NumberFormatException -> L47
    L49:
        if (r16 == 0) goto L52;
        r10 = r12;
    L51:
        r2 = 0;
        goto L23
    L52:
        r10 = r12 + 1;     // Catch: NumberFormatException -> L47
        goto L51
    L54:
        r3 = i(r8, r11);     // Catch: NumberFormatException -> L47
        r2 = 0;
    L47:
        e = move-exception;
        nz2.s(xa3.h("error in parsing \"", r7, "\""), e);
        return null;
    L59:
        r5 = r4;
        r4 = r4 + 1;
        r2 = 0;
        goto L4
    L61:
        if ((r4 - r5) == 1) goto L63;
    L65:
        int r19 = 0;
    L67:
        return (cf3[]) r1.toArray(new cf3[r19]);
    L63:
        if (r5 >= r17.length()) goto L65;
        r19 = 0;
        r1.add(new cf3(r17.charAt(r5), new float[0]));
        goto L67
    }

    public static vd2 m() {
        z05 r0 = ug3.a;
        r0.getClass();
        LocaleList r1 = LocaleList.getDefault();
        xi4 r2 = (xi4) r0.q;
        monitor-enter(r2);
        vd2 r3 = (vd2) r0.p;     // Catch: Throwable -> L13
        if (r3 != null) goto L7;
    L10:
        int r4 = r1.size();     // Catch: Throwable -> L13
        ArrayList r5 = new ArrayList(r4);     // Catch: Throwable -> L13
        int r6 = 0;
    L11:
        if (r6 >= r4) goto L15;
        r5.add(new ud2(r1.get(r6)));     // Catch: Throwable -> L13
        r6 = r6 + 1;     // Catch: Throwable -> L13
        goto L11
    L15:
        vd2 r7 = new vd2(r5);     // Catch: Throwable -> L13
        r0.o = r1;     // Catch: Throwable -> L13
        r0.p = r7;     // Catch: Throwable -> L13
        monitor-exit(r2);
        return r7;
    L7:
        if (r1 != ((LocaleList) r0.o)) goto L10;
        monitor-exit(r2);
        return r3;
    L13:
        th = move-exception;
        throw th;
    }

    public static final Paint n(gc r3) {
        if (r3 != null) goto L5;
        bz1.a("Extracting native reference is only supported from androidx.compose.ui.graphics.AndroidPaint instances but received " + kx3.a(r3.getClass()).b());
    L5:
        return (Paint) r3.b;
    }

    public static final boolean p(i94 r1) {
        e94 r2 = r1.k();
        p94 r0 = n94.y;
        return r2.n.c(r0);
    }

    public static h32 q(l32 r2) {
        r2.e0();     // Catch: NumberFormatException -> L8 IOException -> L11 MalformedJsonException -> L14 EOFException -> L17
        boolean r0 = false;
        return (h32) hz4.z.a(r2);
    L6:
        e = e;
    L19:
        if (r0 == false) goto L23;
        return i32.n;
    L23:
        throw new JsonSyntaxException(e);
    L17:
        e = e;
        r0 = true;
    L14:
        e = move-exception;
        throw new JsonSyntaxException(e);
    L11:
        e = move-exception;
        throw new JsonIOException(e);
    L8:
        e = move-exception;
        throw new JsonSyntaxException(e);
    }

    public static wv2 s(MappedByteBuffer r14) {
        ByteBuffer r15 = r14.duplicate();
        r15.order(ByteOrder.BIG_ENDIAN);
        r15.position(r15.position() + 4);
        int r0 = r15.getShort() & 65535;
        if (r0 > 100) goto L27;
        r15.position(r15.position() + 6);
        int r1 = 0;
        int r4 = 0;
    L6:
        if (r4 >= r0) goto L11;
        int r9 = r15.getInt();
        r15.position(r15.position() + 4);
        long r10 = ((long) r15.getInt()) & 4294967295L;
        r15.position(r15.position() + 4);
        if (1835365473 == r9) goto L13;
        r4 = r4 + 1;
    L13:
        if (r10 == (-1)) goto L25;
        r15.position(r15.position() + ((int) (r10 - ((long) r15.position()))));
        r15.position(r15.position() + 12);
        long r7 = ((long) r15.getInt()) & 4294967295L;
    L16:
        if (r1 >= r7) goto L25;
        int r2 = r15.getInt();
        long r12 = ((long) r15.getInt()) & 4294967295L;
        r15.getInt();
        if (1164798569 == r2) goto L23;
        if (1701669481 == r2) goto L23;
        r1 = r1 + 1;
    L23:
        r15.position((int) (r12 + r10));
        wv2 r3 = new wv2();
        r15.order(ByteOrder.LITTLE_ENDIAN);
        int r5 = r15.position() + r15.getInt(r15.position());
        r3.q = r15;
        r3.n = r5;
        int r6 = r5 - r15.getInt(r5);
        r3.o = r6;
        r3.p = ((ByteBuffer) r3.q).getShort(r6);
        return r3;
    L25:
        mj0.i("Cannot read metadata.");
        return null;
    L11:
        r10 = -1;
        goto L13
    L27:
        mj0.i("Cannot read metadata.");
        return null;
    }

    public static byte[] t(InputStream r3, int r4) {
        byte[] r0 = new byte[r4];
        int r1 = 0;
    L3:
        if (r1 >= r4) goto L9;
        int r2 = r3.read(r0, r1, r4 - r1);
        if (r2 < 0) goto L7;
        r1 = r1 + r2;
        goto L3
    L7:
        kf2.o(f34.f(r4, "Not enough bytes to read: "));
        return null;
    L9:
        return r0;
    }

    public static byte[] u(FileInputStream r8, int r9, int r10) {
        Inflater r0 = new Inflater();
        byte[] r1 = new byte[r10];     // Catch: Throwable -> L15
        byte[] r2 = new byte[2048];     // Catch: Throwable -> L15
        int r4 = 0;
        int r5 = 0;
    L5:
        if (r0.finished() == true) goto L22;
        if (r0.needsDictionary() == true) goto L22;
        if (r4 >= r9) goto L22;
        int r6 = r8.read(r2);     // Catch: Throwable -> L15
        if (r6 < 0) goto L21;
        r0.setInput(r2, 0, r6);     // Catch: Throwable -> L15
        r5 = r5 + r0.inflate(r1, r5, r10 - r5);
        r4 = r4 + r6;
        goto L5
    L17:
        e = move-exception;
        throw new IllegalStateException(e.getMessage());     // Catch: Throwable -> L15
    L21:
        throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + r9 + " bytes");     // Catch: Throwable -> L15
    L22:
        if (r4 != r9) goto L30;
        if (r0.finished() == false) goto L28;
        r0.end();
        return r1;
    L28:
        throw new IllegalStateException("Inflater did not finish");     // Catch: Throwable -> L15
    L30:
        throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + r9 + " actual=" + r4);     // Catch: Throwable -> L15
    L15:
        th = move-exception;
        r0.end();
        throw th;
    }

    public static long v(InputStream r6, int r7) {
        byte[] r8 = t(r6, r7);
        long r0 = 0;
        int r2 = 0;
    L3:
        if (r2 >= r7) goto L5;
        r0 = r0 + (((long) (r8[r2] & 255)) << (r2 * 8));
        r2 = r2 + 1;
        goto L3
    L5:
        return r0;
    }

    public static final r70 w(int r4, sf1 r5, rg1 r6) {
        Object r0 = r6.H();
        if (r0 != j80.a) goto L5;
        r0 = new r70(r4, true, r5);
        r6.b0(r0);
    L5:
        r70 r1 = (r70) r0;
        if (r1.p.equals(r5) == true) goto L24;
        r1.p = r5;
        if (r1.o == false) goto L24;
        lv3 r7 = r1.q;
        if (r7 == null) goto L15;
        z80 r8 = r7.a;
        if (r8 == null) goto L14;
        r8.s(r7, null);
    L14:
        r1.q = null;
    L15:
        ArrayList r9 = r1.r;
        if (r9 == null) goto L24;
        int r10 = r9.size();
        int r2 = 0;
    L18:
        if (r2 >= r10) goto L23;
        lv3 r3 = (lv3) r9.get(r2);
        z80 r11 = r3.a;
        if (r11 == null) goto L22;
        r11.s(r3, null);
    L22:
        r2 = r2 + 1;
        goto L18
    L23:
        r9.clear();
    L24:
        return r1;
    }

    public static void y(ViewGroup r2, boolean r3) {
        if (Build.VERSION.SDK_INT < 29) goto L7;
        lm4.v(r2, r3);
        return;
    L7:
        if (m == false) goto L14;
        lm4.v(r2, r3);     // Catch: NoSuchMethodError -> L10
        return;
    L10:
        m = false;
        return;
    }

    public static void z(ByteArrayOutputStream r6, long r7, int r9) {
        byte[] r0 = new byte[r9];
        int r1 = 0;
    L3:
        if (r1 >= r9) goto L5;
        r0[r1] = (byte) ((r7 >> (r1 * 8)) & 255);
        r1 = r1 + 1;
        goto L3
    L5:
        r6.write(r0);
    }

    public abstract int e();

    public abstract boolean o();

    public abstract int r(byte[] r1, int r2, int r3);

    public abstract int x();
}
