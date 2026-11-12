package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.media.MediaRouter;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import app.homemusic.R;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vg3 extends qq2 {
    public static final ArrayList F = null;
    public static final ArrayList G = null;
    public int A;
    public boolean B;
    public boolean C;
    public final ArrayList D;
    public final ArrayList E;
    public final ui1 v;
    public final MediaRouter w;
    public final ar2 x;
    public final br2 y;
    public final MediaRouter.RouteCategory z;

    static {
        IntentFilter r0 = new IntentFilter();
        r0.addCategory("android.media.intent.category.LIVE_AUDIO");
        ArrayList r1 = new ArrayList();
        F = r1;
        r1.add(r0);
        IntentFilter r2 = new IntentFilter();
        r2.addCategory("android.media.intent.category.LIVE_VIDEO");
        ArrayList r3 = new ArrayList();
        G = r3;
        r3.add(r2);
    }

    public vg3(Context r5, ui1 r6) {
        ComponentName r1 = new ComponentName("android", vg3.class.getName());
        super(r5, new om1(10, r1));
        this.D = new ArrayList();
        this.E = new ArrayList();
        this.v = r6;
        MediaRouter r7 = (MediaRouter) r5.getSystemService("media_router");
        this.w = r7;
        this.x = new ar2(this);
        this.y = new br2(this);
        this.z = r7.createRouteCategory(r5.getResources().getString(R.string.mr_user_route_category_name), false);
        s();
    }

    public static yg3 m(MediaRouter.RouteInfo r1) {
        Object r2 = r1.getTag();
        if ((r2 instanceof yg3) == true) goto L5;
        return null;
    L5:
        return (yg3) r2;
    }

    public static void t(yg3 r2) {
        MediaRouter.UserRouteInfo r0 = r2.b;
        wq2 r3 = r2.a;
        r0.setName(r3.d);
        r0.setPlaybackType(r3.l);
        r0.setPlaybackStream(r3.m);
        r0.setVolume(r3.p);
        r0.setVolumeMax(r3.q);
        if (r3.e() == true) goto L5;
    L8:
        int r1 = r3.o;
    L9:
        r0.setVolumeHandling(r1);
        r0.setDescription(r3.e);
        return;
    L5:
        if (yq2.c != null) goto L7;
        r1 = 0;
        goto L9
    L7:
        yq2.c().getClass();
        goto L8
    }

    @Override // defpackage.qq2
    public final oq2 b(String r1) {
        int r2 = j(r1);
        if (r2 >= 0) goto L5;
        return null;
    L5:
        return new wg3(((xg3) this.D.get(r2)).a);
    }

    @Override // defpackage.qq2
    public final void e(up2 r7) {
        int r0 = 0;
        if (r7 == null) goto L15;
        r7.a();
        ArrayList r1 = r7.b.b();
        int r2 = r1.size();
        int r3 = 0;
    L5:
        if (r0 >= r2) goto L14;
        String r4 = (String) r1.get(r0);
        if (r4.equals("android.media.intent.category.LIVE_AUDIO") == false) goto L10;
        r3 = r3 | 1;
    L13:
        r0 = r0 + 1;
        goto L5
    L10:
        if (r4.equals("android.media.intent.category.LIVE_VIDEO") == false) goto L12;
        r3 = r3 | 2;
        goto L13
    L12:
        r3 = r3 | 8388608;
        goto L13
    L14:
        boolean r8 = r7.b();
        r0 = r3;
    L17:
        if (this.A == r0) goto L19;
    L22:
        this.A = r0;
        this.B = r8;
        s();
        return;
    L19:
        if (this.B != r8) goto L22;
        return;
    L15:
        r8 = false;
        goto L17
    }

    public final boolean h(MediaRouter.RouteInfo r5) {
        if (m(r5) == null) goto L5;
        return false;
    L5:
        if (i(r5) < 0) goto L7;
        return false;
    L7:
        if (this.w.getDefaultRoute() != r5) goto L9;
        String r0 = "DEFAULT_ROUTE";
    L11:
        if (j(r0) < 0) goto L17;
        int r1 = 2;
    L14:
        Locale r2 = Locale.US;
        String r3 = r0 + "_" + r1;
        if (j(r3) < 0) goto L16;
        r1 = r1 + 1;
        goto L14
    L16:
        r0 = r3;
    L17:
        xg3 r4 = new xg3(r5, r0);
        r(r4);
        this.D.add(r4);
        return true;
    L9:
        r0 = String.format(Locale.US, "ROUTE_%08x", new Object[]{Integer.valueOf(l(r5).hashCode())});
        goto L11
    }

    public final int i(MediaRouter.RouteInfo r4) {
        ArrayList r3 = this.D;
        int r0 = r3.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L8;
        if (((xg3) r3.get(r1)).a == r4) goto L6;
        r1 = r1 + 1;
        goto L3
    L6:
        return r1;
    L8:
        return -1;
    }

    public final int j(String r4) {
        ArrayList r3 = this.D;
        int r0 = r3.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L8;
        if (((xg3) r3.get(r1)).b.equals(r4) == true) goto L6;
        r1 = r1 + 1;
        goto L3
    L6:
        return r1;
    L8:
        return -1;
    }

    public final int k(wq2 r4) {
        ArrayList r3 = this.E;
        int r0 = r3.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L8;
        if (((yg3) r3.get(r1)).a == r4) goto L6;
        r1 = r1 + 1;
        goto L3
    L6:
        return r1;
    L8:
        return -1;
    }

    public final String l(MediaRouter.RouteInfo r3) {
        Context r2 = this.n;
        CharSequence r0 = r3.getName(r2);
        if (TextUtils.isEmpty(r0) == true) goto L7;
        return r0.toString();
    L7:
        if ((r3.getSupportedTypes() & 8388608) != 0) goto L20;
        int r4 = r3.getDeviceType();
        if (r4 != 1) goto L11;
        int r5 = R.string.mr_route_name_tv;
    L19:
        return r2.getString(r5);
    L11:
        if (r4 != 2) goto L13;
        r5 = R.string.mr_route_name_speaker;
        goto L19
    L13:
        if (r4 == 3) goto L15;
        r5 = R.string.mr_route_name_unknown;
        goto L19
    L15:
        r5 = R.string.mr_route_name_bluetooth;
        goto L19
    L20:
        return "";
    }

    public final void n(wq2 r4) {
        qq2 r0 = r4.c();
        MediaRouter r1 = this.w;
        if (r0 == this) goto L6;
        MediaRouter.UserRouteInfo r2 = r1.createUserRoute(this.z);
        yg3 r3 = new yg3(r4, r2);
        r2.setTag(r3);
        r2.setVolumeCallback(this.y);
        t(r3);
        this.E.add(r3);
        r1.addUserRoute(r2);
        return;
    L6:
        int r5 = i(r1.getSelectedRoute(8388611));
        if (r5 >= 0) goto L9;
        return;
    L9:
        if (((xg3) this.D.get(r5)).b.equals(r4.b) == false) goto L13;
        r4.k(false);
        return;
    }

    public final void o(wq2 r2) {
        if (r2.c() == this) goto L14;
        int r3 = k(r2);
        if (r3 < 0) goto L15;
        MediaRouter.UserRouteInfo r4 = ((yg3) this.E.remove(r3)).b;
        r4.setTag(null);
        r4.setVolumeCallback(null);
        this.w.removeUserRoute(r4);     // Catch: IllegalArgumentException -> L9
        return;
    L9:
        e = move-exception;
        Log.w("AxSysMediaRouteProvider", "Failed to remove user route", e);
        return;
    L15:
        return;
    }

    public final void p(wq2 r4) {
        if (r4.g() == false) goto L17;
        qq2 r0 = r4.c();
        MediaRouter r2 = this.w;
        if (r0 == this) goto L11;
        int r5 = k(r4);
        if (r5 < 0) goto L15;
        r2.selectRoute(8388611, ((yg3) this.E.get(r5)).b);
        return;
    L15:
        return;
    L11:
        int r6 = j(r4.b);
        if (r6 < 0) goto L16;
        r2.selectRoute(8388611, ((xg3) this.D.get(r6)).a);
        return;
    L16:
        return;
    }

    public final void q() {
        ArrayList r0 = new ArrayList();
        ArrayList r1 = this.D;
        int r2 = r1.size();
        int r4 = 0;
    L3:
        if (r4 >= r2) goto L13;
        sp2 r5 = ((xg3) r1.get(r4)).c;
        if (r5 == null) goto L11;
        if (r0.contains(r5) == true) goto L9;
        r0.add(r5);
        r4 = r4 + 1;
        goto L3
    L9:
        kf2.n("route descriptor already added");
        return;
    L11:
        kf2.n("route must not be null");
        return;
    L13:
        f(new xk0(r0, false));
    }

    public final void r(xg3 r7) {
        String r1 = r7.b;
        MediaRouter.RouteInfo r2 = r7.a;
        ss0 r0 = new ss0(r1, l(r2));
        Bundle r6 = (Bundle) r0.n;
        int r3 = r2.getSupportedTypes();
        if ((r3 & 1) == 0) goto L6;
        r0.n(F);
    L6:
        if ((r3 & 2) == 0) goto L8;
        r0.n(G);
    L8:
        r6.putInt("playbackType", r2.getPlaybackType());
        r6.putInt("playbackStream", r2.getPlaybackStream());
        r6.putInt("volume", r2.getVolume());
        r6.putInt("volumeMax", r2.getVolumeMax());
        r6.putInt("volumeHandling", r2.getVolumeHandling());
        if ((r3 & 8388608) != 0) goto L11;
        boolean r4 = true;
    L12:
        r6.putBoolean("isSystemRoute", r4);
        if (r2.isEnabled() == true) goto L16;
        r6.putBoolean("enabled", false);
    L16:
        if (r2.isConnecting() == false) goto L18;
        r6.putInt("connectionState", 1);
    L18:
        Display r5 = r2.getPresentationDisplay();
        if (r5 == null) goto L21;
        r6.putInt("presentationDisplayId", r5.getDisplayId());
    L21:
        CharSequence r8 = r2.getDescription();
        if (r8 == null) goto L24;
        r6.putString("status", r8.toString());
    L24:
        r6.putInt("deviceType", r2.getDeviceType());
        r7.c = r0.r();
        return;
    L11:
        r4 = false;
        goto L12
    }

    public final void s() {
        boolean r0 = this.C;
        ar2 r1 = this.x;
        MediaRouter r2 = this.w;
        if (r0 == false) goto L5;
        r2.removeCallback(r1);
    L5:
        this.C = true;
        r2.addCallback(this.A, r1, (this.B ? 1 : 0) | 2);
        int r3 = r2.getRouteCount();
        ArrayList r4 = new ArrayList(r3);
        boolean r5 = false;
        int r6 = 0;
    L6:
        if (r6 >= r3) goto L8;
        r4.add(r2.getRouteAt(r6));
        r6 = r6 + 1;
        goto L6
    L8:
        int r7 = r4.size();
        int r8 = 0;
    L9:
        if (r8 >= r7) goto L11;
        Object r9 = r4.get(r8);
        r8 = r8 + 1;
        r5 = r5 | h((MediaRouter.RouteInfo) r9);
        goto L9
    L11:
        if (r5 == false) goto L16;
        q();
        return;
    }
}
