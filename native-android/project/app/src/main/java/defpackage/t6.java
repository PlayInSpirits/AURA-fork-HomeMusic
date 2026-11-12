package defpackage;

import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.session.MediaSession;
import android.net.Uri;
import android.net.nsd.NsdServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.preference.Preference;
import androidx.work.impl.WorkDatabase;
import app.homemusic.R;
import com.bumptech.glide.a;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.homemusic.HubAssistantTask;
import com.eddyizm.tempus.homemusic.HubAuthOptions;
import com.eddyizm.tempus.homemusic.HubException;
import com.eddyizm.tempus.homemusic.HubMe;
import com.eddyizm.tempus.homemusic.HubMix;
import com.eddyizm.tempus.homemusic.HubShareActivity;
import com.eddyizm.tempus.homemusic.PlayEvent;
import com.eddyizm.tempus.homemusic.SmartAddOut;
import com.eddyizm.tempus.homemusic.SmartContexts;
import com.eddyizm.tempus.homemusic.SmartSession;
import com.eddyizm.tempus.homemusic.WaveOrigin;
import com.eddyizm.tempus.homemusic.WaveRetry;
import com.eddyizm.tempus.homemusic.WaveSession;
import com.eddyizm.tempus.homemusic.b;
import com.eddyizm.tempus.provider.AlbumArtContentProvider;
import com.eddyizm.tempus.service.MediaService;
import com.eddyizm.tempus.subsonic.base.ApiResponse;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.subsonic.models.Playlist;
import com.eddyizm.tempus.subsonic.models.PlaylistWithSongs;
import com.eddyizm.tempus.subsonic.models.SubsonicResponse;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.fragment.SearchFragment;
import com.eddyizm.tempus.ui.fragment.bottomsheetdialog.ArtistBottomSheetDialog;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t6 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    public /* synthetic */ t6(pn2 pn2Var, fr2 fr2Var, nj2 nj2Var, String str, Bundle bundle) {
        this.n = 15;
        this.o = pn2Var;
        this.p = fr2Var;
        this.q = nj2Var;
        this.r = bundle;
    }

    private final void a() {
        lo2 lo2Var = (lo2) this.o;
        String str = (String) this.p;
        Bundle bundle = (Bundle) this.q;
        lo2Var.r.execute(new v6(lo2Var, (sk2) this.r, str, bundle));
    }

    private final void b() {
        lo2 lo2Var = (lo2) this.o;
        bl2 bl2Var = (bl2) this.p;
        ko2 ko2Var = (ko2) this.q;
        kn2 kn2Var = (kn2) this.r;
        try {
            sk2 sk2Var = (sk2) bl2Var.get(0L, TimeUnit.MILLISECONDS);
            if (lo2Var.d(kn2Var)) {
                ko2Var.n.k(ko2Var.o, false);
            }
            sk2Var.v(ko2Var);
        } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException unused) {
            lo2Var.n.l(kn2Var);
        }
    }

    private final void c() {
        ((zh0) this.p).D((nq2) this.o, (sp2) this.q, (ArrayList) this.r);
    }

    private final void d() {
        ((zh0) this.p).D((nq2) this.o, (sp2) this.q, (Collection) this.r);
    }

    private final void e() {
        Bitmap bitmap;
        lr0 lr0Var = (lr0) this.o;
        AtomicInteger atomicInteger = (AtomicInteger) this.p;
        ArrayList arrayList = (ArrayList) this.q;
        ArrayList arrayList2 = (ArrayList) this.r;
        if (atomicInteger.incrementAndGet() == arrayList.size()) {
            ArrayList arrayList3 = new ArrayList();
            int i = 0;
            while (i < arrayList2.size()) {
                ic2 ic2Var = (ic2) arrayList2.get(i);
                if (ic2Var != null) {
                    try {
                        bitmap = (Bitmap) hw.j(ic2Var);
                    } catch (CancellationException | ExecutionException e) {
                        l93.B("MediaSessionLegacyStub", "Failed to get bitmap", e);
                        bitmap = null;
                    }
                } else {
                    bitmap = null;
                }
                arrayList3.add(new or2(null, f92.i((gn2) arrayList.get(i), bitmap), i == -1 ? -1L : i));
                i++;
            }
            ls2.E(((ls2) lr0Var.r).m, arrayList3);
        }
    }

    private final void f() {
        pn2 pn2Var = (pn2) this.o;
        AtomicReference atomicReference = (AtomicReference) this.p;
        fr2 fr2Var = (fr2) this.q;
        q90 q90Var = (q90) this.r;
        atomicReference.set(pn2Var.w.p(fr2Var));
        q90Var.d();
    }

    private final void g() throws Throwable {
        ju1 ju1Var;
        Bundle bundleB;
        kt2 kt2Var = (kt2) this.o;
        fr2 fr2Var = (fr2) this.p;
        tn2 tn2Var = (tn2) this.q;
        ju1 ju1Var2 = (ju1) this.r;
        na4 na4Var = kt2Var.f;
        boolean z = false;
        try {
            kt2Var.g.remove(fr2Var);
            if (tn2Var.l()) {
                au0.k(ju1Var2);
                return;
            }
            ft2 ft2Var = (ft2) fr2Var.d;
            ft2Var.getClass();
            IBinder iBinderAsBinder = ft2Var.n.asBinder();
            dr2 dr2VarP = tn2Var.p(fr2Var);
            if (na4Var.F(fr2Var)) {
                l93.q0("MediaSessionStub", "Controller " + fr2Var + " has sent connection request multiple times");
            }
            na4Var.a(iBinderAsBinder, fr2Var, dr2VarP.a, dr2VarP.b);
            yk ykVarC = na4Var.C(fr2Var);
            if (ykVarC == null) {
                l93.q0("MediaSessionStub", "Ignoring connection request from unknown controller info");
                au0.k(ju1Var2);
                return;
            }
            al3 al3Var = tn2Var.s;
            lk3 lk3Var = tn2Var.r;
            mi3 mi3Var = dr2VarP.b;
            lk3 lk3VarX = kt2Var.X(lk3Var);
            MediaSession.Token token = ((kr2) tn2Var.h.m.o).c.o;
            PendingIntent pendingIntent = tn2Var.t;
            yw1 yw1Var = dr2VarP.c;
            if (yw1Var == null) {
                yw1Var = tn2Var.z;
            }
            yw1 yw1Var2 = dr2VarP.d;
            if (yw1Var2 == null) {
                yw1Var2 = tn2Var.A;
            }
            try {
                oa0 oa0Var = new oa0(1009002300, 8, kt2Var, pendingIntent, yw1Var, yw1Var2, tn2Var.q, dr2VarP.a, mi3Var, al3Var.o(), tn2Var.j.a.getExtras(), tn2Var.B, lk3VarX, token);
                if (tn2Var.l()) {
                    au0.k(ju1Var2);
                    return;
                }
                try {
                    int iS = ykVarC.s();
                    ju1Var = ju1Var2;
                    try {
                        if (ju1Var instanceof mm2) {
                            bundleB = new Bundle();
                            bundleB.putBinder(oa0.B, new na0(oa0Var));
                        } else {
                            bundleB = oa0Var.b(fr2Var.c);
                        }
                        ju1Var.r(iS, bundleB);
                        z = true;
                    } catch (RemoteException unused) {
                    }
                } catch (RemoteException unused2) {
                    ju1Var = ju1Var2;
                }
                if (z && (!tn2Var.y || !tn2.m(fr2Var))) {
                    tn2Var.e.getClass();
                }
                if (z) {
                    return;
                }
                au0.k(ju1Var);
            } catch (Throwable th) {
                th = th;
                ju1Var2 = ju1Var2;
                if (0 == 0) {
                    au0.k(ju1Var2);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private final void h() {
        tn2 tn2Var = (tn2) this.o;
        lb4 lb4Var = (lb4) this.p;
        wc0 wc0Var = (wc0) this.q;
        ic2 ic2Var = (ic2) this.r;
        if (tn2Var.l()) {
            lb4Var.l(null);
            return;
        }
        try {
            wc0Var.accept(ic2Var);
            lb4Var.l(null);
        } catch (Throwable th) {
            lb4Var.m(th);
        }
    }

    private final void i() {
        tn2 tn2Var = (tn2) this.o;
        ht2 ht2Var = (ht2) this.p;
        fr2 fr2Var = (fr2) this.q;
        List list = (List) this.r;
        if (tn2Var.l()) {
            return;
        }
        ht2Var.b(tn2Var.s, fr2Var, list);
    }

    private final void j() {
        mm3 mm3Var = (mm3) this.o;
        Boolean bool = (Boolean) this.p;
        String str = (String) this.q;
        ArrayList arrayList = (ArrayList) this.r;
        Boolean boolJ = Boolean.TRUE;
        if (!boolJ.equals(bool)) {
            boolJ = mm3Var.j(str);
        }
        App.f(false).g().S(str, null, boolJ, arrayList, null).enqueue(new pz1(13, mm3Var));
    }

    private final void k() {
        mm3 mm3Var = (mm3) this.o;
        String str = (String) this.p;
        ArrayList arrayList = (ArrayList) this.q;
        hq1 hq1Var = (hq1) this.r;
        mm3Var.getClass();
        App.f(false).g().S(str, null, mm3Var.j(str), null, arrayList).enqueue(new xc5(mm3Var, hq1Var));
    }

    private final void l() {
        List list = (List) this.o;
        rc5 rc5Var = (rc5) this.p;
        r90 r90Var = (r90) this.q;
        WorkDatabase workDatabase = (WorkDatabase) this.r;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((a64) it.next()).d(rc5Var.a);
        }
        c64.b(r90Var, workDatabase, list);
    }

    /* JADX WARN: Code duplicated, block: B:193:0x0483  */
    /* JADX WARN: Code duplicated, block: B:194:0x0486 A[Catch: Exception -> 0x0359, TryCatch #12 {Exception -> 0x0359, blocks: (B:130:0x02bb, B:132:0x02d0, B:136:0x02e2, B:139:0x02f0, B:143:0x02f6, B:145:0x02fd, B:146:0x0309, B:147:0x0313, B:149:0x031c, B:152:0x035c, B:154:0x0381, B:156:0x0387, B:158:0x0390, B:160:0x039a, B:161:0x03c5, B:164:0x03d3, B:166:0x03ed, B:167:0x03f5, B:169:0x03fe, B:170:0x0401, B:173:0x0408, B:175:0x0412, B:187:0x044d, B:189:0x0453, B:191:0x0459, B:196:0x048d, B:199:0x049d, B:201:0x04a9, B:203:0x04b3, B:202:0x04ae, B:194:0x0486, B:205:0x04ca, B:207:0x04d1, B:209:0x04e3, B:210:0x04fd, B:206:0x04cf, B:177:0x041b, B:178:0x042b, B:180:0x042f, B:182:0x0439, B:183:0x0443, B:184:0x0446), top: B:437:0x02bb, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:196:0x048d A[Catch: Exception -> 0x0359, TryCatch #12 {Exception -> 0x0359, blocks: (B:130:0x02bb, B:132:0x02d0, B:136:0x02e2, B:139:0x02f0, B:143:0x02f6, B:145:0x02fd, B:146:0x0309, B:147:0x0313, B:149:0x031c, B:152:0x035c, B:154:0x0381, B:156:0x0387, B:158:0x0390, B:160:0x039a, B:161:0x03c5, B:164:0x03d3, B:166:0x03ed, B:167:0x03f5, B:169:0x03fe, B:170:0x0401, B:173:0x0408, B:175:0x0412, B:187:0x044d, B:189:0x0453, B:191:0x0459, B:196:0x048d, B:199:0x049d, B:201:0x04a9, B:203:0x04b3, B:202:0x04ae, B:194:0x0486, B:205:0x04ca, B:207:0x04d1, B:209:0x04e3, B:210:0x04fd, B:206:0x04cf, B:177:0x041b, B:178:0x042b, B:180:0x042f, B:182:0x0439, B:183:0x0443, B:184:0x0446), top: B:437:0x02bb, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:197:0x0499  */
    /* JADX WARN: Code duplicated, block: B:202:0x04ae A[Catch: Exception -> 0x0359, TryCatch #12 {Exception -> 0x0359, blocks: (B:130:0x02bb, B:132:0x02d0, B:136:0x02e2, B:139:0x02f0, B:143:0x02f6, B:145:0x02fd, B:146:0x0309, B:147:0x0313, B:149:0x031c, B:152:0x035c, B:154:0x0381, B:156:0x0387, B:158:0x0390, B:160:0x039a, B:161:0x03c5, B:164:0x03d3, B:166:0x03ed, B:167:0x03f5, B:169:0x03fe, B:170:0x0401, B:173:0x0408, B:175:0x0412, B:187:0x044d, B:189:0x0453, B:191:0x0459, B:196:0x048d, B:199:0x049d, B:201:0x04a9, B:203:0x04b3, B:202:0x04ae, B:194:0x0486, B:205:0x04ca, B:207:0x04d1, B:209:0x04e3, B:210:0x04fd, B:206:0x04cf, B:177:0x041b, B:178:0x042b, B:180:0x042f, B:182:0x0439, B:183:0x0443, B:184:0x0446), top: B:437:0x02bb, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:205:0x04ca A[Catch: Exception -> 0x0359, TryCatch #12 {Exception -> 0x0359, blocks: (B:130:0x02bb, B:132:0x02d0, B:136:0x02e2, B:139:0x02f0, B:143:0x02f6, B:145:0x02fd, B:146:0x0309, B:147:0x0313, B:149:0x031c, B:152:0x035c, B:154:0x0381, B:156:0x0387, B:158:0x0390, B:160:0x039a, B:161:0x03c5, B:164:0x03d3, B:166:0x03ed, B:167:0x03f5, B:169:0x03fe, B:170:0x0401, B:173:0x0408, B:175:0x0412, B:187:0x044d, B:189:0x0453, B:191:0x0459, B:196:0x048d, B:199:0x049d, B:201:0x04a9, B:203:0x04b3, B:202:0x04ae, B:194:0x0486, B:205:0x04ca, B:207:0x04d1, B:209:0x04e3, B:210:0x04fd, B:206:0x04cf, B:177:0x041b, B:178:0x042b, B:180:0x042f, B:182:0x0439, B:183:0x0443, B:184:0x0446), top: B:437:0x02bb, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:206:0x04cf A[Catch: Exception -> 0x0359, TryCatch #12 {Exception -> 0x0359, blocks: (B:130:0x02bb, B:132:0x02d0, B:136:0x02e2, B:139:0x02f0, B:143:0x02f6, B:145:0x02fd, B:146:0x0309, B:147:0x0313, B:149:0x031c, B:152:0x035c, B:154:0x0381, B:156:0x0387, B:158:0x0390, B:160:0x039a, B:161:0x03c5, B:164:0x03d3, B:166:0x03ed, B:167:0x03f5, B:169:0x03fe, B:170:0x0401, B:173:0x0408, B:175:0x0412, B:187:0x044d, B:189:0x0453, B:191:0x0459, B:196:0x048d, B:199:0x049d, B:201:0x04a9, B:203:0x04b3, B:202:0x04ae, B:194:0x0486, B:205:0x04ca, B:207:0x04d1, B:209:0x04e3, B:210:0x04fd, B:206:0x04cf, B:177:0x041b, B:178:0x042b, B:180:0x042f, B:182:0x0439, B:183:0x0443, B:184:0x0446), top: B:437:0x02bb, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:209:0x04e3 A[Catch: Exception -> 0x0359, LOOP:5: B:208:0x04e1->B:209:0x04e3, LOOP_END, TryCatch #12 {Exception -> 0x0359, blocks: (B:130:0x02bb, B:132:0x02d0, B:136:0x02e2, B:139:0x02f0, B:143:0x02f6, B:145:0x02fd, B:146:0x0309, B:147:0x0313, B:149:0x031c, B:152:0x035c, B:154:0x0381, B:156:0x0387, B:158:0x0390, B:160:0x039a, B:161:0x03c5, B:164:0x03d3, B:166:0x03ed, B:167:0x03f5, B:169:0x03fe, B:170:0x0401, B:173:0x0408, B:175:0x0412, B:187:0x044d, B:189:0x0453, B:191:0x0459, B:196:0x048d, B:199:0x049d, B:201:0x04a9, B:203:0x04b3, B:202:0x04ae, B:194:0x0486, B:205:0x04ca, B:207:0x04d1, B:209:0x04e3, B:210:0x04fd, B:206:0x04cf, B:177:0x041b, B:178:0x042b, B:180:0x042f, B:182:0x0439, B:183:0x0443, B:184:0x0446), top: B:437:0x02bb, inners: #4 }] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        String string;
        String string2;
        String string3;
        Object s14Var;
        SubsonicResponse subsonicResponse;
        Object s14Var2;
        Object s14Var3;
        HubMe hubMe;
        Object s14Var4;
        Throwable th;
        String string4;
        ArrayList arrayList;
        String str;
        String string5;
        Collection collectionO;
        ArrayList arrayList2;
        int size;
        int i;
        Matcher matcher;
        jv3 jv3Var;
        jv3 jv3Var2;
        String str2;
        HubAssistantTask hubAssistantTaskB;
        String strGroup;
        String string6;
        Object s14Var5;
        Bitmap bitmap;
        ae1 ae1Var;
        int i2 = 0;
        switch (this.n) {
            case 0:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) this.o;
                File file = (File) this.p;
                Context context = (Context) this.q;
                Uri uri = (Uri) this.r;
                int i3 = AlbumArtContentProvider.o;
                try {
                    ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor);
                    if (file == null) {
                        try {
                            vz3 vz3Var = (vz3) a.c(context).p().N(uri).e(xq0.d);
                            if (ud3.R()) {
                                vz3Var = (vz3) vz3Var.l();
                            }
                            file = (File) vz3Var.R(Integer.MIN_VALUE, Integer.MIN_VALUE).get();
                        } catch (Throwable th2) {
                            try {
                                autoCloseOutputStream.close();
                                throw th2;
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                                throw th2;
                            }
                        }
                    }
                    try {
                        FileInputStream fileInputStream = new FileInputStream(file);
                        try {
                            byte[] bArr = new byte[8192];
                            while (true) {
                                int i4 = fileInputStream.read(bArr);
                                if (i4 == -1) {
                                    fileInputStream.close();
                                    autoCloseOutputStream.close();
                                    return;
                                }
                                autoCloseOutputStream.write(bArr, 0, i4);
                            }
                        } catch (Throwable th4) {
                            try {
                                fileInputStream.close();
                                throw th4;
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                                throw th4;
                            }
                        }
                    } catch (Exception e) {
                        parcelFileDescriptor.closeWithError("Failed to load image: " + e.getMessage());
                    }
                } catch (Exception e2) {
                    try {
                        parcelFileDescriptor.closeWithError("Failed to load image: " + e2.getMessage());
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                }
                break;
            case 1:
                ArtistBottomSheetDialog artistBottomSheetDialog = (ArtistBottomSheetDialog) this.o;
                TextView textView = (TextView) this.p;
                TextView textView2 = (TextView) this.q;
                TextView textView3 = (TextView) this.r;
                artistBottomSheetDialog.F0 = false;
                if (textView != null) {
                    textView.setEnabled(true);
                }
                if (textView2 != null) {
                    textView2.setEnabled(true);
                }
                if (textView3 != null) {
                    textView3.setEnabled(true);
                    return;
                }
                return;
            case 2:
                qi3 qi3Var = (qi3) this.o;
                String strO = (String) this.p;
                String str3 = (String) this.q;
                MediaService mediaService = (MediaService) this.r;
                gn2 gn2VarA = qi3Var.a();
                if (gn2VarA == null) {
                    return;
                }
                do2 do2Var = gn2VarA.d;
                int iO0 = qi3Var.o0();
                if (iO0 == -1) {
                    return;
                }
                Bundle bundle = do2Var.I;
                CharSequence charSequence = do2Var.a;
                if (h12.c(bundle != null ? bundle.getString("type") : null, WaveOrigin.RADIO)) {
                    CharSequence charSequence2 = do2Var.b;
                    if (charSequence2 == null || qm4.u0(charSequence2)) {
                        if (charSequence == null || qm4.u0(charSequence)) {
                            if (bundle == null || (string3 = bundle.getString("radioArtist")) == null || qm4.u0(string3)) {
                                if (bundle == null || (string2 = bundle.getString("radioTitle")) == null || qm4.u0(string2)) {
                                    co2 co2VarA = do2Var.a();
                                    Bundle bundle2 = new Bundle(bundle == null ? new Bundle() : bundle);
                                    if (strO != null) {
                                        bundle2.putString("radioArtist", strO);
                                    }
                                    if (str3 != null) {
                                        bundle2.putString("radioTitle", str3);
                                    }
                                    if (bundle == null || (string = bundle.getString("stationName")) == null) {
                                        string = charSequence != null ? charSequence.toString() : "";
                                    }
                                    if (!qm4.u0(string)) {
                                        bundle2.putString("stationName", string);
                                    }
                                    if (strO != null && !qm4.u0(strO) && str3 != null && !qm4.u0(str3)) {
                                        strO = b11.o(strO, " - ", str3);
                                    } else if (str3 != null && !qm4.u0(str3)) {
                                        strO = str3;
                                    } else if (strO == null || qm4.u0(strO)) {
                                        strO = string;
                                    }
                                    co2VarA.a = strO;
                                    if (!qm4.u0(string)) {
                                        co2VarA.b = string;
                                    }
                                    co2VarA.H = bundle2;
                                    ExoPlayer exoPlayer = qi3Var instanceof ExoPlayer ? (ExoPlayer) qi3Var : null;
                                    if (exoPlayer != null) {
                                        tm2 tm2VarA = gn2VarA.a();
                                        tm2VarA.k = new do2(co2VarA);
                                        ((fq) exoPlayer).z0(iO0, tm2VarA.a());
                                        mediaService.w(exoPlayer);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                na4 na4Var = (na4) this.o;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.p;
                ba0 ba0Var = (ba0) this.q;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.r;
                synchronized (na4Var.n) {
                    try {
                        if (atomicBoolean.get()) {
                            atomicBoolean2.set(true);
                        } else {
                            na4Var.r(ba0Var);
                        }
                    } catch (Throwable th6) {
                        throw th6;
                    }
                    break;
                }
                return;
            case 4:
                String str4 = (String) this.o;
                cp1 cp1Var = (cp1) this.p;
                MainActivity mainActivity = (MainActivity) this.q;
                HubMix hubMix = (HubMix) this.r;
                try {
                    ApiResponse apiResponse = (ApiResponse) App.f(false).g().F(str4).execute().body();
                    s14Var = (apiResponse != null && (subsonicResponse = apiResponse.getSubsonicResponse()) != null) ? subsonicResponse.getPlaylist() : null;
                    break;
                } catch (Throwable th7) {
                    s14Var = new s14(th7);
                }
                io1.b.post(new t6(cp1Var, (PlaylistWithSongs) (s14Var instanceof s14 ? null : s14Var), mainActivity, hubMix, 5));
                return;
            case 5:
                cp1 cp1Var2 = (cp1) this.o;
                PlaylistWithSongs playlistWithSongs = (PlaylistWithSongs) this.p;
                MainActivity mainActivity2 = (MainActivity) this.q;
                HubMix hubMix2 = (HubMix) this.r;
                if (cp1Var2.T == null) {
                    return;
                }
                if (playlistWithSongs == null) {
                    js1.a(mainActivity2, "/mix/" + hubMix2.getId());
                    return;
                }
                String id = playlistWithSongs.getId();
                String name = playlistWithSongs.getName();
                if (name == null) {
                    name = hubMix2.getTitle();
                }
                Playlist playlist = new Playlist(id, name, playlistWithSongs.getDuration(), playlistWithSongs.getCoverArtId());
                playlist.setSongCount(playlistWithSongs.getSongCount());
                Bundle bundle3 = new Bundle();
                bundle3.putParcelable("PLAYLIST_OBJECT", playlist);
                try {
                    mainActivity2.T.m(R.id.action_homeFragment_to_playlistPageFragment, bundle3, null);
                    s14Var2 = j15.a;
                    break;
                } catch (Throwable th8) {
                    s14Var2 = new s14(th8);
                }
                Throwable thA = bb3.a(s14Var2);
                if (thA != null) {
                    Log.w("HomeMixCards", "open the mix", thA);
                    return;
                }
                return;
            case 6:
                String str5 = (String) this.o;
                Child child = (Child) this.p;
                String str6 = (String) this.q;
                fx3 fx3Var = (fx3) this.r;
                try {
                    rr1.f(str5, child.getArtist(), child.getTitle(), str6, rs1.f());
                    WeakReference weakReference = b.a;
                    io1.b.post(new kt1(2, str5));
                    return;
                } catch (Exception e3) {
                    Log.w("HubDislikes", "dislike " + str5 + ": " + e3.getMessage());
                    fx3Var.n = true;
                    rs1.j(ih3.c(PlayEvent.Companion, PlayEvent.DISLIKE, str5, rs1.f(), System.currentTimeMillis(), str6, 16304));
                    return;
                }
            case 7:
                vb4 vb4Var = (vb4) this.o;
                jx3 jx3Var = (jx3) this.p;
                jx3 jx3Var2 = (jx3) this.q;
                Preference preference = (Preference) this.r;
                try {
                    s14Var3 = ((HubAuthOptions) rr1.s(null, "/api/auth/options", HubAuthOptions.class)).getGoogleClientId();
                } catch (Throwable th9) {
                    s14Var3 = new s14(th9);
                }
                if (s14Var3 instanceof s14) {
                    s14Var3 = null;
                }
                String str7 = (String) s14Var3;
                if (str7 != null && !qm4.u0(str7)) {
                    try {
                        s14Var4 = rr1.h();
                    } catch (Throwable th10) {
                        s14Var4 = new s14(th10);
                    }
                    hubMe = (HubMe) (s14Var4 instanceof s14 ? null : s14Var4);
                    break;
                } else {
                    hubMe = null;
                }
                io1.b.post(new up(vb4Var, hubMe, jx3Var, str7, jx3Var2, preference));
                return;
            case 8:
                ArrayList arrayList3 = (ArrayList) this.o;
                HubShareActivity hubShareActivity = (HubShareActivity) this.p;
                ArrayList arrayList4 = (ArrayList) this.q;
                String str8 = (String) this.r;
                ux3 ux3Var = HubShareActivity.P;
                try {
                    rr1.h();
                    jx3 jx3Var3 = new jx3();
                    ArrayList arrayList5 = new ArrayList();
                    int i5 = 10;
                    if (arrayList3.isEmpty()) {
                        th = null;
                        string4 = null;
                    } else {
                        l93.o(10, 10);
                        int size2 = arrayList3.size();
                        th = null;
                        ArrayList arrayList6 = new ArrayList((size2 / 10) + (size2 % 10 == 0 ? 0 : 1));
                        int i6 = 0;
                        while (i6 >= 0 && i6 < size2) {
                            int i7 = size2 - i6;
                            if (i5 <= i7) {
                                i7 = i5;
                            }
                            ArrayList arrayList7 = new ArrayList(i7);
                            while (i2 < i7) {
                                arrayList7.add(arrayList3.get(i2 + i6));
                                i2++;
                            }
                            arrayList6.add(arrayList7);
                            i6 += 10;
                            i2 = 0;
                            i5 = 10;
                        }
                        int size3 = arrayList6.size();
                        HubAssistantTask hubAssistantTaskA = null;
                        int i8 = 0;
                        while (i8 < size3) {
                            Object obj = arrayList6.get(i8);
                            i8++;
                            List list = (List) obj;
                            String quantityString = hubShareActivity.getResources().getQuantityString(R.plurals.homemusic_share_sending_images, list.size(), Integer.valueOf(list.size()));
                            quantityString.getClass();
                            io1.b.post(new ws1(hubShareActivity, quantityString, 2));
                            ContentResolver contentResolver = hubShareActivity.getContentResolver();
                            contentResolver.getClass();
                            hubAssistantTaskA = rr1.a(contentResolver, list);
                        }
                        hubAssistantTaskA.getClass();
                        jx3Var3.n = "/assistant/" + hubAssistantTaskA.getId();
                        string4 = hubShareActivity.getString(R.string.homemusic_share_images_sent);
                    }
                    if (!arrayList4.isEmpty()) {
                        int size4 = arrayList4.size();
                        int i9 = 0;
                        int i10 = 0;
                        int i11 = 0;
                        while (i11 < size4) {
                            Object obj2 = arrayList4.get(i11);
                            i11++;
                            int i12 = i9 + 1;
                            if (i9 < 0) {
                                gb.c0();
                                throw th;
                            }
                            Uri uri2 = (Uri) obj2;
                            String string7 = hubShareActivity.getString(R.string.homemusic_share_uploading, Integer.valueOf(i12), Integer.valueOf(arrayList4.size()));
                            string7.getClass();
                            ArrayList arrayList8 = arrayList3;
                            String str9 = string4;
                            io1.b.post(new ws1(hubShareActivity, string7, 2));
                            try {
                                ContentResolver contentResolver2 = hubShareActivity.getContentResolver();
                                contentResolver2.getClass();
                                rr1.y(contentResolver2, uri2);
                                i10++;
                            } catch (IOException e4) {
                                Log.w("HubShareActivity", "Upload failed for " + uri2, e4);
                                String message = e4.getMessage();
                                if (message == null) {
                                    message = e4.getClass().getSimpleName();
                                }
                                arrayList5.add(message);
                            }
                            i9 = i12;
                            arrayList3 = arrayList8;
                            string4 = str9;
                        }
                        arrayList = arrayList3;
                        str = string4;
                        if (i10 > 0) {
                            jx3Var3.n = "/upload";
                            string5 = !arrayList.isEmpty() ? hubShareActivity.getString(R.string.homemusic_share_images_sent) : hubShareActivity.getString(R.string.homemusic_share_audio_sent, Integer.valueOf(i10));
                        } else if (jx3Var3.n == null) {
                            String string8 = (String) q40.x0(arrayList5);
                            if (string8 == null) {
                                string8 = hubShareActivity.getString(R.string.homemusic_share_failed);
                                string8.getClass();
                            }
                            throw new HubException(string8);
                        }
                        if (arrayList.isEmpty() && arrayList4.isEmpty()) {
                            String string9 = hubShareActivity.getString(R.string.homemusic_share_sending_link);
                            string9.getClass();
                            io1.b.post(new ws1(hubShareActivity, string9, 2));
                            ux3 ux3Var2 = HubShareActivity.P;
                            ux3Var2.getClass();
                            matcher = ux3Var2.n.matcher(str8);
                            matcher.getClass();
                            if (matcher.find(0)) {
                                jv3Var = new jv3(matcher, str8);
                            } else {
                                jv3Var2 = th;
                            }
                            if (jv3Var2 != 0) {
                                jv3Var2 = jv3Var;
                                strGroup = ((Matcher) jv3Var2.n).group();
                                strGroup.getClass();
                            } else {
                                jv3Var2 = jv3Var;
                                str2 = th;
                            }
                            if (str2 != 0 || str8.length() - str2.length() > 1) {
                                str2 = strGroup;
                                str2 = strGroup;
                                hubAssistantTaskB = rr1.b(str8, str2, false);
                            } else {
                                str2 = strGroup;
                                hubAssistantTaskB = rr1.b(str8, str2, true);
                            }
                            jx3Var3.n = "/assistant/" + hubAssistantTaskB.getId();
                        }
                        if (string5 != null) {
                            collectionO = gb.O(string5);
                        } else {
                            collectionO = u01.n;
                        }
                        arrayList2 = new ArrayList(r40.k0(arrayList5, 10));
                        size = arrayList5.size();
                        i = 0;
                        while (i < size) {
                            Object obj3 = arrayList5.get(i);
                            i++;
                            String string10 = hubShareActivity.getString(R.string.homemusic_share_partial_error, (String) obj3);
                            string10.getClass();
                            arrayList2.add(string10);
                        }
                        io1.b.post(new v6(hubShareActivity, jx3Var3, q40.B0(q40.G0(collectionO, arrayList2), "\n", null, null, null, 62), 16));
                        return;
                    }
                    arrayList = arrayList3;
                    str = string4;
                    string5 = str;
                    if (arrayList.isEmpty()) {
                        String string11 = hubShareActivity.getString(R.string.homemusic_share_sending_link);
                        string11.getClass();
                        io1.b.post(new ws1(hubShareActivity, string11, 2));
                        ux3 ux3Var3 = HubShareActivity.P;
                        ux3Var3.getClass();
                        matcher = ux3Var3.n.matcher(str8);
                        matcher.getClass();
                        if (matcher.find(0)) {
                            jv3Var2 = th;
                        } else {
                            jv3Var = new jv3(matcher, str8);
                        }
                        if (jv3Var2 != 0) {
                            jv3Var2 = jv3Var;
                            strGroup = ((Matcher) jv3Var2.n).group();
                            strGroup.getClass();
                        } else {
                            jv3Var2 = jv3Var;
                            str2 = th;
                        }
                        if (str2 != 0) {
                            str2 = strGroup;
                            str2 = strGroup;
                            hubAssistantTaskB = rr1.b(str8, str2, false);
                        } else {
                            str2 = strGroup;
                            str2 = strGroup;
                            hubAssistantTaskB = rr1.b(str8, str2, false);
                        }
                        jx3Var3.n = "/assistant/" + hubAssistantTaskB.getId();
                    }
                    if (string5 != null) {
                        collectionO = gb.O(string5);
                    } else {
                        collectionO = u01.n;
                    }
                    arrayList2 = new ArrayList(r40.k0(arrayList5, 10));
                    size = arrayList5.size();
                    i = 0;
                    while (i < size) {
                        Object obj4 = arrayList5.get(i);
                        i++;
                        String string12 = hubShareActivity.getString(R.string.homemusic_share_partial_error, (String) obj4);
                        string12.getClass();
                        arrayList2.add(string12);
                    }
                    io1.b.post(new v6(hubShareActivity, jx3Var3, q40.B0(q40.G0(collectionO, arrayList2), "\n", null, null, null, 62), 16));
                    return;
                } catch (Exception e5) {
                    Log.w("HubShareActivity", "Share failed", e5);
                    io1.b.post(new ws1(1, hubShareActivity, e5));
                    return;
                }
            case 9:
                Object obj5 = this.o;
                SmartSession smartSession = (SmartSession) this.p;
                String str10 = (String) this.r;
                Context context2 = (Context) this.q;
                if (!(obj5 instanceof s14)) {
                    smartSession.accept(str10);
                    com.eddyizm.tempus.homemusic.a.c();
                    String status = ((SmartAddOut) obj5).getStatus();
                    Toast.makeText(context2, h12.c(status, "downloading") ? R.string.homemusic_smart_downloading : h12.c(status, SmartContexts.LIKED) ? R.string.homemusic_smart_liked : R.string.homemusic_smart_added, 0).show();
                }
                Throwable thA2 = bb3.a(obj5);
                if (thA2 != null) {
                    Log.w("HubSmart", "add", thA2);
                    HubException hubException = thA2 instanceof HubException ? (HubException) thA2 : null;
                    if (hubException == null || (string6 = hubException.getMessage()) == null) {
                        string6 = context2.getString(R.string.homemusic_smart_failed);
                        string6.getClass();
                    }
                    Toast.makeText(context2, string6, 1).show();
                    return;
                }
                return;
            case 10:
                Map<String, ? extends Object> map = (Map) this.o;
                String str11 = (String) this.p;
                MainActivity mainActivity3 = (MainActivity) this.q;
                Runnable runnable = (Runnable) this.r;
                try {
                    rr1 rr1Var = rr1.a;
                    boolean zContains = rr1.e().contains("wave_origin_v1");
                    s14Var5 = rr1.A(WaveSession.Companion.startBody(map, null, zContains ? str11 : null, null, zContains ? rs1.f() : null));
                    break;
                } catch (Throwable th11) {
                    s14Var5 = new s14(th11);
                }
                io1.b.post(new v6(mainActivity3, s14Var5, runnable, 22));
                return;
            case 11:
                fx3 fx3Var2 = (fx3) this.o;
                nc1 nc1Var = (nc1) this.p;
                NsdServiceInfo nsdServiceInfo = (NsdServiceInfo) this.q;
                f9 f9Var = (f9) this.r;
                if (fx3Var2.n || nc1Var.isFinishing() || nc1Var.isDestroyed()) {
                    return;
                }
                u52.b(nc1Var, nsdServiceInfo, null);
                f9Var.dismiss();
                return;
            case 12:
                fx3 fx3Var3 = (fx3) this.o;
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.p;
                NsdServiceInfo nsdServiceInfo2 = (NsdServiceInfo) this.q;
                ArrayAdapter arrayAdapter = (ArrayAdapter) this.r;
                if (fx3Var3.n) {
                    return;
                }
                linkedHashMap.remove(nsdServiceInfo2.getServiceName());
                arrayAdapter.clear();
                arrayAdapter.addAll(linkedHashMap.keySet());
                return;
            case 13:
                AtomicInteger atomicInteger = (AtomicInteger) this.o;
                yw1 yw1Var = (yw1) this.p;
                ArrayList arrayList9 = (ArrayList) this.q;
                lb4 lb4Var = (lb4) this.r;
                if (atomicInteger.incrementAndGet() == yw1Var.size()) {
                    ArrayList arrayList10 = new ArrayList();
                    while (i2 < arrayList9.size()) {
                        ic2 ic2Var = (ic2) arrayList9.get(i2);
                        if (ic2Var != null) {
                            try {
                                bitmap = (Bitmap) hw.j(ic2Var);
                            } catch (CancellationException | ExecutionException e6) {
                                l93.B("MLSLegacyStub", "Failed to get bitmap", e6);
                                bitmap = null;
                            }
                        } else {
                            bitmap = null;
                        }
                        arrayList10.add(f92.a((gn2) yw1Var.get(i2), bitmap));
                        i2++;
                    }
                    lb4Var.l(arrayList10);
                    return;
                }
                return;
            case 14:
                pn2 pn2Var = (pn2) this.o;
                fr2 fr2Var = (fr2) this.p;
                Bundle bundle4 = (Bundle) this.q;
                String str12 = (String) this.r;
                tn2 tn2Var = pn2Var.z;
                if (pn2Var.x.I(fr2Var, 50001)) {
                    tn2Var.y(fr2Var, str12, f92.h(tn2Var.f, bundle4));
                    return;
                }
                return;
            case 15:
                pn2 pn2Var2 = (pn2) this.o;
                fr2 fr2Var2 = (fr2) this.p;
                nj2 nj2Var = (nj2) this.q;
                Bundle bundle5 = (Bundle) this.r;
                if (!pn2Var2.x.I(fr2Var2, 50005)) {
                    nj2Var.f(null);
                    return;
                }
                er2 er2Var = fr2Var2.d;
                er2Var.getClass();
                on2 on2Var = (on2) er2Var;
                synchronized (on2Var.n) {
                    on2Var.p.add(new tv1());
                    break;
                }
                f92.h(pn2Var2.z.f, bundle5);
                pn2Var2.z.w(fr2Var2);
                return;
            case WaveRetry.MAX_FAILURES /* 16 */:
                tn2 tn2Var2 = (tn2) this.o;
                lb4 lb4Var2 = (lb4) this.p;
                fr2 fr2Var3 = (fr2) this.q;
                String str13 = (String) this.r;
                m92 m92Var = (m92) tn2.E(lb4Var2);
                if (m92Var == null || m92Var.a != 0) {
                    er2 er2Var2 = fr2Var3.d;
                    er2Var2.getClass();
                    tn2Var2.E.remove(str13, fr2Var3);
                    tn2Var2.F.remove(er2Var2, str13);
                    return;
                }
                return;
            case 17:
                a();
                return;
            case 18:
                b();
                return;
            case 19:
                c();
                return;
            case 20:
                d();
                return;
            case 21:
                e();
                return;
            case 22:
                f();
                return;
            case 23:
                g();
                return;
            case 24:
                h();
                return;
            case 25:
                i();
                return;
            case 26:
                j();
                return;
            case 27:
                k();
                return;
            case 28:
                l();
                return;
            default:
                SearchFragment searchFragment = (SearchFragment) this.o;
                PlaylistWithSongs playlistWithSongs2 = (PlaylistWithSongs) this.p;
                ArrayList arrayList11 = (ArrayList) this.q;
                ArrayList arrayList12 = (ArrayList) this.r;
                if (searchFragment.T == null || !searchFragment.y()) {
                    return;
                }
                playlistWithSongs2.setName(searchFragment.T.getContext().getString(R.string.search_all_songs, String.valueOf(arrayList11.size())));
                boolean zIsEmpty = arrayList12.isEmpty();
                ej ejVar = searchFragment.s0;
                if (zIsEmpty) {
                    ejVar.p(Collections.EMPTY_LIST);
                    return;
                }
                ejVar.p(arrayList12);
                View view = searchFragment.T;
                if (view == null || (ae1Var = searchFragment.l0) == null) {
                    return;
                }
                ae1Var.a.setText(view.getContext().getString(R.string.search_all_songs_play, String.valueOf(((Playlist) arrayList12.get(0)).getName())));
                return;
        }
    }

    public /* synthetic */ t6(pn2 pn2Var, AtomicInteger atomicInteger, yw1 yw1Var, ArrayList arrayList, lb4 lb4Var) {
        this.n = 13;
        this.o = atomicInteger;
        this.p = yw1Var;
        this.q = arrayList;
        this.r = lb4Var;
    }

    public /* synthetic */ t6(lo2 lo2Var, kn2 kn2Var, String str, Bundle bundle, sk2 sk2Var) {
        this.n = 17;
        this.o = lo2Var;
        this.p = str;
        this.q = bundle;
        this.r = sk2Var;
    }

    public /* synthetic */ t6(Object obj, SmartSession smartSession, String str, Context context) {
        this.n = 9;
        this.o = obj;
        this.p = smartSession;
        this.r = str;
        this.q = context;
    }

    public /* synthetic */ t6(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.n = i;
        this.o = obj;
        this.p = obj2;
        this.q = obj3;
        this.r = obj4;
    }
}
