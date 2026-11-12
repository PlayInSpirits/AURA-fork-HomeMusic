package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Trace;
import android.view.View;
import android.widget.Toast;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.ui.DefaultTimeBar;
import androidx.recyclerview.widget.RecyclerView;
import app.homemusic.R;
import com.eddyizm.tempus.homemusic.WaveRetry;
import com.eddyizm.tempus.model.Download;
import com.eddyizm.tempus.ui.fragment.AlbumPageFragment;
import com.eddyizm.tempus.ui.fragment.ArtistPageFragment;
import com.eddyizm.tempus.ui.fragment.DirectoryFragment;
import com.eddyizm.tempus.ui.fragment.bottomsheetdialog.AlbumBottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.skydoves.colorpickerview.ColorPickerView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a0 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ a0(q41 q41Var, int i) {
        this.n = 28;
        this.o = q41Var;
    }

    /* JADX WARN: Code duplicated, block: B:168:0x033e  */
    /* JADX WARN: Code duplicated, block: B:171:0x0347 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:172:0x0349 A[Catch: all -> 0x0378, LOOP:2: B:159:0x02f1->B:172:0x0349, LOOP_END, TryCatch #9 {all -> 0x0378, blocks: (B:156:0x02e3, B:159:0x02f1, B:161:0x0301, B:163:0x030b, B:165:0x0314, B:167:0x0323, B:169:0x0340, B:172:0x0349, B:173:0x034d, B:175:0x035f, B:179:0x0374, B:180:0x0377, B:174:0x0352), top: B:267:0x02e3, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:290:0x034d A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        ?? r4;
        ?? r3;
        af4 af4Var;
        int i = this.n;
        int i2 = 2;
        int i3 = 3;
        boolean z = true;
        int i4 = 0;
        Object obj2 = this.o;
        switch (i) {
            case 0:
                ((b0) obj2).b();
                return;
            case 1:
                Activity activity = (Activity) obj2;
                if (activity.isFinishing()) {
                    return;
                }
                Handler handler = n5.g;
                Method method = n5.f;
                Application application = Build.VERSION.SDK_INT;
                if (application >= 28) {
                    activity.recreate();
                    return;
                }
                m5 m5Var = 27;
                if (((application != 26 && application != 27) || method != null) && (n5.e != null || n5.d != null)) {
                    try {
                        Object obj3 = n5.c.get(activity);
                        if (obj3 != null && (obj = n5.b.get(activity)) != null) {
                            application = activity.getApplication();
                            m5Var = new m5(activity);
                            application.registerActivityLifecycleCallbacks(m5Var);
                            handler.post(new lg1(i2, m5Var, obj3));
                            if (application != 26 && application != 27) {
                                z = false;
                            }
                            try {
                                if (z) {
                                    try {
                                        Boolean bool = Boolean.FALSE;
                                        method.invoke(obj, obj3, null, null, 0, bool, null, null, bool, bool);
                                    } catch (Throwable th) {
                                        th = th;
                                        r3 = application;
                                        r4 = m5Var;
                                        handler.post(new lg1(i3, (Object) r3, (Object) r4));
                                        throw th;
                                    }
                                } else {
                                    activity.recreate();
                                }
                                handler.post(new lg1(i3, application, m5Var));
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                                r3 = application;
                                r4 = m5Var;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
            case 2:
                ((AlbumBottomSheetDialog) obj2).o0();
                return;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                AlbumPageFragment albumPageFragment = (AlbumPageFragment) obj2;
                if (albumPageFragment.l0 == null) {
                    return;
                }
                int dimension = (int) albumPageFragment.r().getDimension(R.dimen.bottom_sheet_behavior_peek_height);
                View decorView = albumPageFragment.X().getWindow().getDecorView();
                WeakHashMap weakHashMap = j65.a;
                pb5 pb5VarA = b65.a(decorView);
                int i5 = pb5VarA == null ? 0 : pb5VarA.a.h(519).d;
                RecyclerView recyclerView = (RecyclerView) albumPageFragment.l0.q;
                recyclerView.setPadding(recyclerView.getPaddingLeft(), ((RecyclerView) albumPageFragment.l0.q).getPaddingTop(), ((RecyclerView) albumPageFragment.l0.q).getPaddingRight(), i5 + dimension);
                return;
            case 4:
                ya yaVar = (ya) obj2;
                Trace.beginSection("Compose:semantics:measureAndLayout");
                try {
                    yaVar.q.q(true);
                    Trace.endSection();
                    Trace.beginSection("Compose:semantics:checkForSemanticsChanges");
                    try {
                        yaVar.n();
                        Trace.endSection();
                        yaVar.V = false;
                        return;
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                } catch (Throwable th4) {
                    Trace.endSection();
                    throw th4;
                }
            case 5:
                lb lbVar = (lb) obj2;
                boolean zE = lbVar.e();
                ra raVar = lbVar.n;
                if (zE) {
                    Trace.beginSection("ContentCapture:changeChecker");
                    try {
                        raVar.q(true);
                        i03 i03Var = lbVar.x;
                        int[] iArr = i03Var.b;
                        long[] jArr = i03Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i6 = 0;
                            while (true) {
                                long j = jArr[i6];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                                    for (int i8 = i4; i8 < i7; i8++) {
                                        if ((255 & j) < 128) {
                                            int i9 = iArr[(i6 << 3) + i8];
                                            if (!lbVar.d().a(i9)) {
                                                lbVar.q.add(new yc0(i9, lbVar.w, zc0.o, null));
                                                lbVar.u.d(j15.a);
                                            }
                                        }
                                        j >>= 8;
                                    }
                                    if (i7 == 8) {
                                        if (i6 != length) {
                                            i6++;
                                            i4 = 0;
                                        }
                                    }
                                } else if (i6 != length) {
                                    i6++;
                                    i4 = 0;
                                }
                            }
                        }
                        Trace.beginSection("ContentCapture:sendAppearEvents");
                        try {
                            lbVar.g(raVar.getSemanticsOwner().a(), lbVar.y);
                            Trace.endSection();
                            lbVar.c(lbVar.d());
                            lbVar.l();
                            lbVar.z = false;
                            return;
                        } finally {
                            Trace.endSection();
                        }
                    } catch (Throwable th5) {
                        Trace.endSection();
                        throw th5;
                    }
                }
                return;
            case 6:
                ArtistPageFragment artistPageFragment = (ArtistPageFragment) obj2;
                artistPageFragment.l0.k.setVisibility(0);
                artistPageFragment.l0.p.setVisibility(8);
                artistPageFragment.l0.s.setVisibility(8);
                artistPageFragment.l0.r.setVisibility(8);
                artistPageFragment.l0.q.setVisibility(0);
                artistPageFragment.l0.t.setVisibility(8);
                return;
            case 7:
                cl clVar = (cl) obj2;
                synchronized (clVar.a) {
                    try {
                        if (clVar.m) {
                            return;
                        }
                        long j2 = clVar.l - 1;
                        clVar.l = j2;
                        if (j2 > 0) {
                            return;
                        }
                        if (j2 >= 0) {
                            clVar.a();
                            return;
                        }
                        IllegalStateException illegalStateException = new IllegalStateException();
                        synchronized (clVar.a) {
                            clVar.n = illegalStateException;
                            break;
                        }
                        return;
                    } catch (Throwable th6) {
                        throw th6;
                    }
                }
            case 8:
                kl klVar = (kl) obj2;
                if (klVar.c.o) {
                    klVar.a.n.w1(3, false);
                    return;
                }
                return;
            case 9:
                ((tc2) obj2).f(-1, new kf2(6));
                return;
            case 10:
                au auVar = (au) obj2;
                auVar.g = null;
                ((BottomSheetBehavior) auVar.b).J(4);
                return;
            case 11:
                ((s30) obj2).s(true);
                return;
            case 12:
                ColorPickerView colorPickerView = (ColorPickerView) obj2;
                int i10 = ColorPickerView.H;
                colorPickerView.a(colorPickerView.getColor());
                colorPickerView.f(colorPickerView.p);
                return;
            case 13:
                i70 i70Var = (i70) obj2;
                Runnable runnable = i70Var.o;
                if (runnable != null) {
                    runnable.run();
                    i70Var.o = null;
                    return;
                }
                return;
            case 14:
                n70.a((n70) obj2);
                return;
            case 15:
                CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$0((CredentialProviderCreatePublicKeyCredentialController) obj2);
                return;
            case WaveRetry.MAX_FAILURES /* 16 */:
                nj0 nj0Var = (nj0) obj2;
                nj0Var.b0(nj0Var.W(), 1028, new jj0(i2));
                nj0Var.s.d();
                return;
            case 17:
                tj0 tj0Var = (tj0) obj2;
                if (tj0Var.a0 >= 300000) {
                    tj0Var.n.n();
                    tj0Var.a0 = 0L;
                    return;
                }
                return;
            case 18:
                jk0 jk0Var = (jk0) obj2;
                if (jk0Var.p) {
                    return;
                }
                pw0 pw0Var = jk0Var.o;
                if (pw0Var != null) {
                    pw0Var.d(jk0Var.n);
                }
                jk0Var.q.n.remove(jk0Var);
                jk0Var.p = true;
                return;
            case 19:
                ((ik0) obj2).d(null);
                return;
            case 20:
                int i11 = DefaultTimeBar.f0;
                ((DefaultTimeBar) obj2).d(false);
                return;
            case 21:
                ((tn0) obj2).h.d();
                return;
            case 22:
                DirectoryFragment directoryFragment = (DirectoryFragment) obj2;
                Toast.makeText(directoryFragment.Z(), directoryFragment.s(R.string.folder_play_no_songs), 0).show();
                return;
            case 23:
                ((zd0) obj2).d();
                return;
            case 24:
                ((la0) obj2).d();
                return;
            case 25:
                bu0 bu0Var = (bu0) obj2;
                bu0Var.getClass();
                if (ud3.o() == null) {
                    bu0Var.f.i(-1);
                    return;
                }
                lg1 lg1Var = new lg1(10, (ss0) bu0Var.c.o);
                Thread thread = new Thread(lg1Var);
                thread.start();
                try {
                    thread.join();
                    break;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                List<Download> list = (List) lg1Var.p;
                if (list == null || list.isEmpty()) {
                    bu0Var.f.i(0);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (Download download : list) {
                    String downloadUri = download.getDownloadUri();
                    if (downloadUri != null && !downloadUri.isEmpty()) {
                        Uri uri = Uri.parse(downloadUri);
                        if (uri.getScheme() != null && uri.getScheme().equalsIgnoreCase("content")) {
                            try {
                                Application application2 = bu0Var.b;
                                application2.getClass();
                                af4Var = new af4();
                                af4Var.b = application2;
                                af4Var.c = uri;
                            } catch (SecurityException unused2) {
                                af4Var = null;
                            }
                            if (af4Var == null || !af4Var.b()) {
                                arrayList.add(download);
                            }
                            break;
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    bu0Var.f.i(0);
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                while (i4 < size) {
                    Object obj4 = arrayList.get(i4);
                    i4++;
                    Download download2 = (Download) obj4;
                    arrayList2.add(download2.getId());
                    ConcurrentHashMap concurrentHashMap = g51.a;
                    synchronized (g51.class) {
                        String strA = g51.a(download2.getArtist(), download2.getTitle(), download2.getAlbum());
                        g51.a.remove(strA);
                        j51.K(strA);
                        break;
                    }
                }
                new Thread(new lg1(9, (ss0) bu0Var.c.o, arrayList2)).start();
                g51.i();
                bu0Var.f.i(Integer.valueOf(arrayList2.size()));
                return;
            case 26:
                ix0 ix0Var = (ix0) obj2;
                boolean zIsPopupShowing = ix0Var.h.isPopupShowing();
                ix0Var.s(zIsPopupShowing);
                ix0Var.m = zIsPopupShowing;
                return;
            case 27:
                i41 i41Var = (i41) obj2;
                c6 c6Var = i41Var.D;
                Context context = i41Var.f;
                String str = f35.a;
                int iGenerateAudioSessionId = xl.n(context).generateAudioSessionId();
                if (iGenerateAudioSessionId == -1) {
                    iGenerateAudioSessionId = 0;
                }
                Integer numValueOf = Integer.valueOf(iGenerateAudioSessionId);
                c6Var.f = numValueOf;
                wo woVar = new wo(c6Var, numValueOf, i4);
                yp4 yp4Var = (yp4) c6Var.c;
                if (yp4Var.a.getLooper().getThread().isAlive()) {
                    yp4Var.d(woVar);
                    return;
                }
                return;
            case 28:
                nj0 nj0Var2 = ((q41) obj2).K;
                nj0Var2.b0(nj0Var2.W(), 1034, new oi0(15));
                return;
            default:
                sk3 sk3Var = (sk3) obj2;
                try {
                    synchronized (sk3Var) {
                    }
                    try {
                        sk3Var.a.c(sk3Var.c, sk3Var.d);
                        return;
                    } finally {
                        sk3Var.a(true);
                    }
                } catch (ExoPlaybackException e2) {
                    l93.G("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e2);
                    er1.m(e2);
                    return;
                }
        }
    }

    public /* synthetic */ a0(int i, Object obj) {
        this.n = i;
        this.o = obj;
    }

    public /* synthetic */ a0(q41 q41Var, sk3 sk3Var) {
        this.n = 29;
        this.o = sk3Var;
    }
}
