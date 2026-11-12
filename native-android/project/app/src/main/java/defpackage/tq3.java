package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class tq3 {
    public static final hh3 a = null;

    static {
        a = new hh3(3);
    }

    public static void a(PackageInfo r2, File r3) {
        DataOutputStream r4 = new DataOutputStream(new FileOutputStream(new File(r3, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));     // Catch: IOException -> L13
        r4.writeLong(r2.lastUpdateTime);     // Catch: Throwable -> L7
        r4.close();     // Catch: IOException -> L13
        return;
    L7:
        th = move-exception;
        r4.close();     // Catch: Throwable -> L10
    L12:
        throw th;     // Catch: IOException -> L13
    L10:
        th = move-exception;
        th.addSuppressed(th);     // Catch: IOException -> L13
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v25, types: [int] */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r7v54 */
    /* JADX WARN: Type inference failed for: r7v55 */
    /* JADX WARN: Type inference failed for: r7v56 */
    /* JADX WARN: Type inference failed for: r7v57 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v18 */
    public static void b(Context r18, Executor r19, sq3 r20, boolean r21) {
        Context r0 = r18.getApplicationContext();
        String r2 = r0.getPackageName();
        ApplicationInfo r3 = r0.getApplicationInfo();
        AssetManager r4 = r0.getAssets();
        String r6 = new File(r3.sourceDir).getName();
        PackageInfo r10 = r18.getPackageManager().getPackageInfo(r2, 0);     // Catch: PackageManager.NameNotFoundException -> L249
        File r11 = r18.getFilesDir();
        if (r21 == true) goto L28;
        File r1 = new File(r11, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
        if (r1.exists() == true) goto L276;
    L8:
        boolean r5 = false;
    L25:
        if (r5 == false) goto L28;
        Log.d("ProfileInstaller", "Skipping profile installation for " + r18.getPackageName());
        wq3.c(r18, false);
        return;
    L276:
        DataInputStream r7 = new DataInputStream(new FileInputStream(r1));     // Catch: IOException -> L252
        long r14 = r7.readLong();     // Catch: Throwable -> L18
        r7.close();     // Catch: IOException -> L252
        if (r14 != r10.lastUpdateTime) goto L15;
        r5 = true;
    L16:
        if (r5 == false) goto L25;
        r20.e(2, null);
        goto L25
    L15:
        r5 = false;
        goto L16
    L18:
        th = move-exception;
        r7.close();     // Catch: Throwable -> L22
        goto L8
    L302:
        throw th;     // Catch: IOException -> L252
    L22:
        th = move-exception;
        th.addSuppressed(th);     // Catch: IOException -> L252
        throw th;     // Catch: IOException -> L252
    L28:
        Log.d("ProfileInstaller", "Installing profile for " + r18.getPackageName());
        byte[] r13 = si0.c;
        File r8 = new File(new File("/data/misc/profiles/cur/0", r2), "primary.prof");
        ip0 r9 = new ip0(r4, r19, r20, r6, r8);
        byte[] r12 = (byte[]) r9.d;
        if (r12 != null) goto L33;
        r9.b(3, Integer.valueOf(Build.VERSION.SDK_INT));
    L31:
        boolean r15 = true;
    L242:
        boolean r16 = false;
        ?? r17 = r15;
    L243:
        if (r16 == false) goto L246;
        if (r21 == false) goto L246;
        ?? r22 = r17;
    L247:
        wq3.c(r18, r22);
        return;
    L246:
        r22 = 0;
        goto L247
    L33:
        if (r8.exists() == true) goto L35;
    L42:
        r15 = true;
        r9.b(4, null);
        goto L242
    L39:
        if (r8.createNewFile() == true) goto L43;
        r9.b(4, null);     // Catch: IOException -> L42
    L43:
        r9.a = true;
        ?? r23 = r9.a(r4, "dexopt/baseline.prof");     // Catch: IOException -> L46 FileNotFoundException -> L48
    L259:
        if (r23 != 0) goto L269;
    L82:
        jp0[] r24 = (jp0[]) r9.h;
        if (r24 == null) goto L123;
        r23 = Build.VERSION.SDK_INT;
        if (r23 < 31) goto L88;
    L299:
        String r25 = "dexopt/baseline.profm";
        FileInputStream r26 = r9.a(r4, "dexopt/baseline.profm");     // Catch: IllegalStateException -> L99 IOException -> L101 FileNotFoundException -> L103
        ?? r27 = r25;
        if (r26 != null) goto L283;
        if (r26 == null) goto L120;
        r26.close();     // Catch: IllegalStateException -> L99 IOException -> L101 FileNotFoundException -> L103
        r27 = r25;
    L120:
        ip0 r28 = null;
        r23 = r27;
    L121:
        if (r28 == null) goto L123;
        r9 = r28;
        goto L123
    L283:
    L105:
        th = move-exception;
        r26.close();     // Catch: Throwable -> L111
        throw th;     // Catch: IllegalStateException -> L99 IOException -> L101 FileNotFoundException -> L103
    L111:
        th = move-exception;
        th.addSuppressed(th);     // Catch: IllegalStateException -> L99 IOException -> L101 FileNotFoundException -> L103
        throw th;     // Catch: IllegalStateException -> L99 IOException -> L101 FileNotFoundException -> L103
    L95:
        if (Arrays.equals(si0.d, fh0.t(r26, 4)) == false) goto L108;
        byte[] r29 = fh0.t(r26, 4);     // Catch: Throwable -> L105
        r9.h = si0.J(r26, r29, r12, r24);     // Catch: Throwable -> L105
        r26.close();     // Catch: IllegalStateException -> L99 IOException -> L101 FileNotFoundException -> L103
        r28 = r9;
        r23 = r29;
        goto L121
    L108:
        throw new IllegalStateException("Invalid magic");     // Catch: Throwable -> L105
    L103:
        e = move-exception;
        r20.e(9, e);
        r27 = r23;
    L101:
        e = move-exception;
        r20.e(7, e);
        r27 = r23;
    L99:
        e = move-exception;
        r9.h = null;
        r20.e(8, e);
        r27 = r23;
        goto L120
    L88:
        if (r23 == 24) goto L299;
        if (r23 == 25) goto L299;
    L123:
        sq3 r30 = (sq3) r9.c;
        jp0[] r31 = (jp0[]) r9.h;
        byte[] r32 = (byte[]) r9.d;
        ?? r33 = r23;
        r33 = r23;
        if (r31 == null) goto L154;
        if (r32 == null) goto L154;
        boolean r34 = r9.a;
        if (r34 == true) goto L296;
        kf2.o("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        return;
    L296:
        ByteArrayOutputStream r35 = new ByteArrayOutputStream();     // Catch: IllegalStateException -> L135 IOException -> L137
        r35.write(r13);     // Catch: Throwable -> L139
        r35.write(r32);     // Catch: Throwable -> L139
        if (si0.S(r35, r32, r31) == true) goto L141;
        r30.e(5, null);     // Catch: Throwable -> L139
        r9.h = null;     // Catch: Throwable -> L139
        r35.close();     // Catch: IllegalStateException -> L135 IOException -> L137
        r33 = r35;
        goto L154
    L141:
        r9.e = r35.toByteArray();     // Catch: Throwable -> L139
        r35.close();     // Catch: IllegalStateException -> L135 IOException -> L137
        ?? r36 = r35;
    L151:
        r9.h = null;
        r33 = r36;
    L139:
        th = move-exception;
        r35.close();     // Catch: Throwable -> L146
        throw th;     // Catch: IllegalStateException -> L135 IOException -> L137
    L146:
        th = move-exception;
        th.addSuppressed(th);     // Catch: IllegalStateException -> L135 IOException -> L137
        throw th;     // Catch: IllegalStateException -> L135 IOException -> L137
    L137:
        e = move-exception;
        r30.e(7, e);
        r36 = r34;
    L135:
        e = move-exception;
        r30.e(8, e);
        r36 = r34;
    L154:
        byte[] r37 = (byte[]) r9.e;
        if (r37 != null) goto L260;
        boolean r38 = false;
        ?? r39 = 1;
    L234:
        if (r38 == false) goto L236;
        a(r10, r11);
    L236:
        r16 = r38;
        r17 = r39;
        goto L243
    L260:
        if (r9.a == true) goto L297;
        kf2.o("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        return;
    L297:
        ByteArrayInputStream r40 = new ByteArrayInputStream(r37);     // Catch: Throwable -> L178 IOException -> L225 FileNotFoundException -> L227
        FileOutputStream r41 = new FileOutputStream((File) r9.f);     // Catch: Throwable -> L218
        FileChannel r42 = r41.getChannel();     // Catch: Throwable -> L211
        FileLock r43 = r42.tryLock();     // Catch: Throwable -> L203
        if (r43 == null) goto L196;
    L193:
        th = th;
    L191:
        Throwable r44 = th;
        if (r43 == null) goto L306;
        r43.close();     // Catch: Throwable -> L200
    L307:
        throw r44;     // Catch: Throwable -> L188
    L200:
        th = move-exception;
        r44.addSuppressed(th);     // Catch: Throwable -> L188
        throw r44;     // Catch: Throwable -> L188
    L306:
        throw r44;     // Catch: Throwable -> L188
    L165:
        if (r43.isValid() == false) goto L196;
        byte[] r45 = new byte[512];     // Catch: Throwable -> L193
    L167:
        int r46 = r40.read(r45);     // Catch: Throwable -> L193
        if (r46 <= 0) goto L171;
        r41.write(r45, 0, r46);     // Catch: Throwable -> L193
        goto L167
    L171:
        r39 = 1;
        r9.b(1, null);     // Catch: Throwable -> L190
        r43.close();     // Catch: Throwable -> L188
        r42.close();     // Catch: Throwable -> L186
        r41.close();     // Catch: Throwable -> L184
        r40.close();     // Catch: Throwable -> L178 IOException -> L180 FileNotFoundException -> L182
        r9.e = null;
        r9.h = null;
        r38 = true;
    L196:
        throw new IOException("Unable to acquire a lock on the underlying file channel.");     // Catch: Throwable -> L190
    L188:
        th = th;
    L189:
        Throwable r47 = th;
        if (r42 == null) goto L308;
        r42.close();     // Catch: Throwable -> L208
    L309:
        throw r47;     // Catch: Throwable -> L186
    L208:
        th = move-exception;
        r47.addSuppressed(th);     // Catch: Throwable -> L186
        throw r47;     // Catch: Throwable -> L186
    L308:
        throw r47;     // Catch: Throwable -> L186
    L190:
        th = th;
    L203:
        th = th;
    L211:
        th = th;
    L187:
        Throwable r48 = th;
        r41.close();     // Catch: Throwable -> L215
    L310:
        throw r48;     // Catch: Throwable -> L184
    L215:
        th = move-exception;
        r48.addSuppressed(th);     // Catch: Throwable -> L184
        throw r48;     // Catch: Throwable -> L184
    L186:
        th = th;
    L218:
        th = th;
    L185:
        Throwable r49 = th;
        r40.close();     // Catch: Throwable -> L222
        throw r49;     // Catch: Throwable -> L178 IOException -> L180 FileNotFoundException -> L182
    L222:
        th = move-exception;
        r49.addSuppressed(th);     // Catch: Throwable -> L178 IOException -> L180 FileNotFoundException -> L182
        throw r49;     // Catch: Throwable -> L178 IOException -> L180 FileNotFoundException -> L182
    L184:
        th = th;
        goto L185
    L227:
        e = e;
        r33 = 1;
    L231:
        r9.b(6, e);     // Catch: Throwable -> L178
        ?? r50 = r33;
    L230:
        r9.e = null;
        r9.h = null;
        r38 = false;
        r39 = r50;
    L225:
        e = e;
        r33 = 1;
    L229:
        r9.b(7, e);     // Catch: Throwable -> L178
        r50 = r33;
    L182:
        e = e;
    L180:
        e = e;
    L178:
        th = move-exception;
        r9.e = null;
        r9.h = null;
        throw th;
    L269:
    L64:
        e = move-exception;
        r20.e(7, e);     // Catch: Throwable -> L60
    L253:
        r23.close();     // Catch: IOException -> L71
    L75:
        jp0[] r51 = null;
    L76:
        r9.h = r51;
    L71:
        e = move-exception;
        r20.e(7, e);
    L62:
        e = move-exception;
        r20.e(8, e);     // Catch: Throwable -> L60
        goto L253
    L54:
        if (Arrays.equals(r13, fh0.t(r23, 4)) == false) goto L67;
        r51 = si0.M(r23, fh0.t(r23, 4), (String) r9.g);     // Catch: Throwable -> L60 IllegalStateException -> L62 IOException -> L64
        r23.close();     // Catch: IOException -> L58
    L58:
        e = move-exception;
        r20.e(7, e);
        goto L76
    L67:
        throw new IllegalStateException("Invalid magic");     // Catch: Throwable -> L60 IllegalStateException -> L62 IOException -> L64
    L60:
        th = move-exception;
        r23.close();     // Catch: IOException -> L79
        throw th;
    L79:
        e = move-exception;
        r20.e(7, e);
        throw th;
    L48:
        e = move-exception;
        r20.e(6, e);
    L50:
        r23 = 0;
    L46:
        e = move-exception;
        r20.e(7, e);
        goto L50
    L35:
        if (r8.canWrite() == true) goto L43;
        r9.b(4, null);
    L249:
        e = move-exception;
        r20.e(7, e);
        wq3.c(r18, false);
    }
}
