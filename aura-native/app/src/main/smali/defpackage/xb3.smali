.class public final Ldefpackage/xb3;
.super Ldefpackage/i90;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final q:[B

.field public static final r:I


# instance fields
.field public final o:Ljava/io/ByteArrayInputStream;

.field public final p:Ldefpackage/kx1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    new-array v0, v0, [B

    .line 3
    .line 4
    fill-array-data v0, :array_0

    .line 5
    .line 6
    .line 7
    sput-object v0, Ldefpackage/xb3;->q:[B

    .line 8
    .line 9
    array-length v0, v0

    .line 10
    sput v0, Ldefpackage/xb3;->r:I

    .line 11
    .line 12
    return-void

    .line 13
    :array_0
    .array-data 1
        -0x36t
        -0x2t
        -0x30t
        0xdt
    .end array-data
.end method

.method public constructor <init>(Ljava/io/ByteArrayInputStream;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ldefpackage/i90;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/xb3;->o:Ljava/io/ByteArrayInputStream;

    .line 5
    .line 6
    new-instance v0, Ldefpackage/kx1;

    .line 7
    .line 8
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, v1}, Ldefpackage/kx1;-><init>(Ljava/io/ByteArrayOutputStream;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Ldefpackage/xb3;->p:Ldefpackage/kx1;

    .line 17
    .line 18
    new-instance p0, Ljava/util/jar/JarOutputStream;

    .line 19
    .line 20
    invoke-direct {p0, v0}, Ljava/util/jar/JarOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 21
    .line 22
    .line 23
    :try_start_0
    invoke-static {}, Ljava/util/jar/Pack200;->newUnpacker()Ljava/util/jar/Pack200$Unpacker;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    new-instance v1, Ldefpackage/f40;

    .line 28
    .line 29
    invoke-direct {v1, p1}, Ldefpackage/f40;-><init>(Ljava/io/ByteArrayInputStream;)V

    .line 30
    .line 31
    .line 32
    invoke-interface {v0, v1, p0}, Ljava/util/jar/Pack200$Unpacker;->unpack(Ljava/io/InputStream;Ljava/util/jar/JarOutputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Ljava/io/OutputStream;->close()V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :catchall_0
    move-exception p1

    .line 40
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 41
    :catchall_1
    move-exception v0

    .line 42
    :try_start_2
    invoke-virtual {p0}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catchall_2
    move-exception p0

    .line 47
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 48
    .line 49
    .line 50
    :goto_0
    throw v0
.end method


# virtual methods
.method public final available()I
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/xb3;->p:Ldefpackage/kx1;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldefpackage/kx1;->b()Ljava/io/InputStream;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/io/InputStream;->available()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final close()V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Ldefpackage/xb3;->p:Ldefpackage/kx1;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    .line 4
    .line 5
    .line 6
    iget-object v1, v0, Ldefpackage/kx1;->o:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 9
    :try_start_1
    iget-object v2, v0, Ldefpackage/kx1;->n:Ljava/io/InputStream;

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 14
    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    iput-object v2, v0, Ldefpackage/kx1;->n:Ljava/io/InputStream;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception v0

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    :goto_0
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    iget-object p0, p0, Ldefpackage/xb3;->o:Ljava/io/ByteArrayInputStream;

    .line 24
    .line 25
    if-eqz p0, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 28
    .line 29
    .line 30
    :cond_1
    return-void

    .line 31
    :goto_1
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 32
    :try_start_3
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 33
    :catchall_1
    move-exception v0

    .line 34
    iget-object p0, p0, Ldefpackage/xb3;->o:Ljava/io/ByteArrayInputStream;

    .line 35
    .line 36
    if-eqz p0, :cond_2

    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 39
    .line 40
    .line 41
    :cond_2
    throw v0
.end method

.method public final declared-synchronized mark(I)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Ldefpackage/xb3;->p:Ldefpackage/kx1;

    .line 3
    .line 4
    invoke-virtual {v0}, Ldefpackage/kx1;->b()Ljava/io/InputStream;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0, p1}, Ljava/io/InputStream;->mark(I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    .line 11
    monitor-exit p0

    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception p1

    .line 14
    goto :goto_0

    .line 15
    :catch_0
    move-exception p1

    .line 16
    :try_start_1
    new-instance v0, Ljava/lang/RuntimeException;

    .line 17
    .line 18
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    throw v0

    .line 22
    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    throw p1
.end method

.method public final markSupported()Z
    .locals 0

    .line 1
    :try_start_0
    iget-object p0, p0, Ldefpackage/xb3;->p:Ldefpackage/kx1;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldefpackage/kx1;->b()Ljava/io/InputStream;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/io/InputStream;->markSupported()Z

    .line 8
    .line 9
    .line 10
    move-result p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    return p0

    .line 12
    :catch_0
    const/4 p0, 0x0

    .line 13
    return p0
.end method

.method public final read()I
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/xb3;->p:Ldefpackage/kx1;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldefpackage/kx1;->b()Ljava/io/InputStream;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final read([B)I
    .locals 0

    .line 12
    iget-object p0, p0, Ldefpackage/xb3;->p:Ldefpackage/kx1;

    invoke-virtual {p0}, Ldefpackage/kx1;->b()Ljava/io/InputStream;

    move-result-object p0

    invoke-virtual {p0, p1}, Ljava/io/InputStream;->read([B)I

    move-result p0

    return p0
.end method

.method public final read([BII)I
    .locals 0

    .line 13
    iget-object p0, p0, Ldefpackage/xb3;->p:Ldefpackage/kx1;

    invoke-virtual {p0}, Ldefpackage/kx1;->b()Ljava/io/InputStream;

    move-result-object p0

    invoke-virtual {p0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result p0

    return p0
.end method

.method public final declared-synchronized reset()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Ldefpackage/xb3;->p:Ldefpackage/kx1;

    .line 3
    .line 4
    invoke-virtual {v0}, Ldefpackage/kx1;->b()Ljava/io/InputStream;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Ljava/io/InputStream;->reset()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    .line 11
    monitor-exit p0

    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 15
    throw v0
.end method

.method public final skip(J)J
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/xb3;->p:Ldefpackage/kx1;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldefpackage/kx1;->b()Ljava/io/InputStream;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0, p1, p2}, Ldefpackage/vr1;->G(Ljava/io/InputStream;J)J

    .line 8
    .line 9
    .line 10
    move-result-wide p0

    .line 11
    return-wide p0
.end method
