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
import com.eddyizm.tempus.homemusic.WaveRetry;
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

    public x7(int i) {
        this.n = i;
        switch (i) {
            case 13:
                this.p = new be3(8);
                break;
            default:
                this.p = Bitmap.CompressFormat.JPEG;
                this.o = 100;
                break;
        }
    }

    public Intent b(kn2 kn2Var, int i) {
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setData(kn2Var.a.b);
        MediaLibraryService mediaLibraryService = (MediaLibraryService) this.p;
        intent.setComponent(new ComponentName(mediaLibraryService, mediaLibraryService.getClass()));
        intent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, i));
        return intent;
    }

    public long c(rk0 rk0Var) {
        be3 be3Var = (be3) this.p;
        int i = 0;
        rk0Var.e(be3Var.a, 0, 1, false);
        int i2 = be3Var.a[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        rk0Var.e(be3Var.a, 1, i4, false);
        while (i < i4) {
            i++;
            i5 = (be3Var.a[i] & 255) + (i5 << 8);
        }
        this.o = i4 + 1 + this.o;
        return i5;
    }

    @Override // defpackage.g45
    public ce d(long j, ce ceVar, ce ceVar2, ce ceVar3) {
        return ((ss0) this.p).d(j, ceVar, ceVar2, ceVar3);
    }

    @Override // defpackage.xs
    public ic2 g(Uri uri) {
        return hw.O(((xs) this.p).g(uri), new ss2(17, this));
    }

    @Override // defpackage.f4
    public boolean h(View view) {
        ((BottomSheetBehavior) this.p).J(this.o);
        return true;
    }

    @Override // defpackage.xs
    public ic2 i(do2 do2Var) {
        ic2 ic2VarI = ((xs) this.p).i(do2Var);
        if (ic2VarI == null) {
            return null;
        }
        return hw.O(ic2VarI, new ss2(17, this));
    }

    @Override // defpackage.xs
    public ic2 j(byte[] bArr) {
        return hw.O(((xs) this.p).j(bArr), new ss2(17, this));
    }

    @Override // defpackage.g45
    public ce k(long j, ce ceVar, ce ceVar2, ce ceVar3) {
        return ((ss0) this.p).k(j, ceVar, ceVar2, ceVar3);
    }

    @Override // defpackage.g45
    public long m(ce ceVar, ce ceVar2, ce ceVar3) {
        return ((long) this.o) * 1000000;
    }

    @Override // retrofit2.Callback
    public void onFailure(Call call, Throwable th) {
        switch (this.n) {
            case 0:
                ((zg5) this.p).onLoadMedia(kb4.a(this.o, null));
                break;
            default:
                Log.e("SongRepository", "fetchAlbumSongsThenSimilar.onFailure()", th);
                break;
        }
    }

    @Override // com.eddyizm.tempus.interfaces.DecadesCallback
    public void onLoadYear(int i) {
        int i2 = this.o;
        if (i2 == -1 || i == -1) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i3 = i - (i % 10);
        for (int i4 = i2 - (i2 % 10); i4 <= i3; i4 += 10) {
            arrayList.add(Integer.valueOf(i4));
        }
        ((r8) this.p).o.k(arrayList);
    }

    @Override // retrofit2.Callback
    public void onResponse(Call call, Response response) {
        List<Child> songs;
        switch (this.n) {
            case 0:
                int i = this.o;
                zg5 zg5Var = (zg5) this.p;
                if (!response.isSuccessful() || response.body() == null || ((ApiResponse) response.body()).getSubsonicResponse().getAlbumList2() == null || ((ApiResponse) response.body()).getSubsonicResponse().getAlbumList2().getAlbums() == null) {
                    zg5Var.onLoadMedia(kb4.a(i, null));
                } else {
                    zg5Var.onLoadMedia(kb4.a(i, new ArrayList(((ApiResponse) response.body()).getSubsonicResponse().getAlbumList2().getAlbums())));
                }
                break;
            default:
                if (response.isSuccessful() && response.body() != null && ((ApiResponse) response.body()).getSubsonicResponse().getAlbum() != null && (songs = ((ApiResponse) response.body()).getSubsonicResponse().getAlbum().getSongs()) != null && !songs.isEmpty()) {
                    ((wi4) this.p).a(new ArrayList(songs.subList(0, Math.min(this.o, songs.size()))));
                    break;
                }
                break;
        }
    }

    @Override // defpackage.d14
    public q04 q(q04 q04Var, db3 db3Var) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) q04Var.get()).compress((Bitmap.CompressFormat) this.p, this.o, byteArrayOutputStream);
        q04Var.b();
        return new ld(byteArrayOutputStream.toByteArray());
    }

    public String toString() {
        switch (this.n) {
            case WaveRetry.MAX_FAILURES /* 16 */:
                tw1 tw1Var = (tw1) this.p;
                ArrayList arrayList = new ArrayList(tw1Var.o);
                for (int i = 0; i < tw1Var.o; i++) {
                    arrayList.add(f35.g0(tw1Var.a(i)));
                }
                return "UnsupportedBrands{major=" + f35.g0(this.o) + ", compatible=" + arrayList + "}";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ x7(int i, int i2, Object obj) {
        this.n = i2;
        this.p = obj;
        this.o = i;
    }

    public x7(int[] iArr, int i) {
        tw1 tw1Var;
        this.n = 16;
        this.o = i;
        if (iArr != null) {
            tw1 tw1Var2 = tw1.p;
            tw1Var = iArr.length == 0 ? tw1.p : new tw1(Arrays.copyOf(iArr, iArr.length));
        } else {
            tw1Var = tw1.p;
        }
        this.p = tw1Var;
    }

    public x7(Context context) {
        this.n = 4;
        this.p = context;
        this.o = -1;
    }

    public x7(MediaLibraryService mediaLibraryService) {
        this.n = 6;
        this.o = 0;
        this.p = mediaLibraryService;
    }

    public x7(int i, wi4 wi4Var) {
        this.n = 14;
        this.o = i;
        this.p = wi4Var;
    }

    public x7(ArrayList arrayList) {
        this.n = 11;
        this.p = arrayList;
    }

    public x7(boolean z, boolean z2, boolean z3) {
        this.n = 9;
        this.o = (z || z2 || z3) ? 1 : 0;
    }

    public x7(int i, ry0 ry0Var) {
        this.n = 17;
        this.o = i;
        this.p = new ss0((c81) new e81(i, ry0Var));
    }
}
