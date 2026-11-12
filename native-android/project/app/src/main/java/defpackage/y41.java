package defpackage;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.bumptech.glide.a;
import com.eddyizm.tempus.App;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class y41 implements v11, m51, q51, bi0, ro4, d04, d14, w04, fi1 {
    public final /* synthetic */ int n;

    public /* synthetic */ y41(int i) {
        this.n = i;
    }

    public static final float e(float f, float[] fArr, float[] fArr2) {
        float f2;
        float f3;
        float f4;
        float f5;
        float fAbs = Math.abs(f);
        float fSignum = Math.signum(f);
        int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
        if (iBinarySearch >= 0) {
            return fSignum * fArr2[iBinarySearch];
        }
        int i = -(iBinarySearch + 1);
        int i2 = i - 1;
        if (i2 >= fArr.length - 1) {
            float f6 = fArr[fArr.length - 1];
            float f7 = fArr2[fArr.length - 1];
            if (f6 == 0.0f) {
                return 0.0f;
            }
            return (f7 / f6) * f;
        }
        if (i2 == -1) {
            float f8 = fArr[0];
            f4 = fArr2[0];
            f5 = f8;
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            float f9 = fArr[i2];
            float f10 = fArr[i];
            f2 = fArr2[i2];
            f3 = f9;
            f4 = fArr2[i];
            f5 = f10;
        }
        return (((f4 - f2) * Math.max(0.0f, Math.min(1.0f, f3 == f5 ? 0.0f : (fAbs - f3) / (f5 - f3)))) + f2) * fSignum;
    }

    public static final void h(List list, StringBuilder sb) {
        h02 h02VarB0 = gb.b0(gb.g0(0, list.size()), 2);
        int i = h02VarB0.n;
        int i2 = h02VarB0.o;
        int i3 = h02VarB0.p;
        if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
            return;
        }
        while (true) {
            String str = (String) list.get(i);
            String str2 = (String) list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
            if (i == i2) {
                return;
            } else {
                i += i3;
            }
        }
    }

    public static k03 j(int i, boolean z) {
        k03 k03Var = new k03();
        gp3 gp3VarC = App.f(false).c();
        gp3VarC.getClass();
        Log.d("BrowsingClient", "getGenres()");
        ((ov) gp3VarC.p).i(((pn4) gp3VarC.o).f()).enqueue(new o8(i, k03Var, z));
        return k03Var;
    }

    private final void k(Object obj) {
    }

    @Override // defpackage.d04
    public c04 a(a aVar, s92 s92Var, f04 f04Var, Context context) {
        return new oi1(aVar, s92Var, f04Var, context);
    }

    @Override // defpackage.v11
    public short b() {
        return (short) 0;
    }

    @Override // defpackage.fi1
    public g04 build() {
        return new g04();
    }

    @Override // defpackage.ro4
    public so4 c(y10 y10Var) {
        return new bf1((Context) y10Var.d, (String) y10Var.e, (uv) y10Var.f, y10Var.b, y10Var.c);
    }

    @Override // defpackage.v11
    public short[] d() {
        return null;
    }

    @Override // defpackage.v11
    public boolean f(Context context, int i) {
        if (i == 0) {
            return false;
        }
        Intent intent = new Intent("android.media.action.OPEN_AUDIO_EFFECT_CONTROL_SESSION");
        intent.putExtra("android.media.extra.AUDIO_SESSION", i);
        intent.putExtra("android.media.extra.PACKAGE_NAME", context.getApplicationContext().getPackageName());
        context.sendBroadcast(intent);
        return true;
    }

    @Override // defpackage.q51
    public Object g() {
        return new ArrayList();
    }

    @Override // defpackage.c11
    public boolean i(Object obj, File file, db3 db3Var) throws Throwable {
        try {
            vw.d(((bi1) ((vh1) ((q04) obj).get()).n.b).a.d.asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e) {
            if (!Log.isLoggable("GifEncoder", 5)) {
                return false;
            }
            Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            return false;
        }
    }

    @Override // defpackage.w04
    public int l(db3 db3Var) {
        return 1;
    }

    @Override // defpackage.bi0
    public ci0 m() {
        return new t61(false);
    }

    @Override // defpackage.v11
    public Integer n(short s) {
        return null;
    }

    @Override // defpackage.v11
    public void o(Context context, int i) {
        if (i == 0) {
            return;
        }
        Intent intent = new Intent("android.media.action.CLOSE_AUDIO_EFFECT_CONTROL_SESSION");
        intent.putExtra("android.media.extra.AUDIO_SESSION", i);
        intent.putExtra("android.media.extra.PACKAGE_NAME", context.getApplicationContext().getPackageName());
        context.sendBroadcast(intent);
    }

    @Override // defpackage.m51
    public void p() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.d14
    public q04 q(q04 q04Var, db3 db3Var) {
        byte[] bArrArray;
        ByteBuffer byteBufferAsReadOnlyBuffer = ((bi1) ((vh1) q04Var.get()).n.b).a.d.asReadOnlyBuffer();
        AtomicReference atomicReference = vw.a;
        k35 k35Var = (byteBufferAsReadOnlyBuffer.isReadOnly() || !byteBufferAsReadOnlyBuffer.hasArray()) ? null : new k35(byteBufferAsReadOnlyBuffer.array(), byteBufferAsReadOnlyBuffer.arrayOffset(), byteBufferAsReadOnlyBuffer.limit());
        if (k35Var != null && k35Var.a == 0 && k35Var.b == k35Var.c.length) {
            bArrArray = byteBufferAsReadOnlyBuffer.array();
        } else {
            ByteBuffer byteBufferAsReadOnlyBuffer2 = byteBufferAsReadOnlyBuffer.asReadOnlyBuffer();
            byte[] bArr = new byte[byteBufferAsReadOnlyBuffer2.limit()];
            byteBufferAsReadOnlyBuffer2.get(bArr);
            bArrArray = bArr;
        }
        return new ld(bArrArray);
    }

    @Override // defpackage.v11
    public void setEnabled(boolean z) {
    }

    @Override // defpackage.m51
    public wv4 t(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.v11
    public void v(short s, short s2) {
    }

    @Override // defpackage.m51
    public void w(m84 m84Var) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.v11
    public Short z(short s) {
        return null;
    }
}
