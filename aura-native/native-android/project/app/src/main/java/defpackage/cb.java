package defpackage;

import android.view.View;
import android.view.translation.ViewTranslationCallback;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cb implements ViewTranslationCallback {
    public static final cb a = new cb();

    public final boolean onClearTranslation(View view) {
        gf1 gf1Var;
        view.getClass();
        lb contentCaptureManager$ui = ((ra) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.s = jb.n;
        e02 e02VarD = contentCaptureManager$ui.d();
        Object[] objArr = e02VarD.c;
        long[] jArr = e02VarD.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        w03 w03Var = ((k94) objArr[(i << 3) + i3]).a.d.n;
                        Object objG = w03Var.g(n94.B);
                        if (objG == null) {
                            objG = null;
                        }
                        if (objG != null) {
                            Object objG2 = w03Var.g(d94.n);
                            w2 w2Var = (w2) (objG2 != null ? objG2 : null);
                            if (w2Var != null && (gf1Var = (gf1) w2Var.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean onHideTranslation(View view) {
        if1 if1Var;
        view.getClass();
        lb contentCaptureManager$ui = ((ra) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.s = jb.n;
        e02 e02VarD = contentCaptureManager$ui.d();
        Object[] objArr = e02VarD.c;
        long[] jArr = e02VarD.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        w03 w03Var = ((k94) objArr[(i << 3) + i3]).a.d.n;
                        Object objG = w03Var.g(n94.B);
                        if (objG == null) {
                            objG = null;
                        }
                        if (h12.c(objG, Boolean.TRUE)) {
                            Object objG2 = w03Var.g(d94.m);
                            w2 w2Var = (w2) (objG2 != null ? objG2 : null);
                            if (w2Var != null && (if1Var = (if1) w2Var.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean onShowTranslation(View view) {
        if1 if1Var;
        view.getClass();
        lb contentCaptureManager$ui = ((ra) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.s = jb.o;
        e02 e02VarD = contentCaptureManager$ui.d();
        Object[] objArr = e02VarD.c;
        long[] jArr = e02VarD.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        w03 w03Var = ((k94) objArr[(i << 3) + i3]).a.d.n;
                        Object objG = w03Var.g(n94.B);
                        if (objG == null) {
                            objG = null;
                        }
                        if (h12.c(objG, Boolean.FALSE)) {
                            Object objG2 = w03Var.g(d94.m);
                            w2 w2Var = (w2) (objG2 != null ? objG2 : null);
                            if (w2Var != null && (if1Var = (if1) w2Var.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }
}
