package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.Region;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.os.Trace;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.media3.common.ParserException;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import app.homemusic.R;
import com.eddyizm.tempus.homemusic.WaveRetry;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class wr1 {
    public static final z95 a = new z95(0.31006f, 0.31616f);
    public static final z95 b = new z95(0.34567f, 0.3585f);
    public static final z95 c = new z95(0.32168f, 0.33767f);
    public static final z95 d = new z95(0.31271f, 0.32902f);
    public static final float[] e = {0.964212f, 1.0f, 0.825188f};
    public static final wv3 f = new wv3(0.0f, 0.0f, 10.0f, 10.0f);
    public static Field g = null;
    public static boolean h = false;
    public static boolean i = true;

    public static final ho3 A(View view) {
        ho3 ho3Var = (ho3) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (ho3Var != null) {
            return ho3Var;
        }
        ho3 ho3Var2 = new ho3();
        view.setTag(R.id.pooling_container_listener_holder_tag, ho3Var2);
        return ho3Var2;
    }

    public static File C(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i2 = 0; i2 < 100; i2++) {
            File file = new File(cacheDir, str + i2);
            try {
                if (file.createNewFile()) {
                    return file;
                }
            } catch (IOException unused) {
            }
        }
        return null;
    }

    public static final boolean E(AssertionError assertionError) {
        Logger logger = p83.a;
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? qm4.o0(message, "getsockname failed") : false) {
                return true;
            }
        }
        return false;
    }

    public static final boolean F(KeyEvent keyEvent) {
        long jA = fh0.a(keyEvent.getKeyCode());
        return g42.a(jA, g42.h) || g42.a(jA, g42.k) || g42.a(jA, g42.o) || g42.a(jA, g42.j);
    }

    public static final boolean H(i94 i94Var) {
        f63 f63VarD = i94Var.d();
        w03 w03Var = i94Var.d.n;
        return (f63VarD != null ? f63VarD.J0() : false) || w03Var.c(n94.p) || w03Var.c(n94.o);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0059 A[LOOP:0: B:11:0x001d->B:24:0x0059, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x005c A[SYNTHETIC] */
    public static final boolean I(i94 i94Var) {
        if (!H(i94Var)) {
            e94 e94Var = i94Var.d;
            if (e94Var.p) {
                return true;
            }
            w03 w03Var = e94Var.n;
            Object[] objArr = w03Var.b;
            Object[] objArr2 = w03Var.c;
            long[] jArr = w03Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j) < 128) {
                                int i5 = (i2 << 3) + i4;
                                Object obj = objArr[i5];
                                Object obj2 = objArr2[i5];
                                if (((p94) obj).c) {
                                    return true;
                                }
                            }
                            j >>= 8;
                        }
                        if (i3 == 8) {
                            if (i2 != length) {
                                i2++;
                            }
                        }
                    } else if (i2 != length) {
                        i2++;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean K(g34 g34Var) {
        long j = g34Var.e;
        return (j >>> 32) == (4294967295L & j) && j == g34Var.f && j == g34Var.g && j == g34Var.h;
    }

    public static mx2 M(ExecutorService executorService) {
        if (executorService instanceof mx2) {
            return (mx2) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new px2((ScheduledExecutorService) executorService) : new mx2(executorService);
    }

    public static MappedByteBuffer N(Context context, Uri uri) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return map;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (IOException unused) {
        }
    }

    public static void O(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static final void P(cz czVar, vd0 vd0Var, boolean z) {
        Object objS = czVar.s();
        Throwable thE = czVar.e(objS);
        Object s14Var = thE != null ? new s14(thE) : czVar.f(objS);
        if (!z) {
            vd0Var.resumeWith(s14Var);
            return;
        }
        vd0Var.getClass();
        mr0 mr0Var = (mr0) vd0Var;
        wd0 wd0Var = mr0Var.r;
        Object obj = mr0Var.t;
        ne0 context = wd0Var.getContext();
        Object objR = te5.R(context, obj);
        f15 f15VarQ = objR != te5.b ? jz4.Q(wd0Var, context, objR) : null;
        try {
            wd0Var.resumeWith(s14Var);
        } finally {
            if (f15VarQ == null || f15VarQ.m0()) {
                te5.K(context, objR);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0025  */
    public static final int Q(b94 b94Var, int i2) {
        int i3;
        int[] iArr = b94Var.s;
        int i4 = i2 + 1;
        int length = b94Var.r.length;
        iArr.getClass();
        int i5 = length - 1;
        int i6 = 0;
        while (i6 <= i5) {
            i3 = (i6 + i5) >>> 1;
            int i7 = iArr[i3];
            if (i7 < i4) {
                i6 = i3 + 1;
            } else {
                if (i7 <= i4) {
                    if (i3 >= 0) {
                        return i3;
                    }
                    return ~i3;
                }
                i5 = i3 - 1;
            }
        }
        i3 = (-i6) - 1;
        if (i3 >= 0) {
            return i3;
        }
        return ~i3;
    }

    public static final g34 a(float f2, float f3, float f4, float f5, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
        return new g34(f2, f3, f4, f5, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits);
    }

    public static final ExecutorService b(boolean z) {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new s90(z));
        executorServiceNewFixedThreadPool.getClass();
        return executorServiceNewFixedThreadPool;
    }

    public static final wv3 c(q62 q62Var) {
        q62 q62VarU = q62Var.u();
        return q62VarU != null ? q62VarU.C(q62Var, true) : new wv3(0.0f, 0.0f, (int) (q62Var.k() >> 32), (int) (q62Var.k() & 4294967295L));
    }

    public static final wv3 d(q62 q62Var, boolean z) {
        q62 q62VarN = n(q62Var);
        float fK = (int) (q62VarN.k() >> 32);
        float fK2 = (int) (q62VarN.k() & 4294967295L);
        wv3 wv3VarC = q62VarN.C(q62Var, z);
        float f2 = wv3VarC.a;
        if (z) {
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            if (f2 > fK) {
                f2 = fK;
            }
        }
        float f3 = wv3VarC.b;
        if (z) {
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            if (f3 > fK2) {
                f3 = fK2;
            }
        }
        float f4 = wv3VarC.c;
        if (z) {
            if (f4 < 0.0f) {
                f4 = 0.0f;
            }
            if (f4 <= fK) {
                fK = f4;
            }
            f4 = fK;
        }
        float f5 = wv3VarC.d;
        if (z) {
            float f6 = f5 >= 0.0f ? f5 : 0.0f;
            if (f6 <= fK2) {
                fK2 = f6;
            }
            f5 = fK2;
        }
        if (f2 == f4 || f3 == f5) {
            return wv3.e;
        }
        long jB = q62VarN.b((((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L));
        long jB2 = q62VarN.b((((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L));
        long jB3 = q62VarN.b((((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L));
        long jB4 = q62VarN.b((((long) Float.floatToRawIntBits(f5)) & 4294967295L) | (((long) Float.floatToRawIntBits(f2)) << 32));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jB >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jB2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jB4 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jB3 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jB & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jB2 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jB4 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jB3 & 4294967295L));
        return new wv3(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    public static final void g(View view) {
        view.getClass();
        ba4 ba4VarC = si0.C(new sb(view, null, 1));
        while (ba4VarC.hasNext()) {
            ArrayList arrayList = A((View) ba4VarC.next()).a;
            for (int iE = gb.E(arrayList); -1 < iE; iE--) {
                ((k65) arrayList.get(iE)).a.d();
            }
        }
    }

    public static final void h(sc5 sc5Var, String str) {
        td5 td5VarB;
        WorkDatabase workDatabase = sc5Var.c;
        workDatabase.getClass();
        fd5 fd5VarA = workDatabase.A();
        wo0 wo0VarV = workDatabase.v();
        ArrayList arrayListQ = gb.Q(str);
        while (!arrayListQ.isEmpty()) {
            String str2 = (String) v40.q0(arrayListQ);
            int iG = fd5VarA.g(str2);
            if (iG != 3 && iG != 4) {
                WorkDatabase_Impl workDatabase_Impl = fd5VarA.a;
                workDatabase_Impl.b();
                aq4 aq4Var = fd5VarA.e;
                df1 df1VarA = aq4Var.a();
                df1VarA.h(1, str2);
                try {
                    workDatabase_Impl.c();
                    try {
                        df1VarA.b();
                        workDatabase_Impl.t();
                        workDatabase_Impl.o();
                        aq4Var.h(df1VarA);
                    } catch (Throwable th) {
                        workDatabase_Impl.o();
                        throw th;
                    }
                } catch (Throwable th2) {
                    aq4Var.h(df1VarA);
                    throw th2;
                }
            }
            arrayListQ.addAll(wo0VarV.w(str2));
        }
        pq3 pq3Var = sc5Var.f;
        pq3Var.getClass();
        synchronized (pq3Var.k) {
            cx.f().b(pq3.l, "Processor cancelling " + str);
            pq3Var.i.add(str);
            td5VarB = pq3Var.b(str);
        }
        pq3.d(str, td5VarB, 1);
        Iterator it = sc5Var.e.iterator();
        while (it.hasNext()) {
            ((a64) it.next()).d(str);
        }
    }

    public static void i(String str, boolean z) throws ParserException {
        if (!z) {
            throw ParserException.a(null, str);
        }
    }

    public static dx2 j(dx2 dx2Var, gf1 gf1Var) {
        return dx2Var.c(new t30(gf1Var));
    }

    public static boolean k(File file, Resources resources, int i2) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i2);
            try {
                boolean zL = l(file, inputStreamOpenRawResource);
                if (inputStreamOpenRawResource != null) {
                    try {
                        inputStreamOpenRawResource.close();
                    } catch (IOException unused) {
                    }
                }
                return zL;
            } catch (Throwable th) {
                th = th;
                if (inputStreamOpenRawResource != null) {
                    try {
                        inputStreamOpenRawResource.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenRawResource = null;
        }
    }

    public static boolean l(File file, InputStream inputStream) throws Throwable {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i2 = inputStream.read(bArr);
                        if (i2 != -1) {
                            fileOutputStream2.write(bArr, 0, i2);
                        } else {
                            try {
                                break;
                            } catch (IOException unused) {
                            }
                        }
                    }
                    fileOutputStream2.close();
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return true;
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static Handler m(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return ne.b(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e2) {
            e = e2;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e3) {
            e = e3;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e4) {
            e = e4;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e5) {
            Throwable cause = e5.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            er1.m(cause);
            return null;
        }
    }

    public static final q62 n(q62 q62Var) {
        q62 q62Var2;
        q62 q62VarU = q62Var.u();
        while (true) {
            q62 q62Var3 = q62VarU;
            q62Var2 = q62Var;
            q62Var = q62Var3;
            if (q62Var == null) {
                break;
            }
            q62VarU = q62Var.u();
        }
        f63 f63Var = q62Var2 instanceof f63 ? (f63) q62Var2 : null;
        if (f63Var == null) {
            return q62Var2;
        }
        f63 f63Var2 = f63Var.J;
        while (true) {
            f63 f63Var3 = f63Var2;
            f63 f63Var4 = f63Var;
            f63Var = f63Var3;
            if (f63Var == null) {
                return f63Var4;
            }
            f63Var2 = f63Var.J;
        }
    }

    public static final i03 o(l94 l94Var, if1 if1Var) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            i94 i94VarA = l94Var.a();
            c72 c72Var = i94VarA.c;
            if (c72Var.H() && c72Var.G()) {
                wv3 wv3VarG = i94VarA.g();
                i03 i03Var = new i03(48);
                si1 si1Var = new si1(23);
                si1Var.L(rr2.Q(wv3VarG));
                r(if1Var, new si1(23), si1Var, i03Var, i94VarA, i94VarA);
                return i03Var;
            }
            i03 i03Var2 = f02.a;
            i03Var2.getClass();
            return i03Var2;
        } finally {
            Trace.endSection();
        }
    }

    public static final void p(if1 if1Var, si1 si1Var, si1 si1Var2, i03 i03Var, i94 i94Var, i94 i94Var2) {
        si1 si1Var3 = si1Var;
        Region region = (Region) si1Var3.o;
        si1 si1Var4 = si1Var2;
        Region region2 = (Region) si1Var4.o;
        c72 c72Var = i94Var2.c;
        c72 c72Var2 = i94Var2.c;
        if (!c72Var.H() || !c72Var2.G() || region2.isEmpty()) {
            if (i94Var2.o()) {
                q(i03Var, i94Var, i94Var2);
                return;
            }
            return;
        }
        wv3 wv3VarM = i94Var2.m();
        if (wv3VarM.d()) {
            eo0 eo0VarF = i94Var2.f();
            if (eo0VarF == null) {
                iz1 iz1Var = (iz1) c72Var2.Q.d;
                wv3VarM = n(iz1Var).C(iz1Var, false);
            } else {
                cx2 cx2Var = ((cx2) eo0VarF).n;
                Object objG = i94Var2.d.n.g(d94.b);
                if (objG == null) {
                    objG = null;
                }
                wv3VarM = fu.s(cx2Var, objG != null, false);
            }
        }
        k02 k02VarQ = rr2.Q(wv3VarM);
        si1Var3.L(k02VarQ);
        if (region.op(region2, Region.Op.INTERSECT)) {
            int i2 = i94Var2.f;
            i94 i94Var3 = i94Var;
            if (i2 == i94Var3.f) {
                i2 = -1;
            }
            Rect bounds = region.getBounds();
            k94 k94Var = new k94(i94Var2, new k02(bounds.left, bounds.top, bounds.right, bounds.bottom));
            i03 i03Var2 = i03Var;
            i03Var2.i(i2, k94Var);
            List listI = i94Var2.i((4 & 1) != 0 ? !i94Var2.b : false, (4 & 2) == 0);
            int size = listI.size() - 1;
            while (-1 < size) {
                if (!((Boolean) if1Var.invoke(listI.get(size))).booleanValue()) {
                    p(if1Var, si1Var3, si1Var4, i03Var2, i94Var3, (i94) listI.get(size));
                }
                size--;
                si1Var3 = si1Var;
                si1Var4 = si1Var2;
                i03Var2 = i03Var;
                i94Var3 = i94Var;
            }
            if (I(i94Var2)) {
                region2.op(k02VarQ.a, k02VarQ.b, k02VarQ.c, k02VarQ.d, Region.Op.DIFFERENCE);
            }
        }
    }

    public static final void q(i03 i03Var, i94 i94Var, i94 i94Var2) {
        c72 c72Var;
        i94 i94VarL = i94Var2.l();
        wv3 wv3VarG = (i94VarL == null || (c72Var = i94VarL.c) == null || !c72Var.H()) ? f : i94VarL.g();
        int i2 = i94Var2.f;
        if (i2 == i94Var.f) {
            i2 = -1;
        }
        i03Var.i(i2, new k94(i94Var2, rr2.Q(wv3VarG)));
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:77:0x015b  */
    /* JADX WARN: Code duplicated, block: B:80:0x0165  */
    /* JADX WARN: Code duplicated, block: B:82:0x0175  */
    /* JADX WARN: Code duplicated, block: B:83:0x0178  */
    public static final void r(if1 if1Var, si1 si1Var, si1 si1Var2, i03 i03Var, i94 i94Var, i94 i94Var2) {
        int size;
        boolean z;
        wv3 wv3VarS;
        if1 if1Var2 = if1Var;
        i94 i94Var3 = i94Var;
        int i2 = i94Var3.f;
        Region region = (Region) si1Var.o;
        si1 si1Var3 = si1Var2;
        Region region2 = (Region) si1Var3.o;
        c72 c72Var = i94Var2.c;
        e94 e94Var = i94Var2.d;
        c72 c72Var2 = i94Var2.c;
        int i3 = i94Var2.f;
        boolean z2 = (c72Var.H() && c72Var2.G()) ? false : true;
        if (!region2.isEmpty() || i3 == i2) {
            if (!z2 || i94Var2.o()) {
                k02 k02VarQ = rr2.Q(i94Var2.m());
                si1Var.L(k02VarQ);
                if (i3 == i2) {
                    i3 = -1;
                }
                if (!region.op(region2, Region.Op.INTERSECT)) {
                    if (i94Var2.o()) {
                        q(i03Var, i94Var, i94Var2);
                        return;
                    } else {
                        if (i3 == -1) {
                            Rect bounds = region.getBounds();
                            i03Var.i(i3, new k94(i94Var2, new k02(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                            return;
                        }
                        return;
                    }
                }
                Rect bounds2 = region.getBounds();
                i03Var.i(i3, new k94(i94Var2, new k02(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom)));
                List listI = i94Var2.i((4 & 1) != 0 ? !i94Var2.b : false, (4 & 2) == 0);
                if (e94Var.p) {
                    i94 i94VarL = i94Var2.l();
                    while (true) {
                        if (i94VarL == null) {
                            i94VarL = null;
                            break;
                        }
                        w03 w03Var = i94VarL.d.n;
                        if (w03Var.c(n94.v) || w03Var.c(n94.u)) {
                            break;
                        } else {
                            i94VarL = i94VarL.l();
                        }
                    }
                    if (i94VarL == null) {
                        z = false;
                    } else {
                        f63 f63VarD = i94Var2.d();
                        if (f63VarD == null) {
                            f63VarD = null;
                        } else {
                            if (!f63VarD.A0().A) {
                                f63VarD = null;
                            }
                            if (f63VarD == null) {
                                f63VarD = null;
                            }
                        }
                        f63 f63VarD2 = i94VarL.d();
                        if (f63VarD2 == null) {
                            f63VarD2 = null;
                        } else {
                            if (!f63VarD2.A0().A) {
                                f63VarD2 = null;
                            }
                            if (f63VarD2 == null) {
                                f63VarD2 = null;
                            }
                        }
                        if (f63VarD == null || f63VarD2 == null) {
                            z = false;
                        } else {
                            wv3 wv3VarC = f63VarD2.C(f63VarD, false);
                            z = !wv3VarC.equals(wv3VarC.c(bu.d(0L, l93.o0(f63VarD2.p))));
                        }
                    }
                    if (z) {
                        si1 si1Var4 = new si1(23);
                        eo0 eo0VarF = i94Var2.f();
                        if (eo0VarF == null) {
                            iz1 iz1Var = (iz1) c72Var2.Q.d;
                            wv3VarS = n(iz1Var).C(iz1Var, false);
                        } else {
                            cx2 cx2Var = ((cx2) eo0VarF).n;
                            Object objG = e94Var.n.g(d94.b);
                            wv3VarS = fu.s(cx2Var, (objG == null ? null : objG) != null, false);
                        }
                        si1Var4.L(rr2.Q(wv3VarS));
                        int size2 = listI.size() - 1;
                        while (-1 < size2) {
                            if (!((Boolean) if1Var2.invoke(listI.get(size2))).booleanValue()) {
                                p(if1Var2, new si1(23), si1Var4, i03Var, i94Var3, (i94) listI.get(size2));
                            }
                            size2--;
                            i94Var3 = i94Var;
                        }
                    } else {
                        size = listI.size() - 1;
                        while (-1 < size) {
                            if (((Boolean) if1Var2.invoke(listI.get(size))).booleanValue()) {
                                r(if1Var2, si1Var, si1Var3, i03Var, i94Var, (i94) listI.get(size));
                            }
                            size--;
                            if1Var2 = if1Var;
                            si1Var3 = si1Var2;
                        }
                    }
                } else {
                    size = listI.size() - 1;
                    while (-1 < size) {
                        if (((Boolean) if1Var2.invoke(listI.get(size))).booleanValue()) {
                            r(if1Var2, si1Var, si1Var3, i03Var, i94Var, (i94) listI.get(size));
                        }
                        size--;
                        if1Var2 = if1Var;
                        si1Var3 = si1Var2;
                    }
                }
                if (I(i94Var2)) {
                    region2.op(k02VarQ.a, k02VarQ.b, k02VarQ.c, k02VarQ.d, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    public static int w(int i2) {
        if (i2 == 20) {
            return 63750;
        }
        if (i2 == 30) {
            return 2250000;
        }
        switch (i2) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i2) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case WaveRetry.MAX_FAILURES /* 16 */:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        return -2147483647;
                }
        }
    }

    public abstract int B();

    public float D(View view) {
        if (i) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                i = false;
            }
        }
        return view.getAlpha();
    }

    public abstract boolean G(float f2);

    public abstract boolean J(View view);

    public abstract boolean L(float f2, float f3);

    public void R(View view, float f2) {
        if (i) {
            try {
                view.setTransitionAlpha(f2);
                return;
            } catch (NoSuchMethodError unused) {
                i = false;
            }
        }
        view.setAlpha(f2);
    }

    public abstract boolean S(View view, float f2);

    public abstract void T(ViewGroup.MarginLayoutParams marginLayoutParams, int i2);

    public abstract void U(ViewGroup.MarginLayoutParams marginLayoutParams, int i2, int i3);

    public abstract int e(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float f(int i2);

    public abstract int s(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract int t();

    public abstract int u();

    public abstract int v();

    public abstract int x();

    public abstract int y(View view);

    public abstract int z(CoordinatorLayout coordinatorLayout);
}
