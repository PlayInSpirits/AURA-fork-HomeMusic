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
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public Bundle s;
    public IntentSender t;
    public sp2 u;
    public final ArrayList k = new ArrayList();
    public int r = -1;
    public ArrayList v = new ArrayList();

    public wq2(vq2 vq2Var, String str, String str2, boolean z) {
        this.a = vq2Var;
        this.b = str;
        this.c = str2;
        this.h = z;
    }

    public static nq2 b() {
        yq2.b();
        oq2 oq2Var = yq2.c().d;
        if (oq2Var instanceof nq2) {
            return (nq2) oq2Var;
        }
        return null;
    }

    public final tq2 a() {
        if (this instanceof tq2) {
            return (tq2) this;
        }
        return null;
    }

    public final qq2 c() {
        vq2 vq2Var = this.a;
        vq2Var.getClass();
        yq2.b();
        return vq2Var.a;
    }

    public final boolean d() {
        yq2.b();
        wq2 wq2Var = yq2.c().t;
        if (wq2Var == null) {
            kf2.o("There is no default route.  The media router has not yet been fully initialized.");
            return false;
        }
        if (wq2Var == this || this.n == 3) {
            return true;
        }
        return TextUtils.equals(((ComponentName) c().o.o).getPackageName(), "android") && l("android.media.intent.category.LIVE_AUDIO") && !l("android.media.intent.category.LIVE_VIDEO");
    }

    public final boolean e() {
        return !this.v.isEmpty();
    }

    public final boolean f() {
        return this.u != null && this.g;
    }

    public final boolean g() {
        yq2.b();
        return yq2.c().g() == this;
    }

    public final boolean h(rq2 rq2Var) {
        if (rq2Var == null) {
            kf2.n("selector must not be null");
            return false;
        }
        yq2.b();
        ArrayList arrayList = this.k;
        if (arrayList != null) {
            rq2Var.a();
            if (!rq2Var.b.isEmpty()) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    IntentFilter intentFilter = (IntentFilter) obj;
                    if (intentFilter != null) {
                        Iterator it = rq2Var.b.iterator();
                        while (it.hasNext()) {
                            if (intentFilter.hasCategory((String) it.next())) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int i(sp2 sp2Var) {
        int i;
        int i2;
        wq2 wq2Var;
        int iCountActions;
        int i3 = 0;
        if (this.u != sp2Var) {
            this.u = sp2Var;
            if (sp2Var != null) {
                Bundle bundle = sp2Var.a;
                if (Objects.equals(this.d, bundle.getString("name"))) {
                    i = 0;
                } else {
                    this.d = bundle.getString("name");
                    i = 1;
                }
                if (!Objects.equals(this.e, bundle.getString("status"))) {
                    this.e = bundle.getString("status");
                    i = 1;
                }
                Uri uri = this.f;
                String string = bundle.getString("iconUri");
                if (!Objects.equals(uri, string == null ? null : Uri.parse(string))) {
                    String string2 = bundle.getString("iconUri");
                    this.f = string2 == null ? null : Uri.parse(string2);
                    i = 1;
                }
                if (this.g != bundle.getBoolean("enabled", true)) {
                    this.g = bundle.getBoolean("enabled", true);
                    i = 1;
                }
                if (this.i != bundle.getInt("connectionState", 0)) {
                    this.i = bundle.getInt("connectionState", 0);
                    i = 1;
                }
                ArrayList arrayListB = sp2Var.b();
                ArrayList arrayList = this.k;
                if (arrayList != arrayListB) {
                    if (arrayList != null) {
                        ListIterator listIterator = arrayList.listIterator();
                        ListIterator listIterator2 = arrayListB.listIterator();
                        while (true) {
                            if (listIterator.hasNext() && listIterator2.hasNext()) {
                                IntentFilter intentFilter = (IntentFilter) listIterator.next();
                                IntentFilter intentFilter2 = (IntentFilter) listIterator2.next();
                                if (intentFilter != intentFilter2) {
                                    if (intentFilter != null && intentFilter2 != null && (iCountActions = intentFilter.countActions()) == intentFilter2.countActions()) {
                                        int i4 = 0;
                                        while (true) {
                                            if (i4 >= iCountActions) {
                                                int iCountCategories = intentFilter.countCategories();
                                                if (iCountCategories == intentFilter2.countCategories()) {
                                                    int i5 = 0;
                                                    while (true) {
                                                        if (i5 >= iCountCategories) {
                                                            continue;
                                                        } else if (intentFilter.getCategory(i5).equals(intentFilter2.getCategory(i5))) {
                                                            i5++;
                                                        }
                                                    }
                                                }
                                            } else if (intentFilter.getAction(i4).equals(intentFilter2.getAction(i4))) {
                                                i4++;
                                            }
                                        }
                                    }
                                }
                            } else if (listIterator.hasNext() || listIterator2.hasNext()) {
                            }
                            arrayList.clear();
                            arrayList.addAll(sp2Var.b());
                            i = 1;
                        }
                    } else {
                        arrayList.clear();
                        arrayList.addAll(sp2Var.b());
                        i = 1;
                    }
                }
                if (this.l != bundle.getInt("playbackType", 1)) {
                    this.l = bundle.getInt("playbackType", 1);
                    i = 1;
                }
                if (this.m != bundle.getInt("playbackStream", -1)) {
                    this.m = bundle.getInt("playbackStream", -1);
                    i = 1;
                }
                if (this.n != bundle.getInt("deviceType")) {
                    this.n = bundle.getInt("deviceType");
                    i = 1;
                }
                int i6 = 3;
                if (this.o != bundle.getInt("volumeHandling", 0)) {
                    this.o = bundle.getInt("volumeHandling", 0);
                    i = 3;
                }
                if (this.p != bundle.getInt("volume")) {
                    this.p = bundle.getInt("volume");
                    i = 3;
                }
                if (this.q != bundle.getInt("volumeMax")) {
                    this.q = bundle.getInt("volumeMax");
                } else {
                    i6 = i;
                }
                if (this.r != bundle.getInt("presentationDisplayId", -1)) {
                    this.r = bundle.getInt("presentationDisplayId", -1);
                    i6 |= 5;
                }
                if (!Objects.equals(this.s, bundle.getBundle("extras"))) {
                    this.s = bundle.getBundle("extras");
                    i6 |= 1;
                }
                if (!Objects.equals(this.t, (IntentSender) bundle.getParcelable("settingsIntent"))) {
                    this.t = (IntentSender) bundle.getParcelable("settingsIntent");
                    i6 |= 1;
                }
                if (this.j != bundle.getBoolean("canDisconnect", false)) {
                    this.j = bundle.getBoolean("canDisconnect", false);
                    i6 |= 5;
                }
                ArrayList arrayListC = sp2Var.c();
                ArrayList arrayList2 = new ArrayList();
                boolean z = arrayListC.size() != this.v.size();
                if (!arrayListC.isEmpty()) {
                    ui1 ui1VarC = yq2.c();
                    int size = arrayListC.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayListC.get(i7);
                        i7++;
                        ui1VarC.getClass();
                        String str = (String) ui1VarC.j.get(new ld3(((ComponentName) this.a.d.o).flattenToShortString(), (String) obj));
                        ArrayList arrayList3 = ui1VarC.h;
                        int size2 = arrayList3.size();
                        int i8 = i3;
                        while (true) {
                            if (i8 >= size2) {
                                i2 = i3;
                                wq2Var = null;
                                break;
                            }
                            Object obj2 = arrayList3.get(i8);
                            i8++;
                            wq2Var = (wq2) obj2;
                            i2 = i3;
                            if (wq2Var.c.equals(str)) {
                                break;
                            }
                            i3 = i2;
                        }
                        if (wq2Var != null) {
                            arrayList2.add(wq2Var);
                            if (!z && !this.v.contains(wq2Var)) {
                                z = true;
                            }
                        }
                        i3 = i2;
                    }
                }
                if (!z) {
                    return i6;
                }
                this.v = arrayList2;
                return i6 | 1;
            }
        }
        return 0;
    }

    public final void j(int i) {
        yq2.b();
        ui1 ui1VarC = yq2.c();
        int iMin = Math.min(this.q, Math.max(0, i));
        oq2 oq2VarF = ui1VarC.f(this);
        if (oq2VarF != null) {
            oq2VarF.f(iMin);
        }
    }

    public final void k(boolean z) {
        yq2.b();
        yq2.c().i(this, 3, z);
    }

    public final boolean l(String str) {
        yq2.b();
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (((IntentFilter) obj).hasCategory(str)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaRouter.RouteInfo{ uniqueId=");
        sb.append(this.c);
        sb.append(", name=");
        sb.append(this.d);
        sb.append(", description=");
        sb.append(this.e);
        sb.append(", iconUri=");
        sb.append(this.f);
        sb.append(", enabled=");
        sb.append(this.g);
        sb.append(", isSystemRoute=");
        sb.append(this.h);
        sb.append(", connectionState=");
        sb.append(this.i);
        sb.append(", canDisconnect=");
        sb.append(this.j);
        sb.append(", playbackType=");
        sb.append(this.l);
        sb.append(", playbackStream=");
        sb.append(this.m);
        sb.append(", deviceType=");
        sb.append(this.n);
        sb.append(", volumeHandling=");
        sb.append(this.o);
        sb.append(", volume=");
        sb.append(this.p);
        sb.append(", volumeMax=");
        sb.append(this.q);
        sb.append(", presentationDisplayId=");
        sb.append(this.r);
        sb.append(", extras=");
        sb.append(this.s);
        sb.append(", settingsIntent=");
        sb.append(this.t);
        sb.append(", providerPackageName=");
        sb.append(((ComponentName) this.a.d.o).getPackageName());
        if (e()) {
            sb.append(", members=[");
            int size = this.v.size();
            for (int i = 0; i < size; i++) {
                if (i > 0) {
                    sb.append(", ");
                }
                if (this.v.get(i) != this) {
                    sb.append(((wq2) this.v.get(i)).c);
                }
            }
            sb.append(']');
        }
        sb.append(" }");
        return sb.toString();
    }
}
