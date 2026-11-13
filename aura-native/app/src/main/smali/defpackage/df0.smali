.class public final Ldefpackage/df0;
.super Ljava/io/FilterInputStream;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public n:J


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final read()I
    .locals 5

    .line 27
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    if-ltz v0, :cond_0

    const-wide/16 v1, 0x1

    .line 28
    iget-wide v3, p0, Ldefpackage/df0;->n:J

    add-long/2addr v3, v1

    iput-wide v3, p0, Ldefpackage/df0;->n:J

    :cond_0
    return v0
.end method

.method public final read([B)I
    .locals 2

    const/4 v0, 0x0

    .line 26
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Ldefpackage/df0;->read([BII)I

    move-result p0

    return p0
.end method

.method public final read([BII)I
    .locals 2

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    :cond_0
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    .line 6
    .line 7
    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-ltz p1, :cond_1

    .line 12
    .line 13
    int-to-long p2, p1

    .line 14
    const-wide/16 v0, -0x1

    .line 15
    .line 16
    cmp-long v0, p2, v0

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    iget-wide v0, p0, Ldefpackage/df0;->n:J

    .line 21
    .line 22
    add-long/2addr v0, p2

    .line 23
    iput-wide v0, p0, Ldefpackage/df0;->n:J

    .line 24
    .line 25
    :cond_1
    return p1
.end method
