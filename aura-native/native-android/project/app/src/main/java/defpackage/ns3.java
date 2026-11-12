package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.util.LruCache;
import com.eddyizm.tempus.database.AppDatabase;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ns3 implements xs {
    public final /* synthetic */ int n;
    public Object o;
    public Object p;
    public Object q;

    public ns3(int i) {
        this.n = i;
        switch (i) {
            case 6:
                kf2 kf2Var = kf2.o;
                this.o = new HashSet();
                this.p = kf2Var;
                break;
            case 7:
                break;
            default:
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new h5(0));
                this.o = new HashMap();
                this.p = new ReferenceQueue();
                executorServiceNewSingleThreadExecutor.execute(new g5(1, this));
                break;
        }
    }

    public static void d() {
        if (Build.VERSION.SDK_INT >= 29) {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }

    public synchronized void a(f42 f42Var, o11 o11Var) {
        i5 i5Var = (i5) ((HashMap) this.o).put(f42Var, new i5(f42Var, o11Var, (ReferenceQueue) this.p));
        if (i5Var != null) {
            i5Var.c = null;
            i5Var.clear();
        }
    }

    public void b(i5 i5Var) {
        q04 q04Var;
        synchronized (this) {
            ((HashMap) this.o).remove(i5Var.a);
            if (i5Var.b && (q04Var = i5Var.c) != null) {
                ((i11) this.q).e(i5Var.a, new o11(q04Var, true, false, i5Var.a, (i11) this.q));
            }
        }
    }

    public List c() {
        return (List) xl.E((s24) this.o, true, false, new ms3(this));
    }

    public void e(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!((HashSet) this.o).remove(mediaCodec) || (loudnessCodecController = (LoudnessCodecController) this.q) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public void f(int i) {
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) this.q;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.q = null;
        }
        LoudnessCodecController loudnessCodecControllerCreate = LoudnessCodecController.create(i, gq0.n, new jf2(this));
        this.q = loudnessCodecControllerCreate;
        Iterator it = ((HashSet) this.o).iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }

    @Override // defpackage.xs
    public ic2 g(Uri uri) {
        uri.getClass();
        Bitmap bitmap = (Bitmap) ((LruCache) this.p).get(uri);
        if (bitmap != null) {
            return new mw1(bitmap);
        }
        lb4 lb4Var = new lb4();
        ((ExecutorService) this.q).execute(new qo2(this, uri, lb4Var, 16));
        return lb4Var;
    }

    public void h(Object obj, String str) {
        c12 c12Var = new c12(11);
        ((c12) this.q).q = c12Var;
        this.q = c12Var;
        c12Var.p = obj;
        c12Var.o = str;
    }

    @Override // defpackage.xs
    public ic2 j(byte[] bArr) {
        bArr.getClass();
        try {
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
            if (bitmapDecodeByteArray != null) {
                return new mw1(bitmapDecodeByteArray);
            }
            IOException iOException = new IOException("BitmapFactory returned null for " + bArr.length + "B");
            lw1 lw1Var = new lw1();
            lw1Var.m(iOException);
            return lw1Var;
        } catch (Exception e) {
            Log.w("SyncBitmapLoader", "decodeBitmap failed", e);
            lw1 lw1Var2 = new lw1();
            lw1Var2.m(e);
            return lw1Var2;
        }
    }

    public String toString() {
        switch (this.n) {
            case 9:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.o);
                sb.append('{');
                c12 c12Var = (c12) ((c12) this.p).q;
                String str = "";
                while (c12Var != null) {
                    Object obj = c12Var.p;
                    sb.append(str);
                    String str2 = (String) c12Var.o;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    c12Var = (c12) c12Var.q;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public ns3(String str) {
        this.n = 9;
        c12 c12Var = new c12(11);
        this.p = c12Var;
        this.q = c12Var;
        this.o = str;
    }

    public ns3(Context context) {
        this.n = 8;
        this.o = context;
        this.p = new LruCache(20);
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(2);
        executorServiceNewFixedThreadPool.getClass();
        this.q = executorServiceNewFixedThreadPool;
    }

    public /* synthetic */ ns3(Object obj, Object obj2, Object obj3, int i) {
        this.n = i;
        this.o = obj;
        this.p = obj2;
        this.q = obj3;
    }

    public ns3(AppDatabase appDatabase) {
        this.n = 0;
        this.q = new i80(22);
        this.o = appDatabase;
        this.p = new q20(7, this);
    }
}
