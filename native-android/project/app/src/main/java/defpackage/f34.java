package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.gson.JsonParseException;
import com.google.gson.stream.MalformedJsonException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class f34 {
    public static final void a(View r4, int r5) {
        r4.getClass();
        int r6 = xa3.w(r5);
        if (r6 != 0) goto L5;
        ViewParent r7 = r4.getParent();
        if ((r7 instanceof ViewGroup) == false) goto L28;
        ViewGroup r8 = (ViewGroup) r7;
    L29:
        if (r8 != null) goto L31;
        return;
    L31:
        if (ld1.I(2) == false) goto L33;
        Log.v("FragmentManager", "SpecialEffectsController: Removing view " + r4 + " from container " + r8);
    L33:
        r8.removeView(r4);
        return;
    L28:
        r8 = null;
        goto L29
    L5:
        if (r6 == 1) goto L21;
        if (r6 == 2) goto L16;
        if (r6 == 3) goto L11;
        return;
    L11:
        if (ld1.I(2) == false) goto L13;
        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + r4 + " to INVISIBLE");
    L13:
        r4.setVisibility(4);
        return;
    L16:
        if (ld1.I(2) == false) goto L18;
        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + r4 + " to GONE");
    L18:
        r4.setVisibility(8);
        return;
    L21:
        if (ld1.I(2) == false) goto L23;
        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + r4 + " to VISIBLE");
    L23:
        r4.setVisibility(0);
    }

    public static Number b(int r6, l32 r7) {
        if (r6 == 1) goto L35;
        if (r6 == 2) goto L33;
        if (r6 == 3) goto L14;
        String r8 = r7.c0();
        return new BigDecimal(r8);
    L11:
        e = move-exception;
        StringBuilder r9 = xa3.j("Cannot parse ", r8, "; at path ");
        r9.append(r7.H());
        throw new JsonParseException(r9.toString(), e);
    L14:
        String r0 = r7.c0();
        return Long.valueOf(Long.parseLong(r0));
    L17:
        Double r3 = Double.valueOf(r0);     // Catch: NumberFormatException -> L22
        if (r3.isInfinite() == true) goto L25;
        if (r3.isNaN() == true) goto L25;
    L27:
        return r3;
    L25:
        if (r7.o == true) goto L27;
        throw new MalformedJsonException("JSON forbids NaN and infinities: " + r3 + "; at path " + r7.H());     // Catch: NumberFormatException -> L22
    L22:
        e = move-exception;
        StringBuilder r1 = xa3.j("Cannot parse ", r0, "; at path ");
        r1.append(r7.H());
        throw new JsonParseException(r1.toString(), e);
    L33:
        return new q72(r7.c0());
    L35:
        return Double.valueOf(r7.T());
    }

    public static final boolean c(int r1) {
        if (r1 != 3) goto L5;
        return true;
    L5:
        if (r1 != 4) goto L7;
        return true;
    L7:
        if (r1 == 6) goto L14;
        return false;
    L14:
        return true;
    }

    public static int d(int r0, int r1, int r2) {
        return (Integer.hashCode(r0) + r1) * r2;
    }

    public static int e(String r0, int r1, int r2) {
        return (r0.hashCode() + r1) * r2;
    }

    public static String f(int r1, String r2) {
        return r2 + r1;
    }

    public static String g(String r1, rq4 r2, String r3, rq4 r4) {
        return r1 + r2 + r3 + r4;
    }

    public static String h(String r1, String r2, String r3, String r4, String r5) {
        return r1 + r2 + r3 + r4 + r5;
    }

    public static String i(StringBuilder r0, int r1, String r2) {
        r0.append(r1);
        r0.append(r2);
        return r0.toString();
    }

    public static StringBuilder j(int r1, String r2, String r3) {
        StringBuilder r0 = new StringBuilder(r2);
        r0.append(r1);
        r0.append(r3);
        return r0;
    }

    public static HashSet k(HashMap r0, String r1, oq4 r2, int r3) {
        r0.put(r1, r2);
        return new HashSet(r3);
    }

    public static void l(sb1 r1, wv4 r2) {
        r2.g(new tb1(r1));
    }

    public static /* synthetic */ void m(AutoCloseable r5) {
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

    public static void n(StringBuilder r0, String r1, String r2, String r3, String r4) {
        r0.append(r1);
        r0.append(r2);
        r0.append(r3);
        r0.append(r4);
    }

    public static /* synthetic */ String o(int r1) {
        if (r1 != 1) goto L5;
        return "NONE";
    L5:
        if (r1 != 2) goto L7;
        return "ADDING";
    L7:
        if (r1 == 3) goto L10;
        return "null";
    L10:
        return "REMOVING";
    }

    public static /* synthetic */ String p(int r1) {
        if (r1 != 1) goto L5;
        return "REMOVED";
    L5:
        if (r1 != 2) goto L7;
        return "VISIBLE";
    L7:
        if (r1 != 3) goto L9;
        return "GONE";
    L9:
        if (r1 == 4) goto L12;
        return "null";
    L12:
        return "INVISIBLE";
    }

    public static /* synthetic */ String q(int r0) {
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
        return "CANCELLED";
    L7:
        return "BLOCKED";
    L9:
        return "FAILED";
    L11:
        return "SUCCEEDED";
    L13:
        return "RUNNING";
    L15:
        return "ENQUEUED";
    }
}
