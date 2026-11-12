package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.core.graphics.drawable.IconCompat;
import androidx.media3.session.MediaLibraryService;
import app.homemusic.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class io2 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;

    public /* synthetic */ io2(Object obj, Object obj2, Object obj3, Object obj4, boolean z, int i) {
        this.n = i;
        this.p = obj;
        this.q = obj2;
        this.r = obj3;
        this.s = obj4;
        this.o = z;
    }

    /* JADX WARN: Code duplicated, block: B:134:0x0350  */
    /* JADX WARN: Code duplicated, block: B:138:0x0378  */
    /* JADX WARN: Code duplicated, block: B:141:0x039d  */
    /* JADX WARN: Code duplicated, block: B:143:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:152:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:153:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:163:0x0420  */
    /* JADX WARN: Code duplicated, block: B:166:0x0425  */
    /* JADX WARN: Code duplicated, block: B:167:0x0427  */
    /* JADX WARN: Code duplicated, block: B:170:0x042b  */
    /* JADX WARN: Code duplicated, block: B:173:0x043c  */
    /* JADX WARN: Code duplicated, block: B:179:0x03aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        int i;
        yl0 yl0Var;
        s63 s63Var;
        tn2 tn2Var;
        long jCurrentTimeMillis;
        boolean z;
        x7 x7Var;
        ic2 ic2VarI;
        mf4 mf4Var;
        int i2;
        int i3 = this.n;
        Object obj = this.s;
        Object obj2 = this.r;
        Object obj3 = this.q;
        Object obj4 = this.p;
        switch (i3) {
            case 0:
                lo2 lo2Var = (lo2) obj4;
                kn2 kn2Var = (kn2) obj3;
                yw1 yw1Var = (yw1) obj2;
                vl2 vl2Var = (vl2) obj;
                yl0 yl0Var2 = lo2Var.u;
                x7 x7Var2 = lo2Var.o;
                Context context = yl0Var2.a;
                NotificationManager notificationManager = yl0Var2.c;
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 26 && notificationManager.getNotificationChannel("default_channel_id") == null) {
                    NotificationChannel notificationChannelB = tn.b(context.getString(yl0Var2.b));
                    if (i4 <= 27) {
                        notificationChannelB.setShowBadge(false);
                    }
                    notificationManager.createNotificationChannel(notificationChannelB);
                }
                qi3 qi3VarA = kn2Var.a();
                tn2 tn2Var2 = kn2Var.a;
                s63 s63Var2 = new s63(context, "default_channel_id");
                eu2 eu2Var = new eu2(kn2Var);
                mi3 mi3VarO = qi3VarA.o();
                boolean zD0 = f35.d0(qi3VarA, tn2Var2.p);
                gy3 gy3VarJ = j60.j(yw1Var, true, true);
                boolean zC = j60.c(gy3VarJ, 2);
                boolean zC2 = j60.c(gy3VarJ, 3);
                uw1 uw1Var = new uw1(4);
                if (zC) {
                    uw1Var.c((j60) gy3VarJ.get(0));
                    i = 1;
                } else {
                    if (mi3VarO.a.a(7, 6)) {
                        i60 i60Var = new i60(57413);
                        i60Var.c(6);
                        i60Var.f = context.getString(R.string.media3_controls_seek_to_previous_description);
                        uw1Var.c(i60Var.a());
                    }
                    i = 0;
                }
                if (mi3VarO.a(1)) {
                    if (zD0) {
                        i60 i60Var2 = new i60(57399);
                        i60Var2.c(1);
                        i60Var2.f = context.getString(R.string.media3_controls_play_description);
                        uw1Var.c(i60Var2.a());
                    } else {
                        i60 i60Var3 = new i60(57396);
                        i60Var3.c(1);
                        i60Var3.f = context.getString(R.string.media3_controls_pause_description);
                        uw1Var.c(i60Var3.a());
                    }
                }
                if (zC2) {
                    uw1Var.c((j60) gy3VarJ.get(i));
                    i++;
                } else if (mi3VarO.a.a(9, 8)) {
                    i60 i60Var4 = new i60(57412);
                    i60Var4.c(8);
                    i60Var4.f = context.getString(R.string.media3_controls_seek_to_next_description);
                    uw1Var.c(i60Var4.a());
                }
                while (i < gy3VarJ.q) {
                    uw1Var.c((j60) gy3VarJ.get(i));
                    i++;
                }
                gy3 gy3VarF = uw1Var.f();
                int[] iArrCopyOf = new int[3];
                int[] iArr = new int[3];
                Arrays.fill(iArrCopyOf, -1);
                Arrays.fill(iArr, -1);
                int i5 = 0;
                boolean z2 = false;
                while (true) {
                    int[] iArr2 = iArr;
                    if (i5 >= gy3VarF.q) {
                        vl2 vl2Var2 = vl2Var;
                        yl0 yl0Var3 = yl0Var2;
                        lo2 lo2Var2 = lo2Var;
                        qi3 qi3Var = qi3VarA;
                        tn2 tn2Var3 = tn2Var2;
                        s63 s63Var3 = s63Var2;
                        if (!z2) {
                            int i6 = 0;
                            int i7 = 0;
                            for (int i8 = 3; i6 < i8; i8 = 3) {
                                int i9 = iArr2[i6];
                                if (i9 != -1) {
                                    iArrCopyOf[i7] = i9;
                                    i7++;
                                }
                                i6++;
                            }
                        }
                        for (int i10 = 0; i10 < 3; i10++) {
                            if (iArrCopyOf[i10] == -1) {
                                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i10);
                                eu2Var.c = iArrCopyOf;
                                if (qi3Var.S0(18)) {
                                    do2 do2VarK0 = qi3Var.K0();
                                    s63Var = s63Var3;
                                    s63Var.e = s63.b(do2VarK0.a);
                                    s63Var.f = s63.b(do2VarK0.b);
                                    tn2Var = tn2Var3;
                                    x7Var = tn2Var.m;
                                    yl0Var = yl0Var3;
                                    if (yl0Var.g != null || !x7Var.equals(yl0Var.f)) {
                                        yl0Var.f = x7Var;
                                        yl0Var.g = new xc5(4, new x7(((Integer) yl0.h.get()).intValue(), 12, x7Var));
                                    }
                                    ic2VarI = yl0Var.g.i(do2VarK0);
                                    if (ic2VarI != null) {
                                        mf4Var = yl0Var.d;
                                        if (mf4Var != null) {
                                            mf4Var.o = true;
                                        }
                                        if (ic2VarI.isDone()) {
                                            try {
                                                s63Var.d((Bitmap) hw.j(ic2VarI));
                                            } catch (CancellationException | ExecutionException e) {
                                                l93.q0("NotificationProvider", "Failed to load bitmap: " + e.getMessage());
                                            }
                                        } else {
                                            mf4 mf4Var2 = new mf4(s63Var, vl2Var2);
                                            yl0Var.d = mf4Var2;
                                            Handler handler = tn2Var.l;
                                            Objects.requireNonNull(handler);
                                            ic2VarI.f(new lg1(0, ic2VarI, mf4Var2), new ym(handler, 1));
                                        }
                                    }
                                    break;
                                } else {
                                    yl0Var = yl0Var3;
                                    s63Var = s63Var3;
                                    tn2Var = tn2Var3;
                                }
                                if (qi3Var.h0() || qi3Var.k() || qi3Var.T0() || qi3Var.i().a != 1.0f) {
                                    jCurrentTimeMillis = -9223372036854775807L;
                                } else {
                                    jCurrentTimeMillis = System.currentTimeMillis() - qi3Var.Z();
                                }
                                if (jCurrentTimeMillis != -9223372036854775807L) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (!z) {
                                    jCurrentTimeMillis = 0;
                                }
                                Notification notification = s63Var.v;
                                notification.when = jCurrentTimeMillis;
                                s63Var.j = z;
                                s63Var.k = z;
                                if (Build.VERSION.SDK_INT >= 31) {
                                    s63Var.t = 1;
                                }
                                s63Var.g = tn2Var.t;
                                notification.deleteIntent = PendingIntent.getService((MediaLibraryService) x7Var2.p, 86, x7Var2.b(kn2Var, 86).putExtra("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", true), 67108864);
                                s63Var.c(8, true);
                                notification.icon = yl0Var.e;
                                s63Var.e(eu2Var);
                                s63Var.r = 1;
                                s63Var.c(2, false);
                                s63Var.o = "media3_group_key";
                                lo2Var2.r.execute(new b41(lo2Var2, kn2Var, new rm2(s63Var.a()), this.o, 2));
                                return;
                            }
                        }
                        eu2Var.c = iArrCopyOf;
                        if (qi3Var.S0(18)) {
                            do2 do2VarK1 = qi3Var.K0();
                            s63Var = s63Var3;
                            s63Var.e = s63.b(do2VarK1.a);
                            s63Var.f = s63.b(do2VarK1.b);
                            tn2Var = tn2Var3;
                            x7Var = tn2Var.m;
                            yl0Var = yl0Var3;
                            if (yl0Var.g != null) {
                                yl0Var.f = x7Var;
                                yl0Var.g = new xc5(4, new x7(((Integer) yl0.h.get()).intValue(), 12, x7Var));
                            } else {
                                yl0Var.f = x7Var;
                                yl0Var.g = new xc5(4, new x7(((Integer) yl0.h.get()).intValue(), 12, x7Var));
                            }
                            ic2VarI = yl0Var.g.i(do2VarK1);
                            if (ic2VarI != null) {
                                mf4Var = yl0Var.d;
                                if (mf4Var != null) {
                                    mf4Var.o = true;
                                }
                                if (ic2VarI.isDone()) {
                                    s63Var.d((Bitmap) hw.j(ic2VarI));
                                } else {
                                    mf4 mf4Var3 = new mf4(s63Var, vl2Var2);
                                    yl0Var.d = mf4Var3;
                                    Handler handler2 = tn2Var.l;
                                    Objects.requireNonNull(handler2);
                                    ic2VarI.f(new lg1(0, ic2VarI, mf4Var3), new ym(handler2, 1));
                                }
                            }
                            break;
                        } else {
                            yl0Var = yl0Var3;
                            s63Var = s63Var3;
                            tn2Var = tn2Var3;
                        }
                        if (qi3Var.h0()) {
                            jCurrentTimeMillis = -9223372036854775807L;
                        } else {
                            jCurrentTimeMillis = -9223372036854775807L;
                        }
                        if (jCurrentTimeMillis != -9223372036854775807L) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            jCurrentTimeMillis = 0;
                        }
                        Notification notification2 = s63Var.v;
                        notification2.when = jCurrentTimeMillis;
                        s63Var.j = z;
                        s63Var.k = z;
                        if (Build.VERSION.SDK_INT >= 31) {
                            s63Var.t = 1;
                        }
                        s63Var.g = tn2Var.t;
                        notification2.deleteIntent = PendingIntent.getService((MediaLibraryService) x7Var2.p, 86, x7Var2.b(kn2Var, 86).putExtra("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", true), 67108864);
                        s63Var.c(8, true);
                        notification2.icon = yl0Var.e;
                        s63Var.e(eu2Var);
                        s63Var.r = 1;
                        s63Var.c(2, false);
                        s63Var.o = "media3_group_key";
                        lo2Var2.r.execute(new b41(lo2Var2, kn2Var, new rm2(s63Var.a()), this.o, 2));
                        return;
                    }
                    j60 j60Var = (j60) gy3VarF.get(i5);
                    va4 va4Var = j60Var.a;
                    Context context2 = context;
                    int i11 = j60Var.b;
                    int i12 = i5;
                    CharSequence charSequence = j60Var.f;
                    gy3 gy3Var = gy3VarF;
                    int i13 = j60Var.d;
                    boolean z3 = z2;
                    tw1 tw1Var = j60Var.h;
                    lo2 lo2Var3 = lo2Var;
                    ArrayList arrayList = s63Var2.b;
                    if (va4Var != null) {
                        MediaLibraryService mediaLibraryService = (MediaLibraryService) x7Var2.p;
                        rr2.l(va4Var.a == 0);
                        PorterDuff.Mode mode = IconCompat.k;
                        IconCompat iconCompatB = IconCompat.b(mediaLibraryService.getResources(), mediaLibraryService.getPackageName(), i13);
                        String str = va4Var.b;
                        Bundle bundle = va4Var.c;
                        Intent intent = new Intent("androidx.media3.session.CUSTOM_NOTIFICATION_ACTION");
                        intent.setData(tn2Var2.b);
                        intent.setComponent(new ComponentName(mediaLibraryService, mediaLibraryService.getClass()));
                        intent.putExtra("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION", str);
                        intent.putExtra("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION_EXTRAS", bundle);
                        int i14 = x7Var2.o + 1;
                        x7Var2.o = i14;
                        arrayList.add(new q63(iconCompatB, charSequence, PendingIntent.getService(mediaLibraryService, i14, intent, 201326592)));
                    } else {
                        rr2.w(i11 != -1);
                        PorterDuff.Mode mode2 = IconCompat.k;
                        context2.getClass();
                        IconCompat iconCompatB2 = IconCompat.b(context2.getResources(), context2.getPackageName(), i13);
                        long j = i11;
                        MediaLibraryService mediaLibraryService2 = (MediaLibraryService) x7Var2.p;
                        if (j == 8 || j == 9) {
                            i2 = 87;
                        } else if (j == 6 || j == 7) {
                            i2 = 88;
                        } else if (j == 3) {
                            i2 = 86;
                        } else if (j == 12) {
                            i2 = 90;
                        } else if (j == 11) {
                            i2 = 89;
                        } else {
                            i2 = j == 1 ? 85 : 0;
                        }
                        Intent intentB = x7Var2.b(kn2Var, i2);
                        arrayList.add(new q63(iconCompatB2, charSequence, (Build.VERSION.SDK_INT < 26 || j != 1 || kn2Var.a().q()) ? PendingIntent.getService(mediaLibraryService2, i2, intentB, 67108864) : PendingIntent.getForegroundService(mediaLibraryService2, i2, intentB, 67108864)));
                    }
                    int i15 = j60Var.g.getInt("androidx.media3.session.command.COMPACT_VIEW_INDEX", -1);
                    if (i15 < 0 || i15 >= 3) {
                        if (tw1Var.a(0) == 2) {
                            iArr2[0] = i12;
                        } else {
                            if (tw1Var.a(0) == 1) {
                                iArr2[1] = i12;
                            } else if (tw1Var.a(0) == 3) {
                                iArr2[2] = i12;
                            }
                            z2 = z3;
                        }
                        z2 = z3;
                    } else {
                        iArrCopyOf[i15] = i12;
                        z2 = true;
                    }
                    i5 = i12 + 1;
                    iArr = iArr2;
                    context = context2;
                    gy3VarF = gy3Var;
                    lo2Var = lo2Var3;
                    vl2Var = vl2Var;
                    yl0Var2 = yl0Var2;
                    s63Var2 = s63Var2;
                    qi3VarA = qi3VarA;
                    tn2Var2 = tn2Var2;
                }
                break;
            default:
                qs2 qs2Var = (qs2) obj4;
                ju1 ju1Var = (ju1) obj3;
                ms2 ms2Var = (ms2) obj2;
                ja0 ja0Var = (ja0) obj;
                boolean z4 = this.o;
                qs2Var.g.remove(ju1Var);
                try {
                    try {
                        MediaLibraryService mediaLibraryService3 = (MediaLibraryService) qs2Var.e.get();
                        if (mediaLibraryService3 != null) {
                            int i16 = ja0Var.a;
                            int i17 = ja0Var.b;
                            fr2 fr2Var = new fr2(ms2Var, i16, i17, z4, new ft2(ju1Var, i17), ja0Var.e);
                            kn2 kn2VarI = mediaLibraryService3.i(fr2Var);
                            if (kn2VarI != null) {
                                mediaLibraryService3.c(kn2VarI);
                                kn2VarI.a.g.m(ju1Var, fr2Var);
                                return;
                            }
                        }
                    } catch (Exception e2) {
                        l93.r0("MSessionService", "Failed to add a session to session service", e2);
                        break;
                    }
                    au0.k(ju1Var);
                    return;
                } catch (Throwable th) {
                    au0.k(ju1Var);
                    throw th;
                }
        }
    }
}
