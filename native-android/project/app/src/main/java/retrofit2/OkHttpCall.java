package retrofit2;

import defpackage.av3;
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

        public ExceptionCatchingResponseBody(n14 r2) {
            this.delegate = r2;
            final fw r3 = r2.source();
            this.delegateSource = new xu3(new AnonymousClass1(this, r3));
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

        public void throwIfCaught() {
            IOException r0 = this.thrownException;
            if (r0 != null) goto L5;
            return;
        L5:
            throw r0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class NoContentResponseBody extends n14 {
        private final long contentLength;

        @Nullable
        private final hu2 contentType;

        public NoContentResponseBody(@Nullable hu2 r1, long r2) {
            this.contentType = r1;
            this.contentLength = r2;
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

    public OkHttpCall(RequestFactory r1, Object r2, Object[] r3, fy r4, Converter<n14, T> r5) {
        this.requestFactory = r1;
        this.instance = r2;
        this.args = r3;
        this.callFactory = r4;
        this.responseConverter = r5;
    }

    private gy createRawCall() {
        fy r0 = this.callFactory;
        oz3 r3 = this.requestFactory.create(this.instance, this.args);
        o83 r1 = (o83) r0;
        r1.getClass();
        r3.getClass();
        return new bv3(r1, r3);
    }

    private gy getRawCall() {
        gy r0 = this.rawCall;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Throwable r1 = this.creationFailure;
        if (r1 != null) goto L8;
        gy r2 = createRawCall();     // Catch: IOException -> L19 Throwable -> L21 RuntimeException -> L23
        this.rawCall = r2;     // Catch: IOException -> L19 Throwable -> L21 RuntimeException -> L23
        return r2;
    L21:
        e = move-exception;
        Utils.throwIfFatal(e);
        this.creationFailure = e;
        throw e;
    L8:
        if ((r1 instanceof IOException) == true) goto L16;
        if ((r1 instanceof RuntimeException) == false) goto L14;
        throw ((RuntimeException) r1);
    L14:
        throw ((Error) r1);
    L16:
        throw ((IOException) r1);
    }

    @Override // retrofit2.Call
    public void cancel() {
        this.canceled = true;
        monitor-enter(this);
        gy r0 = this.rawCall;     // Catch: Throwable -> L9
        monitor-exit(this);     // Catch: Throwable -> L9
        if (r0 == null) goto L14;
        ((bv3) r0).cancel();
        return;
    L14:
        return;
    L9:
        th = move-exception;
        throw th;
    }

    @Override // retrofit2.Call
    /* JADX INFO: renamed from: clone */
    public OkHttpCall<T> mo76clone() {
        return new OkHttpCall(this.requestFactory, this.instance, this.args, this.callFactory, this.responseConverter);
    }

    @Override // retrofit2.Call
    public void enqueue(final Callback<T> r5) {
        Objects.requireNonNull(r5, "callback == null");
        monitor-enter(this);
    L13:
        th = move-exception;
        throw th;
    L5:
        if (this.executed == true) goto L50;
        this.executed = true;     // Catch: Throwable -> L13
        gy r1 = this.rawCall;     // Catch: Throwable -> L13
        Throwable th = this.creationFailure;     // Catch: Throwable -> L13
        if (r1 != null) goto L15;
        if (th != null) goto L15;
        gy r3 = createRawCall();     // Catch: Throwable -> L11
        this.rawCall = r3;     // Catch: Throwable -> L11
        r1 = r3;
        goto L15
    L11:
        th = th;
        Utils.throwIfFatal(th);     // Catch: Throwable -> L13
        this.creationFailure = th;     // Catch: Throwable -> L13
    L15:
        monitor-exit(this);     // Catch: Throwable -> L13
        if (th == null) goto L20;
        r5.onFailure(this, th);
        return;
    L20:
        if (this.canceled == false) goto L22;
        ((bv3) r1).cancel();
    L22:
        ky r2 = new AnonymousClass1(this, r5);
        bv3 r4 = (bv3) r1;
        r4.getClass();
        if (r4.r.compareAndSet(false, true) == false) goto L47;
        qg3 r6 = qg3.a;
        r4.s = qg3.a.g();
        na4 r7 = r4.n.a;
        yu3 r8 = new yu3(r4, r2);
        r7.getClass();
        monitor-enter(r7);
        ((ArrayDeque) r7.o).add(r8);     // Catch: Throwable -> L44
        String r0 = r4.o.a.d;     // Catch: Throwable -> L44
        Iterator r9 = ((ArrayDeque) r7.p).iterator();     // Catch: Throwable -> L44
    L28:
        if (r9.hasNext() == false) goto L32;
        yu3 r10 = (yu3) r9.next();     // Catch: Throwable -> L44
        if (h12.c(r10.p.o.a.d, r0) == false) goto L28;
    L39:
        if (r10 == null) goto L41;
        r8.o = r10.o;     // Catch: Throwable -> L44
    L41:
        monitor-exit(r7);
        r7.L();
        return;
    L32:
        Iterator r11 = ((ArrayDeque) r7.o).iterator();     // Catch: Throwable -> L44
    L34:
        if (r11.hasNext() == false) goto L38;
        r10 = (yu3) r11.next();     // Catch: Throwable -> L44
        if (h12.c(r10.p.o.a.d, r0) == false) goto L34;
    L38:
        r10 = null;
    L44:
        th = move-exception;
        throw th;
    L47:
        kf2.o("Already Executed");
        return;
    L50:
        throw new IllegalStateException("Already executed.");     // Catch: Throwable -> L13
    }

    @Override // retrofit2.Call
    public Response<T> execute() {
        monitor-enter(this);
    L12:
        th = move-exception;
        throw th;
    L4:
        if (this.executed == true) goto L15;
        this.executed = true;     // Catch: Throwable -> L12
        gy r0 = getRawCall();     // Catch: Throwable -> L12
        monitor-exit(this);     // Catch: Throwable -> L12
        if (this.canceled == false) goto L11;
        ((bv3) r0).cancel();
    L11:
        return parseResponse(((bv3) r0).c());
    L15:
        throw new IllegalStateException("Already executed.");     // Catch: Throwable -> L12
    }

    @Override // retrofit2.Call
    public boolean isCanceled() {
        boolean r1 = true;
        if (this.canceled == false) goto L5;
        return true;
    L5:
        monitor-enter(this);
        gy r0 = this.rawCall;     // Catch: Throwable -> L14
        if (r0 != null) goto L9;
    L11:
        r1 = false;
    L12:
        monitor-exit(this);     // Catch: Throwable -> L14
        return r1;
    L9:
        if (((bv3) r0).A == false) goto L11;
    L14:
        th = move-exception;
        throw th;
    }

    @Override // retrofit2.Call
    public synchronized boolean isExecuted() {
        monitor-enter(this);
        boolean r0 = this.executed;     // Catch: Throwable -> L6
        monitor-exit(this);
        return r0;
    L6:
        th = move-exception;
        throw th;
    }

    public Response<T> parseResponse(k14 r6) {
        n14 r0 = r6.t;
        j14 r7 = r6.f();
        r7.g = new NoContentResponseBody(r0.contentType(), r0.contentLength());
        k14 r8 = r7.a();
        int r1 = r8.q;
        if (r1 >= 200) goto L5;
    L26:
        Response<T> r5 = Response.error(Utils.buffer(r0), r8);     // Catch: Throwable -> L23
        r0.close();
        return r5;
    L23:
        th = move-exception;
        r0.close();
        throw th;
    L5:
        if (r1 >= 300) goto L26;
        if (r1 != 204) goto L10;
    L18:
        r0.close();
        return Response.success(null, r8);
    L10:
        if (r1 == 205) goto L18;
        ExceptionCatchingResponseBody r2 = new ExceptionCatchingResponseBody(r0);
        return Response.success(this.responseConverter.convert(r2), r8);
    L15:
        e = move-exception;
        r2.throwIfCaught();
        throw e;
    }

    @Override // retrofit2.Call
    public synchronized oz3 request() {
        monitor-enter(this);
        oz3 r0 = ((bv3) getRawCall()).o;     // Catch: Throwable -> L6 IOException -> L8
        monitor-exit(this);
        return r0;
    L6:
        th = move-exception;
        throw th;
    L8:
        e = move-exception;
        throw new RuntimeException("Unable to create request.", e);     // Catch: Throwable -> L6
    }

    @Override // retrofit2.Call
    public synchronized fu4 timeout() {
        monitor-enter(this);
        av3 r0 = ((bv3) getRawCall()).q;     // Catch: Throwable -> L6 IOException -> L8
        monitor-exit(this);
        return r0;
    L6:
        th = move-exception;
        throw th;
    L8:
        e = move-exception;
        throw new RuntimeException("Unable to create call.", e);     // Catch: Throwable -> L6
    }

    @Override // retrofit2.Call
    /* JADX INFO: renamed from: clone */
    public /* bridge */ /* synthetic */ Call mo76clone() {
        return mo76clone();
    }

    public /* bridge */ /* synthetic */ Object clone() {
        return mo76clone();
    }
}
