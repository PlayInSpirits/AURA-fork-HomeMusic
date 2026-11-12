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

    public /* synthetic */ i80(int r1) {
        this.n = r1;
    }

    public static Date B(Long r2) {
        if (r2 != null) goto L4;
        return null;
    L4:
        return new Date(r2.longValue());
    }

    public static dd2 C(n50 r2, x7 r3) {
        IOException r4 = (IOException) r3.p;
        if ((r4 instanceof HttpDataSource$InvalidResponseCodeException) == false) goto L24;
        int r5 = ((HttpDataSource$InvalidResponseCodeException) r4).p;
        if (r5 == 403) goto L18;
        if (r5 == 404) goto L18;
        if (r5 == 410) goto L18;
        if (r5 == 416) goto L18;
        if (r5 == 500) goto L18;
        if (r5 == 503) goto L18;
        return null;
    L18:
        if ((r2.a - r2.b) > 1) goto L20;
        return null;
    L20:
        return new dd2(2, 60000);
    L24:
        return null;
    }

    public static long E(x7 r3) {
        Throwable r0 = (IOException) r3.p;
    L3:
        if (r0 == null) goto L21;
        if ((r0 instanceof ParserException) == true) goto L18;
        if ((r0 instanceof FileNotFoundException) == true) goto L30;
        if ((r0 instanceof HttpDataSource$CleartextNotPermittedException) == true) goto L31;
        if ((r0 instanceof Loader$UnexpectedLoaderException) == true) goto L32;
        if ((r0 instanceof DataSourceException) == false) goto L17;
        if (((DataSourceException) r0).n != 2008) goto L17;
        return -9223372036854775807L;
    L17:
        r0 = r0.getCause();
        goto L3
    L32:
        return -9223372036854775807L;
    L31:
        return -9223372036854775807L;
    L30:
        return -9223372036854775807L;
    L18:
        return -9223372036854775807L;
    L21:
        return Math.min((r3.o - 1) * 1000, SmartSession.MAX_SONGS);
    }

    public static Long j(Date r2) {
        if (r2 != null) goto L4;
        return null;
    L4:
        return Long.valueOf(r2.getTime());
    }

    public static ByteArrayInputStream q(String r5) {
        if (r5.startsWith("data:image") == false) goto L14;
        int r0 = r5.indexOf(44);
        if (r0 != (-1)) goto L7;
        kf2.n("Missing comma in data URL.");
        return null;
    L7:
        if (r5.substring(0, r0).endsWith(";base64") == true) goto L9;
        kf2.n("Not a base64 image data URL.");
        return null;
    L9:
        return new ByteArrayInputStream(Base64.decode(r5.substring(r0 + 1), 0));
    L14:
        kf2.n("Not a valid image data URL.");
        return null;
    }

    public static byte[] y(yw1 r6, long r7) {
        ArrayList<? extends Parcelable> r0 = new ArrayList(r6.size());
        Iterator<E> r8 = r6.iterator();
    L4:
        if (r8.hasNext() == false) goto L9;
        ig0 r1 = (ig0) r8.next();
        Bundle r2 = r1.b();
        Bitmap r3 = r1.d;
        if (r3 == null) goto L8;
        ByteArrayOutputStream r4 = new ByteArrayOutputStream();
        rr2.w(r3.compress(Bitmap.CompressFormat.PNG, 0, r4));
        r2.putByteArray(ig0.x, r4.toByteArray());
    L8:
        r0.add(r2);
        goto L4
    L9:
        Bundle r9 = new Bundle();
        r9.putParcelableArrayList("c", r0);
        r9.putLong("d", r7);
        Parcel r10 = Parcel.obtain();
        r10.writeBundle(r9);
        byte[] r11 = r10.marshall();
        r10.recycle();
        return r11;
    }

    @Override // defpackage.o73
    public Object A() {
        switch(this.n) {
            case 5: goto L21;
            case 6: goto L19;
            case 7: goto L17;
            case 8: goto L15;
            case 9: goto L13;
            case 10: goto L11;
            case 11: goto L9;
            case 12: goto L7;
            default: goto L5;
        };
    L5:
        return new nb2(true);
    L7:
        return new LinkedHashMap();
    L9:
        return new TreeMap();
    L11:
        return new ConcurrentHashMap();
    L13:
        return new ConcurrentSkipListMap();
    L15:
        return new ArrayList();
    L17:
        return new ArrayDeque();
    L19:
        return new LinkedHashSet();
    L21:
        return new TreeSet();
    }

    public int D(int r1) {
        if (r1 != 7) goto L6;
        return 6;
    L6:
        return 3;
    }

    public Signature[] F(PackageManager r1, String r2) {
        return r1.getPackageInfo(r2, 64).signatures;
    }

    @Override // defpackage.v11
    public short b() {
        return 0;
    }

    @Override // defpackage.v11
    public short[] d() {
        return null;
    }

    @Override // defpackage.fn1
    public ce3 e(cn1 r1, ym1 r2) {
        return new en1(r1, r2);
    }

    @Override // defpackage.v11
    public boolean f(Context r1, int r2) {
        return false;
    }

    @Override // defpackage.fn1
    public ce3 g() {
        return new en1();
    }

    public long h(long r6, long r8) {
        switch(this.n) {
            case 14: goto L13;
            case 15: goto L11;
            default: goto L5;
        };
    L11:
        float r5 = g12.c(r6, r8);
        long r7 = (Float.floatToRawIntBits(r5) << 32) | (Float.floatToRawIntBits(r5) & 4294967295L);
        int r9 = u54.a;
        return r7;
    L13:
        float r10 = Math.max(Float.intBitsToFloat((int) (r8 >> 32)) / Float.intBitsToFloat((int) (r6 >> 32)), Float.intBitsToFloat((int) (r8 & 4294967295L)) / Float.intBitsToFloat((int) (r6 & 4294967295L)));
        long r11 = (Float.floatToRawIntBits(r10) << 32) | (Float.floatToRawIntBits(r10) & 4294967295L);
        int r12 = u54.a;
        return r11;
    L5:
        if (Float.intBitsToFloat((int) (r6 >> 32)) <= Float.intBitsToFloat((int) (r8 >> 32))) goto L7;
    L9:
        float r13 = g12.c(r6, r8);
        long r14 = (Float.floatToRawIntBits(r13) << 32) | (Float.floatToRawIntBits(r13) & 4294967295L);
        int r15 = u54.a;
        return r14;
    L7:
        if (Float.intBitsToFloat((int) (r6 & 4294967295L)) > Float.intBitsToFloat((int) (r8 & 4294967295L))) goto L9;
        long r16 = (Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L);
        int r17 = u54.a;
        return r16;
    }

    @Override // defpackage.v11
    public Integer n(short r1) {
        return null;
    }

    @Override // defpackage.v11
    public void o(Context r1, int r2) {
    }

    @Override // defpackage.be0
    public void p(gr1 r1, List r2) {
        r1.getClass();
    }

    @Override // defpackage.v11
    public void setEnabled(boolean r1) {
    }

    public String toString() {
        switch(this.n) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L5;
        };
    L6:
        return "CompositionErrorContext";
    L8:
        return "Empty";
    L5:
        return super.toString();
    }

    @Override // defpackage.v11
    public void v(short r1, short r2) {
    }

    @Override // defpackage.be0
    public List w(gr1 r1) {
        r1.getClass();
        return u01.n;
    }

    @Override // defpackage.v11
    public Short z(short r1) {
        return null;
    }
}
