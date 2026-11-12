.class public final Lee5;
.super Li90;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final o:Ljava/io/InputStream;


# direct methods
.method public constructor <init>(Ljava/io/ByteArrayInputStream;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Li90;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ldf0;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Ldf0;-><init>(Ljava/io/InputStream;)V

    .line 7
    .line 8
    .line 9
    new-instance p1, Lorg/tukaani/xz/SingleXZInputStream;

    .line 10
    .line 11
    const/4 v1, -0x1

    .line 12
    invoke-direct {p1, v0, v1}, Lorg/tukaani/xz/SingleXZInputStream;-><init>(Ljava/io/InputStream;I)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lee5;->o:Ljava/io/InputStream;

    .line 16
    .line 17
    return-void
.end method

.method public static f()V
    .locals 1

    .line 1
    sget-object v0, Lorg/tukaani/xz/XZ;->HEADER_MAGIC:[B

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    if-lez v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    sget-object v0, Lorg/tukaani/xz/XZ;->HEADER_MAGIC:[B

    .line 8
    .line 9
    array-length v0, v0

    .line 10
    if-gtz v0, :cond_1

    .line 11
    .line 12
    :goto_0
    return-void

    .line 13
    :cond_1
    const/4 v0, 0x0

    .line 14
    throw v0
.end method


# virtual methods
.method public final available()I
    .locals 0

    .line 1
    iget-object p0, p0, Lee5;->o:Ljava/io/InputStream;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/io/InputStream;->available()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final close()V
    .locals 0

    .line 1
    iget-object p0, p0, Lee5;->o:Ljava/io/InputStream;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final read()I
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lee5;->o:Ljava/io/InputStream;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, -0x1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v1, 0x1

    .line 12
    :goto_0
    int-to-long v1, v1

    .line 13
    invoke-virtual {p0, v1, v2}, Li90;->b(J)V
    :try_end_0
    .catch Lorg/tukaani/xz/MemoryLimitException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    .line 16
    return v0

    .line 17
    :catch_0
    move-exception p0

    .line 18
    new-instance v0, Lorg/apache/commons/compress/MemoryLimitException;

    .line 19
    .line 20
    invoke-virtual {p0}, Lorg/tukaani/xz/MemoryLimitException;->getMemoryNeeded()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    int-to-long v1, v1

    .line 25
    invoke-virtual {p0}, Lorg/tukaani/xz/MemoryLimitException;->getMemoryLimit()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    invoke-direct {v0, v1, v2, v3, p0}, Lorg/apache/commons/compress/MemoryLimitException;-><init>(JILjava/lang/Exception;)V

    .line 30
    .line 31
    .line 32
    throw v0
.end method

.method public final read([BII)I
    .locals 1

    if-nez p3, :cond_0

    const/4 p0, 0x0

    return p0

    .line 33
    :cond_0
    :try_start_0
    iget-object v0, p0, Lee5;->o:Ljava/io/InputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result p1

    int-to-long p2, p1

    .line 34
    invoke-virtual {p0, p2, p3}, Li90;->b(J)V
    :try_end_0
    .catch Lorg/tukaani/xz/MemoryLimitException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p0

    .line 35
    new-instance p1, Lorg/apache/commons/compress/MemoryLimitException;

    invoke-virtual {p0}, Lorg/tukaani/xz/MemoryLimitException;->getMemoryNeeded()I

    move-result p2

    int-to-long p2, p2

    invoke-virtual {p0}, Lorg/tukaani/xz/MemoryLimitException;->getMemoryLimit()I

    move-result v0

    invoke-direct {p1, p2, p3, v0, p0}, Lorg/apache/commons/compress/MemoryLimitException;-><init>(JILjava/lang/Exception;)V

    throw p1
.end method

.method public final skip(J)J
    .locals 2

    .line 1
    :try_start_0
    iget-object p0, p0, Lee5;->o:Ljava/io/InputStream;

    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lvr1;->G(Ljava/io/InputStream;J)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0
    :try_end_0
    .catch Lorg/tukaani/xz/MemoryLimitException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    return-wide p0

    .line 8
    :catch_0
    move-exception p0

    .line 9
    new-instance p1, Lorg/apache/commons/compress/MemoryLimitException;

    .line 10
    .line 11
    invoke-virtual {p0}, Lorg/tukaani/xz/MemoryLimitException;->getMemoryNeeded()I

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    int-to-long v0, p2

    .line 16
    invoke-virtual {p0}, Lorg/tukaani/xz/MemoryLimitException;->getMemoryLimit()I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    invoke-direct {p1, v0, v1, p2, p0}, Lorg/apache/commons/compress/MemoryLimitException;-><init>(JILjava/lang/Exception;)V

    .line 21
    .line 22
    .line 23
    throw p1
.end method
