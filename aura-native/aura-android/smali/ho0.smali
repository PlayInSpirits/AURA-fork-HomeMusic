.class public final Lho0;
.super Lve4;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lrn4;


# instance fields
.field public final o:Lzn4;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lzn4;)V
    .locals 4

    .line 1
    const/4 p1, 0x2

    .line 2
    new-array v0, p1, [Lvn4;

    .line 3
    .line 4
    new-array p1, p1, [Lwn4;

    .line 5
    .line 6
    invoke-direct {p0, v0, p1}, Lve4;-><init>([Lcj0;[Ldj0;)V

    .line 7
    .line 8
    .line 9
    iget p1, p0, Lve4;->g:I

    .line 10
    .line 11
    iget-object v0, p0, Lve4;->e:[Lcj0;

    .line 12
    .line 13
    array-length v1, v0

    .line 14
    const/4 v2, 0x0

    .line 15
    if-ne p1, v1, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move p1, v2

    .line 20
    :goto_0
    invoke-static {p1}, Lrr2;->w(Z)V

    .line 21
    .line 22
    .line 23
    array-length p1, v0

    .line 24
    :goto_1
    if-ge v2, p1, :cond_1

    .line 25
    .line 26
    aget-object v1, v0, v2

    .line 27
    .line 28
    const/16 v3, 0x400

    .line 29
    .line 30
    invoke-virtual {v1, v3}, Lcj0;->t(I)V

    .line 31
    .line 32
    .line 33
    add-int/lit8 v2, v2, 0x1

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    iput-object p2, p0, Lho0;->o:Lzn4;

    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public final c(J)V
    .locals 0

    .line 1
    return-void
.end method

.method public final g()Lcj0;
    .locals 0

    .line 1
    new-instance p0, Lvn4;

    .line 2
    .line 3
    invoke-direct {p0}, Lvn4;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final h()Ldj0;
    .locals 1

    .line 1
    new-instance v0, Lxe4;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lxe4;-><init>(Lho0;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final i(Ljava/lang/Throwable;)Landroidx/media3/decoder/DecoderException;
    .locals 1

    .line 1
    new-instance p0, Landroidx/media3/extractor/text/SubtitleDecoderException;

    .line 2
    .line 3
    const-string v0, "Unexpected decode error"

    .line 4
    .line 5
    invoke-direct {p0, v0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    return-object p0
.end method

.method public final j(Lcj0;Ldj0;Z)Landroidx/media3/decoder/DecoderException;
    .locals 4

    .line 1
    check-cast p1, Lvn4;

    .line 2
    .line 3
    check-cast p2, Lwn4;

    .line 4
    .line 5
    :try_start_0
    iget-object v0, p1, Lcj0;->r:Ljava/nio/ByteBuffer;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object p0, p0, Lho0;->o:Lzn4;

    .line 19
    .line 20
    if-eqz p3, :cond_0

    .line 21
    .line 22
    invoke-interface {p0}, Lzn4;->reset()V

    .line 23
    .line 24
    .line 25
    :cond_0
    const/4 p3, 0x0

    .line 26
    invoke-interface {p0, v1, p3, v0}, Lzn4;->b([BII)Lqn4;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    iget-wide v0, p1, Lcj0;->t:J

    .line 31
    .line 32
    iget-wide v2, p1, Lvn4;->x:J

    .line 33
    .line 34
    iput-wide v0, p2, Ldj0;->p:J

    .line 35
    .line 36
    iput-object p0, p2, Lwn4;->s:Lqn4;

    .line 37
    .line 38
    const-wide p0, 0x7fffffffffffffffL

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    cmp-long p0, v2, p0

    .line 44
    .line 45
    if-nez p0, :cond_1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    move-wide v0, v2

    .line 49
    :goto_0
    iput-wide v0, p2, Lwn4;->t:J

    .line 50
    .line 51
    iput-boolean p3, p2, Ldj0;->r:Z
    :try_end_0
    .catch Landroidx/media3/extractor/text/SubtitleDecoderException; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    .line 53
    const/4 p0, 0x0

    .line 54
    return-object p0

    .line 55
    :catch_0
    move-exception p0

    .line 56
    return-object p0
.end method
