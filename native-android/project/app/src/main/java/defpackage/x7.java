package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import androidx.media3.session.MediaLibraryService;
import com.eddyizm.tempus.interfaces.DecadesCallback;
import com.eddyizm.tempus.subsonic.base.ApiResponse;
import com.eddyizm.tempus.subsonic.models.Child;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class x7 implements Callback, DecadesCallback, d14, f4, xs, th4, j45 {
    public final /* synthetic */ int n;
    public int o;
    public Object p;

    public x7(int r2) {
        this.n = r2;
        switch(r2) {
            case 13: goto L6;
            default: goto L4;
        };
    L4:
        this.p = Bitmap.CompressFormat.JPEG;
        this.o = 100;
        return;
    L6:
        this.p = new be3(8);
    }

    public Intent b(kn2 r3, int r4) {
        Intent r0 = new Intent("android.intent.action.MEDIA_BUTTON");
        r0.setData(r3.a.b);
        MediaLibraryService r2 = (MediaLibraryService) this.p;
        r0.setComponent(new ComponentName(r2, r2.getClass()));
        r0.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, r4));
        return r0;
    }

    public long c(rk0 r8) {
        be3 r0 = (be3) this.p;
        int r2 = 0;
        r8.e(r0.a, 0, 1, false);
        int r1 = r0.a[0] & 255;
        if (r1 != 0) goto L6;
        return Long.MIN_VALUE;
    L6:
        int r4 = 128;
        int r5 = 0;
    L8:
        if ((r1 & r4) != 0) goto L10;
        r4 = r4 >> 1;
        r5 = r5 + 1;
        goto L8
    L10:
        int r3 = r1 & (~r4);
        r8.e(r0.a, 1, r5, false);
    L11:
        if (r2 >= r5) goto L13;
        r2 = r2 + 1;
        r3 = (r0.a[r2] & 255) + (r3 << 8);
        goto L11
    L13:
        this.o = (r5 + 1) + this.o;
        return r3;
    }

    @Override // defpackage.g45
    public ce d(long r7, ce r9, ce r10, ce r11) {
        return ((ss0) this.p).d(r7, r9, r10, r11);
    }

    @Override // defpackage.xs
    public ic2 g(Uri r3) {
        return hw.O(((xs) this.p).g(r3), new ss2(17, this));
    }

    @Override // defpackage.f4
    public boolean h(View r1) {
        ((BottomSheetBehavior) this.p).J(this.o);
        return true;
    }

    @Override // defpackage.xs
    public ic2 i(do2 r3) {
        ic2 r4 = ((xs) this.p).i(r3);
        if (r4 != null) goto L7;
        return null;
    L7:
        return hw.O(r4, new ss2(17, this));
    }

    @Override // defpackage.xs
    public ic2 j(byte[] r3) {
        return hw.O(((xs) this.p).j(r3), new ss2(17, this));
    }

    @Override // defpackage.g45
    public ce k(long r7, ce r9, ce r10, ce r11) {
        return ((ss0) this.p).k(r7, r9, r10, r11);
    }

    @Override // defpackage.g45
    public long m(ce r1, ce r2, ce r3) {
        return ((long) this.o) * 1000000;
    }

    @Override // retrofit2.Callback
    public void onFailure(Call r1, Throwable r2) {
        switch(this.n) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        Log.e("SongRepository", "fetchAlbumSongsThenSimilar.onFailure()", r2);
        return;
    L6:
        ((zg5) this.p).onLoadMedia(kb4.a(this.o, null));
    }

    @Override // com.eddyizm.tempus.interfaces.DecadesCallback
    public void onLoadYear(int r4) {
        int r0 = this.o;
        if (r0 == (-1)) goto L11;
        if (r4 == (-1)) goto L12;
        ArrayList r1 = new ArrayList();
        int r2 = r0 - (r0 % 10);
        int r5 = r4 - (r4 % 10);
    L6:
        if (r2 > r5) goto L8;
        r1.add(Integer.valueOf(r2));
        r2 = r2 + 10;
        goto L6
    L8:
        ((r8) this.p).o.k(r1);
        return;
    L12:
        return;
    }

    @Override // retrofit2.Callback
    public void onResponse(Call r2, Response r3) {
        switch(this.n) {
            case 0: goto L16;
            default: goto L5;
        };
    L16:
        int r4 = this.o;
        zg5 r1 = (zg5) this.p;
        if (r3.isSuccessful() == true) goto L19;
    L25:
        r1.onLoadMedia(kb4.a(r4, null));
        return;
    L19:
        if (r3.body() == null) goto L25;
        if (((ApiResponse) r3.body()).getSubsonicResponse().getAlbumList2() == null) goto L25;
        if (((ApiResponse) r3.body()).getSubsonicResponse().getAlbumList2().getAlbums() == null) goto L25;
        r1.onLoadMedia(kb4.a(r4, new ArrayList(((ApiResponse) r3.body()).getSubsonicResponse().getAlbumList2().getAlbums())));
        return;
    L5:
        if (r3.isSuccessful() == true) goto L7;
        return;
    L7:
        if (r3.body() != null) goto L9;
        return;
    L9:
        if (((ApiResponse) r3.body()).getSubsonicResponse().getAlbum() == null) goto L29;
        List<Child> r5 = ((ApiResponse) r3.body()).getSubsonicResponse().getAlbum().getSongs();
        if (r5 != null) goto L13;
        return;
    L13:
        if (r5.isEmpty() == true) goto L31;
        List<Child> r6 = r5.subList(0, Math.min(this.o, r5.size()));
        ((wi4) this.p).a(new ArrayList(r6));
        return;
    L31:
        return;
    }

    @Override // defpackage.d14
    public q04 q(q04 r3, db3 r4) {
        ByteArrayOutputStream r5 = new ByteArrayOutputStream();
        ((Bitmap) r3.get()).compress((Bitmap.CompressFormat) this.p, this.o, r5);
        r3.b();
        return new ld(r5.toByteArray());
    }

    public String toString() {
        switch(this.n) {
            case 16: goto L6;
            default: goto L5;
        };
    L6:
        tw1 r1 = (tw1) this.p;
        ArrayList r0 = new ArrayList(r1.o);
        int r2 = 0;
    L8:
        if (r2 >= r1.o) goto L11;
        r0.add(f35.g0(r1.a(r2)));
        r2 = r2 + 1;
        goto L8
    L11:
        return "UnsupportedBrands{major=" + f35.g0(this.o) + ", compatible=" + r0 + "}";
    L5:
        return super.toString();
    }

    public /* synthetic */ x7(int r1, boolean r2) {
        this.n = r1;
    }

    public /* synthetic */ x7(int r1, int r2, Object r3) {
        this.n = r2;
        this.p = r3;
        this.o = r1;
    }

    public x7(int[] r2, int r3) {
        this.n = 16;
        this.o = r3;
        if (r2 == null) goto L8;
        tw1 r4 = tw1.p;
        if (r2.length != 0) goto L7;
        tw1 r5 = tw1.p;
    L9:
        this.p = r5;
        return;
    L7:
        r5 = new tw1(Arrays.copyOf(r2, r2.length));
        goto L9
    L8:
        r5 = tw1.p;
        goto L9
    }

    public x7(Context r2) {
        this.n = 4;
        this.p = r2;
        this.o = -1;
    }

    public x7(MediaLibraryService r2) {
        this.n = 6;
        this.o = 0;
        this.p = r2;
    }

    public x7(int r2, wi4 r3) {
        this.n = 14;
        this.o = r2;
        this.p = r3;
    }

    public x7(ArrayList r2) {
        this.n = 11;
        this.p = r2;
    }

    public x7(boolean r2, boolean r3, boolean r4) {
        this.n = 9;
        if (r2 == true) goto L8;
        if (r3 == true) goto L8;
        if (r4 == true) goto L8;
        int r5 = 0;
    L9:
        this.o = r5;
        return;
    L8:
        r5 = 1;
        goto L9
    }

    public x7(int r3, ry0 r4) {
        this.n = 17;
        this.o = r3;
        this.p = new ss0(new e81(r3, r4));
    }
}
