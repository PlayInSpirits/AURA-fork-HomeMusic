.class public final Lre5;
.super Li90;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final o:Lcom/github/luben/zstd/ZstdInputStream;


# direct methods
.method public constructor <init>(Ljava/io/ByteArrayInputStream;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Li90;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/github/luben/zstd/ZstdInputStream;

    .line 5
    .line 6
    new-instance v1, Ldf0;

    .line 7
    .line 8
    invoke-direct {v1, p1}, Ldf0;-><init>(Ljava/io/InputStream;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1}, Lcom/github/luben/zstd/ZstdInputStream;-><init>(Ljava/io/InputStream;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lre5;->o:Lcom/github/luben/zstd/ZstdInputStream;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final available()I
    .locals 0

    .line 1
    iget-object p0, p0, Lre5;->o:Lcom/github/luben/zstd/ZstdInputStream;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/github/luben/zstd/ZstdInputStream;->available()I

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
    iget-object p0, p0, Lre5;->o:Lcom/github/luben/zstd/ZstdInputStream;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/github/luben/zstd/ZstdInputStream;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final declared-synchronized mark(I)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lre5;->o:Lcom/github/luben/zstd/ZstdInputStream;

    .line 3
    .line 4
    invoke-virtual {v0, p1}, Lcom/github/luben/zstd/ZstdInputStream;->mark(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    .line 7
    monitor-exit p0

    .line 8
    return-void

    .line 9
    :catchall_0
    move-exception p1

    .line 10
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 11
    throw p1
.end method

.method public final markSupported()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lre5;->o:Lcom/github/luben/zstd/ZstdInputStream;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/github/luben/zstd/ZstdInputStream;->markSupported()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final read()I
    .locals 3

    .line 1
    iget-object v0, p0, Lre5;->o:Lcom/github/luben/zstd/ZstdInputStream;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/github/luben/zstd/ZstdInputStream;->read()I

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

.method public final read([B)I
    .locals 2

    const/4 v0, 0x0

    .line 18
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Lre5;->read([BII)I

    move-result p0

    return p0
.end method

.method public final read([BII)I
    .locals 1

    if-nez p3, :cond_0

    const/4 p0, 0x0

    return p0

    .line 19
    :cond_0
    iget-object v0, p0, Lre5;->o:Lcom/github/luben/zstd/ZstdInputStream;

    invoke-virtual {v0, p1, p2, p3}, Lcom/github/luben/zstd/ZstdInputStream;->read([BII)I

    move-result p1

    int-to-long p2, p1

    .line 20
    invoke-virtual {p0, p2, p3}, Li90;->b(J)V

    return p1
.end method

.method public final declared-synchronized reset()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lre5;->o:Lcom/github/luben/zstd/ZstdInputStream;

    .line 3
    .line 4
    invoke-virtual {v0}, Lcom/github/luben/zstd/ZstdInputStream;->reset()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    .line 7
    monitor-exit p0

    .line 8
    return-void

    .line 9
    :catchall_0
    move-exception v0

    .line 10
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 11
    throw v0
.end method

.method public final skip(J)J
    .locals 0

    .line 1
    iget-object p0, p0, Lre5;->o:Lcom/github/luben/zstd/ZstdInputStream;

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

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lre5;->o:Lcom/github/luben/zstd/ZstdInputStream;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
