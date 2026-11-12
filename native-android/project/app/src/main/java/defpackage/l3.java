package defpackage;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.content.res.loader.ResourcesLoader;
import android.content.res.loader.ResourcesProvider;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.RouteDiscoveryPreference;
import android.media.session.MediaController;
import android.os.Bundle;
import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import android.system.Os;
import android.util.CloseGuard;
import android.view.accessibility.AccessibilityNodeInfo;
import java.io.FileDescriptor;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class l3 {
    public static /* bridge */ /* synthetic */ boolean A(MediaRoute2Info r0) {
        return r0.isSystemRoute();
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction B() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
    }

    public static /* synthetic */ void C() {
    }

    public static /* bridge */ /* synthetic */ void D(CloseGuard r0) {
        r0.warnIfOpen();
    }

    public static /* bridge */ /* synthetic */ int a() {
        return IBinder.getSuggestedMaxIpcSizeBytes();
    }

    public static /* bridge */ /* synthetic */ int b(ApplicationExitInfo r0) {
        return r0.getReason();
    }

    public static /* bridge */ /* synthetic */ long c(ApplicationExitInfo r2) {
        return r2.getTimestamp();
    }

    public static /* bridge */ /* synthetic */ ApplicationExitInfo d(Object r0) {
        return (ApplicationExitInfo) r0;
    }

    public static /* synthetic */ ResourcesLoader e() {
        return new ResourcesLoader();
    }

    public static /* bridge */ /* synthetic */ ResourcesProvider f(ParcelFileDescriptor r1) {
        return ResourcesProvider.loadFromTable(r1, null);
    }

    public static /* bridge */ /* synthetic */ MediaRoute2Info g(Object r0) {
        return (MediaRoute2Info) r0;
    }

    public static /* synthetic */ RouteDiscoveryPreference.Builder h(gy3 r2) {
        return new RouteDiscoveryPreference.Builder(r2, false);
    }

    public static /* bridge */ /* synthetic */ RouteDiscoveryPreference i(RouteDiscoveryPreference.Builder r0) {
        return r0.build();
    }

    public static /* bridge */ /* synthetic */ Bundle j(MediaRoute2Info r0) {
        return r0.getExtras();
    }

    public static /* synthetic */ CloseGuard k() {
        return new CloseGuard();
    }

    public static /* bridge */ /* synthetic */ CloseGuard l(Object r0) {
        return (CloseGuard) r0;
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction m() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
    }

    public static /* bridge */ /* synthetic */ FileDescriptor n() {
        return Os.memfd_create("temp.arsc", 0);
    }

    public static /* bridge */ /* synthetic */ String o(Context r0) {
        return r0.getAttributionTag();
    }

    public static /* bridge */ /* synthetic */ String p(MediaRoute2Info r0) {
        return r0.getId();
    }

    public static /* bridge */ /* synthetic */ String q(MediaController.PlaybackInfo r0) {
        return r0.getVolumeControlId();
    }

    public static /* bridge */ /* synthetic */ List r(ActivityManager r2) {
        return r2.getHistoricalProcessExitReasons(null, 0, 0);
    }

    public static /* synthetic */ void s() {
    }

    public static /* bridge */ /* synthetic */ void t(ResourcesLoader r0, ResourcesProvider r1) {
        r0.addProvider(r1);
    }

    public static /* bridge */ /* synthetic */ void u(Outline r0, Path r1) {
        r0.setPath(r1);
    }

    public static /* bridge */ /* synthetic */ void v(MediaRouter2 r0, MediaRoute2Info r1) {
        r0.transferTo(r1);
    }

    public static /* bridge */ /* synthetic */ void w(CloseGuard r1) {
        r1.open("response.body().close()");
    }

    public static /* bridge */ /* synthetic */ boolean x(Canvas r0, float r1, float r2, float r3, float r4) {
        return r0.quickReject(r1, r2, r3, r4);
    }

    public static /* bridge */ /* synthetic */ boolean y(Canvas r0, Path r1) {
        return r0.quickReject(r1);
    }

    public static /* bridge */ /* synthetic */ boolean z(Canvas r0, RectF r1) {
        return r0.quickReject(r1);
    }
}
