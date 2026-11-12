package defpackage;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.PowerManager;
import app.homemusic.R;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w85 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    public /* synthetic */ w85(int i, Object obj, Object obj2) {
        this.n = i;
        this.p = obj;
        this.o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PowerManager.WakeLock wakeLock;
        String string;
        String str;
        String string2;
        String str2;
        String str3;
        String strI;
        do2 do2Var;
        WifiManager.WifiLock wifiLock;
        switch (this.n) {
            case 0:
                y10 y10Var = (y10) this.p;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.o;
                xc5 xc5Var = (xc5) y10Var.d;
                xc5Var.getClass();
                if (atomicBoolean.get()) {
                    new Thread(new w85(1, xc5Var, atomicBoolean), "ExoPlayer:WakeLockManager").start();
                    return;
                }
                return;
            case 1:
                xc5 xc5Var2 = (xc5) this.p;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.o;
                synchronized (xc5Var2) {
                    if (atomicBoolean2.get() && (wakeLock = (PowerManager.WakeLock) xc5Var2.p) != null) {
                        wakeLock.release();
                    }
                    break;
                }
                return;
            case 2:
                bl2 bl2Var = (bl2) this.p;
                Context context = (Context) this.o;
                try {
                    if (bl2Var.isDone()) {
                        sk2 sk2Var = (sk2) bl2Var.get();
                        gn2 gn2VarA = sk2Var.a();
                        String string3 = null;
                        if (gn2VarA == null || (do2Var = gn2VarA.d) == null) {
                            string = null;
                            str = null;
                            string2 = null;
                            str2 = null;
                            str3 = null;
                            strI = null;
                        } else {
                            Bundle bundle = do2Var.I;
                            CharSequence charSequence = do2Var.a;
                            String string4 = charSequence != null ? charSequence.toString() : null;
                            CharSequence charSequence2 = do2Var.b;
                            String string5 = charSequence2 != null ? charSequence2.toString() : null;
                            CharSequence charSequence3 = do2Var.c;
                            string = charSequence3 != null ? charSequence3.toString() : null;
                            if (bundle != null) {
                                string3 = string4 == null ? bundle.getString("title") : string4;
                                string2 = string5 == null ? bundle.getString("artist") : string5;
                                if (string == null) {
                                    string = bundle.getString("album");
                                }
                                String string6 = bundle.getString("coverArtId");
                                String string7 = bundle.getString("assetLinkSong");
                                if (string7 == null) {
                                    string7 = l93.i("song", bundle.getString("id"));
                                }
                                String string8 = bundle.getString("assetLinkAlbum");
                                String strI2 = string8 == null ? l93.i("album", bundle.getString("albumId")) : string8;
                                String string9 = bundle.getString("assetLinkArtist");
                                if (string9 == null) {
                                    str3 = strI2;
                                    strI = l93.i("artist", bundle.getString("artistId"));
                                    str = string6;
                                    str2 = string7;
                                } else {
                                    str3 = strI2;
                                    str = string6;
                                    str2 = string7;
                                    strI = string9;
                                }
                            } else {
                                str = null;
                                str2 = null;
                                str3 = null;
                                strI = null;
                                string3 = string4;
                                string2 = string5;
                            }
                        }
                        long jM0 = sk2Var.M0();
                        long duration = sk2Var.getDuration();
                        if (jM0 == -9223372036854775807L) {
                            jM0 = 0;
                        }
                        long j = duration == -9223372036854775807L ? 0L : duration;
                        if (string3 == null) {
                            string3 = context.getString(R.string.widget_not_playing);
                        }
                        String str4 = string3;
                        if (string2 == null) {
                            string2 = context.getString(R.string.widget_placeholder_subtitle);
                        }
                        ji2.T(context, str4, string2, string, str, sk2Var.h0(), sk2Var.D0(), sk2Var.h(), jM0, j, str2, str3, strI);
                        sk2Var.Y0();
                        return;
                    }
                    return;
                } catch (InterruptedException | ExecutionException unused) {
                    return;
                }
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                y10 y10Var2 = (y10) this.p;
                AtomicBoolean atomicBoolean3 = (AtomicBoolean) this.o;
                rf2 rf2Var = (rf2) y10Var2.d;
                rf2Var.getClass();
                if (atomicBoolean3.get()) {
                    new Thread(new w85(4, rf2Var, atomicBoolean3), "ExoPlayer:WifiLockManager").start();
                    return;
                }
                return;
            case 4:
                rf2 rf2Var2 = (rf2) this.p;
                AtomicBoolean atomicBoolean4 = (AtomicBoolean) this.o;
                synchronized (rf2Var2) {
                    if (atomicBoolean4.get() && (wifiLock = (WifiManager.WifiLock) rf2Var2.o) != null) {
                        wifiLock.release();
                    }
                    break;
                }
                return;
            default:
                wd5 wd5Var = (wd5) this.p;
                ea2 ea2Var = (ea2) this.o;
                if (wd5Var.p) {
                    return;
                }
                wd5Var.q = ea2Var;
                ea2Var.a(wd5Var);
                return;
        }
    }
}
