package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class e05 extends vr1 {
    public static Class c;
    public static Constructor d;
    public static Method e;
    public static Method f;
    public static boolean g;

    public static boolean L(Object r1, String r2, int r3, boolean r4) {
        M();
        return ((Boolean) e.invoke(r1, new Object[]{r2, Integer.valueOf(r3), Boolean.valueOf(r4)})).booleanValue();
    L5:
        e = move-exception;
        er1.m(e);
        return false;
    }

    public static void M() {
        if (g == false) goto L5;
        return;
    L5:
        g = true;
        Constructor<?> r1 = null;
        Class<?> r2 = Class.forName("android.graphics.FontFamily");     // Catch: Throwable -> L8 ClassNotFoundException -> L10
        Constructor<?> r3 = r2.getConstructor(null);     // Catch: Throwable -> L8 ClassNotFoundException -> L10
        Method r4 = r2.getMethod("addFontWeightStyle", new Class[]{String.class, Integer.TYPE, Boolean.TYPE});     // Catch: Throwable -> L8 ClassNotFoundException -> L10
        Method r0 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(r2, 1).getClass()});     // Catch: Throwable -> L8 ClassNotFoundException -> L10
        r1 = r3;
    L12:
        d = r1;
        c = r2;
        e = r4;
        f = r0;
        return;
    L8:
        e = move-exception;
        Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
        r0 = null;
        r2 = null;
        r4 = null;
        goto L12
    }

    @Override // defpackage.vr1
    public Typeface e(Context r8, ya1 r9, Resources r10, int r11) {
        M();
        Object r12 = d.newInstance(null);     // Catch: InvocationTargetException -> L31 Throwable -> L33 IllegalAccessException -> L35
        za1[] r13 = r9.a;
        int r0 = r13.length;
        int r2 = 0;
    L5:
        if (r2 >= r0) goto L23;
        za1 r3 = r13[r2];
        File r4 = wr1.C(r8);
        if (r4 == null) goto L8;
    L21:
        r4.delete();
        return null;
    L18:
        th = move-exception;
        r4.delete();
        throw th;
    L10:
        if (wr1.k(r4, r10, r3.f) == false) goto L11;
        if (L(r12, r4.getPath(), r3.b, r3.c) == false) goto L15;
        r4.delete();
        r2 = r2 + 1;
        goto L5
    L15:
        r4.delete();
        return null;
    L11:
        r4.delete();
        return null;
    L8:
        return null;
    L23:
        M();
        Object r14 = Array.newInstance(c, 1);     // Catch: InvocationTargetException -> L26 Throwable -> L28
        Array.set(r14, 0, r12);     // Catch: InvocationTargetException -> L26 Throwable -> L28
        return (Typeface) f.invoke(null, new Object[]{r14});
    L28:
        e = move-exception;
        er1.m(e);
        return null;
    L33:
        e = move-exception;
        er1.m(e);
        return null;
    }

    @Override // defpackage.vr1
    public Typeface f(Context r3, ib1[] r4, int r5) {
        if (r4.length < 1) goto L53;
        ib1 r2 = vr1.p(r4, r5);
        ParcelFileDescriptor r6 = r3.getContentResolver().openFileDescriptor(r2.a, "r", null);     // Catch: IOException -> L56
        if (r6 != null) goto L60;
        if (r6 == null) goto L53;
        r6.close();     // Catch: IOException -> L56
        return null;
    L60:
        String r7 = Os.readlink("/proc/self/fd/" + r6.getFd());     // Catch: ErrnoException -> L55 Throwable -> L24
        if (OsConstants.S_ISREG(Os.stat(r7).st_mode) == false) goto L16;
        File r8 = new File(r7);     // Catch: ErrnoException -> L55 Throwable -> L24
    L17:
        if (r8 != null) goto L19;
    L26:
        FileInputStream r9 = new FileInputStream(r6.getFileDescriptor());     // Catch: Throwable -> L24
        File r10 = wr1.C(r3);     // Catch: Throwable -> L42
        if (r10 != null) goto L65;
    L29:
        Typeface r11 = null;
    L39:
        r9.close();     // Catch: Throwable -> L24
        r6.close();     // Catch: IOException -> L56
        return r11;
    L65:
    L36:
        th = move-exception;
        r10.delete();     // Catch: Throwable -> L42
        throw th;     // Catch: Throwable -> L42
    L31:
        if (wr1.l(r10, r9) == false) goto L32;
        r11 = Typeface.createFromFile(r10.getPath());     // Catch: RuntimeException -> L54 Throwable -> L36
        r10.delete();     // Catch: Throwable -> L42
        goto L39
    L32:
        r10.delete();     // Catch: Throwable -> L42
    L42:
        th = move-exception;
        r9.close();     // Catch: Throwable -> L45
    L47:
        throw th;     // Catch: Throwable -> L24
    L45:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L24
        goto L47
    L19:
        if (r8.canRead() == false) goto L26;
        Typeface r12 = Typeface.createFromFile(r8);     // Catch: Throwable -> L24
        r6.close();     // Catch: IOException -> L56
        return r12;
    L24:
        th = move-exception;
        r6.close();     // Catch: Throwable -> L50
    L52:
        throw th;     // Catch: IOException -> L56
    L50:
        th = move-exception;
        th.addSuppressed(th);     // Catch: IOException -> L56
    L16:
        r8 = null;
    L53:
        return null;
    }
}
