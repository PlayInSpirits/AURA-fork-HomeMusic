package retrofit2;

import defpackage.ac1;
import defpackage.bv3;
import defpackage.fu4;
import defpackage.fw;
import defpackage.fy;
import defpackage.gy;
import defpackage.h12;
import defpackage.hu2;
import defpackage.j14;
import defpackage.k14;
import defpackage.kf2;
import defpackage.ky;
import defpackage.n14;
import defpackage.na4;
import defpackage.o83;
import defpackage.oz3;
import defpackage.qg3;
import defpackage.tv;
import defpackage.xu3;
import defpackage.yu3;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
final class OkHttpCall<T> implements Call<T> {
    private final Object[] args;
    private final fy callFactory;
    private volatile boolean canceled;

    @Nullable
    private Throwable creationFailure;
    private boolean executed;
    private final Object instance;

    @Nullable
    private gy rawCall;
    private final RequestFactory requestFactory;
    private final Converter<n14, T> responseConverter;

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class ExceptionCatchingResponseBody extends n14 {
        private final n14 delegate;
        private final fw delegateSource;

        @Nullable
        IOException thrownException;

        public ExceptionCatchingResponseBody(n14 n14Var) {
            this.delegate = n14Var;
            this.delegateSource = new xu3(new ac1(n14Var.source()) { // from class: retrofit2.OkHttpCall.ExceptionCatchingResponseBody.1
                @Override // defpackage.ac1, defpackage.ej4
                public long read(tv tvVar, long j) throws IOException {
                    try {
                        return super.read(tvVar, j);
                    } catch (IOException e) {
                        ExceptionCatchingResponseBody.this.thrownException = e;
                        throw e;
                    }
                }
            });
        }

        @Override // defpackage.n14, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.delegate.close();
        }

        @Override // defpackage.n14
        public long contentLength() {
            return this.delegate.contentLength();
        }

        @Override // defpackage.n14
        public hu2 contentType() {
            return this.delegate.contentType();
        }

        @Override // defpackage.n14
        public fw source() {
            return this.delegateSource;
        }

