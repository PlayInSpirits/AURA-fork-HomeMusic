package defpackage;

import java.net.Proxy;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class v90 {
    public static final /* synthetic */ int[] a = null;

    static {
        int[] r0 = new int[Proxy.Type.values().length];
        r0[Proxy.Type.DIRECT.ordinal()] = 1;     // Catch: NoSuchFieldError -> L7
    L9:
        r0[Proxy.Type.HTTP.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
    L5:
        a = r0;
    }
}
