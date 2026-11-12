package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
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

    public qj2(bq4 bq4Var, Context context) {
        this.n = bq4Var;
        attachBaseContext(context);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0108  */
    /* JADX WARN: Code duplicated, block: B:86:0x020e  */
    @Override // android.service.media.MediaBrowserService
    public final MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
        Bundle bundle2;
        hd5 hd5Var;
        hd5 hd5Var2;
        hd5 hd5Var3;
        fr2 fr2VarB;
        m92 m92Var;
        Bundle bundle3;
        Bundle bundleN = f35.n(bundle);
        bq4 bq4Var = this.n;
        pn2 pn2Var = (pn2) bq4Var.q;
        Bundle bundle4 = bundleN == null ? null : new Bundle(bundleN);
        int i2 = -1;
        if (bundle4 == null || bundle4.getInt("extra_client_version", 0) == 0) {
            bundle2 = null;
        } else {
            bundle4.remove("extra_client_version");
            bq4Var.p = new Messenger(pn2Var.t);
            Bundle bundle5 = new Bundle();
            bundle5.putInt("extra_service_version", 2);
            bundle5.putBinder("extra_messenger", ((Messenger) bq4Var.p).getBinder());
            pr2 pr2Var = pn2Var.u;
            if (pr2Var != null) {
                qu1 qu1VarA = pr2Var.a();
                bundle5.putBinder("extra_session_binder", qu1VarA == null ? null : qu1VarA.asBinder());
            } else {
                ((ArrayList) bq4Var.n).add(bundle5);
            }
            i2 = bundle4.getInt("extra_calling_pid", -1);
            bundle4.remove("extra_calling_pid");
            bundle2 = bundle5;
        }
        oj2 oj2Var = new oj2(pn2Var, str, i2, i, null);
        pn2Var.s = oj2Var;
        tn2 tn2Var = pn2Var.z;
        na4 na4Var = pn2Var.x;
        bq4 bq4Var2 = pn2Var.n;
        bq4Var2.getClass();
        ms2 ms2VarJ = bq4Var2.j();
        Bundle bundle6 = bundle4 != null ? bundle4 : Bundle.EMPTY;
        boolean zG = pn2Var.v.G(ms2VarJ);
        on2 on2Var = new on2(pn2Var, ms2VarJ);
        jx1 jx1Var = f92.a;
        Math.max(0, bundle6.getInt("androidx.media.utils.MediaBrowserCompat.extras.CUSTOM_BROWSER_ACTION_LIMIT", 0));
        fr2 fr2Var = new fr2(ms2VarJ, 0, 0, zG, on2Var, bundle6);
        AtomicReference atomicReference = new AtomicReference();
        q90 q90Var = new q90();
        f35.W(pn2Var.w.l, new t6(pn2Var, atomicReference, fr2Var, q90Var, 22));
        try {
            q90Var.a();
            dr2 dr2Var = (dr2) atomicReference.get();
            dr2Var.getClass();
            na4Var.a(ms2VarJ, fr2Var, dr2Var.a, dr2Var.b);
            hd5Var = ju2.a;
        } catch (InterruptedException e) {
            l93.G("MSSLegacyStub", "Couldn't get a result from onConnect", e);
            hd5Var = null;
        }
        if (hd5Var == null || (fr2VarB = pn2Var.b()) == null || !na4Var.I(fr2VarB, 50000)) {
            hd5Var2 = null;
        } else {
            jn2 jn2VarH = f92.h(tn2Var.f, bundle4);
            AtomicReference atomicReference2 = new AtomicReference();
            q90 q90Var2 = new q90();
            f35.W(tn2Var.l, new mr(pn2Var, atomicReference2, fr2VarB, jn2VarH, q90Var2, 6));
            try {
                q90Var2.a();
                m92Var = (m92) ((ic2) atomicReference2.get()).get();
                rr2.s(m92Var, "LibraryResult must not be null");
            } catch (InterruptedException | CancellationException | ExecutionException e2) {
                l93.G("MLSLegacyStub", "Couldn't get a result from onGetLibraryRoot", e2);
                m92Var = null;
            }
            if (m92Var != null) {
                Object obj = m92Var.c;
                if (m92Var.a == 0 && obj != null) {
                    jn2 jn2Var = m92Var.e;
                    if (jn2Var != null) {
                        Bundle bundle7 = jn2Var.a;
                        bundle3 = new Bundle(bundle7);
                        if (bundle7.containsKey("androidx.media3.session.LibraryParams.Extras.KEY_ROOT_CHILDREN_BROWSABLE_ONLY")) {
                            boolean z = bundle7.getBoolean("androidx.media3.session.LibraryParams.Extras.KEY_ROOT_CHILDREN_BROWSABLE_ONLY", false);
                            bundle3.remove("androidx.media3.session.LibraryParams.Extras.KEY_ROOT_CHILDREN_BROWSABLE_ONLY");
                            bundle3.putInt("androidx.media.MediaBrowserCompat.Extras.KEY_ROOT_CHILDREN_SUPPORTED_FLAGS", z ? 1 : 3);
                        }
                        bundle3.putBoolean("android.service.media.extra.RECENT", jn2Var.b);
                        bundle3.putBoolean("android.service.media.extra.OFFLINE", jn2Var.c);
                        bundle3.putBoolean("android.service.media.extra.SUGGESTED", jn2Var.d);
                    } else {
                        bundle3 = new Bundle();
                    }
                    bundle3.putBoolean("android.media.browse.SEARCH_SUPPORTED", na4Var.I(fr2VarB, 50005));
                    yw1 yw1Var = tn2Var.q;
                    if (!yw1Var.isEmpty()) {
                        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                        for (int i3 = 0; i3 < yw1Var.size(); i3++) {
                            j60 j60Var = (j60) yw1Var.get(i3);
                            va4 va4Var = j60Var.a;
                            if (va4Var != null && va4Var.a == 0) {
                                Bundle bundle8 = new Bundle();
                                va4 va4Var2 = j60Var.a;
                                Bundle bundle9 = j60Var.g;
                                if (va4Var2 != null) {
                                    bundle8.putString("androidx.media.utils.extras.KEY_CUSTOM_BROWSER_ACTION_ID", va4Var2.b);
                                }
                                bundle8.putString("androidx.media.utils.extras.KEY_CUSTOM_BROWSER_ACTION_LABEL", j60Var.f.toString());
                                Uri uri = j60Var.e;
                                if (uri != null) {
                                    bundle8.putString("androidx.media.utils.extras.KEY_CUSTOM_BROWSER_ACTION_ICON_URI", uri.toString());
                                }
                                if (!bundle9.isEmpty()) {
                                    bundle8.putBundle("androidx.media.utils.extras.KEY_CUSTOM_BROWSER_ACTION_EXTRAS", bundle9);
                                }
                                arrayList.add(bundle8);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            bundle3.putParcelableArrayList("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ROOT_LIST", arrayList);
                        }
                    }
                    hd5Var2 = new hd5(((gn2) obj).a, bundle3);
                } else if (m92Var != null || m92Var.a == 0) {
                    hd5Var2 = ju2.a;
                } else {
                    hd5Var2 = null;
                }
            } else {
                if (m92Var != null) {
                }
                hd5Var2 = ju2.a;
            }
        }
        pn2Var.s = null;
        if (hd5Var2 == null) {
            hd5Var3 = null;
        } else {
            if (((Messenger) bq4Var.p) != null) {
                pn2Var.q.add(oj2Var);
            }
            Bundle bundle10 = (Bundle) hd5Var2.p;
            if (bundle2 == null) {
                bundle2 = bundle10;
            } else if (bundle10 != null) {
                bundle2.putAll(bundle10);
            }
            hd5Var3 = new hd5((String) hd5Var2.o, bundle2);
        }
        if (hd5Var3 == null) {
            return null;
        }
        return new MediaBrowserService.BrowserRoot((String) hd5Var3.o, (Bundle) hd5Var3.p);
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadChildren(String str, MediaBrowserService.Result result) {
        pj2 pj2Var = new pj2(str, new om1(7, result), 0);
        pn2 pn2Var = (pn2) this.n.q;
        pn2Var.s = pn2Var.p;
        pn2Var.d(str, pj2Var, null);
        pn2Var.s = null;
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadItem(String str, MediaBrowserService.Result result) {
        pj2 pj2Var = new pj2(str, new om1(7, result), 1);
        pn2 pn2Var = (pn2) this.n.q;
        pn2Var.s = pn2Var.p;
        pn2Var.e(str, pj2Var);
        pn2Var.s = null;
    }
}
