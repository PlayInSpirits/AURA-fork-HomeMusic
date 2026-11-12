package defpackage;

import android.graphics.Paint;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class hc {
    public static final /* synthetic */ int[] a = null;
    public static final /* synthetic */ int[] b = null;

    static {
        int[] r0 = new int[Paint.Style.values().length];
        r0[Paint.Style.STROKE.ordinal()] = 1;     // Catch: NoSuchFieldError -> L16
    L4:
        int[] r1 = new int[Paint.Cap.values().length];
        r1[Paint.Cap.BUTT.ordinal()] = 1;     // Catch: NoSuchFieldError -> L17
    L25:
        r1[Paint.Cap.ROUND.ordinal()] = 2;     // Catch: NoSuchFieldError -> L18
    L31:
        r1[Paint.Cap.SQUARE.ordinal()] = 3;     // Catch: NoSuchFieldError -> L19
    L10:
        a = r1;
        int[] r2 = new int[Paint.Join.values().length];
        r2[Paint.Join.MITER.ordinal()] = 1;     // Catch: NoSuchFieldError -> L20
    L27:
        r2[Paint.Join.BEVEL.ordinal()] = 2;     // Catch: NoSuchFieldError -> L21
    L33:
        r2[Paint.Join.ROUND.ordinal()] = 3;     // Catch: NoSuchFieldError -> L22
    L14:
        b = r2;
    }
}
