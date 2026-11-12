package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class f05 extends vr1 {
    public static final Class c = null;
    public static final Constructor d = null;
    public static final Method e = null;
    public static final Method f = null;

    static {
        Constructor<?> r0 = null;
        Class<?> r1 = Class.forName("android.graphics.FontFamily");     // Catch: NoSuchMethodException -> L5 Throwable -> L7
        Constructor<?> r2 = r1.getConstructor(null);     // Catch: NoSuchMethodException -> L5 Throwable -> L7
        Class r5 = Integer.TYPE;     // Catch: NoSuchMethodException -> L5 Throwable -> L7
        Method r3 = r1.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, r5, List.class, r5, Boolean.TYPE});     // Catch: NoSuchMethodException -> L5 Throwable -> L7
        Method r4 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(r1, 1).getClass()});     // Catch: NoSuchMethodException -> L5 Throwable -> L7
        r0 = r2;
    L9:
        d = r0;
        c = r1;
        e = r3;
        f = r4;
        return;
    L7:
        e = move-exception;
        Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
        r1 = null;
        r4 = null;
        r3 = null;
        goto L9
    }

    public static boolean L(Object r2, ByteBuffer r3, int r4, int r5, boolean r6) {
        return ((Boolean) e.invoke(r2, new Object[]{r3, Integer.valueOf(r4), null, Integer.valueOf(r5), Boolean.valueOf(r6)})).booleanValue();
    L4:
        return false;
    }

    public static Typeface M(Object r3) {
        Object r1 = Array.newInstance(c, 1);     // Catch: Throwable -> L5
        Array.set(r1, 0, r3);     // Catch: Throwable -> L5
        return (Typeface) f.invoke(null, new Object[]{r1});
    L5:
        return null;
    }

    @Override // defpackage.vr1
    public final Typeface e(Context r17, ya1 r18, Resources r19, int r20) {
        Object r2 = d.newInstance(null);     // Catch: Throwable -> L5
    L6:
        if (r2 == null) goto L35;
        za1[] r3 = r18.a;
        int r4 = r3.length;
        int r5 = 0;
    L9:
        if (r5 >= r4) goto L41;
        za1 r6 = r3[r5];
        int r0 = r6.f;
        File r7 = wr1.C(r17);
        if (r7 != null) goto L48;
    L13:
        MappedByteBuffer r1 = null;
    L31:
        if (r1 == null) goto L35;
        if (L(r2, r1, r6.e, r6.b, r6.c) == false) goto L35;
        r5 = r5 + 1;
        goto L9
    L48:
        if (wr1.k(r7, r19, r0) == true) goto L42;
        r7.delete();
        goto L13
    L42:
        FileInputStream r9 = new FileInputStream(r7);     // Catch: IOException -> L29 Throwable -> L37
        FileChannel r10 = r9.getChannel();     // Catch: Throwable -> L22
        r1 = r10.map(FileChannel.MapMode.READ_ONLY, 0, r10.size());     // Catch: Throwable -> L22
        r9.close();     // Catch: IOException -> L29 Throwable -> L37
    L30:
        r7.delete();
    L22:
        th = move-exception;
        r9.close();     // Catch: Throwable -> L26
    L28:
        throw th;     // Catch: IOException -> L29 Throwable -> L37
    L26:
        th = move-exception;
        th.addSuppressed(th);     // Catch: IOException -> L29 Throwable -> L37
    L29:
        r1 = null;
    L37:
        th = move-exception;
        r7.delete();
        throw th;
    L41:
        return M(r2);
    L35:
        return null;
    L5:
        r2 = null;
        goto L6
    }

    @Override // defpackage.vr1
    public final Typeface f(Context r9, ib1[] r10, int r11) {
        Object r0 = d.newInstance(null);     // Catch: Throwable -> L5
    L6:
        if (r0 == null) goto L21;
        int r2 = 0;
        yd4 r1 = new yd4(0);
        int r3 = r10.length;
    L9:
        if (r2 >= r3) goto L19;
        ib1 r4 = r10[r2];
        Uri r5 = r4.a;
        ByteBuffer r6 = (ByteBuffer) r1.get(r5);
        if (r6 != null) goto L13;
        r6 = wr1.N(r9, r5);
        r1.put(r5, r6);
    L13:
        if (r6 == null) goto L21;
        if (L(r0, r6, r4.b, r4.c, r4.d) == false) goto L21;
        r2 = r2 + 1;
        goto L9
    L19:
        Typeface r12 = M(r0);
        if (r12 == null) goto L21;
        return Typeface.create(r12, r11);
    L21:
        return null;
    L5:
        r0 = null;
        goto L6
    }
}
