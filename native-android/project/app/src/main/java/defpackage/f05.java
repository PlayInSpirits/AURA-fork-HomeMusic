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
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class f05 extends vr1 {
    public static final Class c;
    public static final Constructor d;
    public static final Method e;
    public static final Method f;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi24Impl", e2.getClass().getName(), e2);
            cls = null;
            method = null;
            method2 = null;
        }
        d = constructor;
        c = cls;
        e = method2;
        f = method;
    }

    public static boolean L(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) e.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface M(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) c, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // defpackage.vr1
    public final Typeface e(Context context, ya1 ya1Var, Resources resources, int i) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        MappedByteBuffer map;
        try {
            objNewInstance = d.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            for (za1 za1Var : ya1Var.a) {
                int i2 = za1Var.f;
                File fileC = wr1.C(context);
                if (fileC != null) {
                    try {
                        if (wr1.k(fileC, resources, i2)) {
                            try {
                                FileInputStream fileInputStream = new FileInputStream(fileC);
                                try {
                                    FileChannel channel = fileInputStream.getChannel();
                                    map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                    fileInputStream.close();
                                    fileC.delete();
                                } catch (Throwable th) {
                                    try {
                                        fileInputStream.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            } catch (IOException unused2) {
                                map = null;
                            }
                        } else {
                            fileC.delete();
                        }
                        if (map != null && L(objNewInstance, map, za1Var.e, za1Var.b, za1Var.c)) {
                        }
                    } catch (Throwable th3) {
                        fileC.delete();
                        throw th3;
                    }
                }
                map = null;
                if (map != null) {
                }
            }
            return M(objNewInstance);
        }
        return null;
    }

    @Override // defpackage.vr1
    public final Typeface f(Context context, ib1[] ib1VarArr, int i) {
        Object objNewInstance;
        try {
            objNewInstance = d.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            yd4 yd4Var = new yd4(0);
            for (ib1 ib1Var : ib1VarArr) {
                Uri uri = ib1Var.a;
                ByteBuffer byteBufferN = (ByteBuffer) yd4Var.get(uri);
                if (byteBufferN == null) {
                    byteBufferN = wr1.N(context, uri);
                    yd4Var.put(uri, byteBufferN);
                }
                if (byteBufferN != null && L(objNewInstance, byteBufferN, ib1Var.b, ib1Var.c, ib1Var.d)) {
                }
            }
            Typeface typefaceM = M(objNewInstance);
            if (typefaceM != null) {
                return Typeface.create(typefaceM, i);
            }
        }
        return null;
    }
}
