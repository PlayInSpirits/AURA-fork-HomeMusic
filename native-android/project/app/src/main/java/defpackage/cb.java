package defpackage;

import android.view.View;
import android.view.translation.ViewTranslationCallback;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cb implements ViewTranslationCallback {
    public static final cb a = null;

    static {
        a = new cb();
    }

    public final boolean onClearTranslation(View r13) {
        r13.getClass();
        lb r12 = ((ra) r13).getContentCaptureManager$ui();
        r12.getClass();
        r12.s = jb.n;
        e02 r14 = r12.d();
        Object[] r15 = r14.c;
        long[] r16 = r14.a;
        int r0 = r16.length - 2;
        if (r0 < 0) goto L28;
        int r2 = 0;
    L5:
        long r3 = r16[r2];
        if (((((~r3) << 7) & r3) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L26;
        int r5 = 8 - ((~(r2 - r0)) >>> 31);
        int r7 = 0;
    L8:
        if (r7 >= r5) goto L25;
        if ((255 & r3) >= 128) goto L24;
        w03 r8 = ((k94) r15[(r2 << 3) + r7]).a.d.n;
        Object r9 = r8.g(n94.B);
        Object r10 = null;
        if (r9 != null) goto L14;
        r9 = null;
    L14:
        if (r9 == null) goto L24;
        Object r11 = r8.g(d94.n);
        if (r11 == null) goto L19;
        r10 = r11;
    L19:
        w2 r17 = (w2) r10;
        if (r17 == null) goto L24;
        gf1 r18 = (gf1) r17.b;
        if (r18 == null) goto L24;
        Boolean r19 = (Boolean) r18.invoke();
    L24:
        r3 = r3 >> 8;
        r7 = r7 + 1;
        goto L8
    L25:
        if (r5 == 8) goto L26;
        return true;
    L26:
        if (r2 == r0) goto L39;
        r2 = r2 + 1;
        goto L5
    L39:
        return true;
    L28:
        return true;
    }

    public final boolean onHideTranslation(View r13) {
        r13.getClass();
        lb r12 = ((ra) r13).getContentCaptureManager$ui();
        r12.getClass();
        r12.s = jb.n;
        e02 r14 = r12.d();
        Object[] r15 = r14.c;
        long[] r16 = r14.a;
        int r0 = r16.length - 2;
        if (r0 < 0) goto L29;
        int r2 = 0;
    L5:
        long r3 = r16[r2];
        if (((((~r3) << 7) & r3) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L27;
        int r5 = 8 - ((~(r2 - r0)) >>> 31);
        int r7 = 0;
    L8:
        if (r7 >= r5) goto L26;
        if ((255 & r3) >= 128) goto L25;
        w03 r8 = ((k94) r15[(r2 << 3) + r7]).a.d.n;
        Object r9 = r8.g(n94.B);
        Object r10 = null;
        if (r9 != null) goto L15;
        r9 = null;
    L15:
        if (h12.c(r9, Boolean.TRUE) == false) goto L25;
        Object r11 = r8.g(d94.m);
        if (r11 == null) goto L20;
        r10 = r11;
    L20:
        w2 r17 = (w2) r10;
        if (r17 == null) goto L25;
        if1 r18 = (if1) r17.b;
        if (r18 == null) goto L25;
        Boolean r19 = (Boolean) r18.invoke(Boolean.FALSE);
    L25:
        r3 = r3 >> 8;
        r7 = r7 + 1;
        goto L8
    L26:
        if (r5 == 8) goto L27;
        return true;
    L27:
        if (r2 == r0) goto L40;
        r2 = r2 + 1;
        goto L5
    L40:
        return true;
    L29:
        return true;
    }

    public final boolean onShowTranslation(View r13) {
        r13.getClass();
        lb r12 = ((ra) r13).getContentCaptureManager$ui();
        r12.getClass();
        r12.s = jb.o;
        e02 r14 = r12.d();
        Object[] r15 = r14.c;
        long[] r16 = r14.a;
        int r0 = r16.length - 2;
        if (r0 < 0) goto L29;
        int r2 = 0;
    L5:
        long r3 = r16[r2];
        if (((((~r3) << 7) & r3) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L27;
        int r5 = 8 - ((~(r2 - r0)) >>> 31);
        int r7 = 0;
    L8:
        if (r7 >= r5) goto L26;
        if ((255 & r3) >= 128) goto L25;
        w03 r8 = ((k94) r15[(r2 << 3) + r7]).a.d.n;
        Object r9 = r8.g(n94.B);
        Object r10 = null;
        if (r9 != null) goto L15;
        r9 = null;
    L15:
        if (h12.c(r9, Boolean.FALSE) == false) goto L25;
        Object r11 = r8.g(d94.m);
        if (r11 == null) goto L20;
        r10 = r11;
    L20:
        w2 r17 = (w2) r10;
        if (r17 == null) goto L25;
        if1 r18 = (if1) r17.b;
        if (r18 == null) goto L25;
        Boolean r19 = (Boolean) r18.invoke(Boolean.TRUE);
    L25:
        r3 = r3 >> 8;
        r7 = r7 + 1;
        goto L8
    L26:
        if (r5 == 8) goto L27;
        return true;
    L27:
        if (r2 == r0) goto L40;
        r2 = r2 + 1;
        goto L5
    L40:
        return true;
    L29:
        return true;
    }
}
