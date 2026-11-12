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

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bk implements Callback {
    public final /* synthetic */ int n;
    public int o;
    public boolean p;
    public Object q;
    public Object r;

    public bk(Context r2) {
        this.n = 2;
        this.q = r2;
        this.r = new mj0(5);
        go4 r3 = yl0.h;
        this.o = R.string.default_notification_channel_name;
    }

    public static bk b() {
        bk r0 = new bk();
        r0.p = true;
        r0.o = 0;
        return r0;
    }

    private final void d(Call r1, Throwable r2) {
    }

    private final void e(Call r1, Throwable r2) {
    }

    public bk a() {
        if (((zy3) this.q) == null) goto L5;
        boolean r0 = true;
    L6:
        ji2.h("execute parameter required", r0);
        return new bk(this, (p61[]) this.r, this.p, this.o);
    L5:
        r0 = false;
        goto L6
    }

    public void c(int r4) {
        switch(this.n) {
            case 1: goto L13;
            default: goto L4;
        };
    L4:
        SideSheetBehavior r0 = (SideSheetBehavior) this.r;
        WeakReference r2 = r0.C;
        if (r2 != null) goto L7;
        return;
    L7:
        if (r2.get() == null) goto L24;
        this.o = r4;
        if (this.p == true) goto L23;
        View r5 = (View) r0.C.get();
        jq3 r1 = (jq3) this.q;
        WeakHashMap r3 = j65.a;
        r5.postOnAnimation(r1);
        this.p = true;
        return;
    L23:
        return;
    L24:
        return;
    L13:
        BottomSheetBehavior r6 = (BottomSheetBehavior) this.r;
        WeakReference r7 = r6.h0;
        if (r7 != null) goto L16;
        return;
    L16:
        if (r7.get() == null) goto L27;
        this.o = r4;
        if (this.p == true) goto L26;
        View r8 = (View) r6.h0.get();
        g5 r9 = (g5) this.q;
        WeakHashMap r10 = j65.a;
        r8.postOnAnimation(r9);
        this.p = true;
        return;
    L26:
        return;
    }

    @Override // retrofit2.Callback
    public void onFailure(Call r1, Throwable r2) {
        int r0 = this.n;
    }

    @Override // retrofit2.Callback
    public void onResponse(Call r6, Response r7) {
        switch(this.n) {
            case 0: goto L17;
            default: goto L4;
        };
    L4:
        k03 r8 = (k03) this.q;
        if (r7.isSuccessful() == true) goto L7;
        return;
    L7:
        if (r7.body() != null) goto L9;
        return;
    L9:
        if (((ApiResponse) r7.body()).getSubsonicResponse().getPlaylists() != null) goto L11;
        return;
    L11:
        if (((ApiResponse) r7.body()).getSubsonicResponse().getPlaylists().getPlaylists() == null) goto L33;
        List<Playlist> r9 = ((ApiResponse) r7.body()).getSubsonicResponse().getPlaylists().getPlaylists();
        int r4 = 11;
        new Thread(new ur2(r4, (mm3) this.r, r9)).start();
        if (this.p == false) goto L15;
        Collections.shuffle(r9);
        r8.k(r9.subList(0, Math.min(r9.size(), this.o)));
        return;
    L15:
        r8.k(r9);
        return;
    L33:
        return;
    L17:
        k03 r10 = (k03) this.q;
        pa r1 = (pa) this.r;
        if (r7.isSuccessful() == true) goto L20;
        return;
    L20:
        if (r7.body() != null) goto L22;
        return;
    L22:
        if (((ApiResponse) r7.body()).getSubsonicResponse().getStarred2() == null) goto L37;
        List<ArtistID3> r11 = ((ApiResponse) r7.body()).getSubsonicResponse().getStarred2().getArtists();
        if (r11 != null) goto L26;
        return;
    L26:
        if (this.p == true) goto L28;
        r1.x(r11, r10);
        return;
    L28:
        Collections.shuffle(r11);
        r1.x(r11.subList(0, Math.min(this.o, r11.size())), r10);
        return;
    }

    public bk(bk r2, p61[] r3, boolean r4, int r5) {
        this.n = 8;
        this.r = r2;
        this.q = r3;
        boolean r6 = false;
        if (r3 == null) goto L6;
        if (r4 == false) goto L6;
        r6 = true;
    L6:
        this.p = r6;
        this.o = r5;
    }

    public /* synthetic */ bk(Object r1, boolean r2, k03 r3, int r4, int r5) {
        this.n = r5;
        this.r = r1;
        this.p = r2;
        this.q = r3;
        this.o = r4;
    }

    public /* synthetic */ bk() {
        this.n = 7;
    }

    public bk(SideSheetBehavior r2) {
        this.n = 6;
        this.r = r2;
        this.q = new jq3(7, this);
    }

    public bk(BottomSheetBehavior r2) {
        this.n = 1;
        this.r = r2;
        this.q = new g5(5, this);
    }

    public bk(boolean r2, int r3, String r4, Bundle r5) {
        this.n = 4;
        this.p = r2;
        this.o = r3;
        this.q = r4;
        if (r5 != null) goto L6;
        r5 = Bundle.EMPTY;
    L6:
        this.r = r5;
    }

    public bk(Context r2, ja r3) {
        this.n = 3;
        this.q = r3;
        this.o = 0;
        this.r = new GestureDetector(r2, new ny1(this));
    }
}
