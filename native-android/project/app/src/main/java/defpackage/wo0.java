package defpackage;

import android.R;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ImageDecoder;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.session.MediaController;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.media.MediaDescriptionCompat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AbsSeekBar;
import android.widget.FrameLayout;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialProviderConfigurationException;
import androidx.credentials.exceptions.GetCredentialUnsupportedException;
import androidx.credentials.exceptions.NoCredentialException;
import androidx.media3.common.ParserException;
import androidx.work.impl.WorkDatabase_Impl;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.service.MediaService;
import com.eddyizm.tempus.subsonic.base.ApiResponse;
import com.eddyizm.tempus.subsonic.models.Bookmarks;
import com.eddyizm.tempus.subsonic.models.Child;
import com.google.android.libraries.identity.googleid.GoogleIdTokenParsingException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class wo0 implements Callback, kg1, vf0, bi0, hu0, zn4 {
    public static final int[] p = {R.attr.indeterminateDrawable, R.attr.progressDrawable};
    public Object n;
    public Object o;

    public wo0(pn4 pn4Var, int i) {
        String str;
        gr1 gr1Var;
        gr1 gr1VarB;
        dz4 dz4VarA;
        dz4 dz4VarA2;
        gr1 gr1VarB2;
        dz4 dz4VarA3;
        dz4 dz4VarA4;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        String str2 = "https://localhost/rest/";
        switch (i) {
            case 20:
                this.n = pn4Var;
                ok1 ok1Var = new ok1();
                ok1Var.a(Date.class, new r01());
                ok1Var.a(Bookmarks.class, new lt());
                ok1Var.j = true;
                ArrayList arrayList = ok1Var.e;
                int size = arrayList.size();
                ArrayList arrayList2 = ok1Var.f;
                ArrayList arrayList3 = new ArrayList(arrayList2.size() + size + 3);
                arrayList3.addAll(arrayList);
                Collections.reverse(arrayList3);
                ArrayList arrayList4 = new ArrayList(arrayList2);
                Collections.reverse(arrayList4);
                arrayList3.addAll(arrayList4);
                int i2 = ok1Var.g;
                int i3 = ok1Var.h;
                ak0 ak0Var = bk0.b;
                boolean z = gk4.a;
                if (i2 != 2 && i3 != 2) {
                    dz4 dz4VarA5 = ak0Var.a(i2, i3);
                    if (z) {
                        dz4VarA2 = gk4.c.a(i2, i3);
                        dz4VarA = gk4.b.a(i2, i3);
                    } else {
                        dz4VarA = null;
                        dz4VarA2 = null;
                    }
                    arrayList3.add(dz4VarA5);
                    if (z) {
                        arrayList3.add(dz4VarA2);
                        arrayList3.add(dz4VarA);
                    }
                }
                u21 u21Var = ok1Var.a;
                int i4 = ok1Var.c;
                HashMap map = new HashMap(ok1Var.d);
                boolean z2 = ok1Var.i;
                boolean z3 = ok1Var.j;
                boolean z4 = ok1Var.k;
                int i5 = ok1Var.b;
                new ArrayList(arrayList);
                new ArrayList(arrayList2);
                nk1 nk1Var = new nk1(u21Var, i4, map, z2, z3, z4, i5, arrayList3, ok1Var.l, ok1Var.m, new ArrayList(ok1Var.n));
                Retrofit.Builder builder = new Retrofit.Builder();
                String strJ = pn4Var.j();
                String string = strJ != null ? qm4.K0(strJ).toString() : null;
                str = string != null ? string : "";
                try {
                    fr1 fr1Var = new fr1();
                    gr1Var = null;
                    try {
                        fr1Var.e(null, str);
                        gr1VarB = fr1Var.b();
                    } catch (IllegalArgumentException unused) {
                        gr1VarB = gr1Var;
                    }
                } catch (IllegalArgumentException unused2) {
                    gr1Var = null;
                }
                if (gr1VarB != null && gr1VarB.d.length() > 0) {
                    str2 = str;
                }
                Retrofit.Builder builderAddConverterFactory = builder.baseUrl(str2).addConverterFactory(GsonConverterFactory.create(nk1Var));
                cx cxVar = new cx();
                rx rxVar = new rx(cxVar);
                cxVar.a = 2592000;
                n83 n83Var = new n83();
                n83Var.a(2L, timeUnit2);
                n83Var.b(20L, timeUnit);
                n83Var.z = ze5.b(30L, timeUnit);
                n83Var.A = ze5.b(30L, timeUnit);
                dr1 dr1Var = new dr1();
                dr1Var.b = cr1.n;
                n83Var.c.add(dr1Var);
                n83Var.c.add(rxVar);
                File cacheDir = App.a().getCacheDir();
                cacheDir.getClass();
                n83Var.l = new hx(cacheDir);
                SSLSocketFactory sSLSocketFactory = x30.b;
                if (sSLSocketFactory != null) {
                    n83Var.c(sSLSocketFactory, x30.a);
                }
                Retrofit retrofitBuild = builderAddConverterFactory.client(new o83(n83Var)).build();
                retrofitBuild.getClass();
                this.o = (hd4) retrofitBuild.create(hd4.class);
                break;
            default:
                this.n = pn4Var;
                ok1 ok1Var2 = new ok1();
                ok1Var2.a(Date.class, new r01());
                ok1Var2.a(Bookmarks.class, new lt());
                ok1Var2.j = true;
                ArrayList arrayList5 = ok1Var2.e;
                int size2 = arrayList5.size();
                ArrayList arrayList6 = ok1Var2.f;
                ArrayList arrayList7 = new ArrayList(arrayList6.size() + size2 + 3);
                arrayList7.addAll(arrayList5);
                Collections.reverse(arrayList7);
                ArrayList arrayList8 = new ArrayList(arrayList6);
                Collections.reverse(arrayList8);
                arrayList7.addAll(arrayList8);
                int i6 = ok1Var2.g;
                int i7 = ok1Var2.h;
                ak0 ak0Var2 = bk0.b;
                boolean z5 = gk4.a;
                if (i6 != 2 && i7 != 2) {
                    dz4 dz4VarA6 = ak0Var2.a(i6, i7);
                    if (z5) {
                        dz4VarA4 = gk4.c.a(i6, i7);
                        dz4VarA3 = gk4.b.a(i6, i7);
                    } else {
                        dz4VarA3 = null;
                        dz4VarA4 = null;
                    }
                    arrayList7.add(dz4VarA6);
                    if (z5) {
                        arrayList7.add(dz4VarA4);
                        arrayList7.add(dz4VarA3);
                    }
                }
                u21 u21Var2 = ok1Var2.a;
                int i8 = ok1Var2.c;
                HashMap map2 = new HashMap(ok1Var2.d);
                boolean z6 = ok1Var2.i;
                boolean z7 = ok1Var2.j;
                boolean z8 = ok1Var2.k;
                int i9 = ok1Var2.b;
                new ArrayList(arrayList5);
                new ArrayList(arrayList6);
                nk1 nk1Var2 = new nk1(u21Var2, i8, map2, z6, z7, z8, i9, arrayList7, ok1Var2.l, ok1Var2.m, new ArrayList(ok1Var2.n));
                Retrofit.Builder builder2 = new Retrofit.Builder();
                String strJ2 = pn4Var.j();
                String string2 = strJ2 != null ? qm4.K0(strJ2).toString() : null;
                str = string2 != null ? string2 : "";
                try {
                    fr1 fr1Var2 = new fr1();
                    fr1Var2.e(null, str);
                    gr1VarB2 = fr1Var2.b();
                } catch (IllegalArgumentException unused3) {
                    gr1VarB2 = null;
                }
                if (gr1VarB2 != null && gr1VarB2.d.length() > 0) {
                    str2 = str;
                }
                Retrofit.Builder builderAddConverterFactory2 = builder2.baseUrl(str2).addConverterFactory(GsonConverterFactory.create(nk1Var2));
                cx cxVar2 = new cx();
                rx rxVar2 = new rx(cxVar2);
                cxVar2.a = 2592000;
                n83 n83Var2 = new n83();
                n83Var2.a(2L, timeUnit2);
                n83Var2.b(20L, timeUnit);
                n83Var2.z = ze5.b(30L, timeUnit);
                n83Var2.A = ze5.b(30L, timeUnit);
                dr1 dr1Var2 = new dr1();
                dr1Var2.b = cr1.n;
                n83Var2.c.add(dr1Var2);
                n83Var2.c.add(rxVar2);
                File cacheDir2 = App.a().getCacheDir();
                cacheDir2.getClass();
                n83Var2.l = new hx(cacheDir2);
                SSLSocketFactory sSLSocketFactory2 = x30.b;
                if (sSLSocketFactory2 != null) {
                    n83Var2.c(sSLSocketFactory2, x30.a);
                }
                Retrofit retrofitBuild2 = builderAddConverterFactory2.client(new o83(n83Var2)).build();
                retrofitBuild2.getClass();
                this.o = (hn3) retrofitBuild2.create(hn3.class);
                break;
        }
    }

    public static ld d(ImageDecoder.Source source, int i, int i2, db3 db3Var) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new im0(i, i2, db3Var));
        if (i3.w(drawableDecodeDrawable)) {
            return new ld(0, i3.f(drawableDecodeDrawable));
        }
        tb4.d(drawableDecodeDrawable, "Received unexpected drawable type for animated image, failing: ");
        return null;
    }

    public pz1 A() {
        MediaController.TransportControls transportControls = ((xk2) this.n).a.getTransportControls();
        return Build.VERSION.SDK_INT >= 29 ? new al2(6, transportControls) : new pz1(6, transportControls);
    }

    public boolean B(os2 os2Var, String str) {
        int i = os2Var.b;
        Context context = (Context) this.n;
        if (i < 0) {
            return context.getPackageManager().checkPermission(str, os2Var.a) == 0;
        }
        return context.checkPermission(str, i, os2Var.c) == 0;
    }

    public void C(AttributeSet attributeSet, int i) {
        AbsSeekBar absSeekBar = (AbsSeekBar) this.n;
        jv3 jv3VarF = jv3.f(absSeekBar.getContext(), attributeSet, p, i);
        Drawable drawableD = jv3VarF.d(0);
        if (drawableD != null) {
            if (drawableD instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) drawableD;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable drawableJ = J(animationDrawable.getFrame(i2), true);
                    drawableJ.setLevel(10000);
                    animationDrawable2.addFrame(drawableJ, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(10000);
                drawableD = animationDrawable2;
            }
            absSeekBar.setIndeterminateDrawable(drawableD);
        }
        Drawable drawableD2 = jv3VarF.d(1);
        if (drawableD2 != null) {
            absSeekBar.setProgressDrawable(J(drawableD2, false));
        }
        jv3VarF.g();
    }

    public void D() throws IOException {
        String str = (String) this.n;
        if (((FileChannel) this.o) != null) {
            return;
        }
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileChannel channel = new FileOutputStream(file).getChannel();
            this.o = channel;
            if (channel != null) {
                channel.lock();
            }
        } catch (Throwable th) {
            FileChannel fileChannel = (FileChannel) this.o;
            if (fileChannel != null) {
                fileChannel.close();
            }
            this.o = null;
            mj0.j(xa3.h("Unable to lock file: '", str, "'."), th);
        }
    }

    @Override // defpackage.hu0
    public void E(zs zsVar, Bitmap bitmap) throws IOException {
        IOException iOException = ((n21) this.o).o;
        if (iOException != null) {
            if (bitmap == null) {
                throw iOException;
            }
            zsVar.d(bitmap);
            throw iOException;
        }
    }

    public void F(Object obj) {
        String string;
        GetCredentialException getCredentialException = (GetCredentialException) obj;
        nc1 nc1Var = (nc1) this.o;
        getCredentialException.getClass();
        Log.w("HomeGoogleSignIn", "Google sign-in failed: " + getCredentialException.a(), getCredentialException);
        jj1 jj1Var = (jj1) this.n;
        if (getCredentialException instanceof GetCredentialCancellationException) {
            string = null;
        } else if (getCredentialException instanceof NoCredentialException) {
            string = nc1Var.getString(app.homemusic.R.string.homemusic_google_no_account);
        } else if ((getCredentialException instanceof GetCredentialProviderConfigurationException) || (getCredentialException instanceof GetCredentialUnsupportedException)) {
            string = nc1Var.getString(app.homemusic.R.string.homemusic_google_unavailable);
        } else {
            Object objA = getCredentialException.o;
            if (objA == null) {
                objA = getCredentialException.a();
            }
            string = nc1Var.getString(app.homemusic.R.string.homemusic_google_failed, objA);
        }
        jj1Var.v(string);
    }

    public void G(Object obj) {
        mh1 mh1Var = (mh1) obj;
        nc1 nc1Var = (nc1) this.o;
        jj1 jj1Var = (jj1) this.n;
        mh1Var.getClass();
        b3 b3Var = mh1Var.a;
        if (!(b3Var instanceof tg0) || !((String) b3Var.a).equals("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL")) {
            jj1Var.v(nc1Var.getString(app.homemusic.R.string.homemusic_google_failed, (String) b3Var.a));
            return;
        }
        try {
            kj1 kj1VarP = kb4.p((Bundle) b3Var.b);
            jj1Var.g(kj1VarP.d, kj1VarP.c);
        } catch (GoogleIdTokenParsingException e) {
            Log.w("HomeGoogleSignIn", "Bad Google credential", e);
            String message = e.getMessage();
            if (message == null) {
                message = "?";
            }
            jj1Var.v(nc1Var.getString(app.homemusic.R.string.homemusic_google_failed, message));
        }
    }

    public void H(va1 va1Var) {
        ok okVar = (ok) this.o;
        c05 c05Var = (c05) this.n;
        int i = va1Var.b;
        if (i != 0) {
            okVar.execute(new rq(i, 1, c05Var));
        } else {
            okVar.execute(new lg1(6, c05Var, va1Var.a));
        }
    }

    public void I(pm2 pm2Var) {
        xk2 xk2Var = (xk2) this.n;
        if ((xk2Var.a.getFlags() & 4) == 0) {
            er1.l("This session doesn't support queue management operations");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION", uc5.j(pm2Var, MediaDescriptionCompat.CREATOR));
        xk2Var.a.sendCommand("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM", bundle, null);
    }

    public Drawable J(Drawable drawable, boolean z) {
        if (!(drawable instanceof LayerDrawable)) {
            if (!(drawable instanceof BitmapDrawable)) {
                return drawable;
            }
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (((Bitmap) this.o) == null) {
                this.o = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        Drawable[] drawableArr = new Drawable[numberOfLayers];
        for (int i = 0; i < numberOfLayers; i++) {
            int id = layerDrawable.getId(i);
            drawableArr[i] = J(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
        for (int i2 = 0; i2 < numberOfLayers; i2++) {
            layerDrawable2.setId(i2, layerDrawable.getId(i2));
            layerDrawable2.setLayerGravity(i2, layerDrawable.getLayerGravity(i2));
            layerDrawable2.setLayerWidth(i2, layerDrawable.getLayerWidth(i2));
            layerDrawable2.setLayerHeight(i2, layerDrawable.getLayerHeight(i2));
            layerDrawable2.setLayerInsetLeft(i2, layerDrawable.getLayerInsetLeft(i2));
            layerDrawable2.setLayerInsetRight(i2, layerDrawable.getLayerInsetRight(i2));
            layerDrawable2.setLayerInsetTop(i2, layerDrawable.getLayerInsetTop(i2));
            layerDrawable2.setLayerInsetBottom(i2, layerDrawable.getLayerInsetBottom(i2));
            layerDrawable2.setLayerInsetStart(i2, layerDrawable.getLayerInsetStart(i2));
            layerDrawable2.setLayerInsetEnd(i2, layerDrawable.getLayerInsetEnd(i2));
        }
        return layerDrawable2;
    }

    public void a(pm2 pm2Var, int i) {
        xk2 xk2Var = (xk2) this.n;
        if ((xk2Var.a.getFlags() & 4) == 0) {
            er1.l("This session doesn't support queue management operations");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION", uc5.j(pm2Var, MediaDescriptionCompat.CREATOR));
        bundle.putInt("android.support.v4.media.session.command.ARGUMENT_INDEX", i);
        xk2Var.a.sendCommand("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT", bundle, null);
    }

    /* JADX WARN: Code duplicated, block: B:121:0x022d  */
    /* JADX WARN: Code duplicated, block: B:130:0x024e  */
    /* JADX WARN: Code duplicated, block: B:131:0x0259  */
    /* JADX WARN: Code duplicated, block: B:133:0x0262  */
    /* JADX WARN: Code duplicated, block: B:134:0x026c  */
    /* JADX WARN: Code duplicated, block: B:136:0x0274  */
    /* JADX WARN: Code duplicated, block: B:138:0x027c  */
    /* JADX WARN: Code duplicated, block: B:139:0x0280  */
    /* JADX WARN: Code duplicated, block: B:141:0x0288  */
    /* JADX WARN: Code duplicated, block: B:142:0x028f  */
    /* JADX WARN: Code duplicated, block: B:144:0x0297  */
    /* JADX WARN: Code duplicated, block: B:150:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:152:0x02af  */
    /* JADX WARN: Code duplicated, block: B:154:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:156:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:157:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:159:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:160:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:162:0x02db  */
    /* JADX WARN: Code duplicated, block: B:164:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:165:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:167:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:169:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:171:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:173:0x0305  */
    /* JADX WARN: Code duplicated, block: B:175:0x0315  */
    /* JADX WARN: Code duplicated, block: B:176:0x032f  */
    /* JADX WARN: Code duplicated, block: B:179:0x0340  */
    /* JADX WARN: Code duplicated, block: B:182:0x0349  */
    /* JADX WARN: Code duplicated, block: B:183:0x034b  */
    /* JADX WARN: Code duplicated, block: B:186:0x0354  */
    /* JADX WARN: Code duplicated, block: B:187:0x0356  */
    /* JADX WARN: Code duplicated, block: B:190:0x035f  */
    /* JADX WARN: Code duplicated, block: B:194:0x0367  */
    /* JADX WARN: Code duplicated, block: B:195:0x036c  */
    /* JADX WARN: Code duplicated, block: B:196:0x0371  */
    /* JADX WARN: Code duplicated, block: B:198:0x0384  */
    /* JADX WARN: Code duplicated, block: B:239:0x0363 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00ae  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Instruction removed from duplicated block: B:175:0x0315, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v25 */
    @Override // defpackage.zn4
    public void c(byte[] bArr, int i, int i2, yn4 yn4Var, wc0 wc0Var) {
        r95 r95VarD;
        String strTrim;
        int i3;
        String string;
        int i4;
        Matcher matcher;
        String strGroup;
        byte b;
        boolean z;
        wo0 wo0Var = this;
        be3 be3Var = (be3) wo0Var.n;
        be3Var.L(i + i2, bArr);
        be3Var.N(i);
        ArrayList arrayList = new ArrayList();
        try {
            y95.d(be3Var);
            while (!TextUtils.isEmpty(be3Var.n(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                boolean z2 = false;
                int i5 = -1;
                int i6 = 0;
                byte b2 = -1;
                while (true) {
                    int i7 = 1;
                    if (b2 == -1) {
                        i6 = be3Var.b;
                        String strN = be3Var.n(StandardCharsets.UTF_8);
                        if (strN == null) {
                            b2 = 0;
                        } else if ("STYLE".equals(strN)) {
                            b2 = 2;
                        } else {
                            b2 = strN.startsWith("NOTE") ? (byte) 1 : (byte) 3;
                        }
                    } else {
                        be3Var.N(i6);
                        if (b2 == 0) {
                            gb.d0(new i61(arrayList2), yn4Var, wc0Var);
                            return;
                        }
                        if (b2 == 1) {
                            while (!TextUtils.isEmpty(be3Var.n(StandardCharsets.UTF_8))) {
                            }
                        } else {
                            String str = null;
                            if (b2 == 2) {
                                if (!arrayList2.isEmpty()) {
                                    kf2.n("A style block was found after the first cue.");
                                    return;
                                }
                                be3Var.n(StandardCharsets.UTF_8);
                                p95 p95Var = (p95) wo0Var.o;
                                be3 be3Var2 = p95Var.a;
                                StringBuilder sb = p95Var.b;
                                sb.setLength(0);
                                int i8 = be3Var.b;
                                while (!TextUtils.isEmpty(be3Var.n(StandardCharsets.UTF_8))) {
                                }
                                be3Var2.L(be3Var.b, be3Var.a);
                                be3Var2.N(i8);
                                ArrayList arrayList3 = new ArrayList();
                                while (true) {
                                    p95.c(be3Var2);
                                    if (be3Var2.a() >= 5 && "::cue".equals(be3Var2.y(5, StandardCharsets.UTF_8))) {
                                        int i9 = be3Var2.b;
                                        String strB = p95.b(be3Var2, sb);
                                        if (strB == null) {
                                            strTrim = str;
                                        } else if ("{".equals(strB)) {
                                            be3Var2.N(i9);
                                            strTrim = "";
                                        } else {
                                            if ("(".equals(strB)) {
                                                int i10 = be3Var2.b;
                                                int i11 = be3Var2.c;
                                                int i12 = z2 ? 1 : 0;
                                                while (i10 < i11 && i12 == 0) {
                                                    int i13 = i10 + 1;
                                                    i12 = ((char) be3Var2.a[i10]) == ')' ? i7 : z2 ? 1 : 0;
                                                    i10 = i13;
                                                }
                                                strTrim = be3Var2.y((i10 - 1) - be3Var2.b, StandardCharsets.UTF_8).trim();
                                            } else {
                                                strTrim = str;
                                            }
                                            if (!")".equals(p95.b(be3Var2, sb))) {
                                                strTrim = str;
                                            }
                                        }
                                    } else {
                                        strTrim = str;
                                    }
                                    if (strTrim != null && "{".equals(p95.b(be3Var2, sb))) {
                                        q95 q95Var = new q95();
                                        q95Var.a = "";
                                        q95Var.b = "";
                                        q95Var.c = Collections.EMPTY_SET;
                                        q95Var.d = "";
                                        q95Var.e = str;
                                        q95Var.g = z2;
                                        q95Var.i = z2;
                                        q95Var.j = i5;
                                        q95Var.k = i5;
                                        q95Var.l = i5;
                                        q95Var.m = i5;
                                        q95Var.n = i5;
                                        q95Var.p = i5;
                                        q95Var.q = z2;
                                        if (!strTrim.isEmpty()) {
                                            int iIndexOf = strTrim.indexOf(91);
                                            if (iIndexOf != i5) {
                                                Matcher matcher2 = p95.c.matcher(strTrim.substring(iIndexOf));
                                                if (matcher2.matches()) {
                                                    String strGroup2 = matcher2.group(i7);
                                                    strGroup2.getClass();
                                                    q95Var.d = strGroup2;
                                                }
                                                strTrim = strTrim.substring(z2 ? 1 : 0, iIndexOf);
                                            }
                                            String str2 = f35.a;
                                            String[] strArrSplit = strTrim.split("\\.", i5);
                                            String str3 = strArrSplit[z2 ? 1 : 0];
                                            int iIndexOf2 = str3.indexOf(35);
                                            if (iIndexOf2 != i5) {
                                                q95Var.b = str3.substring(z2 ? 1 : 0, iIndexOf2);
                                                q95Var.a = str3.substring(iIndexOf2 + 1);
                                            } else {
                                                q95Var.b = str3;
                                            }
                                            if (strArrSplit.length > i7) {
                                                int length = strArrSplit.length;
                                                rr2.l(length <= strArrSplit.length ? i7 : z2 ? 1 : 0);
                                                q95Var.c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(strArrSplit, i7, length)));
                                            }
                                        }
                                        ?? r8 = z2 ? 1 : 0;
                                        String strB2 = str;
                                        while (r8 == 0) {
                                            int i14 = be3Var2.b;
                                            strB2 = p95.b(be3Var2, sb);
                                            ?? r15 = (strB2 == null || "}".equals(strB2)) ? i7 : z2;
                                            if (r15 == 0) {
                                                be3Var2.N(i14);
                                                p95.c(be3Var2);
                                                String strA = p95.a(be3Var2, sb);
                                                if (!strA.isEmpty() && ":".equals(p95.b(be3Var2, sb))) {
                                                    p95.c(be3Var2);
                                                    StringBuilder sb2 = new StringBuilder();
                                                    boolean z3 = false;
                                                    while (true) {
                                                        if (z3) {
                                                            string = sb2.toString();
                                                        } else {
                                                            int i15 = be3Var2.b;
                                                            String strB3 = p95.b(be3Var2, sb);
                                                            if (strB3 == null) {
                                                                string = null;
                                                            } else if ("}".equals(strB3) || ";".equals(strB3)) {
                                                                be3Var2.N(i15);
                                                                z3 = true;
                                                            } else {
                                                                sb2.append(strB3);
                                                            }
                                                        }
                                                    }
                                                    if (string == null || string.isEmpty()) {
                                                        i3 = 1;
                                                    } else {
                                                        int i16 = be3Var2.b;
                                                        String strB4 = p95.b(be3Var2, sb);
                                                        if (";".equals(strB4)) {
                                                            if ("color".equals(strA)) {
                                                                i4 = 1;
                                                                q95Var.f = d50.a(string, true);
                                                                q95Var.g = true;
                                                            } else {
                                                                i4 = 1;
                                                                if ("background-color".equals(strA)) {
                                                                    q95Var.h = d50.a(string, true);
                                                                    q95Var.i = true;
                                                                } else if ("ruby-position".equals(strA)) {
                                                                    if ("text-combine-upright".equals(strA)) {
                                                                        if ("all".equals(string)) {
                                                                            z = true;
                                                                        } else {
                                                                            z = true;
                                                                        }
                                                                        q95Var.q = z;
                                                                    } else if ("text-decoration".equals(strA)) {
                                                                        if ("underline".equals(string)) {
                                                                            i4 = 1;
                                                                            q95Var.k = 1;
                                                                        }
                                                                    } else if ("font-family".equals(strA)) {
                                                                        q95Var.e = rr2.U(string);
                                                                    } else if ("font-weight".equals(strA)) {
                                                                        i4 = 1;
                                                                        if ("font-style".equals(strA)) {
                                                                            if ("italic".equals(string)) {
                                                                                q95Var.m = 1;
                                                                            }
                                                                        } else if ("font-size".equals(strA)) {
                                                                            matcher = p95.d.matcher(rr2.U(string));
                                                                            if (matcher.matches()) {
                                                                                strGroup = matcher.group(2);
                                                                                strGroup.getClass();
                                                                                switch (strGroup.hashCode()) {
                                                                                    case 37:
                                                                                        if (!strGroup.equals("%")) {
                                                                                            b = 0;
                                                                                        }
                                                                                        switch (b) {
                                                                                            case 0:
                                                                                                i3 = 1;
                                                                                                q95Var.n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i3 = 1;
                                                                                                q95Var.n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i3 = 1;
                                                                                                q95Var.n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                tb4.a();
                                                                                                return;
                                                                                        }
                                                                                        String strGroup3 = matcher.group(i3);
                                                                                        strGroup3.getClass();
                                                                                        q95Var.o = Float.parseFloat(strGroup3);
                                                                                        break;
                                                                                    case 3240:
                                                                                        if (!strGroup.equals("em")) {
                                                                                            b = 1;
                                                                                        }
                                                                                        switch (b) {
                                                                                            case 0:
                                                                                                i3 = 1;
                                                                                                q95Var.n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i3 = 1;
                                                                                                q95Var.n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i3 = 1;
                                                                                                q95Var.n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                tb4.a();
                                                                                                return;
                                                                                        }
                                                                                        String strGroup4 = matcher.group(i3);
                                                                                        strGroup4.getClass();
                                                                                        q95Var.o = Float.parseFloat(strGroup4);
                                                                                        break;
                                                                                    case 3592:
                                                                                        if (!strGroup.equals("px")) {
                                                                                            b = 2;
                                                                                        }
                                                                                        switch (b) {
                                                                                            case 0:
                                                                                                i3 = 1;
                                                                                                q95Var.n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i3 = 1;
                                                                                                q95Var.n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i3 = 1;
                                                                                                q95Var.n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                tb4.a();
                                                                                                return;
                                                                                        }
                                                                                        String strGroup5 = matcher.group(i3);
                                                                                        strGroup5.getClass();
                                                                                        q95Var.o = Float.parseFloat(strGroup5);
                                                                                        break;
                                                                                }
                                                                                b = -1;
                                                                                switch (b) {
                                                                                    case 0:
                                                                                        i3 = 1;
                                                                                        q95Var.n = 3;
                                                                                        break;
                                                                                    case 1:
                                                                                        i3 = 1;
                                                                                        q95Var.n = 2;
                                                                                        break;
                                                                                    case 2:
                                                                                        i3 = 1;
                                                                                        q95Var.n = 1;
                                                                                        break;
                                                                                    default:
                                                                                        tb4.a();
                                                                                        return;
                                                                                }
                                                                                String strGroup6 = matcher.group(i3);
                                                                                strGroup6.getClass();
                                                                                q95Var.o = Float.parseFloat(strGroup6);
                                                                            } else {
                                                                                l93.q0("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                                                            }
                                                                        }
                                                                    } else if ("bold".equals(string)) {
                                                                        i4 = 1;
                                                                        q95Var.l = 1;
                                                                    }
                                                                    i3 = 1;
                                                                } else if ("over".equals(string)) {
                                                                    q95Var.p = 1;
                                                                } else if ("under".equals(string)) {
                                                                    q95Var.p = 2;
                                                                    i3 = 1;
                                                                } else {
                                                                    i3 = 1;
                                                                }
                                                            }
                                                            i3 = i4;
                                                        } else if ("}".equals(strB4)) {
                                                            be3Var2.N(i16);
                                                            if ("color".equals(strA)) {
                                                                i4 = 1;
                                                                q95Var.f = d50.a(string, true);
                                                                q95Var.g = true;
                                                            } else {
                                                                i4 = 1;
                                                                if ("background-color".equals(strA)) {
                                                                    q95Var.h = d50.a(string, true);
                                                                    q95Var.i = true;
                                                                } else if ("ruby-position".equals(strA)) {
                                                                    if ("text-combine-upright".equals(strA)) {
                                                                        if ("all".equals(string) || string.startsWith("digits")) {
                                                                            z = true;
                                                                        } else {
                                                                            z = false;
                                                                        }
                                                                        q95Var.q = z;
                                                                    } else if ("text-decoration".equals(strA)) {
                                                                        if ("underline".equals(string)) {
                                                                            i4 = 1;
                                                                            q95Var.k = 1;
                                                                        }
                                                                    } else if ("font-family".equals(strA)) {
                                                                        q95Var.e = rr2.U(string);
                                                                    } else if ("font-weight".equals(strA)) {
                                                                        i4 = 1;
                                                                        if ("font-style".equals(strA)) {
                                                                            if ("italic".equals(string)) {
                                                                                q95Var.m = 1;
                                                                            }
                                                                        } else if ("font-size".equals(strA)) {
                                                                            matcher = p95.d.matcher(rr2.U(string));
                                                                            if (matcher.matches()) {
                                                                                l93.q0("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                                                            } else {
                                                                                strGroup = matcher.group(2);
                                                                                strGroup.getClass();
                                                                                switch (strGroup.hashCode()) {
                                                                                    case 37:
                                                                                        if (!strGroup.equals("%")) {
                                                                                            b = 0;
                                                                                        }
                                                                                        switch (b) {
                                                                                            case 0:
                                                                                                i3 = 1;
                                                                                                q95Var.n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i3 = 1;
                                                                                                q95Var.n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i3 = 1;
                                                                                                q95Var.n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                tb4.a();
                                                                                                return;
                                                                                        }
                                                                                        String strGroup7 = matcher.group(i3);
                                                                                        strGroup7.getClass();
                                                                                        q95Var.o = Float.parseFloat(strGroup7);
                                                                                        break;
                                                                                    case 3240:
                                                                                        if (!strGroup.equals("em")) {
                                                                                            b = 1;
                                                                                        }
                                                                                        switch (b) {
                                                                                            case 0:
                                                                                                i3 = 1;
                                                                                                q95Var.n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i3 = 1;
                                                                                                q95Var.n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i3 = 1;
                                                                                                q95Var.n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                tb4.a();
                                                                                                return;
                                                                                        }
                                                                                        String strGroup8 = matcher.group(i3);
                                                                                        strGroup8.getClass();
                                                                                        q95Var.o = Float.parseFloat(strGroup8);
                                                                                        break;
                                                                                    case 3592:
                                                                                        if (!strGroup.equals("px")) {
                                                                                            b = 2;
                                                                                        }
                                                                                        switch (b) {
                                                                                            case 0:
                                                                                                i3 = 1;
                                                                                                q95Var.n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i3 = 1;
                                                                                                q95Var.n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i3 = 1;
                                                                                                q95Var.n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                tb4.a();
                                                                                                return;
                                                                                        }
                                                                                        String strGroup9 = matcher.group(i3);
                                                                                        strGroup9.getClass();
                                                                                        q95Var.o = Float.parseFloat(strGroup9);
                                                                                        break;
                                                                                }
                                                                                b = -1;
                                                                                switch (b) {
                                                                                    case 0:
                                                                                        i3 = 1;
                                                                                        q95Var.n = 3;
                                                                                        break;
                                                                                    case 1:
                                                                                        i3 = 1;
                                                                                        q95Var.n = 2;
                                                                                        break;
                                                                                    case 2:
                                                                                        i3 = 1;
                                                                                        q95Var.n = 1;
                                                                                        break;
                                                                                    default:
                                                                                        tb4.a();
                                                                                        return;
                                                                                }
                                                                                String strGroup10 = matcher.group(i3);
                                                                                strGroup10.getClass();
                                                                                q95Var.o = Float.parseFloat(strGroup10);
                                                                            }
                                                                        }
                                                                    } else if ("bold".equals(string)) {
                                                                        i4 = 1;
                                                                        q95Var.l = 1;
                                                                    }
                                                                    i3 = 1;
                                                                } else if ("over".equals(string)) {
                                                                    q95Var.p = 1;
                                                                } else if ("under".equals(string)) {
                                                                    q95Var.p = 2;
                                                                    i3 = 1;
                                                                } else {
                                                                    i3 = 1;
                                                                }
                                                            }
                                                            i3 = i4;
                                                        } else {
                                                            i3 = 1;
                                                        }
                                                    }
                                                } else {
                                                    i3 = i7;
                                                }
                                            } else {
                                                i3 = i7;
                                            }
                                            i7 = i3;
                                            r8 = r15;
                                            z2 = false;
                                        }
                                        int i17 = i7;
                                        if ("}".equals(strB2)) {
                                            arrayList3.add(q95Var);
                                        }
                                        i7 = i17;
                                        z2 = false;
                                        i5 = -1;
                                        str = null;
                                    }
                                }
                                arrayList.addAll(arrayList3);
                            } else if (b2 == 3) {
                                Pattern pattern = w95.a;
                                Charset charset = StandardCharsets.UTF_8;
                                String strN2 = be3Var.n(charset);
                                if (strN2 == null) {
                                    r95VarD = null;
                                } else {
                                    Pattern pattern2 = w95.a;
                                    Matcher matcher3 = pattern2.matcher(strN2);
                                    if (matcher3.matches()) {
                                        r95VarD = w95.d(null, matcher3, be3Var, arrayList);
                                    } else {
                                        r95VarD = null;
                                        String strN3 = be3Var.n(charset);
                                        if (strN3 != null) {
                                            Matcher matcher4 = pattern2.matcher(strN3);
                                            if (matcher4.matches()) {
                                                r95VarD = w95.d(strN2.trim(), matcher4, be3Var, arrayList);
                                            }
                                        }
                                    }
                                }
                                if (r95VarD != null) {
                                    arrayList2.add(r95VarD);
                                }
                            }
                            wo0Var = this;
                        }
                    }
                }
            }
        } catch (ParserException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public void e(boolean z) {
        kc1 kc1Var = ((ld1) this.o).x;
        if (kc1Var != null) {
            kc1Var.q().n.e(true);
        }
        for (yc1 yc1Var : (CopyOnWriteArrayList) this.n) {
            if (z) {
                yc1Var.getClass();
            } else {
                rf2 rf2Var = yc1Var.a;
            }
        }
    }

    public void f(boolean z) {
        ld1 ld1Var = (ld1) this.o;
        nc1 nc1Var = ld1Var.v.B;
        kc1 kc1Var = ld1Var.x;
        if (kc1Var != null) {
            kc1Var.q().n.f(true);
        }
        for (yc1 yc1Var : (CopyOnWriteArrayList) this.n) {
            if (z) {
                yc1Var.getClass();
            } else {
                rf2 rf2Var = yc1Var.a;
            }
        }
    }

    public void g(boolean z) {
        kc1 kc1Var = ((ld1) this.o).x;
        if (kc1Var != null) {
            kc1Var.q().n.g(true);
        }
        for (yc1 yc1Var : (CopyOnWriteArrayList) this.n) {
            if (z) {
                yc1Var.getClass();
            } else {
                rf2 rf2Var = yc1Var.a;
            }
        }
    }

    @Override // defpackage.kg1
    public void h(Object obj) {
        List list = (List) obj;
        list.getClass();
        MediaService mediaService = (MediaService) this.n;
        mediaService.B.post(new v6(mediaService, list, (qi3) this.o, 3));
    }

    public void i(boolean z) {
        kc1 kc1Var = ((ld1) this.o).x;
        if (kc1Var != null) {
            kc1Var.q().n.i(true);
        }
        for (yc1 yc1Var : (CopyOnWriteArrayList) this.n) {
            if (z) {
                yc1Var.getClass();
            } else {
                rf2 rf2Var = yc1Var.a;
            }
        }
    }

    public void j(boolean z) {
        kc1 kc1Var = ((ld1) this.o).x;
        if (kc1Var != null) {
            kc1Var.q().n.j(true);
        }
        for (yc1 yc1Var : (CopyOnWriteArrayList) this.n) {
            if (z) {
                yc1Var.getClass();
            } else {
                rf2 rf2Var = yc1Var.a;
            }
        }
    }

    public void k(boolean z) {
        kc1 kc1Var = ((ld1) this.o).x;
        if (kc1Var != null) {
            kc1Var.q().n.k(true);
        }
        for (yc1 yc1Var : (CopyOnWriteArrayList) this.n) {
            if (z) {
                yc1Var.getClass();
            } else {
                rf2 rf2Var = yc1Var.a;
            }
        }
    }

    public void l(boolean z) {
        ld1 ld1Var = (ld1) this.o;
        nc1 nc1Var = ld1Var.v.B;
        kc1 kc1Var = ld1Var.x;
        if (kc1Var != null) {
            kc1Var.q().n.l(true);
        }
        for (yc1 yc1Var : (CopyOnWriteArrayList) this.n) {
            if (z) {
                yc1Var.getClass();
            } else {
                rf2 rf2Var = yc1Var.a;
            }
        }
    }

    @Override // defpackage.bi0
    public ci0 m() {
        return new p04(((rm2) this.n).m(), (mj0) this.o);
    }

    public void n(boolean z) {
        kc1 kc1Var = ((ld1) this.o).x;
        if (kc1Var != null) {
            kc1Var.q().n.n(true);
        }
        for (yc1 yc1Var : (CopyOnWriteArrayList) this.n) {
            if (z) {
                yc1Var.getClass();
            } else {
                rf2 rf2Var = yc1Var.a;
            }
        }
    }

    @Override // defpackage.kg1
    public void o(Throwable th) {
        th.getClass();
        Log.e("BaseMediaService", "updateMediaItems failed", th);
    }

    @Override // retrofit2.Callback
    public void onFailure(Call call, Throwable th) {
        ((k03) this.n).k(kb4.Z((String) this.o, null));
    }

    @Override // retrofit2.Callback
    public void onResponse(Call call, Response response) {
        List<Child> arrayList = null;
        List<Child> songs = (!response.isSuccessful() || response.body() == null || ((ApiResponse) response.body()).getSubsonicResponse() == null || ((ApiResponse) response.body()).getSubsonicResponse().getTopSongs() == null) ? null : ((ApiResponse) response.body()).getSubsonicResponse().getTopSongs().getSongs();
        k03 k03Var = (k03) this.n;
        String str = (String) this.o;
        if (response.isSuccessful()) {
            arrayList = songs != null ? songs : new ArrayList<>();
        }
        k03Var.k(kb4.Z(str, arrayList));
    }

    public void p(boolean z) {
        kc1 kc1Var = ((ld1) this.o).x;
        if (kc1Var != null) {
            kc1Var.q().n.p(true);
        }
        for (yc1 yc1Var : (CopyOnWriteArrayList) this.n) {
            if (z) {
                yc1Var.getClass();
            } else {
                rf2 rf2Var = yc1Var.a;
            }
        }
    }

    public void q(boolean z) {
        kc1 kc1Var = ((ld1) this.o).x;
        if (kc1Var != null) {
            kc1Var.q().n.q(true);
        }
        for (yc1 yc1Var : (CopyOnWriteArrayList) this.n) {
            if (z) {
                yc1Var.getClass();
            } else {
                rf2 rf2Var = yc1Var.a;
            }
        }
    }

    public void r(boolean z) {
        kc1 kc1Var = ((ld1) this.o).x;
        if (kc1Var != null) {
            kc1Var.q().n.r(true);
        }
        for (yc1 yc1Var : (CopyOnWriteArrayList) this.n) {
            if (z) {
                yc1Var.getClass();
            } else {
                rf2 rf2Var = yc1Var.a;
            }
        }
    }

    public void s(boolean z) {
        kc1 kc1Var = ((ld1) this.o).x;
        if (kc1Var != null) {
            kc1Var.q().n.s(true);
        }
        for (yc1 yc1Var : (CopyOnWriteArrayList) this.n) {
            if (z) {
                yc1Var.getClass();
            } else {
                rf2 rf2Var = yc1Var.a;
            }
        }
    }

    public void t(kc1 kc1Var, View view, boolean z) {
        kc1 kc1Var2 = ((ld1) this.o).x;
        if (kc1Var2 != null) {
            kc1Var2.q().n.t(kc1Var, view, true);
        }
        for (yc1 yc1Var : (CopyOnWriteArrayList) this.n) {
            if (z) {
                yc1Var.getClass();
            } else {
                rf2 rf2Var = yc1Var.a;
                ld1 ld1Var = (ld1) this.o;
                if (kc1Var == ((kc1) rf2Var.n)) {
                    wo0 wo0Var = ld1Var.n;
                    synchronized (((CopyOnWriteArrayList) wo0Var.n)) {
                        try {
                            int size = ((CopyOnWriteArrayList) wo0Var.n).size();
                            for (int i = 0; i < size; i++) {
                                if (((yc1) ((CopyOnWriteArrayList) wo0Var.n).get(i)).a == rf2Var) {
                                    ((CopyOnWriteArrayList) wo0Var.n).remove(i);
                                    break;
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    ee1.p(view, (FrameLayout) rf2Var.o);
                } else {
                    continue;
                }
            }
        }
    }

    public void u(boolean z) {
        kc1 kc1Var = ((ld1) this.o).x;
        if (kc1Var != null) {
            kc1Var.q().n.u(true);
        }
        for (yc1 yc1Var : (CopyOnWriteArrayList) this.n) {
            if (z) {
                yc1Var.getClass();
            } else {
                rf2 rf2Var = yc1Var.a;
            }
        }
    }

    public zl v(tb1 tb1Var, il ilVar) {
        boolean zBooleanValue;
        tb1Var.getClass();
        int i = tb1Var.G;
        ilVar.getClass();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 29 || i == -1) {
            return zl.d;
        }
        Context context = (Context) this.n;
        Boolean bool = (Boolean) this.o;
        boolean z = false;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            if (context != null) {
                String parameters = xl.n(context).getParameters("offloadVariableRateSupported");
                this.o = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                this.o = Boolean.FALSE;
            }
            zBooleanValue = ((Boolean) this.o).booleanValue();
        }
        String str = tb1Var.n;
        str.getClass();
        int iC = lw2.c(str, tb1Var.k);
        if (iC == 0 || i2 < f35.r(iC)) {
            return zl.d;
        }
        int iS = f35.s(tb1Var.F);
        if (iS == 0) {
            return zl.d;
        }
        try {
            AudioFormat audioFormatBuild = new AudioFormat.Builder().setSampleRate(i).setChannelMask(iS).setEncoding(iC).build();
            if (i2 < 31) {
                if (!AudioManager.isOffloadedPlaybackSupported(audioFormatBuild, ilVar.c())) {
                    return zl.d;
                }
                yl ylVar = new yl();
                ylVar.a = true;
                ylVar.c = zBooleanValue;
                return ylVar.a();
            }
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormatBuild, ilVar.c());
            if (playbackOffloadSupport == 0) {
                return zl.d;
            }
            yl ylVar2 = new yl();
            if (i2 > 32 && playbackOffloadSupport == 2) {
                z = true;
            }
            ylVar2.a = true;
            ylVar2.b = z;
            ylVar2.c = zBooleanValue;
            return ylVar2.a();
        } catch (IllegalArgumentException unused) {
            return zl.d;
        }
    }

    public ArrayList w(String str) {
        w24 w24VarB = w24.b(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        w24VarB.h(1, str);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.n;
        workDatabase_Impl.b();
        Cursor cursorH = xl.H(workDatabase_Impl, w24VarB);
        try {
            ArrayList arrayList = new ArrayList(cursorH.getCount());
            while (cursorH.moveToNext()) {
                arrayList.add(cursorH.getString(0));
            }
            cursorH.close();
            w24VarB.j();
            return arrayList;
        } catch (Throwable th) {
            cursorH.close();
            w24VarB.j();
            throw th;
        }
    }

    @Override // defpackage.hu0
    public void x() {
        aw3 aw3Var = (aw3) this.n;
        synchronized (aw3Var) {
            aw3Var.p = aw3Var.n.length;
        }
    }

    public fg4 y() {
        MediaController.PlaybackInfo playbackInfo = ((xk2) this.n).a.getPlaybackInfo();
        if (playbackInfo != null) {
            return new fg4(playbackInfo.getPlaybackType(), il.b(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume(), Build.VERSION.SDK_INT >= 30 ? playbackInfo.getVolumeControlId() : null);
        }
        return null;
    }

    public ei3 z() {
        xk2 xk2Var = (xk2) this.n;
        qu1 qu1VarA = xk2Var.e.a();
        if (qu1VarA != null) {
            try {
                return qu1VarA.g();
            } catch (RemoteException | SecurityException e) {
                l93.G("MediaControllerCompat", "Dead object in getPlaybackState.", e);
            }
        }
        PlaybackState playbackState = xk2Var.a.getPlaybackState();
        if (playbackState != null) {
            return ei3.a(playbackState);
        }
        return null;
    }

    public /* synthetic */ wo0(Object obj, Object obj2) {
        this.n = obj;
        this.o = obj2;
    }

    public wo0(AbsSeekBar absSeekBar) {
        this.n = absSeekBar;
    }

    public wo0(Context context) {
        this.n = context == null ? null : context.getApplicationContext();
    }

    public wo0(int i) {
        switch (i) {
            case 23:
                this.n = new be3();
                this.o = new p95();
                break;
            default:
                this.n = new xi4(15);
                this.o = new fg4(16);
                break;
        }
    }

    public wo0(Context context, pr2 pr2Var) {
        this.o = Collections.synchronizedSet(new HashSet());
        if (Build.VERSION.SDK_INT >= 29) {
            this.n = new yk2(context, pr2Var);
        } else {
            this.n = new xk2(context, pr2Var);
        }
    }
}
