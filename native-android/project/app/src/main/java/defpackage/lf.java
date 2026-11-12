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
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lf implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ Context o;

    public /* synthetic */ lf(Context r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        int r1 = 0;
        Context r8 = this.o;
        switch(r0) {
            case 0: goto L75;
            case 1: goto L73;
            case 2: goto L32;
            case 3: goto L19;
            case 4: goto L95;
            case 5: goto L8;
            case 6: goto L6;
            default: goto L4;
        };
    L4:
        tq3.b(r8, new di(3), tq3.a, false);
        return;
    L6:
        new ThreadPoolExecutor(0, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new lf(r8, 7));
        return;
    L8:
        Context r9 = r8.getApplicationContext();
        r9.getClass();
        mm3.g = null;     // Catch: Exception -> L11
        new mm3().i(r9);     // Catch: Exception -> L11
        return;
    L11:
        e = move-exception;
        Log.w("HubNotifier", "Keep-synced playlists sync failed", e);
        return;
    L19:
        AtomicBoolean r2 = pt0.a;
        pt0.e(r8);     // Catch: Throwable -> L22 Exception -> L24
    L21:
        r2.set(false);
        return;
    L22:
        th = move-exception;
        r2.set(false);
        throw th;
    L24:
        e = move-exception;
        Log.w("DownloadRepair", "Download repair failed", e);     // Catch: Throwable -> L22
        goto L21
    L73:
        pf.q(r8);
        return;
    L75:
        int r3 = Build.VERSION.SDK_INT;
        if (r3 < 33) goto L93;
        ComponentName r4 = new ComponentName(r8, "androidx.appcompat.app.AppLocalesMetadataHolderService");
        if (r8.getPackageManager().getComponentEnabledSetting(r4) == 1) goto L93;
        if (r3 < 33) goto L83;
        Object r5 = pf.b();
        if (r5 == null) goto L86;
        wd2 r6 = new wd2(new xd2(nf.a(r5)));
    L88:
        if (r6.a.a.isEmpty() == false) goto L92;
        String r7 = si0.I(r8);
        Object r10 = r8.getSystemService("locale");
        if (r10 == null) goto L92;
        nf.b(r10, mf.a(r7));
    L92:
        r8.getPackageManager().setComponentEnabledSetting(r4, 1, 1);
    L86:
        r6 = wd2.b;
        goto L88
    L83:
        r6 = pf.p;
        if (r6 == null) goto L86;
    L93:
        pf.s = true;
        return;
    L95:
        gi1.j(r8);     // Catch: Exception -> L16
        return;
    L16:
        e = move-exception;
        Log.w("HubEvents", "Check after event failed", e);
        return;
    L32:
        if (ud3.o() != null) goto L34;
        au0.w(r8).g();
    L34:
        String r11 = ud3.o();
        if (r11 == null) goto L114;
        Uri r12 = Uri.parse(r11);
        Uri r13 = DocumentsContract.buildDocumentUriUsingTree(r12, DocumentsContract.getTreeDocumentId(r12));
        af4 r14 = new af4(r8, r13);
        if (r8.checkCallingOrSelfUriPermission(r13, 2) != 0) goto L71;
        String r15 = h12.K(r8, r13, "mime_type");
        int r16 = (int) h12.J(r8, r13, "flags", 0);
        if (TextUtils.isEmpty(r15) == true) goto L71;
        if ((r16 & 4) == 0) goto L46;
    L54:
        lg1 r17 = new lg1(10, AppDatabase.y().w());
        Thread r18 = new Thread(r17);
        r18.start();
        r18.join();     // Catch: InterruptedException -> L57
    L59:
        List r19 = (List) r17.p;
        HashMap r20 = new HashMap();
        Iterator r21 = r19.iterator();
    L61:
        if (r21.hasNext() == false) goto L65;
        Download r22 = (Download) r21.next();
        if (r22.getDownloadUri() == null) goto L61;
        r20.put(r22.getDownloadUri(), r22);
        goto L61
    L65:
        af4[] r23 = r14.g();
        int r24 = r23.length;
        int r25 = 0;
    L66:
        if (r25 >= r24) goto L71;
        af4 r26 = r23[r25];
        String r27 = r26.d().toString();
        if (r20.containsKey(r27) == false) goto L70;
        r26.a();
        new Thread(new qt0(AppDatabase.y().w(), ((Download) r20.get(r27)).getId(), r1)).start();
    L70:
        r25 = r25 + 1;
    L57:
        e = move-exception;
        e.printStackTrace();
        goto L59
    L46:
        if ("vnd.android.document/directory".equals(r15) == false) goto L51;
        if ((r16 & 8) != 0) goto L54;
    L51:
        if (TextUtils.isEmpty(r15) == true) goto L71;
        if ((r16 & 2) != 0) goto L54;
    L71:
        g51.i();
        j51.o();
        return;
    }
}
