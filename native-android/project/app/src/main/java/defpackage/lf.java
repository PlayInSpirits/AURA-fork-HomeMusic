package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import android.util.Log;
import com.eddyizm.tempus.database.AppDatabase;
import com.eddyizm.tempus.model.Download;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lf implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ Context o;

    public /* synthetic */ lf(Context context, int i) {
        this.n = i;
        this.o = context;
    }

    /* JADX WARN: Code duplicated, block: B:86:0x0196  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        wd2 wd2Var;
        int i = this.n;
        boolean z = false;
        Object[] objArr = 0;
        Context context = this.o;
        switch (i) {
            case 0:
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 33) {
                    ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (i2 >= 33) {
                            Object objB = pf.b();
                            if (objB != null) {
                                wd2Var = new wd2(new xd2(nf.a(objB)));
                            } else {
                                wd2Var = wd2.b;
                            }
                        } else {
                            wd2Var = pf.p;
                            if (wd2Var == null) {
                                wd2Var = wd2.b;
                            }
                        }
                        if (wd2Var.a.a.isEmpty()) {
                            String strI = si0.I(context);
                            Object systemService = context.getSystemService("locale");
                            if (systemService != null) {
                                nf.b(systemService, mf.a(strI));
                            }
                        }
                        context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                    }
                }
                pf.s = true;
                return;
            case 1:
                pf.q(context);
                return;
            case 2:
                if (ud3.o() == null) {
                    au0.w(context).g();
                }
                String strO = ud3.o();
                if (strO != null) {
                    Uri uri = Uri.parse(strO);
                    Uri uriBuildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(uri, DocumentsContract.getTreeDocumentId(uri));
                    af4 af4Var = new af4(context, uriBuildDocumentUriUsingTree);
                    if (context.checkCallingOrSelfUriPermission(uriBuildDocumentUriUsingTree, 2) == 0) {
                        String strK = h12.K(context, uriBuildDocumentUriUsingTree, "mime_type");
                        int iJ = (int) h12.J(context, uriBuildDocumentUriUsingTree, "flags", 0L);
                        if (!TextUtils.isEmpty(strK) && ((iJ & 4) != 0 || (("vnd.android.document/directory".equals(strK) && (iJ & 8) != 0) || (!TextUtils.isEmpty(strK) && (iJ & 2) != 0)))) {
                            lg1 lg1Var = new lg1(10, AppDatabase.y().w());
                            Thread thread = new Thread(lg1Var);
                            thread.start();
                            try {
                                thread.join();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            List<Download> list = (List) lg1Var.p;
                            HashMap map = new HashMap();
                            for (Download download : list) {
                                if (download.getDownloadUri() != null) {
                                    map.put(download.getDownloadUri(), download);
                                }
                            }
                            for (af4 af4Var2 : af4Var.g()) {
                                String string = af4Var2.d().toString();
                                if (map.containsKey(string)) {
                                    af4Var2.a();
                                    new Thread(new qt0(AppDatabase.y().w(), ((Download) map.get(string)).getId(), objArr == true ? 1 : 0)).start();
                                }
                            }
                        }
                        break;
                    }
                    g51.i();
                    j51.o();
                    return;
                }
                return;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                AtomicBoolean atomicBoolean = pt0.a;
                try {
                    try {
                        pt0.e(context);
                    } finally {
                        atomicBoolean.set(false);
                    }
                    break;
                } catch (Exception e2) {
                    Log.w("DownloadRepair", "Download repair failed", e2);
                }
                return;
            case 4:
                try {
                    gi1.j(context);
                    return;
                } catch (Exception e3) {
                    Log.w("HubEvents", "Check after event failed", e3);
                    return;
                }
            case 5:
                Context applicationContext = context.getApplicationContext();
                applicationContext.getClass();
                try {
                    mm3.g = null;
                    new mm3().i(applicationContext);
                    return;
                } catch (Exception e4) {
                    Log.w("HubNotifier", "Keep-synced playlists sync failed", e4);
                    return;
                }
            case 6:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new lf(context, 7));
                return;
            default:
                tq3.b(context, new di(3), tq3.a, false);
                return;
        }
    }
}
