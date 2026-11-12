package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import androidx.media3.common.PlaybackException;
import com.eddyizm.tempus.service.MediaService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ls2 extends ir2 {
    public static final int A;
    public final na4 f;
    public final tn2 g;
    public final hg3 h;
    public final lr0 i;
    public final zk j;
    public final boolean k;
    public final w9 l;
    public final qr2 m;
    public final v9 n;
    public final ComponentName o;
    public is2 p;
    public final boolean q = true;
    public volatile long r;
    public lr0 s;
    public int t;
    public bk u;
    public final Bundle v;
    public yw1 w;
    public yw1 x;
    public wa4 y;
    public mi3 z;

    static {
        A = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0117  */
    /* JADX WARN: Code duplicated, block: B:47:0x012f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0133  */
    /* JADX WARN: Code duplicated, block: B:4:0x0067  */
    /* JADX WARN: Code duplicated, block: B:50:0x014d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0152  */
    /* JADX WARN: Code duplicated, block: B:54:0x0156  */
    /* JADX WARN: Code duplicated, block: B:55:0x015d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0164  */
    /* JADX WARN: Code duplicated, block: B:61:0x0180  */
    /* JADX WARN: Code duplicated, block: B:64:0x0186  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ca  */
    public ls2(tn2 tn2Var, Uri uri, Handler handler, Bundle bundle, yw1 yw1Var, yw1 yw1Var2, wa4 wa4Var, mi3 mi3Var, Bundle bundle2) {
        boolean z;
        ComponentName componentName;
        ComponentName componentNameK;
        boolean z2;
        Intent intent;
        PendingIntent broadcast;
        qr2 qr2Var;
        PendingIntent pendingIntent;
        v9 v9Var;
        IntentFilter intentFilter;
        this.g = tn2Var;
        int i = 1;
        this.w = yw1Var;
        this.x = yw1Var2;
        this.y = wa4Var;
        this.z = mi3Var;
        this.v = new Bundle(bundle2);
        MediaService mediaService = tn2Var.f;
        this.h = hg3.E(mediaService);
        lr0 lr0Var = new lr0();
        lr0Var.r = this;
        lr0Var.o = do2.K;
        lr0Var.p = "";
        lr0Var.n = -9223372036854775807L;
        this.i = lr0Var;
        na4 na4Var = new na4(tn2Var);
        this.f = na4Var;
        this.r = 300000L;
        this.j = new zk(tn2Var.l.getLooper(), na4Var);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 33) {
            z = false;
        } else {
            String str = f35.a;
            if (mediaService.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                z = false;
            } else {
                String str2 = Build.MANUFACTURER;
                if (str2.equals("Google") || str2.equals("motorola") || str2.equals("vivo") || str2.equals("Sony") || str2.equals("Nothing") || str2.equals("unknown")) {
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        this.k = z;
        if (!yw1Var2.isEmpty()) {
            N();
        }
        PackageManager packageManager = mediaService.getPackageManager();
        Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
        intent2.setPackage(mediaService.getPackageName());
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (listQueryBroadcastReceivers.size() == 1) {
            ActivityInfo activityInfo = listQueryBroadcastReceivers.get(0).activityInfo;
            componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
        } else {
            if (!listQueryBroadcastReceivers.isEmpty()) {
                zr2.c(listQueryBroadcastReceivers.size(), "Expected 1 broadcast receiver that handles android.intent.action.MEDIA_BUTTON, found ");
                throw null;
            }
            componentName = null;
        }
        this.o = componentName;
        if (componentName == null || i2 < 31) {
            componentNameK = K(mediaService, "androidx.media3.session.MediaLibraryService");
            componentNameK = componentNameK == null ? K(mediaService, "androidx.media3.session.MediaSessionService") : componentNameK;
            if (componentNameK != null && !componentNameK.equals(componentName)) {
                z2 = true;
            }
            intent = new Intent("android.intent.action.MEDIA_BUTTON", uri);
            if (componentNameK == null) {
                v9Var = new v9(7, this);
                this.n = v9Var;
                intentFilter = new IntentFilter("android.intent.action.MEDIA_BUTTON");
                String scheme = uri.getScheme();
                String str3 = f35.a;
                intentFilter.addDataScheme(scheme);
                if (i2 < 33) {
                    mediaService.registerReceiver(v9Var, intentFilter);
                } else {
                    mediaService.registerReceiver(v9Var, intentFilter, 4);
                }
                intent.setPackage(mediaService.getPackageName());
                broadcast = PendingIntent.getBroadcast(mediaService, 0, intent, A);
                componentNameK = new ComponentName(mediaService, mediaService.getClass());
            } else {
                intent.setComponent(componentNameK);
                if (z2) {
                    broadcast = PendingIntent.getBroadcast(mediaService, 0, intent, A);
                } else if (i2 >= 26) {
                    broadcast = PendingIntent.getForegroundService(mediaService, 0, intent, A);
                } else {
                    broadcast = PendingIntent.getService(mediaService, 0, intent, A);
                }
                this.n = null;
            }
            qr2Var = new qr2(mediaService, TextUtils.join(".", new String[]{"androidx.media3.session.id", tn2Var.i}), i2 >= 31 ? null : componentNameK, i2 >= 31 ? null : broadcast, bundle);
            this.m = qr2Var;
            if (i2 >= 31 && componentName != null) {
                try {
                    MediaSession mediaSession = ((kr2) qr2Var.o).a;
                    mediaSession.getClass();
                    mediaSession.setMediaButtonBroadcastReceiver(componentName);
                } catch (IllegalArgumentException e) {
                    if (!Build.MANUFACTURER.equals("motorola")) {
                        throw e;
                    }
                    l93.G("MediaSessionLegacyStub", "caught IllegalArgumentException on a motorola device when attempting to set the media button broadcast receiver. See https://github.com/androidx/media/issues/1730 for details.", e);
                }
            }
            pendingIntent = tn2Var.t;
            if (pendingIntent != null) {
                ((kr2) this.m.o).a.setSessionActivity(pendingIntent);
            }
            this.m.u(this, handler);
            this.l = this.k ? new w9(mediaService, new es2(this, i)) : null;
        }
        componentNameK = componentName;
        z2 = false;
        intent = new Intent("android.intent.action.MEDIA_BUTTON", uri);
        if (componentNameK == null) {
            v9Var = new v9(7, this);
            this.n = v9Var;
            intentFilter = new IntentFilter("android.intent.action.MEDIA_BUTTON");
            String scheme2 = uri.getScheme();
            String str4 = f35.a;
            intentFilter.addDataScheme(scheme2);
            if (i2 < 33) {
                mediaService.registerReceiver(v9Var, intentFilter);
            } else {
                mediaService.registerReceiver(v9Var, intentFilter, 4);
            }
            intent.setPackage(mediaService.getPackageName());
            broadcast = PendingIntent.getBroadcast(mediaService, 0, intent, A);
            componentNameK = new ComponentName(mediaService, mediaService.getClass());
        } else {
            intent.setComponent(componentNameK);
            if (z2) {
                broadcast = PendingIntent.getBroadcast(mediaService, 0, intent, A);
            } else if (i2 >= 26) {
                broadcast = PendingIntent.getForegroundService(mediaService, 0, intent, A);
            } else {
                broadcast = PendingIntent.getService(mediaService, 0, intent, A);
            }
            this.n = null;
        }
        qr2Var = new qr2(mediaService, TextUtils.join(".", new String[]{"androidx.media3.session.id", tn2Var.i}), i2 >= 31 ? null : componentNameK, i2 >= 31 ? null : broadcast, bundle);
        this.m = qr2Var;
        if (i2 >= 31) {
            MediaSession mediaSession2 = ((kr2) qr2Var.o).a;
            mediaSession2.getClass();
            mediaSession2.setMediaButtonBroadcastReceiver(componentName);
        }
        pendingIntent = tn2Var.t;
        if (pendingIntent != null) {
            ((kr2) this.m.o).a.setSessionActivity(pendingIntent);
        }
        this.m.u(this, handler);
        this.l = this.k ? new w9(mediaService, new es2(this, i)) : null;
    }

    public static void E(qr2 qr2Var, ArrayList arrayList) {
        int i = 0;
        if (arrayList != null) {
            qr2Var.getClass();
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                long j = ((or2) obj).o;
                if (hashSet.contains(Long.valueOf(j))) {
                    l93.G("MediaSessionCompat", b11.k("Found duplicate queue id: ", j), new IllegalArgumentException("id of each queue item should be unique"));
                }
                hashSet.add(Long.valueOf(j));
            }
        }
        kr2 kr2Var = (kr2) qr2Var.o;
        MediaSession mediaSession = kr2Var.a;
        kr2Var.h = arrayList;
        if (arrayList == null) {
            mediaSession.setQueue(null);
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj2 = arrayList.get(i);
            i++;
            or2 or2Var = (or2) obj2;
            MediaSession.QueueItem queueItem = or2Var.p;
            if (queueItem == null) {
                MediaSession.QueueItem queueItem2 = new MediaSession.QueueItem(or2Var.n.b(), or2Var.o);
                or2Var.p = queueItem2;
                queueItem = queueItem2;
            }
            arrayList2.add(queueItem);
        }
        mediaSession.setQueue(arrayList2);
    }

    public static void F(qr2 qr2Var, eo2 eo2Var) {
        kr2 kr2Var = (kr2) qr2Var.o;
        kr2Var.i = eo2Var;
        MediaSession mediaSession = kr2Var.a;
        Bundle bundle = eo2Var.n;
        if (eo2Var.o == null) {
            MediaMetadata.Builder builder = new MediaMetadata.Builder();
            for (String str : bundle.keySet()) {
                Integer num = (Integer) eo2.q.get(str);
                if (num == null) {
                    num = -1;
                }
                int iIntValue = num.intValue();
                if (iIntValue == 0) {
                    builder.putLong(str, bundle.getLong(str));
                } else if (iIntValue == 1) {
                    builder.putText(str, bundle.getCharSequence(str));
                } else if (iIntValue == 2) {
                    builder.putBitmap(str, (Bitmap) bundle.getParcelable(str));
                } else if (iIntValue != 3) {
                    Object obj = bundle.get(str);
                    if (obj == null || (obj instanceof CharSequence)) {
                        builder.putText(str, (CharSequence) obj);
                    } else if (obj instanceof Long) {
                        builder.putLong(str, ((Long) obj).longValue());
                    }
                } else {
                    builder.putRating(str, (Rating) bundle.getParcelable(str));
                }
            }
            eo2Var.o = builder.build();
        }
        mediaSession.setMetadata(eo2Var.o);
    }

    public static gn2 G(String str, Uri uri, String str2, Bundle bundle) {
        um2 um2Var = new um2();
        vw1 vw1Var = yw1.o;
        gy3 gy3Var = gy3.r;
        List list = Collections.EMPTY_LIST;
        gy3 gy3Var2 = gy3.r;
        zm2 zm2Var = new zm2();
        cn2 cn2Var = cn2.d;
        if (str == null) {
            str = "";
        }
        String str3 = str;
        yc5 yc5Var = new yc5();
        yc5Var.n = uri;
        yc5Var.o = str2;
        yc5Var.p = bundle;
        return new gn2(str3, new wm2(um2Var), null, new an2(zm2Var), do2.K, new cn2(yc5Var));
    }

    public static ComponentName K(MediaService mediaService, String str) {
        PackageManager packageManager = mediaService.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(mediaService.getPackageName());
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            return null;
        }
        ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
        return new ComponentName(serviceInfo.packageName, serviceInfo.name);
    }

    @Override // defpackage.ir2
    public final void A() {
        boolean zS0 = this.g.s.S0(7);
        qr2 qr2Var = this.m;
        if (zS0) {
            I(7, new bs2(this, 2), ((kr2) qr2Var.o).b(), true);
        } else {
            I(6, new bs2(this, 3), ((kr2) qr2Var.o).b(), true);
        }
    }

    @Override // defpackage.ir2
    public final void B(long j) {
        if (j < 0) {
            return;
        }
        I(10, new cs2(this, j, 0), ((kr2) this.m.o).b(), true);
    }

    @Override // defpackage.ir2
    public final void C() {
        I(3, new bs2(this, 7), ((kr2) this.m.o).b(), true);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0093  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r23v2 */
    public final ei3 H(al3 al3Var) {
        long j;
        String r23;
        int i;
        int iG;
        String message;
        Bundle bundle;
        long j2;
        int i2;
        long j3;
        bk bkVar = this.u;
        Bundle bundle2 = this.v;
        if (bkVar != null && bkVar.p) {
            new Bundle((Bundle) bkVar.r).putAll(bundle2);
            ArrayList arrayList = new ArrayList();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            int i3 = bkVar.o;
            String str = (String) bkVar.q;
            str.getClass();
            return new ei3(7, -1L, 0L, 0.0f, 0L, i3, str, jElapsedRealtime, arrayList, -1L, (Bundle) bkVar.r);
        }
        PlaybackException playbackExceptionU = al3Var.U();
        int i4 = 1;
        boolean z = al3Var.S0(16) && !al3Var.V0();
        boolean z2 = playbackExceptionU != null || f35.d0(al3Var, this.q);
        ei3 ei3Var = null;
        int i5 = 7;
        if (playbackExceptionU == null) {
            jx1 jx1Var = f92.a;
            if (al3Var.U() == null) {
                int iG2 = al3Var.g();
                if (iG2 == 1) {
                    i5 = 0;
                } else if (iG2 != 2) {
                    if (iG2 != 3) {
                        if (iG2 != 4) {
                            kf2.n(f34.f(iG2, "Unrecognized State: "));
                            return null;
                        }
                        i5 = 1;
                    } else if (z2) {
                        i5 = 2;
                    } else {
                        i5 = 3;
                    }
                } else if (z2) {
                    i5 = 2;
                } else {
                    i5 = 6;
                }
            }
        }
        int i6 = i5;
        mi3 mi3VarD = ju2.d(this.z, al3Var.o());
        long j4 = 128;
        int i7 = 0;
        while (i7 < mi3VarD.a.a.size()) {
            int iB = mi3VarD.a.b(i7);
            if (iB == i4) {
                j3 = z2 ? 516L : 514L;
            } else if (iB == 2) {
                j3 = 16384;
            } else if (iB == 3) {
                j3 = 1;
            } else if (iB != 31) {
                switch (iB) {
                    case 5:
                        j3 = 256;
                        break;
                    case 6:
                    case 7:
                        j3 = 16;
                        break;
                    case 8:
                    case 9:
                        j3 = 32;
                        break;
                    case 10:
                        j3 = 4096;
                        break;
                    case 11:
                        j3 = 8;
                        break;
                    case 12:
                        j3 = 64;
                        break;
                    case 13:
                        j3 = 4194304;
                        break;
                    case 14:
                        j3 = 2621440;
                        break;
                    case 15:
                        j3 = 262144;
                        break;
                    default:
                        j3 = 0;
                        break;
                }
            } else {
                j3 = 240640;
            }
            j4 |= j3;
            i7++;
            i4 = 1;
        }
        if (!this.x.isEmpty() && j60.c(this.w, 2)) {
            j4 &= -17;
        }
        if (!this.x.isEmpty() && j60.c(this.w, 3)) {
            j4 &= -33;
        }
        if (!z) {
            j4 &= -257;
        }
        long j5 = j4;
        if (al3Var.S0(17)) {
            int iO0 = al3Var.o0();
            jx1 jx1Var2 = f92.a;
            j = iO0 == -1 ? -1L : iO0;
        } else {
            j = -1;
        }
        float f = al3Var.i().a;
        float f2 = (al3Var.h0() && z) ? f : 0.0f;
        Bundle bundle3 = playbackExceptionU != null ? new Bundle(playbackExceptionU.p) : new Bundle();
        if (playbackExceptionU == null && bkVar != null) {
            bundle3.putAll((Bundle) bkVar.r);
        }
        bundle3.putAll(bundle2);
        bundle3.putFloat("EXO_SPEED", f);
        gn2 gn2VarY0 = al3Var.Y0();
        if (gn2VarY0 != null) {
            String str2 = gn2VarY0.a;
            if (!"".equals(str2)) {
                bundle3.putString("androidx.media.PlaybackStateCompat.Extras.KEY_MEDIA_ID", str2);
            }
        }
        long jM0 = z ? al3Var.M0() : -1L;
        long jB0 = z ? al3Var.b0() : -1L;
        ArrayList arrayList2 = new ArrayList();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        int i8 = 0;
        while (i8 < this.w.size()) {
            j60 j60Var = (j60) this.w.get(i8);
            va4 va4Var = j60Var.a;
            Uri uri = j60Var.e;
            ei3 ei3Var2 = ei3Var;
            int i9 = j60Var.c;
            Bundle bundle4 = j60Var.g;
            int i10 = i8;
            if (va4Var != null) {
                Bundle bundle5 = va4Var.c;
                bundle = bundle3;
                String str3 = va4Var.b;
                j2 = jM0;
                if (j60Var.i && va4Var.a == 0) {
                    wa4 wa4Var = this.y;
                    if ((va4Var != null && wa4Var.a.contains(va4Var)) || (((i2 = j60Var.b) != -1 && mi3VarD.a(i2)) || j60.n(str3))) {
                        boolean z3 = i9 != 0;
                        boolean z4 = uri != null;
                        if (z3 || z4 || !bundle4.isEmpty()) {
                            bundle5 = new Bundle(bundle5);
                        }
                        if (!bundle4.isEmpty()) {
                            bundle5.putAll(bundle4);
                        }
                        if (z3) {
                            bundle5.putInt("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_COMPAT", i9);
                        }
                        if (z4) {
                            uri.getClass();
                            bundle5.putString("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_URI_COMPAT", uri.toString());
                        }
                        CharSequence charSequence = j60Var.f;
                        int i11 = j60Var.d;
                        if (TextUtils.isEmpty(str3)) {
                            kf2.n("You must specify an action to build a CustomAction");
                            return ei3Var2;
                        }
                        if (TextUtils.isEmpty(charSequence)) {
                            kf2.n("You must specify a name to build a CustomAction");
                            return ei3Var2;
                        }
                        if (i11 == 0) {
                            kf2.n("You must specify an icon resource id to build a CustomAction");
                            return ei3Var2;
                        }
                        arrayList2.add(new di3(str3, charSequence, i11, bundle5));
                    }
                }
            } else {
                bundle = bundle3;
                j2 = jM0;
            }
            i8 = i10 + 1;
            ei3Var = ei3Var2;
            bundle3 = bundle;
            jM0 = j2;
        }
        Bundle bundle6 = bundle3;
        ei3 ei3Var3 = ei3Var;
        long j6 = jM0;
        if (playbackExceptionU == null) {
            if (bkVar != null) {
                iG = bkVar.o;
                message = (String) bkVar.q;
            } else {
                r23 = ei3Var3;
                i = 0;
            }
            return new ei3(i6, j6, jB0, f2, j5, i, r23, jElapsedRealtime2, arrayList2, j, bundle6);
        }
        jx1 jx1Var3 = f92.a;
        iG = f92.g(playbackExceptionU.n);
        message = playbackExceptionU.getMessage();
        i = iG;
        r23 = message;
        return new ei3(i6, j6, jB0, f2, j5, i, r23, jElapsedRealtime2, arrayList2, j, bundle6);
    }

    public final void I(final int i, final ks2 ks2Var, final ms2 ms2Var, final boolean z) {
        tn2 tn2Var = this.g;
        if (tn2Var.l()) {
            return;
        }
        if (ms2Var != null) {
            f35.W(tn2Var.l, new Runnable() { // from class: as2
                @Override // java.lang.Runnable
                public final void run() {
                    ks2 ks2Var2 = ks2Var;
                    ls2 ls2Var = this.n;
                    tn2 tn2Var2 = ls2Var.g;
                    if (tn2Var2.l()) {
                        return;
                    }
                    boolean zIsActive = ((kr2) ls2Var.m.o).a.isActive();
                    int i2 = i;
                    ms2 ms2Var2 = ms2Var;
                    if (!zIsActive) {
                        StringBuilder sbJ = f34.j(i2, "Ignore incoming player command before initialization. command=", ", pid=");
                        sbJ.append(ms2Var2.a.b);
                        l93.q0("MediaSessionLegacyStub", sbJ.toString());
                        return;
                    }
                    fr2 fr2VarM = ls2Var.M(ms2Var2);
                    if (!ls2Var.f.H(fr2VarM, i2)) {
                        if (i2 != 1 || tn2Var2.s.q()) {
                            return;
                        }
                        l93.q0("MediaSessionLegacyStub", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
                        return;
                    }
                    pq pqVar = tn2Var2.e;
                    tn2Var2.B(fr2VarM);
                    pqVar.getClass();
                    try {
                        ks2Var2.b(fr2VarM);
                    } catch (RemoteException e) {
                        l93.r0("MediaSessionLegacyStub", "Exception in " + fr2VarM, e);
                    }
                    if (z) {
                        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                        sparseBooleanArray.append(i2, true);
                        tn2Var2.v(fr2VarM, new mi3(new w71(sparseBooleanArray)));
                    }
                }
            });
            return;
        }
        l93.A("MediaSessionLegacyStub", "RemoteUserInfo is null, ignoring command=" + i);
    }

    public final void J(va4 va4Var, int i, ks2 ks2Var, ms2 ms2Var) {
        Object objValueOf;
        if (ms2Var != null) {
            f35.W(this.g.l, new fm2(this, va4Var, i, ms2Var, ks2Var));
            return;
        }
        StringBuilder sb = new StringBuilder("RemoteUserInfo is null, ignoring command=");
        if (va4Var == null) {
            objValueOf = va4Var;
            objValueOf = Integer.valueOf(i);
        }
        objValueOf = va4Var;
        sb.append(objValueOf);
        l93.A("MediaSessionLegacyStub", sb.toString());
    }

    public final void L(gn2 gn2Var, boolean z, boolean z2) {
        I(31, new tr2(this, gn2Var, z, z2), ((kr2) this.m.o).b(), false);
    }

    public final fr2 M(ms2 ms2Var) {
        fr2 fr2VarW = this.f.w(ms2Var);
        if (fr2VarW == null) {
            fr2 fr2Var = new fr2(ms2Var, 0, 0, this.h.G(ms2Var), new js2(ms2Var), Bundle.EMPTY);
            dr2 dr2VarP = this.g.p(fr2Var);
            this.f.a(ms2Var, fr2Var, dr2VarP.a, dr2VarP.b);
            tn2 tn2Var = this.g;
            if (!tn2Var.y || !tn2.m(fr2Var)) {
                tn2Var.e.getClass();
            }
            fr2VarW = fr2Var;
        }
        zk zkVar = this.j;
        long j = this.r;
        zkVar.removeMessages(1001, fr2VarW);
        zkVar.sendMessageDelayed(zkVar.obtainMessage(1001, fr2VarW), j);
        return fr2VarW;
    }

    public final void N() {
        w9 w9Var;
        this.w = j60.j(j60.g(this.x, this.y, this.z), true, true);
        boolean z = this.k;
        Bundle bundle = this.v;
        if (z && ((w9Var = this.l) == null || !w9Var.e.get())) {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", (this.w.isEmpty() || j60.c(this.w, 2)) ? false : true);
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
        } else {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", !j60.c(this.w, 2));
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", !j60.c(this.w, 3));
        }
    }

    public final void O() {
        Bundle bundle = this.v;
        boolean z = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
        boolean z2 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
        N();
        if (bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false) == z && bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false) == z2) {
            return;
        }
        ((kr2) this.m.o).a.setExtras(bundle);
    }

    public final void P(al3 al3Var) {
        f35.W(this.g.l, new ds2(this, al3Var, 1));
    }

    @Override // defpackage.ir2
    public final void c(pm2 pm2Var) {
        if (pm2Var != null) {
            I(20, new vl2(this, pm2Var, -1, 3), ((kr2) this.m.o).b(), false);
        }
    }

    @Override // defpackage.ir2
    public final void d(pm2 pm2Var, int i) {
        if (pm2Var != null) {
            if (i == -1 || i >= 0) {
                I(20, new vl2(this, pm2Var, i, 3), ((kr2) this.m.o).b(), false);
            }
        }
    }

    @Override // defpackage.ir2
    public final void e(String str, Bundle bundle, ResultReceiver resultReceiver) {
        if (str.equals("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST")) {
            return;
        }
        if (str.equals("androidx.media3.session.SESSION_COMMAND_REQUEST_SESSION3_TOKEN") && resultReceiver != null) {
            resultReceiver.send(0, this.g.j.b());
        } else {
            va4 va4Var = new va4(str, Bundle.EMPTY);
            J(va4Var, 0, new dg0(this, va4Var, bundle, resultReceiver, 6), ((kr2) this.m.o).b());
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    @Override // defpackage.ir2
    public final void f(String str, Bundle bundle) {
        boolean zBooleanValue;
        if (str.equals("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST")) {
            return;
        }
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        va4 va4Var = new va4(str, bundle);
        boolean zN = j60.n(str);
        qr2 qr2Var = this.m;
        if (!zN) {
            J(va4Var, 0, new eg0(this, va4Var, bundle, 7), ((kr2) qr2Var.o).b());
            return;
        }
        try {
            j60 j60VarD = j60.d(va4Var);
            int i = j60VarD.b;
            Object obj = j60VarD.j;
            if (!j60VarD.b()) {
                l93.q0("MediaSessionLegacyStub", "Can't execute predefined custom command: ".concat(str));
                return;
            }
            va4 va4Var2 = j60VarD.a;
            if (va4Var2 != null) {
                rr2.w(va4Var2.a == 40010);
                obj.getClass();
                J(null, 40010, new ef0(20, this, (lu3) obj), ((kr2) qr2Var.o).b());
                return;
            }
            al3 al3Var = this.g.s;
            if (i != 1) {
                zBooleanValue = false;
            } else if (obj != null) {
                zBooleanValue = ((Boolean) obj).booleanValue();
            } else if (al3Var.q()) {
                zBooleanValue = false;
            } else {
                zBooleanValue = true;
            }
            if (zBooleanValue) {
                I(1, new bs2(this, 5), ((kr2) qr2Var.o).b(), false);
            } else if (i != 31) {
                I(i, new ef0(21, this, j60VarD), ((kr2) qr2Var.o).b(), true);
            } else {
                obj.getClass();
                L((gn2) obj, false, false);
            }
        } catch (RuntimeException e) {
            l93.r0("MediaSessionLegacyStub", "Failed to convert predefined custom command: " + va4Var.b, e);
        }
    }

    @Override // defpackage.ir2
    public final void g() {
        I(12, new bs2(this, 10), ((kr2) this.m.o).b(), true);
    }

    @Override // defpackage.ir2
    public final boolean h(Intent intent) {
        ms2 ms2VarB = ((kr2) this.m.o).b();
        ms2VarB.getClass();
        return this.g.t(new fr2(ms2VarB, 0, 0, false, null, Bundle.EMPTY), intent);
    }

    @Override // defpackage.ir2
    public final void i() {
        I(1, new bs2(this, 0), ((kr2) this.m.o).b(), true);
    }

    @Override // defpackage.ir2
    public final void j() {
        I(1, new bs2(this, 5), ((kr2) this.m.o).b(), false);
    }

    @Override // defpackage.ir2
    public final void k(String str, Bundle bundle) {
        L(G(str, null, null, bundle), true, true);
    }

    @Override // defpackage.ir2
    public final void l(String str, Bundle bundle) {
        L(G(null, null, str, bundle), true, true);
    }

    @Override // defpackage.ir2
    public final void m(Uri uri, Bundle bundle) {
        L(G(null, uri, null, bundle), true, true);
    }

    @Override // defpackage.ir2
    public final void n() {
        I(2, new bs2(this, 6), ((kr2) this.m.o).b(), true);
    }

    @Override // defpackage.ir2
    public final void o(String str, Bundle bundle) {
        L(G(str, null, null, bundle), true, false);
    }

    @Override // defpackage.ir2
    public final void p(String str, Bundle bundle) {
        L(G(null, null, str, bundle), true, false);
    }

    @Override // defpackage.ir2
    public final void q(Uri uri, Bundle bundle) {
        L(G(null, uri, null, bundle), true, false);
    }

    @Override // defpackage.ir2
    public final void r(pm2 pm2Var) {
        if (pm2Var == null) {
            return;
        }
        I(20, new ef0(22, this, pm2Var), ((kr2) this.m.o).b(), true);
    }

    @Override // defpackage.ir2
    public final void s() {
        I(11, new bs2(this, 4), ((kr2) this.m.o).b(), true);
    }

    @Override // defpackage.ir2
    public final void t(long j) {
        I(5, new cs2(this, j, 1), ((kr2) this.m.o).b(), true);
    }

    @Override // defpackage.ir2
    public final void u(float f) {
        if (f <= 0.0f) {
            return;
        }
        I(13, new rl2(this, f, 3), ((kr2) this.m.o).b(), true);
    }

    @Override // defpackage.ir2
    public final void v(mu3 mu3Var) {
        w(mu3Var);
    }

    @Override // defpackage.ir2
    public final void w(mu3 mu3Var) {
        lu3 lu3VarQ = f92.q(mu3Var);
        if (lu3VarQ != null) {
            J(null, 40010, new ef0(20, this, lu3VarQ), ((kr2) this.m.o).b());
            return;
        }
        l93.q0("MediaSessionLegacyStub", "Ignoring invalid RatingCompat " + mu3Var);
    }

    @Override // defpackage.ir2
    public final void x(int i) {
        I(15, new fs2(this, i, 0), ((kr2) this.m.o).b(), true);
    }

    @Override // defpackage.ir2
    public final void y(int i) {
        I(14, new fs2(this, i, 1), ((kr2) this.m.o).b(), true);
    }

    @Override // defpackage.ir2
    public final void z() {
        boolean zS0 = this.g.s.S0(9);
        qr2 qr2Var = this.m;
        if (zS0) {
            I(9, new bs2(this, 8), ((kr2) qr2Var.o).b(), true);
        } else {
            I(8, new bs2(this, 9), ((kr2) qr2Var.o).b(), true);
        }
    }
}
