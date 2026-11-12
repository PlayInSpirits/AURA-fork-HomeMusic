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
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class f34 {
    public static final void a(View view, int i) {
        view.getClass();
        int iW = xa3.w(i);
        if (iW == 0) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                if (ld1.I(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (iW == 1) {
            if (ld1.I(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            view.setVisibility(0);
            return;
        }
        if (iW == 2) {
            if (ld1.I(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
            return;
        }
        if (iW != 3) {
            return;
        }
        if (ld1.I(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
        }
        view.setVisibility(4);
    }

    public static Number b(int i, l32 l32Var) throws MalformedJsonException {
        if (i == 1) {
            return Double.valueOf(l32Var.T());
        }
        if (i == 2) {
            return new q72(l32Var.c0());
        }
        if (i != 3) {
            String strC0 = l32Var.c0();
            try {
                return new BigDecimal(strC0);
            } catch (NumberFormatException e) {
                StringBuilder sbJ = xa3.j("Cannot parse ", strC0, "; at path ");
                sbJ.append(l32Var.H());
                throw new JsonParseException(sbJ.toString(), e);
            }
        }
        String strC1 = l32Var.c0();
        try {
            try {
                return Long.valueOf(Long.parseLong(strC1));
            } catch (NumberFormatException e2) {
                StringBuilder sbJ2 = xa3.j("Cannot parse ", strC1, "; at path ");
                sbJ2.append(l32Var.H());
                throw new JsonParseException(sbJ2.toString(), e2);
            }
        } catch (NumberFormatException unused) {
            Double dValueOf = Double.valueOf(strC1);
            if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                if (!l32Var.o) {
                    throw new MalformedJsonException("JSON forbids NaN and infinities: " + dValueOf + "; at path " + l32Var.H());
                }
            }
            return dValueOf;
        }
    }

    public static final boolean c(int i) {
        return i == 3 || i == 4 || i == 6;
    }

    public static int d(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    public static int e(String str, int i, int i2) {
        return (str.hashCode() + i) * i2;
    }

    public static String f(int i, String str) {
        return str + i;
    }

    public static String g(String str, rq4 rq4Var, String str2, rq4 rq4Var2) {
        return str + rq4Var + str2 + rq4Var2;
    }

    public static String h(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String i(StringBuilder sb, int i, String str) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    public static StringBuilder j(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static HashSet k(HashMap map, String str, oq4 oq4Var, int i) {
        map.put(str, oq4Var);
        return new HashSet(i);
    }

    public static void l(sb1 sb1Var, wv4 wv4Var) {
        wv4Var.g(new tb1(sb1Var));
    }

    public static /* synthetic */ void m(AutoCloseable autoCloseable) throws Exception {
        boolean zIsTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            }
            if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            } else if (autoCloseable instanceof MediaDrm) {
                ((MediaDrm) autoCloseable).release();
                return;
            } else {
                nz2.c();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static void n(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static /* synthetic */ String o(int i) {
        if (i == 1) {
            return "NONE";
        }
        if (i != 2) {
            return i != 3 ? "null" : "REMOVING";
        }
        return "ADDING";
    }

    public static /* synthetic */ String p(int i) {
        if (i == 1) {
            return "REMOVED";
        }
        if (i == 2) {
            return "VISIBLE";
        }
        if (i != 3) {
            return i != 4 ? "null" : "INVISIBLE";
        }
        return "GONE";
    }

    public static /* synthetic */ String q(int i) {
        switch (i) {
            case 1:
                return "ENQUEUED";
            case 2:
                return "RUNNING";
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return "SUCCEEDED";
            case 4:
                return "FAILED";
            case 5:
                return "BLOCKED";
            case 6:
                return "CANCELLED";
            default:
                return "null";
        }
    }
}