        public void throwIfCaught() throws IOException {
            IOException iOException = this.thrownException;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class NoContentResponseBody extends n14 {
        private final long contentLength;

        @Nullable
        private final hu2 contentType;

        public NoContentResponseBody(@Nullable hu2 hu2Var, long j) {
            this.contentType = hu2Var;
            this.contentLength = j;
        }

        @Override // defpackage.n14
        public long contentLength() {
            return this.contentLength;
        }

        @Override // defpackage.n14
        public hu2 contentType() {
            return this.contentType;
        }

        @Override // defpackage.n14
        public fw source() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public OkHttpCall(RequestFactory requestFactory, Object obj, Object[] objArr, fy fyVar, Converter<n14, T> converter) {
        this.requestFactory = requestFactory;
        this.instance = obj;
        this.args = objArr;
        this.callFactory = fyVar;
        this.responseConverter = converter;
    }

    private gy createRawCall() {
        fy fyVar = this.callFactory;
        oz3 oz3VarCreate = this.requestFactory.create(this.instance, this.args);
        o83 o83Var = (o83) fyVar;
        o83Var.getClass();
        oz3VarCreate.getClass();
        return new bv3(o83Var, oz3VarCreate);
    }

    private gy getRawCall() throws IOException {
        gy gyVar = this.rawCall;
        if (gyVar != null) {
            return gyVar;
        }
        Throwable th = this.creationFailure;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            gy gyVarCreateRawCall = createRawCall();
            this.rawCall = gyVarCreateRawCall;
            return gyVarCreateRawCall;
        } catch (IOException | Error | RuntimeException e) {
            Utils.throwIfFatal(e);
            this.creationFailure = e;
            throw e;
        }
    }

    @Override // retrofit2.Call
    public void cancel() {
        gy gyVar;
        this.canceled = true;
        synchronized (this) {
            gyVar = this.rawCall;
        }
        if (gyVar != null) {
            ((bv3) gyVar).cancel();
        }
    }

    @Override // retrofit2.Call
    public OkHttpCall<T> clone() {
        return new OkHttpCall<>(this.requestFactory, this.instance, this.args, this.callFactory, this.responseConverter);
    }

    @Override // retrofit2.Call
    public void enqueue(final Callback<T> callback) {
        gy gyVar;
        Throwable th;
        yu3 yu3Var;
        Objects.requireNonNull(callback, "callback == null");
        synchronized (this) {
            try {
                if (this.executed) {
                    throw new IllegalStateException("Already executed.");
                }
                this.executed = true;
                gyVar = this.rawCall;
                th = this.creationFailure;
                if (gyVar == null && th == null) {
                    try {
                        gy gyVarCreateRawCall = createRawCall();
                        this.rawCall = gyVarCreateRawCall;
                        gyVar = gyVarCreateRawCall;
                    } catch (Throwable th2) {
                        th = th2;
                        Utils.throwIfFatal(th);
                        this.creationFailure = th;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (th != null) {
            callback.onFailure(this, th);
            return;
        }
        if (this.canceled) {
            ((bv3) gyVar).cancel();
        }
        ky kyVar = new ky() { // from class: retrofit2.OkHttpCall.1
            private void callFailure(Throwable th4) {
                try {
                    callback.onFailure(OkHttpCall.this, th4);
                } catch (Throwable th5) {
                    Utils.throwIfFatal(th5);
                    th5.printStackTrace();
                }
            }

            @Override // defpackage.ky
            public void onFailure(gy gyVar2, IOException iOException) {
                callFailure(iOException);
            }

            @Override // defpackage.ky
            public void onResponse(gy gyVar2, k14 k14Var) {
                try {
                    try {
                        callback.onResponse(OkHttpCall.this, OkHttpCall.this.parseResponse(k14Var));
                    } catch (Throwable th4) {
                        Utils.throwIfFatal(th4);
                        th4.printStackTrace();
                    }
                } catch (Throwable th5) {
                    Utils.throwIfFatal(th5);
                    callFailure(th5);
                }
            }
        };
        bv3 bv3Var = (bv3) gyVar;
        bv3Var.getClass();
        if (!bv3Var.r.compareAndSet(false, true)) {
            kf2.o("Already Executed");
            return;
        }
        qg3 qg3Var = qg3.a;
        bv3Var.s = qg3.a.g();
        na4 na4Var = bv3Var.n.a;
        yu3 yu3Var2 = new yu3(bv3Var, kyVar);
        na4Var.getClass();
        synchronized (na4Var) {
            ((ArrayDeque) na4Var.o).add(yu3Var2);
            String str = bv3Var.o.a.d;
            Iterator it = ((ArrayDeque) na4Var.p).iterator();
            do {
                if (!it.hasNext()) {
                    Iterator it2 = ((ArrayDeque) na4Var.o).iterator();
                    do {
                        if (!it2.hasNext()) {
                            yu3Var = null;
                            break;
                        }
                        yu3Var = (yu3) it2.next();
                    } while (!h12.c(yu3Var.p.o.a.d, str));
                } else {
                    yu3Var = (yu3) it.next();
                }
            } while (!h12.c(yu3Var.p.o.a.d, str));
            if (yu3Var != null) {
                yu3Var2.o = yu3Var.o;
            }
        }
        na4Var.L();
    }

    @Override // retrofit2.Call
    public Response<T> execute() {
        gy rawCall;
        synchronized (this) {
            if (this.executed) {
                throw new IllegalStateException("Already executed.");
            }
            this.executed = true;
            rawCall = getRawCall();
        }
        if (this.canceled) {
            ((bv3) rawCall).cancel();
        }
        return parseResponse(((bv3) rawCall).c());
    }

    @Override // retrofit2.Call
    public boolean isCanceled() {
        boolean z = true;
        if (this.canceled) {
            return true;
        }
        synchronized (this) {
            gy gyVar = this.rawCall;
            if (gyVar == null || !((bv3) gyVar).A) {
                z = false;
            }
        }
        return z;
    }

    @Override // retrofit2.Call
    public synchronized boolean isExecuted() {
        return this.executed;
    }

    public Response<T> parseResponse(k14 k14Var) throws IOException {
        n14 n14Var = k14Var.t;
        j14 j14VarF = k14Var.f();
        j14VarF.g = new NoContentResponseBody(n14Var.contentType(), n14Var.contentLength());
        k14 k14VarA = j14VarF.a();
        int i = k14VarA.q;
        if (i < 200 || i >= 300) {
            try {
                return Response.error(Utils.buffer(n14Var), k14VarA);
            } finally {
                n14Var.close();
            }
        }
        if (i == 204 || i == 205) {
            n14Var.close();
            return Response.success((Object) null, k14VarA);
        }
        ExceptionCatchingResponseBody exceptionCatchingResponseBody = new ExceptionCatchingResponseBody(n14Var);
        try {
            return Response.success(this.responseConverter.convert(exceptionCatchingResponseBody), k14VarA);
        } catch (RuntimeException e) {
            exceptionCatchingResponseBody.throwIfCaught();
            throw e;
        }
    }

    @Override // retrofit2.Call
    public synchronized oz3 request() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return ((bv3) getRawCall()).o;
    }

    @Override // retrofit2.Call
    public synchronized fu4 timeout() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create call.", e);
        }
        return ((bv3) getRawCall()).q;
    }
}
