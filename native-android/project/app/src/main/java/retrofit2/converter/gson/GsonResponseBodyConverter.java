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

    public GsonResponseBodyConverter(nk1 nk1Var, bz4 bz4Var) {
        this.gson = nk1Var;
        this.adapter = bz4Var;
    }

    @Override // retrofit2.Converter
    public T convert(n14 n14Var) {
        nk1 nk1Var = this.gson;
        Reader readerCharStream = n14Var.charStream();
        nk1Var.getClass();
        l32 l32Var = new l32(readerCharStream);
        l32Var.o = nk1Var.g;
        try {
            T t = (T) this.adapter.a(l32Var);
            if (l32Var.e0() != 10) {
                throw new JsonIOException("JSON document was not fully consumed.");
            }
            n14Var.close();
            return t;
        } catch (Throwable th) {
            n14Var.close();
            throw th;
        }
    }
}
