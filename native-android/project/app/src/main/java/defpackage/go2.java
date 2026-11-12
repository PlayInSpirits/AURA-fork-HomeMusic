package defpackage;

import android.app.ForegroundServiceStartNotAllowedException;
import android.graphics.Point;
import android.graphics.Rect;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.TrackChangeEvent;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.window.SplashScreenView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class go2 {
    public static /* synthetic */ NetworkEvent.Builder e() {
        return new NetworkEvent.Builder();
    }

    public static /* synthetic */ PlaybackErrorEvent.Builder f() {
        return new PlaybackErrorEvent.Builder();
    }

    public static /* synthetic */ TrackChangeEvent.Builder g(int i) {
        return new TrackChangeEvent.Builder(i);
    }

    public static /* synthetic */ ScrollCaptureTarget h(ra raVar, Rect rect, Point point, ScrollCaptureCallback scrollCaptureCallback) {
        return new ScrollCaptureTarget(raVar, rect, point, scrollCaptureCallback);
    }

    public static /* bridge */ /* synthetic */ SplashScreenView j(View view) {
        return (SplashScreenView) view;
    }

    public static /* bridge */ /* synthetic */ boolean x(View view) {
        return view instanceof SplashScreenView;
    }

    public static /* bridge */ /* synthetic */ boolean y(IllegalStateException illegalStateException) {
        return illegalStateException instanceof ForegroundServiceStartNotAllowedException;
    }
}
