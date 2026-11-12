package defpackage;

import android.content.res.TypedArray;
import android.database.Cursor;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Parcel;
import com.eddyizm.tempus.App;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.KotlinNothingValueException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class xa3 implements py {
    public static final /* synthetic */ int[] n = null;

    static {
        n = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    }

    public static float a(float r0, float r1, float r2, float r3) {
        return ((r0 - r1) * r2) + r3;
    }

    public static int b(int r0, int r1, long r2) {
        return (Long.hashCode(r2) + r0) * r1;
    }

    public static int c(int r0, int r1, boolean r2) {
        return (Boolean.hashCode(r2) + r0) * r1;
    }

    public static ClassCastException d(Iterator r0) {
        r0.next().getClass();
        return new ClassCastException();
    }

    public static String e(int r1, int r2, String r3, String r4) {
        return r3 + r1 + r4 + r2;
    }

    public static String f(String r1, float r2, String r3, float r4, String r5) {
        return r1 + r2 + r3 + r4 + r5;
    }

    public static String g(String r1, String r2) {
        return r1 + r2;
    }

    public static String h(String r1, String r2, String r3) {
        return r1 + r2 + r3;
    }

    public static StringBuilder i(String r1) {
        StringBuilder r0 = new StringBuilder();
        r0.append(r1);
        return r0;
    }

    public static StringBuilder j(String r1, String r2, String r3) {
        StringBuilder r0 = new StringBuilder(r1);
        r0.append(r2);
        r0.append(r3);
        return r0;
    }

    public static KotlinNothingValueException l(String r0) {
        cz1.c(r0);
        return new KotlinNothingValueException();
    }

    public static void m(int r1, String r2, String r3) {
        l93.q0(r3, r2 + r1);
    }

    public static void n(int r0, HashMap r1, String r2, int r3, String r4) {
        r1.put(r2, Integer.valueOf(r0));
        r1.put(r4, Integer.valueOf(r3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void o(z34 r5) {
        if ((r5 instanceof AutoCloseable) == false) goto L7;
        r5.close();
        return;
    L7:
        if ((r5 instanceof ExecutorService) == false) goto L23;
        ExecutorService r6 = (ExecutorService) r5;
        if (r6 == ForkJoinPool.commonPool()) goto L46;
        boolean r0 = r6.isTerminated();
        if (r0 == true) goto L44;
        r6.shutdown();
        boolean r1 = false;
    L14:
        if (r0 == true) goto L19;
        r0 = r6.awaitTermination(1, TimeUnit.DAYS);     // Catch: InterruptedException -> L17
    L17:
        if (r1 == true) goto L14;
        r6.shutdownNow();
        r1 = true;
        goto L14
    L19:
        if (r1 == false) goto L45;
        Thread.currentThread().interrupt();
        return;
    L45:
        return;
    L44:
        return;
    L46:
        return;
    L23:
        if ((r5 instanceof TypedArray) == false) goto L27;
        ((TypedArray) r5).recycle();
        return;
    L27:
        if ((r5 instanceof MediaMetadataRetriever) == false) goto L31;
        ((MediaMetadataRetriever) r5).release();
        return;
    L31:
        if ((r5 instanceof MediaDrm) == false) goto L34;
        ((MediaDrm) r5).release();
        return;
    L34:
        nz2.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void p(Cursor r5) {
        if ((r5 instanceof AutoCloseable) == false) goto L7;
        r5.close();
        return;
    L7:
        if ((r5 instanceof ExecutorService) == false) goto L23;
        ExecutorService r6 = (ExecutorService) r5;
        if (r6 == ForkJoinPool.commonPool()) goto L46;
        boolean r0 = r6.isTerminated();
        if (r0 == true) goto L44;
        r6.shutdown();
        boolean r1 = false;
    L14:
        if (r0 == true) goto L19;
        r0 = r6.awaitTermination(1, TimeUnit.DAYS);     // Catch: InterruptedException -> L17
    L17:
        if (r1 == true) goto L14;
        r6.shutdownNow();
        r1 = true;
        goto L14
    L19:
        if (r1 == false) goto L45;
        Thread.currentThread().interrupt();
        return;
    L45:
        return;
    L44:
        return;
    L46:
        return;
    L23:
        if ((r5 instanceof TypedArray) == false) goto L27;
        ((TypedArray) r5).recycle();
        return;
    L27:
        if ((r5 instanceof MediaMetadataRetriever) == false) goto L31;
        ((MediaMetadataRetriever) r5).release();
        return;
    L31:
        if ((r5 instanceof MediaDrm) == false) goto L34;
        ((MediaDrm) r5).release();
        return;
    L34:
        nz2.c();
    }

    public static void q(Parcel r0, int r1, Integer r2) {
        r0.writeInt(r1);
        r0.writeInt(r2.intValue());
    }

    public static /* synthetic */ void r(Object r0) {
        if (r0 != null) goto L4;
        return;
    L4:
        kf2.k();
    }

    public static void s(String r1, String r2, String r3) {
        l93.q0(r3, r1 + r2);
    }

    public static void t(String r1, boolean r2) {
        App.b().getClass();
        App.c().edit().putBoolean(r1, r2).apply();
    }

    public static boolean u(String r1, boolean r2) {
        App.b().getClass();
        return App.c().getBoolean(r1, r2);
    }

    public static /* synthetic */ String v(int r0) {
        switch(r0) {
            case 1: goto L21;
            case 2: goto L19;
            case 3: goto L17;
            case 4: goto L15;
            case 5: goto L13;
            case 6: goto L11;
            case 7: goto L9;
            case 8: goto L7;
            case 9: goto L5;
            default: goto L4;
        };
    L5:
        return "CENTER_Y";
    L7:
        return "CENTER_X";
    L9:
        return "CENTER";
    L11:
        return "BASELINE";
    L13:
        return "BOTTOM";
    L15:
        return "RIGHT";
    L17:
        return "TOP";
    L19:
        return "LEFT";
    L21:
        return "NONE";
    L4:
        throw null;
    }

    public static /* synthetic */ int w(int r0) {
        if (r0 == 0) goto L6;
        return r0 - 1;
    L6:
        throw null;
    }

    public static /* synthetic */ String x(int r1) {
        if (r1 != 1) goto L5;
        return "LOCAL";
    L5:
        if (r1 != 2) goto L7;
        return "REMOTE";
    L7:
        if (r1 != 3) goto L9;
        return "DATA_DISK_CACHE";
    L9:
        if (r1 != 4) goto L11;
        return "RESOURCE_DISK_CACHE";
    L11:
        if (r1 == 5) goto L14;
        return "null";
    L14:
        return "MEMORY_CACHE";
    }

    public static /* synthetic */ String y(int r0) {
        switch(r0) {
            case 1: goto L15;
            case 2: goto L13;
            case 3: goto L11;
            case 4: goto L9;
            case 5: goto L7;
            case 6: goto L5;
            default: goto L3;
        };
    L3:
        return "null";
    L5:
        return "FINISHED";
    L7:
        return "ENCODE";
    L9:
        return "SOURCE";
    L11:
        return "DATA_CACHE";
    L13:
        return "RESOURCE_CACHE";
    L15:
        return "INITIALIZE";
    }

    public static /* synthetic */ int[] z(int r3) {
        int[] r0 = new int[r3];
        System.arraycopy(n, 0, r0, 0, r3);
        return r0;
    }
}
