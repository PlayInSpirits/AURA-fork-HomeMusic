.class public final Ll42;
.super Li90;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final synthetic p:I


# instance fields
.field public final o:Ljava/io/InputStream;


# direct methods
.method public constructor <init>(Ljava/io/ByteArrayInputStream;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Li90;-><init>()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    new-instance v0, Lorg/tukaani/xz/LZMAInputStream;

    .line 5
    .line 6
    new-instance v1, Ldf0;

    .line 7
    .line 8
    invoke-direct {v1, p1}, Ldf0;-><init>(Ljava/io/InputStream;)V

    .line 9
    .line 10
    .line 11
    const/4 p1, -0x1

    .line 12
    invoke-direct {v0, v1, p1}, Lorg/tukaani/xz/LZMAInputStream;-><init>(Ljava/io/InputStream;I)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Ll42;->o:Ljava/io/InputStream;
    :try_end_0
    .catch Lorg/tukaani/xz/MemoryLimitException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    return-void

    .line 18
    :catch_0
    move-exception p0

    .line 19
    new-instance p1, Lorg/apache/commons/compress/MemoryLimitException;

    .line 20
    .line 21
    invoke-virtual {p0}, Lorg/tukaani/xz/MemoryLimitException;->getMemoryNeeded()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    int-to-long v0, v0

    .line 26
    invoke-virtual {p0}, Lorg/tukaani/xz/MemoryLimitException;->getMemoryLimit()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    invoke-direct {p1, v0, v1, v2, p0}, Lorg/apache/commons/compress/MemoryLimitException;-><init>(JILjava/lang/Exception;)V

    .line 31
    .line 32
    .line 33
    throw p1
.end method


# virtual methods
.method public final available()I
    .locals 0

    .line 1
    iget-object p0, p0, Ll42;->o:Ljava/io/InputStream;

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
    iget-object p0, p0, Ll42;->o:Ljava/io/InputStream;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final read()I
    .locals 3

    .line 1
    iget-object v0, p0, Ll42;->o:Ljava/io/InputStream;

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
    const/4 v1, 0x0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v1, 0x1

    .line 13
    :goto_0
    int-to-long v1, v1

    .line 14
    invoke-virtual {p0, v1, v2}, Li90;->b(J)V

    .line 15
    .line 16
    .line 17
    return v0
.end method

.method public final read([BII)I
    .locals 1

    .line 18
    iget-object v0, p0, Ll42;->o:Ljava/io/InputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result p1

    int-to-long p2, p1

    .line 19
    invoke-virtual {p0, p2, p3}, Li90;->b(J)V

    return p1
.end method

.method public final skip(J)J
    .locals 0

    .line 1
    iget-object p0, p0, Ll42;->o:Ljava/io/InputStream;

    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lvr1;->G(Ljava/io/InputStream;J)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    return-wide p0
.end method
