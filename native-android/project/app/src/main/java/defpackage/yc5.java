package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.ui.PlayerControlView;
import app.homemusic.R;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.WeakHashMap;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yc5 implements aw1, kg1, Callback {
    public Object n;
    public Object o;
    public Object p;

    public yc5(int i) {
        switch (i) {
            case 10:
                this.n = new WeakHashMap();
                this.o = new WeakHashMap();
                this.p = new WeakHashMap();
                break;
            default:
                this.n = new Object();
                break;
        }
    }

    public static kk0 a(ym2 ym2Var) {
        bl0 bl0Var = new bl0(0);
        Uri uri = ym2Var.b;
        ll llVar = new ll(uri == null ? null : uri.toString(), ym2Var.f, bl0Var);
        bx1 bx1Var = ym2Var.c;
        jx1 jx1VarC = bx1Var.n;
        if (jx1VarC == null) {
            jx1VarC = bx1Var.c();
            bx1Var.n = jx1VarC;
        }
        o15 it = jx1VarC.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            str.getClass();
            str2.getClass();
            synchronized (((HashMap) llVar.r)) {
                ((HashMap) llVar.r).put(str, str2);
            }
        }
        HashMap map = new HashMap();
        UUID uuid = ax.a;
        i80 i80Var = new i80(28);
        UUID uuid2 = ym2Var.a;
        uuid2.getClass();
        boolean z = ym2Var.d;
        boolean z2 = ym2Var.e;
        int[] iArrN = jz4.N(ym2Var.g);
        for (int i : iArrN) {
            boolean z3 = true;
            if (i != 2 && i != 1) {
                z3 = false;
            }
            rr2.l(z3);
        }
        kk0 kk0Var = new kk0(uuid2, llVar, map, z, (int[]) iArrN.clone(), z2, i80Var);
        byte[] bArr = ym2Var.h;
        byte[] bArrCopyOf = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        rr2.w(kk0Var.m.isEmpty());
        kk0Var.v = bArrCopyOf;
        return kk0Var;
    }

    public ww0 b(gn2 gn2Var) {
        kk0 kk0Var;
        gn2Var.b.getClass();
        ym2 ym2Var = gn2Var.b.c;
        if (ym2Var == null) {
            return ww0.a;
        }
        synchronized (this.n) {
            try {
                if (!ym2Var.equals((ym2) this.o)) {
                    this.o = ym2Var;
                    this.p = a(ym2Var);
                }
                kk0Var = (kk0) this.p;
                kk0Var.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        return kk0Var;
    }

    @Override // defpackage.aw1
    public int c() {
        List list = (List) this.p;
        aw3 aw3Var = (aw3) ((hg3) this.n).o;
        aw3Var.reset();
        return kb4.A(list, aw3Var, (qj0) this.o);
    }

    @Override // defpackage.kg1
    public void h(Object obj) {
        View view = (View) obj;
        ViewGroup viewGroup = (ViewGroup) this.o;
        View view2 = (View) this.n;
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams == null) {
            kf2.o("The media route button placeholder missing layout params.");
            return;
        }
        view.setId(R.id.exo_media_route_button_placeholder);
        view.setLayoutParams(layoutParams);
        int iIndexOfChild = viewGroup.indexOfChild(view2);
        viewGroup.removeView(view2);
        viewGroup.addView(view, iIndexOfChild);
        view.setVisibility(0);
        ((PlayerControlView) this.p).n.h(view, true);
    }

    @Override // defpackage.aw1
    public Bitmap i(BitmapFactory.Options options) {
        aw3 aw3Var = (aw3) ((hg3) this.n).o;
        aw3Var.reset();
        return BitmapFactory.decodeStream(aw3Var, null, options);
    }

    @Override // defpackage.aw1
    public void k() {
        aw3 aw3Var = (aw3) ((hg3) this.n).o;
        synchronized (aw3Var) {
            aw3Var.p = aw3Var.n.length;
        }
    }

    @Override // defpackage.aw1
    public ImageHeaderParser$ImageType l() {
        List list = (List) this.p;
        aw3 aw3Var = (aw3) ((hg3) this.n).o;
        aw3Var.reset();
        return kb4.B(list, aw3Var, (qj0) this.o);
    }

    @Override // defpackage.kg1
    public void o(Throwable th) {
        ((View) this.n).setVisibility(8);
    }

    @Override // retrofit2.Callback
    public void onFailure(Call call, Throwable th) {
        ((xi4) this.p).l((String) this.o, (k03) this.n);
    }

    @Override // retrofit2.Callback
    public void onResponse(Call call, Response response) {
        k03 k03Var = (k03) this.n;
        xi4 xi4Var = (xi4) this.p;
        List listH = xi4.h(xi4Var, response, "similarSongs2");
        if (listH.isEmpty()) {
            xi4Var.l((String) this.o, k03Var);
        } else {
            k03Var.i(listH);
        }
    }

    public /* synthetic */ yc5(Object obj, Object obj2, Object obj3) {
        this.p = obj;
        this.n = obj2;
        this.o = obj3;
    }

    public yc5(zg5 zg5Var) {
        this.n = zg5Var;
        this.o = Choreographer.getInstance();
        this.p = new sd(this);
    }
}
