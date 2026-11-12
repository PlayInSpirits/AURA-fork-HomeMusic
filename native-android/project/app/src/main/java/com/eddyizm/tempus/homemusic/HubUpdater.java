package com.eddyizm.tempus.homemusic;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import app.homemusic.AURAVersion;
import app.homemusic.R;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import defpackage.a71;
import defpackage.b11;
import defpackage.bb3;
import defpackage.be0;
import defpackage.bs1;
import defpackage.bv3;
import defpackage.c25;
import defpackage.d25;
import defpackage.e90;
import defpackage.f9;
import defpackage.fr1;
import defpackage.gm0;
import defpackage.gr1;
import defpackage.h12;
import defpackage.io1;
import defpackage.j15;
import defpackage.jp1;
import defpackage.k14;
import defpackage.kd3;
import defpackage.kf2;
import defpackage.mj0;
import defpackage.mr;
import defpackage.n14;
import defpackage.n83;
import defpackage.nz3;
import defpackage.o83;
import defpackage.oz3;
import defpackage.pm;
import defpackage.pt1;
import defpackage.q05;
import defpackage.qm4;
import defpackage.qt1;
import defpackage.r72;
import defpackage.rn1;
import defpackage.rp4;
import defpackage.rr1;
import defpackage.rt1;
import defpackage.s14;
import defpackage.sr0;
import defpackage.st1;
import defpackage.ti;
import defpackage.u01;
import defpackage.up;
import defpackage.ux3;
import defpackage.vg2;
import defpackage.wf1;
import defpackage.xa3;
import defpackage.z61;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class HubUpdater {
    public static final int $stable = 0;
    public static final HubUpdater INSTANCE = null;
    private static final String KEY_SKIPPED = "skipped_version";
    private static final String PREFS = "homemusic_updater";
    private static final String TAG = "HubUpdater";
    private static WeakReference<Activity> autoCheckFor;
    private static final AtomicBoolean downloading = null;
    private static final r72 updateHttp$delegate = null;

    static {
        INSTANCE = new HubUpdater();
        downloading = new AtomicBoolean(false);
        updateHttp$delegate = new rp4(new e90(19));
        $stable = 8;
    }

    private HubUpdater() {
    }

    public static /* synthetic */ void a(long r0, LinearProgressIndicator r2, TextView r3, long r4, HubUpdater r6, Activity r7) {
        download$lambda$0$0$0$0(r0, r2, r3, r4, r6, r7);
    }

    public static /* synthetic */ j15 b(long r2, LinearProgressIndicator r4, TextView r5, long r6, HubUpdater r8, Activity r9) {
        return download$lambda$0$0$0(r4, r5, r8, r9, r2, r6);
    }

    public static /* synthetic */ void c(Activity r0, HubAppRelease r1, HubUpdatePatch r2, DialogInterface r3, int r4) {
        offer$lambda$2(r0, r1, r2, r3, r4);
    }

    public static final void check(Activity r3, boolean r4) {
        r3.getClass();
        if (r4 == false) goto L5;
        Toast.makeText(r3, R.string.homemusic_update_checking, 0).show();
    L5:
        io1.a.execute(new pm(r3, r4, 2));
    }

    private static final void check$lambda$0(Activity r9, boolean r10) {
        HubAppRelease r0 = rr1.n();     // Catch: Throwable -> L9
        File r1 = new File(r9.getApplicationInfo().sourceDir);     // Catch: Throwable -> L9
        Object r2 = null;
        if (r0 == null) goto L35;
        long r3 = r0.getVersionCode();     // Catch: Throwable -> L9
        long r5 = AURAVersion.versionCode(r9);     // Catch: Throwable -> L9
        if (r3 <= r5) goto L35;
        List<HubUpdatePatch> r4 = r0.getPatches();     // Catch: Throwable -> L9
        if (r4 != null) goto L12;
        r4 = u01.n;     // Catch: Throwable -> L9
    L12:
        if (r4.isEmpty() == true) goto L35;
        Iterator<T> r6 = r4.iterator();     // Catch: Throwable -> L9
    L16:
        if (r6.hasNext() == false) goto L35;
        HubUpdatePatch r7 = (HubUpdatePatch) r6.next();     // Catch: Throwable -> L9
        if (r7.getBaseVersionCode() != r5) goto L16;
        if (h12.c(r7.getFormat(), "bsdiff40-v1") == false) goto L16;
        long r8 = r1.length();     // Catch: Throwable -> L9
        if (1 > r8) goto L35;
        if (r8 >= 33554433) goto L35;
        Object r11 = d25.c(r0, d25.d(r1));     // Catch: Throwable -> L28
    L31:
        if ((r11 instanceof s14) == true) goto L34;
        r2 = r11;
    L34:
        r2 = (HubUpdatePatch) r2;     // Catch: Throwable -> L9
    L28:
        th = move-exception;
        r11 = new s14(th);     // Catch: Throwable -> L9
    L35:
        Object r12 = new kd3(r0, r2);     // Catch: Throwable -> L9
    L38:
        io1.b.post(new bs1(r9, r10, r12, 3));
        return;
    L9:
        th = move-exception;
        r12 = new s14(th);
        goto L38
    }

    private static final void check$lambda$0$1(Activity r8, boolean r9, Object r10) {
        if (r8.isFinishing() == false) goto L5;
    L33:
        if (r9 == true) goto L38;
        autoCheckFor = null;
        return;
    L38:
        return;
    L5:
        if (r8.isDestroyed() == true) goto L33;
        Throwable r0 = bb3.a(r10);
        boolean r2 = true;
        if (r0 == null) goto L15;
        Log.d(TAG, "Update check failed: " + r0.getMessage());
        if (r9 == false) goto L15;
        String r1 = r0.getMessage();
        if (r1 != null) goto L14;
        r1 = "";
    L14:
        Toast.makeText(r8, r8.getString(R.string.homemusic_update_failed, new Object[]{r1}), 1).show();
    L15:
        boolean r3 = false;
        if ((r10 instanceof s14) == true) goto L29;
        kd3 r11 = (kd3) r10;
        HubAppRelease r4 = (HubAppRelease) r11.n;
        HubUpdatePatch r12 = (HubUpdatePatch) r11.o;
        if (r4 != null) goto L20;
    L25:
        if (r9 == false) goto L27;
        Toast.makeText(r8, r8.getString(R.string.homemusic_update_latest, new Object[]{AURAVersion.versionName(r8)}), 0).show();
    L27:
        r2 = false;
    L28:
        r3 = r2;
        goto L29
    L20:
        if (r4.getVersionCode() <= AURAVersion.versionCode(r8)) goto L25;
        if (r9 == false) goto L23;
    L24:
        INSTANCE.offer(r8, r4, r12, r9);
        goto L28
    L23:
        if (INSTANCE.prefs(r8).getLong(KEY_SKIPPED, -1) == r4.getVersionCode()) goto L27;
    L29:
        if (r9 == true) goto L36;
        if (r3 == true) goto L37;
        autoCheckFor = null;
        return;
    L37:
        return;
    }

    public static final void checkOnStart(Activity r2) {
        r2.getClass();
        WeakReference<Activity> r0 = autoCheckFor;
        if (r0 == null) goto L5;
        Activity r1 = r0.get();
    L6:
        if (r1 != null) goto L8;
    L12:
        autoCheckFor = new WeakReference(r2);
        check(r2, false);
        return;
    L8:
        if (r1.isFinishing() == true) goto L12;
        if (r1.isDestroyed() == true) goto L12;
        return;
    L5:
        r1 = null;
        goto L6
    }

    public static /* synthetic */ void d(Activity r0, HubAppRelease r1, DialogInterface r2, int r3) {
        download$lambda$0$1$1$0(r0, r1, r2, r3);
    }

    private final void download(Activity r11, HubAppRelease r12, HubUpdatePatch r13) {
        if (Build.VERSION.SDK_INT < 26) goto L13;
        if (gm0.w(r11.getPackageManager()) == true) goto L13;
        Toast.makeText(r11, R.string.homemusic_update_allow_install, 1).show();
        r11.startActivity(new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + r11.getPackageName())));     // Catch: ActivityNotFoundException -> L9
        return;
    L9:
        e = move-exception;
        Log.w(TAG, "No unknown-sources settings screen", e);
        return;
    L13:
        if (downloading.compareAndSet(false, true) == true) goto L15;
        return;
    L15:
        View r10 = LayoutInflater.from(r11).inflate(R.layout.dialog_hub_update_progress, null);
        LinearProgressIndicator r6 = (LinearProgressIndicator) r10.findViewById(R.id.hub_update_progress);
        TextView r7 = (TextView) r10.findViewById(R.id.hub_update_progress_text);
        vg2 r1 = new vg2(r11, 0);
        r1.p(R.string.homemusic_update_downloading);
        vg2 r14 = r1.q(r10);
        r14.a.m = false;
        io1.a.execute(new up(r11, r12, r13, r6, r7, r14.h(), 5));
    }

    private static final void download$lambda$0(Activity r10, HubAppRelease r11, HubUpdatePatch r12, LinearProgressIndicator r13, TextView r14, f9 r15) {
        HubUpdater r2 = INSTANCE;
        rt1 r6 = new rt1(r13, r14, r2, r10);     // Catch: Throwable -> L6
        Context r0 = r10.getApplicationContext();     // Catch: Throwable -> L6 Exception -> L8
        r0.getClass();     // Catch: Throwable -> L6 Exception -> L8
        Object r1 = r2.fetchApk(r0, r11, r12, r6);     // Catch: Throwable -> L6 Exception -> L8
    L24:
        downloading.set(false);
        io1.b.post(new mr(r15, r10, r1, r12, r11, 4));
        return;
    L8:
        e = move-exception;
        ux3 r7 = d25.a;     // Catch: Throwable -> L6
        if (r12 == null) goto L12;
        boolean r8 = true;
    L13:
        boolean r9 = jp1.b();     // Catch: Throwable -> L6
        c25 r16 = c25.o;
        if (r8 == true) goto L17;
        c25 r17 = c25.n;     // Catch: Throwable -> L6
    L20:
        if (r17 != r16) goto L22;
        Log.w(TAG, "Patch failed, downloading the full APK: " + e.getMessage());     // Catch: Throwable -> L6
        Context r3 = r10.getApplicationContext();     // Catch: Throwable -> L6
        r3.getClass();     // Catch: Throwable -> L6
        r1 = r2.fetchApk(r3, r11, null, r6);     // Catch: Throwable -> L6
        goto L24
    L22:
        throw e;     // Catch: Throwable -> L6
    L17:
        if (r9 == false) goto L19;
        r17 = c25.p;     // Catch: Throwable -> L6
        goto L20
    L19:
        r17 = r16;
        goto L20
    L12:
        r8 = false;
    L6:
        th = move-exception;
        r1 = new s14(th);
        goto L24
    }

    private static final j15 download$lambda$0$0$0(final LinearProgressIndicator r10, final TextView r11, final HubUpdater r12, final Activity r13, final long r14, final long r16) {
        io1.b.post(new pt1(r14, r10, r11, r16, r12, r13));
        return j15.a;
    }

    private static final void download$lambda$0$0$0$0(long r4, LinearProgressIndicator r6, TextView r7, long r8, HubUpdater r10, Activity r11) {
        if (r4 >= 0) goto L7;
        r6.setIndeterminate(true);
        r7.setText(R.string.homemusic_update_preparing);
        return;
    L7:
        if (r8 <= 0) goto L10;
        r6.setIndeterminate(false);
        r6.b((int) ((100 * r4) / r8), true);
        r7.setText(r10.updateSize(r11, r4) + " из " + r10.updateSize(r11, r8));
        return;
    L10:
        r7.setText(r10.updateSize(r11, r4));
    }

    private static final void download$lambda$0$1(f9 r3, Activity r4, Object r5, HubUpdatePatch r6, HubAppRelease r7) {
        if (r3.isShowing() == false) goto L6;
        r3.dismiss();
    L6:
        if (r4.isFinishing() == false) goto L8;
        return;
    L8:
        if (r4.isDestroyed() == false) goto L11;
        return;
    L11:
        if ((r5 instanceof s14) == true) goto L13;
        INSTANCE.install(r4, (File) r5);
    L13:
        Throwable r8 = bb3.a(r5);
        if (r8 == null) goto L38;
        ux3 r9 = d25.a;
        int r10 = 0;
        if (r6 == null) goto L18;
        boolean r11 = true;
    L19:
        boolean r1 = jp1.b();
        c25 r2 = c25.p;
        if (r11 == true) goto L22;
        c25 r12 = c25.n;
    L25:
        if (r12 != r2) goto L32;
        HubUpdateFile r13 = r7.getFull();
        if (r13 == null) goto L29;
        long r0 = r13.getSize();
    L30:
        vg2 r14 = new vg2(r4, 0);
        r14.a.f = r4.getString(R.string.homemusic_update_full_fallback, new Object[]{INSTANCE.updateSize(r4, r0)});
        r14.l(R.string.homemusic_update_full_download, new qt1(r4, r7, r10)).j(R.string.homemusic_update_later, null).h();
        return;
    L29:
        r0 = r7.getSize();
        goto L30
    L32:
        String r15 = r8.getMessage();
        if (r15 != null) goto L35;
        r15 = "";
    L35:
        Toast.makeText(r4, r4.getString(R.string.homemusic_update_failed, new Object[]{r15}), 1).show();
        return;
    L22:
        if (r1 == false) goto L24;
        r12 = r2;
        goto L25
    L24:
        r12 = c25.o;
        goto L25
    L18:
        r11 = false;
        goto L19
    }

    private static final void download$lambda$0$1$1$0(Activity r0, HubAppRelease r1, DialogInterface r2, int r3) {
        INSTANCE.download(r0, r1, null);
    }

    public static /* synthetic */ void e(Activity r0, boolean r1, Serializable r2) {
        check$lambda$0$1(r0, r1, r2);
    }

    public static /* synthetic */ void f(f9 r0, Activity r1, Object r2, HubUpdatePatch r3, HubAppRelease r4) {
        download$lambda$0$1(r0, r1, r2, r3, r4);
    }

    private final File fetchApk(Context r31, HubAppRelease r32, HubUpdatePatch r33, wf1 r34) {
        HubUpdateFile r2 = r32.getFull();
        if (r2 != null) goto L5;
    L7:
        r2 = null;
    L8:
        if (r33 == null) goto L10;
        HubUpdateFile r4 = r33;
    L12:
        if (r4 == null) goto L15;
        String r6 = r4.getUrl();
        if (r6 == null) goto L15;
    L17:
        if (r4 == null) goto L19;
    L25:
        if (r33 == null) goto L27;
        long r10 = 16777216;
    L28:
        if (r4 == null) goto L30;
        long r12 = r4.getSize();
    L31:
        if (r4 == null) goto L34;
        String r5 = r4.getSha256();
        if (r5 == null) goto L34;
    L35:
        File r7 = new File(r31.getCacheDir(), "updates");
        r7.mkdirs();
        File[] r14 = r7.listFiles();
        if (r14 == null) goto L46;
        ArrayList r8 = new ArrayList();
        int r9 = r14.length;
        int r15 = 0;
    L38:
        if (r15 >= r9) goto L43;
        File r3 = r14[r15];
        if ((System.currentTimeMillis() - r3.lastModified()) <= 86400000) goto L42;
        r8.add(r3);
    L42:
        r15 = r15 + 1;
        goto L38
    L43:
        int r11 = r8.size();
        int r13 = 0;
    L44:
        if (r13 >= r11) goto L46;
        Object r16 = r8.get(r13);
        r13 = r13 + 1;
        ((File) r16).delete();
    L46:
        File r17 = File.createTempFile("download-", ".tmp", r7);
        File r18 = File.createTempFile("update-", ".apk", r7);
        String r19 = rr1.c() + "/";     // Catch: Throwable -> L103 Exception -> L105
        fr1 r20 = new fr1();     // Catch: Throwable -> L103 Exception -> L105
        r20.e(null, r19);     // Catch: Throwable -> L103 Exception -> L105
        gr1 r21 = r20.b();     // Catch: Throwable -> L103 Exception -> L105
        fr1 r22 = new fr1();     // Catch: IllegalArgumentException -> L50 Throwable -> L103 Exception -> L105
        r22.e(r21, r6);     // Catch: IllegalArgumentException -> L50 Throwable -> L103 Exception -> L105
    L51:
        if (r22 == null) goto L53;
        gr1 r23 = r22.b();     // Catch: Throwable -> L103 Exception -> L105
    L54:
        if (r23 == null) goto L207;
        o83 r24 = getUpdateHttp();     // Catch: Throwable -> L103 Exception -> L105
        nz3 r25 = new nz3();     // Catch: Throwable -> L103 Exception -> L105
        r25.a = r23;     // Catch: Throwable -> L103 Exception -> L105
        oz3 r26 = new oz3(r25);     // Catch: Throwable -> L103 Exception -> L105
        r24.getClass();     // Catch: Throwable -> L103 Exception -> L105
        k14 r27 = new bv3(r24, r26).c();     // Catch: Throwable -> L103 Exception -> L105
    L91:
        th = move-exception;
        throw th;     // Catch: Throwable -> L203
    L203:
        th = move-exception;
        q05.h(r27, th);     // Catch: Throwable -> L103 Exception -> L105
        throw th;     // Catch: Throwable -> L103 Exception -> L105
    L57:
        if (r27.C == false) goto L201;
        n14 r28 = r27.t;     // Catch: Throwable -> L91
        if (r28 == null) goto L199;
        if (r28.contentLength() > r10) goto L197;
        InputStream r29 = r28.byteStream();     // Catch: Throwable -> L91
        r17.getClass();     // Catch: Throwable -> L186
        FileOutputStream r30 = new FileOutputStream(r17);     // Catch: Throwable -> L186
        byte[] r110 = new byte[65536];     // Catch: Throwable -> L79
        long r210 = 0;
        long r211 = 0;
    L67:
        int r111 = r29.read(r110);     // Catch: Throwable -> L79
        if (r111 < 0) goto L83;
        long r212 = r10;
        r210 = r210 + ((long) r111);     // Catch: Throwable -> L79
        if (r210 > r212) goto L82;
        if (r12 > 0) goto L74;
    L75:
        r30.write(r110, 0, r111);     // Catch: Throwable -> L79
        if ((r210 - r211) < 262144) goto L78;
        r34.invoke(Long.valueOf(r210), Long.valueOf(r12));     // Catch: Throwable -> L79
        r211 = r210;
    L78:
        r10 = r212;
        goto L67
    L74:
        if (r210 <= r12) goto L75;
    L82:
        throw new HubException("Слишком большой файл");     // Catch: Throwable -> L79
    L83:
        r30.close();     // Catch: Throwable -> L186
        r29.close();     // Catch: Throwable -> L91
        r34.invoke(Long.valueOf(r210), Long.valueOf(r12));     // Catch: Throwable -> L91
        if (r12 > 0) goto L87;
    L93:
        r27.close();     // Catch: Throwable -> L103 Exception -> L105
        if (r5 != null) goto L96;
    L107:
        if (r33 == null) goto L114;
        r34.invoke(-1L, 0L);     // Catch: Throwable -> L103 Exception -> L105
        ux3 r1 = d25.a;     // Catch: Throwable -> L103 Exception -> L105
        File r35 = new File(r31.getApplicationInfo().sourceDir);     // Catch: Throwable -> L103 Exception -> L105
        r18.getClass();     // Catch: Throwable -> L103 Exception -> L105
        if (r2 == null) goto L112;
        d25.b(r35, r17, r18, r33, r2);     // Catch: Throwable -> L103 Exception -> L105
    L117:
        if (r2 == null) goto L119;
        long r0 = r2.getSize();     // Catch: Throwable -> L103 Exception -> L105
    L120:
        if (r2 == null) goto L123;
        String r36 = r2.getSha256();     // Catch: Throwable -> L103 Exception -> L105
        if (r36 == null) goto L123;
    L125:
        if (r18.length() > 134217728) goto L183;
        if (r0 > 0) goto L129;
    L130:
        if (r36 != null) goto L132;
    L136:
        int r37 = Build.VERSION.SDK_INT;     // Catch: Throwable -> L103 Exception -> L105
        if (r37 < 28) goto L139;
        int r38 = 134217728;
    L140:
        PackageInfo r39 = r31.getPackageManager().getPackageArchiveInfo(r18.getPath(), r38);     // Catch: Throwable -> L103 Exception -> L105
        if (r39 == null) goto L181;
        if (r37 < 28) goto L144;
        long r40 = sr0.e(r39);     // Catch: Throwable -> L103 Exception -> L105
    L146:
        if (h12.c(r39.packageName, r31.getPackageName()) == false) goto L179;
        if (r40 != r32.getVersionCode()) goto L179;
        if (r32.getVersionName() != null) goto L152;
    L153:
        PackageInfo r41 = r31.getPackageManager().getPackageInfo(r31.getPackageName(), r38);     // Catch: Throwable -> L103 Exception -> L105
        if (r37 < 28) goto L159;
        SigningInfo r42 = sr0.f(r39);     // Catch: Throwable -> L103 Exception -> L105
        if (r42 == null) goto L158;
        Signature[] r43 = sr0.t(r42);     // Catch: Throwable -> L103 Exception -> L105
    L160:
        if (r37 < 28) goto L165;
        SigningInfo r44 = sr0.x(r41);     // Catch: Throwable -> L103 Exception -> L105
        if (r44 == null) goto L164;
        Signature[] r45 = sr0.t(r44);     // Catch: Throwable -> L103 Exception -> L105
    L166:
        if (r43 == null) goto L177;
        if (r43.length == 0) goto L177;
        if (r45 == null) goto L177;
        if (r45.length == 0) goto L177;
        if (ti.t0(r43).equals(ti.t0(r45)) == false) goto L177;
        r17.delete();
        return r18;
    L177:
        throw new HubException("Подпись APK не совпадает");     // Catch: Throwable -> L103 Exception -> L105
    L164:
        r45 = null;
        goto L166
    L165:
        r45 = r41.signatures;     // Catch: Throwable -> L103 Exception -> L105
        goto L166
    L158:
        r43 = null;
        goto L160
    L159:
        r43 = r39.signatures;     // Catch: Throwable -> L103 Exception -> L105
        goto L160
    L152:
        if (h12.c(r39.versionName, r32.getVersionName()) == true) goto L153;
    L179:
        throw new HubException("Неверная версия APK");     // Catch: Throwable -> L103 Exception -> L105
    L144:
        r40 = r39.versionCode;     // Catch: Throwable -> L103 Exception -> L105
        goto L146
    L181:
        throw new HubException("Скачанный файл — не APK");     // Catch: Throwable -> L103 Exception -> L105
    L139:
        r38 = 64;
        goto L140
    L132:
        if (qm4.u0(r36) == true) goto L136;
        if (d25.d(r18).equalsIgnoreCase(r36) == false) goto L183;
    L129:
        if (r18.length() == r0) goto L130;
    L183:
        throw new HubException("Повреждённый APK");     // Catch: Throwable -> L103 Exception -> L105
    L123:
        r36 = r32.getSha256();     // Catch: Throwable -> L103 Exception -> L105
        goto L125
    L119:
        r0 = r32.getSize();     // Catch: Throwable -> L103 Exception -> L105
        goto L120
    L112:
        throw new HubException("Нет описания полного APK");     // Catch: Throwable -> L103 Exception -> L105
    L114:
        if (r18.delete() == false) goto L185;
        if (r17.renameTo(r18) == true) goto L117;
    L185:
        throw new HubException("Не удалось сохранить APK");     // Catch: Throwable -> L103 Exception -> L105
    L96:
        if (qm4.u0(r5) == true) goto L107;
        if (d25.d(r17).equalsIgnoreCase(r5) == true) goto L107;
        throw new HubException("Контрольная сумма не совпала");     // Catch: Throwable -> L103 Exception -> L105
    L87:
        if (r210 == r12) goto L93;
        throw new HubException("Неверный размер обновления");     // Catch: Throwable -> L91
    L79:
        th = move-exception;
        throw th;     // Catch: Throwable -> L189
    L189:
        th = move-exception;
        q05.h(r30, th);     // Catch: Throwable -> L186
        throw th;     // Catch: Throwable -> L186
    L186:
        th = move-exception;
        throw th;     // Catch: Throwable -> L193
    L193:
        th = move-exception;
        q05.h(r29, th);     // Catch: Throwable -> L91
        throw th;     // Catch: Throwable -> L91
    L197:
        throw new HubException("Слишком большой файл");     // Catch: Throwable -> L91
    L199:
        throw new HubException("Пустой ответ Хаба");     // Catch: Throwable -> L91
    L201:
        throw rr1.i(r27);     // Catch: Throwable -> L91
    L207:
        throw new HubException("Неверная ссылка");     // Catch: Throwable -> L103 Exception -> L105
    L53:
        r23 = null;
    L50:
        r22 = null;
    L105:
        e = move-exception;
        r18.delete();     // Catch: Throwable -> L103
        throw e;     // Catch: Throwable -> L103
    L103:
        th = move-exception;
        r17.delete();
        throw th;
    L34:
        r5 = r32.getSha256();
        goto L35
    L30:
        r12 = r32.getSize();
        goto L31
    L27:
        r10 = 134217728;
        goto L28
    L19:
        if (r32.getUrl() == null) goto L25;
        if (h12.c(r32.getUrl(), "/app/latest.apk") == true) goto L25;
        throw new HubException("Неверная ссылка");
    L15:
        r6 = "/app/latest.apk";
        goto L17
    L10:
        r4 = r2;
        goto L12
    L5:
        if (d25.e(r2, "apk") == false) goto L7;
        goto L7
    }

    public static /* synthetic */ void g(Activity r0, HubAppRelease r1, HubUpdatePatch r2, LinearProgressIndicator r3, TextView r4, f9 r5) {
        download$lambda$0(r0, r1, r2, r3, r4, r5);
    }

    private final o83 getUpdateHttp() {
        return (o83) updateHttp$delegate.getValue();
    }

    public static /* synthetic */ void h(Activity r0, HubAppRelease r1, DialogInterface r2, int r3) {
        offer$lambda$3(r0, r1, r2, r3);
    }

    public static /* synthetic */ o83 i() {
        return updateHttp_delegate$lambda$0();
    }

    private final void install(Activity r8, File r9) {
        z61 r7 = a71.c(r8, r8.getPackageName() + ".homemusic.fileprovider");
        String r10 = r9.getCanonicalPath();     // Catch: IOException -> L29
        Iterator r0 = r7.b.entrySet().iterator();
        Map.Entry r1 = null;
    L6:
        if (r0.hasNext() == false) goto L13;
        Map.Entry r2 = (Map.Entry) r0.next();
        String r4 = ((File) r2.getValue()).getPath();
        if (a71.a(r10).startsWith(a71.a(r4).concat("/")) == false) goto L6;
        if (r1 == null) goto L12;
        if (r4.length() <= ((File) r1.getValue()).getPath().length()) goto L6;
    L12:
        r1 = r2;
        goto L6
    L13:
        if (r1 == null) goto L27;
        String r3 = ((File) r1.getValue()).getPath();
        if (r3.endsWith("/") == false) goto L17;
        String r11 = r10.substring(r3.length());
    L18:
        Intent r12 = new Intent("android.intent.action.VIEW").setDataAndType(new Uri.Builder().scheme("content").authority(r7.a).encodedPath(Uri.encode((String) r1.getKey()) + '/' + Uri.encode(r11, "/")).build(), "application/vnd.android.package-archive").addFlags(268435457);
        r12.getClass();
        r8.startActivity(r12);     // Catch: ActivityNotFoundException -> L21
        return;
    L21:
        e = move-exception;
        String r13 = e.getMessage();
        if (r13 != null) goto L25;
        r13 = "";
    L25:
        Toast.makeText(r8, r8.getString(R.string.homemusic_update_failed, new Object[]{r13}), 1).show();
        return;
    L17:
        r11 = r10.substring(r3.length() + 1);
        goto L18
    L27:
        kf2.n(xa3.g("Failed to find configured root that contains ", r10));
        return;
    L29:
        mj0.l(r9, "Failed to resolve canonical path for ");
    }

    public static /* synthetic */ void j(Activity r0, boolean r1) {
        check$lambda$0(r0, r1);
    }

    public static /* synthetic */ void k(boolean r0, DialogInterface r1) {
        offer$lambda$4(r0, r1);
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [st1] */
    private final void offer(Activity r8, HubAppRelease r9, HubUpdatePatch r10, final boolean r11) {
        String r0 = r9.getNotes();
        if (r0 != null) goto L5;
    L7:
        r0 = null;
    L8:
        boolean r2 = jp1.b();
        if (r10 == null) goto L11;
        long r3 = r10.getSize();
    L16:
        if (r3 <= 0) goto L18;
        String r7 = updateSize(r8, r3);
    L19:
        String r4 = r9.getVersionName();
        if (r4 != null) goto L22;
        r4 = String.valueOf(r9.getVersionCode());
    L22:
        String r5 = r8.getString(R.string.homemusic_update_message, new Object[]{AURAVersion.versionName(r8), r4});
        String r6 = "";
        if (r0 == null) goto L25;
        String r1 = "\n\n".concat(r0);
    L26:
        if (r2 == false) goto L31;
        if (r7 != null) goto L29;
        String r12 = "?";
    L30:
        r6 = xa3.g("\n\n", r8.getString(R.string.homemusic_update_metered, new Object[]{r12}));
        goto L31
    L29:
        r12 = r7;
    L31:
        String r13 = b11.o(r5, r1, r6);
        if (r2 == false) goto L35;
        if (r7 == null) goto L35;
        String r14 = r8.getString(R.string.homemusic_update_install_metered, new Object[]{r7});
    L36:
        r14.getClass();
        vg2 r15 = new vg2(r8, 0);
        r15.p(R.string.homemusic_update_title);
        r15.a.f = r13;
        r15.m(r14, new rn1(r8, r9, r10, 2));
        if (r2 == false) goto L39;
        int r16 = R.string.homemusic_update_wait_wifi;
    L40:
        vg2 r17 = r15.j(r16, null);
        r17.getClass();
        if (r11 == true) goto L43;
        r17.k(R.string.homemusic_update_skip, new qt1(r8, r9, 1));
    L43:
        r17.a.n = new st1(r11);
        r17.h();
        return;
    L39:
        r16 = R.string.homemusic_update_later;
    L35:
        r14 = r8.getString(R.string.homemusic_update_install);
        goto L36
    L25:
        r1 = "";
        goto L26
    L18:
        r7 = null;
        goto L19
    L11:
        HubUpdateFile r18 = r9.getFull();
        if (r18 == null) goto L14;
        r3 = r18.getSize();
        goto L16
    L14:
        r3 = r9.getSize();
        goto L16
    L5:
        if (qm4.u0(r0) == true) goto L7;
        goto L7
    }

    private static final void offer$lambda$2(Activity r0, HubAppRelease r1, HubUpdatePatch r2, DialogInterface r3, int r4) {
        INSTANCE.download(r0, r1, r2);
    }

    private static final void offer$lambda$3(Activity r2, HubAppRelease r3, DialogInterface r4, int r5) {
        INSTANCE.prefs(r2).edit().putLong(KEY_SKIPPED, r3.getVersionCode()).apply();
    }

    private static final void offer$lambda$4(boolean r0, DialogInterface r1) {
        if (r0 == true) goto L5;
        autoCheckFor = null;
        return;
    }

    private final SharedPreferences prefs(Context r2) {
        return r2.getSharedPreferences(PREFS, 0);
    }

    private static final o83 updateHttp_delegate$lambda$0() {
        n83 r0 = rr1.k().a();
        r0.k = be0.g;
        r0.i = true;
        r0.j = true;
        return new o83(r0);
    }

    private final String updateSize(Context r3, long r4) {
        if (r4 >= 1048576) goto L6;
        String r2 = r3.getString(R.string.homemusic_update_size_kib, new Object[]{Double.valueOf(r4 / 1024.0d)});
        r2.getClass();
        return r2;
    L6:
        String r5 = r3.getString(R.string.homemusic_update_size_mib, new Object[]{Double.valueOf(r4 / 1048576.0d)});
        r5.getClass();
        return r5;
    }
}
