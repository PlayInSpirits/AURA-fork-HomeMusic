package defpackage;

import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.a;
import com.eddyizm.tempus.App;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xt3 {
    public static final ExecutorService a = Executors.newFixedThreadPool(2);

    public static vz3 a(vz3 vz3Var, Uri uri) {
        return (uri == null || !"file".equals(uri.getScheme()) || uri.getPath() == null) ? vz3Var : (vz3) vz3Var.w(new s73(Long.valueOf(new File(uri.getPath()).lastModified())));
    }

    public static void b(String str, String str2) {
        if (str2 == null || str2.isEmpty()) {
            return;
        }
        a.execute(new ur2(15, str, str2));
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0077 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static void c(File file, String str) {
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(str).openConnection();
                try {
                    httpURLConnection2.setConnectTimeout(15000);
                    httpURLConnection2.setReadTimeout(15000);
                    httpURLConnection2.setInstanceFollowRedirects(true);
                    int responseCode = httpURLConnection2.getResponseCode();
                    if (responseCode != 200) {
                        Log.w("RadioCoverArtDownloader", "HTTP " + responseCode + " downloading cover from " + str);
                        httpURLConnection2.disconnect();
                        return;
                    }
                    InputStream inputStream = httpURLConnection2.getInputStream();
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            byte[] bArr = new byte[8192];
                            while (true) {
                                int i = inputStream.read(bArr);
                                if (i == -1) {
                                    fileOutputStream.close();
                                    inputStream.close();
                                    httpURLConnection2.disconnect();
                                    return;
                                }
                                fileOutputStream.write(bArr, 0, i);
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (Throwable th) {
                                        th.addSuppressed(th);
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        throw th4;
                    }
                } catch (Exception e) {
                    e = e;
                    httpURLConnection = httpURLConnection2;
                    Log.e("RadioCoverArtDownloader", "Failed to download cover from " + str, e);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                } catch (Throwable th5) {
                    th = th5;
                    httpURLConnection = httpURLConnection2;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public static void d(File file, String str) {
        try {
            File file2 = (File) ((vz3) a.c(App.a()).p().P(str).e(xq0.d)).R(Integer.MIN_VALUE, Integer.MIN_VALUE).get();
            if (file2 == null || !file2.exists()) {
                return;
            }
            FileInputStream fileInputStream = new FileInputStream(file2);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int i = fileInputStream.read(bArr);
                        if (i == -1) {
                            fileOutputStream.close();
                            fileInputStream.close();
                            return;
                        }
                        fileOutputStream.write(bArr, 0, i);
                        try {
                            fileInputStream.close();
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                fileInputStream.close();
                throw th4;
            }
        } catch (Exception e) {
            Log.e("RadioCoverArtDownloader", "Failed to download cover via Glide from ".concat(str), e);
        }
    }

    public static File e(String str) {
        File file = new File(App.a().getFilesDir(), "radio_covers");
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str);
    }
}
