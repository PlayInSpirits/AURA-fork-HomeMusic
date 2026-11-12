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
    public static volatile String e;
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    public static final Object b = new Object();
    public static final ExecutorService c = Executors.newSingleThreadExecutor();
    public static final k03 d = new k03();
    public static volatile boolean f = false;
    public static volatile boolean g = false;

    public static String a(String str, String str2, String str3) {
        if (str != null && !str.isEmpty()) {
            str2 = b11.o(str, " - ", str2);
        }
        if (str3 != null && !str3.isEmpty()) {
            str2 = str2 + " (" + str3 + ")";
        }
        return f(str2);
    }

    public static void b(Child child) {
        c();
        if (e == null) {
            return;
        }
        String strA = a(child.getArtist(), child.getTitle(), child.getAlbum());
        ConcurrentHashMap concurrentHashMap = a;
        af4 af4Var = (af4) concurrentHashMap.get(strA);
        if ((af4Var == null || !af4Var.b()) ? false : af4Var.a()) {
            concurrentHashMap.remove(strA);
            j51.K(strA);
        }
    }

    public static void c() {
        String strO = ud3.o();
        if (strO == null) {
            synchronized (b) {
                a.clear();
                e = null;
            }
            j51.o();
            return;
        }
        if (strO.equals(e)) {
            return;
        }
        synchronized (b) {
            try {
                if (f) {
                    return;
                }
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    if (f) {
                        g = true;
                    } else {
                        f = true;
                        c.execute(new u6(3));
                    }
                    return;
                }
                f = true;
                try {
                    h();
                } finally {
                    g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Uri d(String str, String str2, String str3) {
        af4 af4Var;
        c();
        if (e == null || (af4Var = (af4) a.get(a(str, str2, str3))) == null || !af4Var.b()) {
            return null;
        }
        return af4Var.d();
    }

    public static Uri e(Child child) {
        return d(child.getArtist(), child.getTitle(), child.getAlbum());
    }

    public static String f(String str) {
        return Normalizer.normalize(str.replaceAll("[\\/:*?\\\"<>|]", "_").replaceAll("\\s+", " ").trim(), Normalizer.Form.NFKD).replaceAll("\\p{InCombiningDiacriticalMarks}+", "").toLowerCase(Locale.ROOT);
    }

    public static void g() {
        boolean z;
        Object obj = b;
        synchronized (obj) {
            f = false;
            z = g;
            g = false;
        }
        d.i(Long.valueOf(SystemClock.elapsedRealtime()));
        if (z) {
            synchronized (obj) {
                if (f) {
                    g = true;
                } else {
                    f = true;
                    c.execute(new u6(3));
                }
            }
        }
    }

    public static void h() {
        Map map;
        String strC;
        String strO = ud3.o();
        if (strO == null) {
            synchronized (b) {
                a.clear();
                e = null;
            }
            j51.o();
            return;
        }
        Context contextA = App.a();
        Uri uri = Uri.parse(strO);
        af4 af4Var = new af4(contextA, DocumentsContract.buildDocumentUriUsingTree(uri, DocumentsContract.getTreeDocumentId(uri)));
        synchronized (j51.class) {
            JSONObject jSONObjectI = j51.I();
            if (jSONObjectI.length() == 0) {
                map = Collections.EMPTY_MAP;
            } else {
                HashMap map2 = new HashMap();
                Iterator<String> itKeys = jSONObjectI.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    long jOptLong = jSONObjectI.optLong(next, -1L);
                    if (jOptLong > 0) {
                        map2.put(next, Long.valueOf(jOptLong));
                    }
                }
                map = map2;
            }
        }
        HashSet hashSet = new HashSet();
        HashMap map3 = new HashMap();
        Context context = af4Var.b;
        Uri uri2 = af4Var.c;
        if (context.checkCallingOrSelfUriPermission(uri2, 1) == 0 && !TextUtils.isEmpty(h12.K(context, uri2, "mime_type"))) {
            for (af4 af4Var2 : af4Var.g()) {
                if (af4Var2 != null && !af4Var2.e() && (strC = af4Var2.c()) != null) {
                    String strF = f(strC.replaceFirst("\\.[^\\.]+$", ""));
                    Long l = (Long) map.get(strF);
                    long jF = af4Var2.f();
                    if (l == null || l.longValue() <= 0 || jF != l.longValue()) {
                        j51.K(strF);
                    } else {
                        map3.put(strF, af4Var2);
                        hashSet.add(strF);
                    }
                }
            }
        }
        if (!map.isEmpty()) {
            if (hashSet.isEmpty()) {
                j51.o();
            } else {
                for (String str : map.keySet()) {
                    if (!hashSet.contains(str)) {
                        j51.K(str);
                    }
                }
            }
        }
        synchronized (b) {
            ConcurrentHashMap concurrentHashMap = a;
            concurrentHashMap.clear();
            concurrentHashMap.putAll(map3);
            e = strO;
        }
    }

    public static void i() {
        Object obj = b;
        synchronized (obj) {
            e = null;
            a.clear();
        }
        synchronized (obj) {
            if (f) {
                g = true;
            } else {
                f = true;
                c.execute(new u6(3));
            }
        }
    }
}
