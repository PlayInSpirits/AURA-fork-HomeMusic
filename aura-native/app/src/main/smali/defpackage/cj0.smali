.class public Ldefpackage/cj0;
.super Ldefpackage/uv;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public p:Ldefpackage/tb1;

.field public final q:Ldefpackage/fg0;

.field public r:Ljava/nio/ByteBuffer;

.field public s:Z

.field public t:J

.field public u:Ljava/nio/ByteBuffer;

.field public final v:I

.field public final w:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "media3.decoder"

    .line 2
    .line 3
    invoke-static {v0}, Ldefpackage/hn2;->a(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(II)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ldefpackage/uv;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ldefpackage/fg0;

    .line 5
    .line 6
    invoke-direct {v0}, Ldefpackage/fg0;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Ldefpackage/cj0;->q:Ldefpackage/fg0;

    .line 10
    .line 11
    iput p1, p0, Ldefpackage/cj0;->v:I

    .line 12
    .line 13
    iput p2, p0, Ldefpackage/cj0;->w:I

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public r()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Ldefpackage/uv;->o:I

    .line 3
    .line 4
    iget-object v1, p0, Ldefpackage/cj0;->r:Ljava/nio/ByteBuffer;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object v1, p0, Ldefpackage/cj0;->u:Ljava/nio/ByteBuffer;

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 16
    .line 17
    .line 18
    :cond_1
    iput-boolean v0, p0, Ldefpackage/cj0;->s:Z

    .line 19
    .line 20
    return-void
.end method

.method public final s(I)Ljava/nio/ByteBuffer;
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    iget v1, p0, Ldefpackage/cj0;->v:I

    .line 3
    .line 4
    if-ne v1, v0, :cond_0

    .line 5
    .line 6
    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :cond_0
    const/4 v0, 0x2

    .line 12
    if-ne v1, v0, :cond_1

    .line 13
    .line 14
    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :cond_1
    iget-object p0, p0, Ldefpackage/cj0;->r:Ljava/nio/ByteBuffer;

    .line 20
    .line 21
    if-nez p0, :cond_2

    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    goto :goto_0

    .line 25
    :cond_2
    invoke-virtual {p0}, Ljava/nio/Buffer;->capacity()I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    :goto_0
    new-instance v0, Landroidx/media3/decoder/DecoderInputBuffer$InsufficientCapacityException;

    .line 30
    .line 31
    const-string v1, " < "

    .line 32
    .line 33
    const-string v2, ")"

    .line 34
    .line 35
    const-string v3, "Buffer too small ("

    .line 36
    .line 37
    invoke-static {v3, v1, p0, p1, v2}, Ldefpackage/b11;->n(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw v0
.end method

.method public final t(I)V
    .locals 3

    .line 1
    iget v0, p0, Ldefpackage/cj0;->w:I

    .line 2
    .line 3
    add-int/2addr p1, v0

    .line 4
    iget-object v0, p0, Ldefpackage/cj0;->r:Ljava/nio/ByteBuffer;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Ldefpackage/cj0;->s(I)Ljava/nio/ByteBuffer;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Ldefpackage/cj0;->r:Ljava/nio/ByteBuffer;

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    add-int/2addr p1, v2

    .line 24
    if-lt v1, p1, :cond_1

    .line 25
    .line 26
    iput-object v0, p0, Ldefpackage/cj0;->r:Ljava/nio/ByteBuffer;

    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    invoke-virtual {p0, p1}, Ldefpackage/cj0;->s(I)Ljava/nio/ByteBuffer;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 38
    .line 39
    .line 40
    if-lez v2, :cond_2

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 46
    .line 47
    .line 48
    :cond_2
    iput-object p1, p0, Ldefpackage/cj0;->r:Ljava/nio/ByteBuffer;

    .line 49
    .line 50
    return-void
.end method

.method public final u()V
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/cj0;->r:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object p0, p0, Ldefpackage/cj0;->u:Ljava/nio/ByteBuffer;

    .line 9
    .line 10
    if-eqz p0, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 13
    .line 14
    .line 15
    :cond_1
    return-void
.end method
