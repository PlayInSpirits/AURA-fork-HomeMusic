package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException;
import com.eddyizm.tempus.homemusic.SmartSession;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class i80 implements me0, o73, be0, v11, fn1, o55 {
    public final /* synthetic */ int n;

    public /* synthetic */ i80(int i) {
        this.n = i;
    }

    public static Date B(Long l) {
        if (l != null) {
            return new Date(l.longValue());
        }
        return null;
    }

    public static dd2 C(n50 n50Var, x7 x7Var) {
        IOException iOException = (IOException) x7Var.p;
        if (!(iOException instanceof HttpDataSource$InvalidResponseCodeException)) {
            return null;
        }
        int i = ((HttpDataSource$InvalidResponseCodeException) iOException).p;
        if ((i == 403 || i == 404 || i == 410 || i == 416 || i == 500 || i == 503) && n50Var.a - n50Var.b > 1) {
            return new dd2(2, 60000L);
        }
        return null;
    }

    public static long E(x7 x7Var) {
        for (Throwable cause = (IOException) x7Var.p; cause != null; cause = cause.getCause()) {
            if ((cause instanceof ParserException) || (cause instanceof FileNotFoundException) || (cause instanceof HttpDataSource$CleartextNotPermittedException) || (cause instanceof Loader$UnexpectedLoaderException)) {
                return -9223372036854775807L;
            }
            if ((cause instanceof DataSourceException) && ((DataSourceException) cause).n == 2008) {
                return -9223372036854775807L;
            }
        }
        return Math.min((x7Var.o - 1) * 1000, SmartSession.MAX_SONGS);
    }

    public static Long j(Date date) {
        if (date != null) {
            return Long.valueOf(date.getTime());
        }
        return null;
    }

    public static ByteArrayInputStream q(String str) {
        if (!str.startsWith("data:image")) {
            kf2.n("Not a valid image data URL.");
            return null;
        }
        int iIndexOf = str.indexOf(44);
        if (iIndexOf == -1) {
            kf2.n("Missing comma in data URL.");
            return null;
        }
        if (str.substring(0, iIndexOf).endsWith(";base64")) {
            return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
        }
        kf2.n("Not a base64 image data URL.");
        return null;
    }

    public static byte[] y(yw1 yw1Var, long j) {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(yw1Var.size());
        Iterator<E> it = yw1Var.iterator();
        while (it.hasNext()) {
            ig0 ig0Var = (ig0) it.next();
            Bundle bundleB = ig0Var.b();
            Bitmap bitmap = ig0Var.d;
            if (bitmap != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                rr2.w(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                bundleB.putByteArray(ig0.x, byteArrayOutputStream.toByteArray());
            }
            arrayList.add(bundleB);
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    @Override // defpackage.o73
    public Object A() {
        switch (this.n) {
            case 5:
                return new TreeSet();
            case 6:
                return new LinkedHashSet();
            case 7:
                return new ArrayDeque();
            case 8:
                return new ArrayList();
            case 9:
                return new ConcurrentSkipListMap();
            case 10:
                return new ConcurrentHashMap();
            case 11:
                return new TreeMap();
            case 12:
                return new LinkedHashMap();
            default:
                return new nb2(true);
        }
    }

    public int D(int i) {
        return i == 7 ? 6 : 3;
    }

    public Signature[] F(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // defpackage.v11
    public short b() {
        return (short) 0;
    }

    @Override // defpackage.v11
    public short[] d() {
        return null;
    }

    @Override // defpackage.fn1
    public ce3 e(cn1 cn1Var, ym1 ym1Var) {
        return new en1(cn1Var, ym1Var);
    }

    @Override // defpackage.v11
    public boolean f(Context context, int i) {
        return false;
    }

    @Override // defpackage.fn1
    public ce3 g() {
        return new en1();
    }

    public long h(long j, long j2) {
        switch (this.n) {
            case 14:
                float fMax = Math.max(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L);
                int i = u54.a;
                return jFloatToRawIntBits;
            case 15:
                float fC = g12.c(j, j2);
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fC)) << 32) | (((long) Float.floatToRawIntBits(fC)) & 4294967295L);
                int i2 = u54.a;
                return jFloatToRawIntBits2;
            default:
                if (Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (j2 >> 32)) && Float.intBitsToFloat((int) (j & 4294967295L)) <= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
                    long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L);
                    int i3 = u54.a;
                    return jFloatToRawIntBits3;
                }
                float fC2 = g12.c(j, j2);
                long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(fC2)) << 32) | (((long) Float.floatToRawIntBits(fC2)) & 4294967295L);
                int i4 = u54.a;
                return jFloatToRawIntBits4;
        }
    }

    @Override // defpackage.v11
    public Integer n(short s) {
        return null;
    }

    @Override // defpackage.v11
    public void o(Context context, int i) {
    }

    @Override // defpackage.be0
    public void p(gr1 gr1Var, List list) {
        gr1Var.getClass();
    }

    @Override // defpackage.v11
    public void setEnabled(boolean z) {
    }

    public String toString() {
        switch (this.n) {
            case 0:
                return "Empty";
            case 1:
                return "CompositionErrorContext";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.v11
    public void v(short s, short s2) {
    }

    @Override // defpackage.be0
    public List w(gr1 gr1Var) {
        gr1Var.getClass();
        return u01.n;
    }

    @Override // defpackage.v11
    public Short z(short s) {
        return null;
    }
}
