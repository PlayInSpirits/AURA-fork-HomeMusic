package defpackage;

import android.content.Context;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$RouteCallback;
import android.media.RouteDiscoveryPreference;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.ArraySet;
import android.util.Log;
import app.homemusic.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zo2 extends qq2 {
    public static final /* synthetic */ int F = 0;
    public final uo2 A;
    public final ym B;
    public ArrayList C;
    public final ArrayMap D;
    public String E;
    public final MediaRouter2 v;
    public final hg3 w;
    public final ArrayMap x;
    public final MediaRouter2$RouteCallback y;
    public final yo2 z;

    static {
        Log.isLoggable("MR2Provider", 3);
    }

    public zo2(Context r2, hg3 r3) {
        super(r2, null);
        this.x = new ArrayMap();
        this.z = new yo2(this);
        this.A = new uo2(this);
        this.C = new ArrayList();
        this.D = new ArrayMap();
        this.v = to2.d(r2);
        this.w = r3;
        this.B = new ym(new Handler(Looper.getMainLooper()), 0);
        if (Build.VERSION.SDK_INT < 34) goto L6;
        this.y = new xo2(this, 1);
        return;
    L6:
        this.y = new xo2(this, 0);
    }

    @Override // defpackage.qq2
    public final nq2 a(String r2, pq2 r3) {
        Iterator r1 = this.x.entrySet().iterator();
    L4:
        if (r1.hasNext() == false) goto L8;
        vo2 r4 = (vo2) ((Map.Entry) r1.next()).getValue();
        if (TextUtils.equals(r2, r4.f) == false) goto L4;
        return r4;
    L8:
        return null;
    }

    @Override // defpackage.qq2
    public final oq2 b(String r3) {
        int r1 = 0;
        return new wo2(r1, (String) this.D.get(r3), null);
    }

    @Override // defpackage.qq2
    public final oq2 d(String r5, String r6) {
        String r0 = (String) this.D.get(r5);
        Iterator r4 = this.x.values().iterator();
    L3:
        int r2 = 0;
        if (r4.hasNext() == false) goto L13;
        vo2 r1 = (vo2) r4.next();
        sp2 r3 = r1.o;
        if (r3 == null) goto L8;
        String r7 = r3.d();
    L10:
        if (TextUtils.equals(r6, r7) == false) goto L3;
        return new wo2(r2, r0, r1);
    L8:
        r7 = to2.j(r1.g);
        goto L10
    L13:
        Log.w("MR2Provider", "Could not find the matching GroupRouteController. routeId=" + r5 + ", routeGroupId=" + r6);
        return new wo2(r2, r0, null);
    }

    @Override // defpackage.qq2
    public final void e(up2 r14) {
        if (yq2.c != null) goto L5;
        int r0 = 0;
    L6:
        MediaRouter2$RouteCallback r2 = this.y;
        uo2 r3 = this.A;
        yo2 r4 = this.z;
        if (r0 <= 0) goto L54;
        yq2.c().getClass();
        if (r14 != null) goto L11;
        r14 = new up2(rq2.c, false);
    L11:
        r14.a();
        ArrayList r1 = r14.b.b();
        r1.remove("android.media.intent.category.LIVE_AUDIO");
        c52 r6 = new c52();
        r6.a(r1);
        rq2 r5 = r6.d();
        boolean r15 = r14.b();
        if (r5 == null) goto L52;
        Bundle r7 = new Bundle();
        r7.putBundle("selector", r5.a);
        r7.putBoolean("activeScan", r15);
        MediaRouter2 r16 = this.v;
        r5.a();
        if (r5.b.contains(null) == false) goto L16;
        l3.C();
        RouteDiscoveryPreference r8 = l3.i(to2.e(new ArrayList()));
    L50:
        ym r9 = this.B;
        to2.s(r16, r9, r2, r8);
        to2.r(this.v, r9, r4);
        to2.q(this.v, r9, r3);
        return;
    L16:
        boolean r10 = r7.getBoolean("activeScan");
        ArrayList r11 = new ArrayList();
        ArrayList r12 = r5.b();
        int r13 = r12.size();
        int r17 = 0;
    L17:
        if (r17 >= r13) goto L49;
        Object r18 = r12.get(r17);
        r17 = r17 + 1;
        String r19 = (String) r18;
        r19.getClass();
        byte r110 = -1;
        switch(r19.hashCode()) {
            case -2065577523: goto L38;
            case 956939050: goto L34;
            case 975975375: goto L30;
            case 1601181366: goto L26;
            case 1693091761: goto L22;
            default: goto L41;
        };
    L41:
        switch(r110) {
            case 0: goto L47;
            case 1: goto L46;
            case 2: goto L45;
            case 3: goto L44;
            case 4: goto L43;
            default: goto L48;
        };
    L43:
        r19 = "android.media.route.feature.REMOTE_VIDEO_PLAYBACK";
        goto L48
    L44:
        r19 = "android.media.route.feature.REMOTE_AUDIO_PLAYBACK";
        goto L48
    L45:
        r19 = "android.media.route.feature.LIVE_VIDEO";
        goto L48
    L46:
        r19 = "android.media.route.feature.LIVE_AUDIO";
        goto L48
    L47:
        r19 = "android.media.route.feature.REMOTE_PLAYBACK";
    L48:
        r11.add(r19);
        goto L17
    L22:
        if (r19.equals("android.media.intent.category.REMOTE_VIDEO_PLAYBACK") == false) goto L41;
        r110 = 4;
        goto L41
    L26:
        if (r19.equals("android.media.intent.category.REMOTE_AUDIO_PLAYBACK") == false) goto L41;
        r110 = 3;
        goto L41
    L30:
        if (r19.equals("android.media.intent.category.LIVE_VIDEO") == false) goto L41;
        r110 = 2;
        goto L41
    L34:
        if (r19.equals("android.media.intent.category.LIVE_AUDIO") == false) goto L41;
        r110 = 1;
        goto L41
    L38:
        if (r19.equals("android.media.intent.category.REMOTE_PLAYBACK") == false) goto L41;
        r110 = 0;
        goto L41
    L49:
        r8 = l3.i(to2.f(r11, r10));
        goto L50
    L52:
        kf2.n("selector must not be null");
        return;
    L54:
        to2.v(this.v, r2);
        to2.u(this.v, r4);
        to2.t(this.v, r3);
        return;
    L5:
        r0 = yq2.c().z;
        goto L6
    }

    public final MediaRoute2Info h(String r5) {
        if (r5 == null) goto L9;
        ArrayList r4 = this.C;
        int r0 = r4.size();
        int r1 = 0;
    L5:
        if (r1 >= r0) goto L14;
        Object r2 = r4.get(r1);
        r1 = r1 + 1;
        MediaRoute2Info r3 = l3.g(r2);
        if (TextUtils.equals(to2.i(r3), r5) == false) goto L5;
        return r3;
    L14:
        return null;
    L9:
        return null;
    }

    public final void i() {
        ArrayList r0 = new ArrayList();
        ArraySet r1 = new ArraySet();
        Iterator r2 = to2.m(this.v).iterator();
    L4:
        if (r2.hasNext() == false) goto L14;
        MediaRoute2Info r3 = l3.g(r2.next());
        if (r3 == null) goto L4;
        if (r1.contains(r3) == true) goto L4;
        if (l3.A(r3) == true) goto L4;
        r1.add(r3);
        r0.add(r3);
        goto L4
    L14:
        if (r0.equals(this.C) == false) goto L16;
        return;
    L16:
        this.C = r0;
        ArrayMap r4 = this.D;
        r4.clear();
        ArrayList r5 = this.C;
        int r6 = r5.size();
        int r7 = 0;
        int r8 = 0;
    L17:
        if (r8 >= r6) goto L25;
        Object r9 = r5.get(r8);
        r8 = r8 + 1;
        MediaRoute2Info r10 = l3.g(r9);
        Bundle r11 = l3.j(r10);
        if (r11 == null) goto L24;
        if (r11.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID") == null) goto L24;
        r4.put(l3.p(r10), r11.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID"));
    L24:
        Log.w("MR2Provider", "Cannot find the original route Id. route=" + r10);
        goto L17
    L25:
        ArrayList r12 = new ArrayList();
        ArrayList r13 = this.C;
        int r14 = r13.size();
        int r15 = 0;
    L26:
        if (r15 >= r14) goto L30;
        Object r16 = r13.get(r15);
        r15 = r15 + 1;
        sp2 r17 = bu.G(l3.g(r16));
        if (r17 == null) goto L26;
        r12.add(r17);
        goto L26
    L30:
        ArrayList r18 = new ArrayList();
        if (r12.isEmpty() == true) goto L43;
        int r19 = r12.size();
    L33:
        if (r7 >= r19) goto L43;
        Object r20 = r12.get(r7);
        r7 = r7 + 1;
        sp2 r21 = (sp2) r20;
        if (r21 == null) goto L41;
        if (r18.contains(r21) == true) goto L39;
        r18.add(r21);
        goto L33
    L39:
        kf2.n("route descriptor already added");
        return;
    L41:
        kf2.n("route must not be null");
        return;
    L43:
        f(new xk0(r18, true));
    }

    public final void j(MediaRouter2.RoutingController r14) {
        vo2 r1 = (vo2) this.x.get(r14);
        if (r1 != null) goto L6;
        Log.w("MR2Provider", "setDynamicRouteDescriptors: No matching routeController found. routingController=" + r14);
        return;
    L6:
        List r0 = to2.l(r14);
        if (r0.isEmpty() == false) goto L10;
        Log.w("MR2Provider", "setDynamicRouteDescriptors: No selected routes. This may happen when the selected routes become invalid.routingController=" + r14);
        return;
    L10:
        ArrayList r3 = bu.p(r0);
        sp2 r4 = bu.G(l3.g(r0.get(0)));
        Bundle r2 = to2.g(r14);
        String r5 = this.n.getString(R.string.mr_dialog_default_group_name);
        sp2 r6 = null;
        if (r2 == null) goto L22;
        String r7 = r2.getString("androidx.mediarouter.media.KEY_SESSION_NAME");     // Catch: Exception -> L19
        if (TextUtils.isEmpty(r7) == true) goto L15;
        r5 = r7;
    L15:
        Bundle r8 = r2.getBundle("androidx.mediarouter.media.KEY_GROUP_ROUTE");     // Catch: Exception -> L19
        if (r8 == null) goto L22;
        r6 = new sp2(r8);     // Catch: Exception -> L19
    L19:
        e = move-exception;
        Log.w("MR2Provider", "Exception while unparceling control hints.", e);
    L22:
        if (r6 != null) goto L24;
        ss0 r9 = new ss0(to2.j(r14), r5);
        Bundle r10 = (Bundle) r9.n;
        r10.putInt("connectionState", 2);
        r10.putInt("playbackType", 1);
    L25:
        Bundle r11 = (Bundle) r9.n;
        r11.putInt("volume", to2.b(r14));
        r11.putInt("volumeMax", to2.y(r14));
        r11.putInt("volumeHandling", to2.C(r14));
        ((ArrayList) r9.p).clear();
        r9.n(r4.b());
        ((ArrayList) r9.o).clear();
        r9.p(r3);
        sp2 r12 = r9.r();
        ArrayList r13 = bu.p(to2.A(r14));
        ArrayList r15 = bu.p(to2.D(r14));
        xk0 r16 = this.t;
        if (r16 != null) goto L29;
        Log.w("MR2Provider", "setDynamicRouteDescriptors: providerDescriptor is not set.");
        return;
    L29:
        ArrayList r17 = new ArrayList();
        List r18 = (List) r16.p;
        if (r18.isEmpty() == true) goto L39;
        Iterator r19 = r18.iterator();
    L33:
        if (r19.hasNext() == false) goto L39;
        sp2 r20 = (sp2) r19.next();
        String r21 = r20.d();
        if (r3.contains(r21) == false) goto L37;
        int r22 = 3;
    L38:
        r17.add(new mq2(r20, r22, r15.contains(r21), r13.contains(r21), true));
        goto L33
    L37:
        r22 = 1;
    L39:
        r1.o = r12;
        r1.l(r12, r17);
        return;
    L24:
        ss0 r23 = new ss0();
        r23.o = new ArrayList();
        r23.p = new ArrayList();
        r23.q = new HashSet();
        r23.n = new Bundle(r6.a);
        r23.o = r6.c();
        r23.p = r6.b();
        r23.q = r6.a();
        r9 = r23;
        goto L25
    }
}
