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

    public static boolean L(Object obj, String str, int i, boolean z) throws NoSuchMethodException {
        M();
        try {
            return ((Boolean) e.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            er1.m(e2);
            return false;
        }
    }

    public static void M() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (g) {
            return;
        }
        g = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
            method = null;
            cls = null;
            method2 = null;
        }
        d = constructor;
        c = cls;
        e = method2;
        f = method;
    }

    @Override // defpackage.vr1
    public Typeface e(Context context, ya1 ya1Var, Resources resources, int i) throws NoSuchMethodException {
        M();
        try {
            Object objNewInstance = d.newInstance(null);
            for (za1 za1Var : ya1Var.a) {
                File fileC = wr1.C(context);
                if (fileC == null) {
                    return null;
                }
                try {
                    if (!wr1.k(fileC, resources, za1Var.f)) {
                        return null;
                    }
                    if (!L(objNewInstance, fileC.getPath(), za1Var.b, za1Var.c)) {
                        return null;
                    }
                    fileC.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileC.delete();
                }
            }
            M();
            try {
                Object objNewInstance2 = Array.newInstance((Class<?>) c, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) f.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                er1.m(e2);
                return null;
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            er1.m(e3);
            return null;
        }
    }

    @Override // defpackage.vr1
    public Typeface f(Context context, ib1[] ib1VarArr, int i) {
        File file;
        Typeface typefaceCreateFromFile;
        if (ib1VarArr.length >= 1) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(vr1.p(ib1VarArr, i).a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        try {
                            String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
                            file = OsConstants.S_ISREG(Os.stat(str).st_mode) ? new File(str) : null;
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (ErrnoException unused) {
                    }
                    if (file != null && file.canRead()) {
                        Typeface typefaceCreateFromFile2 = Typeface.createFromFile(file);
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceCreateFromFile2;
                    }
                    FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    try {
                        File fileC = wr1.C(context);
                        if (fileC == null) {
                            typefaceCreateFromFile = null;
                        } else {
                            try {
                                if (wr1.l(fileC, fileInputStream)) {
                                    typefaceCreateFromFile = Typeface.createFromFile(fileC.getPath());
                                    fileC.delete();
                                } else {
                                    fileC.delete();
                                    typefaceCreateFromFile = null;
                                }
                            } catch (RuntimeException unused2) {
                            } catch (Throwable th3) {
                                fileC.delete();
                                throw th3;
                            }
                        }
                        fileInputStream.close();
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceCreateFromFile;
                    } catch (Throwable th4) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                }
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
            } catch (IOException unused3) {
            }
        }
        return null;
    }
}
