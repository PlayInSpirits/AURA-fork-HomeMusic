package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.View;
import app.homemusic.R;
import com.eddyizm.tempus.subsonic.base.ApiResponse;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import com.eddyizm.tempus.subsonic.models.Playlist;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class bk implements Callback {
    public final /* synthetic */ int n;
    public int o;
    public boolean p;
    public Object q;
    public Object r;

    public bk(Context context) {
        this.n = 2;
        this.q = context;
        this.r = new mj0(5);
        go4 go4Var = yl0.h;
        this.o = R.string.default_notification_channel_name;
    }

    public static bk b() {
        bk bkVar = new bk();
        bkVar.p = true;
        bkVar.o = 0;
        return bkVar;
    }

    public bk a() {
        ji2.h("execute parameter required", ((zy3) this.q) != null);
        return new bk(this, (p61[]) this.r, this.p, this.o);
    }

    public void c(int i) {
        switch (this.n) {
            case 1:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.r;
                WeakReference weakReference = bottomSheetBehavior.h0;
                if (weakReference != null && weakReference.get() != null) {
                    this.o = i;
                    if (!this.p) {
                        View view = (View) bottomSheetBehavior.h0.get();
                        g5 g5Var = (g5) this.q;
                        WeakHashMap weakHashMap = j65.a;
                        view.postOnAnimation(g5Var);
                        this.p = true;
                        break;
                    }
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.r;
                WeakReference weakReference2 = sideSheetBehavior.C;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.o = i;
                    if (!this.p) {
                        View view2 = (View) sideSheetBehavior.C.get();
                        jq3 jq3Var = (jq3) this.q;
                        WeakHashMap weakHashMap2 = j65.a;
                        view2.postOnAnimation(jq3Var);
                        this.p = true;
                        break;
                    }
                }
                break;
        }
    }

    @Override // retrofit2.Callback
    public void onFailure(Call call, Throwable th) {
        int i = this.n;
    }

    @Override // retrofit2.Callback
    public void onResponse(Call call, Response response) {
        List<ArtistID3> artists;
        switch (this.n) {
            case 0:
                k03 k03Var = (k03) this.q;
                pa paVar = (pa) this.r;
                if (response.isSuccessful() && response.body() != null && ((ApiResponse) response.body()).getSubsonicResponse().getStarred2() != null && (artists = ((ApiResponse) response.body()).getSubsonicResponse().getStarred2().getArtists()) != null) {
                    if (!this.p) {
                        paVar.x(artists, k03Var);
                        break;
                    } else {
                        Collections.shuffle(artists);
                        paVar.x(artists.subList(0, Math.min(this.o, artists.size())), k03Var);
                        break;
                    }
                }
                break;
            default:
                k03 k03Var2 = (k03) this.q;
                if (response.isSuccessful() && response.body() != null && ((ApiResponse) response.body()).getSubsonicResponse().getPlaylists() != null && ((ApiResponse) response.body()).getSubsonicResponse().getPlaylists().getPlaylists() != null) {
                    List<Playlist> playlists = ((ApiResponse) response.body()).getSubsonicResponse().getPlaylists().getPlaylists();
                    new Thread(new ur2(11, (mm3) this.r, playlists)).start();
                    if (!this.p) {
                        k03Var2.k(playlists);
                        break;
                    } else {
                        Collections.shuffle(playlists);
                        k03Var2.k(playlists.subList(0, Math.min(playlists.size(), this.o)));
                        break;
                    }
                }
                break;
        }
    }

    public bk(bk bkVar, p61[] p61VarArr, boolean z, int i) {
        this.n = 8;
        this.r = bkVar;
        this.q = p61VarArr;
        boolean z2 = false;
        if (p61VarArr != null && z) {
            z2 = true;
        }
        this.p = z2;
        this.o = i;
    }

    public /* synthetic */ bk(Object obj, boolean z, k03 k03Var, int i, int i2) {
        this.n = i2;
        this.r = obj;
        this.p = z;
        this.q = k03Var;
        this.o = i;
    }

    public /* synthetic */ bk() {
        this.n = 7;
    }

    public bk(SideSheetBehavior sideSheetBehavior) {
        this.n = 6;
        this.r = sideSheetBehavior;
        this.q = new jq3(7, this);
    }

    public bk(BottomSheetBehavior bottomSheetBehavior) {
        this.n = 1;
        this.r = bottomSheetBehavior;
        this.q = new g5(5, this);
    }

    public bk(boolean z, int i, String str, Bundle bundle) {
        this.n = 4;
        this.p = z;
        this.o = i;
        this.q = str;
        this.r = bundle == null ? Bundle.EMPTY : bundle;
    }

    public bk(Context context, ja jaVar) {
        this.n = 3;
        this.q = jaVar;
        this.o = 0;
        this.r = new GestureDetector(context, new ny1(this));
    }

    private final void d(Call call, Throwable th) {
    }

    private final void e(Call call, Throwable th) {
    }
}
