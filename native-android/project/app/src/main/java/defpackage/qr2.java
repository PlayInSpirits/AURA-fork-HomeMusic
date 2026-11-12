package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
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
import com.eddyizm.tempus.subsonic.models.Directory;
import com.eddyizm.tempus.subsonic.models.IndexID3;
import java.io.File;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qr2 implements Callback, w04, ce3, cp3 {
    public static final om0 q = null;
    public final /* synthetic */ int n;
    public final Object o;
    public Object p;

    static {
        q = new om0(14);
    }

    public qr2(MediaService r6, String r7, ComponentName r8, PendingIntent r9, Bundle r10) {
        this.n = 0;
        ComponentName r2 = null;
        if (TextUtils.isEmpty(r7) == false) goto L5;
        kf2.n("tag must not be null or empty");
        throw null;
    L5:
        if (r8 != null) goto L15;
        int r11 = fu2.b;
        Intent r12 = new Intent("android.intent.action.MEDIA_BUTTON");
        r12.setPackage(r6.getPackageName());
        List<ResolveInfo> r13 = r6.getPackageManager().queryBroadcastReceivers(r12, 0);
        if (r13.size() != 1) goto L11;
        ActivityInfo r14 = r13.get(0).activityInfo;
        r2 = new ComponentName(r14.packageName, r14.name);
    L9:
        r8 = r2;
        if (r8 != null) goto L15;
        l93.K("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
        goto L15
    L11:
        if (r13.size() <= 1) goto L9;
        l93.q0("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
    L15:
        if (r8 == null) goto L22;
        if (r9 != null) goto L22;
        Intent r15 = new Intent("android.intent.action.MEDIA_BUTTON");
        r15.setComponent(r8);
        if (Build.VERSION.SDK_INT < 31) goto L20;
        int r16 = 33554432;
    L21:
        r9 = PendingIntent.getBroadcast(r6, 0, r15, r16);
        goto L22
    L20:
        r16 = 0;
    L22:
        int r17 = Build.VERSION.SDK_INT;
        if (r17 < 29) goto L26;
        this.o = new mr2(r6, r7, r10);
    L29:
        Looper r18 = Looper.myLooper();
        if (r18 != null) goto L33;
        r18 = Looper.getMainLooper();
    L33:
        u(new hr2(), new Handler(r18));
        ((kr2) this.o).a.setMediaButtonReceiver(r9);
        this.p = new wo0(r6, ((kr2) this.o).c);
        return;
    L26:
        if (r17 < 28) goto L28;
        this.o = new lr2(r6, r7, r10);
        goto L29
    L28:
        this.o = new kr2(r6, r7, r10);
        goto L29
    }

    public static void b(qr2 r4, h40 r5) {
        r4.getClass();
        Iterator r0 = new HashMap((HashMap) r4.o).entrySet().iterator();
    L4:
        if (r0.hasNext() == false) goto L14;
        Map.Entry r1 = (Map.Entry) r0.next();
        if (r1.getKey() != null) goto L12;
        List r2 = (List) r1.getValue();
        if (f(r5, r2).equals(f((h40) r4.p, r2)) == true) goto L4;
        throw null;
    L12:
        kf2.k();
        return;
    L14:
        r4.p = r5;
    }

    public static h40 f(h40 r3, List r4) {
        r3.getClass();
        Map r5 = r3.a;
        HashMap r0 = new HashMap(r5);
        HashSet r1 = new HashSet(r4);
        Iterator r6 = r5.keySet().iterator();
    L4:
        if (r6.hasNext() == false) goto L9;
        String r7 = (String) r6.next();
        if (r1.contains(r7) == true) goto L4;
        r0.remove(r7);
        goto L4
    L9:
        return new h40(r0);
    }

    @Override // defpackage.ce3
    public dn1 a(Uri r2, gi0 r3) {
        dn1 r4 = ((ce3) this.o).a(r2, r3);
        List r1 = (List) this.p;
        if (r1 != null) goto L5;
    L9:
        return r4;
    L5:
        if (r1.isEmpty() == true) goto L9;
        return (dn1) r4.a(r1);
    }

    public void c(Object r2, String r3) {
        String r4 = b11.o(r3, "=", String.valueOf(r2));
        ((ArrayList) this.o).add(r4);
    }

    public boolean d() {
        monitor-enter(this);
    L12:
        th = move-exception;
        throw th;
    L4:
        if (((AtomicBoolean) this.p).get() == false) goto L8;
        monitor-exit(this);
        return false;
    L8:
        ((AtomicInteger) this.o).incrementAndGet();     // Catch: Throwable -> L12
        monitor-exit(this);
        return true;
    }

    public boolean e(rc5 r2) {
        Object r0 = this.p;
        monitor-enter(r0);
        boolean r1 = ((nh0) this.o).a.containsKey(r2);     // Catch: Throwable -> L7
        monitor-exit(r0);
        return r1;
    L7:
        th = move-exception;
        throw th;
    }

    public void g(String r11, PrintWriter r12) {
        nd2 r10 = (nd2) this.p;
        if (r10.b.e() <= 0) goto L32;
        r12.print(r11);
        r12.println("Loaders:");
        String r0 = r11.concat("    ");
        int r2 = 0;
    L6:
        if (r2 >= r10.b.e()) goto L36;
        ld2 r3 = (ld2) r10.b.f(r2);
        r12.print(r11);
        r12.print("  #");
        r12.print(r10.b.c(r2));
        r12.print(": ");
        r12.println(r3.toString());
        r12.print(r0);
        r12.print("mId=");
        r12.print(0);
        r12.print(" mArgs=");
        r12.println(null);
        r12.print(r0);
        r12.print("mLoader=");
        r12.println(r3.l);
        og5 r5 = r3.l;
        String r7 = r0.concat("  ");
        r5.getClass();
        r12.print(r7);
        r12.print("mId=");
        r12.print(0);
        r12.print(" mListener=");
        r12.println(r5.a);
        if (r5.b == false) goto L10;
    L12:
        r12.print(r7);
        r12.print("mStarted=");
        r12.print(r5.b);
        r12.print(" mContentChanged=");
        r12.print(r5.e);
        r12.print(" mProcessingChange=");
        r12.println(false);
    L14:
        if (r5.c == false) goto L16;
    L17:
        r12.print(r7);
        r12.print("mAbandoned=");
        r12.print(r5.c);
        r12.print(" mReset=");
        r12.println(r5.d);
    L19:
        if (r5.g == null) goto L22;
        r12.print(r7);
        r12.print("mTask=");
        r12.print(r5.g);
        r12.print(" waiting=");
        r5.g.getClass();
        r12.println(false);
    L22:
        if (r5.h == null) goto L25;
        r12.print(r7);
        r12.print("mCancellingTask=");
        r12.print(r5.h);
        r12.print(" waiting=");
        r5.h.getClass();
        r12.println(false);
    L25:
        if (r3.n == null) goto L27;
        r12.print(r0);
        r12.print("mCallbacks=");
        r12.println(r3.n);
        md2 r4 = r3.n;
        String r6 = r0.concat("  ");
        r4.getClass();
        r12.print(r6);
        r12.print("mDeliveredData=");
        r12.println(r4.b);
    L27:
        r12.print(r0);
        r12.print("mData=");
        og5 r8 = r3.l;
        Object r9 = r3.d();
        r8.getClass();
        StringBuilder r13 = new StringBuilder(64);
        gh0.c(r9, r13);
        r13.append("}");
        r12.println(r13.toString());
        r12.print(r0);
        r12.print("mStarted=");
        if (r3.c <= 0) goto L30;
        boolean r14 = true;
    L31:
        r12.println(r14);
        r2 = r2 + 1;
        goto L6
    L30:
        r14 = false;
        goto L31
    L16:
        if (r5.d == false) goto L19;
    L10:
        if (r5.e == true) goto L12;
    L36:
        return;
    }

    public View h(int r9, int r10, int r11, int r12) {
        vu r0 = (vu) this.p;
        u55 r8 = (u55) this.o;
        int r1 = r8.d();
        int r2 = r8.k();
        if (r10 <= r9) goto L5;
        int r3 = 1;
    L6:
        View r4 = null;
    L7:
        if (r9 == r10) goto L18;
        View r5 = r8.q(r9);
        int r6 = r8.a(r5);
        int r7 = r8.r(r5);
        r0.b = r1;
        r0.c = r2;
        r0.d = r6;
        r0.e = r7;
        if (r11 == 0) goto L13;
        r0.a = r11;
        if (r0.a() == false) goto L13;
        return r5;
    L13:
        if (r12 == 0) goto L17;
        r0.a = r12;
        if (r0.a() == false) goto L17;
        r4 = r5;
    L17:
        r9 = r9 + r3;
        goto L7
    L18:
        return r4;
    L5:
        r3 = -1;
        goto L6
    }

    @Override // defpackage.c11
    public boolean i(Object r3, File r4, db3 r5) {
        ss r0 = (ss) this.p;
        Bitmap r6 = ((BitmapDrawable) ((q04) r3).get()).getBitmap();
        return r0.i(new at((zs) this.o, r6), r4, r5);
    }

    @Override // defpackage.cp3
    public void j(Preference r2) {
        ((PreferenceGroup) this.o).h0 = Integer.MAX_VALUE;
        np3 r1 = (np3) this.p;
        Handler r3 = r1.u;
        g5 r4 = r1.v;
        r3.removeCallbacks(r4);
        r3.post(r4);
    }

    public AutofillManager k() {
        AutofillManager r0 = (AutofillManager) this.p;
        if (r0 != null) goto L10;
        AutofillManager r1 = gm0.j(((Context) this.o).getSystemService(gm0.l()));
        if (r1 == null) goto L8;
        this.p = r1;
        return r1;
    L8:
        kf2.o("Could not locate AutofillManager from context");
        return null;
    L10:
        return r0;
    }

    @Override // defpackage.w04
    public int l(db3 r1) {
        return 2;
    }

    public String m(f42 r9) {
        sj0 r0 = (sj0) this.o;
        monitor-enter(r0);
        String r1 = (String) ((sj0) this.o).a(r9);     // Catch: Throwable -> L31
        monitor-exit(r0);     // Catch: Throwable -> L31
        if (r1 != null) goto L23;
        j44 r2 = (j44) ((i61) this.p).b();
        r9.b(r2.n);     // Catch: Throwable -> L20
        byte[] r3 = r2.n.digest();     // Catch: Throwable -> L20
        char[] r4 = e35.b;     // Catch: Throwable -> L20
        monitor-enter(r4);     // Catch: Throwable -> L20
        int r5 = 0;
    L38:
    L17:
        th = move-exception;
        throw th;     // Catch: Throwable -> L20
    L12:
        if (r5 >= r3.length) goto L14;
        byte r6 = r3[r5];     // Catch: Throwable -> L17
        int r7 = r5 * 2;     // Catch: Throwable -> L17
        char[] r8 = e35.a;     // Catch: Throwable -> L17
        r4[r7] = r8[(r6 & 255) >>> 4];     // Catch: Throwable -> L17
        r4[r7 + 1] = r8[r6 & 15];     // Catch: Throwable -> L17
        r5 = r5 + 1;     // Catch: Throwable -> L17
        goto L38
    L14:
        r1 = new String(r4);     // Catch: Throwable -> L17
        monitor-exit(r4);     // Catch: Throwable -> L17
        ((i61) this.p).a(r2);
        goto L23
    L20:
        th = move-exception;
        ((i61) this.p).a(r2);
        throw th;
    L23:
        sj0 r10 = (sj0) this.o;
        monitor-enter(r10);
        ((sj0) this.o).d(r9, r1);     // Catch: Throwable -> L28
        monitor-exit(r10);     // Catch: Throwable -> L28
        return r1;
    L28:
        th = move-exception;
        throw th;
    L31:
        th = move-exception;
        throw th;
    }

    public synchronized Map n() {
        monitor-enter(this);
    L6:
        th = move-exception;
        throw th;
    L4:
        if (((Map) this.p) != null) goto L8;
        this.p = Collections.unmodifiableMap(new HashMap((HashMap) this.o));     // Catch: Throwable -> L6
    L8:
        Map r0 = (Map) this.p;     // Catch: Throwable -> L6
        monitor-exit(this);
        return r0;
    }

    public boolean o(View r5) {
        vu r0 = (vu) this.p;
        u55 r4 = (u55) this.o;
        int r1 = r4.d();
        int r2 = r4.k();
        int r3 = r4.a(r5);
        int r6 = r4.r(r5);
        r0.b = r1;
        r0.c = r2;
        r0.d = r3;
        r0.e = r6;
        r0.a = 24579;
        return r0.a();
    }

    @Override // retrofit2.Callback
    public void onFailure(Call r3, Throwable r4) {
        int r5 = this.n;
        Object r1 = this.o;
        switch(r5) {
            case 3: goto L8;
            case 7: goto L6;
            default: goto L4;
        };
    L4:
        ((k03) r1).i(new ArrayList());
        return;
    L6:
        r4.printStackTrace();
        ((k03) r1).k(kb4.s((String) this.p, null));
        return;
    L8:
        k03 r2 = (k03) r1;
        ArrayList r6 = new ArrayList(kb4.h(null));
        Collections.shuffle(r6);
        pa r7 = (pa) this.p;
        int r0 = 10;
        if ((r6.size() / 10) > 0) goto L12;
        r0 = r6.size();
    L12:
        r7.x(r6.subList(0, r0), r2);
    }

    @Override // retrofit2.Callback
    public void onResponse(Call r4, Response r5) {
        int r0 = this.n;
        Object r1 = this.o;
        switch(r0) {
            case 3: goto L14;
            case 7: goto L6;
            default: goto L4;
        };
    L4:
        ((k03) r1).i(xi4.h((xi4) this.p, r5, "similarSongs"));
        return;
    L6:
        k03 r2 = (k03) r1;
        String r3 = (String) this.p;
        if (r5.isSuccessful() == true) goto L9;
    L11:
        Directory r6 = null;
    L12:
        r2.k(kb4.s(r3, r6));
        return;
    L9:
        if (r5.body() == null) goto L11;
        r6 = ((ApiResponse) r5.body()).getSubsonicResponse().getDirectory();
        goto L12
    L14:
        k03 r7 = (k03) r1;
        if (r5.isSuccessful() == true) goto L17;
    L33:
        onFailure(r4, new Exception("HTTP " + r5.code()));
        return;
    L17:
        if (r5.body() == null) goto L33;
        ArrayList r8 = new ArrayList();
        if (((ApiResponse) r5.body()).getSubsonicResponse().getArtists() != null) goto L21;
    L28:
        ArrayList r9 = new ArrayList(kb4.h(r8));
        Collections.shuffle(r9);
        pa r10 = (pa) this.p;
        int r11 = 10;
        if ((r9.size() / 10) > 0) goto L32;
        r11 = r9.size();
    L32:
        r10.x(r9.subList(0, r11), r7);
        return;
    L21:
        if (((ApiResponse) r5.body()).getSubsonicResponse().getArtists().getIndices() == null) goto L28;
        Iterator<IndexID3> r12 = ((ApiResponse) r5.body()).getSubsonicResponse().getArtists().getIndices().iterator();
    L24:
        if (r12.hasNext() == false) goto L28;
        IndexID3 r13 = r12.next();
        if (r13.getArtists() == null) goto L24;
        r8.addAll(r13.getArtists());
        goto L24
    }

    public void p(View r3, int r4, boolean r5) {
        if (Build.VERSION.SDK_INT < 27) goto L6;
        un.b(k(), r3, r4, r5);
        return;
    }

    public void q(Exception r3, boolean r4) {
        this.p = null;
        HashSet r2 = (HashSet) this.o;
        yw1 r0 = yw1.k(r2);
        r2.clear();
        vw1 r5 = r0.m(0);
    L4:
        if (r5.hasNext() == false) goto L10;
        ik0 r1 = (ik0) r5.next();
        r1.getClass();
        if (r4 == false) goto L8;
        int r6 = 1;
    L9:
        r1.k(r3, r6);
        goto L4
    L8:
        r6 = 3;
        goto L9
    }

    public void r(ik0 r8) {
        ((HashSet) this.o).add(r8);
        if (((ik0) this.p) == null) goto L5;
        return;
    L5:
        this.p = r8;
        l31 r6 = r8.b.p();
        r8.z = r6;
        gk0 r7 = r8.s;
        String r9 = f35.a;
        r6.getClass();
        r7.getClass();
        r7.obtainMessage(1, new hk0(ed2.g.getAndIncrement(), true, SystemClock.elapsedRealtime(), r6)).sendToTarget();
    }

    public gl4 s(rc5 r2) {
        r2.getClass();
        Object r0 = this.p;
        monitor-enter(r0);
        gl4 r1 = ((nh0) this.o).b(r2);     // Catch: Throwable -> L7
        monitor-exit(r0);
        return r1;
    L7:
        th = move-exception;
        throw th;
    }

    public List t(String r2) {
        r2.getClass();
        Object r0 = this.p;
        monitor-enter(r0);
        List r1 = ((nh0) this.o).c(r2);     // Catch: Throwable -> L7
        monitor-exit(r0);
        return r1;
    L7:
        th = move-exception;
        throw th;
    }

    public String toString() {
        int r0 = this.n;
        Object r1 = this.o;
        switch(r0) {
            case 11: goto L16;
            case 14: goto L8;
            case 21: goto L7;
            default: goto L5;
        };
    L8:
        StringBuilder r2 = new StringBuilder(100);
        r2.append(this.p.getClass().getSimpleName());
        r2.append('{');
        ArrayList r3 = (ArrayList) r1;
        int r4 = r3.size();
        int r5 = 0;
    L9:
        if (r5 >= r4) goto L14;
        r2.append((String) r3.get(r5));
        if (r5 >= (r4 - 1)) goto L13;
        r2.append(", ");
    L13:
        r5 = r5 + 1;
        goto L9
    L14:
        r2.append('}');
        return r2.toString();
    L16:
        StringBuilder r6 = new StringBuilder(128);
        r6.append("LoaderManager{");
        r6.append(Integer.toHexString(System.identityHashCode(this)));
        r6.append(" in ");
        gh0.c((ba2) r1, r6);
        r6.append("}}");
        return r6.toString();
    L5:
        return super.toString();
    L7:
        return "Bounds{lower=" + ((vz1) r1) + " upper=" + ((vz1) this.p) + "}";
    }

    public void u(ir2 r4, Handler r5) {
        kr2 r3 = (kr2) this.o;
        Object r0 = r3.d;
        monitor-enter(r0);
        r3.l = r4;     // Catch: Throwable -> L15
        r3.a.setCallback((y52) r4.c, r5);     // Catch: Throwable -> L15
        Object r1 = r4.b;     // Catch: Throwable -> L15
        monitor-enter(r1);     // Catch: Throwable -> L15
        r4.d = new WeakReference(r3);     // Catch: Throwable -> L9
        zk r6 = (zk) r4.e;     // Catch: Throwable -> L9
        if (r6 == null) goto L11;
        r6.removeCallbacksAndMessages(null);     // Catch: Throwable -> L9
    L11:
        r4.e = new zk(r4, r5.getLooper(), 9);     // Catch: Throwable -> L9
        monitor-exit(r1);     // Catch: Throwable -> L9
        monitor-exit(r0);     // Catch: Throwable -> L15
        return;
    L9:
        th = move-exception;
        throw th;     // Catch: Throwable -> L15
    L15:
        th = move-exception;
        throw th;
    }

    public void v(ei3 r9) {
        kr2 r8 = (kr2) this.o;
        r8.g = r9;
        Object r1 = r8.d;
        monitor-enter(r1);
    L11:
        th = move-exception;
        throw th;
    L5:
        int r2 = r8.f.beginBroadcast() - 1;
    L6:
        RemoteCallbackList r0 = r8.f;
        if (r2 < 0) goto L18;
        ((lu1) r0.getBroadcastItem(r2)).j(r9);     // Catch: Throwable -> L11 Throwable -> L13 RemoteException -> L15
    L17:
        r2 = r2 - 1;     // Catch: Throwable -> L11
    L13:
        e = move-exception;
        l93.G("MediaSessionCompat", "Dead object in setPlaybackState.", e);     // Catch: Throwable -> L11
        goto L17
    L18:
        r0.finishBroadcast();     // Catch: Throwable -> L11
        monitor-exit(r1);     // Catch: Throwable -> L11
        MediaSession r10 = r8.a;
        if (r9.y != null) goto L32;
        PlaybackState.Builder r3 = new PlaybackState.Builder();
        r3.setState(r9.n, r9.o, r9.q, r9.u);
        r3.setBufferedPosition(r9.p);
        r3.setActions(r9.r);
        r3.setErrorMessage(r9.t);
        Iterator r4 = r9.v.iterator();
    L24:
        if (r4.hasNext() == false) goto L31;
        di3 r5 = (di3) r4.next();
        PlaybackState.CustomAction r6 = r5.r;
        if (r6 != null) goto L29;
        PlaybackState.CustomAction.Builder r7 = new PlaybackState.CustomAction.Builder(r5.n, r5.o, r5.p);
        r7.setExtras(r5.q);
        r6 = r7.build();
    L29:
        if (r6 == null) goto L24;
        r3.addCustomAction(r6);
        goto L24
    L31:
        r3.setActiveQueueItemId(r9.w);
        r3.setExtras(r9.x);
        r9.y = r3.build();
    L32:
        r10.setPlaybackState(r9.y);
    }

    public gl4 w(rc5 r2) {
        Object r0 = this.p;
        monitor-enter(r0);
        gl4 r1 = ((nh0) this.o).d(r2);     // Catch: Throwable -> L7
        monitor-exit(r0);
        return r1;
    L7:
        th = move-exception;
        throw th;
    }

    public void x() {
        monitor-enter(this);
        ((AtomicInteger) this.o).decrementAndGet();     // Catch: Throwable -> L9
        if (((AtomicInteger) this.o).get() < 0) goto L8;
        monitor-exit(this);
        return;
    L8:
        throw new IllegalStateException("Unbalanced call to unblock() detected.");     // Catch: Throwable -> L9
    L9:
        th = move-exception;
        throw th;
    }

    public /* synthetic */ qr2(int r1, Object r2, Object r3) {
        this.n = r1;
        this.p = r2;
        this.o = r3;
    }

    public /* synthetic */ qr2(Object r1, Object r2, boolean r3, int r4) {
        this.n = r4;
        this.o = r1;
        this.p = r2;
    }

    public /* synthetic */ qr2(Object r2) {
        this.n = 14;
        this.p = r2;
        this.o = new ArrayList();
    }

    public qr2(na r2) {
        this.n = 5;
        this.o = new AtomicInteger(0);
        this.p = new AtomicBoolean(false);
    }

    public qr2(ba2 r3, e75 r4) {
        this.n = 11;
        this.o = r3;
        r4.getClass();
        sf0 r5 = sf0.b;
        r5.getClass();
        bq4 r0 = new bq4(r4, nd2.d, r5);
        i30 r6 = kx3.a(nd2.class);
        String r7 = r6.b();
        if (r7 == null) goto L6;
        this.p = (nd2) r0.l(r6, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r7));
        return;
    L6:
        kf2.n("Local and anonymous classes can not be ViewModels");
        throw null;
    }

    public qr2(gp3 r2) {
        this.n = 1;
        this.o = (ky0) r2.o;
        Integer r3 = (Integer) r2.p;
        if (r3 == null) goto L6;
        this.p = r3;
        return;
    }

    public qr2(nh0 r2) {
        this.n = 19;
        this.o = r2;
        this.p = new Object();
    }

    public qr2(u55 r2) {
        this.n = 20;
        this.o = r2;
        vu r3 = new vu();
        r3.a = 0;
        this.p = r3;
    }

    public qr2(WindowInsetsAnimation.Bounds r2) {
        this.n = 21;
        this.o = vz1.c(xq2.A(r2));
        this.p = vz1.c(xq2.h(r2));
    }

    public /* synthetic */ qr2(int r1, Object r2) {
        this.n = r1;
        this.o = r2;
    }

    public qr2(int r3) {
        this.n = r3;
        switch(r3) {
            case 6: goto L14;
            case 8: goto L12;
            case 10: goto L10;
            case 13: goto L8;
            case 17: goto L6;
            default: goto L4;
        };
    L4:
        this.o = new Rect();
        this.p = new Rect();
        return;
    L6:
        this.o = new sj0(1000);
        this.p = s51.a(10, new hh3(18));
        return;
    L8:
        this.o = new AtomicReference();
        this.p = new oi(0);
        return;
    L10:
        this.o = new HashMap();
        return;
    L12:
        this.o = new HashMap();
        this.p = h40.b;
        return;
    L14:
        this.o = new HashSet();
    }
}
