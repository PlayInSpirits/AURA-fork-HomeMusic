package defpackage;

import android.content.res.AssetFileDescriptor;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.subsonic.base.ApiResponse;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.subsonic.models.SubsonicResponse;
import com.google.android.material.tabs.TabLayout;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.function.Consumer;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class xi4 implements Callback, l83, px, xn4, zj2, me0, y45 {
    public static xi4 o;
    public final /* synthetic */ int n;

    public /* synthetic */ xi4(int i) {
        this.n = i;
    }

    public static List h(xi4 xi4Var, Response response, String str) {
        List<Child> songs;
        if (!response.isSuccessful() || response.body() == null) {
            return new ArrayList();
        }
        SubsonicResponse subsonicResponse = ((ApiResponse) response.body()).getSubsonicResponse();
        if (!str.equals("similarSongs") || subsonicResponse.getSimilarSongs() == null) {
            songs = (!str.equals("similarSongs2") || subsonicResponse.getSimilarSongs2() == null) ? null : subsonicResponse.getSimilarSongs2().getSongs();
        } else {
            songs = subsonicResponse.getSimilarSongs().getSongs();
        }
        return songs != null ? songs : new ArrayList();
    }

    public static final int i(int i, long j) {
        int i2 = e35.o;
        return ((int) (j >> (i * 15))) & 32767;
    }

    public static RectF j(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.Q || !(view instanceof mq4)) {
            return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        mq4 mq4Var = (mq4) view;
        int contentWidth = mq4Var.getContentWidth();
        int contentHeight = mq4Var.getContentHeight();
        int iL = (int) vr1.l(mq4Var.getContext(), 24);
        if (contentWidth < iL) {
            contentWidth = iL;
        }
        int right = (mq4Var.getRight() + mq4Var.getLeft()) / 2;
        int bottom = (mq4Var.getBottom() + mq4Var.getTop()) / 2;
        int i = contentWidth / 2;
        return new RectF(right - i, bottom - (contentHeight / 2), i + right, (right / 2) + bottom);
    }

    public static MediaCodec k(ml3 ml3Var) throws IOException {
        String str = ((dk2) ml3Var.a).a;
        Trace.beginSection("createCodec:" + str);
        MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return mediaCodecCreateByCodecName;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static mu4 m(String str) {
        str.getClass();
        int iHashCode = str.hashCode();
        if (iHashCode != 79201641) {
            if (iHashCode != 79923350) {
                switch (iHashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return mu4.r;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return mu4.q;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return mu4.p;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return mu4.s;
            }
        } else if (str.equals("SSLv3")) {
            return mu4.t;
        }
        kf2.n("Unexpected TLS version: ".concat(str));
        return null;
    }

    public static Path p(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }

    public static k03 q(int i, Integer num, Integer num2) {
        k03 k03Var = new k03();
        xc5 xc5VarA = App.f(false).a();
        xc5VarA.getClass();
        Log.d("BrowsingClient", "getRandomSongs()");
        ((w8) xc5VarA.p).c(((pn4) xc5VarA.o).f(), i, num, num2, ud3.k()).enqueue(new r8(k03Var, 4));
        return k03Var;
    }

    public static k03 r(String str) {
        k03 k03Var = new k03();
        App.f(false).c().m(str).enqueue(new ck(k03Var, 3));
        return k03Var;
    }

    public static k03 s(final int i, final boolean z, boolean z2) {
        final k03 k03Var = new k03(Collections.EMPTY_LIST);
        if (z2) {
            wn1.a(new Consumer() { // from class: vi4
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List] */
                /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    Object arrayList = new ArrayList((List) obj);
                    boolean z3 = z;
                    if (z3) {
                        Collections.shuffle(arrayList);
                    }
                    if (z3) {
                        arrayList = arrayList.subList(0, Math.min(i, arrayList.size()));
                    }
                    k03Var.k(arrayList);
                }
            });
            return k03Var;
        }
        App.f(false).a().s().enqueue(new o8(z, k03Var, i, 2));
        return k03Var;
    }

    private final void u(Call call, Throwable th) {
    }

    private final void v(Call call, Throwable th) {
    }

    private final void w(Call call, Response response) {
    }

    private final void x(Call call, Response response) {
    }

    @Override // defpackage.xn4
    public zn4 C(tb1 tb1Var) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    @Override // defpackage.xn4
    public int R(tb1 tb1Var) {
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004b  */
    @Override // defpackage.zj2
    public ak2 a(ml3 ml3Var) throws Throwable {
        MediaCodec mediaCodecK = null;
        try {
            mediaCodecK = k(ml3Var);
            Trace.beginSection("configureCodec");
            Surface surface = (Surface) ml3Var.d;
            mediaCodecK.configure((MediaFormat) ml3Var.b, surface, (MediaCrypto) ml3Var.e, (surface == null && ((dk2) ml3Var.a).h && Build.VERSION.SDK_INT >= 35) ? 8 : 0);
            Trace.endSection();
            Trace.beginSection("startCodec");
            mediaCodecK.start();
            Trace.endSection();
            return new rm3(mediaCodecK, (ns3) ml3Var.f);
        } catch (IOException e) {
            e = e;
            if (mediaCodecK != null) {
                mediaCodecK.release();
            }
            throw e;
        } catch (RuntimeException e2) {
            e = e2;
            if (mediaCodecK != null) {
                mediaCodecK.release();
            }
            throw e;
        }
    }

    @Override // defpackage.l83
    public long b(l51 l51Var) {
        return -1L;
    }

    @Override // defpackage.y45
    public void c(MediaExtractor mediaExtractor, Object obj) throws IOException {
        switch (this.n) {
            case 27:
                AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
                mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                break;
            default:
                mediaExtractor.setDataSource(new x45((ByteBuffer) obj));
                break;
        }
    }

    @Override // defpackage.px
    public String d(ii0 ii0Var) {
        ii0Var.getClass();
        Uri uri = ii0Var.a;
        String str = ii0Var.h;
        String queryParameter = null;
        if (str != null) {
            if (str.equals(uri.toString())) {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        uri.getClass();
        String scheme = uri.getScheme();
        if (!h12.c(scheme, "http") && !h12.c(scheme, "https")) {
            String string = uri.toString();
            string.getClass();
            return ot1.i(uri, string);
        }
        try {
            queryParameter = uri.getQueryParameter("id");
        } catch (UnsupportedOperationException e) {
            Log.d("StreamingCacheKeyFactory", "Opaque URI, falling back to URL-based cache key", e);
        }
        if (queryParameter == null) {
            String string2 = uri.toString();
            string2.getClass();
            return string2;
        }
        String queryParameter2 = uri.getQueryParameter("maxBitRate");
        if (queryParameter2 == null) {
            queryParameter2 = "";
        }
        String queryParameter3 = uri.getQueryParameter("format");
        if (queryParameter3 == null) {
            queryParameter3 = "";
        }
        String queryParameter4 = uri.getQueryParameter("timeOffset");
        if (queryParameter4 == null) {
            queryParameter4 = "";
        }
        String strE = ud3.E();
        return ot1.i(uri, (strE != null ? strE : "") + "|" + queryParameter + "|" + queryParameter2 + "|" + queryParameter3 + "|" + queryParameter4);
    }

    @Override // defpackage.l83
    public m84 e() {
        return new bo(-9223372036854775807L);
    }

    @Override // defpackage.y45
    public void f(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        switch (this.n) {
            case 27:
                AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
                mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                break;
            default:
                mediaMetadataRetriever.setDataSource(new x45((ByteBuffer) obj));
                break;
        }
    }

    @Override // defpackage.l83
    public void g(long j) {
    }

    public void l(String str, k03 k03Var) {
        gp3 gp3VarC = App.f(false).c();
        gp3VarC.getClass();
        Log.d("BrowsingClient", "getSimilarSongs()");
        ((ov) gp3VarC.p).g(((pn4) gp3VarC.o).f(), str, 25).enqueue(new qr2(18, this, k03Var));
    }

    @Override // defpackage.xn4
    public boolean n(tb1 tb1Var) {
        return false;
    }

    public k03 o(String str, fb0 fb0Var, int i) {
        k03 k03Var = new k03(new ArrayList());
        wi4 wi4Var = new wi4(this, k03Var, new HashSet(), i, str);
        int iOrdinal = fb0Var.ordinal();
        if (iOrdinal == 0) {
            gp3 gp3VarC = App.f(false).c();
            gp3VarC.getClass();
            Log.d("BrowsingClient", "getSimilarSongs2()");
            ((ov) gp3VarC.p).a(((pn4) gp3VarC.o).f(), str, i).enqueue(new ue1(this, i, wi4Var, 13));
            return k03Var;
        }
        if (iOrdinal == 1) {
            App.f(false).c().e(str).enqueue(new x7(i, wi4Var));
            return k03Var;
        }
        if (iOrdinal != 2) {
            return k03Var;
        }
        App.f(false).c().m(str).enqueue(new rm2(19, wi4Var));
        return k03Var;
    }

    @Override // retrofit2.Callback
    public void onFailure(Call call, Throwable th) {
        int i = this.n;
    }

    @Override // retrofit2.Callback
    public void onResponse(Call call, Response response) {
        int i = this.n;
    }

    public boolean t(CharSequence charSequence) {
        return false;
    }

    public String toString() {
        switch (this.n) {
            case 6:
                return "SharingStarted.Eagerly";
            case 7:
                return "SharingStarted.Lazily";
            case 11:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }

    public void y(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        RectF rectFJ = j(tabLayout, view);
        RectF rectFJ2 = j(tabLayout, view2);
        drawable.setBounds(yd.c((int) rectFJ.left, f, (int) rectFJ2.left), drawable.getBounds().top, yd.c((int) rectFJ.right, f, (int) rectFJ2.right), drawable.getBounds().bottom);
    }
}
