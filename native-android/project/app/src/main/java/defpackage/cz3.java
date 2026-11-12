package defpackage;

import android.view.RenderNode;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class cz3 {
    public static int a(RenderNode r0) {
        return r0.getAmbientShadowColor();
    }

    public static int b(RenderNode r0) {
        return r0.getSpotShadowColor();
    }

    public static void c(RenderNode r0, int r1) {
        r0.setAmbientShadowColor(r1);
    }

    public static void d(RenderNode r0, int r1) {
        r0.setSpotShadowColor(r1);
    }
}
