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
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import app.homemusic.AURAVersion;
import app.homemusic.R;
import com.eddyizm.tempus.homemusic.HubUpdater;
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
import defpackage.q05;
import defpackage.qm4;
import defpackage.qt1;
import defpackage.r72;
import defpackage.rn1;
import defpackage.rp4;
import defpackage.rr1;
import defpackage.rt1;
import defpackage.s14;
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
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class HubUpdater {
    private static final String KEY_SKIPPED = "skipped_version";
    private static final String PREFS = "homemusic_updater";
    private static final String TAG = "HubUpdater";
    private static WeakReference<Activity> autoCheckFor;
    public static final HubUpdater INSTANCE = new HubUpdater();
    private static final AtomicBoolean downloading = new AtomicBoolean(false);
    private static final r72 updateHttp$delegate = new rp4(new e90(19));
    public static final int $stable = 8;

    private HubUpdater() {
    }

    public static final void check(Activity activity, boolean z) {
        activity.getClass();
        if (z) {
            Toast.makeText(activity, R.string.homemusic_update_checking, 0).show();
        }
        io1.a.execute(new pm(activity, z, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void check$lambda$0(Activity activity, boolean z) {
        Object s14Var;
        Object s14Var2;
        try {
            HubAppRelease hubAppReleaseN = rr1.n();
            File file = new File(activity.getApplicationInfo().sourceDir);
            Object obj = null;
            if (hubAppReleaseN != null) {
                long versionCode = hubAppReleaseN.getVersionCode();
                long jVersionCode = AURAVersion.versionCode(activity);
                if (versionCode > jVersionCode) {
                    List<HubUpdatePatch> patches = hubAppReleaseN.getPatches();
                    if (patches == null) {
                        patches = u01.n;
                    }
                    if (!patches.isEmpty()) {
                        for (HubUpdatePatch hubUpdatePatch : patches) {
                            if (hubUpdatePatch.getBaseVersionCode() == jVersionCode && h12.c(hubUpdatePatch.getFormat(), "bsdiff40-v1")) {
                                long length = file.length();
                                if (1 > length || length >= 33554433) {
                                    break;
                                    break;
                                }
                                try {
                                    s14Var2 = d25.c(hubAppReleaseN, d25.d(file));
                                } catch (Throwable th) {
                                    s14Var2 = new s14(th);
                                }
                                if (!(s14Var2 instanceof s14)) {
                                    obj = s14Var2;
                                }
                                obj = (HubUpdatePatch) obj;
                                break;
                            }
                        }
                    }
                }
            }
            s14Var = new kd3(hubAppReleaseN, obj);
        } catch (Throwable th2) {
            s14Var = new s14(th2);
        }
        io1.b.post(new bs1(activity, z, s14Var, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void check$lambda$0$1(Activity activity, boolean z, Object obj) {
        if (activity.isFinishing() || activity.isDestroyed()) {
            if (z) {
                return;
            }
            autoCheckFor = null;
            return;
        }
        Throwable thA = bb3.a(obj);
        boolean z2 = true;
        if (thA != null) {
            Log.d(TAG, "Update check failed: " + thA.getMessage());
            if (z) {
                String message = thA.getMessage();
                if (message == null) {
                    message = "";
                }
                Toast.makeText(activity, activity.getString(R.string.homemusic_update_failed, message), 1).show();
            }
        }
        boolean z3 = false;
        if (!(obj instanceof s14)) {
            kd3 kd3Var = (kd3) obj;
            HubAppRelease hubAppRelease = (HubAppRelease) kd3Var.n;
            HubUpdatePatch hubUpdatePatch = (HubUpdatePatch) kd3Var.o;
            if (hubAppRelease != null && hubAppRelease.getVersionCode() > AURAVersion.versionCode(activity)) {
                if (z || INSTANCE.prefs(activity).getLong(KEY_SKIPPED, -1L) != hubAppRelease.getVersionCode()) {
                    INSTANCE.offer(activity, hubAppRelease, hubUpdatePatch, z);
                }
                z3 = z2;
            } else if (z) {
                Toast.makeText(activity, activity.getString(R.string.homemusic_update_latest, AURAVersion.versionName(activity)), 0).show();
            }
            z2 = false;
            z3 = z2;
        }
        if (z || z3) {
            return;
        }
        autoCheckFor = null;
    }

    public static final void checkOnStart(Activity activity) {
        activity.getClass();
        WeakReference<Activity> weakReference = autoCheckFor;
        Activity activity2 = weakReference != null ? weakReference.get() : null;
        if (activity2 == null || activity2.isFinishing() || activity2.isDestroyed()) {
            autoCheckFor = new WeakReference<>(activity);
            check(activity, false);
        }
    }

    private final void download(Activity activity, HubAppRelease hubAppRelease, HubUpdatePatch hubUpdatePatch) {
        if (Build.VERSION.SDK_INT >= 26 && !activity.getPackageManager().canRequestPackageInstalls()) {
            Toast.makeText(activity, R.string.homemusic_update_allow_install, 1).show();
            try {
                activity.startActivity(new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + activity.getPackageName())));
                return;
            } catch (ActivityNotFoundException e) {
                Log.w(TAG, "No unknown-sources settings screen", e);
                return;
            }
        }
        if (downloading.compareAndSet(false, true)) {
            View viewInflate = LayoutInflater.from(activity).inflate(R.layout.dialog_hub_update_progress, (ViewGroup) null);
            LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) viewInflate.findViewById(R.id.hub_update_progress);
            TextView textView = (TextView) viewInflate.findViewById(R.id.hub_update_progress_text);
            vg2 vg2Var = new vg2(activity, 0);
            vg2Var.p(R.string.homemusic_update_downloading);
            vg2 vg2VarQ = vg2Var.q(viewInflate);
            vg2VarQ.a.m = false;
            io1.a.execute(new up(activity, hubAppRelease, hubUpdatePatch, linearProgressIndicator, textView, vg2VarQ.h(), 5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void download$lambda$0(Activity activity, HubAppRelease hubAppRelease, HubUpdatePatch hubUpdatePatch, LinearProgressIndicator linearProgressIndicator, TextView textView, f9 f9Var) {
        Object s14Var;
        c25 c25Var;
        HubUpdater hubUpdater = INSTANCE;
        try {
            rt1 rt1Var = new rt1(linearProgressIndicator, textView, hubUpdater, activity);
            try {
                Context applicationContext = activity.getApplicationContext();
                applicationContext.getClass();
                s14Var = hubUpdater.fetchApk(applicationContext, hubAppRelease, hubUpdatePatch, rt1Var);
            } catch (Exception e) {
                ux3 ux3Var = d25.a;
                boolean z = hubUpdatePatch != null;
                boolean zB = jp1.b();
                c25 c25Var2 = c25.o;
                if (z) {
                    c25Var = zB ? c25.p : c25Var2;
                } else {
                    c25Var = c25.n;
                }
                if (c25Var != c25Var2) {
                    throw e;
                }
                Log.w(TAG, "Patch failed, downloading the full APK: " + e.getMessage());
                Context applicationContext2 = activity.getApplicationContext();
                applicationContext2.getClass();
                s14Var = hubUpdater.fetchApk(applicationContext2, hubAppRelease, null, rt1Var);
            }
        } catch (Throwable th) {
            s14Var = new s14(th);
        }
        downloading.set(false);
        io1.b.post(new mr(f9Var, activity, s14Var, hubUpdatePatch, hubAppRelease, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j15 download$lambda$0$0$0(final LinearProgressIndicator linearProgressIndicator, final TextView textView, final HubUpdater hubUpdater, final Activity activity, final long j, final long j2) {
        io1.b.post(new Runnable() { // from class: pt1
            @Override // java.lang.Runnable
            public final void run() {
                HubUpdater.download$lambda$0$0$0$0(j, linearProgressIndicator, textView, j2, hubUpdater, activity);
            }
        });
        return j15.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void download$lambda$0$0$0$0(long j, LinearProgressIndicator linearProgressIndicator, TextView textView, long j2, HubUpdater hubUpdater, Activity activity) {
        if (j < 0) {
            linearProgressIndicator.setIndeterminate(true);
            textView.setText(R.string.homemusic_update_preparing);
            return;
        }
        if (j2 <= 0) {
            textView.setText(hubUpdater.updateSize(activity, j));
            return;
        }
        linearProgressIndicator.setIndeterminate(false);
        linearProgressIndicator.b((int) ((100 * j) / j2), true);
        textView.setText(hubUpdater.updateSize(activity, j) + " из " + hubUpdater.updateSize(activity, j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void download$lambda$0$1(f9 f9Var, Activity activity, Object obj, HubUpdatePatch hubUpdatePatch, HubAppRelease hubAppRelease) {
        c25 c25Var;
        if (f9Var.isShowing()) {
            f9Var.dismiss();
        }
        if (activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        if (!(obj instanceof s14)) {
            INSTANCE.install(activity, (File) obj);
        }
        Throwable thA = bb3.a(obj);
        if (thA != null) {
            ux3 ux3Var = d25.a;
            int i = 0;
            boolean z = hubUpdatePatch != null;
            boolean zB = jp1.b();
            c25 c25Var2 = c25.p;
            if (z) {
                c25Var = zB ? c25Var2 : c25.o;
            } else {
                c25Var = c25.n;
            }
            if (c25Var != c25Var2) {
                String message = thA.getMessage();
                if (message == null) {
                    message = "";
                }
                Toast.makeText(activity, activity.getString(R.string.homemusic_update_failed, message), 1).show();
                return;
            }
            HubUpdateFile full = hubAppRelease.getFull();
            long size = full != null ? full.getSize() : hubAppRelease.getSize();
            vg2 vg2Var = new vg2(activity, 0);
            vg2Var.a.f = activity.getString(R.string.homemusic_update_full_fallback, INSTANCE.updateSize(activity, size));
            vg2Var.l(R.string.homemusic_update_full_download, new qt1(activity, hubAppRelease, i)).j(R.string.homemusic_update_later, null).h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void download$lambda$0$1$1$0(Activity activity, HubAppRelease hubAppRelease, DialogInterface dialogInterface, int i) {
        INSTANCE.download(activity, hubAppRelease, null);
    }

    private final File fetchApk(Context context, HubAppRelease hubAppRelease, HubUpdatePatch hubUpdatePatch, wf1 wf1Var) throws IOException {
        String url;
        String sha256;
        fr1 fr1Var;
        String sha257;
        Signature[] apkContentsSigners;
        Signature[] apkContentsSigners2;
        HubUpdateFile full = hubAppRelease.getFull();
        if (full == null || !d25.e(full, "apk")) {
            full = null;
        }
        HubUpdateFile hubUpdateFile = hubUpdatePatch != null ? hubUpdatePatch : full;
        if (hubUpdateFile == null || (url = hubUpdateFile.getUrl()) == null) {
            url = "/app/latest.apk";
        }
        if (hubUpdateFile == null && hubAppRelease.getUrl() != null && !h12.c(hubAppRelease.getUrl(), "/app/latest.apk")) {
            throw new HubException("Неверная ссылка");
        }
        long j = hubUpdatePatch != null ? 16777216L : 134217728L;
        long size = hubUpdateFile != null ? hubUpdateFile.getSize() : hubAppRelease.getSize();
        if (hubUpdateFile == null || (sha256 = hubUpdateFile.getSha256()) == null) {
            sha256 = hubAppRelease.getSha256();
        }
        File file = new File(context.getCacheDir(), "updates");
        file.mkdirs();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            ArrayList arrayList = new ArrayList();
            for (File file2 : fileArrListFiles) {
                if (System.currentTimeMillis() - file2.lastModified() > 86400000) {
                    arrayList.add(file2);
                }
            }
            int size2 = arrayList.size();
            int i = 0;
            while (i < size2) {
                Object obj = arrayList.get(i);
                i++;
                ((File) obj).delete();
            }
        }
        File fileCreateTempFile = File.createTempFile("download-", ".tmp", file);
        File fileCreateTempFile2 = File.createTempFile("update-", ".apk", file);
        try {
            try {
                String str = rr1.c() + "/";
                fr1 fr1Var2 = new fr1();
                fr1Var2.e(null, str);
                gr1 gr1VarB = fr1Var2.b();
                try {
                    fr1Var = new fr1();
                    fr1Var.e(gr1VarB, url);
                } catch (IllegalArgumentException unused) {
                    fr1Var = null;
                }
                gr1 gr1VarB2 = fr1Var != null ? fr1Var.b() : null;
                if (gr1VarB2 == null) {
                    throw new HubException("Неверная ссылка");
                }
                o83 updateHttp = getUpdateHttp();
                nz3 nz3Var = new nz3();
                nz3Var.a = gr1VarB2;
                oz3 oz3Var = new oz3(nz3Var);
                updateHttp.getClass();
                k14 k14VarC = new bv3(updateHttp, oz3Var).c();
                try {
                    if (!k14VarC.C) {
                        throw rr1.i(k14VarC);
                    }
                    n14 n14Var = k14VarC.t;
                    if (n14Var == null) {
                        throw new HubException("Пустой ответ Хаба");
                    }
                    if (n14Var.contentLength() > j) {
                        throw new HubException("Слишком большой файл");
                    }
                    InputStream inputStreamByteStream = n14Var.byteStream();
                    try {
                        fileCreateTempFile.getClass();
                        FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                        try {
                            byte[] bArr = new byte[65536];
                            long j2 = 0;
                            long j3 = 0;
                            while (true) {
                                int i2 = inputStreamByteStream.read(bArr);
                                if (i2 < 0) {
                                    fileOutputStream.close();
                                    inputStreamByteStream.close();
                                    wf1Var.invoke(Long.valueOf(j2), Long.valueOf(size));
                                    if (size > 0 && j2 != size) {
                                        throw new HubException("Неверный размер обновления");
                                    }
                                    k14VarC.close();
                                    if (sha256 != null && !qm4.u0(sha256) && !d25.d(fileCreateTempFile).equalsIgnoreCase(sha256)) {
                                        throw new HubException("Контрольная сумма не совпала");
                                    }
                                    if (hubUpdatePatch != null) {
                                        wf1Var.invoke(-1L, 0L);
                                        ux3 ux3Var = d25.a;
                                        File file3 = new File(context.getApplicationInfo().sourceDir);
                                        fileCreateTempFile2.getClass();
                                        if (full == null) {
                                            throw new HubException("Нет описания полного APK");
                                        }
                                        d25.b(file3, fileCreateTempFile, fileCreateTempFile2, hubUpdatePatch, full);
                                    } else if (!fileCreateTempFile2.delete() || !fileCreateTempFile.renameTo(fileCreateTempFile2)) {
                                        throw new HubException("Не удалось сохранить APK");
                                    }
                                    long size3 = full != null ? full.getSize() : hubAppRelease.getSize();
                                    if (full == null || (sha257 = full.getSha256()) == null) {
                                        sha257 = hubAppRelease.getSha256();
                                    }
                                    if (fileCreateTempFile2.length() > 134217728 || ((size3 > 0 && fileCreateTempFile2.length() != size3) || (sha257 != null && !qm4.u0(sha257) && !d25.d(fileCreateTempFile2).equalsIgnoreCase(sha257)))) {
                                        throw new HubException("Повреждённый APK");
                                    }
                                    int i3 = Build.VERSION.SDK_INT;
                                    int i4 = i3 >= 28 ? 134217728 : 64;
                                    PackageInfo packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(fileCreateTempFile2.getPath(), i4);
                                    if (packageArchiveInfo == null) {
                                        throw new HubException("Скачанный файл — не APK");
                                    }
                                    long longVersionCode = i3 >= 28 ? packageArchiveInfo.getLongVersionCode() : packageArchiveInfo.versionCode;
                                    if (!h12.c(packageArchiveInfo.packageName, context.getPackageName()) || longVersionCode != hubAppRelease.getVersionCode() || (hubAppRelease.getVersionName() != null && !h12.c(packageArchiveInfo.versionName, hubAppRelease.getVersionName()))) {
                                        throw new HubException("Неверная версия APK");
                                    }
                                    PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), i4);
                                    if (i3 >= 28) {
                                        SigningInfo signingInfo = packageArchiveInfo.signingInfo;
                                        apkContentsSigners = signingInfo != null ? signingInfo.getApkContentsSigners() : null;
                                    } else {
                                        apkContentsSigners = packageArchiveInfo.signatures;
                                    }
                                    if (i3 >= 28) {
                                        SigningInfo signingInfo2 = packageInfo.signingInfo;
                                        apkContentsSigners2 = signingInfo2 != null ? signingInfo2.getApkContentsSigners() : null;
                                    } else {
                                        apkContentsSigners2 = packageInfo.signatures;
                                    }
                                    if (apkContentsSigners == null || apkContentsSigners.length == 0 || apkContentsSigners2 == null || apkContentsSigners2.length == 0 || !ti.t0(apkContentsSigners).equals(ti.t0(apkContentsSigners2))) {
                                        throw new HubException("Подпись APK не совпадает");
                                    }
                                    fileCreateTempFile.delete();
                                    return fileCreateTempFile2;
                                }
                                long j4 = j;
                                j2 += (long) i2;
                                if (j2 > j4 || (size > 0 && j2 > size)) {
                                    throw new HubException("Слишком большой файл");
                                }
                                fileOutputStream.write(bArr, 0, i2);
                                if (j2 - j3 >= 262144) {
                                    wf1Var.invoke(Long.valueOf(j2), Long.valueOf(size));
                                    j3 = j2;
                                }
                                j = j4;
                                try {
                                    throw th;
                                } catch (Throwable th) {
                                    q05.h(inputStreamByteStream, th);
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                q05.h(fileOutputStream, th2);
                                throw th3;
                            }
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                } catch (Throwable th5) {
                    try {
                        throw th5;
                    } catch (Throwable th6) {
                        q05.h(k14VarC, th5);
                        throw th6;
                    }
                }
            } catch (Exception e) {
                fileCreateTempFile2.delete();
                throw e;
            }
        } catch (Throwable th7) {
            fileCreateTempFile.delete();
            throw th7;
        }
    }

    private final o83 getUpdateHttp() {
        return (o83) updateHttp$delegate.getValue();
    }

    private final void install(Activity activity, File file) {
        z61 z61VarC = a71.c(activity, activity.getPackageName() + ".homemusic.fileprovider");
        try {
            String canonicalPath = file.getCanonicalPath();
            Map.Entry entry = null;
            for (Map.Entry entry2 : z61VarC.b.entrySet()) {
                String path = ((File) entry2.getValue()).getPath();
                if (a71.a(canonicalPath).startsWith(a71.a(path).concat("/")) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                    entry = entry2;
                }
            }
            if (entry == null) {
                kf2.n(xa3.g("Failed to find configured root that contains ", canonicalPath));
                return;
            }
            String path2 = ((File) entry.getValue()).getPath();
            Intent intentAddFlags = new Intent("android.intent.action.VIEW").setDataAndType(new Uri.Builder().scheme("content").authority(z61VarC.a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(path2.endsWith("/") ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1), "/")).build(), "application/vnd.android.package-archive").addFlags(268435457);
            intentAddFlags.getClass();
            try {
                activity.startActivity(intentAddFlags);
            } catch (ActivityNotFoundException e) {
                String message = e.getMessage();
                if (message == null) {
                    message = "";
                }
                Toast.makeText(activity, activity.getString(R.string.homemusic_update_failed, message), 1).show();
            }
        } catch (IOException unused) {
            mj0.l(file, "Failed to resolve canonical path for ");
        }
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [st1] */
    private final void offer(Activity activity, HubAppRelease hubAppRelease, HubUpdatePatch hubUpdatePatch, final boolean z) {
        long size;
        String notes = hubAppRelease.getNotes();
        if (notes == null || qm4.u0(notes)) {
            notes = null;
        }
        boolean zB = jp1.b();
        if (hubUpdatePatch != null) {
            size = hubUpdatePatch.getSize();
        } else {
            HubUpdateFile full = hubAppRelease.getFull();
            size = full != null ? full.getSize() : hubAppRelease.getSize();
        }
        String strUpdateSize = size > 0 ? updateSize(activity, size) : null;
        String versionName = hubAppRelease.getVersionName();
        if (versionName == null) {
            versionName = String.valueOf(hubAppRelease.getVersionCode());
        }
        String string = activity.getString(R.string.homemusic_update_message, AURAVersion.versionName(activity), versionName);
        String strG = "";
        String strConcat = notes != null ? "\n\n".concat(notes) : "";
        if (zB) {
            strG = xa3.g("\n\n", activity.getString(R.string.homemusic_update_metered, strUpdateSize == null ? "?" : strUpdateSize));
        }
        String strO = b11.o(string, strConcat, strG);
        String string2 = (!zB || strUpdateSize == null) ? activity.getString(R.string.homemusic_update_install) : activity.getString(R.string.homemusic_update_install_metered, strUpdateSize);
        string2.getClass();
        vg2 vg2Var = new vg2(activity, 0);
        vg2Var.p(R.string.homemusic_update_title);
        vg2Var.a.f = strO;
        vg2Var.m(string2, new rn1(activity, hubAppRelease, hubUpdatePatch, 2));
        vg2 vg2VarJ = vg2Var.j(zB ? R.string.homemusic_update_wait_wifi : R.string.homemusic_update_later, null);
        vg2VarJ.getClass();
        if (!z) {
            vg2VarJ.k(R.string.homemusic_update_skip, new qt1(activity, hubAppRelease, 1));
        }
        vg2VarJ.a.n = new DialogInterface.OnDismissListener() { // from class: st1
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                HubUpdater.offer$lambda$4(z, dialogInterface);
            }
        };
        vg2VarJ.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void offer$lambda$2(Activity activity, HubAppRelease hubAppRelease, HubUpdatePatch hubUpdatePatch, DialogInterface dialogInterface, int i) {
        INSTANCE.download(activity, hubAppRelease, hubUpdatePatch);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void offer$lambda$3(Activity activity, HubAppRelease hubAppRelease, DialogInterface dialogInterface, int i) {
        INSTANCE.prefs(activity).edit().putLong(KEY_SKIPPED, hubAppRelease.getVersionCode()).apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void offer$lambda$4(boolean z, DialogInterface dialogInterface) {
        if (z) {
            return;
        }
        autoCheckFor = null;
    }

    private final SharedPreferences prefs(Context context) {
        return context.getSharedPreferences(PREFS, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o83 updateHttp_delegate$lambda$0() {
        n83 n83VarA = rr1.k().a();
        n83VarA.k = be0.g;
        n83VarA.i = true;
        n83VarA.j = true;
        return new o83(n83VarA);
    }

    private final String updateSize(Context context, long j) {
        if (j < 1048576) {
            String string = context.getString(R.string.homemusic_update_size_kib, Double.valueOf(j / 1024.0d));
            string.getClass();
            return string;
        }
        String string2 = context.getString(R.string.homemusic_update_size_mib, Double.valueOf(j / 1048576.0d));
        string2.getClass();
        return string2;
    }
}
