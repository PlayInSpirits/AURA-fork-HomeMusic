package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class aj implements dk, pi1 {
    public final /* synthetic */ Context n;

    public /* synthetic */ aj(Context r1) {
        this.n = r1;
    }

    @Override // defpackage.dk
    public void e(ArrayList r5) {
        Log.d("ArtistSync", "Callback triggered with songs: " + r5.size());
        if (r5.isEmpty() == true) goto L6;
        Log.d("ArtistSync", "Starting download of " + r5.size() + " songs");
        au0.w(this.n).a(gi1.H(r5), (List) r5.stream().map(new hu3(6)).collect(Collectors.toList()), false);
        Log.d("ArtistSync", "Download started successfully");
        return;
    L6:
        Log.d("ArtistSync", "No songs to download");
    }

    @Override // defpackage.pi1
    public Object get() {
        return (ConnectivityManager) this.n.getSystemService("connectivity");
    }
}
