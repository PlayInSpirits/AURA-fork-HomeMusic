package defpackage;

import android.content.ComponentName;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class wq2 {
    public final vq2 a;
    public final String b;
    public final String c;
    public String d;
    public String e;
    public Uri f;
    public boolean g;
    public final boolean h;
    public int i;
    public boolean j;
    public final ArrayList k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public Bundle s;
    public IntentSender t;
    public sp2 u;
    public ArrayList v;

    public wq2(vq2 r2, String r3, String r4, boolean r5) {
        this.k = new ArrayList();
        this.r = -1;
        this.v = new ArrayList();
        this.a = r2;
        this.b = r3;
        this.c = r4;
        this.h = r5;
    }

    public static nq2 b() {
        yq2.b();
        oq2 r0 = yq2.c().d;
        if ((r0 instanceof nq2) == true) goto L5;
        return null;
    L5:
        return (nq2) r0;
    }

    public final tq2 a() {
        if ((this instanceof tq2) == true) goto L5;
        return null;
    L5:
        return (tq2) this;
    }

    public final qq2 c() {
        vq2 r0 = this.a;
        r0.getClass();
        yq2.b();
        return r0.a;
    }

    public final boolean d() {
        yq2.b();
        wq2 r0 = yq2.c().t;
        if (r0 == null) goto L18;
        if (r0 != this) goto L7;
        return true;
    L7:
        if (this.n != 3) goto L10;
        return true;
    L10:
        if (TextUtils.equals(((ComponentName) c().o.o).getPackageName(), "android") == true) goto L12;
    L17:
        return false;
    L12:
        if (l("android.media.intent.category.LIVE_AUDIO") == false) goto L17;
        if (l("android.media.intent.category.LIVE_VIDEO") == true) goto L17;
        return true;
    L18:
        kf2.o("There is no default route.  The media router has not yet been fully initialized.");
        return false;
    }

    public final boolean e() {
        return !this.v.isEmpty();
    }

    public final boolean f() {
        if (this.u != null) goto L5;
        return false;
    L5:
        if (this.g == false) goto L10;
        return true;
    L10:
        return false;
    }

    public final boolean g() {
        yq2.b();
        if (yq2.c().g() != this) goto L6;
        return true;
    L6:
        return false;
    }

    public final boolean h(rq2 r7) {
        if (r7 == null) goto L23;
        yq2.b();
        ArrayList r6 = this.k;
        if (r6 == null) goto L22;
        r7.a();
        if (r7.b.isEmpty() == true) goto L22;
        int r1 = r6.size();
        int r2 = 0;
    L11:
        if (r2 >= r1) goto L22;
        Object r3 = r6.get(r2);
        r2 = r2 + 1;
        IntentFilter r4 = (IntentFilter) r3;
        if (r4 == null) goto L11;
        Iterator r5 = r7.b.iterator();
    L17:
        if (r5.hasNext() == false) goto L11;
        if (r4.hasCategory((String) r5.next()) == false) goto L17;
        return true;
    L22:
        return false;
    L23:
        kf2.n("selector must not be null");
        return false;
    }

    public final int i(sp2 r18) {
        int r3 = 0;
        if (this.u == r18) goto L127;
        this.u = r18;
        if (r18 == null) goto L127;
        Bundle r2 = r18.a;
        if (Objects.equals(this.d, r2.getString("name")) == true) goto L9;
        this.d = r2.getString("name");
        int r4 = 1;
    L11:
        if (Objects.equals(this.e, r2.getString("status")) == true) goto L13;
        this.e = r2.getString("status");
        r4 = 1;
    L13:
        Uri r5 = this.f;
        String r8 = r2.getString("iconUri");
        if (r8 != null) goto L16;
        Uri r9 = null;
    L18:
        if (Objects.equals(r5, r9) == true) goto L25;
        String r6 = r2.getString("iconUri");
        if (r6 != null) goto L22;
        Uri r7 = null;
    L23:
        this.f = r7;
        r4 = 1;
        goto L25
    L22:
        r7 = Uri.parse(r6);
    L25:
        if (this.g == r2.getBoolean("enabled", true)) goto L28;
        this.g = r2.getBoolean("enabled", true);
        r4 = 1;
    L28:
        if (this.i == r2.getInt("connectionState", 0)) goto L30;
        this.i = r2.getInt("connectionState", 0);
        r4 = 1;
    L30:
        ArrayList r10 = r18.b();
        ArrayList r11 = this.k;
        if (r11 == r10) goto L70;
        if (r11 == null) goto L68;
        ListIterator r12 = r11.listIterator();
        ListIterator r13 = r10.listIterator();
    L36:
        if (r12.hasNext() == false) goto L64;
        if (r13.hasNext() == false) goto L64;
        IntentFilter r14 = (IntentFilter) r12.next();
        IntentFilter r15 = (IntentFilter) r13.next();
        if (r14 == r15) goto L36;
        if (r14 == null) goto L68;
        if (r15 == null) goto L68;
        int r16 = r14.countActions();
        if (r16 != r15.countActions()) goto L68;
        int r17 = 0;
    L49:
        if (r17 >= r16) goto L54;
        if (r14.getAction(r17).equals(r15.getAction(r17)) == false) goto L68;
        r17 = r17 + 1;
        goto L49
    L54:
        int r19 = r14.countCategories();
        if (r19 != r15.countCategories()) goto L68;
        int r110 = 0;
    L58:
        if (r110 >= r19) goto L36;
        if (r14.getCategory(r110).equals(r15.getCategory(r110)) == false) goto L68;
        r110 = r110 + 1;
    L64:
        if (r12.hasNext() == true) goto L68;
        if (r13.hasNext() == false) goto L70;
    L68:
        r11.clear();
        r11.addAll(r18.b());
        r4 = 1;
    L70:
        if (this.l == r2.getInt("playbackType", 1)) goto L73;
        this.l = r2.getInt("playbackType", 1);
        r4 = 1;
    L73:
        if (this.m == r2.getInt("playbackStream", -1)) goto L76;
        this.m = r2.getInt("playbackStream", -1);
        r4 = 1;
    L76:
        if (this.n == r2.getInt("deviceType")) goto L78;
        this.n = r2.getInt("deviceType");
        r4 = 1;
    L78:
        int r111 = 3;
        if (this.o == r2.getInt("volumeHandling", 0)) goto L82;
        this.o = r2.getInt("volumeHandling", 0);
        r4 = 3;
    L82:
        if (this.p == r2.getInt("volume")) goto L85;
        this.p = r2.getInt("volume");
        r4 = 3;
    L85:
        if (this.q == r2.getInt("volumeMax")) goto L87;
        this.q = r2.getInt("volumeMax");
    L89:
        if (this.r == r2.getInt("presentationDisplayId", -1)) goto L92;
        this.r = r2.getInt("presentationDisplayId", -1);
        r111 = r111 | 5;
    L92:
        if (Objects.equals(this.s, r2.getBundle("extras")) == true) goto L95;
        this.s = r2.getBundle("extras");
        r111 = r111 | 1;
    L95:
        if (Objects.equals(this.t, (IntentSender) r2.getParcelable("settingsIntent")) == true) goto L98;
        this.t = (IntentSender) r2.getParcelable("settingsIntent");
        r111 = r111 | 1;
    L98:
        if (this.j == r2.getBoolean("canDisconnect", false)) goto L100;
        this.j = r2.getBoolean("canDisconnect", false);
        r111 = r111 | 5;
    L100:
        ArrayList r1 = r18.c();
        ArrayList r20 = new ArrayList();
        if (r1.size() == this.v.size()) goto L103;
        boolean r21 = true;
    L105:
        if (r1.isEmpty() == true) goto L122;
        ui1 r22 = yq2.c();
        int r23 = r1.size();
        int r24 = 0;
    L107:
        if (r24 >= r23) goto L122;
        Object r112 = r1.get(r24);
        r24 = r24 + 1;
        r22.getClass();
        String r113 = (String) r22.j.get(new ld3(((ComponentName) this.a.d.o).flattenToShortString(), (String) r112));
        ArrayList r114 = r22.h;
        int r115 = r114.size();
        int r116 = r3;
    L109:
        if (r116 >= r115) goto L114;
        Object r117 = r114.get(r116);
        r116 = r116 + 1;
        wq2 r118 = (wq2) r117;
        int r119 = r3;
        if (r118.c.equals(r113) == true) goto L115;
        r3 = r119;
    L115:
        if (r118 == null) goto L121;
        r20.add(r118);
        if (r21 == true) goto L121;
        if (this.v.contains(r118) == true) goto L121;
        r21 = true;
    L121:
        r3 = r119;
        goto L107
    L114:
        r119 = r3;
        r118 = null;
    L122:
        if (r21 == false) goto L125;
        this.v = r20;
        return r111 | 1;
    L125:
        return r111;
    L103:
        r21 = false;
        goto L105
    L87:
        r111 = r4;
        goto L89
    L16:
        r9 = Uri.parse(r8);
        goto L18
    L9:
        r4 = 0;
    L127:
        return 0;
    }

    public final void j(int r4) {
        yq2.b();
        ui1 r0 = yq2.c();
        int r5 = Math.min(this.q, Math.max(0, r4));
        oq2 r3 = r0.f(this);
        if (r3 == null) goto L6;
        r3.f(r5);
        return;
    }

    public final void k(boolean r3) {
        yq2.b();
        yq2.c().i(this, 3, r3);
    }

    public final boolean l(String r5) {
        yq2.b();
        ArrayList r4 = this.k;
        int r0 = r4.size();
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L8;
        Object r3 = r4.get(r2);
        r2 = r2 + 1;
        if (((IntentFilter) r3).hasCategory(r5) == false) goto L3;
        return true;
    L8:
        return false;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("MediaRouter.RouteInfo{ uniqueId=");
        r0.append(this.c);
        r0.append(", name=");
        r0.append(this.d);
        r0.append(", description=");
        r0.append(this.e);
        r0.append(", iconUri=");
        r0.append(this.f);
        r0.append(", enabled=");
        r0.append(this.g);
        r0.append(", isSystemRoute=");
        r0.append(this.h);
        r0.append(", connectionState=");
        r0.append(this.i);
        r0.append(", canDisconnect=");
        r0.append(this.j);
        r0.append(", playbackType=");
        r0.append(this.l);
        r0.append(", playbackStream=");
        r0.append(this.m);
        r0.append(", deviceType=");
        r0.append(this.n);
        r0.append(", volumeHandling=");
        r0.append(this.o);
        r0.append(", volume=");
        r0.append(this.p);
        r0.append(", volumeMax=");
        r0.append(this.q);
        r0.append(", presentationDisplayId=");
        r0.append(this.r);
        r0.append(", extras=");
        r0.append(this.s);
        r0.append(", settingsIntent=");
        r0.append(this.t);
        r0.append(", providerPackageName=");
        r0.append(((ComponentName) this.a.d.o).getPackageName());
        if (e() == false) goto L13;
        r0.append(", members=[");
        int r1 = this.v.size();
        int r2 = 0;
    L5:
        if (r2 >= r1) goto L12;
        if (r2 <= 0) goto L9;
        r0.append(", ");
    L9:
        if (this.v.get(r2) == this) goto L11;
        r0.append(((wq2) this.v.get(r2)).c);
    L11:
        r2 = r2 + 1;
        goto L5
    L12:
        r0.append(']');
    L13:
        r0.append(" }");
        return r0.toString();
    }
}
