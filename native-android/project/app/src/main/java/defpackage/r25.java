package defpackage;

import android.content.IntentFilter;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r25 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ s25 o;

    public /* synthetic */ r25(s25 s25Var, int i) {
        this.n = i;
        this.o = s25Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        s25 s25Var = this.o;
        switch (i) {
            case 0:
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : s25Var.z.entrySet()) {
                    String str = (String) entry.getKey();
                    g25 g25Var = (g25) entry.getValue();
                    String str2 = g25Var.b;
                    if (qm4.u0(str2)) {
                        str2 = "UPnP renderer";
                    }
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    HashSet hashSet = new HashSet();
                    Bundle bundle = new Bundle();
                    if (str == null) {
                        nz2.n("id must not be null");
                        return;
                    }
                    bundle.putString("id", str);
                    bundle.putString("name", str2);
                    String str3 = g25Var.d;
                    if (qm4.u0(str3)) {
                        str3 = g25Var.c;
                    }
                    bundle.putString("status", str3);
                    IntentFilter intentFilter = s25.E;
                    if (intentFilter == null) {
                        kf2.n("filter must not be null");
                        return;
                    }
                    if (!arrayList3.contains(intentFilter)) {
                        arrayList3.add(intentFilter);
                    }
                    bundle.putInt("playbackType", 1);
                    bundle.putInt("volumeHandling", 0);
                    bundle.putBoolean("enabled", true);
                    bundle.putParcelableArrayList("controlFilters", new ArrayList<>(arrayList3));
                    bundle.putStringArrayList("groupMemberIds", new ArrayList<>(arrayList2));
                    bundle.putStringArrayList("allowedPackages", new ArrayList<>(hashSet));
                    sp2 sp2Var = new sp2(bundle);
                    if (arrayList.contains(sp2Var)) {
                        kf2.n("route descriptor already added");
                        return;
                    }
                    arrayList.add(sp2Var);
                }
                s25Var.f(new xk0(arrayList, false));
                return;
            default:
                try {
                    s25.h(s25Var);
                    return;
                } finally {
                    s25Var.C = false;
                }
        }
    }
}
