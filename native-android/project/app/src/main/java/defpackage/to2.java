package defpackage;

import android.content.Context;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$RouteCallback;
import android.media.RouteDiscoveryPreference;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class to2 {
    public static /* bridge */ /* synthetic */ List A(MediaRouter2.RoutingController r0) {
        return r0.getSelectableRoutes();
    }

    public static /* bridge */ /* synthetic */ void B(MediaRouter2.RoutingController r0, MediaRoute2Info r1) {
        r0.selectRoute(r1);
    }

    public static /* bridge */ /* synthetic */ int C(MediaRouter2.RoutingController r0) {
        return r0.getVolumeHandling();
    }

    public static /* bridge */ /* synthetic */ List D(MediaRouter2.RoutingController r0) {
        return r0.getDeselectableRoutes();
    }

    public static /* bridge */ /* synthetic */ int a(MediaRoute2Info r0) {
        return r0.getConnectionState();
    }

    public static /* bridge */ /* synthetic */ int b(MediaRouter2.RoutingController r0) {
        return r0.getVolume();
    }

    public static /* bridge */ /* synthetic */ MediaRouter2.RoutingController c(MediaRouter2 r0) {
        return r0.getSystemController();
    }

    public static /* bridge */ /* synthetic */ MediaRouter2 d(Context r0) {
        return MediaRouter2.getInstance(r0);
    }

    public static /* synthetic */ RouteDiscoveryPreference.Builder e(ArrayList r2) {
        return new RouteDiscoveryPreference.Builder(r2, false);
    }

    public static /* synthetic */ RouteDiscoveryPreference.Builder f(ArrayList r1, boolean r2) {
        return new RouteDiscoveryPreference.Builder(r1, r2);
    }

    public static /* bridge */ /* synthetic */ Bundle g(MediaRouter2.RoutingController r0) {
        return r0.getControlHints();
    }

    public static /* bridge */ /* synthetic */ CharSequence h(MediaRoute2Info r0) {
        return r0.getName();
    }

    public static /* bridge */ /* synthetic */ String i(MediaRoute2Info r0) {
        return r0.getId();
    }

    public static /* bridge */ /* synthetic */ String j(MediaRouter2.RoutingController r0) {
        return r0.getId();
    }

    public static /* bridge */ /* synthetic */ List k(MediaRoute2Info r0) {
        return r0.getFeatures();
    }

    public static /* bridge */ /* synthetic */ List l(MediaRouter2.RoutingController r0) {
        return r0.getSelectedRoutes();
    }

    public static /* bridge */ /* synthetic */ List m(MediaRouter2 r0) {
        return r0.getRoutes();
    }

    public static /* bridge */ /* synthetic */ void n(MediaRouter2.RoutingController r0) {
        r0.release();
    }

    public static /* bridge */ /* synthetic */ void o(MediaRouter2.RoutingController r0, int r1) {
        r0.setVolume(r1);
    }

    public static /* bridge */ /* synthetic */ void p(MediaRouter2.RoutingController r0, MediaRoute2Info r1) {
        r0.deselectRoute(r1);
    }

    public static /* bridge */ /* synthetic */ void q(MediaRouter2 r0, ym r1, uo2 r2) {
        r0.registerControllerCallback(r1, r2);
    }

    public static /* bridge */ /* synthetic */ void r(MediaRouter2 r0, ym r1, yo2 r2) {
        r0.registerTransferCallback(r1, r2);
    }

    public static /* bridge */ /* synthetic */ void s(MediaRouter2 r0, ym r1, MediaRouter2$RouteCallback r2, RouteDiscoveryPreference r3) {
        r0.registerRouteCallback(r1, r2, r3);
    }

    public static /* bridge */ /* synthetic */ void t(MediaRouter2 r0, uo2 r1) {
        r0.unregisterControllerCallback(r1);
    }

    public static /* bridge */ /* synthetic */ void u(MediaRouter2 r0, yo2 r1) {
        r0.unregisterTransferCallback(r1);
    }

    public static /* bridge */ /* synthetic */ void v(MediaRouter2 r0, MediaRouter2$RouteCallback r1) {
        r0.unregisterRouteCallback(r1);
    }

    public static /* bridge */ /* synthetic */ boolean w(MediaRouter2.RoutingController r0) {
        return r0.isReleased();
    }

    public static /* bridge */ /* synthetic */ int x(MediaRoute2Info r0) {
        return r0.getVolumeHandling();
    }

    public static /* bridge */ /* synthetic */ int y(MediaRouter2.RoutingController r0) {
        return r0.getVolumeMax();
    }

    public static /* bridge */ /* synthetic */ Bundle z(MediaRouter2.RoutingController r0) {
        return r0.getControlHints();
    }
}
