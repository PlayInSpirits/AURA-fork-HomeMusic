package defpackage;

import android.content.Context;
import android.graphics.RenderNode;
import android.media.MediaCodecInfo;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class ek2 {
    public static /* synthetic */ RenderNode f() {
        return new RenderNode("AndroidEdgeEffectOverscrollEffect");
    }

    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint g() {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60);
    }

    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint h(int i, int i2, int i3) {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(i, i2, i3);
    }

    public static /* synthetic */ MediaSession i(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str, bundle);
    }

    public static /* synthetic */ WindowInsets.Builder k() {
        return new WindowInsets.Builder();
    }

    public static /* synthetic */ void m() {
    }
}
