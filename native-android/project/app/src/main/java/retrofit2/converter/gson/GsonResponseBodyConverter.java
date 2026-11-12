package retrofit2.converter.gson;

import com.google.gson.JsonIOException;
import defpackage.bz4;
import defpackage.l32;
import defpackage.n14;
import defpackage.nk1;
import java.io.Reader;
import retrofit2.Converter;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
final class GsonResponseBodyConverter<T> implements Converter<n14, T> {
    private final bz4 adapter;
    private final nk1 gson;

    public GsonResponseBodyConverter(nk1 r1, bz4 r2) {
        this.gson = r1;
        this.adapter = r2;
    }

    /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
    public T convert2(n14 r4) {
        nk1 r0 = this.gson;
        Reader r1 = r4.charStream();
        r0.getClass();
        l32 r2 = new l32(r1);
        r2.o = r0.g;
        T r3 = (T) this.adapter.a(r2);
        if (r2.e0() != 10) goto L9;
        r4.close();
        return r3;
    L9:
        throw new JsonIOException("JSON document was not fully consumed.");     // Catch: Throwable -> L10
    L10:
        th = move-exception;
        r4.close();
        throw th;
    }

    @Override // retrofit2.Converter
    public /* bridge */ /* synthetic */ Object convert(n14 r1) {
        return convert2(r1);
    }
}
