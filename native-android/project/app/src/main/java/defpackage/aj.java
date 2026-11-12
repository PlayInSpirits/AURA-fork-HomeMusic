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

    public /* synthetic */ aj(Context context) {
        this.n = context;
    }

    @Override // defpackage.dk
    public void e(ArrayList arrayList) {
        Log.d("ArtistSync", "Callback triggered with songs: " + arrayList.size());
        if (arrayList.isEmpty()) {
            Log.d("ArtistSync", "No songs to download");
            return;
        }
        Log.d("ArtistSync", "Starting download of " + arrayList.size() + " songs");
        au0.w(this.n).a(gi1.H(arrayList), (List) arrayList.stream().map(new hu3(6)).collect(Collectors.toList()), false);
        Log.d("ArtistSync", "Download started successfully");
    }

    @Override // defpackage.pi1
    public Object get() {
        return (ConnectivityManager) this.n.getSystemService("connectivity");
    }
}
