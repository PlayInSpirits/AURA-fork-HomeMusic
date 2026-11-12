package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.subsonic.models.Child;
import java.text.Normalizer;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g51 {
    public static final ConcurrentHashMap a = null;
    public static final Object b = null;
    public static final ExecutorService c = null;
    public static final k03 d = null;
    public static volatile String e;
    public static volatile boolean f;
    public static volatile boolean g;

    static {
        a = new ConcurrentHashMap();
        b = new Object();
        c = Executors.newSingleThreadExecutor();
        d = new k03();
        f = false;
        g = false;
    }

    public static String a(String r1, String r2, String r3) {
        if (r1 != null) goto L4;
    L6:
        if (r3 == null) goto L11;
        if (r3.isEmpty() == true) goto L11;
        r2 = r2 + " (" + r3 + ")";
    L11:
        return f(r2);
    L4:
        if (r1.isEmpty() == true) goto L6;
        r2 = b11.o(r1, " - ", r2);
        goto L6
    }

    public static void b(Child r3) {
        c();
        if (e == null) goto L15;
        String r4 = a(r3.getArtist(), r3.getTitle(), r3.getAlbum());
        ConcurrentHashMap r0 = a;
        af4 r1 = (af4) r0.get(r4);
        if (r1 != null) goto L8;
    L10:
        boolean r2 = false;
    L11:
        if (r2 == false) goto L14;
        r0.remove(r4);
        j51.K(r4);
        return;
    L14:
        return;
    L8:
        if (r1.b() == false) goto L10;
        r2 = r1.a();
        goto L11
    }

    public static void c() {
        String r0 = ud3.o();
        if (r0 != null) goto L14;
        Object r1 = b;
        monitor-enter(r1);
        a.clear();     // Catch: Throwable -> L10
        e = null;     // Catch: Throwable -> L10
        monitor-exit(r1);     // Catch: Throwable -> L10
        j51.o();
        return;
    L10:
        th = move-exception;
        throw th;
    L14:
        if (r0.equals(e) == false) goto L16;
        return;
    L16:
        Object r2 = b;
        monitor-enter(r2);
    L22:
        th = move-exception;
        throw th;
    L19:
        if (f == false) goto L25;
        monitor-exit(r2);     // Catch: Throwable -> L22
        return;
    L25:
        if (Looper.myLooper() == Looper.getMainLooper()) goto L27;
        f = true;     // Catch: Throwable -> L22
        monitor-exit(r2);     // Catch: Throwable -> L22
        h();     // Catch: Throwable -> L37
        g();
        return;
    L37:
        th = move-exception;
        g();
        throw th;
    L27:
        if (f == false) goto L29;
        g = true;     // Catch: Throwable -> L22
    L30:
        monitor-exit(r2);     // Catch: Throwable -> L22
        return;
    L29:
        f = true;     // Catch: Throwable -> L22
        c.execute(new u6(3));     // Catch: Throwable -> L22
        goto L30
    }

    public static Uri d(String r1, String r2, String r3) {
        c();
        if (e == null) goto L14;
        af4 r4 = (af4) a.get(a(r1, r2, r3));
        if (r4 != null) goto L8;
        return null;
    L8:
        if (r4.b() == true) goto L10;
        return null;
    L10:
        return r4.d();
    L14:
        return null;
    }

    public static Uri e(Child r2) {
        return d(r2.getArtist(), r2.getTitle(), r2.getAlbum());
    }

    public static String f(String r2) {
        return Normalizer.normalize(r2.replaceAll("[\\/:*?\\\"<>|]", "_").replaceAll("\\s+", " ").trim(), Normalizer.Form.NFKD).replaceAll("\\p{InCombiningDiacriticalMarks}+", "").toLowerCase(Locale.ROOT);
    }

    public static void g() {
        Object r0 = b;
        monitor-enter(r0);
        f = false;     // Catch: Throwable -> L20
        boolean r2 = g;     // Catch: Throwable -> L20
        g = false;     // Catch: Throwable -> L20
        monitor-exit(r0);     // Catch: Throwable -> L20
        d.i(Long.valueOf(SystemClock.elapsedRealtime()));
        if (r2 == false) goto L19;
        monitor-enter(r0);
    L16:
        th = move-exception;
        throw th;
    L11:
        if (f == false) goto L13;
        g = true;     // Catch: Throwable -> L16
    L14:
        monitor-exit(r0);     // Catch: Throwable -> L16
        return;
    L13:
        f = true;     // Catch: Throwable -> L16
        c.execute(new u6(3));     // Catch: Throwable -> L16
        goto L14
    L19:
        return;
    L20:
        th = move-exception;
        throw th;
    }

    public static void h() {
        String r0 = ud3.o();
        if (r0 != null) goto L13;
        Object r1 = b;
        monitor-enter(r1);
        a.clear();     // Catch: Throwable -> L10
        e = null;     // Catch: Throwable -> L10
        monitor-exit(r1);     // Catch: Throwable -> L10
        j51.o();
        return;
    L10:
        th = move-exception;
        throw th;
    L13:
        Context r2 = App.a();
        Uri r3 = Uri.parse(r0);
        af4 r4 = new af4(r2, DocumentsContract.buildDocumentUriUsingTree(r3, DocumentsContract.getTreeDocumentId(r3)));
        monitor-enter(j51.class);
        JSONObject r5 = j51.I();     // Catch: Throwable -> L20
        if (r5.length() != 0) goto L22;
        Map r6 = Collections.EMPTY_MAP;     // Catch: Throwable -> L20
        monitor-exit(j51.class);
    L31:
        HashSet r7 = new HashSet();
        HashMap r8 = new HashMap();
        Context r9 = r4.b;
        Uri r10 = r4.c;
        if (r9.checkCallingOrSelfUriPermission(r10, 1) != 0) goto L57;
        if (TextUtils.isEmpty(h12.K(r9, r10, "mime_type")) == true) goto L57;
        af4[] r11 = r4.g();
        int r12 = r11.length;
        int r13 = 0;
    L38:
        if (r13 >= r12) goto L57;
        af4 r14 = r11[r13];
        if (r14 == null) goto L55;
        if (r14.e() == true) goto L55;
        String r15 = r14.c();
        if (r15 == null) goto L55;
        String r16 = f(r15.replaceFirst("\\.[^\\.]+$", ""));
        Long r17 = (Long) r6.get(r16);
        long r18 = r14.f();
        if (r17 != null) goto L50;
    L54:
        j51.K(r16);
        goto L55
    L50:
        if (r17.longValue() <= 0) goto L54;
        if (r18 != r17.longValue()) goto L54;
        r8.put(r16, r14);
        r7.add(r16);
    L55:
        r13 = r13 + 1;
    L57:
        if (r6.isEmpty() == false) goto L59;
    L67:
        Object r19 = b;
        monitor-enter(r19);
        ConcurrentHashMap r20 = a;     // Catch: Throwable -> L72
        r20.clear();     // Catch: Throwable -> L72
        r20.putAll(r8);     // Catch: Throwable -> L72
        e = r0;     // Catch: Throwable -> L72
        monitor-exit(r19);     // Catch: Throwable -> L72
        return;
    L72:
        th = move-exception;
        throw th;
    L59:
        if (r7.isEmpty() == false) goto L61;
        j51.o();
        goto L67
    L61:
        Iterator r21 = r6.keySet().iterator();
    L63:
        if (r21.hasNext() == false) goto L67;
        String r22 = (String) r21.next();
        if (r7.contains(r22) == true) goto L63;
        j51.K(r22);
        goto L63
    L22:
        HashMap r23 = new HashMap();     // Catch: Throwable -> L20
        Iterator<String> r24 = r5.keys();     // Catch: Throwable -> L20
    L24:
        if (r24.hasNext() == false) goto L29;
        String r25 = r24.next();     // Catch: Throwable -> L20
        long r26 = r5.optLong(r25, -1);     // Catch: Throwable -> L20
        if (r26 <= 0) goto L24;
        r23.put(r25, Long.valueOf(r26));     // Catch: Throwable -> L20
        goto L24
    L29:
        monitor-exit(j51.class);
        r6 = r23;
    L20:
        th = move-exception;
        throw th;
    }

    public static void i() {
        Object r0 = b;
        monitor-enter(r0);
        e = null;     // Catch: Throwable -> L17
        a.clear();     // Catch: Throwable -> L17
        monitor-exit(r0);     // Catch: Throwable -> L17
        monitor-enter(r0);
    L14:
        th = move-exception;
        throw th;
    L9:
        if (f == false) goto L11;
        g = true;     // Catch: Throwable -> L14
    L12:
        monitor-exit(r0);     // Catch: Throwable -> L14
        return;
    L11:
        f = true;     // Catch: Throwable -> L14
        c.execute(new u6(3));     // Catch: Throwable -> L14
    L17:
        th = move-exception;
        throw th;
    }
}
