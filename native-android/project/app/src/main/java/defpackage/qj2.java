package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcelable;
import android.service.media.MediaBrowserService;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class qj2 extends MediaBrowserService {
    public final /* synthetic */ bq4 n;

    public qj2(bq4 r1, Context r2) {
        this.n = r1;
        attachBaseContext(r2);
    }

    @Override // android.service.media.MediaBrowserService
    public final MediaBrowserService.BrowserRoot onGetRoot(String r24, int r25, Bundle r26) {
        Bundle r0 = f35.n(r26);
        bq4 r1 = this.n;
        pn2 r4 = (pn2) r1.q;
        if (r0 != null) goto L5;
        Bundle r9 = null;
    L6:
        int r10 = 0;
        int r2 = -1;
        if (r9 != null) goto L9;
    L20:
        Bundle r11 = null;
    L21:
        oj2 r3 = new oj2(r4, r24, r2, r25, null);
        r4.s = r3;
        tn2 r13 = r4.z;
        na4 r14 = r4.x;
        bq4 r5 = r4.n;
        r5.getClass();
        ms2 r6 = r5.j();
        if (r9 == null) goto L24;
        Bundle r7 = r9;
    L25:
        boolean r19 = r4.v.G(r6);
        on2 r8 = new on2(r4, r6);
        jx1 r12 = f92.a;
        Math.max(0, r7.getInt("androidx.media.utils.MediaBrowserCompat.extras.CUSTOM_BROWSER_ACTION_LIMIT", 0));
        fr2 r15 = new fr2(r6, 0, 0, r19, r8, r7);
        AtomicReference r16 = new AtomicReference();
        q90 r17 = new q90();
        f35.W(r4.w.l, new t6(r4, r16, r15, r17, 22));
        r17.a();     // Catch: InterruptedException -> L28
        dr2 r18 = (dr2) r16.get();
        r18.getClass();
        r14.a(r6, r15, r18.a, r18.b);
        hd5 r20 = ju2.a;
    L30:
        if (r20 == null) goto L37;
        fr2 r21 = r4.b();
        if (r21 == null) goto L37;
        if (r14.I(r21, 50000) == false) goto L37;
        jn2 r22 = f92.h(r13.f, r9);
        AtomicReference r23 = new AtomicReference();
        q90 r27 = new q90();
        f35.W(r13.l, new mr(r4, r23, r21, r22, r27, 6));
        r27.a();     // Catch: Throwable -> L41 ExecutionException -> L43 CancellationException -> L45
        m92 r28 = (m92) ((ic2) r23.get()).get();     // Catch: Throwable -> L41 ExecutionException -> L43 CancellationException -> L45
        rr2.s(r28, "LibraryResult must not be null");     // Catch: Throwable -> L41 ExecutionException -> L43 CancellationException -> L45
    L47:
        if (r28 == null) goto L86;
        Object r29 = r28.c;
        if (r28.a != 0) goto L86;
        if (r29 == null) goto L86;
        jn2 r30 = r28.e;
        if (r30 == null) goto L61;
        Bundle r31 = r30.a;
        Bundle r32 = new Bundle(r31);
        if (r31.containsKey("androidx.media3.session.LibraryParams.Extras.KEY_ROOT_CHILDREN_BROWSABLE_ONLY") == false) goto L60;
        boolean r33 = r31.getBoolean("androidx.media3.session.LibraryParams.Extras.KEY_ROOT_CHILDREN_BROWSABLE_ONLY", false);
        r32.remove("androidx.media3.session.LibraryParams.Extras.KEY_ROOT_CHILDREN_BROWSABLE_ONLY");
        if (r33 == false) goto L58;
        int r34 = 1;
    L59:
        r32.putInt("androidx.media.MediaBrowserCompat.Extras.KEY_ROOT_CHILDREN_SUPPORTED_FLAGS", r34);
        goto L60
    L58:
        r34 = 3;
    L60:
        r32.putBoolean("android.service.media.extra.RECENT", r30.b);
        r32.putBoolean("android.service.media.extra.OFFLINE", r30.c);
        r32.putBoolean("android.service.media.extra.SUGGESTED", r30.d);
    L62:
        r32.putBoolean("android.media.browse.SEARCH_SUPPORTED", r14.I(r21, 50005));
        yw1 r35 = r13.q;
        if (r35.isEmpty() == true) goto L85;
        ArrayList<? extends Parcelable> r36 = new ArrayList();
    L66:
        if (r10 >= r35.size()) goto L83;
        j60 r37 = (j60) r35.get(r10);
        va4 r38 = r37.a;
        if (r38 == null) goto L81;
        if (r38.a != 0) goto L81;
        Bundle r39 = new Bundle();
        va4 r40 = r37.a;
        Bundle r110 = r37.g;
        if (r40 == null) goto L74;
        r39.putString("androidx.media.utils.extras.KEY_CUSTOM_BROWSER_ACTION_ID", r40.b);
    L74:
        r39.putString("androidx.media.utils.extras.KEY_CUSTOM_BROWSER_ACTION_LABEL", r37.f.toString());
        Uri r41 = r37.e;
        if (r41 == null) goto L78;
        r39.putString("androidx.media.utils.extras.KEY_CUSTOM_BROWSER_ACTION_ICON_URI", r41.toString());
    L78:
        if (r110.isEmpty() == true) goto L80;
        r39.putBundle("androidx.media.utils.extras.KEY_CUSTOM_BROWSER_ACTION_EXTRAS", r110);
    L80:
        r36.add(r39);
    L81:
        r10 = r10 + 1;
        goto L66
    L83:
        if (r36.isEmpty() == true) goto L85;
        r32.putParcelableArrayList("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ROOT_LIST", r36);
    L85:
        hd5 r42 = new hd5(((gn2) r29).a, r32);
    L91:
        r4.s = null;
        if (r42 != null) goto L95;
        hd5 r43 = null;
    L103:
        if (r43 != null) goto L106;
        return null;
    L106:
        return new MediaBrowserService.BrowserRoot((String) r43.o, (Bundle) r43.p);
    L95:
        if (((Messenger) r1.p) == null) goto L97;
        r4.q.add(r3);
    L97:
        Bundle r44 = (Bundle) r42.p;
        if (r11 != null) goto L100;
        r11 = r44;
    L102:
        r43 = new hd5((String) r42.o, r11);
        goto L103
    L100:
        if (r44 == null) goto L102;
        r11.putAll(r44);
        goto L102
    L61:
        r32 = new Bundle();
    L86:
        if (r28 != null) goto L88;
    L90:
        r42 = ju2.a;
        goto L91
    L88:
        if (r28.a == 0) goto L90;
    L41:
        e = move-exception;
        l93.G("MLSLegacyStub", "Couldn't get a result from onGetLibraryRoot", e);
        r28 = null;
    L37:
        r42 = null;
    L28:
        e = move-exception;
        l93.G("MSSLegacyStub", "Couldn't get a result from onConnect", e);
        r20 = null;
        goto L30
    L24:
        r7 = Bundle.EMPTY;
        goto L25
    L9:
        if (r9.getInt("extra_client_version", 0) == 0) goto L20;
        r9.remove("extra_client_version");
        r1.p = new Messenger(r4.t);
        Bundle r45 = new Bundle();
        r45.putInt("extra_service_version", 2);
        r45.putBinder("extra_messenger", ((Messenger) r1.p).getBinder());
        pr2 r46 = r4.u;
        if (r46 == null) goto L17;
        qu1 r47 = r46.a();
        if (r47 != null) goto L15;
        IBinder r48 = null;
    L16:
        r45.putBinder("extra_session_binder", r48);
    L18:
        r2 = r9.getInt("extra_calling_pid", -1);
        r9.remove("extra_calling_pid");
        r11 = r45;
        goto L21
    L15:
        r48 = r47.asBinder();
        goto L16
    L17:
        ((ArrayList) r1.n).add(r45);
        goto L18
    L5:
        r9 = new Bundle(r0);
        goto L6
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadChildren(String r3, MediaBrowserService.Result r4) {
        pj2 r5 = new pj2(r3, new om1(7, r4), 0);
        pn2 r2 = (pn2) this.n.q;
        r2.s = r2.p;
        r2.d(r3, r5, null);
        r2.s = null;
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadItem(String r3, MediaBrowserService.Result r4) {
        pj2 r5 = new pj2(r3, new om1(7, r4), 1);
        pn2 r2 = (pn2) this.n.q;
        r2.s = r2.p;
        r2.e(r3, r5);
        r2.s = null;
    }
}
