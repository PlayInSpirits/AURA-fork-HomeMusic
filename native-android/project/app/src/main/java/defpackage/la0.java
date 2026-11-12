package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.os.Handler;
import android.util.SparseBooleanArray;
import app.homemusic.R;
import com.eddyizm.tempus.service.DownloaderService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class la0 implements kg1 {
    public boolean n = true;
    public boolean o;
    public Object p;
    public Object q;

    public ma0 a() {
        return new ma0(this.n, this.o, (String[]) this.p, (String[]) this.q);
    }

    public void b(v20... v20VarArr) {
        if (!this.n) {
            kf2.n("no cipher suites for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(v20VarArr.length);
        for (v20 v20Var : v20VarArr) {
            arrayList.add(v20Var.a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (!this.n) {
            kf2.n("no cipher suites for cleartext connections");
        } else if (strArr2.length != 0) {
            this.p = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        } else {
            kf2.n("At least one cipher suite is required");
        }
    }

    public void c(mu4... mu4VarArr) {
        if (!this.n) {
            kf2.n("no TLS versions for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(mu4VarArr.length);
        for (mu4 mu4Var : mu4VarArr) {
            arrayList.add(mu4Var.n);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (!this.n) {
            kf2.n("no TLS versions for cleartext connections");
        } else if (strArr2.length != 0) {
            this.q = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        } else {
            kf2.n("At least one TLS version is required");
        }
    }

    public void d() {
        String str;
        String string;
        Notification notificationA;
        String string2;
        ut0 ut0Var = ((vt0) this.q).q;
        ut0Var.getClass();
        List list = ut0Var.b.l;
        DownloaderService downloaderService = (DownloaderService) ((vt0) this.q);
        List<ns0> list2 = (List) list.stream().filter(new c7(11)).collect(Collectors.toList());
        if (list2.isEmpty()) {
            s63 s63Var = new s63(downloaderService, "download_channel");
            s63Var.e = s63.b(downloaderService.getString(R.string.homemusic_offline_sync_notification));
            s63Var.v.icon = R.drawable.ic_download;
            s63Var.c(2, true);
            s63Var.w = true;
            s63Var.i = -1;
            notificationA = s63Var.a();
        } else {
            int iMax = Math.max(DownloaderService.x, list2.size());
            int i = DownloaderService.y;
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = null;
                    break;
                }
                ns0 ns0Var = (ns0) it.next();
                if (ns0Var.b == 2) {
                    str = (String) DownloaderService.z.get(ns0Var.a.n);
                    break;
                }
            }
            if (str == null) {
                for (ns0 ns0Var2 : list2) {
                    if (ns0Var2.b != 3 && (str = (String) DownloaderService.z.get(ns0Var2.a.n)) != null) {
                        break;
                    }
                }
            }
            String string3 = str != null ? downloaderService.getString(R.string.notification_downloading_title, str) : downloaderService.getString(R.string.notification_downloading);
            if (iMax > 0) {
                StringBuilder sbI = xa3.i(downloaderService.getString(R.string.notification_download_progress_format, Integer.valueOf(Math.min(i + 1, iMax)), Integer.valueOf(iMax)));
                if (DownloaderService.w > 0.0f) {
                    StringBuilder sb = new StringBuilder(" • ");
                    float f = DownloaderService.w;
                    sb.append(f >= 1000000.0f ? String.format(Locale.US, "%.1f MB/s", Float.valueOf(f / 1000000.0f)) : f >= 1000.0f ? String.format(Locale.US, "%.0f KB/s", Float.valueOf(f / 1000.0f)) : String.format(Locale.US, "%.0f B/s", Float.valueOf(f)));
                    string2 = sb.toString();
                } else {
                    string2 = " • ? KB/s";
                }
                sbI.append(string2);
                string = sbI.toString();
            } else {
                string = downloaderService.getString(R.string.notification_downloading_progress);
            }
            s63 s63Var2 = new s63(downloaderService, "download_channel");
            s63Var2.e = s63.b(string3);
            s63Var2.f = s63.b(string);
            s63Var2.v.icon = R.drawable.ic_download;
            s63Var2.m = iMax;
            s63Var2.n = i;
            s63Var2.c(2, true);
            s63Var2.w = true;
            s63Var2.i = -1;
            s63Var2.c(8, true);
            notificationA = s63Var2.a();
        }
        boolean z = this.o;
        vt0 vt0Var = (vt0) this.q;
        if (z) {
            ((NotificationManager) vt0Var.getSystemService("notification")).notify(1, notificationA);
        } else {
            f35.c0(vt0Var, 1, notificationA, 1, "dataSync");
            this.o = true;
        }
        if (this.n) {
            ((Handler) this.p).removeCallbacksAndMessages(null);
            ((Handler) this.p).postDelayed(new a0(24, this), 1000L);
        }
    }

    @Override // defpackage.kg1
    public void h(Object obj) {
        final gr2 gr2Var = (gr2) obj;
        tn2 tn2Var = ((ls2) this.q).g;
        Handler handler = tn2Var.l;
        final fr2 fr2Var = (fr2) this.p;
        final boolean z = this.n;
        final boolean z2 = this.o;
        f35.W(handler, new ur2(tn2Var, fr2Var, new Runnable() { // from class: gs2
            @Override // java.lang.Runnable
            public final void run() {
                tn2 tn2Var2 = ((ls2) this.n.q).g;
                al3 al3Var = tn2Var2.s;
                ju2.f(al3Var, gr2Var);
                int iG = al3Var.g();
                if (z) {
                    if (iG == 1) {
                        if (al3Var.S0(2)) {
                            al3Var.b();
                        }
                    } else if (iG == 4 && al3Var.S0(4)) {
                        al3Var.C();
                    }
                }
                boolean z3 = z2;
                if (z3 && al3Var.S0(1)) {
                    al3Var.m0();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                for (int i : new int[]{31, 2}) {
                    rr2.w(!false);
                    sparseBooleanArray.append(i, true);
                }
                if (z3) {
                    rr2.w(!false);
                    sparseBooleanArray.append(1, true);
                }
                rr2.w(!false);
                tn2Var2.v(fr2Var, new mi3(new w71(sparseBooleanArray)));
            }
        }));
    }

    @Override // defpackage.kg1
    public void o(Throwable th) {
    }
}
