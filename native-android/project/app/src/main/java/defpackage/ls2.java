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
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import com.eddyizm.tempus.service.MediaService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ls2 extends ir2 {
    public static final int A = 0;
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
    public final boolean q;
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
        if (Build.VERSION.SDK_INT < 31) goto L5;
        int r0 = 33554432;
    L6:
        A = r0;
        return;
    L5:
        r0 = 0;
        goto L6
    }

    public ls2(tn2 r17, Uri r18, Handler r19, Bundle r20, yw1 r21, yw1 r22, wa4 r23, mi3 r24, Bundle r25) {
        this.g = r17;
        int r3 = 1;
        this.q = true;
        this.w = r21;
        this.x = r22;
        this.y = r23;
        this.z = r24;
        this.v = new Bundle(r25);
        MediaService r6 = r17.f;
        this.h = hg3.E(r6);
        lr0 r4 = new lr0();
        r4.r = this;
        r4.o = do2.K;
        r4.p = "";
        r4.n = -9223372036854775807L;
        this.i = r4;
        na4 r5 = new na4(r17);
        this.f = r5;
        this.r = 300000;
        this.j = new zk(r17.l.getLooper(), r5);
        int r7 = Build.VERSION.SDK_INT;
        if (r7 >= 33) goto L5;
    L4:
        boolean r8 = false;
    L21:
        this.k = r8;
        if (r22.isEmpty() == true) goto L24;
        N();
    L24:
        PackageManager r0 = r6.getPackageManager();
        Intent r9 = new Intent("android.intent.action.MEDIA_BUTTON");
        r9.setPackage(r6.getPackageName());
        List<ResolveInfo> r1 = r0.queryBroadcastReceivers(r9, 0);
        w9 r12 = null;
        if (r1.size() != 1) goto L28;
        ActivityInfo r2 = r1.get(0).activityInfo;
        ComponentName r10 = new ComponentName(r2.packageName, r2.name);
    L30:
        this.o = r10;
        if (r10 == null) goto L36;
        if (r7 < 31) goto L36;
        ComponentName r11 = r10;
    L35:
        boolean r13 = false;
    L43:
        Intent r14 = new Intent("android.intent.action.MEDIA_BUTTON", r18);
        if (r11 != null) goto L50;
        v9 r15 = new v9(7, this);
        this.n = r15;
        IntentFilter r16 = new IntentFilter("android.intent.action.MEDIA_BUTTON");
        String r26 = r18.getScheme();
        String r110 = f35.a;
        r16.addDataScheme(r26);
        if (r7 >= 33) goto L48;
        r6.registerReceiver(r15, r16);
    L49:
        r14.setPackage(r6.getPackageName());
        PendingIntent r27 = PendingIntent.getBroadcast(r6, 0, r14, A);
        r11 = new ComponentName(r6, r6.getClass());
    L58:
        String r28 = TextUtils.join(".", new String[]{"androidx.media3.session.id", r17.i});
        PendingIntent r29 = r27;
        if (r7 < 31) goto L62;
        r11 = null;
    L62:
        if (r7 < 31) goto L65;
        r29 = null;
    L65:
        qr2 r30 = new qr2(r6, r28, r11, r29, r20);
        this.m = r30;
        if (r7 < 31) goto L75;
        if (r10 == null) goto L75;
        MediaSession r31 = ((kr2) r30.o).a;     // Catch: IllegalArgumentException -> L70
        r31.getClass();     // Catch: IllegalArgumentException -> L70
        go2.r(r31, r10);     // Catch: IllegalArgumentException -> L70
    L70:
        e = move-exception;
        if (Build.MANUFACTURER.equals("motorola") == false) goto L74;
        l93.G("MediaSessionLegacyStub", "caught IllegalArgumentException on a motorola device when attempting to set the media button broadcast receiver. See https://github.com/androidx/media/issues/1730 for details.", e);
        goto L75
    L74:
        throw e;
    L75:
        PendingIntent r32 = r17.t;
        if (r32 == null) goto L78;
        ((kr2) this.m.o).a.setSessionActivity(r32);
    L78:
        this.m.u(this, r19);
        if (this.k == false) goto L81;
        r12 = new w9(r6, new es2(this, r3));
    L81:
        this.l = r12;
        return;
    L48:
        rg3.c(r6, r15, r16);
        goto L49
    L50:
        r14.setComponent(r11);
        if (r13 == true) goto L53;
        r27 = PendingIntent.getBroadcast(r6, 0, r14, A);
    L57:
        this.n = null;
        goto L58
    L53:
        if (r7 < 26) goto L55;
        r27 = gm0.e(r6, r14, A);
        goto L57
    L55:
        r27 = PendingIntent.getService(r6, 0, r14, A);
    L36:
        r11 = K(r6, "androidx.media3.session.MediaLibraryService");
        if (r11 != null) goto L39;
        r11 = K(r6, "androidx.media3.session.MediaSessionService");
    L39:
        if (r11 == null) goto L35;
        if (r11.equals(r10) == true) goto L35;
        r13 = true;
        goto L43
    L28:
        if (r1.isEmpty() == false) goto L83;
        r10 = null;
        goto L30
    L83:
        zr2.c(r1.size(), "Expected 1 broadcast receiver that handles android.intent.action.MEDIA_BUTTON, found ");
        throw null;
    L5:
        String r33 = f35.a;
        if (r6.getPackageManager().hasSystemFeature("android.hardware.type.automotive") == true) goto L4;
        String r34 = Build.MANUFACTURER;
        if (r34.equals("Google") == false) goto L11;
    L20:
        r8 = true;
        goto L21
    L11:
        if (r34.equals("motorola") == true) goto L20;
        if (r34.equals("vivo") == true) goto L20;
        if (r34.equals("Sony") == true) goto L20;
        if (r34.equals("Nothing") == true) goto L20;
        if (r34.equals("unknown") == false) goto L4;
        goto L4
    }

    public static void E(qr2 r9, ArrayList r10) {
        int r0 = 0;
        if (r10 == null) goto L10;
        r9.getClass();
        HashSet r1 = new HashSet();
        int r2 = r10.size();
        int r3 = 0;
    L5:
        if (r3 >= r2) goto L10;
        Object r4 = r10.get(r3);
        r3 = r3 + 1;
        long r5 = ((or2) r4).o;
        if (r1.contains(Long.valueOf(r5)) == false) goto L9;
        l93.G("MediaSessionCompat", b11.k("Found duplicate queue id: ", r5), new IllegalArgumentException("id of each queue item should be unique"));
    L9:
        r1.add(Long.valueOf(r5));
    L10:
        kr2 r11 = (kr2) r9.o;
        MediaSession r6 = r11.a;
        r11.h = r10;
        if (r10 != null) goto L14;
        r6.setQueue(null);
        return;
    L14:
        ArrayList r12 = new ArrayList(r10.size());
        int r7 = r10.size();
    L15:
        if (r0 >= r7) goto L21;
        Object r8 = r10.get(r0);
        r0 = r0 + 1;
        or2 r13 = (or2) r8;
        MediaSession.QueueItem r14 = r13.p;
        if (r14 != null) goto L20;
        MediaSession.QueueItem r15 = new MediaSession.QueueItem(r13.n.b(), r13.o);
        r13.p = r15;
        r14 = r15;
    L20:
        r12.add(r14);
        goto L15
    L21:
        r6.setQueue(r12);
    }

    public static void F(qr2 r6, eo2 r7) {
        kr2 r8 = (kr2) r6.o;
        r8.i = r7;
        MediaSession r9 = r8.a;
        Bundle r0 = r7.n;
        if (r7.o != null) goto L32;
        MediaMetadata.Builder r1 = new MediaMetadata.Builder();
        Iterator<String> r2 = r0.keySet().iterator();
    L6:
        if (r2.hasNext() == false) goto L31;
        String r3 = r2.next();
        Integer r4 = (Integer) eo2.q.get(r3);
        if (r4 != null) goto L10;
        r4 = -1;
    L10:
        int r5 = r4.intValue();
        if (r5 != 0) goto L13;
        r1.putLong(r3, r0.getLong(r3));
        goto L6
    L13:
        if (r5 != 1) goto L15;
        r1.putText(r3, r0.getCharSequence(r3));
        goto L6
    L15:
        if (r5 != 2) goto L17;
        r1.putBitmap(r3, (Bitmap) r0.getParcelable(r3));
        goto L6
    L17:
        if (r5 != 3) goto L18;
        r1.putRating(r3, (Rating) r0.getParcelable(r3));
        goto L6
    L18:
        Object r10 = r0.get(r3);
        if (r10 == null) goto L26;
        if ((r10 instanceof CharSequence) == true) goto L26;
        if ((r10 instanceof Long) == false) goto L6;
        r1.putLong(r3, ((Long) r10).longValue());
    L26:
        r1.putText(r3, (CharSequence) r10);
        goto L6
    L31:
        r7.o = r1.build();
    L32:
        r9.setMetadata(r7.o);
    }

    public static gn2 G(String r9, Uri r10, String r11, Bundle r12) {
        um2 r0 = new um2();
        vw1 r1 = yw1.o;
        gy3 r2 = gy3.r;
        List r3 = Collections.EMPTY_LIST;
        gy3 r4 = gy3.r;
        zm2 r5 = new zm2();
        cn2 r6 = cn2.d;
        if (r9 != null) goto L5;
        r9 = "";
    L5:
        String r7 = r9;
        yc5 r13 = new yc5();
        r13.n = r10;
        r13.o = r11;
        r13.p = r12;
        cn2 r8 = new cn2(r13);
        return new gn2(r7, new wm2(r0), null, new an2(r5), do2.K, r8);
    }

    public static ComponentName K(MediaService r2, String r3) {
        PackageManager r0 = r2.getPackageManager();
        Intent r1 = new Intent(r3);
        r1.setPackage(r2.getPackageName());
        List<ResolveInfo> r4 = r0.queryIntentServices(r1, 0);
        if (r4 != null) goto L5;
        return null;
    L5:
        if (r4.isEmpty() == true) goto L11;
        ServiceInfo r5 = r4.get(0).serviceInfo;
        return new ComponentName(r5.packageName, r5.name);
    L11:
        return null;
    }

    @Override // defpackage.ir2
    public final void A() {
        boolean r0 = this.g.s.S0(7);
        qr2 r3 = this.m;
        if (r0 == false) goto L6;
        I(7, new bs2(this, 2), ((kr2) r3.o).b(), true);
        return;
    L6:
        I(6, new bs2(this, 3), ((kr2) r3.o).b(), true);
    }

    @Override // defpackage.ir2
    public final void B(long r3) {
        if (r3 >= 0) goto L5;
        return;
    L5:
        I(10, new cs2(this, r3, 0), ((kr2) this.m.o).b(), true);
    }

    @Override // defpackage.ir2
    public final void C() {
        I(3, new bs2(this, 7), ((kr2) this.m.o).b(), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r23v2 */
    public final ei3 H(al3 r33) {
        bk r2 = this.u;
        Bundle r3 = this.v;
        if (r2 != null) goto L5;
    L8:
        PlaybackException r4 = r33.U();
        int r7 = 1;
        if (r33.S0(16) == true) goto L11;
    L13:
        boolean r5 = false;
    L14:
        if (r4 == null) goto L16;
    L19:
        boolean r8 = true;
    L20:
        ei3 r9 = null;
        int r10 = 7;
        if (r4 == null) goto L23;
    L22:
        int r14 = r10;
        mi3 r11 = ju2.d(this.z, r33.o());
        long r15 = 128;
        int r13 = 0;
    L44:
        if (r13 >= r11.a.a.size()) goto L70;
        int r6 = r11.a.b(r13);
        if (r6 == r7) goto L65;
        if (r6 == 2) goto L64;
        if (r6 != 3) goto L50;
        long r12 = 1;
    L68:
        r15 = r15 | r12;
        r13 = r13 + 1;
        r7 = 1;
        goto L44
    L50:
        if (r6 == 31) goto L62;
        switch(r6) {
            case 5: goto L61;
            case 6: goto L60;
            case 7: goto L60;
            case 8: goto L59;
            case 9: goto L59;
            case 10: goto L58;
            case 11: goto L57;
            case 12: goto L56;
            case 13: goto L55;
            case 14: goto L54;
            case 15: goto L53;
            default: goto L52;
        };
    L52:
        r12 = 0;
        goto L68
    L53:
        r12 = 262144;
        goto L68
    L54:
        r12 = 2621440;
        goto L68
    L55:
        r12 = 4194304;
        goto L68
    L56:
        r12 = 64;
        goto L68
    L57:
        r12 = 8;
        goto L68
    L58:
        r12 = 4096;
        goto L68
    L59:
        r12 = 32;
        goto L68
    L60:
        r12 = 16;
        goto L68
    L61:
        r12 = 256;
        goto L68
    L62:
        r12 = 240640;
        goto L68
    L64:
        r12 = 16384;
        goto L68
    L65:
        if (r8 == false) goto L67;
        r12 = 516;
        goto L68
    L67:
        r12 = 514;
        goto L68
    L70:
        if (this.x.isEmpty() == true) goto L75;
        if (j60.c(this.w, 2) == false) goto L75;
        r15 = r15 & (-17);
    L75:
        if (this.x.isEmpty() == false) goto L77;
    L79:
        if (r5 == true) goto L81;
        r15 = r15 & (-257);
    L81:
        long r20 = r15;
        if (r33.S0(17) == false) goto L88;
        int r16 = r33.o0();
        jx1 r17 = f92.a;
        if (r16 != (-1)) goto L86;
        long r18 = -1;
    L87:
        long r27 = r18;
    L89:
        float r19 = r33.i().a;
        if (r33.h0() == false) goto L93;
        if (r5 == false) goto L93;
        float r110 = r19;
    L95:
        if (r4 == null) goto L97;
        Bundle r21 = new Bundle(r4.p);
    L98:
        if (r4 != null) goto L101;
        if (r2 == null) goto L101;
        r21.putAll((Bundle) r2.r);
    L101:
        r21.putAll(r3);
        r21.putFloat("EXO_SPEED", r19);
        gn2 r22 = r33.Y0();
        if (r22 == null) goto L106;
        String r23 = r22.a;
        if ("".equals(r23) == true) goto L106;
        r21.putString("androidx.media.PlaybackStateCompat.Extras.KEY_MEDIA_ID", r23);
    L106:
        if (r5 == false) goto L108;
        long r111 = r33.M0();
    L109:
        if (r5 == false) goto L111;
        long r112 = r33.b0();
    L112:
        ArrayList r1 = new ArrayList();
        long r24 = SystemClock.elapsedRealtime();
        int r25 = 0;
    L114:
        if (r25 >= this.w.size()) goto L166;
        j60 r26 = (j60) this.w.get(r25);
        va4 r28 = r26.a;
        Uri r113 = r26.e;
        ei3 r29 = r9;
        int r30 = r26.c;
        Bundle r31 = r26.g;
        int r210 = r25;
        if (r28 == null) goto L164;
        Bundle r32 = r28.c;
        Bundle r211 = r21;
        String r34 = r28.b;
        long r35 = r111;
        if (r26.i == false) goto L165;
        if (r28.a != 0) goto L165;
        wa4 r114 = this.y;
        if (r28 != null) goto L124;
    L127:
        int r36 = r26.b;
        if (r36 == (-1)) goto L133;
        if (r11.a(r36) == false) goto L133;
    L134:
        if (r30 == 0) goto L136;
        boolean r37 = true;
    L137:
        if (r113 == null) goto L139;
        boolean r115 = true;
    L140:
        if (r37 == true) goto L144;
        if (r115 == true) goto L144;
        if (r31.isEmpty() == false) goto L144;
    L146:
        if (r31.isEmpty() == true) goto L148;
        r32.putAll(r31);
    L148:
        if (r37 == false) goto L150;
        r32.putInt("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_COMPAT", r30);
    L150:
        if (r115 == false) goto L152;
        r113.getClass();
        r32.putString("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_URI_COMPAT", r113.toString());
    L152:
        CharSequence r38 = r26.f;
        int r39 = r26.d;
        if (TextUtils.isEmpty(r34) == true) goto L162;
        if (TextUtils.isEmpty(r38) == true) goto L160;
        if (r39 == 0) goto L158;
        r1.add(new di3(r34, r38, r39, r32));
        goto L165
    L158:
        kf2.n("You must specify an icon resource id to build a CustomAction");
        return r29;
    L160:
        kf2.n("You must specify a name to build a CustomAction");
        return r29;
    L162:
        kf2.n("You must specify an action to build a CustomAction");
        return r29;
    L144:
        r32 = new Bundle(r32);
        goto L146
    L139:
        r115 = false;
        goto L140
    L136:
        r37 = false;
    L133:
        if (j60.n(r34) == false) goto L165;
    L124:
        if (r114.a.contains(r28) == true) goto L134;
    L165:
        r25 = r210 + 1;
        r9 = r29;
        r21 = r211;
        r111 = r35;
        goto L114
    L164:
        r211 = r21;
        r35 = r111;
        goto L165
    L166:
        Bundle r212 = r21;
        ei3 r213 = r9;
        long r310 = r111;
        if (r4 == null) goto L170;
        jx1 r0 = f92.a;
        int r40 = f92.g(r4.n);
        String r41 = r4.getMessage();
    L169:
        int r214 = r40;
        ?? r215 = r41;
    L174:
        return new ei3(r14, r310, r112, r110, r20, r214, r215, r24, r1, r27, r212);
    L170:
        if (r2 == null) goto L172;
        r40 = r2.o;
        r41 = (String) r2.q;
        goto L169
    L172:
        r215 = r213;
        r214 = 0;
        goto L174
    L111:
        r112 = -1;
        goto L112
    L108:
        r111 = -1;
        goto L109
    L97:
        r21 = new Bundle();
    L93:
        r110 = 0.0f;
        goto L95
    L86:
        r18 = r16;
        goto L87
    L88:
        r27 = -1;
        goto L89
    L77:
        if (j60.c(this.w, 3) == false) goto L79;
        r15 = r15 & (-33);
        goto L79
    L23:
        jx1 r116 = f92.a;
        if (r33.U() != null) goto L22;
        int r117 = r33.g();
        if (r117 == 1) goto L41;
        if (r117 == 2) goto L38;
        if (r117 != 3) goto L31;
        if (r8 == false) goto L37;
    L36:
        r10 = 2;
        goto L22
    L37:
        r10 = 3;
        goto L22
    L31:
        if (r117 != 4) goto L33;
        r10 = 1;
        goto L22
    L33:
        kf2.n(f34.f(r117, "Unrecognized State: "));
        return null;
    L38:
        if (r8 == true) goto L36;
        r10 = 6;
        goto L22
    L41:
        r10 = 0;
        goto L22
    L16:
        if (f35.d0(r33, this.q) == true) goto L19;
        r8 = false;
        goto L20
    L11:
        if (r33.V0() == true) goto L13;
        r5 = true;
        goto L14
    L5:
        if (r2.p == false) goto L8;
        new Bundle((Bundle) r2.r).putAll(r3);
        ArrayList r118 = new ArrayList();
        long r119 = SystemClock.elapsedRealtime();
        int r120 = r2.o;
        String r121 = (String) r2.q;
        r121.getClass();
        return new ei3(7, -1, 0, 0.0f, 0, r120, r121, r119, r118, -1, (Bundle) r2.r);
    }

    public final void I(final int r8, final ks2 r9, final ms2 r10, final boolean r11) {
        tn2 r0 = this.g;
        if (r0.l() == false) goto L5;
        return;
    L5:
        if (r10 != null) goto L8;
        l93.A("MediaSessionLegacyStub", "RemoteUserInfo is null, ignoring command=" + r8);
        return;
    L8:
        f35.W(r0.l, new as2(this, r8, r10, r9, r11));
    }

    public final void J(va4 r8, int r9, ks2 r10, ms2 r11) {
        if (r11 != null) goto L8;
        StringBuilder r7 = new StringBuilder("RemoteUserInfo is null, ignoring command=");
        Object r12 = r8;
        if (r8 != null) goto L6;
        r12 = Integer.valueOf(r9);
    L6:
        r7.append(r12);
        l93.A("MediaSessionLegacyStub", r7.toString());
        return;
    L8:
        f35.W(this.g.l, new fm2(this, r8, r9, r11, r10));
    }

    public final void L(gn2 r2, boolean r3, boolean r4) {
        I(31, new tr2(this, r2, r3, r4), ((kr2) this.m.o).b(), false);
    }

    public final fr2 M(ms2 r9) {
        fr2 r0 = this.f.w(r9);
        if (r0 != null) goto L11;
        js2 r6 = new js2(r9);
        fr2 r1 = new fr2(r9, 0, 0, this.h.G(r9), r6, Bundle.EMPTY);
        dr2 r10 = this.g.p(r1);
        this.f.a(r9, r1, r10.a, r10.b);
        tn2 r11 = this.g;
        if (r11.y == true) goto L7;
    L9:
        r11.e.getClass();
    L10:
        r0 = r1;
        goto L11
    L7:
        if (tn2.m(r1) == false) goto L9;
    L11:
        zk r12 = this.j;
        long r2 = this.r;
        r12.removeMessages(1001, r0);
        r12.sendMessageDelayed(r12.obtainMessage(1001, r0), r2);
        return r0;
    }

    public final void N() {
        boolean r1 = true;
        this.w = j60.j(j60.g(this.x, this.y, this.z), true, true);
        boolean r0 = this.k;
        Bundle r5 = this.v;
        if (r0 == false) goto L10;
        w9 r2 = this.l;
        if (r2 == null) goto L13;
        if (r2.e.get() == true) goto L10;
    L13:
        if (this.w.isEmpty() == false) goto L15;
    L17:
        r1 = false;
    L18:
        r5.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", r1);
        r5.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
        return;
    L15:
        if (j60.c(this.w, 2) == true) goto L17;
    L10:
        r5.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", !j60.c(this.w, 2));
        r5.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", !j60.c(this.w, 3));
    }

    public final void O() {
        Bundle r0 = this.v;
        boolean r3 = r0.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
        boolean r5 = r0.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
        N();
        if (r0.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false) == r3) goto L5;
    L8:
        ((kr2) this.m.o).a.setExtras(r0);
        return;
    L5:
        if (r0.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false) != r5) goto L8;
    }

    public final void P(al3 r4) {
        f35.W(this.g.l, new ds2(this, r4, 1));
    }

    @Override // defpackage.ir2
    public final void c(pm2 r4) {
        if (r4 == null) goto L5;
        int r2 = -1;
        I(20, new vl2(this, r4, r2, 3), ((kr2) this.m.o).b(), false);
        return;
    }

    @Override // defpackage.ir2
    public final void d(pm2 r3, int r4) {
        if (r3 != null) goto L4;
        return;
    L4:
        if (r4 == (-1)) goto L7;
        if (r4 >= 0) goto L7;
        return;
    L7:
        I(20, new vl2(this, r3, r4, 3), ((kr2) this.m.o).b(), false);
    }

    @Override // defpackage.ir2
    public final void e(String r9, Bundle r10, ResultReceiver r11) {
        if (r9.equals("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST") == false) goto L6;
        return;
    L6:
        if (r9.equals("androidx.media3.session.SESSION_COMMAND_REQUEST_SESSION3_TOKEN") == false) goto L10;
        if (r11 == null) goto L10;
        r11.send(0, this.g.j.b());
        return;
    L10:
        va4 r4 = new va4(r9, Bundle.EMPTY);
        J(r4, 0, new dg0(this, r4, r10, r11, 6), ((kr2) this.m.o).b());
    }

    @Override // defpackage.ir2
    public final void f(String r7, Bundle r8) {
        if (r7.equals("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST") == false) goto L5;
        return;
    L5:
        if (r8 != null) goto L8;
        r8 = Bundle.EMPTY;
    L8:
        va4 r0 = new va4(r7, r8);
        boolean r1 = j60.n(r7);
        qr2 r2 = this.m;
        boolean r3 = false;
        if (r1 == true) goto L45;
        J(r0, 0, new eg0(this, r0, r8, 7), ((kr2) r2.o).b());
        return;
    L45:
        j60 r4 = j60.d(r0);     // Catch: RuntimeException -> L40
        int r5 = r4.b;
        Object r6 = r4.j;
        if (r4.b() == true) goto L16;
        l93.q0("MediaSessionLegacyStub", "Can't execute predefined custom command: ".concat(r7));
        return;
    L16:
        va4 r9 = r4.a;
        if (r9 != null) goto L19;
        al3 r10 = this.g.s;
        if (r5 == 1) goto L26;
    L25:
        boolean r11 = false;
    L31:
        if (r11 == false) goto L35;
        I(1, new bs2(this, 5), ((kr2) r2.o).b(), false);
        return;
    L35:
        if (r5 != 31) goto L38;
        r6.getClass();
        L((gn2) r6, false, false);
        return;
    L38:
        I(r5, new ef0(21, this, r4), ((kr2) r2.o).b(), true);
        return;
    L26:
        if (r6 == null) goto L28;
        r11 = ((Boolean) r6).booleanValue();
        goto L31
    L28:
        if (r10.q() == true) goto L25;
        r11 = true;
        goto L31
    L19:
        if (r9.a != 40010) goto L21;
        r3 = true;
    L21:
        rr2.w(r3);
        r6.getClass();
        J(null, 40010, new ef0(20, this, (lu3) r6), ((kr2) r2.o).b());
        return;
    L40:
        e = move-exception;
        l93.r0("MediaSessionLegacyStub", "Failed to convert predefined custom command: " + r0.b, e);
    }

    @Override // defpackage.ir2
    public final void g() {
        I(12, new bs2(this, 10), ((kr2) this.m.o).b(), true);
    }

    @Override // defpackage.ir2
    public final boolean h(Intent r8) {
        ms2 r1 = ((kr2) this.m.o).b();
        r1.getClass();
        fr2 r0 = new fr2(r1, 0, 0, false, null, Bundle.EMPTY);
        return this.g.t(r0, r8);
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
    public final void k(String r2, Bundle r3) {
        L(G(r2, null, null, r3), true, true);
    }

    @Override // defpackage.ir2
    public final void l(String r2, Bundle r3) {
        L(G(null, null, r2, r3), true, true);
    }

    @Override // defpackage.ir2
    public final void m(Uri r2, Bundle r3) {
        L(G(null, r2, null, r3), true, true);
    }

    @Override // defpackage.ir2
    public final void n() {
        I(2, new bs2(this, 6), ((kr2) this.m.o).b(), true);
    }

    @Override // defpackage.ir2
    public final void o(String r2, Bundle r3) {
        L(G(r2, null, null, r3), true, false);
    }

    @Override // defpackage.ir2
    public final void p(String r2, Bundle r3) {
        L(G(null, null, r2, r3), true, false);
    }

    @Override // defpackage.ir2
    public final void q(Uri r2, Bundle r3) {
        L(G(null, r2, null, r3), true, false);
    }

    @Override // defpackage.ir2
    public final void r(pm2 r4) {
        if (r4 != null) goto L4;
        return;
    L4:
        I(20, new ef0(22, this, r4), ((kr2) this.m.o).b(), true);
    }

    @Override // defpackage.ir2
    public final void s() {
        I(11, new bs2(this, 4), ((kr2) this.m.o).b(), true);
    }

    @Override // defpackage.ir2
    public final void t(long r3) {
        I(5, new cs2(this, r3, 1), ((kr2) this.m.o).b(), true);
    }

    @Override // defpackage.ir2
    public final void u(float r4) {
        if (r4 > 0.0f) goto L5;
        return;
    L5:
        I(13, new rl2(this, r4, 3), ((kr2) this.m.o).b(), true);
    }

    @Override // defpackage.ir2
    public final void v(mu3 r1) {
        w(r1);
    }

    @Override // defpackage.ir2
    public final void w(mu3 r4) {
        lu3 r0 = f92.q(r4);
        if (r0 != null) goto L6;
        l93.q0("MediaSessionLegacyStub", "Ignoring invalid RatingCompat " + r4);
        return;
    L6:
        J(null, 40010, new ef0(20, this, r0), ((kr2) this.m.o).b());
    }

    @Override // defpackage.ir2
    public final void x(int r4) {
        I(15, new fs2(this, r4, 0), ((kr2) this.m.o).b(), true);
    }

    @Override // defpackage.ir2
    public final void y(int r4) {
        I(14, new fs2(this, r4, 1), ((kr2) this.m.o).b(), true);
    }

    @Override // defpackage.ir2
    public final void z() {
        boolean r0 = this.g.s.S0(9);
        qr2 r3 = this.m;
        if (r0 == false) goto L6;
        I(9, new bs2(this, 8), ((kr2) r3.o).b(), true);
        return;
    L6:
        I(8, new bs2(this, 9), ((kr2) r3.o).b(), true);
    }
}
