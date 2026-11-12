package defpackage;

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.os.SystemClock
 */
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.database.AppDatabase;
import com.eddyizm.tempus.model.Download;
import com.eddyizm.tempus.subsonic.models.Child;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.text.Normalizer;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class i51 {
    public static final ExecutorService a = Executors.newSingleThreadExecutor();
    public static final ConcurrentHashMap.KeySetView b = ConcurrentHashMap.newKeySet();

    public static void a(Context context, Child child) {
        i51.b(context, child, null, null, false);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static void b(Context object, Child child, String string, String string2, boolean bl5) {
        nt0 nt02;
        if (object == null) return;
        if (child == null) {
            return;
        }
        Context context = object.getApplicationContext();
        gn2 gn22 = gi1.G(child);
        object = child.getTitle() != null ? child.getTitle() : child.getId();
        if (bl5) {
            nt02 = new nt0(false);
        } else {
            if (nt0.l == null) {
                // MONITORENTER : nt0.class
                if (nt0.l == null) {
                    nt0.l = nt02 = new nt0(true);
                }
            }
            nt02 = nt0.l;
        }
        Object object2 = nt02.a;
        // MONITORENTER : object2
        ++nt02.c;
        if (nt02.g == 0L) {
            nt02.g = SystemClock.elapsedRealtime();
        }
        nt02.d(context.getApplicationContext());
        // MONITOREXIT : object2
        b.add(child.getId());
        a.execute(new h51(context, gn22, (String)object, child, string, string2, nt02, bl5));
    }

    public static af4 c(af4 object, String string) {
        string = i51.d(string);
        for (af4 af42 : ((af4)object).g()) {
            if (af42.e() || (object = af42.c()) == null || !i51.d((String)object).equals(string)) continue;
            return af42;
        }
        return null;
    }

    public static String d(String string) {
        return Normalizer.normalize(i51.h(string), Normalizer.Form.NFKD).replaceAll("\\p{InCombiningDiacriticalMarks}+", "").toLowerCase(Locale.ROOT);
    }

    public static InputStream e(Context object, Uri uri, String string, HttpURLConnection httpURLConnection, File file) {
        int n16 = string.hashCode();
        int n17 = -1;
        switch (n16) {
            default: {
                break;
            }
            case 951530617: {
                if (!string.equals("content")) break;
                n17 = 3;
                break;
            }
            case 99617003: {
                if (!string.equals("https")) break;
                n17 = 2;
                break;
            }
            case 3213448: {
                if (!string.equals("http")) break;
                n17 = 1;
                break;
            }
            case 3143036: {
                if (!string.equals("file")) break;
                n17 = 0;
            }
        }
        switch (n17) {
            default: {
                mj0.i("Unsupported scheme ".concat(string));
                return null;
            }
            case 3: {
                object = object.getContentResolver().openInputStream(uri);
                if (object != null) {
                    return object;
                }
                mj0.i("Cannot open content stream");
                return null;
            }
            case 1: 
            case 2: {
                if (httpURLConnection != null) {
                    return httpURLConnection.getInputStream();
                }
                mj0.i("Connection not initialized");
                return null;
            }
            case 0: 
        }
        if (file != null && file.exists()) {
            return new FileInputStream(file);
        }
        mj0.i("Missing source file");
        return null;
    }

    /*
     * Exception decompiling
     */
    public static void f(Context var0, gn2 var1_5, String var2_8, Child var3_15, String var4_23, String var5_25, nt0 var6_30, boolean var7_31) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 2[TRYBLOCK] [6, 5 : 660->676)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public static void g(Child object, Uri uri, String string, String string2) {
        if (object == null) {
            return;
        }
        Download download = new Download((Child)object);
        object = e03.a;
        if (xa3.u("audio_transcode_download", false) && !xa3.u("audio_transcode_download_priority", false)) {
            String string3 = e03.l();
            boolean bl5 = e03.l().equals("raw");
            object = "0";
            if (!bl5) {
                ((Object)((Object)App.b())).getClass();
                object = App.c().getString("max_bitrate_download", "0");
                object.getClass();
            }
            e03.a(download, string3, (String)object);
        }
        download.setDownloadState(1);
        download.setPlaylistId(string);
        download.setPlaylistName(string2);
        if (uri != null) {
            download.setDownloadUri(uri.toString());
        }
        new Thread(new lg1(11, AppDatabase.y().w(), download)).start();
    }

    public static String h(String string) {
        return string.replaceAll("[\\/:*?\\\"<>|]", "_").replaceAll("\\s+", " ").trim();
    }
}

