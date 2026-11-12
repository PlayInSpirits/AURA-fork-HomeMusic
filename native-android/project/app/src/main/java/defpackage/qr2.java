package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowInsetsAnimation;
import android.view.autofill.AutofillManager;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import com.eddyizm.tempus.service.MediaService;
import com.eddyizm.tempus.subsonic.base.ApiResponse;
import com.eddyizm.tempus.subsonic.models.IndexID3;
import java.io.File;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qr2 implements Callback, w04, ce3, cp3 {
    public static final om0 q = new om0(14);
    public final /* synthetic */ int n;
    public final Object o;
    public Object p;

    public qr2(MediaService mediaService, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        this.n = 0;
        ComponentName componentName2 = null;
        if (TextUtils.isEmpty(str)) {
            kf2.n("tag must not be null or empty");
            throw null;
        }
        if (componentName == null) {
            int i = fu2.b;
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setPackage(mediaService.getPackageName());
            List<ResolveInfo> listQueryBroadcastReceivers = mediaService.getPackageManager().queryBroadcastReceivers(intent, 0);
            if (listQueryBroadcastReceivers.size() == 1) {
                ActivityInfo activityInfo = listQueryBroadcastReceivers.get(0).activityInfo;
                componentName2 = new ComponentName(activityInfo.packageName, activityInfo.name);
            } else if (listQueryBroadcastReceivers.size() > 1) {
                l93.q0("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
            }
            componentName = componentName2;
            if (componentName == null) {
                l93.K("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
            }
        }
        if (componentName != null && pendingIntent == null) {
            Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
            intent2.setComponent(componentName);
            pendingIntent = PendingIntent.getBroadcast(mediaService, 0, intent2, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            this.o = new mr2(mediaService, str, bundle);
        } else if (i2 >= 28) {
            this.o = new lr2(mediaService, str, bundle);
        } else {
            this.o = new kr2(mediaService, str, bundle);
        }
        Looper looperMyLooper = Looper.myLooper();
        u(new hr2(), new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper));
        ((kr2) this.o).a.setMediaButtonReceiver(pendingIntent);
        this.p = new wo0((Context) mediaService, ((kr2) this.o).c);
    }

    public static void b(qr2 qr2Var, h40 h40Var) {
        qr2Var.getClass();
        for (Map.Entry entry : new HashMap((HashMap) qr2Var.o).entrySet()) {
            if (entry.getKey() != null) {
                kf2.k();
                return;
            } else {
                List list = (List) entry.getValue();
                if (!f(h40Var, list).equals(f((h40) qr2Var.p, list))) {
                    throw null;
                }
            }
        }
        qr2Var.p = h40Var;
    }

    public static h40 f(h40 h40Var, List list) {
        h40Var.getClass();
        Map map = h40Var.a;
        HashMap map2 = new HashMap(map);
        HashSet hashSet = new HashSet(list);
        for (String str : map.keySet()) {
            if (!hashSet.contains(str)) {
                map2.remove(str);
            }
        }
        return new h40(map2);
    }

    @Override // defpackage.ce3
    public dn1 a(Uri uri, gi0 gi0Var) {
        dn1 dn1VarA = ((ce3) this.o).a(uri, gi0Var);
        List list = (List) this.p;
        return (list == null || list.isEmpty()) ? dn1VarA : (dn1) dn1VarA.a(list);
    }

    public void c(Object obj, String str) {
        ((ArrayList) this.o).add(b11.o(str, "=", String.valueOf(obj)));
    }

    public boolean d() {
        synchronized (this) {
            if (((AtomicBoolean) this.p).get()) {
                return false;
            }
            ((AtomicInteger) this.o).incrementAndGet();
            return true;
        }
    }

    public boolean e(rc5 rc5Var) {
        boolean zContainsKey;
        synchronized (this.p) {
            zContainsKey = ((nh0) this.o).a.containsKey(rc5Var);
        }
        return zContainsKey;
    }

    public void g(String str, PrintWriter printWriter) {
        nd2 nd2Var = (nd2) this.p;
        if (nd2Var.b.e() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String strConcat = str.concat("    ");
            for (int i = 0; i < nd2Var.b.e(); i++) {
                ld2 ld2Var = (ld2) nd2Var.b.f(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(nd2Var.b.c(i));
                printWriter.print(": ");
                printWriter.println(ld2Var.toString());
                printWriter.print(strConcat);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mArgs=");
                printWriter.println((Object) null);
                printWriter.print(strConcat);
                printWriter.print("mLoader=");
                printWriter.println(ld2Var.l);
                og5 og5Var = ld2Var.l;
                String strConcat2 = strConcat.concat("  ");
                og5Var.getClass();
                printWriter.print(strConcat2);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mListener=");
                printWriter.println(og5Var.a);
                if (og5Var.b || og5Var.e) {
                    printWriter.print(strConcat2);
                    printWriter.print("mStarted=");
                    printWriter.print(og5Var.b);
                    printWriter.print(" mContentChanged=");
                    printWriter.print(og5Var.e);
                    printWriter.print(" mProcessingChange=");
                    printWriter.println(false);
                }
                if (og5Var.c || og5Var.d) {
                    printWriter.print(strConcat2);
                    printWriter.print("mAbandoned=");
                    printWriter.print(og5Var.c);
                    printWriter.print(" mReset=");
                    printWriter.println(og5Var.d);
                }
                if (og5Var.g != null) {
                    printWriter.print(strConcat2);
                    printWriter.print("mTask=");
                    printWriter.print(og5Var.g);
                    printWriter.print(" waiting=");
                    og5Var.g.getClass();
                    printWriter.println(false);
                }
                if (og5Var.h != null) {
                    printWriter.print(strConcat2);
                    printWriter.print("mCancellingTask=");
                    printWriter.print(og5Var.h);
                    printWriter.print(" waiting=");
                    og5Var.h.getClass();
                    printWriter.println(false);
                }
                if (ld2Var.n != null) {
                    printWriter.print(strConcat);
                    printWriter.print("mCallbacks=");
                    printWriter.println(ld2Var.n);
                    md2 md2Var = ld2Var.n;
                    String strConcat3 = strConcat.concat("  ");
                    md2Var.getClass();
                    printWriter.print(strConcat3);
                    printWriter.print("mDeliveredData=");
                    printWriter.println(md2Var.b);
                }
                printWriter.print(strConcat);
                printWriter.print("mData=");
                og5 og5Var2 = ld2Var.l;
                Object objD = ld2Var.d();
                og5Var2.getClass();
                StringBuilder sb = new StringBuilder(64);
                gh0.c(objD, sb);
                sb.append("}");
                printWriter.println(sb.toString());
                printWriter.print(strConcat);
                printWriter.print("mStarted=");
                printWriter.println(ld2Var.c > 0);
            }
        }
    }

    public View h(int i, int i2, int i3, int i4) {
        vu vuVar = (vu) this.p;
        u55 u55Var = (u55) this.o;
        int iD = u55Var.d();
        int iK = u55Var.k();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View viewQ = u55Var.q(i);
            int iA = u55Var.a(viewQ);
            int iR = u55Var.r(viewQ);
            vuVar.b = iD;
            vuVar.c = iK;
            vuVar.d = iA;
            vuVar.e = iR;
            if (i3 != 0) {
                vuVar.a = i3;
                if (vuVar.a()) {
                    return viewQ;
                }
            }
            if (i4 != 0) {
                vuVar.a = i4;
                if (vuVar.a()) {
                    view = viewQ;
                }
            }
            i += i5;
        }
        return view;
    }

    @Override // defpackage.c11
    public boolean i(Object obj, File file, db3 db3Var) {
        return ((ss) this.p).i(new at((zs) this.o, ((BitmapDrawable) ((q04) obj).get()).getBitmap()), file, db3Var);
    }

    @Override // defpackage.cp3
    public void j(Preference preference) {
        ((PreferenceGroup) this.o).h0 = Integer.MAX_VALUE;
        np3 np3Var = (np3) this.p;
        Handler handler = np3Var.u;
        g5 g5Var = np3Var.v;
        handler.removeCallbacks(g5Var);
        handler.post(g5Var);
    }

    public AutofillManager k() {
        AutofillManager autofillManager = (AutofillManager) this.p;
        if (autofillManager != null) {
            return autofillManager;
        }
        AutofillManager autofillManagerJ = gm0.j(((Context) this.o).getSystemService(gm0.l()));
        if (autofillManagerJ != null) {
            this.p = autofillManagerJ;
            return autofillManagerJ;
        }
        kf2.o("Could not locate AutofillManager from context");
        return null;
    }

    @Override // defpackage.w04
    public int l(db3 db3Var) {
        return 2;
    }

    public String m(f42 f42Var) {
        String str;
        synchronized (((sj0) this.o)) {
            str = (String) ((sj0) this.o).a(f42Var);
        }
        if (str == null) {
            j44 j44Var = (j44) ((i61) this.p).b();
            try {
                f42Var.b(j44Var.n);
                byte[] bArrDigest = j44Var.n.digest();
                char[] cArr = e35.b;
                synchronized (cArr) {
                    for (int i = 0; i < bArrDigest.length; i++) {
                        byte b = bArrDigest[i];
                        int i2 = i * 2;
                        char[] cArr2 = e35.a;
                        cArr[i2] = cArr2[(b & 255) >>> 4];
                        cArr[i2 + 1] = cArr2[b & 15];
                    }
                    str = new String(cArr);
                }
                ((i61) this.p).a(j44Var);
            } catch (Throwable th) {
                ((i61) this.p).a(j44Var);
                throw th;
            }
        }
        synchronized (((sj0) this.o)) {
            ((sj0) this.o).d(f42Var, str);
        }
        return str;
    }

    public synchronized Map n() {
        try {
            if (((Map) this.p) == null) {
                this.p = Collections.unmodifiableMap(new HashMap((HashMap) this.o));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Map) this.p;
    }

    public boolean o(View view) {
        vu vuVar = (vu) this.p;
        u55 u55Var = (u55) this.o;
        int iD = u55Var.d();
        int iK = u55Var.k();
        int iA = u55Var.a(view);
        int iR = u55Var.r(view);
        vuVar.b = iD;
        vuVar.c = iK;
        vuVar.d = iA;
        vuVar.e = iR;
        vuVar.a = 24579;
        return vuVar.a();
    }

    @Override // retrofit2.Callback
    public void onFailure(Call call, Throwable th) {
        int i = this.n;
        Object obj = this.o;
        switch (i) {
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                k03 k03Var = (k03) obj;
                ArrayList arrayList = new ArrayList(kb4.h(null));
                Collections.shuffle(arrayList);
                ((pa) this.p).x(arrayList.subList(0, arrayList.size() / 10 <= 0 ? arrayList.size() : 10), k03Var);
                break;
            case 7:
                th.printStackTrace();
                ((k03) obj).k(kb4.s((String) this.p, null));
                break;
            default:
                ((k03) obj).i(new ArrayList());
                break;
        }
    }

    @Override // retrofit2.Callback
    public void onResponse(Call call, Response response) {
        int i = this.n;
        Object obj = this.o;
        switch (i) {
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                k03 k03Var = (k03) obj;
                if (!response.isSuccessful() || response.body() == null) {
                    onFailure(call, new Exception("HTTP " + response.code()));
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (((ApiResponse) response.body()).getSubsonicResponse().getArtists() != null && ((ApiResponse) response.body()).getSubsonicResponse().getArtists().getIndices() != null) {
                        for (IndexID3 indexID3 : ((ApiResponse) response.body()).getSubsonicResponse().getArtists().getIndices()) {
                            if (indexID3.getArtists() != null) {
                                arrayList.addAll(indexID3.getArtists());
                            }
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(kb4.h(arrayList));
                    Collections.shuffle(arrayList2);
                    ((pa) this.p).x(arrayList2.subList(0, arrayList2.size() / 10 <= 0 ? arrayList2.size() : 10), k03Var);
                }
                break;
            case 7:
                ((k03) obj).k(kb4.s((String) this.p, (!response.isSuccessful() || response.body() == null) ? null : ((ApiResponse) response.body()).getSubsonicResponse().getDirectory()));
                break;
            default:
                ((k03) obj).i(xi4.h((xi4) this.p, response, "similarSongs"));
                break;
        }
    }

    public void p(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT >= 27) {
            k().notifyViewVisibilityChanged(view, i, z);
        }
    }

    public void q(Exception exc, boolean z) {
        this.p = null;
        HashSet hashSet = (HashSet) this.o;
        yw1 yw1VarK = yw1.k(hashSet);
        hashSet.clear();
        vw1 vw1VarListIterator = yw1VarK.listIterator(0);
        while (vw1VarListIterator.hasNext()) {
            ik0 ik0Var = (ik0) vw1VarListIterator.next();
            ik0Var.getClass();
            ik0Var.k(exc, z ? 1 : 3);
        }
    }

    public void r(ik0 ik0Var) {
        ((HashSet) this.o).add(ik0Var);
        if (((ik0) this.p) != null) {
            return;
        }
        this.p = ik0Var;
        l31 l31VarP = ik0Var.b.p();
        ik0Var.z = l31VarP;
        gk0 gk0Var = ik0Var.s;
        String str = f35.a;
        l31VarP.getClass();
        gk0Var.getClass();
        gk0Var.obtainMessage(1, new hk0(ed2.g.getAndIncrement(), true, SystemClock.elapsedRealtime(), l31VarP)).sendToTarget();
    }

    public gl4 s(rc5 rc5Var) {
        gl4 gl4VarB;
        rc5Var.getClass();
        synchronized (this.p) {
            gl4VarB = ((nh0) this.o).b(rc5Var);
        }
        return gl4VarB;
    }

    public List t(String str) {
        List listC;
        str.getClass();
        synchronized (this.p) {
            listC = ((nh0) this.o).c(str);
        }
        return listC;
    }

    public String toString() {
        int i = this.n;
        Object obj = this.o;
        switch (i) {
            case 11:
                StringBuilder sb = new StringBuilder(128);
                sb.append("LoaderManager{");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" in ");
                gh0.c((ba2) obj, sb);
                sb.append("}}");
                return sb.toString();
            case 14:
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append(this.p.getClass().getSimpleName());
                sb2.append('{');
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    sb2.append((String) arrayList.get(i2));
                    if (i2 < size - 1) {
                        sb2.append(", ");
                    }
                }
                sb2.append('}');
                return sb2.toString();
            case 21:
                return "Bounds{lower=" + ((vz1) obj) + " upper=" + ((vz1) this.p) + "}";
            default:
                return super.toString();
        }
    }

    public void u(ir2 ir2Var, Handler handler) {
        kr2 kr2Var = (kr2) this.o;
        synchronized (kr2Var.d) {
            kr2Var.l = ir2Var;
            kr2Var.a.setCallback((y52) ir2Var.c, handler);
            synchronized (ir2Var.b) {
                try {
                    ir2Var.d = new WeakReference(kr2Var);
                    zk zkVar = (zk) ir2Var.e;
                    if (zkVar != null) {
                        zkVar.removeCallbacksAndMessages(null);
                    }
                    ir2Var.e = new zk(ir2Var, handler.getLooper(), 9);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void v(ei3 ei3Var) {
        RemoteCallbackList remoteCallbackList;
        kr2 kr2Var = (kr2) this.o;
        kr2Var.g = ei3Var;
        synchronized (kr2Var.d) {
            int iBeginBroadcast = kr2Var.f.beginBroadcast() - 1;
            while (true) {
                remoteCallbackList = kr2Var.f;
                if (iBeginBroadcast < 0) {
                    break;
                }
                try {
                    ((lu1) remoteCallbackList.getBroadcastItem(iBeginBroadcast)).j(ei3Var);
                } catch (RemoteException | SecurityException e) {
                    l93.G("MediaSessionCompat", "Dead object in setPlaybackState.", e);
                }
                iBeginBroadcast--;
            }
            remoteCallbackList.finishBroadcast();
        }
        MediaSession mediaSession = kr2Var.a;
        if (ei3Var.y == null) {
            PlaybackState.Builder builder = new PlaybackState.Builder();
            builder.setState(ei3Var.n, ei3Var.o, ei3Var.q, ei3Var.u);
            builder.setBufferedPosition(ei3Var.p);
            builder.setActions(ei3Var.r);
            builder.setErrorMessage(ei3Var.t);
            for (di3 di3Var : ei3Var.v) {
                PlaybackState.CustomAction customActionBuild = di3Var.r;
                if (customActionBuild == null) {
                    PlaybackState.CustomAction.Builder builder2 = new PlaybackState.CustomAction.Builder(di3Var.n, di3Var.o, di3Var.p);
                    builder2.setExtras(di3Var.q);
                    customActionBuild = builder2.build();
                }
                if (customActionBuild != null) {
                    builder.addCustomAction(customActionBuild);
                }
            }
            builder.setActiveQueueItemId(ei3Var.w);
            builder.setExtras(ei3Var.x);
            ei3Var.y = builder.build();
        }
        mediaSession.setPlaybackState(ei3Var.y);
    }

    public gl4 w(rc5 rc5Var) {
        gl4 gl4VarD;
        synchronized (this.p) {
            gl4VarD = ((nh0) this.o).d(rc5Var);
        }
        return gl4VarD;
    }

    public void x() {
        synchronized (this) {
            ((AtomicInteger) this.o).decrementAndGet();
            if (((AtomicInteger) this.o).get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }

    public /* synthetic */ qr2(int i, Object obj, Object obj2) {
        this.n = i;
        this.p = obj;
        this.o = obj2;
    }

    public /* synthetic */ qr2(Object obj, Object obj2, boolean z, int i) {
        this.n = i;
        this.o = obj;
        this.p = obj2;
    }

    public /* synthetic */ qr2(Object obj) {
        this.n = 14;
        this.p = obj;
        this.o = new ArrayList();
    }

    public qr2(na naVar) {
        this.n = 5;
        this.o = new AtomicInteger(0);
        this.p = new AtomicBoolean(false);
    }

    public qr2(ba2 ba2Var, e75 e75Var) {
        this.n = 11;
        this.o = ba2Var;
        e75Var.getClass();
        sf0 sf0Var = sf0.b;
        sf0Var.getClass();
        bq4 bq4Var = new bq4(e75Var, nd2.d, sf0Var);
        i30 i30VarA = kx3.a(nd2.class);
        String strB = i30VarA.b();
        if (strB != null) {
            this.p = (nd2) bq4Var.l(i30VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
        } else {
            kf2.n("Local and anonymous classes can not be ViewModels");
            throw null;
        }
    }

    public qr2(gp3 gp3Var) {
        this.n = 1;
        this.o = (ky0) gp3Var.o;
        Integer num = (Integer) gp3Var.p;
        if (num != null) {
            this.p = num;
        }
    }

    public qr2(nh0 nh0Var) {
        this.n = 19;
        this.o = nh0Var;
        this.p = new Object();
    }

    public qr2(u55 u55Var) {
        this.n = 20;
        this.o = u55Var;
        vu vuVar = new vu();
        vuVar.a = 0;
        this.p = vuVar;
    }

    public qr2(WindowInsetsAnimation.Bounds bounds) {
        this.n = 21;
        this.o = vz1.c(bounds.getLowerBound());
        this.p = vz1.c(bounds.getUpperBound());
    }

    public /* synthetic */ qr2(int i, Object obj) {
        this.n = i;
        this.o = obj;
    }

    public qr2(int i) {
        this.n = i;
        switch (i) {
            case 6:
                this.o = new HashSet();
                break;
            case 8:
                this.o = new HashMap();
                this.p = h40.b;
                break;
            case 10:
                this.o = new HashMap();
                break;
            case 13:
                this.o = new AtomicReference();
                this.p = new oi(0);
                break;
            case 17:
                this.o = new sj0(1000L);
                this.p = s51.a(10, new hh3(18));
                break;
            default:
                this.o = new Rect();
                this.p = new Rect();
                break;
        }
    }
}
