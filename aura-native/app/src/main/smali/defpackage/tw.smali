.class public final Ldefpackage/tw;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/yh0;
.implements Ldefpackage/fl0;


# instance fields
.field public final n:Ljava/nio/ByteBuffer;


# direct methods
.method public constructor <init>(ILjava/nio/ByteBuffer;)V
    .locals 0

    .line 1
    packed-switch p1, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Ldefpackage/tw;->n:Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p2, p0, Ldefpackage/tw;->n:Ljava/nio/ByteBuffer;

    .line 14
    .line 15
    sget-object p0, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 16
    .line 17
    invoke-virtual {p2, p0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public b()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Ldefpackage/tw;->d()S

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    shl-int/lit8 v0, v0, 0x8

    .line 6
    .line 7
    invoke-virtual {p0}, Ldefpackage/tw;->d()S

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    or-int/2addr p0, v0

    .line 12
    return p0
.end method

.method public c()V
    .locals 0

    .line 1
    return-void
.end method

.method public d()S
    .locals 2

    .line 1
    iget-object p0, p0, Ldefpackage/tw;->n:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/nio/Buffer;->remaining()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-lt v0, v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    and-int/lit16 p0, p0, 0xff

    .line 15
    .line 16
    int-to-short p0, p0

    .line 17
    return p0

    .line 18
    :cond_0
    new-instance p0, Lcom/bumptech/glide/load/resource/bitmap/DefaultImageHeaderParser$Reader$EndOfFileException;

    .line 19
    .line 20
    invoke-direct {p0}, Lcom/bumptech/glide/load/resource/bitmap/DefaultImageHeaderParser$Reader$EndOfFileException;-><init>()V

    .line 21
    .line 22
    .line 23
    throw p0
.end method

.method public e(I[B)I
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/tw;->n:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/nio/Buffer;->remaining()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    const/4 p0, -0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    invoke-virtual {p0, p2, v0, p1}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 17
    .line 18
    .line 19
    return p1
.end method

.method public l()Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object p0, p0, Ldefpackage/tw;->n:Ljava/nio/ByteBuffer;

    .line 3
    .line 4
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 5
    .line 6
    .line 7
    return-object p0
.end method

.method public skip(J)J
    .locals 2

    .line 1
    iget-object p0, p0, Ldefpackage/tw;->n:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/nio/Buffer;->remaining()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    int-to-long v0, v0

    .line 8
    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->min(JJ)J

    .line 9
    .line 10
    .line 11
    move-result-wide p1

    .line 12
    long-to-int p1, p1

    .line 13
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    add-int/2addr p2, p1

    .line 18
    invoke-virtual {p0, p2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 19
    .line 20
    .line 21
    int-to-long p0, p1

    .line 22
    return-wide p0
.end method
